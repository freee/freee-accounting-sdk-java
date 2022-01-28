

# TrialBsThreeYearsResponseTrialBsThreeYears


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemDisplayType** | [**AccountItemDisplayTypeEnum**](#AccountItemDisplayTypeEnum) | 勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる） |  [optional]
**adjustment** | [**AdjustmentEnum**](#AdjustmentEnum) | 決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる） |  [optional]
**approvalFlowStatus** | [**ApprovalFlowStatusEnum**](#ApprovalFlowStatusEnum) | 未承認を除く: without_in_progress (デフォルト), 全てのステータス: all(条件に指定した時のみ含まれる） |  [optional]
**balances** | [**List&lt;TrialBsThreeYearsResponseTrialBsThreeYearsBalances&gt;**](TrialBsThreeYearsResponseTrialBsThreeYearsBalances.md) |  | 
**breakdownDisplayType** | [**BreakdownDisplayTypeEnum**](#BreakdownDisplayTypeEnum) | 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag）(条件に指定した時のみ含まれる） |  [optional]
**companyId** | **Integer** | 事業所ID | 
**createdAt** | **String** | 作成日時 |  [optional]
**endDate** | **String** | 発生日で絞込：終了日(yyyy-mm-dd)(条件に指定した時のみ含まれる） |  [optional]
**endMonth** | **Integer** | 発生月で絞込：終了会計月(1-12)(条件に指定した時のみ含まれる） |  [optional]
**fiscalYear** | **Integer** | 会計年度(条件に指定した時、または条件に月、日条件がない時のみ含まれる） |  [optional]
**itemId** | **Integer** | 品目ID(条件に指定した時のみ含まれる） |  [optional]
**partnerCode** | **String** | 取引先コード(条件に指定した時のみ含まれる） |  [optional]
**partnerId** | **Integer** | 取引先ID(条件に指定した時のみ含まれる） |  [optional]
**sectionId** | **Integer** | 部門ID(条件に指定した時のみ含まれる） |  [optional]
**startDate** | **String** | 発生日で絞込：開始日(yyyy-mm-dd)(条件に指定した時のみ含まれる） |  [optional]
**startMonth** | **Integer** | 発生月で絞込：開始会計月(1-12)(条件に指定した時のみ含まれる） |  [optional]



## Enum: AccountItemDisplayTypeEnum

Name | Value
---- | -----
ACCOUNT_ITEM | &quot;account_item&quot;
GROUP | &quot;group&quot;



## Enum: AdjustmentEnum

Name | Value
---- | -----
ONLY | &quot;only&quot;
WITHOUT | &quot;without&quot;



## Enum: ApprovalFlowStatusEnum

Name | Value
---- | -----
WITHOUT_IN_PROGRESS | &quot;without_in_progress&quot;
ALL | &quot;all&quot;



## Enum: BreakdownDisplayTypeEnum

Name | Value
---- | -----
PARTNER | &quot;partner&quot;
ITEM | &quot;item&quot;
SECTION | &quot;section&quot;
ACCOUNT_ITEM | &quot;account_item&quot;
SEGMENT_1_TAG | &quot;segment_1_tag&quot;
SEGMENT_2_TAG | &quot;segment_2_tag&quot;
SEGMENT_3_TAG | &quot;segment_3_tag&quot;



