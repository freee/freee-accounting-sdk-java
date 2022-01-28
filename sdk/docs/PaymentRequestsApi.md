# PaymentRequestsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentRequest**](PaymentRequestsApi.md#createPaymentRequest) | **POST** api/1/payment_requests | 支払依頼の作成
[**destroyPaymentRequest**](PaymentRequestsApi.md#destroyPaymentRequest) | **DELETE** api/1/payment_requests/{id} | 支払依頼の削除
[**getPaymentRequest**](PaymentRequestsApi.md#getPaymentRequest) | **GET** api/1/payment_requests/{id} | 支払依頼詳細の取得
[**getPaymentRequests**](PaymentRequestsApi.md#getPaymentRequests) | **GET** api/1/payment_requests | 支払依頼一覧の取得
[**updatePaymentRequest**](PaymentRequestsApi.md#updatePaymentRequest) | **PUT** api/1/payment_requests/{id} | 支払依頼の更新
[**updatePaymentRequestAction**](PaymentRequestsApi.md#updatePaymentRequestAction) | **POST** api/1/payment_requests/{id}/actions | 支払依頼の承認操作



## createPaymentRequest

> PaymentRequestResponse createPaymentRequest(paymentRequestCreateParams)

支払依頼の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PaymentRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PaymentRequestsApi apiInstance = new PaymentRequestsApi(defaultClient);
        PaymentRequestCreateParams paymentRequestCreateParams = new PaymentRequestCreateParams(); // PaymentRequestCreateParams | 支払依頼の作成
        try {
            PaymentRequestResponse result = apiInstance.createPaymentRequest(paymentRequestCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentRequestsApi#createPaymentRequest");
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
 **paymentRequestCreateParams** | [**PaymentRequestCreateParams**](PaymentRequestCreateParams.md)| 支払依頼の作成 | [optional]

### Return type

[**PaymentRequestResponse**](PaymentRequestResponse.md)

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


## destroyPaymentRequest

> destroyPaymentRequest(id, companyId)

支払依頼の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PaymentRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PaymentRequestsApi apiInstance = new PaymentRequestsApi(defaultClient);
        Integer id = 56; // Integer | 支払依頼ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyPaymentRequest(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentRequestsApi#destroyPaymentRequest");
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
 **id** | **Integer**| 支払依頼ID |
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


## getPaymentRequest

> PaymentRequestResponse getPaymentRequest(id, companyId)

支払依頼詳細の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PaymentRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PaymentRequestsApi apiInstance = new PaymentRequestsApi(defaultClient);
        Integer id = 56; // Integer | 支払依頼ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            PaymentRequestResponse result = apiInstance.getPaymentRequest(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentRequestsApi#getPaymentRequest");
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
 **id** | **Integer**| 支払依頼ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**PaymentRequestResponse**](PaymentRequestResponse.md)

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


## getPaymentRequests

> PaymentRequestsIndexResponse getPaymentRequests(companyId, status, startApplicationDate, endApplicationDate, startIssueDate, endIssueDate, applicationNumber, title, applicantId, approverId, minAmount, maxAmount, partnerId, partnerCode, paymentMethod, startPaymentDate, endPaymentDate, documentCode, offset, limit)

支払依頼一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PaymentRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PaymentRequestsApi apiInstance = new PaymentRequestsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String status = "draft"; // String | '申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)、 取引ステータス(unsettled:支払待ち, settled:支払済み)'<br> approver_id を指定した場合は無効です。 
        String startApplicationDate = "2019-12-17"; // String | 申請日で絞込：開始日(yyyy-mm-dd)
        String endApplicationDate = "2019-12-17"; // String | 申請日で絞込：終了日(yyyy-mm-dd)
        String startIssueDate = "2019-12-17"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endIssueDate = "2019-12-17"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        Integer applicationNumber = 2; // Integer | 申請No.
        String title = "大阪出張"; // String | 申請タイトル
        Integer applicantId = 1; // Integer | 申請者のユーザーID
        Integer approverId = 1; // Integer | 承認者のユーザーID<br> 'approver_id を指定した場合は、 in_progress: 申請中 の支払依頼のみを返します。' 
        Integer minAmount = 5000; // Integer | 金額で絞込 (下限金額)
        Integer maxAmount = 10000; // Integer | 金額で絞込 (上限金額)
        Integer partnerId = 56; // Integer | 取引先IDで絞込
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込
        String paymentMethod = "none"; // String | 支払方法で絞込 (none: 指定なし, domestic_bank_transfer: 国内振込, abroad_bank_transfer: 国外振込, account_transfer: 口座振替, credit_card: クレジットカード)
        String startPaymentDate = "2019-12-17"; // String | 支払期限で絞込：開始日(yyyy-mm-dd)
        String endPaymentDate = "2019-12-17"; // String | 支払期限で絞込：終了日(yyyy-mm-dd)
        String documentCode = "2"; // String | 請求書番号で絞込
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500)
        try {
            PaymentRequestsIndexResponse result = apiInstance.getPaymentRequests(companyId, status, startApplicationDate, endApplicationDate, startIssueDate, endIssueDate, applicationNumber, title, applicantId, approverId, minAmount, maxAmount, partnerId, partnerCode, paymentMethod, startPaymentDate, endPaymentDate, documentCode, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentRequestsApi#getPaymentRequests");
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
 **status** | **String**| &#39;申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)、 取引ステータス(unsettled:支払待ち, settled:支払済み)&#39;&lt;br&gt; approver_id を指定した場合は無効です。  | [optional] [enum: draft, in_progress, approved, rejected, feedback, unsettled, settled]
 **startApplicationDate** | **String**| 申請日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endApplicationDate** | **String**| 申請日で絞込：終了日(yyyy-mm-dd) | [optional]
 **startIssueDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endIssueDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **applicationNumber** | **Integer**| 申請No. | [optional]
 **title** | **String**| 申請タイトル | [optional]
 **applicantId** | **Integer**| 申請者のユーザーID | [optional]
 **approverId** | **Integer**| 承認者のユーザーID&lt;br&gt; &#39;approver_id を指定した場合は、 in_progress: 申請中 の支払依頼のみを返します。&#39;  | [optional]
 **minAmount** | **Integer**| 金額で絞込 (下限金額) | [optional]
 **maxAmount** | **Integer**| 金額で絞込 (上限金額) | [optional]
 **partnerId** | **Integer**| 取引先IDで絞込 | [optional]
 **partnerCode** | **String**| 取引先コードで絞込 | [optional]
 **paymentMethod** | **String**| 支払方法で絞込 (none: 指定なし, domestic_bank_transfer: 国内振込, abroad_bank_transfer: 国外振込, account_transfer: 口座振替, credit_card: クレジットカード) | [optional] [enum: none, domestic_bank_transfer, abroad_bank_transfer, account_transfer, credit_card]
 **startPaymentDate** | **String**| 支払期限で絞込：開始日(yyyy-mm-dd) | [optional]
 **endPaymentDate** | **String**| 支払期限で絞込：終了日(yyyy-mm-dd) | [optional]
 **documentCode** | **String**| 請求書番号で絞込 | [optional]
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500) | [optional]

### Return type

[**PaymentRequestsIndexResponse**](PaymentRequestsIndexResponse.md)

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


## updatePaymentRequest

> PaymentRequestResponse updatePaymentRequest(id, paymentRequestUpdateParams)

支払依頼の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PaymentRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PaymentRequestsApi apiInstance = new PaymentRequestsApi(defaultClient);
        Integer id = 56; // Integer | 支払依頼ID
        PaymentRequestUpdateParams paymentRequestUpdateParams = new PaymentRequestUpdateParams(); // PaymentRequestUpdateParams | 支払依頼の更新
        try {
            PaymentRequestResponse result = apiInstance.updatePaymentRequest(id, paymentRequestUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentRequestsApi#updatePaymentRequest");
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
 **id** | **Integer**| 支払依頼ID |
 **paymentRequestUpdateParams** | [**PaymentRequestUpdateParams**](PaymentRequestUpdateParams.md)| 支払依頼の更新 | [optional]

### Return type

[**PaymentRequestResponse**](PaymentRequestResponse.md)

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


## updatePaymentRequestAction

> PaymentRequestResponse updatePaymentRequestAction(id, paymentRequestActionCreateParams)

支払依頼の承認操作

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PaymentRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PaymentRequestsApi apiInstance = new PaymentRequestsApi(defaultClient);
        Integer id = 56; // Integer | 支払依頼ID
        PaymentRequestActionCreateParams paymentRequestActionCreateParams = new PaymentRequestActionCreateParams(); // PaymentRequestActionCreateParams | 支払依頼の承認操作
        try {
            PaymentRequestResponse result = apiInstance.updatePaymentRequestAction(id, paymentRequestActionCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentRequestsApi#updatePaymentRequestAction");
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
 **id** | **Integer**| 支払依頼ID |
 **paymentRequestActionCreateParams** | [**PaymentRequestActionCreateParams**](PaymentRequestActionCreateParams.md)| 支払依頼の承認操作 |

### Return type

[**PaymentRequestResponse**](PaymentRequestResponse.md)

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

