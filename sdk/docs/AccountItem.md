

# AccountItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 勘定科目ID | 
**name** | **String** | 勘定科目名 (30文字以内) | 
**companyId** | **Integer** | 事業所ID | 
**taxCode** | **Integer** | 税区分コード | 
**accountCategoryId** | **Integer** | 勘定科目のカテゴリーコード | 
**shortcut** | **String** | ショートカット1 (20文字以内) |  [optional]
**shortcutNum** | **String** | ショートカット2(勘定科目コード) (20文字以内) |  [optional]
**correspondingTypeExpense** | **Integer** | 支出取引相手勘定科目ID | 
**correspondingTypeIncome** | **Integer** | 収入取引相手勘定科目ID | 
**searchable** | **Integer** | 検索可能:2, 検索不可：3 | 
**accumulatedDepAccountItemName** | **String** | 減価償却累計額勘定科目 |  [optional]
**items** | [**List&lt;AccountItemItems&gt;**](AccountItemItems.md) |  |  [optional]
**partners** | [**List&lt;AccountItemPartners&gt;**](AccountItemPartners.md) |  |  [optional]
**available** | **Boolean** | 勘定科目の使用設定（true: 使用する、false: 使用しない） | 
**walletableId** | **Integer** | 口座ID | 



