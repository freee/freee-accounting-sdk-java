/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package jp.co.freee.accounting;

import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Manifest;

import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.credentials.TokenCredentials;
import com.microsoft.rest.serializer.JacksonAdapter;

import jp.co.freee.accounting.AccountingClient;
import jp.co.freee.accounting.implementation.AccountingClientImpl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;

/**
 * AccountingClientFactory
 */
public class AccountingClientFactory {

    private static String _sdkVersion = AccountingClientFactory.class.getPackage().getImplementationVersion();
    
    /**
     * Create new AccountingClient instance.
     * 
     * @param token
     *                  access token.
     * @return AccountingClient instance.
     */
    public static AccountingClient create(String token) {
        TokenCredentials credentials = new TokenCredentials(null, token);
        RestClient restClient = new RestClient.Builder(
                new OkHttpClient().newBuilder()
                        .addInterceptor(new Interceptor() {
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = chain
                                        .request()
                                        .newBuilder()
                                        .addHeader("X-Freee-Client-Java", _sdkVersion)
                                        .build();
                                return chain.proceed(request);
                            }
                        }),
                new Retrofit.Builder())
                        .withBaseUrl(AccountingClient.DEFAULT_BASE_URL)
                        .withResponseBuilderFactory(new ServiceResponseBuilder.Factory())
                        .withSerializerAdapter(new JacksonAdapter())
                        .withCredentials(credentials)
                        .build();
        return new AccountingClientImpl(restClient);
    }
}