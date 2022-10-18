

# ApprovalRequestUpdateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationDate** | **String** | 申請日 (yyyy-mm-dd)&lt;br&gt; 指定しない場合は当日の日付が登録されます。  |  [optional]
**approvalFlowRouteId** | **Integer** | 申請経路ID | 
**approverId** | **Integer** | 承認者のユーザーID |  [optional]
**companyId** | **Integer** | 事業所ID | 
**draft** | **Boolean** | 各種申請のステータス&lt;br&gt; falseを指定した時は申請中（in_progress）で各種申請を更新します。&lt;br&gt; trueを指定した時は下書き（draft）で各種申請を更新します。  | 
**requestItems** | [**List&lt;ApprovalRequestCreateParamsRequestItems&gt;**](ApprovalRequestCreateParamsRequestItems.md) |  | 



