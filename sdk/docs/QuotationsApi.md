# QuotationsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuotation**](QuotationsApi.md#createQuotation) | **POST** api/1/quotations | 見積書の作成
[**destroyQuotation**](QuotationsApi.md#destroyQuotation) | **DELETE** api/1/quotations/{id} | 見積書の削除
[**getQuotation**](QuotationsApi.md#getQuotation) | **GET** api/1/quotations/{id} | 見積書の取得
[**getQuotations**](QuotationsApi.md#getQuotations) | **GET** api/1/quotations | 見積書一覧の取得
[**updateQuotation**](QuotationsApi.md#updateQuotation) | **PUT** api/1/quotations/{id} | 見積書の更新



## createQuotation

> QuotationResponse createQuotation(quotationCreateParams)

見積書の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.QuotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        QuotationsApi apiInstance = new QuotationsApi(defaultClient);
        QuotationCreateParams quotationCreateParams = new QuotationCreateParams(); // QuotationCreateParams | 見積書の作成
        try {
            QuotationResponse result = apiInstance.createQuotation(quotationCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotationsApi#createQuotation");
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
 **quotationCreateParams** | [**QuotationCreateParams**](QuotationCreateParams.md)| 見積書の作成 | [optional]

### Return type

[**QuotationResponse**](QuotationResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |


## destroyQuotation

> destroyQuotation(id, companyId)

見積書の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.QuotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        QuotationsApi apiInstance = new QuotationsApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyQuotation(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotationsApi#destroyQuotation");
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
 **id** | **Integer**|  |
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


## getQuotation

> QuotationResponse getQuotation(id, companyId)

見積書の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.QuotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        QuotationsApi apiInstance = new QuotationsApi(defaultClient);
        Integer id = 56; // Integer | 見積書ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            QuotationResponse result = apiInstance.getQuotation(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotationsApi#getQuotation");
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
 **id** | **Integer**| 見積書ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**QuotationResponse**](QuotationResponse.md)

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


## getQuotations

> QuotationIndexResponse getQuotations(companyId, partnerId, partnerCode, startIssueDate, endIssueDate, quotationNumber, description, quotationStatus, offset, limit)

見積書一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.QuotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        QuotationsApi apiInstance = new QuotationsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer partnerId = 56; // Integer | 取引先IDで絞込
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込
        String startIssueDate = "startIssueDate_example"; // String | 見積日の開始日(yyyy-mm-dd)
        String endIssueDate = "endIssueDate_example"; // String | 見積日の終了日(yyyy-mm-dd)
        String quotationNumber = "quotationNumber_example"; // String | 見積書番号
        String description = "description_example"; // String | 概要
        String quotationStatus = "all"; // String | 見積書ステータス  (unsubmitted: 送付待ち, submitted: 送付済み, all: 全て)
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最大: 100) 
        try {
            QuotationIndexResponse result = apiInstance.getQuotations(companyId, partnerId, partnerCode, startIssueDate, endIssueDate, quotationNumber, description, quotationStatus, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotationsApi#getQuotations");
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
 **partnerId** | **Integer**| 取引先IDで絞込 | [optional]
 **partnerCode** | **String**| 取引先コードで絞込 | [optional]
 **startIssueDate** | **String**| 見積日の開始日(yyyy-mm-dd) | [optional]
 **endIssueDate** | **String**| 見積日の終了日(yyyy-mm-dd) | [optional]
 **quotationNumber** | **String**| 見積書番号 | [optional]
 **description** | **String**| 概要 | [optional]
 **quotationStatus** | **String**| 見積書ステータス  (unsubmitted: 送付待ち, submitted: 送付済み, all: 全て) | [optional] [enum: all, unsubmitted, submitted]
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最大: 100)  | [optional]

### Return type

[**QuotationIndexResponse**](QuotationIndexResponse.md)

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


## updateQuotation

> QuotationResponse updateQuotation(id, quotationUpdateParams)

見積書の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.QuotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        QuotationsApi apiInstance = new QuotationsApi(defaultClient);
        Integer id = 56; // Integer | 見積書ID
        QuotationUpdateParams quotationUpdateParams = new QuotationUpdateParams(); // QuotationUpdateParams | 見積書の更新
        try {
            QuotationResponse result = apiInstance.updateQuotation(id, quotationUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotationsApi#updateQuotation");
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
 **id** | **Integer**| 見積書ID |
 **quotationUpdateParams** | [**QuotationUpdateParams**](QuotationUpdateParams.md)| 見積書の更新 | [optional]

### Return type

[**QuotationResponse**](QuotationResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |

