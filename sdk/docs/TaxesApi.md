# TaxesApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTaxCode**](TaxesApi.md#getTaxCode) | **GET** api/1/taxes/codes/{code} | 税区分コードの取得
[**getTaxCodes**](TaxesApi.md#getTaxCodes) | **GET** api/1/taxes/codes | 税区分コード一覧の取得
[**getTaxesCompanies**](TaxesApi.md#getTaxesCompanies) | **GET** api/1/taxes/companies/{company_id} | 税区分コード詳細一覧の取得



## getTaxCode

> TaxResponse getTaxCode(code)

税区分コードの取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        Integer code = 56; // Integer | 税区分コード
        try {
            TaxResponse result = apiInstance.getTaxCode(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#getTaxCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **Integer**| 税区分コード |

### Return type

[**TaxResponse**](TaxResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |


## getTaxCodes

> InlineResponse2009 getTaxCodes()

税区分コード一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        try {
            InlineResponse2009 result = apiInstance.getTaxCodes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#getTaxCodes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |


## getTaxesCompanies

> InlineResponse20010 getTaxesCompanies(companyId, displayCategory, available)

税区分コード詳細一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String displayCategory = "tax_5"; // String | この項目はインボイス制度で利用する項目です。2023年7月頃から利用できる予定です。税区分の表示カテゴリ（ tax_5: 5%表示の税区分、 tax_8: 8%表示の税区分、 tax_r8: 軽減税率8%表示の税区分、 tax_10: 10%表示の税区分、 tax_5_e80: インボイス経過措置5%表示80%控除の税区分、 tax_5_e50: インボイス経過措置5%表示50%控除の税区分、 tax_8_e80: インボイス経過措置8%表示80%控除の税区分、 tax_8_e50: インボイス経過措置8%表示50%控除の税区分、 tax_r8_e80: インボイス経過措置軽減税率8%表示80%控除の税区分、 tax_r8_e50: インボイス経過措置軽減税率8%表示50%控除の税区分、 tax_10_e80: インボイス経過措置10%表示80%控除の税区分、 tax_10_e50: インボイス経過措置10%表示50%控除の税区分）
        Boolean available = true; // Boolean | この項目はインボイス制度で利用する項目です。2023年7月頃から利用できる予定です。税区分の使用設定。true: 使用する、false: 使用しない
        try {
            InlineResponse20010 result = apiInstance.getTaxesCompanies(companyId, displayCategory, available);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#getTaxesCompanies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**| 事業所ID |
 **displayCategory** | **String**| この項目はインボイス制度で利用する項目です。2023年7月頃から利用できる予定です。税区分の表示カテゴリ（ tax_5: 5%表示の税区分、 tax_8: 8%表示の税区分、 tax_r8: 軽減税率8%表示の税区分、 tax_10: 10%表示の税区分、 tax_5_e80: インボイス経過措置5%表示80%控除の税区分、 tax_5_e50: インボイス経過措置5%表示50%控除の税区分、 tax_8_e80: インボイス経過措置8%表示80%控除の税区分、 tax_8_e50: インボイス経過措置8%表示50%控除の税区分、 tax_r8_e80: インボイス経過措置軽減税率8%表示80%控除の税区分、 tax_r8_e50: インボイス経過措置軽減税率8%表示50%控除の税区分、 tax_10_e80: インボイス経過措置10%表示80%控除の税区分、 tax_10_e50: インボイス経過措置10%表示50%控除の税区分） | [optional] [enum: tax_5, tax_8, tax_r8, tax_10, tax_5_e80, tax_5_e50, tax_8_e80, tax_8_e50, tax_r8_e80, tax_r8_e50, tax_10_e80, tax_10_e50]
 **available** | **Boolean**| この項目はインボイス制度で利用する項目です。2023年7月頃から利用できる予定です。税区分の使用設定。true: 使用する、false: 使用しない | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |

