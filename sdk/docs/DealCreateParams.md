

# DealCreateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **Integer** | 事業所ID | 
**details** | [**List&lt;DealCreateParamsDetails&gt;**](DealCreateParamsDetails.md) |  | 
**dueDate** | **String** | 支払期日(yyyy-mm-dd) |  [optional]
**issueDate** | **String** | 発生日 (yyyy-mm-dd) | 
**partnerCode** | **String** | 取引先コード |  [optional]
**partnerId** | **Integer** | 取引先ID |  [optional]
**payments** | [**List&lt;DealCreateParamsPayments&gt;**](DealCreateParamsPayments.md) | 支払行一覧（配列）：未指定の場合、未決済の取引を作成します。 |  [optional]
**receiptIds** | **List&lt;Integer&gt;** | 証憑ファイルID（ファイルボックスのファイルID）（配列） |  [optional]
**refNumber** | **String** | 管理番号 |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | 収支区分 (収入: income, 支出: expense) | 



## Enum: TypeEnum

Name | Value
---- | -----
INCOME | &quot;income&quot;
EXPENSE | &quot;expense&quot;



