

# PaymentRequestUpdateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountName** | **String** | 受取人名（カナ）（48文字以内）&lt;br&gt; 支払先指定時には無効  |  [optional]
**accountNumber** | **String** | 口座番号（半角数字1桁〜7桁）&lt;br&gt; 支払先指定時には無効  |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | &#39;口座種別(ordinary: 普通、checking: 当座、earmarked: 納税準備預金、savings: 貯蓄、other: その他)&#39;&lt;br&gt; &#39;支払先指定時には無効&#39;&lt;br&gt; &#39;デフォルトは ordinary: 普通 です&#39;  |  [optional]
**applicationDate** | **String** | 申請日 (yyyy-mm-dd)&lt;br&gt; 指定しない場合は当日の日付が登録されます。&lt;br&gt; 申請者が、下書き状態もしくは差戻し状態の支払依頼に対して指定する場合のみ有効  |  [optional]
**approvalFlowRouteId** | **Integer** | 申請経路ID&lt;br&gt; 指定する申請経路IDは、申請経路APIを利用して取得してください。  | 
**approverId** | **Integer** | 承認者のユーザーID&lt;br&gt; 「承認者を指定」の経路を申請経路として使用する場合に指定してください。&lt;br&gt; 指定する承認者のユーザーIDは、申請経路APIを利用して取得してください。  |  [optional]
**bankCode** | **String** | 銀行コード（半角数字1桁〜4桁）&lt;br&gt; 支払先指定時には無効  |  [optional]
**bankName** | **String** | 銀行名（255文字以内）&lt;br&gt; 支払先指定時には無効  |  [optional]
**bankNameKana** | **String** | 銀行名（カナ）（15文字以内）&lt;br&gt; 支払先指定時には無効  |  [optional]
**branchCode** | **String** | 支店番号（半角数字1桁〜3桁）&lt;br&gt; 支払先指定時には無効  |  [optional]
**branchKana** | **String** | 支店名（カナ）（15文字以内）&lt;br&gt; 指定可能な文字は、英数・カナ・丸括弧・ハイフン・スペースのみです。&lt;br&gt; 支払先指定時には無効  |  [optional]
**branchName** | **String** | 支店名（255文字以内）&lt;br&gt; 支払先指定時には無効  |  [optional]
**companyId** | **Integer** | 事業所ID | 
**description** | **String** | 備考 |  [optional]
**documentCode** | **String** | 請求書番号（255文字以内） |  [optional]
**draft** | **Boolean** | 支払依頼のステータス&lt;br&gt; falseを指定した時は申請中（in_progress）で支払依頼を更新します。&lt;br&gt; trueを指定した時は下書き（draft）で支払依頼を更新します。&lt;br&gt; 未指定の時は下書きとみなして支払依頼を更新します。  | 
**issueDate** | **String** | 発生日 (yyyy-mm-dd) | 
**partnerCode** | **String** | 支払先の取引先コード&lt;br&gt; 支払先の取引先ID指定時には無効  |  [optional]
**partnerId** | **Integer** | 支払先の取引先ID |  [optional]
**paymentDate** | **String** | 支払期限 (yyyy-mm-dd) |  [optional]
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | &#39;支払方法(none: 指定なし, domestic_bank_transfer: 国内振込, abroad_bank_transfer: 国外振込, account_transfer: 口座振替, credit_card: クレジットカード)&#39;&lt;br&gt; &#39;デフォルトは none: 指定なし です。&#39;  |  [optional]
**paymentRequestLines** | [**List&lt;PaymentRequestUpdateParamsPaymentRequestLines&gt;**](PaymentRequestUpdateParamsPaymentRequestLines.md) | 支払依頼の項目行一覧（配列） | 
**receiptIds** | **List&lt;Integer&gt;** | 証憑ファイルID（ファイルボックスのファイルID）（配列） |  [optional]
**title** | **String** | 申請タイトル&lt;br&gt; 申請者が、下書き状態もしくは差戻し状態の支払依頼に対して指定する場合のみ有効  | 



## Enum: AccountTypeEnum

Name | Value
---- | -----
ORDINARY | &quot;ordinary&quot;
CHECKING | &quot;checking&quot;
EARMARKED | &quot;earmarked&quot;
SAVINGS | &quot;savings&quot;
OTHER | &quot;other&quot;



## Enum: PaymentMethodEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
DOMESTIC_BANK_TRANSFER | &quot;domestic_bank_transfer&quot;
ABROAD_BANK_TRANSFER | &quot;abroad_bank_transfer&quot;
ACCOUNT_TRANSFER | &quot;account_transfer&quot;
CREDIT_CARD | &quot;credit_card&quot;



