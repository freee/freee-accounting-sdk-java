

# WalletableCreateResponseWalletable


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankId** | **Integer** | サービスID | 
**id** | **Integer** | 口座ID | 
**name** | **String** | 口座名, 最大255文字 | 
**type** | [**TypeEnum**](#TypeEnum) | 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) | 



## Enum: TypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
CREDIT_CARD | &quot;credit_card&quot;
WALLET | &quot;wallet&quot;



