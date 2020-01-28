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

> ManualJournalsCreateResponse createManualJournal(parameters)

振替伝票の作成

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt;  &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt; &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;貸借合わせて100行まで仕訳行を登録できます。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt;&lt;/ul&gt;  

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
        ManualJournalsCreateParams parameters = new ManualJournalsCreateParams(); // ManualJournalsCreateParams | 振替伝票の作成
        try {
            ManualJournalsCreateResponse result = apiInstance.createManualJournal(parameters);
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
 **parameters** | [**ManualJournalsCreateParams**](ManualJournalsCreateParams.md)| 振替伝票の作成 | [optional]

### Return type

[**ManualJournalsCreateResponse**](ManualJournalsCreateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |
| **503** |  |  -  |


## destroyManualJournal

> destroyManualJournal(id, companyId)

振替伝票の削除

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を削除する&lt;/p&gt;

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
| **404** |  |  -  |
| **500** |  |  -  |


## getManualJournal

> ManualJournalsShowResponse getManualJournal(id, companyId)

振替伝票の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt; &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt; &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt; &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;/ul&gt;

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
            ManualJournalsShowResponse result = apiInstance.getManualJournal(id, companyId);
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

[**ManualJournalsShowResponse**](ManualJournalsShowResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |


## getManualJournals

> ManualJournalsIndexResponse getManualJournals(companyId, startIssueDate, endIssueDate, entrySide, accountItemId, minAmount, maxAmount, partnerId, partnerCode, itemId, sectionId, segment1TagId, segment2TagId, segment3TagId, commentStatus, commentImportant, adjustment, txnNumber, offset, limit)

振替伝票一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt;  &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt; &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt;&lt;/ul&gt;

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
        String entrySide = "entrySide_example"; // String | 貸借で絞込 (貸方: credit, 借方: debit)
        Integer accountItemId = 56; // Integer | 勘定科目IDで絞込
        Integer minAmount = 56; // Integer | 金額で絞込：下限
        Integer maxAmount = 56; // Integer | 金額で絞込：上限
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択の貸借行を絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択の貸借行を絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択の貸借行を絞り込めます）
        Integer segment1TagId = 56; // Integer | セグメント１IDで絞り込み（0を指定すると、セグメント１が未選択の貸借行を絞り込めます）
        Integer segment2TagId = 56; // Integer | セグメント２IDで絞り込み（0を指定すると、セグメント２が未選択の貸借行を絞り込めます）
        Integer segment3TagId = 56; // Integer | セグメント３IDで絞り込み（0を指定すると、セグメント３が未選択の貸借行を絞り込めます）
        String commentStatus = "commentStatus_example"; // String | コメント状態で絞込（自分宛のコメント: posted_with_mention, 自分宛のコメント-未解決: raised_with_mention, 自分宛のコメント-解決済: resolved_with_mention, コメントあり: posted, 未解決: raised, 解決済: resolved, コメントなし: none）
        Boolean commentImportant = true; // Boolean | 重要コメント付きの振替伝票を絞込
        String adjustment = "adjustment_example"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）
        String txnNumber = "txnNumber_example"; // String | 仕訳番号で絞込（事業所の仕訳番号形式が有効な場合のみ）
        Integer offset = 56; // Integer | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最大: 500) 
        try {
            ManualJournalsIndexResponse result = apiInstance.getManualJournals(companyId, startIssueDate, endIssueDate, entrySide, accountItemId, minAmount, maxAmount, partnerId, partnerCode, itemId, sectionId, segment1TagId, segment2TagId, segment3TagId, commentStatus, commentImportant, adjustment, txnNumber, offset, limit);
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
 **minAmount** | **Integer**| 金額で絞込：下限 | [optional]
 **maxAmount** | **Integer**| 金額で絞込：上限 | [optional]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択の貸借行を絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込 | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択の貸借行を絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択の貸借行を絞り込めます） | [optional]
 **segment1TagId** | **Integer**| セグメント１IDで絞り込み（0を指定すると、セグメント１が未選択の貸借行を絞り込めます） | [optional]
 **segment2TagId** | **Integer**| セグメント２IDで絞り込み（0を指定すると、セグメント２が未選択の貸借行を絞り込めます） | [optional]
 **segment3TagId** | **Integer**| セグメント３IDで絞り込み（0を指定すると、セグメント３が未選択の貸借行を絞り込めます） | [optional]
 **commentStatus** | **String**| コメント状態で絞込（自分宛のコメント: posted_with_mention, 自分宛のコメント-未解決: raised_with_mention, 自分宛のコメント-解決済: resolved_with_mention, コメントあり: posted, 未解決: raised, 解決済: resolved, コメントなし: none） | [optional] [enum: posted_with_mention, raised_with_mention, resolved_with_mention, posted, raised, resolved, none]
 **commentImportant** | **Boolean**| 重要コメント付きの振替伝票を絞込 | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） | [optional] [enum: only, without]
 **txnNumber** | **String**| 仕訳番号で絞込（事業所の仕訳番号形式が有効な場合のみ） | [optional]
 **offset** | **Integer**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最大: 500)  | [optional]

### Return type

[**ManualJournalsIndexResponse**](ManualJournalsIndexResponse.md)

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
| **500** |  |  -  |


## updateManualJournal

> ManualJournalsUpdateResponse updateManualJournal(id, parameters)

振替伝票の更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt;  &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt;  &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;貸借合わせて100行まで仕訳行を登録できます。&lt;/li&gt;  &lt;li&gt;detailsに含まれない既存の貸借行は削除されます。更新後も残したい行は、必ず貸借行IDを指定してdetailsに含めてください。&lt;/li&gt;  &lt;li&gt;detailsに含まれる貸借行IDの指定がある行は、更新行として扱われ更新されます。&lt;/li&gt;  &lt;li&gt;detailsに含まれる貸借行IDの指定がない行は、新規行として扱われ追加されます。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt;&lt;/ul&gt;  

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
        ManualJournalsUpdateParams parameters = new ManualJournalsUpdateParams(); // ManualJournalsUpdateParams | 振替伝票の更新
        try {
            ManualJournalsUpdateResponse result = apiInstance.updateManualJournal(id, parameters);
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
 **parameters** | [**ManualJournalsUpdateParams**](ManualJournalsUpdateParams.md)| 振替伝票の更新 | [optional]

### Return type

[**ManualJournalsUpdateResponse**](ManualJournalsUpdateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

