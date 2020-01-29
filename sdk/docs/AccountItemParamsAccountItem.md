

# AccountItemParamsAccountItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 勘定科目名 (30文字以内) | 
**shortcut** | **String** | ショートカット1 (20文字以内) |  [optional]
**shortcutNum** | **String** | ショートカット2(勘定科目コード)(20文字以内) |  [optional]
**taxName** | **String** | 税区分 | 
**groupName** | **String** | 決算書表示名 | 
**accountCategory** | **String** | 勘定科目カテゴリー | 
**correspondingIncomeName** | **String** | 収入取引相手勘定科目 | 
**correspondingExpenseName** | **String** | 支出取引相手勘定科目 | 
**accumulatedDepAccountItemName** | **String** | 減価償却累計額勘定科目 |  [optional]
**searchable** | **Integer** | 検索可能:2, 検索不可：3 |  [optional]
**items** | [**List&lt;AccountItemParamsAccountItemItems&gt;**](AccountItemParamsAccountItemItems.md) | 品目 |  [optional]
**partners** | [**List&lt;AccountItemParamsAccountItemItems&gt;**](AccountItemParamsAccountItemItems.md) | 取引先 |  [optional]



