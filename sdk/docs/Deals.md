

# Deals

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 取引ID | 
**companyId** | **Integer** | 事業所ID | 
**issueDate** | **String** | 発生日 (yyyy-mm-dd) | 
**dueDate** | **String** | 支払期日 (yyyy-mm-dd) |  [optional]
**amount** | **Integer** | 金額 | 
**dueAmount** | **Integer** | 支払金額 |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | 収支区分 (収入: income, 支出: expense) |  [optional]
**partnerId** | **Integer** | 取引先ID | 
**partnerCode** | **String** | 取引先コード |  [optional]
**refNumber** | **String** | 管理番号 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | 決済状況 (未決済: unsettled, 完了: settled) | 
**details** | [**List&lt;DealsDetails&gt;**](DealsDetails.md) | 取引の明細行 |  [optional]
**renews** | [**List&lt;DealsRenews&gt;**](DealsRenews.md) | 取引の+更新行 |  [optional]
**payments** | [**List&lt;DealsPayments&gt;**](DealsPayments.md) | 取引の支払行 |  [optional]
**receipts** | [**List&lt;Receipt&gt;**](Receipt.md) | 証憑ファイル |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
INCOME | &quot;income&quot;
EXPENSE | &quot;expense&quot;



## Enum: StatusEnum

Name | Value
---- | -----
UNSETTLED | &quot;unsettled&quot;
SETTLED | &quot;settled&quot;



