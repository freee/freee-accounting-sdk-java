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

> PartnerResponse createPartner(partnerCreateParams)

取引先の作成

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
        PartnerCreateParams partnerCreateParams = new PartnerCreateParams(); // PartnerCreateParams | 取引先の作成
        try {
            PartnerResponse result = apiInstance.createPartner(partnerCreateParams);
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
 **partnerCreateParams** | [**PartnerCreateParams**](PartnerCreateParams.md)| 取引先の作成 |

### Return type

[**PartnerResponse**](PartnerResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |


## destroyPartner

> destroyPartner(id, companyId)

取引先の削除

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
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |


## getPartner

> PartnerResponse getPartner(id, companyId)

取引先の取得

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
            PartnerResponse result = apiInstance.getPartner(id, companyId);
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

[**PartnerResponse**](PartnerResponse.md)

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


## getPartners

> PartnersResponse getPartners(companyId, startUpdateDate, endUpdateDate, offset, limit, keyword)

取引先一覧の取得

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
        String startUpdateDate = "startUpdateDate_example"; // String | 更新日で絞り込み：開始日(yyyy-mm-dd)
        String endUpdateDate = "endUpdateDate_example"; // String | 更新日で絞り込み：終了日(yyyy-mm-dd)
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000)
        String keyword = "keyword_example"; // String | 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致
        try {
            PartnersResponse result = apiInstance.getPartners(companyId, startUpdateDate, endUpdateDate, offset, limit, keyword);
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
 **startUpdateDate** | **String**| 更新日で絞り込み：開始日(yyyy-mm-dd) | [optional]
 **endUpdateDate** | **String**| 更新日で絞り込み：終了日(yyyy-mm-dd) | [optional]
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) | [optional]
 **keyword** | **String**| 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致 | [optional]

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
| **403** |  |  -  |
| **500** |  |  -  |


## updatePartner

> PartnerResponse updatePartner(id, partnerUpdateParams)

取引先の更新

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
        PartnerUpdateParams partnerUpdateParams = new PartnerUpdateParams(); // PartnerUpdateParams | 取引先の更新
        try {
            PartnerResponse result = apiInstance.updatePartner(id, partnerUpdateParams);
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
 **partnerUpdateParams** | [**PartnerUpdateParams**](PartnerUpdateParams.md)| 取引先の更新 |

### Return type

[**PartnerResponse**](PartnerResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |


## updatePartnerByCode

> PartnerResponse updatePartnerByCode(code, partnerUpdateParams)

取引先の更新

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
        PartnerUpdateParams partnerUpdateParams = new PartnerUpdateParams(); // PartnerUpdateParams | 取引先の更新
        try {
            PartnerResponse result = apiInstance.updatePartnerByCode(code, partnerUpdateParams);
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
 **partnerUpdateParams** | [**PartnerUpdateParams**](PartnerUpdateParams.md)| 取引先の更新 |

### Return type

[**PartnerResponse**](PartnerResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |

