

# ExpenseApplicationUpdateParamsPurchaseLines


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expenseApplicationLines** | [**List&lt;ExpenseApplicationUpdateParamsExpenseApplicationLines1&gt;**](ExpenseApplicationUpdateParamsExpenseApplicationLines1.md) | 明細行一覧（配列） |  [optional]
**id** | **Long** | 経費申請の申請行ID: 既存申請行を更新する場合に指定します。IDを指定しない申請行は、新規行として扱われ追加されます。また、purchase_linesに含まれない既存の申請行は削除されます。更新後も残したい行は、必ず経費申請の申請行IDを指定してpurchase_linesに含めてください。 |  [optional]
**receiptId** | **Integer** | ファイルボックス（証憑ファイル）ID |  [optional]
**transactionDate** | **String** | 日付 (yyyy-mm-dd) |  [optional]



