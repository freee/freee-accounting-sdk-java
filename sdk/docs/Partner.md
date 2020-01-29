

# Partner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 取引先ID | 
**code** | **String** | 取引先コード | 
**companyId** | **Integer** | 事業所ID | 
**name** | **String** | 取引先名 | 
**shortcut1** | **String** | ショートカット1 (20文字以内) |  [optional]
**shortcut2** | **String** | ショートカット2 (20文字以内) |  [optional]
**longName** | **String** | 正式名称（255文字以内） |  [optional]
**nameKana** | **String** | カナ名称（255文字以内） |  [optional]
**defaultTitle** | **String** | 敬称（御中、様、(空白)の3つから選択） |  [optional]
**phone** | **String** | 電話番号 |  [optional]
**contactName** | **String** | 担当者 氏名 |  [optional]
**email** | **String** | 担当者 メールアドレス |  [optional]
**addressAttributesZipcode** | **String** | 郵便番号 |  [optional]
**addressAttributesPrefectureCode** | **Integer** | 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 |  [optional]
**addressAttributesStreetName1** | **String** | 市区町村・番地 |  [optional]
**addressAttributesStreetName2** | **String** | 建物名・部屋番号など |  [optional]
**partnerDocSettingAttributesSendingMethod** | [**PartnerDocSettingAttributesSendingMethodEnum**](#PartnerDocSettingAttributesSendingMethodEnum) | 請求書送付方法(mail:メール、posting:郵送、mail_and_posting:メールと郵送) |  [optional]
**partnerBankAccountAttributesBankName** | **String** | 銀行名 |  [optional]
**partnerBankAccountAttributesBankNameKana** | **String** | 銀行名（カナ） |  [optional]
**partnerBankAccountAttributesBankCode** | **String** | 銀行番号 |  [optional]
**partnerBankAccountAttributesBranchName** | **String** | 支店名 |  [optional]
**partnerBankAccountAttributesBranchKana** | **String** | 支店名（カナ） |  [optional]
**partnerBankAccountAttributesBranchCode** | **String** | 受取人名（カナ） |  [optional]
**partnerBankAccountAttributesAccountType** | [**PartnerBankAccountAttributesAccountTypeEnum**](#PartnerBankAccountAttributesAccountTypeEnum) | 口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他) |  [optional]
**partnerBankAccountAttributesAccountNumber** | **String** | 口座番号 |  [optional]
**partnerBankAccountAttributesAccountName** | **String** | 受取人名（カナ） |  [optional]
**partnerBankAccountAttributesLongAccountName** | **String** | 受取人名 |  [optional]



## Enum: PartnerDocSettingAttributesSendingMethodEnum

Name | Value
---- | -----
MAIL | &quot;mail&quot;
POSTING | &quot;posting&quot;
MAIN_AND_POSTING | &quot;main_and_posting&quot;



## Enum: PartnerBankAccountAttributesAccountTypeEnum

Name | Value
---- | -----
ORDINARY | &quot;ordinary&quot;
CHECKING | &quot;checking&quot;
EARMARKED | &quot;earmarked&quot;
SAVINGS | &quot;savings&quot;
OTHER | &quot;other&quot;



