

# ApprovalFlowRouteResponseApprovalFlowRoute


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**definitionSystem** | **Boolean** | システム作成の申請経路かどうか |  [optional]
**description** | **String** | 申請経路の説明 |  [optional]
**firstStepId** | **Integer** | 最初の承認ステップのID |  [optional]
**id** | **Integer** | 申請経路ID | 
**name** | **String** | 申請経路名 |  [optional]
**requestFormIds** | **List&lt;Integer&gt;** | 申請経路で利用できる申請フォームID配列 | 
**steps** | [**List&lt;ApprovalFlowRouteResponseApprovalFlowRouteSteps&gt;**](ApprovalFlowRouteResponseApprovalFlowRouteSteps.md) | 承認ステップ（配列） |  [optional]
**usages** | [**List&lt;UsagesEnum&gt;**](#List&lt;UsagesEnum&gt;) | 申請種別（申請経路を使用できる申請種別を示します。例えば、ApprovalRequest の場合は、各種申請で使用できる申請経路です。） * &#x60;TxnApproval&#x60; - 仕訳承認 * &#x60;ExpenseApplication&#x60; - 経費精算 * &#x60;PaymentRequest&#x60; - 支払依頼 * &#x60;ApprovalRequest&#x60; - 各種申請 * &#x60;DocApproval&#x60; - 請求書等 (見積書・納品書・請求書・発注書) |  [optional]
**userId** | **Integer** | 更新したユーザーのユーザーID |  [optional]



## Enum: List&lt;UsagesEnum&gt;

Name | Value
---- | -----
TXNAPPROVAL | &quot;TxnApproval&quot;
EXPENSEAPPLICATION | &quot;ExpenseApplication&quot;
PAYMENTREQUEST | &quot;PaymentRequest&quot;
APPROVALREQUEST | &quot;ApprovalRequest&quot;
DOCAPPROVAL | &quot;DocApproval&quot;



