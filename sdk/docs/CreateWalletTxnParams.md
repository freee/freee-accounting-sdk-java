

# CreateWalletTxnParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entrySide** | [**EntrySideEnum**](#EntrySideEnum) | 入金／出金 (入金: income, 出金: expense) | 
**description** | **String** | 備考 |  [optional]
**amount** | **Integer** | 取引金額 | 
**walletableId** | **Integer** | 口座ID | 
**walletableType** | [**WalletableTypeEnum**](#WalletableTypeEnum) | 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) | 
**date** | **String** | 取引日 (yyyy-mm-dd) | 
**companyId** | **Integer** | 事業所ID | 
**balance** | **Integer** | 残高 (銀行口座等) |  [optional]



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



