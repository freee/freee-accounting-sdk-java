

# DealCreateResponseDealDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID | 
**amount** | **Integer** | 取引金額 | 
**description** | **String** | 備考 |  [optional]
**entrySide** | [**EntrySideEnum**](#EntrySideEnum) | 貸借（貸方: credit, 借方: debit） | 
**id** | **Integer** | 取引行ID | 
**itemId** | **Integer** | 品目ID |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**segment1TagId** | **Integer** | セグメント１ID |  [optional]
**segment2TagId** | **Integer** | セグメント２ID |  [optional]
**segment3TagId** | **Integer** | セグメント３ID |  [optional]
**tagIds** | **List&lt;Integer&gt;** | メモタグID |  [optional]
**taxCode** | **Integer** | 税区分コード | 
**vat** | **Integer** | 消費税額 | 



## Enum: EntrySideEnum

Name | Value
---- | -----
CREDIT | &quot;credit&quot;
DEBIT | &quot;debit&quot;



