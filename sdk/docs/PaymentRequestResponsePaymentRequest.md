

# PaymentRequestResponsePaymentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountName** | **String** | 受取人名（カナ） | 
**accountNumber** | **String** | 口座番号 | 
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | 口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他) | 
**applicantId** | **Integer** | 申請者のユーザーID | 
**applicationDate** | **String** | 申請日 (yyyy-mm-dd) | 
**applicationNumber** | **String** | 申請No. | 
**approvalFlowLogs** | [**List&lt;ApprovalRequestResponseApprovalRequestApprovalFlowLogs&gt;**](ApprovalRequestResponseApprovalRequestApprovalFlowLogs.md) | 支払依頼の承認履歴（配列） | 
**approvalFlowRouteId** | **Integer** | 申請経路ID | 
**approvers** | [**List&lt;ApprovalRequestResponseApprovalRequestApprovers&gt;**](ApprovalRequestResponseApprovalRequestApprovers.md) | 承認者（配列）   承認ステップのresource_typeがunspecified (指定なし)の場合はapproversはレスポンスに含まれません。   しかし、resource_typeがunspecifiedの承認ステップにおいて誰かが承認・却下・差し戻しのいずれかのアクションを取った後は、   approversはレスポンスに含まれるようになります。   その場合approversにはアクションを行ったステップのIDとアクションを行ったユーザーのIDが含まれます。 | 
**bankCode** | **String** | 銀行コード | 
**bankName** | **String** | 銀行名 | 
**bankNameKana** | **String** | 銀行名（カナ） | 
**branchCode** | **String** | 支店番号 | 
**branchKana** | **String** | 支店名（カナ） | 
**branchName** | **String** | 支店名 | 
**comments** | [**List&lt;ApprovalRequestResponseApprovalRequestComments&gt;**](ApprovalRequestResponseApprovalRequestComments.md) | 支払依頼のコメント一覧（配列） | 
**companyId** | **Integer** | 事業所ID | 
**currentRound** | **Integer** | 現在のround。差し戻し等により申請がstepの最初からやり直しになるとroundの値が増えます。 | 
**currentStepId** | **Integer** | 現在承認ステップID | 
**dealId** | **Integer** | 取引ID (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_idが表示されます) | 
**dealStatus** | [**DealStatusEnum**](#DealStatusEnum) | 取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:支払済み, unsettled:支払待ち) | 
**description** | **String** | 備考 | 
**documentCode** | **String** | 請求書番号 | 
**id** | **Integer** | 支払依頼ID | 
**issueDate** | **String** | 発生日 (yyyy-mm-dd) | 
**partnerCode** | **String** | 取引先コード |  [optional]
**partnerId** | **Integer** | 取引先ID | 
**partnerName** | **String** | 取引先名 | 
**paymentDate** | **String** | 支払期限 (yyyy-mm-dd) | 
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | 支払方法(none: 指定なし, domestic_bank_transfer: 国内振込, abroad_bank_transfer: 国外振込, account_transfer: 口座振替, credit_card: クレジットカード) | 
**paymentRequestLines** | [**List&lt;PaymentRequestResponsePaymentRequestPaymentRequestLines&gt;**](PaymentRequestResponsePaymentRequestPaymentRequestLines.md) | 支払依頼の項目行一覧（配列） | 
**receiptIds** | **List&lt;Integer&gt;** | 証憑ファイルID（ファイルボックスのファイルID） | 
**status** | [**StatusEnum**](#StatusEnum) | 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し) | 
**title** | **String** | 申請タイトル | 
**totalAmount** | **Integer** | 合計金額 | 



## Enum: AccountTypeEnum

Name | Value
---- | -----
ORDINARY | &quot;ordinary&quot;
CHECKING | &quot;checking&quot;
EARMARKED | &quot;earmarked&quot;
SAVINGS | &quot;savings&quot;
OTHER | &quot;other&quot;



## Enum: DealStatusEnum

Name | Value
---- | -----
SETTLED | &quot;settled&quot;
UNSETTLED | &quot;unsettled&quot;



## Enum: PaymentMethodEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
DOMESTIC_BANK_TRANSFER | &quot;domestic_bank_transfer&quot;
ABROAD_BANK_TRANSFER | &quot;abroad_bank_transfer&quot;
ACCOUNT_TRANSFER | &quot;account_transfer&quot;
CREDIT_CARD | &quot;credit_card&quot;



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
IN_PROGRESS | &quot;in_progress&quot;
APPROVED | &quot;approved&quot;
REJECTED | &quot;rejected&quot;
FEEDBACK | &quot;feedback&quot;



