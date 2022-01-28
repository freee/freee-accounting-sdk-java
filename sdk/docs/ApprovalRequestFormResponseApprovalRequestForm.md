

# ApprovalRequestFormResponseApprovalRequestForm


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **Integer** | 事業所ID | 
**createdDate** | **String** | 作成日時 | 
**description** | **String** | 申請フォームの説明 | 
**formOrder** | **Integer** | 表示順（申請者が選択する申請フォームの表示順を設定できます。小さい数ほど上位に表示されます。（0を除く整数のみ。マイナス不可）未入力の場合、表示順が後ろになります。同じ数字が入力された場合、登録順で表示されます。） | 
**id** | **Integer** | 申請フォームID | 
**name** | **String** | 申請フォームの名前 | 
**parts** | [**List&lt;ApprovalRequestFormResponseApprovalRequestFormParts&gt;**](ApprovalRequestFormResponseApprovalRequestFormParts.md) | 申請フォームの項目 |  [optional]
**routeSettingCount** | **Integer** | 適用された経路数 | 
**status** | [**StatusEnum**](#StatusEnum) | ステータス(draft: 申請で使用しない、active: 申請で使用する、deleted: 削除済み) | 



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
ACTIVE | &quot;active&quot;
DELETED | &quot;deleted&quot;



