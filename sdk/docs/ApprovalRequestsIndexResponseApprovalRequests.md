

# ApprovalRequestsIndexResponseApprovalRequests


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicantId** | **Integer** | 申請者のユーザーID | 
**applicationDate** | **String** | 申請日 (yyyy-mm-dd) | 
**applicationNumber** | **String** | 申請No. | 
**companyId** | **Integer** | 事業所ID | 
**currentRound** | **Integer** | 現在のround。差し戻し等により申請がstepの最初からやり直しになるとroundの値が増えます。 | 
**currentStepId** | **Integer** | 現在承認ステップID | 
**formId** | **Integer** | 申請フォームID | 
**id** | **Integer** | 各種申請ID | 
**requestItems** | [**List&lt;ApprovalRequestResponseApprovalRequestRequestItems&gt;**](ApprovalRequestResponseApprovalRequestRequestItems.md) | 各種申請の項目一覧（配列） | 
**status** | [**StatusEnum**](#StatusEnum) | 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し) | 
**title** | **String** | 申請タイトル | 



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
IN_PROGRESS | &quot;in_progress&quot;
APPROVED | &quot;approved&quot;
REJECTED | &quot;rejected&quot;
FEEDBACK | &quot;feedback&quot;



