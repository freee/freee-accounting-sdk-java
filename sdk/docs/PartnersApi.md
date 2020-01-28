# PartnersApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPartner**](PartnersApi.md#createPartner) | **POST** api/1/partners | 取引先の作成
[**destroyPartner**](PartnersApi.md#destroyPartner) | **DELETE** api/1/partners/{id} | 取引先の削除
[**getPartner**](PartnersApi.md#getPartner) | **GET** api/1/partners/{id} | 取引先の取得
[**getPartners**](PartnersApi.md#getPartners) | **GET** api/1/partners | 取引先一覧の取得
[**updatePartner**](PartnersApi.md#updatePartner) | **PUT** api/1/partners/{id} | 取引先の更新
[**updatePartnerByCode**](PartnersApi.md#updatePartnerByCode) | **PUT** api/1/partners/code/{code} | 取引先の更新



## createPartner

> PartnersResponse createPartner(parameters)

取引先の作成

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先を作成する&lt;/p&gt; &lt;ul&gt; &lt;li&gt;codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/li&gt; &lt;li&gt;取引先コードの利用を有効にしている場合は、codeの指定は必須です。&lt;/li&gt;&lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        PartnerCreateParams parameters = new PartnerCreateParams(); // PartnerCreateParams | 取引先の作成
        try {
            PartnersResponse result = apiInstance.createPartner(parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#createPartner");
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
 **parameters** | [**PartnerCreateParams**](PartnerCreateParams.md)| 取引先の作成 |

### Return type

[**PartnersResponse**](PartnersResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |


## destroyPartner

> destroyPartner(id, companyId)

取引先の削除

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先を削除する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        Integer id = 56; // Integer | 取引先ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyPartner(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#destroyPartner");
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
 **id** | **Integer**| 取引先ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |


## getPartner

> PartnersResponse getPartner(id, companyId)

取引先の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先を取得する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        Integer id = 56; // Integer | 取引先ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            PartnersResponse result = apiInstance.getPartner(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#getPartner");
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
 **id** | **Integer**| 取引先ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**PartnersResponse**](PartnersResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |


## getPartners

> PartnersIndexResponse getPartners(companyId, offset, limit, keyword)

取引先一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先一覧を取得する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer offset = 56; // Integer | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最大: 3000)
        String keyword = "keyword_example"; // String | 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致
        try {
            PartnersIndexResponse result = apiInstance.getPartners(companyId, offset, limit, keyword);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#getPartners");
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
 **offset** | **Integer**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最大: 3000) | [optional]
 **keyword** | **String**| 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致 | [optional]

### Return type

[**PartnersIndexResponse**](PartnersIndexResponse.md)

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
| **500** |  |  -  |


## updatePartner

> PartnersResponse updatePartner(id, parameters)

取引先の更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した取引先の情報を更新する&lt;/p&gt; &lt;ul&gt; &lt;li&gt;codeを指定、更新することはできません。&lt;/li&gt;&lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        Integer id = 56; // Integer | 取引先ID
        PartnerUpdateParams parameters = new PartnerUpdateParams(); // PartnerUpdateParams | 取引先の更新
        try {
            PartnersResponse result = apiInstance.updatePartner(id, parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#updatePartner");
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
 **id** | **Integer**| 取引先ID |
 **parameters** | [**PartnerUpdateParams**](PartnerUpdateParams.md)| 取引先の更新 |

### Return type

[**PartnersResponse**](PartnersResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |


## updatePartnerByCode

> PartnersResponse updatePartnerByCode(code, parameters)

取引先の更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;取引先コードをキーに、指定した取引先の情報を更新する&lt;/p&gt; &lt;ul&gt; &lt;li&gt;このAPIを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/li&gt; &lt;li&gt;コードを日本語に設定している場合は、URLエンコードしてURLに含めるようにしてください。&lt;/li&gt;&lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PartnersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        String code = "code_example"; // String | 取引先コード
        PartnerCodeParams parameters = new PartnerCodeParams(); // PartnerCodeParams | 取引先の更新
        try {
            PartnersResponse result = apiInstance.updatePartnerByCode(code, parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#updatePartnerByCode");
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
 **code** | **String**| 取引先コード |
 **parameters** | [**PartnerCodeParams**](PartnerCodeParams.md)| 取引先の更新 |

### Return type

[**PartnersResponse**](PartnersResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

