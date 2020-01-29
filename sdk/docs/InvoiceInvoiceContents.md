

# InvoiceInvoiceContents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 請求内容ID | 
**order** | **Integer** | 順序 | 
**type** | [**TypeEnum**](#TypeEnum) | 行の種類 | 
**qty** | [**BigDecimal**](BigDecimal.md) | 数量 | 
**unit** | **String** | 単位 | 
**unitPrice** | [**BigDecimal**](BigDecimal.md) | 単価 | 
**amount** | **Integer** | 金額 | 
**vat** | **Integer** | 消費税額 | 
**reducedVat** | **Boolean** | 軽減税率税区分（true: 対象、false: 対象外） | 
**description** | **String** | 備考 | 
**accountItemId** | **Integer** | 勘定科目ID | 
**accountItemName** | **String** | 勘定科目名 | 
**taxCode** | **Integer** | 税区分コード | 
**itemId** | **Integer** | 品目ID | 
**itemName** | **String** | 品目 | 
**sectionId** | **Integer** | 部門ID | 
**sectionName** | **String** | 部門 | 
**tagIds** | **List&lt;Integer&gt;** |  | 
**tagNames** | **List&lt;String&gt;** |  | 
**segment1TagId** | **Integer** | セグメント１ID |  [optional]
**segment1TagName** | **String** | セグメント１ID |  [optional]
**segment2TagId** | **Integer** | セグメント２ID |  [optional]
**segment2TagName** | **String** | セグメント２ |  [optional]
**segment3TagId** | **Integer** | セグメント３ID |  [optional]
**segment3TagName** | **String** | セグメント３ |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
NORMAL | &quot;normal&quot;
DISCOUNT | &quot;discount&quot;
TEXT | &quot;text&quot;



