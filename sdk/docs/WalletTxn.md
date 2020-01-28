

# WalletTxn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 明細ID | 
**companyId** | **Integer** | 事業所ID | 
**date** | **String** | 取引日(yyyy-mm-dd) | 
**amount** | **Integer** | 取引金額 | 
**dueAmount** | **Integer** | 未決済金額 | 
**balance** | **Integer** | 残高(銀行口座等) | 
**entrySide** | [**EntrySideEnum**](#EntrySideEnum) | 入金／出金 (入金: income, 出金: expense) | 
**walletableType** | [**WalletableTypeEnum**](#WalletableTypeEnum) | 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) | 
**walletableId** | **Integer** | 口座ID | 
**description** | **String** | 備考 | 
**status** | **Integer** | 明細のステータス（消込待ち: 1, 消込済み: 2, 無視: 3, 消込中: 4） | 



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



