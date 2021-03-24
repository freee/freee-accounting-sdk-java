

# PartnerCreateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressAttributes** | [**PartnerCreateParamsAddressAttributes**](PartnerCreateParamsAddressAttributes.md) |  |  [optional]
**code** | **String** | 取引先コード（取引先コードの利用を有効にしている場合は、codeの指定は必須です。） |  [optional]
**companyId** | **Integer** | 事業所ID | 
**contactName** | **String** | 担当者 氏名 (255文字以内) |  [optional]
**countryCode** | [**CountryCodeEnum**](#CountryCodeEnum) | 地域（JP: 国内、ZZ:国外） |  [optional]
**defaultTitle** | **String** | 敬称（御中、様、(空白)の3つから選択） |  [optional]
**email** | **String** | 担当者 メールアドレス (255文字以内) |  [optional]
**invoicePaymentTermAttributes** | [**PartnerCreateParamsInvoicePaymentTermAttributes**](PartnerCreateParamsInvoicePaymentTermAttributes.md) |  |  [optional]
**longName** | **String** | 正式名称（255文字以内） |  [optional]
**name** | **String** | 取引先名 (255文字以内) | 
**nameKana** | **String** | カナ名称（255文字以内） |  [optional]
**orgCode** | [**OrgCodeEnum**](#OrgCodeEnum) | 事業所種別（null: 未設定、1: 法人、2: 個人） |  [optional]
**partnerBankAccountAttributes** | [**PartnerCreateParamsPartnerBankAccountAttributes**](PartnerCreateParamsPartnerBankAccountAttributes.md) |  |  [optional]
**partnerDocSettingAttributes** | [**PartnerCreateParamsPartnerDocSettingAttributes**](PartnerCreateParamsPartnerDocSettingAttributes.md) |  |  [optional]
**payerWalletableId** | **Integer** | 振込元口座ID（一括振込ファイル用）:（walletableのtypeが&#39;bank_account&#39;のidのみ指定できます。また、未設定にする場合は、nullを指定してください。） |  [optional]
**paymentTermAttributes** | [**PartnerCreateParamsInvoicePaymentTermAttributes**](PartnerCreateParamsInvoicePaymentTermAttributes.md) |  |  [optional]
**phone** | **String** | 電話番号 |  [optional]
**shortcut1** | **String** | ショートカット１ (255文字以内) |  [optional]
**shortcut2** | **String** | ショートカット２ (255文字以内) |  [optional]
**transferFeeHandlingSide** | [**TransferFeeHandlingSideEnum**](#TransferFeeHandlingSideEnum) | 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee) |  [optional]



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



