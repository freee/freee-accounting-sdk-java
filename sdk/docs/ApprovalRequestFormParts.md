

# ApprovalRequestFormParts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotation** | **String** | 追加説明 |  [optional]
**id** | **Integer** | 項目ID | 
**label** | **String** | 項目名 |  [optional]
**maxAmount** | **Integer** | 上限金額 |  [optional]
**minAmount** | **Integer** | 下限金額 |  [optional]
**order** | **Integer** | 順序 |  [optional]
**required** | **Boolean** | 必須かどうか |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | 項目種別 (title: 申請タイトル, single_line: 自由記述形式 1行, multi_line: 自由記述形式 複数行, select: プルダウン, date: 日付, amount: 金額, receipt: 添付ファイル) |  [optional]
**values** | [**List&lt;ApprovalRequestFormValues&gt;**](ApprovalRequestFormValues.md) | 選択項目 |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TITLE | &quot;title&quot;
SINGLE_LINE | &quot;single_line&quot;
MULTI_LINE | &quot;multi_line&quot;
SELECT | &quot;select&quot;
DATE | &quot;date&quot;
AMOUNT | &quot;amount&quot;
RECEIPT | &quot;receipt&quot;



