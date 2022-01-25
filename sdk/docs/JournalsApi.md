# JournalsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadJournal**](JournalsApi.md#downloadJournal) | **GET** api/1/journals/reports/{id}/download | ダウンロード実行
[**getJournalStatus**](JournalsApi.md#getJournalStatus) | **GET** api/1/journals/reports/{id}/status | ステータス確認
[**getJournals**](JournalsApi.md#getJournals) | **GET** api/1/journals | ダウンロード要求



## downloadJournal

> File downloadJournal(id, companyId)

ダウンロード実行

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.JournalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        JournalsApi apiInstance = new JournalsApi(defaultClient);
        Integer id = 56; // Integer | 受け付けID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            File result = apiInstance.downloadJournal(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalsApi#downloadJournal");
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
 **id** | **Integer**| 受け付けID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**File**](File.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, text/csv, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |


## getJournalStatus

> JournalStatusResponse getJournalStatus(id, companyId)

ステータス確認

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.JournalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        JournalsApi apiInstance = new JournalsApi(defaultClient);
        Integer id = 56; // Integer | 受け付けID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            JournalStatusResponse result = apiInstance.getJournalStatus(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalsApi#getJournalStatus");
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
 **id** | **Integer**| 受け付けID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**JournalStatusResponse**](JournalStatusResponse.md)

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


## getJournals

> JournalsResponse getJournals(downloadType, companyId, visibleTags, visibleIds, startDate, endDate)

ダウンロード要求

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.JournalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        JournalsApi apiInstance = new JournalsApi(defaultClient);
        String downloadType = "csv"; // String | ダウンロード形式
        Integer companyId = 56; // Integer | 事業所ID
        List<String> visibleTags = Arrays.asList(); // List<String> | 補助科目やコメントとして出力する項目
        List<String> visibleIds = Arrays.asList(); // List<String> | 追加出力するID項目
        String startDate = "startDate_example"; // String | 取得開始日 (yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 取得終了日 (yyyy-mm-dd)
        try {
            JournalsResponse result = apiInstance.getJournals(downloadType, companyId, visibleTags, visibleIds, startDate, endDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalsApi#getJournals");
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
 **downloadType** | **String**| ダウンロード形式 | [enum: csv, pdf, yayoi, generic]
 **companyId** | **Integer**| 事業所ID |
 **visibleTags** | [**List&lt;String&gt;**](String.md)| 補助科目やコメントとして出力する項目 | [optional] [enum: partner, item, tag, section, description, wallet_txn_description, segment_1_tag, segment_2_tag, segment_3_tag, all]
 **visibleIds** | [**List&lt;String&gt;**](String.md)| 追加出力するID項目 | [optional] [enum: deal_id, transfer_id, manual_journal_id]
 **startDate** | **String**| 取得開始日 (yyyy-mm-dd) | [optional]
 **endDate** | **String**| 取得終了日 (yyyy-mm-dd) | [optional]

### Return type

[**JournalsResponse**](JournalsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |

