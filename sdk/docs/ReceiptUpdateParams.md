

# ReceiptUpdateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **Integer** | 事業所ID | 
**description** | **String** | メモ (255文字以内) |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 書類の種類（receipt: 領収書、invoice: 請求書、other: その他）  |  [optional]
**invoiceRegistrationNumber** | **String** | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 インボイス制度適格請求書発行事業者登録番号 - 先頭T数字13桁の固定14桁の文字列 &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.invoice-kohyo.nta.go.jp/index.html\&quot;&gt;国税庁インボイス制度適格請求書発行事業者公表サイト&lt;/a&gt;  |  [optional]
**issueDate** | **String** | 取引日 (yyyy-mm-dd) | 
**qualifiedInvoice** | [**QualifiedInvoiceEnum**](#QualifiedInvoiceEnum) | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない）  |  [optional]
**receiptMetadatum** | [**DealReceiptMetadatum**](DealReceiptMetadatum.md) |  |  [optional]



## Enum: DocumentTypeEnum

Name | Value
---- | -----
RECEIPT | &quot;receipt&quot;
INVOICE | &quot;invoice&quot;
OTHER | &quot;other&quot;



## Enum: QualifiedInvoiceEnum

Name | Value
---- | -----
QUALIFIED | &quot;qualified&quot;
NOT_QUALIFIED | &quot;not_qualified&quot;



