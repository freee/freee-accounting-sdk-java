

# ManualJournalDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 貸借行ID | 
**entrySide** | [**EntrySideEnum**](#EntrySideEnum) | 貸借(貸方: credit, 借方: debit) | 
**accountItemId** | **Integer** | 勘定科目ID | 
**taxCode** | **Integer** | 税区分ID | 
**partnerId** | **Integer** | 取引先ID | 
**partnerName** | **String** | 取引先名 | 
**partnerCode** | **String** | 取引先コード |  [optional]
**partnerLongName** | **String** | 正式名称（255文字以内） | 
**itemId** | **Integer** | 品目ID | 
**itemName** | **String** | 品目 | 
**sectionId** | **Integer** | 部門ID | 
**sectionName** | **String** | 部門 | 
**tagIds** | **List&lt;Integer&gt;** |  | 
**tagNames** | **List&lt;String&gt;** |  | 
**segment1TagId** | **Integer** | セグメント１ID |  [optional]
**segment1TagName** | **Integer** | セグメント１ID |  [optional]
**segment2TagId** | **Integer** | セグメント２ID |  [optional]
**segment2TagName** | **Integer** | セグメント２ |  [optional]
**segment3TagId** | **Integer** | セグメント３ID |  [optional]
**segment3TagName** | **Integer** | セグメント３ |  [optional]
**amount** | **Integer** | 金額（税込で指定してください） | 
**vat** | **Integer** | 消費税額（指定しない場合は自動で計算されます） | 
**description** | **String** | 備考 | 



## Enum: EntrySideEnum

Name | Value
---- | -----
CREDIT | &quot;credit&quot;
DEBIT | &quot;debit&quot;



