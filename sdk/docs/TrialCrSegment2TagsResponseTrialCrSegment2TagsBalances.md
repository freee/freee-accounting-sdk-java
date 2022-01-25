

# TrialCrSegment2TagsResponseTrialCrSegment2TagsBalances


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountCategoryName** | **String** | 勘定科目カテゴリー名 |  [optional]
**accountGroupName** | **String** | 決算書表示名(account_item_display_type:group指定時に決算書表示名の時のみ含まれる) |  [optional]
**accountItemId** | **Integer** | 勘定科目ID(勘定科目の時のみ含まれる) |  [optional]
**accountItemName** | **String** | 勘定科目名(勘定科目の時のみ含まれる) |  [optional]
**closingBalance** | **Integer** | 期末残高 |  [optional]
**hierarchyLevel** | **Integer** | 階層レベル |  [optional]
**parentAccountCategoryName** | **String** | 上位勘定科目カテゴリー名(勘定科目カテゴリーの時のみ、上層が存在する場合含まれる) |  [optional]
**segment2Tags** | [**List&lt;TrialCrSegment2TagsResponseTrialCrSegment2TagsSegment2Tags&gt;**](TrialCrSegment2TagsResponseTrialCrSegment2TagsSegment2Tags.md) | セグメント2タグ |  [optional]
**totalLine** | **Boolean** | 合計行(勘定科目カテゴリーの時のみ含まれる) |  [optional]



