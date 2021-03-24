# TrialBalanceApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrialBs**](TrialBalanceApi.md#getTrialBs) | **GET** api/1/reports/trial_bs | 貸借対照表の取得
[**getTrialBsThreeYears**](TrialBalanceApi.md#getTrialBsThreeYears) | **GET** api/1/reports/trial_bs_three_years | 貸借対照表(３期間比較)の取得
[**getTrialBsTwoYears**](TrialBalanceApi.md#getTrialBsTwoYears) | **GET** api/1/reports/trial_bs_two_years | 貸借対照表(前年比較)の取得
[**getTrialPl**](TrialBalanceApi.md#getTrialPl) | **GET** api/1/reports/trial_pl | 損益計算書の取得
[**getTrialPlSections**](TrialBalanceApi.md#getTrialPlSections) | **GET** api/1/reports/trial_pl_sections | 損益計算書(部門比較)の取得
[**getTrialPlThreeYears**](TrialBalanceApi.md#getTrialPlThreeYears) | **GET** api/1/reports/trial_pl_three_years | 損益計算書(３期間比較)の取得
[**getTrialPlTwoYears**](TrialBalanceApi.md#getTrialPlTwoYears) | **GET** api/1/reports/trial_pl_two_years | 損益計算書(前年比較)の取得



## getTrialBs

> TrialBsResponse getTrialBs(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment)

貸借対照表の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の貸借対照表を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;opening_balance : 期首残高 &lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;debit_amount : 借方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;credit_amount:  貸方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;composition_ratio : 構成比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt;  &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_bs?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&amp;amp;breakdown_display_type&#x3D;partner&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_bs&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;breakdown_display_type&amp;quot; : &amp;quot;partner&amp;quot;,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1000,         &amp;quot;account_item_name&amp;quot; : &amp;quot;現金&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;流動資産&amp;quot;,         &amp;quot;opening_balance&amp;quot; : 100000,         &amp;quot;debit_amount&amp;quot; : 50000,         &amp;quot;credit_amount&amp;quot; : 20000,         &amp;quot;closing_balance&amp;quot; : 130000,         &amp;quot;composition_ratio&amp;quot; : 0.25         &amp;quot;partners&amp;quot; : [{           &amp;quot;id&amp;quot; : 123,           &amp;quot;name&amp;quot; : &amp;quot;freee&amp;quot;,           &amp;quot;opening_balance&amp;quot; : 100000,           &amp;quot;debit_amount&amp;quot; : 50000,           &amp;quot;credit_amount&amp;quot; : 20000,           &amp;quot;closing_balance&amp;quot; : 130000,           &amp;quot;composition_ratio&amp;quot; : 0.25           },         ...         ]       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TrialBalanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TrialBalanceApi apiInstance = new TrialBalanceApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "accountItemDisplayType_example"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）
        String breakdownDisplayType = "breakdownDisplayType_example"; // String | 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        String adjustment = "adjustment_example"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）
        try {
            TrialBsResponse result = apiInstance.getTrialBs(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialBs");
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
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12) | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12) | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group） | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） | [optional] [enum: only, without]

### Return type

[**TrialBsResponse**](TrialBsResponse.md)

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
| **429** |  |  -  |
| **500** |  |  -  |


## getTrialBsThreeYears

> TrialBsThreeYearsResponse getTrialBsThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment)

貸借対照表(３期間比較)の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の貸借対照表(３期間比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;two_years_before_closing_balance:  前々年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;year_on_year : 前年比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt;  &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_bs_three_years?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_bs_three_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1000,         &amp;quot;account_item_name&amp;quot; : &amp;quot;現金&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;流動資産&amp;quot;,         &amp;quot;two_year_before_closing_balance&amp;quot; : 50000,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TrialBalanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TrialBalanceApi apiInstance = new TrialBalanceApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "accountItemDisplayType_example"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）
        String breakdownDisplayType = "breakdownDisplayType_example"; // String | 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        String adjustment = "adjustment_example"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）
        try {
            TrialBsThreeYearsResponse result = apiInstance.getTrialBsThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialBsThreeYears");
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
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12) | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12) | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group） | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） | [optional] [enum: only, without]

### Return type

[**TrialBsThreeYearsResponse**](TrialBsThreeYearsResponse.md)

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
| **429** |  |  -  |
| **500** |  |  -  |


## getTrialBsTwoYears

> TrialBsTwoYearsResponse getTrialBsTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment)

貸借対照表(前年比較)の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の貸借対照表(前年比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt;  &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_bs_two_years?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_bs_two_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1000,         &amp;quot;account_item_name&amp;quot; : &amp;quot;現金&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;流動資産&amp;quot;,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85        },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TrialBalanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TrialBalanceApi apiInstance = new TrialBalanceApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "accountItemDisplayType_example"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）
        String breakdownDisplayType = "breakdownDisplayType_example"; // String | 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        String adjustment = "adjustment_example"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）
        try {
            TrialBsTwoYearsResponse result = apiInstance.getTrialBsTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialBsTwoYears");
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
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12) | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12) | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group） | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） | [optional] [enum: only, without]

### Return type

[**TrialBsTwoYearsResponse**](TrialBsTwoYearsResponse.md)

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
| **429** |  |  -  |
| **500** |  |  -  |


## getTrialPl

> TrialPlResponse getTrialPl(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation)

損益計算書の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;opening_balance : 期首残高 &lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;debit_amount : 借方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;credit_amount:  貸方金額 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;composition_ratio : 構成比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&amp;amp;breakdown_display_type&#x3D;partner&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;breakdown_display_type&amp;quot; : &amp;quot;partner&amp;quot;,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;opening_balance&amp;quot; : 100000,         &amp;quot;debit_amount&amp;quot; : 50000,         &amp;quot;credit_amount&amp;quot; : 20000,         &amp;quot;closing_balance&amp;quot; : 130000,         &amp;quot;composition_ratio&amp;quot; : 0.25         &amp;quot;partners&amp;quot; : [{           &amp;quot;id&amp;quot; : 123,           &amp;quot;name&amp;quot; : &amp;quot;freee&amp;quot;,           &amp;quot;opening_balance&amp;quot; : 100000,           &amp;quot;debit_amount&amp;quot; : 50000,           &amp;quot;credit_amount&amp;quot; : 20000,           &amp;quot;closing_balance&amp;quot; : 130000,           &amp;quot;composition_ratio&amp;quot; : 0.25           },         ...         ]       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TrialBalanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TrialBalanceApi apiInstance = new TrialBalanceApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "accountItemDisplayType_example"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）
        String breakdownDisplayType = "breakdownDisplayType_example"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "adjustment_example"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）
        String costAllocation = "costAllocation_example"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）
        try {
            TrialPlResponse result = apiInstance.getTrialPl(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialPl");
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
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12) | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12) | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group） | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without） | [optional] [enum: only, without]

### Return type

[**TrialPlResponse**](TrialPlResponse.md)

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
| **429** |  |  -  |
| **500** |  |  -  |


## getTrialPlSections

> TrialPlSectionsResponse getTrialPlSections(companyId, sectionIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, costAllocation)

損益計算書(部門比較)の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書(部門比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;個人向けのプレミアムプラン、法人向けのビジネスプラン以上で利用可能なAPIです。対象外のプランでは401エラーを返却します。&lt;/li&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl_section?company_id&#x3D;1&amp;amp;section_ids&#x3D;1,2,3&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt;&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl_sections&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;section_ids&amp;quot; : &amp;quot;1,2,3&amp;quot;,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;closing_balance&amp;quot; : 1000000,         &amp;quot;sections&amp;quot; : [{           &amp;quot;id&amp;quot;: 1           &amp;quot;name&amp;quot;: &amp;quot;営業部&amp;quot;,           &amp;quot;closing_balance&amp;quot; : 100000         },         {           &amp;quot;id&amp;quot;: 2           &amp;quot;name&amp;quot;: &amp;quot;広報部&amp;quot;,           &amp;quot;closing_balance&amp;quot; : 200000         },         {           &amp;quot;id&amp;quot;: 3           &amp;quot;name&amp;quot;: &amp;quot;人事部&amp;quot;,           &amp;quot;closing_balance&amp;quot; : 300000         },         ...         ]       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TrialBalanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TrialBalanceApi apiInstance = new TrialBalanceApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String sectionIds = "sectionIds_example"; // String | 出力する部門の指定（半角数字のidを半角カンマ区切りスペースなしで指定してください）
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "accountItemDisplayType_example"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）
        String breakdownDisplayType = "breakdownDisplayType_example"; // String | 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        String adjustment = "adjustment_example"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）
        String costAllocation = "costAllocation_example"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）
        try {
            TrialPlSectionsResponse result = apiInstance.getTrialPlSections(companyId, sectionIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, costAllocation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialPlSections");
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
 **sectionIds** | **String**| 出力する部門の指定（半角数字のidを半角カンマ区切りスペースなしで指定してください） |
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12) | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12) | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group） | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without） | [optional] [enum: only, without]

### Return type

[**TrialPlSectionsResponse**](TrialPlSectionsResponse.md)

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
| **429** |  |  -  |
| **500** |  |  -  |


## getTrialPlThreeYears

> TrialPlThreeYearsResponse getTrialPlThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation)

損益計算書(３期間比較)の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書(３期間比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;two_years_before_closing_balance:  前々年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;year_on_year : 前年比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl_three_years?company_id&#x3D;1&amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl_three_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;two_year_before_closing_balance&amp;quot; : 50000,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85       },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TrialBalanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TrialBalanceApi apiInstance = new TrialBalanceApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "accountItemDisplayType_example"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）
        String breakdownDisplayType = "breakdownDisplayType_example"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "adjustment_example"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）
        String costAllocation = "costAllocation_example"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）
        try {
            TrialPlThreeYearsResponse result = apiInstance.getTrialPlThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialPlThreeYears");
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
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12) | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12) | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group） | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without） | [optional] [enum: only, without]

### Return type

[**TrialPlThreeYearsResponse**](TrialPlThreeYearsResponse.md)

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
| **429** |  |  -  |
| **500** |  |  -  |


## getTrialPlTwoYears

> TrialPlTwoYearsResponse getTrialPlTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation)

損益計算書(前年比較)の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の損益計算書(前年比較)を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt; &lt;p&gt;created_at : 作成日時&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;account_item_name : 勘定科目名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;hierarchy_level: 階層レベル&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;parent_account_category_name: 上位勘定科目カテゴリー名&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;last_year_closing_balance:  前年度期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;closing_balance : 期末残高 &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;year_on_year : 前年比&lt;/p&gt; &lt;/li&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;会計年度が指定されない場合、現在の会計年度がデフォルトとなります。&lt;/li&gt; &lt;li&gt;絞り込み条件の日付と、月または年度は同時に指定することはできません。&lt;/li&gt; &lt;li&gt;up_to_dateがfalseの場合、残高の集計が完了していません。最新の集計結果を確認したい場合は、時間を空けて再度取得する必要があります。&lt;/li&gt; &lt;li&gt;配賦仕訳の絞り込み（cost_allocation）は法人向けのベーシックプラン以上で利用可能です。&lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_4\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/reports/trial_pl_two_years?company_id&#x3D;1&amp;amp;fiscal_year&#x3D;2017&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;{   &amp;quot;trial_pl_two_years&amp;quot; :     {       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;fiscal_year&amp;quot; : 2017,       &amp;quot;created_at&amp;quot; : &amp;quot;2018-05-01 12:00:50&amp;quot       &amp;quot;balances&amp;quot; : [{         &amp;quot;account_item_id&amp;quot; : 1500,         &amp;quot;account_item_name&amp;quot; : &amp;quot;売上高&amp;quot;,         &amp;quot;hierarchy_level&amp;quot; : 2,         &amp;quot;account_category_name&amp;quot; : &amp;quot;営業収益&amp;quot;,         &amp;quot;last_year_closing_balance&amp;quot; : 25000,         &amp;quot;closing_balance&amp;quot; : 100000,         &amp;quot;year_on_year&amp;quot; : 0.85        },       ...       ]     } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TrialBalanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TrialBalanceApi apiInstance = new TrialBalanceApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "accountItemDisplayType_example"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）
        String breakdownDisplayType = "breakdownDisplayType_example"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "adjustment_example"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）
        String costAllocation = "costAllocation_example"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）
        try {
            TrialPlTwoYearsResponse result = apiInstance.getTrialPlTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialPlTwoYears");
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
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12) | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12) | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group） | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without） | [optional] [enum: only, without]

### Return type

[**TrialPlTwoYearsResponse**](TrialPlTwoYearsResponse.md)

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
| **429** |  |  -  |
| **500** |  |  -  |

