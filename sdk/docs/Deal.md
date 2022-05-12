

# Deal


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** | 金額 | 
**companyId** | **Integer** | 事業所ID | 
**details** | [**List&lt;DealDetails&gt;**](DealDetails.md) | 取引の明細行 |  [optional]
**dueAmount** | **Integer** | 支払残額 |  [optional]
**dueDate** | **String** | 支払期日 (yyyy-mm-dd) |  [optional]
**id** | **Integer** | 取引ID | 
**issueDate** | **String** | 発生日 (yyyy-mm-dd) | 
**partnerCode** | **String** | 取引先コード |  [optional]
**partnerId** | **Integer** | 取引先ID | 
**payments** | [**List&lt;DealPayments&gt;**](DealPayments.md) | 取引の支払行 |  [optional]
**receipts** | [**List&lt;DealReceipts&gt;**](DealReceipts.md) | 証憑ファイル（ファイルボックスのファイル） |  [optional]
**refNumber** | **String** | 管理番号 |  [optional]
**renews** | [**List&lt;DealRenews&gt;**](DealRenews.md) | 取引の+更新行 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | 決済状況 (未決済: unsettled, 完了: settled) | 
**type** | [**TypeEnum**](#TypeEnum) | 収支区分 (収入: income, 支出: expense) |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
UNSETTLED | &quot;unsettled&quot;
SETTLED | &quot;settled&quot;



## Enum: TypeEnum

Name | Value
---- | -----
INCOME | &quot;income&quot;
EXPENSE | &quot;expense&quot;



