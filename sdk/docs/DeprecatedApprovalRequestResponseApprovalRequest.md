

# DeprecatedApprovalRequestResponseApprovalRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicantId** | **Integer** | 申請者のユーザーID | 
**applicationDate** | **String** | 申請日 (yyyy-mm-dd) | 
**applicationNumber** | **String** | 申請No. | 
**approverId** | **Integer** | 承認者のユーザーID | 
**companyId** | **Integer** | 事業所ID | 
**id** | **Integer** | 各種申請ID | 
**requestItems** | [**List&lt;DeprecatedApprovalRequestResponseApprovalRequestRequestItems&gt;**](DeprecatedApprovalRequestResponseApprovalRequestRequestItems.md) | 各種申請の項目一覧（配列） | 
**status** | [**StatusEnum**](#StatusEnum) | 申請ステータス | 
**title** | **String** | 申請タイトル | 



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;



