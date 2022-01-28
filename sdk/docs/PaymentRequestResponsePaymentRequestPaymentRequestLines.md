

# PaymentRequestResponsePaymentRequestPaymentRequestLines


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID | 
**amount** | **Integer** | 金額 | 
**description** | **String** | 内容 | 
**id** | **Long** | 支払依頼の項目行ID | 
**itemId** | **Integer** | 品目ID | 
**lineType** | [**LineTypeEnum**](#LineTypeEnum) | 行の種類 (deal_line: 支払依頼, withholding_tax: 源泉徴収税) | 
**sectionId** | **Integer** | 部門ID | 
**segment1TagId** | **Long** | セグメント１ID。セグメント１が使用可能なプランの時のみレスポンスに含まれます。 |  [optional]
**segment2TagId** | **Long** | セグメント２ID。セグメント２が使用可能なプランの時のみレスポンスに含まれます。 |  [optional]
**segment3TagId** | **Long** | セグメント３ID。セグメント３が使用可能なプランの時のみレスポンスに含まれます。 |  [optional]
**tagIds** | **List&lt;Integer&gt;** | メモタグID | 
**taxCode** | **Integer** | 税区分コード | 



## Enum: LineTypeEnum

Name | Value
---- | -----
DEAL_LINE | &quot;deal_line&quot;
WITHHOLDING_TAX | &quot;withholding_tax&quot;



