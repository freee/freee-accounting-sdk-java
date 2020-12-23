

# InvoiceUpdateParamsInvoiceContents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID |  [optional]
**description** | **String** | 備考 |  [optional]
**id** | **Integer** | 請求内容ID |  [optional]
**itemId** | **Integer** | 品目ID |  [optional]
**order** | **Integer** | 順序 | 
**qty** | **BigDecimal** | 数量 |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**segment1TagId** | **Integer** | セグメント１ID |  [optional]
**segment2TagId** | **Integer** | セグメント２ID |  [optional]
**segment3TagId** | **Integer** | セグメント３ID |  [optional]
**tagIds** | **List&lt;Integer&gt;** |  |  [optional]
**taxCode** | **Integer** | 税区分コード |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | 行の種類 &lt;ul&gt; &lt;li&gt;normal、discountを指定する場合、account_item_id,tax_codeとunit_priceが必須となります。&lt;/li&gt; &lt;li&gt;normalを指定した場合、qtyが必須となります。&lt;/li&gt; &lt;/ul&gt; | 
**unit** | **String** | 単位 |  [optional]
**unitPrice** | **BigDecimal** | 単価 (tax_entry_method: inclusiveの場合は税込価格、tax_entry_method: exclusiveの場合は税抜価格となります) |  [optional]
**vat** | **Integer** | 消費税額 |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
NORMAL | &quot;normal&quot;
DISCOUNT | &quot;discount&quot;
TEXT | &quot;text&quot;



