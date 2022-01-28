

# AccountItemsResponseAccountItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountCategory** | **String** | 勘定科目カテゴリー | 
**accountCategoryId** | **Integer** | 勘定科目のカテゴリーID | 
**available** | **Boolean** | 勘定科目の使用設定（true: 使用する、false: 使用しない） | 
**categories** | **List&lt;String&gt;** |  | 
**correspondingExpenseId** | **Integer** | 支出取引相手勘定科目ID |  [optional]
**correspondingExpenseName** | **String** | 支出取引相手勘定科目名 |  [optional]
**correspondingIncomeId** | **Integer** | 収入取引相手勘定科目ID |  [optional]
**correspondingIncomeName** | **String** | 収入取引相手勘定科目名 |  [optional]
**defaultTaxCode** | **Integer** | デフォルト設定がされている税区分コード | 
**defaultTaxId** | **Integer** | デフォルト設定がされている税区分ID |  [optional]
**groupName** | **String** | 決算書表示名（小カテゴリー） |  [optional]
**id** | **Integer** | 勘定科目ID | 
**name** | **String** | 勘定科目名 (30文字以内) | 
**shortcut** | **String** | ショートカット1 (20文字以内) |  [optional]
**shortcutNum** | **String** | ショートカット2(勘定科目コード) (20文字以内) |  [optional]
**taxCode** | **Integer** | 税区分コード | 
**walletableId** | **Integer** | 口座ID | 



