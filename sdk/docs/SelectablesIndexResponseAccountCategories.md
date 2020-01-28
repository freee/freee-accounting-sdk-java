

# SelectablesIndexResponseAccountCategories

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | [**BalanceEnum**](#BalanceEnum) | 収支 | 
**orgCode** | [**OrgCodeEnum**](#OrgCodeEnum) | 事業形態（個人事業主: personal、法人: corporate） | 
**role** | **String** | カテゴリーコード | 
**title** | **String** | カテゴリー名 | 
**desc** | **String** | カテゴリーの説明 |  [optional]
**accountItems** | [**List&lt;SelectablesIndexResponseAccountItems&gt;**](SelectablesIndexResponseAccountItems.md) | 勘定科目の一覧 | 



## Enum: BalanceEnum

Name | Value
---- | -----
EXPENSE | &quot;expense&quot;
INCOME | &quot;income&quot;



## Enum: OrgCodeEnum

Name | Value
---- | -----
PERSONAL | &quot;personal&quot;
CORPORATE | &quot;corporate&quot;



