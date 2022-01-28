

# PartnerResponsePartnerPartnerBankAccountAttributes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountName** | **String** | 受取人名（カナ） |  [optional]
**accountNumber** | **String** | 口座番号 |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | 口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他) |  [optional]
**bankCode** | **String** | 銀行コード |  [optional]
**bankName** | **String** | 銀行名 |  [optional]
**bankNameKana** | **String** | 銀行名（カナ） |  [optional]
**branchCode** | **String** | 支店番号 |  [optional]
**branchKana** | **String** | 支店名（カナ） |  [optional]
**branchName** | **String** | 支店名 |  [optional]
**longAccountName** | **String** | 受取人名 |  [optional]



## Enum: AccountTypeEnum

Name | Value
---- | -----
ORDINARY | &quot;ordinary&quot;
CHECKING | &quot;checking&quot;
EARMARKED | &quot;earmarked&quot;
SAVINGS | &quot;savings&quot;
OTHER | &quot;other&quot;



