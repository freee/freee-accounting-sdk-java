

# WalletTxnParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** | 取引金額 | 
**balance** | **Long** | 残高 (銀行口座等) |  [optional]
**companyId** | **Integer** | 事業所ID | 
**date** | **String** | 取引日 (yyyy-mm-dd) | 
**description** | **String** | 取引内容 |  [optional]
**entrySide** | [**EntrySideEnum**](#EntrySideEnum) | 入金／出金 (入金: income, 出金: expense) | 
**walletableId** | **Integer** | 口座ID | 
**walletableType** | [**WalletableTypeEnum**](#WalletableTypeEnum) | 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) | 



## Enum: EntrySideEnum

Name | Value
---- | -----
INCOME | &quot;income&quot;
EXPENSE | &quot;expense&quot;



## Enum: WalletableTypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
CREDIT_CARD | &quot;credit_card&quot;
WALLET | &quot;wallet&quot;



