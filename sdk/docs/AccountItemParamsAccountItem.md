

# AccountItemParamsAccountItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountCategoryId** | **Integer** | 勘定科目カテゴリーID Selectablesフォーム用選択項目情報エンドポイント(account_groups.account_category_id)で取得可能です | 
**accumulatedDepAccountItemId** | **Integer** | 減価償却累計額勘定科目ID（法人のみ利用可能） |  [optional]
**correspondingExpenseId** | **Integer** | 支出取引相手勘定科目ID | 
**correspondingIncomeId** | **Integer** | 収入取引相手勘定科目ID | 
**groupName** | **String** | 決算書表示名（小カテゴリー） Selectablesフォーム用選択項目情報エンドポイント(account_groups.name)で取得可能です | 
**items** | [**List&lt;AccountItemParamsAccountItemItems&gt;**](AccountItemParamsAccountItemItems.md) | 品目 |  [optional]
**name** | **String** | 勘定科目名 (30文字以内) | 
**partners** | [**List&lt;AccountItemParamsAccountItemItems&gt;**](AccountItemParamsAccountItemItems.md) | 取引先 |  [optional]
**searchable** | **Integer** | 検索可能:2, 検索不可：3(登録時未指定の場合は2で登録されます。更新時未指定の場合はsearchableは変更されません。) |  [optional]
**shortcut** | **String** | ショートカット1 (20文字以内) |  [optional]
**shortcutNum** | **String** | ショートカット2(勘定科目コード)(20文字以内) |  [optional]
**taxCode** | **Integer** | 税区分コード | 



