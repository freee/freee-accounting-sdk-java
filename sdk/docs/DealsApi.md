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

> DealsCreateResponse createDeal(parameters)

取引（収入／支出）の作成

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引（収入／支出）を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt;  &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;ref_number : 管理番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;receipt_ids : 証憑ファイルID&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : 現金&lt;/li&gt;  &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;tax_idは廃止予定です。tax_codeをご利用ください。&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;tax_code, tax_idはどちらかの指定が必須です。両方指定した場合はtax_codeが優先されます。&lt;/p&gt; &lt;/li&gt; &lt;p&gt;&lt;li&gt;本APIでは+更新行(renews)の操作ができません。+更新行の作成APIをご利用ください。&lt;/p&gt;&lt;/li&gt;  &lt;p&gt;&lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/p&gt;&lt;/li&gt;  &lt;li&gt; &lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/p&gt;&lt;/li&gt; &lt;/ul&gt;  

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
        CreateDealParams parameters = new CreateDealParams(); // CreateDealParams | 取引（収入／支出）の作成
        try {
            DealsCreateResponse result = apiInstance.createDeal(parameters);
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
 **parameters** | [**CreateDealParams**](CreateDealParams.md)| 取引（収入／支出）の作成 | [optional]

### Return type

[**DealsCreateResponse**](DealsCreateResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |


## getDeal

> DealsResponse getDeal(id, companyId, accruals)

取引（収入／支出）の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引（収入／支出）を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt;  &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;accruals : 取引の債権債務行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : 現金&lt;/li&gt;  &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;registered_from&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;all : すべての取引&lt;/li&gt;  &lt;li&gt;me : 自身が登録した取引&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;tax_idは廃止予定です。tax_codeをご利用ください。&lt;/li&gt;  &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;/ul&gt;

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
        String accruals = "accruals_example"; // String | 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する）
        try {
            DealsResponse result = apiInstance.getDeal(id, companyId, accruals);
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

[**DealsResponse**](DealsResponse.md)

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


## getDeals

> DealsIndexResponse getDeals(companyId, partnerId, accountItemId, partnerCode, status, type, startIssueDate, endIssueDate, startDueDate, endDueDate, startRenewDate, endRenewDate, offset, limit, registeredFrom, accruals)

取引（収入／支出）一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引一覧（収入／支出）を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt;  &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;accruals : 取引の債権債務行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : 現金&lt;/li&gt;  &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;registered_from&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;all : すべての取引&lt;/li&gt;  &lt;li&gt;me : 自身が登録した取引&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;tax_idは廃止予定です。tax_codeをご利用ください。&lt;/li&gt;  &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt; &lt;/ul&gt;

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
        String status = "status_example"; // String | 決済状況で絞込 (未決済: unsettled, 完了: settled)
        String type = "type_example"; // String | 収支区分 (収入: income, 支出: expense)
        String startIssueDate = "startIssueDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endIssueDate = "endIssueDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String startDueDate = "startDueDate_example"; // String | 支払期日で絞込：開始日(yyyy-mm-dd)
        String endDueDate = "endDueDate_example"; // String | 支払期日で絞込：終了日(yyyy-mm-dd)
        String startRenewDate = "startRenewDate_example"; // String | +更新日で絞込：開始日(yyyy-mm-dd)
        String endRenewDate = "endRenewDate_example"; // String | +更新日で絞込：終了日(yyyy-mm-dd)
        Integer offset = 56; // Integer | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最大: 100) 
        String registeredFrom = "registeredFrom_example"; // String | 取引登録元アプリで絞込（me: 本APIを叩くアプリ自身から登録した取引のみ）
        String accruals = "accruals_example"; // String | 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する）
        try {
            DealsIndexResponse result = apiInstance.getDeals(companyId, partnerId, accountItemId, partnerCode, status, type, startIssueDate, endIssueDate, startDueDate, endDueDate, startRenewDate, endRenewDate, offset, limit, registeredFrom, accruals);
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
 **offset** | **Integer**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最大: 100)  | [optional]
 **registeredFrom** | **String**| 取引登録元アプリで絞込（me: 本APIを叩くアプリ自身から登録した取引のみ） | [optional] [enum: me]
 **accruals** | **String**| 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する） | [optional] [enum: without, with]

### Return type

[**DealsIndexResponse**](DealsIndexResponse.md)

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


## updateDeal

> DealsResponse updateDeal(id, parameters)

取引（収入／支出）の更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引（収入／支出）を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt;  &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt; &lt;li&gt;credit_card : クレジットカード&lt;/li&gt; &lt;li&gt;wallet : 現金&lt;/li&gt; &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;receipt_ids : 証憑ファイルID&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;本APIでは支払行(payments)の操作ができません。支払行の作成・更新・削除APIをご利用ください。&lt;/li&gt; &lt;li&gt;本APIでは+更新行(renews)の操作ができません。+更新行の作成・更新・削除APIをご利用ください。&lt;/li&gt;  &lt;li&gt;本APIでは収入／支出の切替えができません。既存の取引を削除後、再度作成してください。&lt;/li&gt;  &lt;li&gt;本APIで取引を更新すると、消費税の計算方法は必ず内税方式が選択されます。&lt;/li&gt;  &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/ul&gt;

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
        UpdateDealParams parameters = new UpdateDealParams(); // UpdateDealParams | 取引（収入／支出）の更新
        try {
            DealsResponse result = apiInstance.updateDeal(id, parameters);
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
 **parameters** | [**UpdateDealParams**](UpdateDealParams.md)| 取引（収入／支出）の更新 | [optional]

### Return type

[**DealsResponse**](DealsResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |

