

# ExpenseApplicationsIndexResponseExpenseApplications


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicantId** | **Integer** | 申請者のユーザーID | 
**applicationNumber** | **String** | 申請No. | 
**companyId** | **Integer** | 事業所ID | 
**currentRound** | **Integer** | 現在のround。差し戻し等により申請がstepの最初からやり直しになるとroundの値が増えます。 |  [optional]
**currentStepId** | **Integer** | 現在承認ステップID |  [optional]
**dealId** | **Integer** | 取引ID (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_idが表示されます) | 
**dealStatus** | [**DealStatusEnum**](#DealStatusEnum) | 取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:精算済み, unsettled:清算待ち) | 
**description** | **String** | 備考 |  [optional]
**expenseApplicationLines** | [**List&lt;ExpenseApplicationsIndexResponseExpenseApplicationLines&gt;**](ExpenseApplicationsIndexResponseExpenseApplicationLines.md) | 経費申請の項目行一覧（配列） |  [optional]
**id** | **Integer** | 経費申請ID | 
**issueDate** | **String** | 申請日 (yyyy-mm-dd) | 
**purchaseLines** | [**List&lt;ExpenseApplicationResponseExpenseApplicationPurchaseLines&gt;**](ExpenseApplicationResponseExpenseApplicationPurchaseLines.md) | この項目はインボイス制度で利用する項目です。2023年4月下旬から利用できる予定です。利用可能となる前に予告なく変更がある場合があります。&lt;br&gt; 経費申請の申請行一覧（配列）  |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**segment1TagId** | **Long** | セグメント１ID |  [optional]
**segment2TagId** | **Long** | セグメント２ID |  [optional]
**segment3TagId** | **Long** | セグメント３ID |  [optional]
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



