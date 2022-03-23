# ManualJournalsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createManualJournal**](ManualJournalsApi.md#createManualJournal) | **POST** api/1/manual_journals | 振替伝票の作成
[**destroyManualJournal**](ManualJournalsApi.md#destroyManualJournal) | **DELETE** api/1/manual_journals/{id} | 振替伝票の削除
[**getManualJournal**](ManualJournalsApi.md#getManualJournal) | **GET** api/1/manual_journals/{id} | 振替伝票の取得
[**getManualJournals**](ManualJournalsApi.md#getManualJournals) | **GET** api/1/manual_journals | 振替伝票一覧の取得
[**updateManualJournal**](ManualJournalsApi.md#updateManualJournal) | **PUT** api/1/manual_journals/{id} | 振替伝票の更新



## createManualJournal

> ManualJournalResponse createManualJournal(manualJournalCreateParams)

振替伝票の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ManualJournalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ManualJournalsApi apiInstance = new ManualJournalsApi(defaultClient);
        ManualJournalCreateParams manualJournalCreateParams = new ManualJournalCreateParams(); // ManualJournalCreateParams | 振替伝票の作成
        try {
            ManualJournalResponse result = apiInstance.createManualJournal(manualJournalCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManualJournalsApi#createManualJournal");
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
 **manualJournalCreateParams** | [**ManualJournalCreateParams**](ManualJournalCreateParams.md)| 振替伝票の作成 | [optional]

### Return type

[**ManualJournalResponse**](ManualJournalResponse.md)

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
| **503** |  |  -  |


## destroyManualJournal

> destroyManualJournal(id, companyId)

振替伝票の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ManualJournalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ManualJournalsApi apiInstance = new ManualJournalsApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyManualJournal(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManualJournalsApi#destroyManualJournal");
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


## getManualJournal

> ManualJournalResponse getManualJournal(id, companyId)

振替伝票の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ManualJournalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ManualJournalsApi apiInstance = new ManualJournalsApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ManualJournalResponse result = apiInstance.getManualJournal(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManualJournalsApi#getManualJournal");
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

[**ManualJournalResponse**](ManualJournalResponse.md)

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


## getManualJournals

> InlineResponse2004 getManualJournals(companyId, startIssueDate, endIssueDate, entrySide, accountItemId, minAmount, maxAmount, partnerId, partnerCode, itemId, sectionId, segment1TagId, segment2TagId, segment3TagId, commentStatus, commentImportant, adjustment, txnNumber, offset, limit)

振替伝票一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ManualJournalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ManualJournalsApi apiInstance = new ManualJournalsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String startIssueDate = "startIssueDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endIssueDate = "endIssueDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String entrySide = "credit"; // String | 貸借で絞込 (貸方: credit, 借方: debit)
        Integer accountItemId = 56; // Integer | 勘定科目IDで絞込
        Long minAmount = 56L; // Long | 金額で絞込：下限
        Long maxAmount = 56L; // Long | 金額で絞込：上限
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択の貸借行を絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択の貸借行を絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択の貸借行を絞り込めます）
        Long segment1TagId = 56L; // Long | セグメント１IDで絞込（0を指定すると、セグメント１が未選択の貸借行を絞り込めます）
        Long segment2TagId = 56L; // Long | セグメント２IDで絞込（0を指定すると、セグメント２が未選択の貸借行を絞り込めます）
        Long segment3TagId = 56L; // Long | セグメント３IDで絞込（0を指定すると、セグメント３が未選択の貸借行を絞り込めます）
        String commentStatus = "posted_with_mention"; // String | コメント状態で絞込（自分宛のコメント: posted_with_mention, 自分宛のコメント-未解決: raised_with_mention, 自分宛のコメント-解決済: resolved_with_mention, コメントあり: posted, 未解決: raised, 解決済: resolved, コメントなし: none）
        Boolean commentImportant = true; // Boolean | 重要コメント付きの振替伝票を絞込
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）
        String txnNumber = "txnNumber_example"; // String | 仕訳番号で絞込（事業所の仕訳番号形式が有効な場合のみ）
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 500) 
        try {
            InlineResponse2004 result = apiInstance.getManualJournals(companyId, startIssueDate, endIssueDate, entrySide, accountItemId, minAmount, maxAmount, partnerId, partnerCode, itemId, sectionId, segment1TagId, segment2TagId, segment3TagId, commentStatus, commentImportant, adjustment, txnNumber, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManualJournalsApi#getManualJournals");
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
 **startIssueDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endIssueDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **entrySide** | **String**| 貸借で絞込 (貸方: credit, 借方: debit) | [optional] [enum: credit, debit]
 **accountItemId** | **Integer**| 勘定科目IDで絞込 | [optional]
 **minAmount** | **Long**| 金額で絞込：下限 | [optional]
 **maxAmount** | **Long**| 金額で絞込：上限 | [optional]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択の貸借行を絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込 | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択の貸借行を絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択の貸借行を絞り込めます） | [optional]
 **segment1TagId** | **Long**| セグメント１IDで絞込（0を指定すると、セグメント１が未選択の貸借行を絞り込めます） | [optional]
 **segment2TagId** | **Long**| セグメント２IDで絞込（0を指定すると、セグメント２が未選択の貸借行を絞り込めます） | [optional]
 **segment3TagId** | **Long**| セグメント３IDで絞込（0を指定すると、セグメント３が未選択の貸借行を絞り込めます） | [optional]
 **commentStatus** | **String**| コメント状態で絞込（自分宛のコメント: posted_with_mention, 自分宛のコメント-未解決: raised_with_mention, 自分宛のコメント-解決済: resolved_with_mention, コメントあり: posted, 未解決: raised, 解決済: resolved, コメントなし: none） | [optional] [enum: posted_with_mention, raised_with_mention, resolved_with_mention, posted, raised, resolved, none]
 **commentImportant** | **Boolean**| 重要コメント付きの振替伝票を絞込 | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） | [optional] [enum: only, without]
 **txnNumber** | **String**| 仕訳番号で絞込（事業所の仕訳番号形式が有効な場合のみ） | [optional]
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 500)  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

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


## updateManualJournal

> ManualJournalResponse updateManualJournal(id, manualJournalUpdateParams)

振替伝票の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ManualJournalsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ManualJournalsApi apiInstance = new ManualJournalsApi(defaultClient);
        Integer id = 56; // Integer | 
        ManualJournalUpdateParams manualJournalUpdateParams = new ManualJournalUpdateParams(); // ManualJournalUpdateParams | 振替伝票の更新
        try {
            ManualJournalResponse result = apiInstance.updateManualJournal(id, manualJournalUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManualJournalsApi#updateManualJournal");
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
 **manualJournalUpdateParams** | [**ManualJournalUpdateParams**](ManualJournalUpdateParams.md)| 振替伝票の更新 | [optional]

### Return type

[**ManualJournalResponse**](ManualJournalResponse.md)

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

