

# ApprovalRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 各種申請ID | 
**companyId** | **Integer** | 事業所ID | 
**applicationDate** | **String** | 申請日 (yyyy-mm-dd) | 
**title** | **String** | 申請タイトル | 
**applicantId** | **Integer** | 申請者ID | 
**approverId** | **Integer** | 承認者ID | 
**applicationNumber** | **String** | 申請No. | 
**status** | [**StatusEnum**](#StatusEnum) | 申請ステータス | 
**requestItems** | [**List&lt;ApprovalRequestRequestItems&gt;**](ApprovalRequestRequestItems.md) | 各種申請の項目一覧（配列） | 



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;



