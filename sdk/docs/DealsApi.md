# DealsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeal**](DealsApi.md#createDeal) | **POST** api/1/deals | 取引（収入／支出）の作成
[**destroyDeal**](DealsApi.md#destroyDeal) | **DELETE** api/1/deals/{id} | 取引（収入／支出）の削除
[**getDeal**](DealsApi.md#getDeal) | **GET** api/1/deals/{id} | 取引（収入／支出）の取得
[**getDeals**](DealsApi.md#getDeals) | **GET** api/1/deals | 取引（収入／支出）一覧の取得
[**updateDeal**](DealsApi.md#updateDeal) | **PUT** api/1/deals/{id} | 取引（収入／支出）の更新



## createDeal

> DealCreateResponse createDeal(dealCreateParams)

取引（収入／支出）の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.DealsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DealsApi apiInstance = new DealsApi(defaultClient);
        DealCreateParams dealCreateParams = new DealCreateParams(); // DealCreateParams | 取引（収入／支出）の作成
        try {
            DealCreateResponse result = apiInstance.createDeal(dealCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DealsApi#createDeal");
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
 **dealCreateParams** | [**DealCreateParams**](DealCreateParams.md)| 取引（収入／支出）の作成 | [optional]

### Return type

[**DealCreateResponse**](DealCreateResponse.md)

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


## destroyDeal

> destroyDeal(id, companyId)

取引（収入／支出）の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.DealsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DealsApi apiInstance = new DealsApi(defaultClient);
        Integer id = 56; // Integer | 取引ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyDeal(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DealsApi#destroyDeal");
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
 **id** | **Integer**| 取引ID |
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


## getDeal

> DealResponse getDeal(id, companyId, accruals)

取引（収入／支出）の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.DealsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DealsApi apiInstance = new DealsApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer companyId = 56; // Integer | 事業所ID
        String accruals = "without"; // String | 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する）
        try {
            DealResponse result = apiInstance.getDeal(id, companyId, accruals);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DealsApi#getDeal");
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
 **accruals** | **String**| 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する） | [optional] [enum: without, with]

### Return type

[**DealResponse**](DealResponse.md)

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


## getDeals

> InlineResponse2001 getDeals(companyId, partnerId, accountItemId, partnerCode, status, type, startIssueDate, endIssueDate, startDueDate, endDueDate, startRenewDate, endRenewDate, offset, limit, registeredFrom, accruals)

取引（収入／支出）一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.DealsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DealsApi apiInstance = new DealsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer partnerId = 56; // Integer | 取引先IDで絞込
        Integer accountItemId = 56; // Integer | 勘定科目IDで絞込
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込
        String status = "unsettled"; // String | 決済状況で絞込 (未決済: unsettled, 完了: settled)
        String type = "income"; // String | 収支区分 (収入: income, 支出: expense)
        String startIssueDate = "startIssueDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endIssueDate = "endIssueDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String startDueDate = "startDueDate_example"; // String | 支払期日で絞込：開始日(yyyy-mm-dd)
        String endDueDate = "endDueDate_example"; // String | 支払期日で絞込：終了日(yyyy-mm-dd)
        String startRenewDate = "startRenewDate_example"; // String | +更新日で絞込：開始日(yyyy-mm-dd)
        String endRenewDate = "endRenewDate_example"; // String | +更新日で絞込：終了日(yyyy-mm-dd)
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最大: 100) 
        String registeredFrom = "me"; // String | 取引登録元アプリで絞込（me: 本APIを叩くアプリ自身から登録した取引のみ）
        String accruals = "without"; // String | 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する）
        try {
            InlineResponse2001 result = apiInstance.getDeals(companyId, partnerId, accountItemId, partnerCode, status, type, startIssueDate, endIssueDate, startDueDate, endDueDate, startRenewDate, endRenewDate, offset, limit, registeredFrom, accruals);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DealsApi#getDeals");
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
 **accountItemId** | **Integer**| 勘定科目IDで絞込 | [optional]
 **partnerCode** | **String**| 取引先コードで絞込 | [optional]
 **status** | **String**| 決済状況で絞込 (未決済: unsettled, 完了: settled) | [optional] [enum: unsettled, settled]
 **type** | **String**| 収支区分 (収入: income, 支出: expense) | [optional] [enum: income, expense]
 **startIssueDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endIssueDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **startDueDate** | **String**| 支払期日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDueDate** | **String**| 支払期日で絞込：終了日(yyyy-mm-dd) | [optional]
 **startRenewDate** | **String**| +更新日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endRenewDate** | **String**| +更新日で絞込：終了日(yyyy-mm-dd) | [optional]
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最大: 100)  | [optional]
 **registeredFrom** | **String**| 取引登録元アプリで絞込（me: 本APIを叩くアプリ自身から登録した取引のみ） | [optional] [enum: me]
 **accruals** | **String**| 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する） | [optional] [enum: without, with]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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


## updateDeal

> DealResponse updateDeal(id, dealUpdateParams)

取引（収入／支出）の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.DealsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        DealsApi apiInstance = new DealsApi(defaultClient);
        Integer id = 56; // Integer | 取引ID
        DealUpdateParams dealUpdateParams = new DealUpdateParams(); // DealUpdateParams | 取引（収入／支出）の更新
        try {
            DealResponse result = apiInstance.updateDeal(id, dealUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DealsApi#updateDeal");
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
 **id** | **Integer**| 取引ID |
 **dealUpdateParams** | [**DealUpdateParams**](DealUpdateParams.md)| 取引（収入／支出）の更新 | [optional]

### Return type

[**DealResponse**](DealResponse.md)

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

