

# Transfer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** | 金額 | 
**companyId** | **Integer** | 事業所ID | 
**date** | **String** | 振替日 (yyyy-mm-dd) | 
**description** | **String** | 備考 | 
**fromWalletableId** | **Integer** | 振替元口座ID | 
**fromWalletableType** | [**FromWalletableTypeEnum**](#FromWalletableTypeEnum) | 振替元口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) | 
**id** | **Integer** | 取引(振替)ID | 
**toWalletableId** | **Integer** | 振替先口座ID | 
**toWalletableType** | [**ToWalletableTypeEnum**](#ToWalletableTypeEnum) | 振替先口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) | 



## Enum: FromWalletableTypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
WALLET | &quot;wallet&quot;
CREDIT_CARD | &quot;credit_card&quot;



## Enum: ToWalletableTypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
WALLET | &quot;wallet&quot;
CREDIT_CARD | &quot;credit_card&quot;



