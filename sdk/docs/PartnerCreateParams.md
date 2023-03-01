

# PartnerCreateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressAttributes** | [**PartnerCreateParamsAddressAttributes**](PartnerCreateParamsAddressAttributes.md) |  |  [optional]
**code** | **String** | 取引先コード（取引先コードの利用を有効にしている場合は、codeの指定は必須です。ただし重複は不可。） |  [optional]
**companyId** | **Integer** | 事業所ID | 
**contactName** | **String** | 担当者 氏名 (255文字以内) |  [optional]
**countryCode** | [**CountryCodeEnum**](#CountryCodeEnum) | 地域（JP: 国内、ZZ:国外）、指定しない場合JPになります。 |  [optional]
**defaultTitle** | **String** | 敬称（御中、様、(空白)の3つから選択） |  [optional]
**email** | **String** | 担当者 メールアドレス (255文字以内) |  [optional]
**invoicePaymentTermAttributes** | [**PartnerCreateParamsInvoicePaymentTermAttributes**](PartnerCreateParamsInvoicePaymentTermAttributes.md) |  |  [optional]
**invoiceRegistrationNumber** | **String** | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 インボイス制度適格請求書発行事業者登録番号 - 先頭T数字13桁の固定14桁の文字列 &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.invoice-kohyo.nta.go.jp/index.html\&quot;&gt;国税庁インボイス制度適格請求書発行事業者公表サイト&lt;/a&gt;  |  [optional]
**longName** | **String** | 正式名称（255文字以内） |  [optional]
**name** | **String** | 取引先名 (255文字以内、重複不可) | 
**nameKana** | **String** | カナ名称（255文字以内） |  [optional]
**orgCode** | [**OrgCodeEnum**](#OrgCodeEnum) | 事業所種別（null: 未設定、1: 法人、2: 個人） |  [optional]
**partnerBankAccountAttributes** | [**PartnerCreateParamsPartnerBankAccountAttributes**](PartnerCreateParamsPartnerBankAccountAttributes.md) |  |  [optional]
**partnerDocSettingAttributes** | [**PartnerCreateParamsPartnerDocSettingAttributes**](PartnerCreateParamsPartnerDocSettingAttributes.md) |  |  [optional]
**payerWalletableId** | **Integer** | 振込元口座ID（一括振込ファイル用）:（walletableのtypeが&#39;bank_account&#39;のidのみ指定できます。また、未設定にする場合は、nullを指定してください。） |  [optional]
**paymentTermAttributes** | [**PartnerCreateParamsPaymentTermAttributes**](PartnerCreateParamsPaymentTermAttributes.md) |  |  [optional]
**phone** | **String** | 電話番号 |  [optional]
**qualifiedInvoiceIssuer** | **Boolean** | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 インボイス制度適格請求書発行事業者（true: 対象事業者、false: 非対象事業者） &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.invoice-kohyo.nta.go.jp/index.html\&quot;&gt;国税庁インボイス制度適格請求書発行事業者公表サイト&lt;/a&gt;  |  [optional]
**shortcut1** | **String** | ショートカット１ (255文字以内) |  [optional]
**shortcut2** | **String** | ショートカット２ (255文字以内) |  [optional]
**transferFeeHandlingSide** | [**TransferFeeHandlingSideEnum**](#TransferFeeHandlingSideEnum) | 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)、指定しない場合payerになります。 |  [optional]



## Enum: CountryCodeEnum

Name | Value
---- | -----
JP | &quot;JP&quot;
ZZ | &quot;ZZ&quot;



## Enum: OrgCodeEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2



## Enum: TransferFeeHandlingSideEnum

Name | Value
---- | -----
PAYER | &quot;payer&quot;
PAYEE | &quot;payee&quot;



