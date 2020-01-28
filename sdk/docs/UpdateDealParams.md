

# UpdateDealParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issueDate** | **String** | 発生日 (yyyy-mm-dd) | 
**type** | [**TypeEnum**](#TypeEnum) | 収支区分 (収入: income, 支出: expense) | 
**companyId** | **Integer** | 事業所ID | 
**dueDate** | **String** | 支払期日(yyyy-mm-dd) |  [optional]
**partnerId** | **Integer** | 取引先ID |  [optional]
**partnerCode** | **String** | 取引先コード |  [optional]
**refNumber** | **String** | 管理番号 |  [optional]
**details** | [**List&lt;UpdateDealParamsDetails&gt;**](UpdateDealParamsDetails.md) |  | 
**receiptIds** | **List&lt;Integer&gt;** | 証憑ファイルID（配列） |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
INCOME | &quot;income&quot;
EXPENSE | &quot;expense&quot;



