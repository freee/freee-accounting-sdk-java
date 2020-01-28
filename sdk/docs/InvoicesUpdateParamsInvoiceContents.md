

# InvoicesUpdateParamsInvoiceContents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 請求内容ID |  [optional]
**order** | **Integer** | 順序 | 
**type** | [**TypeEnum**](#TypeEnum) | 行の種類 | 
**qty** | [**BigDecimal**](BigDecimal.md) | 数量 |  [optional]
**unit** | **String** | 単位 |  [optional]
**unitPrice** | [**BigDecimal**](BigDecimal.md) | 単価 (tax_entry_method: inclusiveの場合は税込価格、tax_entry_method: exclusiveの場合は税抜価格となります) |  [optional]
**vat** | **Integer** | 消費税額 |  [optional]
**description** | **String** | 備考 |  [optional]
**accountItemId** | **Integer** | 勘定科目ID |  [optional]
**taxCode** | **Integer** | 税区分ID |  [optional]
**itemId** | **Integer** | 品目ID |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**tagIds** | **List&lt;Integer&gt;** |  |  [optional]
**segment1TagId** | **Integer** | セグメント１ID |  [optional]
**segment2TagId** | **Integer** | セグメント２ID |  [optional]
**segment3TagId** | **Integer** | セグメント３ID |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
NORMAL | &quot;normal&quot;
DISCOUNT | &quot;discount&quot;
TEXT | &quot;text&quot;



