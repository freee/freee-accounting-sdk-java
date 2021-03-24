

# ExpenseApplicationResponseExpenseApplication


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **Integer** | 事業所ID | 
**dealId** | **Integer** | 取引ID (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_idが表示されます) | 
**dealStatus** | [**DealStatusEnum**](#DealStatusEnum) | 取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:精算済み, unsettled:清算待ち) | 
**description** | **String** | 備考 |  [optional]
**editableOnWeb** | **Boolean** | 会計freeeのWeb画面から申請内容を編集可能：falseの場合、Web上からの項目行の追加／削除・金額の編集が出来なくなります。APIでの編集は可能です。 | 
**expenseApplicationLines** | [**List&lt;ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines&gt;**](ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines.md) | 経費申請の項目行一覧（配列） | 
**id** | **Integer** | 経費申請ID | 
**issueDate** | **String** | 申請日 (yyyy-mm-dd) | 
**sectionId** | **Integer** | 部門ID |  [optional]
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



