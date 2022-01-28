# ExpenseApplicationsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExpenseApplication**](ExpenseApplicationsApi.md#createExpenseApplication) | **POST** api/1/expense_applications | 経費申請の作成
[**destroyExpenseApplication**](ExpenseApplicationsApi.md#destroyExpenseApplication) | **DELETE** api/1/expense_applications/{id} | 経費申請の削除
[**getExpenseApplication**](ExpenseApplicationsApi.md#getExpenseApplication) | **GET** api/1/expense_applications/{id} | 経費申請詳細の取得
[**getExpenseApplications**](ExpenseApplicationsApi.md#getExpenseApplications) | **GET** api/1/expense_applications | 経費申請一覧の取得
[**updateExpenseApplication**](ExpenseApplicationsApi.md#updateExpenseApplication) | **PUT** api/1/expense_applications/{id} | 経費申請の更新
[**updateExpenseApplicationAction**](ExpenseApplicationsApi.md#updateExpenseApplicationAction) | **POST** api/1/expense_applications/{id}/actions | 経費申請の承認操作



## createExpenseApplication

> ExpenseApplicationResponse createExpenseApplication(expenseApplicationCreateParams)

経費申請の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationsApi apiInstance = new ExpenseApplicationsApi(defaultClient);
        ExpenseApplicationCreateParams expenseApplicationCreateParams = new ExpenseApplicationCreateParams(); // ExpenseApplicationCreateParams | 経費申請の作成
        try {
            ExpenseApplicationResponse result = apiInstance.createExpenseApplication(expenseApplicationCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationsApi#createExpenseApplication");
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
 **expenseApplicationCreateParams** | [**ExpenseApplicationCreateParams**](ExpenseApplicationCreateParams.md)| 経費申請の作成 | [optional]

### Return type

[**ExpenseApplicationResponse**](ExpenseApplicationResponse.md)

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


## destroyExpenseApplication

> destroyExpenseApplication(id, companyId)

経費申請の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationsApi apiInstance = new ExpenseApplicationsApi(defaultClient);
        Integer id = 56; // Integer | 経費申請ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyExpenseApplication(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationsApi#destroyExpenseApplication");
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
 **id** | **Integer**| 経費申請ID |
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


## getExpenseApplication

> ExpenseApplicationResponse getExpenseApplication(id, companyId)

経費申請詳細の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationsApi apiInstance = new ExpenseApplicationsApi(defaultClient);
        Integer id = 56; // Integer | 経費申請ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ExpenseApplicationResponse result = apiInstance.getExpenseApplication(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationsApi#getExpenseApplication");
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
 **id** | **Integer**| 経費申請ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**ExpenseApplicationResponse**](ExpenseApplicationResponse.md)

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


## getExpenseApplications

> ExpenseApplicationsIndexResponse getExpenseApplications(companyId, status, payrollAttached, startTransactionDate, endTransactionDate, applicationNumber, title, startIssueDate, endIssueDate, applicantId, approverId, minAmount, maxAmount, offset, limit)

経費申請一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationsApi apiInstance = new ExpenseApplicationsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String status = "draft"; // String | 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)、 取引ステータス(unsettled:清算待ち, settled:精算済み)
        Boolean payrollAttached = true; // Boolean | true:給与連携あり、false:給与連携なし、未指定時:絞り込みなし
        String startTransactionDate = "2019-12-17"; // String | 発生日(経費申請項目の日付)で絞込：開始日(yyyy-mm-dd)
        String endTransactionDate = "2019-12-17"; // String | 発生日(経費申請項目の日付)で絞込：終了日(yyyy-mm-dd)
        Integer applicationNumber = 2; // Integer | 申請No.
        String title = "大阪出張"; // String | 申請タイトル
        String startIssueDate = "2019-12-17"; // String | 申請日で絞込：開始日(yyyy-mm-dd)
        String endIssueDate = "2019-12-17"; // String | 申請日で絞込：終了日(yyyy-mm-dd)
        Integer applicantId = 1; // Integer | 申請者のユーザーID
        Integer approverId = 1; // Integer | 承認者のユーザーID
        Integer minAmount = 5000; // Integer | 金額で絞込 (下限金額)
        Integer maxAmount = 10000; // Integer | 金額で絞込 (上限金額)
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500)
        try {
            ExpenseApplicationsIndexResponse result = apiInstance.getExpenseApplications(companyId, status, payrollAttached, startTransactionDate, endTransactionDate, applicationNumber, title, startIssueDate, endIssueDate, applicantId, approverId, minAmount, maxAmount, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationsApi#getExpenseApplications");
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
 **status** | **String**| 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)、 取引ステータス(unsettled:清算待ち, settled:精算済み) | [optional] [enum: draft, in_progress, approved, rejected, feedback, unsettled, settled]
 **payrollAttached** | **Boolean**| true:給与連携あり、false:給与連携なし、未指定時:絞り込みなし | [optional]
 **startTransactionDate** | **String**| 発生日(経費申請項目の日付)で絞込：開始日(yyyy-mm-dd) | [optional]
 **endTransactionDate** | **String**| 発生日(経費申請項目の日付)で絞込：終了日(yyyy-mm-dd) | [optional]
 **applicationNumber** | **Integer**| 申請No. | [optional]
 **title** | **String**| 申請タイトル | [optional]
 **startIssueDate** | **String**| 申請日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endIssueDate** | **String**| 申請日で絞込：終了日(yyyy-mm-dd) | [optional]
 **applicantId** | **Integer**| 申請者のユーザーID | [optional]
 **approverId** | **Integer**| 承認者のユーザーID | [optional]
 **minAmount** | **Integer**| 金額で絞込 (下限金額) | [optional]
 **maxAmount** | **Integer**| 金額で絞込 (上限金額) | [optional]
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500) | [optional]

### Return type

[**ExpenseApplicationsIndexResponse**](ExpenseApplicationsIndexResponse.md)

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


## updateExpenseApplication

> ExpenseApplicationResponse updateExpenseApplication(id, expenseApplicationUpdateParams)

経費申請の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationsApi apiInstance = new ExpenseApplicationsApi(defaultClient);
        Integer id = 56; // Integer | 経費申請ID
        ExpenseApplicationUpdateParams expenseApplicationUpdateParams = new ExpenseApplicationUpdateParams(); // ExpenseApplicationUpdateParams | 経費申請の更新
        try {
            ExpenseApplicationResponse result = apiInstance.updateExpenseApplication(id, expenseApplicationUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationsApi#updateExpenseApplication");
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
 **id** | **Integer**| 経費申請ID |
 **expenseApplicationUpdateParams** | [**ExpenseApplicationUpdateParams**](ExpenseApplicationUpdateParams.md)| 経費申請の更新 | [optional]

### Return type

[**ExpenseApplicationResponse**](ExpenseApplicationResponse.md)

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


## updateExpenseApplicationAction

> ExpenseApplicationResponse updateExpenseApplicationAction(id, expenseApplicationActionCreateParams)

経費申請の承認操作

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationsApi apiInstance = new ExpenseApplicationsApi(defaultClient);
        Integer id = 56; // Integer | 経費申請ID
        ExpenseApplicationActionCreateParams expenseApplicationActionCreateParams = new ExpenseApplicationActionCreateParams(); // ExpenseApplicationActionCreateParams | 経費申請の承認操作
        try {
            ExpenseApplicationResponse result = apiInstance.updateExpenseApplicationAction(id, expenseApplicationActionCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationsApi#updateExpenseApplicationAction");
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
 **id** | **Integer**| 経費申請ID |
 **expenseApplicationActionCreateParams** | [**ExpenseApplicationActionCreateParams**](ExpenseApplicationActionCreateParams.md)| 経費申請の承認操作 |

### Return type

[**ExpenseApplicationResponse**](ExpenseApplicationResponse.md)

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

