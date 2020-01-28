

# TrialPlResponseTrialPlBalances

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID(勘定科目の時のみ含まれる) |  [optional]
**accountItemName** | **String** | 勘定科目名(勘定科目の時のみ含まれる) |  [optional]
**partners** | [**List&lt;TrialBsResponseTrialBsPartners&gt;**](TrialBsResponseTrialBsPartners.md) | breakdown_display_type:partner, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**items** | [**List&lt;TrialBsResponseTrialBsItems&gt;**](TrialBsResponseTrialBsItems.md) | breakdown_display_type:item, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**sections** | [**List&lt;TrialPlResponseTrialPlSections&gt;**](TrialPlResponseTrialPlSections.md) | breakdown_display_type:section, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**accountCategoryId** | **Integer** | 勘定科目カテゴリーID(勘定科目カテゴリーの時のみ含まれる) |  [optional]
**accountCategoryName** | **String** | 勘定科目カテゴリー名(勘定科目カテゴリーの時のみ含まれる) |  [optional]
**totalLine** | **Boolean** | 合計行(勘定科目カテゴリー名の時のみ含まれる) |  [optional]
**hierarchyLevel** | **Integer** | 階層レベル |  [optional]
**parentAccountCategoryId** | **Integer** | 上位科目カテゴリーID(上層が存在する場合含まれる) |  [optional]
**parentAccountCategoryName** | **String** | 上位勘定科目カテゴリー名(上層が存在する場合含まれる) |  [optional]
**openingBalance** | **Integer** | 期首残高 |  [optional]
**debitAmount** | **Integer** | 借方金額 |  [optional]
**creditAmount** | **Integer** | 貸方金額 |  [optional]
**closingBalance** | **Integer** | 期末残高 |  [optional]
**compositionRatio** | [**BigDecimal**](BigDecimal.md) | 構成比 |  [optional]



