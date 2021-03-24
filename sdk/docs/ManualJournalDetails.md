

# ManualJournalDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID | 
**amount** | **Integer** | 金額（税込で指定してください） | 
**description** | **String** | 備考 | 
**entrySide** | [**EntrySideEnum**](#EntrySideEnum) | 貸借(貸方: credit, 借方: debit) | 
**id** | **Long** | 貸借行ID | 
**itemId** | **Integer** | 品目ID | 
**itemName** | **String** | 品目 | 
**partnerCode** | **String** | 取引先コード |  [optional]
**partnerId** | **Integer** | 取引先ID | 
**partnerLongName** | **String** | 正式名称（255文字以内） | 
**partnerName** | **String** | 取引先名 | 
**sectionId** | **Integer** | 部門ID | 
**sectionName** | **String** | 部門 | 
**segment1TagId** | **Long** | セグメント１ID |  [optional]
**segment1TagName** | **Integer** | セグメント１ID |  [optional]
**segment2TagId** | **Long** | セグメント２ID |  [optional]
**segment2TagName** | **Integer** | セグメント２ |  [optional]
**segment3TagId** | **Long** | セグメント３ID |  [optional]
**segment3TagName** | **Integer** | セグメント３ |  [optional]
**tagIds** | **List&lt;Integer&gt;** |  | 
**tagNames** | **List&lt;String&gt;** |  | 
**taxCode** | **Integer** | 税区分コード | 
**vat** | **Integer** | 消費税額（指定しない場合は自動で計算されます） | 



## Enum: EntrySideEnum

Name | Value
---- | -----
CREDIT | &quot;credit&quot;
DEBIT | &quot;debit&quot;



