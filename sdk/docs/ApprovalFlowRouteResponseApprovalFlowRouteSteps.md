

# ApprovalFlowRouteResponseApprovalFlowRouteSteps


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 承認ステップID | 
**nextStepId** | **Integer** | 次の承認ステップID | 
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | 承認方法( predefined_user: メンバー指定 (1人), selected_user: 申請時にメンバー指定,unspecified: 指定なし, and_resource: メンバー指定 (複数、全員の承認), or_resource: メンバー指定 (複数、1人の承認), and_position: 役職指定 (複数、全員の承認), or_position: 役職指定 (複数、1人の承認) )  | 
**userIds** | **List&lt;Integer&gt;** | 承認者のユーザーID (配列) |  [optional]



## Enum: ResourceTypeEnum

Name | Value
---- | -----
PREDEFINED_USER | &quot;predefined_user&quot;
SELECTED_USER | &quot;selected_user&quot;
UNSPECIFIED | &quot;unspecified&quot;
AND_RESOURCE | &quot;and_resource&quot;
OR_RESOURCE | &quot;or_resource&quot;
AND_POSITION | &quot;and_position&quot;
OR_POSITION | &quot;or_position&quot;



