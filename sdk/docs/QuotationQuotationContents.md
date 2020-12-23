

# QuotationQuotationContents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID | 
**accountItemName** | **String** | 勘定科目名 | 
**amount** | **Integer** | 金額 | 
**description** | **String** | 備考 | 
**id** | **Integer** | 見積内容ID | 
**itemId** | **Integer** | 品目ID | 
**itemName** | **String** | 品目 | 
**order** | **Integer** | 順序 | 
**qty** | **BigDecimal** | 数量 | 
**reducedVat** | **Boolean** | 軽減税率税区分（true: 対象、false: 対象外） | 
**sectionId** | **Integer** | 部門ID | 
**sectionName** | **String** | 部門 | 
**segment1TagId** | **Integer** | セグメント１ID |  [optional]
**segment1TagName** | **String** | セグメント１ID |  [optional]
**segment2TagId** | **Integer** | セグメント２ID |  [optional]
**segment2TagName** | **String** | セグメント２ |  [optional]
**segment3TagId** | **Integer** | セグメント３ID |  [optional]
**segment3TagName** | **String** | セグメント３ |  [optional]
**tagIds** | **List&lt;Integer&gt;** |  | 
**tagNames** | **List&lt;String&gt;** |  | 
**taxCode** | **Integer** | 税区分コード | 
**type** | [**TypeEnum**](#TypeEnum) | 行の種類 | 
**unit** | **String** | 単位 | 
**unitPrice** | **BigDecimal** | 単価 | 
**vat** | **Integer** | 消費税額 | 



## Enum: TypeEnum

Name | Value
---- | -----
NORMAL | &quot;normal&quot;
DISCOUNT | &quot;discount&quot;
TEXT | &quot;text&quot;



