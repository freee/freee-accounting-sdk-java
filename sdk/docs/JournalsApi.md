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

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ダウンロードを実行する&lt;/p&gt;  &lt;p&gt;＊このAPIは無料プランのアカウントではご利用になれません&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;id : 受け付けID&lt;/li&gt; &lt;/ul&gt;

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

> JournalStatusResponse getJournalStatus(id, companyId, visibleTags, startDate, endDate)

ステータス確認

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ダウンロードリクエストのステータスを確認する&lt;/p&gt;  &lt;p&gt;＊このAPIは無料プランのアカウントではご利用になれません&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;status&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;enqueued : 実行待ち&lt;/li&gt;  &lt;li&gt;working : 実行中&lt;/li&gt;  &lt;li&gt;uploaded : 準備完了&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;id : 受け付けID&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;

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
        List<String> visibleTags = Arrays.asList(); // List<String> | 補助科目やコメントとして出力する項目
        String startDate = "startDate_example"; // String | 取得開始日 (yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 取得終了日 (yyyy-mm-dd)
        try {
            JournalStatusResponse result = apiInstance.getJournalStatus(id, companyId, visibleTags, startDate, endDate);
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
 **visibleTags** | [**List&lt;String&gt;**](String.md)| 補助科目やコメントとして出力する項目 | [optional] [enum: partner, item, tag, section, description, wallet_txn_description, all]
 **startDate** | **String**| 取得開始日 (yyyy-mm-dd) | [optional]
 **endDate** | **String**| 取得終了日 (yyyy-mm-dd) | [optional]

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

> JournalsResponse getJournals(downloadType, companyId, visibleTags, startDate, endDate)

ダウンロード要求

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザーが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/204599604#2\&quot;&gt;ヘルプページ&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;p&gt;＊このAPIは無料プランのアカウントではご利用になれません&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;download_type &lt;ul&gt; &lt;li&gt;generic(freee Webからダウンロードできるものと同じ)&lt;/li&gt; &lt;li&gt;csv (yayoi形式)&lt;/li&gt; &lt;li&gt;pdf&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt;visible_tags : 指定しない場合は従来の仕様の仕訳帳が出力されます &lt;ul&gt; &lt;li&gt;partner : 取引先タグ&lt;/li&gt; &lt;li&gt;item : 品目タグ&lt;/li&gt; &lt;li&gt;tag : メモタグ&lt;/li&gt; &lt;li&gt;section : 部門タグ&lt;/li&gt; &lt;li&gt;description : 備考欄&lt;/li&gt; &lt;li&gt;wallet_txn_description : 明細の備考欄&lt;/li&gt;       &lt;li&gt;         segment_1_tag : セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン)&lt;br&gt;         segment_2_tag : セグメント2(法人向け エンタープライズプラン)&lt;br&gt;         segment_3_tag : セグメント3(法人向け エンタープライズプラン)&lt;br&gt;&lt;br&gt;         &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611-%E3%82%BB%E3%82%B0%E3%83%A1%E3%83%B3%E3%83%88-%E5%88%86%E6%9E%90%E7%94%A8%E3%82%BF%E3%82%B0-%E3%81%AE%E8%A8%AD%E5%AE%9A\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt;       &lt;/li&gt;       &lt;li&gt;all : 指定された場合は上記の設定をすべて有効として扱いますが、セグメント1、セグメント2、セグメント3は含みません。セグメントが必要な場合はallではなく、segment_1_tag, segment_2_tag, segment_3_tagを指定してください。&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt;id : 受け付けID&lt;/li&gt; &lt;/ul&gt;

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
        String downloadType = "downloadType_example"; // String | ダウンロード形式
        Integer companyId = 56; // Integer | 事業所ID
        List<String> visibleTags = Arrays.asList(); // List<String> | 補助科目やコメントとして出力する項目
        String startDate = "startDate_example"; // String | 取得開始日 (yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 取得終了日 (yyyy-mm-dd)
        try {
            JournalsResponse result = apiInstance.getJournals(downloadType, companyId, visibleTags, startDate, endDate);
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

