

# ExpenseApplicationCreateParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **Integer** | 事業所ID | 
**description** | **String** | 備考 (10000文字以内) |  [optional]
**editableOnWeb** | **Boolean** | 会計freeeのWeb画面から申請内容を編集可能（デフォルト: false）：falseの場合、Web上からの項目行の追加／削除・金額の編集が出来なくなります。APIでの編集は可能です。 |  [optional]
**expenseApplicationLines** | [**List&lt;ExpenseApplicationCreateParamsExpenseApplicationLines&gt;**](ExpenseApplicationCreateParamsExpenseApplicationLines.md) |  | 
**issueDate** | **String** | 申請日 (yyyy-mm-dd) | 
**sectionId** | **Integer** | 部門ID |  [optional]
**tagIds** | **List&lt;Integer&gt;** | メモタグID |  [optional]
**title** | **String** | 申請タイトル (250文字以内) | 



