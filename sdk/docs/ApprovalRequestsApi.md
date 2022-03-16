# ApprovalRequestsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApprovalRequest**](ApprovalRequestsApi.md#createApprovalRequest) | **POST** api/1/approval_requests | 各種申請の作成
[**destroyApprovalRequest**](ApprovalRequestsApi.md#destroyApprovalRequest) | **DELETE** api/1/approval_requests/{id} | 各種申請の削除
[**getApprovalRequest**](ApprovalRequestsApi.md#getApprovalRequest) | **GET** api/1/approval_requests/{id} | 各種申請の取得
[**getApprovalRequestForm**](ApprovalRequestsApi.md#getApprovalRequestForm) | **GET** api/1/approval_requests/forms/{id} | 各種申請の申請フォームの取得
[**getApprovalRequestForms**](ApprovalRequestsApi.md#getApprovalRequestForms) | **GET** api/1/approval_requests/forms | 各種申請の申請フォーム一覧の取得
[**getApprovalRequests**](ApprovalRequestsApi.md#getApprovalRequests) | **GET** api/1/approval_requests | 各種申請の一覧
[**updateApprovalRequest**](ApprovalRequestsApi.md#updateApprovalRequest) | **PUT** api/1/approval_requests/{id} | 各種申請の更新
[**updateApprovalRequestAction**](ApprovalRequestsApi.md#updateApprovalRequestAction) | **POST** api/1/approval_requests/{id}/actions | 各種申請の承認操作



## createApprovalRequest

> ApprovalRequestResponse createApprovalRequest(approvalRequestCreateParams)

各種申請の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        ApprovalRequestCreateParams approvalRequestCreateParams = new ApprovalRequestCreateParams(); // ApprovalRequestCreateParams | 各種申請の作成
        try {
            ApprovalRequestResponse result = apiInstance.createApprovalRequest(approvalRequestCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#createApprovalRequest");
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
 **approvalRequestCreateParams** | [**ApprovalRequestCreateParams**](ApprovalRequestCreateParams.md)| 各種申請の作成 | [optional]

### Return type

[**ApprovalRequestResponse**](ApprovalRequestResponse.md)

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


## destroyApprovalRequest

> destroyApprovalRequest(id, companyId)

各種申請の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 各種申請ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyApprovalRequest(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#destroyApprovalRequest");
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
 **id** | **Integer**| 各種申請ID |
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


## getApprovalRequest

> ApprovalRequestResponse getApprovalRequest(id, companyId)

各種申請の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 各種申請ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ApprovalRequestResponse result = apiInstance.getApprovalRequest(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#getApprovalRequest");
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
 **id** | **Integer**| 各種申請ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**ApprovalRequestResponse**](ApprovalRequestResponse.md)

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


## getApprovalRequestForm

> ApprovalRequestFormResponse getApprovalRequestForm(id, companyId)

各種申請の申請フォームの取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 申請フォームID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ApprovalRequestFormResponse result = apiInstance.getApprovalRequestForm(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#getApprovalRequestForm");
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
 **id** | **Integer**| 申請フォームID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**ApprovalRequestFormResponse**](ApprovalRequestFormResponse.md)

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


## getApprovalRequestForms

> ApprovalRequestFormIndexResponse getApprovalRequestForms(companyId)

各種申請の申請フォーム一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ApprovalRequestFormIndexResponse result = apiInstance.getApprovalRequestForms(companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#getApprovalRequestForms");
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

### Return type

[**ApprovalRequestFormIndexResponse**](ApprovalRequestFormIndexResponse.md)

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


## getApprovalRequests

> ApprovalRequestsIndexResponse getApprovalRequests(companyId, status, applicationNumber, title, formId, startApplicationDate, endApplicationDate, applicantId, minAmount, maxAmount, approverId, offset, limit)

各種申請の一覧

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String status = "draft"; // String | 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し) 承認者指定時には無効です。
        Integer applicationNumber = 2; // Integer | 申請No.
        String title = "大阪出張"; // String | 申請タイトル
        Integer formId = 56; // Integer | 申請フォームID
        String startApplicationDate = "startApplicationDate_example"; // String | 申請日で絞込：開始日(yyyy-mm-dd)
        String endApplicationDate = "endApplicationDate_example"; // String | 申請日で絞込：終了日(yyyy-mm-dd)
        Integer applicantId = 56; // Integer | 申請者のユーザーID
        Long minAmount = 56L; // Long | 金額で絞込：以上
        Long maxAmount = 56L; // Long | 金額で絞込：以下
        Integer approverId = 1; // Integer | 承認者のユーザーID 承認者指定時には申請ステータスが申請中のものだけが取得可能です。
        Integer offset = 56; // Integer | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500)
        try {
            ApprovalRequestsIndexResponse result = apiInstance.getApprovalRequests(companyId, status, applicationNumber, title, formId, startApplicationDate, endApplicationDate, applicantId, minAmount, maxAmount, approverId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#getApprovalRequests");
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
 **status** | **String**| 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し) 承認者指定時には無効です。 | [optional] [enum: draft, in_progress, approved, rejected, feedback]
 **applicationNumber** | **Integer**| 申請No. | [optional]
 **title** | **String**| 申請タイトル | [optional]
 **formId** | **Integer**| 申請フォームID | [optional]
 **startApplicationDate** | **String**| 申請日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endApplicationDate** | **String**| 申請日で絞込：終了日(yyyy-mm-dd) | [optional]
 **applicantId** | **Integer**| 申請者のユーザーID | [optional]
 **minAmount** | **Long**| 金額で絞込：以上 | [optional]
 **maxAmount** | **Long**| 金額で絞込：以下 | [optional]
 **approverId** | **Integer**| 承認者のユーザーID 承認者指定時には申請ステータスが申請中のものだけが取得可能です。 | [optional]
 **offset** | **Integer**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500) | [optional]

### Return type

[**ApprovalRequestsIndexResponse**](ApprovalRequestsIndexResponse.md)

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


## updateApprovalRequest

> ApprovalRequestResponse updateApprovalRequest(id, approvalRequestUpdateParams)

各種申請の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 各種申請ID
        ApprovalRequestUpdateParams approvalRequestUpdateParams = new ApprovalRequestUpdateParams(); // ApprovalRequestUpdateParams | 各種申請の更新
        try {
            ApprovalRequestResponse result = apiInstance.updateApprovalRequest(id, approvalRequestUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#updateApprovalRequest");
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
 **id** | **Integer**| 各種申請ID |
 **approvalRequestUpdateParams** | [**ApprovalRequestUpdateParams**](ApprovalRequestUpdateParams.md)| 各種申請の更新 |

### Return type

[**ApprovalRequestResponse**](ApprovalRequestResponse.md)

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


## updateApprovalRequestAction

> ApprovalRequestResponse updateApprovalRequestAction(id, approvalRequestActionCreateParams)

各種申請の承認操作

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 各種申請ID
        ApprovalRequestActionCreateParams approvalRequestActionCreateParams = new ApprovalRequestActionCreateParams(); // ApprovalRequestActionCreateParams | 各種申請の承認操作
        try {
            ApprovalRequestResponse result = apiInstance.updateApprovalRequestAction(id, approvalRequestActionCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#updateApprovalRequestAction");
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
 **id** | **Integer**| 各種申請ID |
 **approvalRequestActionCreateParams** | [**ApprovalRequestActionCreateParams**](ApprovalRequestActionCreateParams.md)| 各種申請の承認操作 |

### Return type

[**ApprovalRequestResponse**](ApprovalRequestResponse.md)

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

