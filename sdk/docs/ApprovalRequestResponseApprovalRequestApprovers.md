

# ApprovalRequestResponseApprovalRequestApprovers


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isForceAction** | **Boolean** | 代理承認済みかどうか | 
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | 承認ステップの承認方法 * &#x60; predefined_user&#x60; - メンバー指定 (1人), * &#x60; selected_user&#x60; - 申請時にメンバー指定 * &#x60; unspecified&#x60; - 指定なし * &#x60; and_resource&#x60; - メンバー指定 (複数、全員の承認), * &#x60; or_resource&#x60; - メンバー指定 (複数、1人の承認) * &#x60; and_position&#x60; - 役職指定 (複数、全員の承認) * &#x60; or_position&#x60; - 役職指定 (複数、1人の承認) | 
**status** | [**StatusEnum**](#StatusEnum) | 承認者の承認状態 * &#x60;initial&#x60; - 初期状態 * &#x60;approved&#x60; - 承認済 * &#x60;rejected&#x60; - 却下 * &#x60;feedback&#x60; - 差戻し | 
**stepId** | **Integer** | 承認ステップID | 
**userId** | **Integer** | 承認者のユーザーID 下記の場合はnullになります。 &lt;ul&gt;   &lt;li&gt;resource_type:selected_userの場合で承認者未指定時&lt;/li&gt;   &lt;li&gt;resource_type:or_positionで前stepで部門未指定の場合&lt;/li&gt; &lt;/ul&gt; | 



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



## Enum: StatusEnum

Name | Value
---- | -----
INITIAL | &quot;initial&quot;
APPROVED | &quot;approved&quot;
REJECTED | &quot;rejected&quot;
FEEDBACK | &quot;feedback&quot;



