

# DealsRenews

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | +更新行ID | 
**updateDate** | **String** | 更新日 (yyyy-mm-dd) | 
**renewTargetId** | **Integer** | +更新の対象行ID | 
**renewTargetType** | [**RenewTargetTypeEnum**](#RenewTargetTypeEnum) | +更新の対象行タイプ | 
**details** | [**List&lt;DealsRenewsDetails&gt;**](DealsRenewsDetails.md) | +更新の明細行一覧（配列） | 



## Enum: RenewTargetTypeEnum

Name | Value
---- | -----
DETAIL | &quot;detail&quot;
ACCRUAL | &quot;accrual&quot;
RENEW | &quot;renew&quot;



