

# DealPayments


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** | 支払金額 | 
**date** | **String** | 支払日 | 
**fromWalletableId** | **Integer** | 口座ID（from_walletable_typeがprivate_account_itemの場合は勘定科目ID） |  [optional]
**fromWalletableType** | [**FromWalletableTypeEnum**](#FromWalletableTypeEnum) | 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet, プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）: private_account_item) |  [optional]
**id** | **Long** | 取引行ID | 



## Enum: FromWalletableTypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
CREDIT_CARD | &quot;credit_card&quot;
WALLET | &quot;wallet&quot;
PRIVATE_ACCOUNT_ITEM | &quot;private_account_item&quot;



