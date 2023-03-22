

# ExpenseApplicationUpdateParamsExpenseApplicationLines1


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Integer** | 金額 |  [optional]
**description** | **String** | 内容 (250文字以内) |  [optional]
**expenseApplicationLineTemplateId** | **Integer** | 経費科目ID |  [optional]
**id** | **Long** | 経費申請の明細行ID: 既存明細行を更新する場合に指定します。IDを指定しない明細行は、新規行として扱われ追加されます。また、expense_application_linesに含まれない既存の明細行は削除されます。更新後も残したい行は、必ず経費申請の明細行IDを指定してexpense_application_linesに含めてください。 |  [optional]



