

# ApprovalRequestResponseApprovalRequestApprovalFlowLogs


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | 操作(apply: 申請, approve: 承認, force_approve: 代理承認, cancel: 取消, reject: 却下, feedback: 差戻し) | 
**updatedAt** | **String** | 更新日時(ISO8601形式) | 
**userId** | **Integer** | ユーザーID | 



## Enum: ActionEnum

Name | Value
---- | -----
APPLY | &quot;apply&quot;
APPROVE | &quot;approve&quot;
FORCE_APPROVE | &quot;force_approve&quot;
CANCEL | &quot;cancel&quot;
REJECT | &quot;reject&quot;
FEEDBACK | &quot;feedback&quot;



