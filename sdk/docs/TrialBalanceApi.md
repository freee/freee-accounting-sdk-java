# TrialBalanceApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrialBs**](TrialBalanceApi.md#getTrialBs) | **GET** api/1/reports/trial_bs | 貸借対照表の取得
[**getTrialBsThreeYears**](TrialBalanceApi.md#getTrialBsThreeYears) | **GET** api/1/reports/trial_bs_three_years | 貸借対照表(３期間比較)の取得
[**getTrialBsTwoYears**](TrialBalanceApi.md#getTrialBsTwoYears) | **GET** api/1/reports/trial_bs_two_years | 貸借対照表(前年比較)の取得
[**getTrialCr**](TrialBalanceApi.md#getTrialCr) | **GET** api/1/reports/trial_cr | 製造原価報告書の取得
[**getTrialCrSections**](TrialBalanceApi.md#getTrialCrSections) | **GET** api/1/reports/trial_cr_sections | 製造原価報告書(部門比較)の取得
[**getTrialCrSegment1Tags**](TrialBalanceApi.md#getTrialCrSegment1Tags) | **GET** api/1/reports/trial_cr_segment_1_tags | 製造原価報告書(セグメント1比較)の取得
[**getTrialCrSegment2Tags**](TrialBalanceApi.md#getTrialCrSegment2Tags) | **GET** api/1/reports/trial_cr_segment_2_tags | 製造原価報告書(セグメント2比較)の取得
[**getTrialCrSegment3Tags**](TrialBalanceApi.md#getTrialCrSegment3Tags) | **GET** api/1/reports/trial_cr_segment_3_tags | 製造原価報告書(セグメント3比較)の取得
[**getTrialCrThreeYears**](TrialBalanceApi.md#getTrialCrThreeYears) | **GET** api/1/reports/trial_cr_three_years | 製造原価報告書(３期間比較)の取得
[**getTrialCrTwoYears**](TrialBalanceApi.md#getTrialCrTwoYears) | **GET** api/1/reports/trial_cr_two_years | 製造原価報告書(前年比較)の取得
[**getTrialPl**](TrialBalanceApi.md#getTrialPl) | **GET** api/1/reports/trial_pl | 損益計算書の取得
[**getTrialPlSections**](TrialBalanceApi.md#getTrialPlSections) | **GET** api/1/reports/trial_pl_sections | 損益計算書(部門比較)の取得
[**getTrialPlSegment1Tags**](TrialBalanceApi.md#getTrialPlSegment1Tags) | **GET** api/1/reports/trial_pl_segment_1_tags | 損益計算書(セグメント1比較)の取得
[**getTrialPlSegment2Tags**](TrialBalanceApi.md#getTrialPlSegment2Tags) | **GET** api/1/reports/trial_pl_segment_2_tags | 損益計算書(セグメント2比較)の取得
[**getTrialPlSegment3Tags**](TrialBalanceApi.md#getTrialPlSegment3Tags) | **GET** api/1/reports/trial_pl_segment_3_tags | 損益計算書(セグメント3比較)の取得
[**getTrialPlThreeYears**](TrialBalanceApi.md#getTrialPlThreeYears) | **GET** api/1/reports/trial_pl_three_years | 損益計算書(３期間比較)の取得
[**getTrialPlTwoYears**](TrialBalanceApi.md#getTrialPlTwoYears) | **GET** api/1/reports/trial_pl_two_years | 損益計算書(前年比較)の取得



## getTrialBs

> TrialBsResponse getTrialBs(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, approvalFlowStatus)

貸借対照表の取得

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
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialBsResponse result = apiInstance.getTrialBs(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, approvalFlowStatus);
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
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

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

> TrialBsThreeYearsResponse getTrialBsThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, approvalFlowStatus)

貸借対照表(３期間比較)の取得

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
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialBsThreeYearsResponse result = apiInstance.getTrialBsThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, approvalFlowStatus);
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
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

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

> TrialBsTwoYearsResponse getTrialBsTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, approvalFlowStatus)

貸借対照表(前年比較)の取得

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
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialBsTwoYearsResponse result = apiInstance.getTrialBsTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, approvalFlowStatus);
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
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

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


## getTrialCr

> TrialCrResponse getTrialCr(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

製造原価報告書の取得

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
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト), 全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialCrResponse result = apiInstance.getTrialCr(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialCr");
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
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト), 全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialCrResponse**](TrialCrResponse.md)

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


## getTrialCrSections

> TrialCrSectionsResponse getTrialCrSections(companyId, sectionIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, costAllocation, approvalFlowStatus)

製造原価報告書(部門比較)の取得

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
        String sectionIds = "sectionIds_example"; // String | 出力する部門の指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択の部門で比較できます）
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialCrSectionsResponse result = apiInstance.getTrialCrSections(companyId, sectionIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialCrSections");
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
 **sectionIds** | **String**| 出力する部門の指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択の部門で比較できます） |
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialCrSectionsResponse**](TrialCrSectionsResponse.md)

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


## getTrialCrSegment1Tags

> TrialCrSegment1TagsResponse getTrialCrSegment1Tags(companyId, segment1TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

製造原価報告書(セグメント1比較)の取得

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
        String segment1TagIds = "segment1TagIds_example"; // String | 出力するセグメント1タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます）
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialCrSegment1TagsResponse result = apiInstance.getTrialCrSegment1Tags(companyId, segment1TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialCrSegment1Tags");
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
 **segment1TagIds** | **String**| 出力するセグメント1タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） |
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialCrSegment1TagsResponse**](TrialCrSegment1TagsResponse.md)

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


## getTrialCrSegment2Tags

> TrialCrSegment2TagsResponse getTrialCrSegment2Tags(companyId, segment2TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

製造原価報告書(セグメント2比較)の取得

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
        String segment2TagIds = "segment2TagIds_example"; // String | 出力するセグメント2タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます）
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialCrSegment2TagsResponse result = apiInstance.getTrialCrSegment2Tags(companyId, segment2TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialCrSegment2Tags");
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
 **segment2TagIds** | **String**| 出力するセグメント2タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） |
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialCrSegment2TagsResponse**](TrialCrSegment2TagsResponse.md)

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


## getTrialCrSegment3Tags

> TrialCrSegment3TagsResponse getTrialCrSegment3Tags(companyId, segment3TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

製造原価報告書(セグメント3比較)の取得

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
        String segment3TagIds = "segment3TagIds_example"; // String | 出力するセグメント3タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます）
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialCrSegment3TagsResponse result = apiInstance.getTrialCrSegment3Tags(companyId, segment3TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialCrSegment3Tags");
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
 **segment3TagIds** | **String**| 出力するセグメント3タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） |
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialCrSegment3TagsResponse**](TrialCrSegment3TagsResponse.md)

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


## getTrialCrThreeYears

> TrialCrThreeYearsResponse getTrialCrThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

製造原価報告書(３期間比較)の取得

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
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト), 全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialCrThreeYearsResponse result = apiInstance.getTrialCrThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialCrThreeYears");
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
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト), 全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialCrThreeYearsResponse**](TrialCrThreeYearsResponse.md)

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


## getTrialCrTwoYears

> TrialCrTwoYearsResponse getTrialCrTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

製造原価報告書(前年比較)の取得

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
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト), 全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialCrTwoYearsResponse result = apiInstance.getTrialCrTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialCrTwoYears");
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
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト), 全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialCrTwoYearsResponse**](TrialCrTwoYearsResponse.md)

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

> TrialPlResponse getTrialPl(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

損益計算書の取得

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
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialPlResponse result = apiInstance.getTrialPl(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
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
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

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

> TrialPlSectionsResponse getTrialPlSections(companyId, sectionIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, costAllocation, approvalFlowStatus)

損益計算書(部門比較)の取得

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
        String sectionIds = "sectionIds_example"; // String | 出力する部門の指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択の部門で比較できます。）
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialPlSectionsResponse result = apiInstance.getTrialPlSections(companyId, sectionIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, costAllocation, approvalFlowStatus);
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
 **sectionIds** | **String**| 出力する部門の指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択の部門で比較できます。） |
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

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


## getTrialPlSegment1Tags

> TrialPlSegment1TagsResponse getTrialPlSegment1Tags(companyId, segment1TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

損益計算書(セグメント1比較)の取得

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
        String segment1TagIds = "segment1TagIds_example"; // String | 出力するセグメント1タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます）
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialPlSegment1TagsResponse result = apiInstance.getTrialPlSegment1Tags(companyId, segment1TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialPlSegment1Tags");
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
 **segment1TagIds** | **String**| 出力するセグメント1タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） |
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialPlSegment1TagsResponse**](TrialPlSegment1TagsResponse.md)

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


## getTrialPlSegment2Tags

> TrialPlSegment2TagsResponse getTrialPlSegment2Tags(companyId, segment2TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

損益計算書(セグメント2比較)の取得

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
        String segment2TagIds = "segment2TagIds_example"; // String | 出力するセグメント2タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます）
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialPlSegment2TagsResponse result = apiInstance.getTrialPlSegment2Tags(companyId, segment2TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialPlSegment2Tags");
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
 **segment2TagIds** | **String**| 出力するセグメント2タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） |
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialPlSegment2TagsResponse**](TrialPlSegment2TagsResponse.md)

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


## getTrialPlSegment3Tags

> TrialPlSegment3TagsResponse getTrialPlSegment3Tags(companyId, segment3TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

損益計算書(セグメント3比較)の取得

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
        String segment3TagIds = "segment3TagIds_example"; // String | 出力するセグメント3タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます）
        Integer fiscalYear = 56; // Integer | 会計年度
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialPlSegment3TagsResponse result = apiInstance.getTrialPlSegment3Tags(companyId, segment3TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrialBalanceApi#getTrialPlSegment3Tags");
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
 **segment3TagIds** | **String**| 出力するセグメント3タグの指定（半角数字のidを半角カンマ区切りスペースなしで指定してください。0を指定すると、未選択のセグメントで比較できます） |
 **fiscalYear** | **Integer**| 会計年度 | [optional]
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

### Return type

[**TrialPlSegment3TagsResponse**](TrialPlSegment3TagsResponse.md)

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

> TrialPlThreeYearsResponse getTrialPlThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

損益計算書(３期間比較)の取得

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
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialPlThreeYearsResponse result = apiInstance.getTrialPlThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
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
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

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

> TrialPlTwoYearsResponse getTrialPlTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus)

損益計算書(前年比較)の取得

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
        Integer startMonth = 56; // Integer | 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。
        Integer endMonth = 56; // Integer | 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。
        String startDate = "startDate_example"; // String | 発生日で絞込：開始日(yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 発生日で絞込：終了日(yyyy-mm-dd)
        String accountItemDisplayType = "account_item"; // String | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。
        String breakdownDisplayType = "partner"; // String | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます
        Integer partnerId = 56; // Integer | 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます）
        String partnerCode = "partnerCode_example"; // String | 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です）
        Integer itemId = 56; // Integer | 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます）
        Integer sectionId = 56; // Integer | 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます）
        String adjustment = "only"; // String | 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。
        String costAllocation = "only"; // String | 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。
        String approvalFlowStatus = "without_in_progress"; // String | 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)<br> 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。<br> 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。 
        try {
            TrialPlTwoYearsResponse result = apiInstance.getTrialPlTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);
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
 **startMonth** | **Integer**| 発生月で絞込：開始会計月(1-12)。指定されない場合、現在の会計年度の期首月が指定されます。 | [optional]
 **endMonth** | **Integer**| 発生月で絞込：終了会計月(1-12)(会計年度が10月始まりでstart_monthが11なら11, 12, 1, ... 9のいずれかを指定する)。指定されない場合、現在の会計年度の期末月が指定されます。 | [optional]
 **startDate** | **String**| 発生日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endDate** | **String**| 発生日で絞込：終了日(yyyy-mm-dd) | [optional]
 **accountItemDisplayType** | **String**| 勘定科目の表示（勘定科目: account_item, 決算書表示:group）。指定されない場合、勘定科目: account_itemが指定されます。 | [optional] [enum: account_item, group]
 **breakdownDisplayType** | **String**| 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag） ※勘定科目はaccount_item_display_typeが「group」の時のみ指定できます | [optional] [enum: partner, item, section, account_item, segment_1_tag, segment_2_tag, segment_3_tag]
 **partnerId** | **Integer**| 取引先IDで絞込（0を指定すると、取引先が未選択で絞り込めます） | [optional]
 **partnerCode** | **String**| 取引先コードで絞込（事業所設定で取引先コードの利用を有効にしている場合のみ利用可能です） | [optional]
 **itemId** | **Integer**| 品目IDで絞込（0を指定すると、品目が未選択で絞り込めます） | [optional]
 **sectionId** | **Integer**| 部門IDで絞込（0を指定すると、部門が未選択で絞り込めます） | [optional]
 **adjustment** | **String**| 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without）。指定されない場合、決算整理仕訳以外: withoutが指定されます。 | [optional] [enum: only, without]
 **costAllocation** | **String**| 配賦仕訳で絞込（配賦仕訳のみ：only,配賦仕訳以外：without）。指定されない場合、配賦仕訳を含む金額が返却されます。 | [optional] [enum: only, without]
 **approvalFlowStatus** | **String**| 承認ステータスで絞込 (未承認を除く: without_in_progress (デフォルト)、全てのステータス: all)&lt;br&gt; 個人: プレミアムプラン、法人: プロフェッショナルプラン以上で指定可能です。&lt;br&gt; 事業所の設定から仕訳承認フローの利用を有効にした場合に指定可能です。  | [optional] [enum: without_in_progress, all]

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

