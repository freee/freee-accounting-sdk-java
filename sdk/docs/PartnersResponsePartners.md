

# PartnersResponsePartners

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressAttributes** | [**PartnersResponseAddressAttributes**](PartnersResponseAddressAttributes.md) |  |  [optional]
**code** | **String** | 取引先コード | 
**companyId** | **Integer** | 事業所ID | 
**contactName** | **String** | 担当者 氏名 |  [optional]
**countryCode** | **String** | 地域（JP: 国内、ZZ:国外） |  [optional]
**defaultTitle** | **String** | 敬称（御中、様、(空白)の3つから選択） |  [optional]
**email** | **String** | 担当者 メールアドレス |  [optional]
**id** | **Integer** | 取引先ID | 
**longName** | **String** | 正式名称（255文字以内） |  [optional]
**name** | **String** | 取引先名 | 
**nameKana** | **String** | カナ名称（255文字以内） |  [optional]
**orgCode** | **Integer** | 事業所種別（null: 未設定、1: 法人、2: 個人） |  [optional]
**partnerBankAccountAttributesAccountName** | **String** | 受取人名（カナ） |  [optional]
**partnerBankAccountAttributesAccountNumber** | **String** | 口座番号 |  [optional]
**partnerBankAccountAttributesAccountType** | [**PartnerBankAccountAttributesAccountTypeEnum**](#PartnerBankAccountAttributesAccountTypeEnum) | 口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他) |  [optional]
**partnerBankAccountAttributesBankCode** | **String** | 銀行番号 |  [optional]
**partnerBankAccountAttributesBankName** | **String** | 銀行名 |  [optional]
**partnerBankAccountAttributesBankNameKana** | **String** | 銀行名（カナ） |  [optional]
**partnerBankAccountAttributesBranchCode** | **String** | 受取人名（カナ） |  [optional]
**partnerBankAccountAttributesBranchKana** | **String** | 支店名（カナ） |  [optional]
**partnerBankAccountAttributesBranchName** | **String** | 支店名 |  [optional]
**partnerBankAccountAttributesLongAccountName** | **String** | 受取人名 |  [optional]
**partnerDocSettingAttributesSendingMethod** | [**PartnerDocSettingAttributesSendingMethodEnum**](#PartnerDocSettingAttributesSendingMethodEnum) | 請求書送付方法(mail:メール、posting:郵送、mail_and_posting:メールと郵送) |  [optional]
**payerWalletableId** | **Integer** | 振込元口座ID（一括振込ファイル用）:（未設定の場合は、nullです。） |  [optional]
**phone** | **String** | 電話番号 |  [optional]
**shortcut1** | **String** | ショートカット1 (20文字以内) |  [optional]
**shortcut2** | **String** | ショートカット2 (20文字以内) |  [optional]
**transferFeeHandlingSide** | [**TransferFeeHandlingSideEnum**](#TransferFeeHandlingSideEnum) | 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee) |  [optional]



## Enum: PartnerBankAccountAttributesAccountTypeEnum

Name | Value
---- | -----
ORDINARY | &quot;ordinary&quot;
CHECKING | &quot;checking&quot;
EARMARKED | &quot;earmarked&quot;
SAVINGS | &quot;savings&quot;
OTHER | &quot;other&quot;



## Enum: PartnerDocSettingAttributesSendingMethodEnum

Name | Value
---- | -----
MAIL | &quot;mail&quot;
POSTING | &quot;posting&quot;
MAIN_AND_POSTING | &quot;main_and_posting&quot;



## Enum: TransferFeeHandlingSideEnum

Name | Value
---- | -----
PAYER | &quot;payer&quot;
PAYEE | &quot;payee&quot;



