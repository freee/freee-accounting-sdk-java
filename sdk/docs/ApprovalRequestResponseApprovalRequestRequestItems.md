

# ApprovalRequestResponseApprovalRequestRequestItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 項目ID | 
**type** | [**TypeEnum**](#TypeEnum) | 項目タイプ(title: 申請タイトル, single_line: 自由記述形式 1行, multi_line: 自由記述形式 複数行, select: プルダウン, date: 日付, amount: 金額, receipt: 添付ファイル, section: 部門ID, partner: 取引先ID, ninja_sign_document: 契約書（freeeサイン連携）) | 
**value** | **String** | 項目の値 | 



## Enum: TypeEnum

Name | Value
---- | -----
TITLE | &quot;title&quot;
SINGLE_LINE | &quot;single_line&quot;
MULTI_LINE | &quot;multi_line&quot;
SELECT | &quot;select&quot;
DATE | &quot;date&quot;
AMOUNT | &quot;amount&quot;
RECEIPT | &quot;receipt&quot;
SECTION | &quot;section&quot;
PARTNER | &quot;partner&quot;
NINJA_SIGN_DOCUMENT | &quot;ninja_sign_document&quot;



