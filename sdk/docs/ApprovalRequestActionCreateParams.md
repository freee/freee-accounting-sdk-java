

# ApprovalRequestActionCreateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approvalAction** | [**ApprovalActionEnum**](#ApprovalActionEnum) | 操作(approve: 承認する、force_approve: 代理承認する、cancel: 申請を取り消す、reject: 却下する、feedback: 申請者へ差し戻す、force_feedback: 承認済み・却下済みを取り消す) | 
**companyId** | **Integer** | 事業所ID | 
**nextApproverId** | **Integer** | 次ステップの承認者のユーザーID |  [optional]
**targetRound** | **Integer** | 対象round。差し戻し等により申請がstepの最初からやり直しになるとroundの値が増えます。各種申請の取得APIレスポンス.current_roundを送信してください。 | 
**targetStepId** | **Integer** | 対象承認ステップID 各種申請の取得APIレスポンス.current_step_idを送信してください。 | 



## Enum: ApprovalActionEnum

Name | Value
---- | -----
APPROVE | &quot;approve&quot;
FORCE_APPROVE | &quot;force_approve&quot;
CANCEL | &quot;cancel&quot;
REJECT | &quot;reject&quot;
FEEDBACK | &quot;feedback&quot;
FORCE_FEEDBACK | &quot;force_feedback&quot;



