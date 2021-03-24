

# Walletable


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankId** | **Integer** | サービスID | 
**id** | **Integer** | 口座ID | 
**lastBalance** | **Integer** | 同期残高 |  [optional]
**name** | **String** | 口座名 (255文字以内) | 
**type** | [**TypeEnum**](#TypeEnum) | 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) | 
**walletableBalance** | **Integer** | 登録残高 |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
CREDIT_CARD | &quot;credit_card&quot;
WALLET | &quot;wallet&quot;



