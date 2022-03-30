

# WalletTxn


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** | 取引金額 | 
**balance** | **Integer** | 残高(銀行口座等) | 
**companyId** | **Integer** | 事業所ID | 
**date** | **String** | 取引日(yyyy-mm-dd) | 
**description** | **String** | 取引内容 | 
**dueAmount** | **Integer** | 未決済金額 | 
**entrySide** | [**EntrySideEnum**](#EntrySideEnum) | 入金／出金 (入金: income, 出金: expense) | 
**id** | **Integer** | 明細ID | 
**ruleMatched** | **Boolean** | 登録時に&lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/202848350-明細の自動登録ルールを設定する\&quot; target&#x3D;\&quot;_blank\&quot;&gt;自動登録ルールの設定&lt;/a&gt;が適用され、登録処理が実行された場合、 trueになります。〜を推測する、〜の消込をするの条件の場合は一致してもfalseになります。  | 
**status** | **Integer** | 明細のステータス（消込待ち: 1, 消込済み: 2, 無視: 3, 消込中: 4, 対象外: 6） | 
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



