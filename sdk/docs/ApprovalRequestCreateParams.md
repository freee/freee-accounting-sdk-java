

# ApprovalRequestCreateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationDate** | **String** | 申請日 (yyyy-mm-dd)&lt;br&gt; 指定しない場合は当日の日付が登録されます。  |  [optional]
**approvalFlowRouteId** | **Integer** | 申請経路ID | 
**approverId** | **Integer** | 承認者のユーザーID |  [optional]
**companyId** | **Integer** | 事業所ID | 
**draft** | **Boolean** | falseの時、in_progress:申請中で作成する。それ以外の時はdraft:下書きで作成する | 
**formId** | **Integer** | 申請フォームID | 
**parentId** | **Integer** | 親申請ID(既存各種申請IDのみ指定可能です。) |  [optional]
**requestItems** | [**List&lt;ApprovalRequestCreateParamsRequestItems&gt;**](ApprovalRequestCreateParamsRequestItems.md) |  | 



