

# TransferParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toWalletableId** | **Integer** | 振替先口座ID | 
**toWalletableType** | [**ToWalletableTypeEnum**](#ToWalletableTypeEnum) | 振替先口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) | 
**fromWalletableId** | **Integer** | 振替元口座ID | 
**fromWalletableType** | [**FromWalletableTypeEnum**](#FromWalletableTypeEnum) | 振替元口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) | 
**amount** | **Integer** | 金額 | 
**date** | **String** | 振替日 (yyyy-mm-dd) | 
**companyId** | **Integer** | 事業所ID | 
**description** | **String** | 備考 |  [optional]



## Enum: ToWalletableTypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
CREDIT_CARD | &quot;credit_card&quot;
WALLET | &quot;wallet&quot;



## Enum: FromWalletableTypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
CREDIT_CARD | &quot;credit_card&quot;
WALLET | &quot;wallet&quot;



