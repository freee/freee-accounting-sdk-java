# UsersApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsers**](UsersApi.md#getUsers) | **GET** api/1/users | 事業所に所属するユーザー一覧の取得
[**getUsersCapabilities**](UsersApi.md#getUsersCapabilities) | **GET** api/1/users/capabilities | ログインユーザーの権限の取得
[**getUsersMe**](UsersApi.md#getUsersMe) | **GET** api/1/users/me | ログインユーザー情報の取得
[**updateUser**](UsersApi.md#updateUser) | **PUT** api/1/users/me | ユーザー情報の更新



## getUsers

> InlineResponse20012 getUsers(companyId, limit)

事業所に所属するユーザー一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000)
        try {
            InlineResponse20012 result = apiInstance.getUsers(companyId, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsers");
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
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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


## getUsersCapabilities

> InlineResponse20013 getUsersCapabilities(companyId)

ログインユーザーの権限の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        try {
            InlineResponse20013 result = apiInstance.getUsersCapabilities(companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsersCapabilities");
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

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | &lt;p&gt;レスポンスの各キーは以下の項目と対応しています。&lt;/p&gt; &lt;p&gt;詳細は &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/210265673\&quot;&gt;https://support.freee.co.jp/hc/ja/articles/210265673&lt;/a&gt; を参照してください。&lt;/p&gt; &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th style&#x3D;\&quot;padding: 5px\&quot;&gt;キー&lt;/th&gt;       &lt;th style&#x3D;\&quot;padding: 5px\&quot;&gt;対応する項目&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;wallet_txns&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;自動で経理 / 取得した明細&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;deals&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;取引&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;transfers&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;口座振替&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;docs&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;見積書・納品書・請求書・領収書・発注書&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;doc_postings&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;(請求書の)郵送&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;receipts&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;ファイルボックス&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;receipt_stream_editor&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;連続取引登録&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;expense_applications&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;経費精算&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;spreadsheets&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;エクセルインポート&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;payment_requests&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;支払依頼&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;request_forms&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;申請フォーム&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;approval_requests&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;各種申請&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;収益 / 費用レポート&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_income_expense&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;損益レポート&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_receivables&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;入金管理レポート&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_payables&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;支払管理レポート(一括振込ファイルを含む)&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_cash_balance&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;現預金レポート/資金繰りレポート&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_crosstabs&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;集計表&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_general_ledgers&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;総勘定元帳&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_pl&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;損益計算書(月次推移/試算表)&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_bs&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;貸借対照表(月次推移/試算表)&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_journals&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;仕訳帳&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_managements_planning&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;経営プランニング&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;reports_managements_navigation&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;経営ナビゲーション&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;manual_journals&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;振替伝票&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;fixed_assets&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;固定資産台帳&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;inventory_refreshes&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;在庫棚卸&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;biz_allocations&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;家事按分&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;payment_records&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;支払調書&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;annual_reports&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;決算書、確定申告書類&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;tax_reports&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;消費税区分別表・消費税集計表&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;consumption_entries&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;消費税申告書&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;tax_return&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;連携用データ&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;account_item_statements&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;勘定科目内訳明細書&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;month_end&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;月締め&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;year_end&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;年度締め&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;walletables&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;口座&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;companies&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;事業所の設定&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;invitations&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;メンバー招待&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;sign_in_logs&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;ログイン履歴&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;backups&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;バックアップ&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;opening_balances&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;開始残高の設定&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;system_conversion&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;乗り換え設定&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;resets&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;リセット&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;partners&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;取引先&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;items&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;品目&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;sections&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;部門&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;tags&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;メモタグ&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;account_items&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;勘定科目&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;taxes&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;税区分&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;user_matchers&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;自動登録ルール&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;deal_templates&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;取引テンプレート&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;manual_journal_templates&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;振替伝票テンプレート&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;cost_allocations&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;部門配賦&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;approval_flow_routes&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;承認経路&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;expense_application_templates&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;経費科目&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;workflows&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;仕訳承認&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;oauth_applications&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;アプリ利用&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;oauth_authorizations&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;アプリ認可&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;bank_accountant_staff_users&lt;/td&gt;       &lt;td style&#x3D;\&quot;padding: 5px\&quot;&gt;アドバイザー事業所内でのメンバー管理&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |


## getUsersMe

> MeResponse getUsersMe(companies, advisor)

ログインユーザー情報の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        Boolean companies = true; // Boolean | 取得情報にユーザーが所属する事業所一覧を含める
        Boolean advisor = true; // Boolean | 取得情報に事業がアドバイザー事象所の場合は事業所毎の一意なプロフィールIDを含める
        try {
            MeResponse result = apiInstance.getUsersMe(companies, advisor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsersMe");
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
 **companies** | **Boolean**| 取得情報にユーザーが所属する事業所一覧を含める | [optional] [enum: true, false]
 **advisor** | **Boolean**| 取得情報に事業がアドバイザー事象所の場合は事業所毎の一意なプロフィールIDを含める | [optional] [enum: true, false]

### Return type

[**MeResponse**](MeResponse.md)

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


## updateUser

> UserResponse updateUser(userParams)

ユーザー情報の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        UserParams userParams = new UserParams(); // UserParams | ユーザー情報の更新
        try {
            UserResponse result = apiInstance.updateUser(userParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUser");
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
 **userParams** | [**UserParams**](UserParams.md)| ユーザー情報の更新 | [optional]

### Return type

[**UserResponse**](UserResponse.md)

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

