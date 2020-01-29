

# CreateExpenseApplicationParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **Integer** | 事業所ID | 
**title** | **String** | 申請タイトル | 
**issueDate** | **String** | 申請日 (yyyy-mm-dd) | 
**description** | **String** | 備考 |  [optional]
**editableOnWeb** | **Boolean** | 会計freeeのWeb画面から申請内容を編集可能（デフォルト: false）：falseの場合、Web上からの項目行の追加／削除・金額の編集が出来なくなります。APIでの編集は可能です。 |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**tagIds** | **List&lt;Integer&gt;** | メモタグID |  [optional]
**expenseApplicationLines** | [**List&lt;CreateExpenseApplicationParamsExpenseApplicationLines&gt;**](CreateExpenseApplicationParamsExpenseApplicationLines.md) |  | 



