

# WalletableCreateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankId** | **Integer** | 連携サービスID（typeにbank_account、credit_cardを指定する場合は必須） |  [optional]
**companyId** | **Integer** | 事業所ID | 
**isAsset** | **Boolean** | 口座を資産口座とするか負債口座とするか（true: 資産口座 (デフォルト), false: 負債口座）&lt;br&gt; bank_idを指定しない場合にのみ使われます。&lt;br&gt; bank_idを指定する場合には資産口座か負債口座かはbank_idに指定したサービスに応じて決定され、is_assetに指定した値は無視されます。  |  [optional]
**name** | **String** | 口座名 (255文字以内) | 
**type** | [**TypeEnum**](#TypeEnum) | 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） | 



## Enum: TypeEnum

Name | Value
---- | -----
BANK_ACCOUNT | &quot;bank_account&quot;
CREDIT_CARD | &quot;credit_card&quot;
WALLET | &quot;wallet&quot;



