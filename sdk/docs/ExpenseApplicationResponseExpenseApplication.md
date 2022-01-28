

# ExpenseApplicationResponseExpenseApplication


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicantId** | **Integer** | 申請者のユーザーID | 
**applicationNumber** | **String** | 申請No. | 
**approvalFlowLogs** | [**List&lt;ApprovalRequestResponseApprovalRequestApprovalFlowLogs&gt;**](ApprovalRequestResponseApprovalRequestApprovalFlowLogs.md) | 経費申請の承認履歴（配列） | 
**approvalFlowRouteId** | **Integer** | 申請経路ID | 
**approvers** | [**List&lt;ApprovalRequestResponseApprovalRequestApprovers&gt;**](ApprovalRequestResponseApprovalRequestApprovers.md) | 承認者（配列）   承認ステップのresource_typeがunspecified (指定なし)の場合はapproversはレスポンスに含まれません。   しかし、resource_typeがunspecifiedの承認ステップにおいて誰かが承認・却下・差し戻しのいずれかのアクションを取った後は、   approversはレスポンスに含まれるようになります。   その場合approversにはアクションを行ったステップのIDとアクションを行ったユーザーのIDが含まれます。 | 
**comments** | [**List&lt;ApprovalRequestResponseApprovalRequestComments&gt;**](ApprovalRequestResponseApprovalRequestComments.md) | 経費申請のコメント一覧（配列） | 
**companyId** | **Integer** | 事業所ID | 
**currentRound** | **Integer** | 現在のround。差し戻し等により申請がstepの最初からやり直しになるとroundの値が増えます。 | 
**currentStepId** | **Integer** | 現在承認ステップID | 
**dealId** | **Integer** | 取引ID (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_idが表示されます) | 
**dealStatus** | [**DealStatusEnum**](#DealStatusEnum) | 取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:精算済み, unsettled:清算待ち) | 
**description** | **String** | 備考 |  [optional]
**expenseApplicationLines** | [**List&lt;ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines&gt;**](ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines.md) | 経費申請の項目行一覧（配列） | 
**id** | **Integer** | 経費申請ID | 
**issueDate** | **String** | 申請日 (yyyy-mm-dd) | 
**sectionId** | **Integer** | 部門ID |  [optional]
**segment1TagId** | **Long** | セグメント１ID。セグメント１が使用可能なプランの時のみレスポンスに含まれます。 |  [optional]
**segment2TagId** | **Long** | セグメント２ID。セグメント２が使用可能なプランの時のみレスポンスに含まれます。 |  [optional]
**segment3TagId** | **Long** | セグメント３ID。セグメント３が使用可能なプランの時のみレスポンスに含まれます。 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し) | 
**tagIds** | **List&lt;Integer&gt;** | メモタグID |  [optional]
**title** | **String** | 申請タイトル | 
**totalAmount** | **Integer** | 合計金額 |  [optional]



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



