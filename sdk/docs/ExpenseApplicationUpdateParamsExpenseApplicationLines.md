

# ExpenseApplicationUpdateParamsExpenseApplicationLines


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Integer** | 金額 |  [optional]
**description** | **String** | 内容 (250文字以内) |  [optional]
**expenseApplicationLineTemplateId** | **Integer** | 経費科目ID |  [optional]
**id** | **Long** | 経費申請の項目行ID: 既存項目行を更新する場合に指定します。IDを指定しない項目行は、新規行として扱われ追加されます。また、expense_application_linesに含まれない既存の項目行は削除されます。更新後も残したい行は、必ず経費申請の項目行IDを指定してexpense_application_linesに含めてください。 |  [optional]
**receiptId** | **Integer** | 証憑ファイルID（ファイルボックスのファイルID） |  [optional]
**transactionDate** | **String** | 日付 (yyyy-mm-dd) |  [optional]



