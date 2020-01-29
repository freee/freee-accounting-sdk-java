

# CreateDealParamsDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxCode** | **Integer** | 税区分コード |  [optional]
**taxId** | **Integer** | 税区分ID（廃止予定。上記tax_codeを使用してください。tax_code, tax_idはどちらかの指定が必須です。） |  [optional]
**accountItemId** | **Integer** | 勘定科目ID | 
**amount** | **Integer** | 取引金額（税込で指定してください） | 
**itemId** | **Integer** | 品目ID |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**tagIds** | **List&lt;Integer&gt;** | メモタグID |  [optional]
**segment1TagId** | **Integer** | セグメント１ID |  [optional]
**segment2TagId** | **Integer** | セグメント２ID |  [optional]
**segment3TagId** | **Integer** | セグメント３ID |  [optional]
**description** | **String** | 備考 |  [optional]
**vat** | **Integer** | 消費税額（指定しない場合は自動で計算されます） |  [optional]



