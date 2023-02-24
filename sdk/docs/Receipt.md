

# Receipt


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **String** | 作成日時（ISO8601形式） | 
**description** | **String** | メモ |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 書類の種類（receipt: 領収書、invoice: 請求書、other: その他）  |  [optional]
**fileSrc** | **String** | ファイルのダウンロードURL（freeeにログインした状態でのみ閲覧可能です。） &lt;br&gt; &lt;br&gt; file_srcは廃止予定の属性になります。&lt;br&gt; file_srcに替わり、証憑ファイルのダウンロード APIをご利用ください。&lt;br&gt; 証憑ファイルのダウンロードAPIを利用することで、以下のようになります。 &lt;ul&gt;   &lt;li&gt;アプリケーション利用者はfreee APIアプリケーションにログインしていれば、証憑ダウンロード毎にfreeeに改めてログインすることなくファイルが参照できるようになります。&lt;/li&gt; &lt;/ul&gt; | 
**id** | **Integer** | ファイルボックス（証憑ファイル）ID | 
**invoiceRegistrationNumber** | **String** | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 インボイス制度適格請求書発行事業者登録番号 - 先頭T数字13桁の固定14桁の文字列 &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.invoice-kohyo.nta.go.jp/index.html\&quot;&gt;国税庁インボイス制度適格請求書発行事業者公表サイト&lt;/a&gt;  |  [optional]
**issueDate** | **String** | 発生日 |  [optional]
**mimeType** | **String** | MIMEタイプ | 
**origin** | [**OriginEnum**](#OriginEnum) | アップロード元種別 | 
**qualifiedInvoice** | [**QualifiedInvoiceEnum**](#QualifiedInvoiceEnum) | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない）  |  [optional]
**receiptMetadatum** | [**DealReceiptMetadatum**](DealReceiptMetadatum.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | ステータス(confirmed:確認済み、deleted:削除済み、ignored:無視) | 
**user** | [**DealUser**](DealUser.md) |  | 



## Enum: DocumentTypeEnum

Name | Value
---- | -----
RECEIPT | &quot;receipt&quot;
INVOICE | &quot;invoice&quot;
OTHER | &quot;other&quot;



## Enum: OriginEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
WEB | &quot;web&quot;
MOBILE_CAMERA | &quot;mobile_camera&quot;
MOBILE_ALBUM | &quot;mobile_album&quot;
SCANSNAP | &quot;scansnap&quot;
SCANNABLE | &quot;scannable&quot;
DROPBOX | &quot;dropbox&quot;
MAIL | &quot;mail&quot;
SAFETY_CONTACT_FILE | &quot;safety_contact_file&quot;
PUBLIC_API | &quot;public_api&quot;



## Enum: QualifiedInvoiceEnum

Name | Value
---- | -----
QUALIFIED | &quot;qualified&quot;
NOT_QUALIFIED | &quot;not_qualified&quot;



## Enum: StatusEnum

Name | Value
---- | -----
CONFIRMED | &quot;confirmed&quot;
DELETED | &quot;deleted&quot;
IGNORED | &quot;ignored&quot;



