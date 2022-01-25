

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
**dealId** | **Integer** | 取引ID (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_idが表示されます) | 
**dealStatus** | [**DealStatusEnum**](#DealStatusEnum) | 取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:決済済み, unsettled:未決済) | 
**formId** | **Integer** | 申請フォームID | 
**id** | **Integer** | 各種申請ID | 
**manualJournalId** | **Integer** | 振替伝票のID (申請ステータス:statusがapprovedで、関連する振替伝票が存在する時のみmanual_journal_idが表示されます)  &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/115003827683-#5\&quot; target&#x3D;\&quot;_blank\&quot;&gt;承認された各種申請から支払依頼等を作成する&lt;/a&gt;  | 
**requestItems** | [**List&lt;ApprovalRequestResponseApprovalRequestRequestItems&gt;**](ApprovalRequestResponseApprovalRequestRequestItems.md) | 各種申請の項目一覧（配列） | 
**status** | [**StatusEnum**](#StatusEnum) | 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し) | 
**title** | **String** | 申請タイトル | 



## Enum: DealStatusEnum

Name | Value
---- | -----
SETTLED | &quot;settled&quot;
UNSETTLED | &quot;unsettled&quot;



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
IN_PROGRESS | &quot;in_progress&quot;
APPROVED | &quot;approved&quot;
REJECTED | &quot;rejected&quot;
FEEDBACK | &quot;feedback&quot;



