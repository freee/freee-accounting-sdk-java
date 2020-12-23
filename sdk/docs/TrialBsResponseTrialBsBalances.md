

# TrialBsResponseTrialBsBalances

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountCategoryName** | **String** | 勘定科目カテゴリー名 |  [optional]
**accountGroupName** | **String** | 決算書表示名(account_item_display_type:group指定時に決算書表示名の時のみ含まれる) |  [optional]
**accountItemId** | **Integer** | 勘定科目ID(勘定科目の時のみ含まれる) |  [optional]
**accountItemName** | **String** | 勘定科目名(勘定科目の時のみ含まれる) |  [optional]
**closingBalance** | **Integer** | 期末残高 |  [optional]
**compositionRatio** | **BigDecimal** | 構成比 |  [optional]
**creditAmount** | **Integer** | 貸方金額 |  [optional]
**debitAmount** | **Integer** | 借方金額 |  [optional]
**hierarchyLevel** | **Integer** | 階層レベル |  [optional]
**items** | [**List&lt;TrialBsResponseTrialBsItems&gt;**](TrialBsResponseTrialBsItems.md) | breakdown_display_type:item, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**openingBalance** | **Integer** | 期首残高 |  [optional]
**parentAccountCategoryName** | **String** | 上位勘定科目カテゴリー名(勘定科目カテゴリーの時のみ、上層が存在する場合含まれる) |  [optional]
**partners** | [**List&lt;TrialBsResponseTrialBsPartners&gt;**](TrialBsResponseTrialBsPartners.md) | breakdown_display_type:partner, account_item_display_type:account_item指定時のみ含まれる |  [optional]
**totalLine** | **Boolean** | 合計行(勘定科目カテゴリーの時のみ含まれる) |  [optional]



