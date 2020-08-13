

# Deal

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Integer** | 金額 | 
**companyId** | **Integer** | 事業所ID | 
**details** | [**List&lt;DealCreateResponseDealDetails&gt;**](DealCreateResponseDealDetails.md) | 取引の明細行 |  [optional]
**dueAmount** | **Integer** | 支払金額 |  [optional]
**dueDate** | **String** | 支払期日 (yyyy-mm-dd) |  [optional]
**id** | **Integer** | 取引ID | 
**issueDate** | **String** | 発生日 (yyyy-mm-dd) | 
**partnerCode** | **String** | 取引先コード |  [optional]
**partnerId** | **Integer** | 取引先ID | 
**payments** | [**List&lt;DealCreateResponseDealPayments&gt;**](DealCreateResponseDealPayments.md) | 取引の支払行 |  [optional]
**receipts** | [**List&lt;DealReceipts&gt;**](DealReceipts.md) | 証憑ファイル |  [optional]
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



