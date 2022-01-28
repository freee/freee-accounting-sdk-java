

# DealRenews


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**List&lt;DealDetails1&gt;**](DealDetails1.md) | +更新の明細行一覧（配列） | 
**id** | **Long** | +更新行ID | 
**renewTargetId** | **Long** | +更新の対象行ID | 
**renewTargetType** | [**RenewTargetTypeEnum**](#RenewTargetTypeEnum) | +更新の対象行タイプ | 
**updateDate** | **String** | 更新日 (yyyy-mm-dd) | 



## Enum: RenewTargetTypeEnum

Name | Value
---- | -----
DETAIL | &quot;detail&quot;
ACCRUAL | &quot;accrual&quot;
RENEW | &quot;renew&quot;



