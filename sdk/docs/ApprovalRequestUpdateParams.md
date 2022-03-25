

# ApprovalRequestUpdateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationDate** | **String** | 申請日 (yyyy-mm-dd)&lt;br&gt; 指定しない場合は当日の日付が登録されます。  |  [optional]
**approvalFlowRouteId** | **Integer** | 申請経路ID | 
**approverId** | **Integer** | 承認者のユーザーID |  [optional]
**companyId** | **Integer** | 事業所ID | 
**draft** | **Boolean** | falseの時、in_progress:申請中で更新する。それ以外の時はdraft:下書きで更新する | 
**requestItems** | [**List&lt;ApprovalRequestCreateParamsRequestItems&gt;**](ApprovalRequestCreateParamsRequestItems.md) |  | 



