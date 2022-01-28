# InvoicesApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInvoice**](InvoicesApi.md#createInvoice) | **POST** api/1/invoices | 請求書の作成
[**destroyInvoice**](InvoicesApi.md#destroyInvoice) | **DELETE** api/1/invoices/{id} | 請求書の削除
[**getInvoice**](InvoicesApi.md#getInvoice) | **GET** api/1/invoices/{id} | 請求書の取得
[**getInvoices**](InvoicesApi.md#getInvoices) | **GET** api/1/invoices | 請求書一覧の取得
[**updateInvoice**](InvoicesApi.md#updateInvoice) | **PUT** api/1/invoices/{id} | 請求書の更新



## createInvoice

> InvoiceResponse createInvoice(invoiceCreateParams)

請求書の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        InvoiceCreateParams invoiceCreateParams = new InvoiceCreateParams(); // InvoiceCreateParams | 請求書の作成
        try {
            InvoiceResponse result = apiInstance.createInvoice(invoiceCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#createInvoice");
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
 **invoiceCreateParams** | [**InvoiceCreateParams**](InvoiceCreateParams.md)| 請求書の作成 | [optional]

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

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


## destroyInvoice

> destroyInvoice(id, companyId)

請求書の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyInvoice(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#destroyInvoice");
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


## getInvoice

> InvoiceResponse getInvoice(id, companyId)

請求書の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Integer id = 56; // Integer | 請求書ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            InvoiceResponse result = apiInstance.getInvoice(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#getInvoice");
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
 **id** | **Integer**| 請求書ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

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


## getInvoices

> InvoiceIndexResponse getInvoices(companyId, partnerId, partnerCode, startIssueDate, endIssueDate, startDueDate, endDueDate, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit)

請求書一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer partnerId = 56; // Integer | 取引先IDで絞込
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込
        String startIssueDate = "startIssueDate_example"; // String | 請求日の開始日(yyyy-mm-dd)
        String endIssueDate = "endIssueDate_example"; // String | 請求日の終了日(yyyy-mm-dd)
        String startDueDate = "startDueDate_example"; // String | 期日の開始日(yyyy-mm-dd)
        String endDueDate = "endDueDate_example"; // String | 期日の終了日(yyyy-mm-dd)
        String invoiceNumber = "invoiceNumber_example"; // String | 請求書番号
        String description = "description_example"; // String | 概要
        String invoiceStatus = "draft"; // String | 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, unsubmitted: 送付待ち, submitted: 送付済み)
        String paymentStatus = "unsettled"; // String | 入金ステータス  (unsettled: 入金待ち, settled: 入金済み)
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最大: 100) 
        try {
            InvoiceIndexResponse result = apiInstance.getInvoices(companyId, partnerId, partnerCode, startIssueDate, endIssueDate, startDueDate, endDueDate, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#getInvoices");
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
 **startIssueDate** | **String**| 請求日の開始日(yyyy-mm-dd) | [optional]
 **endIssueDate** | **String**| 請求日の終了日(yyyy-mm-dd) | [optional]
 **startDueDate** | **String**| 期日の開始日(yyyy-mm-dd) | [optional]
 **endDueDate** | **String**| 期日の終了日(yyyy-mm-dd) | [optional]
 **invoiceNumber** | **String**| 請求書番号 | [optional]
 **description** | **String**| 概要 | [optional]
 **invoiceStatus** | **String**| 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, unsubmitted: 送付待ち, submitted: 送付済み) | [optional] [enum: draft, applying, remanded, rejected, approved, unsubmitted, submitted]
 **paymentStatus** | **String**| 入金ステータス  (unsettled: 入金待ち, settled: 入金済み) | [optional] [enum: unsettled, settled]
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最大: 100)  | [optional]

### Return type

[**InvoiceIndexResponse**](InvoiceIndexResponse.md)

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


## updateInvoice

> InvoiceResponse updateInvoice(id, invoiceUpdateParams)

請求書の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.InvoicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        InvoicesApi apiInstance = new InvoicesApi(defaultClient);
        Integer id = 56; // Integer | 請求書ID
        InvoiceUpdateParams invoiceUpdateParams = new InvoiceUpdateParams(); // InvoiceUpdateParams | 請求書の更新
        try {
            InvoiceResponse result = apiInstance.updateInvoice(id, invoiceUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesApi#updateInvoice");
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
 **id** | **Integer**| 請求書ID |
 **invoiceUpdateParams** | [**InvoiceUpdateParams**](InvoiceUpdateParams.md)| 請求書の更新 | [optional]

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

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

