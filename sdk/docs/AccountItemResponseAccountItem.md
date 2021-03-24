

# AccountItemResponseAccountItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountCategory** | **String** | 勘定科目カテゴリー | 
**accountCategoryId** | **Integer** | 勘定科目のカテゴリーID | 
**accumulatedDepAccountItemId** | **Integer** | 減価償却累計額勘定科目ID（法人のみ利用可能） |  [optional]
**accumulatedDepAccountItemName** | **String** | 減価償却累計額勘定科目（法人のみ利用可能） |  [optional]
**available** | **Boolean** | 勘定科目の使用設定（true: 使用する、false: 使用しない） | 
**companyId** | **Integer** | 事業所ID | 
**correspondingExpenseId** | **Integer** | 支出取引相手勘定科目ID |  [optional]
**correspondingExpenseName** | **String** | 支出取引相手勘定科目名 |  [optional]
**correspondingIncomeId** | **Integer** | 収入取引相手勘定科目ID |  [optional]
**correspondingIncomeName** | **String** | 収入取引相手勘定科目名 |  [optional]
**groupName** | **String** | 決算書表示名（小カテゴリー） |  [optional]
**id** | **Integer** | 勘定科目ID | 
**items** | [**List&lt;AccountItemResponseAccountItemItems&gt;**](AccountItemResponseAccountItemItems.md) |  |  [optional]
**name** | **String** | 勘定科目名 (30文字以内) | 
**partners** | [**List&lt;AccountItemResponseAccountItemPartners&gt;**](AccountItemResponseAccountItemPartners.md) |  |  [optional]
**searchable** | **Integer** | 検索可能:2, 検索不可：3 | 
**shortcut** | **String** | ショートカット1 (20文字以内) |  [optional]
**shortcutNum** | **String** | ショートカット2(勘定科目コード) (20文字以内) |  [optional]
**taxCode** | **Integer** | 税区分コード | 
**walletableId** | **Integer** | 口座ID | 



