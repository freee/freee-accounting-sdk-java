

# DealDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID | 
**amount** | **Integer** | 金額（税込で指定してください） | 
**description** | **String** | 備考 |  [optional]
**entrySide** | [**EntrySideEnum**](#EntrySideEnum) | 貸借(貸方: credit, 借方: debit) | 
**id** | **Integer** | +更新の明細行ID | 
**itemId** | **Integer** | 品目ID |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**segment1TagId** | **Integer** | セグメント１ID |  [optional]
**segment2TagId** | **Integer** | セグメント２ID |  [optional]
**segment3TagId** | **Integer** | セグメント３ID |  [optional]
**tagIds** | **List&lt;Integer&gt;** |  | 
**taxCode** | **Integer** | 税区分コード | 
**vat** | **Integer** | 消費税額（指定しない場合は自動で計算されます） | 



## Enum: EntrySideEnum

Name | Value
---- | -----
CREDIT | &quot;credit&quot;
DEBIT | &quot;debit&quot;



