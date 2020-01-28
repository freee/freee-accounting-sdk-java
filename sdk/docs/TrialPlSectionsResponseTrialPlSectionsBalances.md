

# TrialPlSectionsResponseTrialPlSectionsBalances

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID(勘定科目の時のみ含まれる) |  [optional]
**accountItemName** | **String** | 勘定科目名(勘定科目の時のみ含まれる) |  [optional]
**sections** | [**List&lt;TrialPlSectionsResponseTrialPlSectionsSections&gt;**](TrialPlSectionsResponseTrialPlSectionsSections.md) | 部門(勘定科目の時のみ含まれる) |  [optional]
**accountCategoryId** | **Integer** | 勘定科目カテゴリーID(勘定科目カテゴリーの時のみ含まれる) |  [optional]
**accountCategoryName** | **String** | 勘定科目カテゴリー名(勘定科目カテゴリーの時のみ含まれる) |  [optional]
**totalLine** | **Boolean** | 合計行(勘定科目カテゴリー名の時のみ含まれる) |  [optional]
**hierarchyLevel** | **Integer** | 階層レベル |  [optional]
**parentAccountCategoryId** | **Integer** | 上位科目カテゴリーID(上層が存在する場合含まれる) |  [optional]
**parentAccountCategoryName** | **String** | 上位勘定科目カテゴリー名(上層が存在する場合含まれる) |  [optional]
**closingBalance** | **Integer** | 期末残高 |  [optional]



