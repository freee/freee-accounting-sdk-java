

# WalletableCreateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankId** | **Integer** | サービスID |  [optional]
**companyId** | **Integer** | 事業所ID | 
**groupName** | **String** | 決算書表示名（小カテゴリー）　例：売掛金, 受取手形, 未収入金（法人のみ）, 買掛金, 支払手形, 未払金, 預り金, 前受金 |  [optional]
**name** | **String** | 口座名 (255文字以内) | 
**type** | [**TypeEnum**](#TypeEnum) | 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） | 



## Enum: TypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
CREDIT_CARD | &quot;credit_card&quot;
WALLET | &quot;wallet&quot;



