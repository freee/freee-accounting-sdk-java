

# InvoiceUpdateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookingDate** | **String** | 売上計上日 |  [optional]
**companyAddress1** | **String** | 市区町村・番地 (デフォルトは事業所設定情報が補完されます) |  [optional]
**companyAddress2** | **String** | 建物名・部屋番号など (デフォルトは事業所設定情報が補完されます) |  [optional]
**companyContactInfo** | **String** | 事業所担当者名 (デフォルトは請求書テンプレート情報が補完されます) |  [optional]
**companyId** | **Integer** | 事業所ID | 
**companyName** | **String** | 事業所名 (デフォルトは事業所設定情報が補完されます) |  [optional]
**companyPrefectureCode** | **Integer** | 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄) (デフォルトは事業所設定情報が補完されます) |  [optional]
**companyZipcode** | **String** | 郵便番号 (デフォルトは事業所設定情報が補完されます) |  [optional]
**description** | **String** | 概要 |  [optional]
**dueDate** | **String** | 期日 (yyyy-mm-dd) |  [optional]
**invoiceContents** | [**List&lt;InvoiceUpdateParamsInvoiceContents&gt;**](InvoiceUpdateParamsInvoiceContents.md) | 請求内容 |  [optional]
**invoiceLayout** | [**InvoiceLayoutEnum**](#InvoiceLayoutEnum) | 請求書レイアウト * &#x60;default_classic&#x60; - レイアウト１/クラシック (デフォルト)  * &#x60;standard_classic&#x60; - レイアウト２/クラシック  * &#x60;envelope_classic&#x60; - 封筒１/クラシック  * &#x60;carried_forward_standard_classic&#x60; - レイアウト３（繰越金額欄あり）/クラシック  * &#x60;carried_forward_envelope_classic&#x60; - 封筒２（繰越金額欄あり）/クラシック  * &#x60;default_modern&#x60; - レイアウト１/モダン  * &#x60;standard_modern&#x60; - レイアウト２/モダン  * &#x60;envelope_modern&#x60; - 封筒/モダン |  [optional]
**invoiceNumber** | **String** | 請求書番号 (デフォルト: 自動採番されます) |  [optional]
**invoiceStatus** | [**InvoiceStatusEnum**](#InvoiceStatusEnum) | 請求書ステータス&lt;br&gt; &lt;ul&gt;   &lt;li&gt;draft: 下書き (デフォルト)&lt;/li&gt;   &lt;li&gt;(廃止予定) issue: 発行 (送付待ち (unsubmitted) と同じです。)&lt;/li&gt;   &lt;li&gt;unsubmitted: 送付待ち&lt;/li&gt;   &lt;li&gt;submitted: 送付済み&lt;/li&gt; &lt;/ul&gt; issue, unsubmitted は請求書承認ワークフローを利用している場合は、承認済みの請求書にのみ指定できます。&lt;br&gt; submitted は請求書承認ワークフローを利用している場合は、送付待ちの請求書にのみ指定できます。  |  [optional]
**issueDate** | **String** | 請求日 (yyyy-mm-dd) |  [optional]
**message** | **String** | メッセージ (デフォルト: 下記の通りご請求申し上げます。) |  [optional]
**notes** | **String** | 備考 |  [optional]
**partnerAddress1** | **String** | 取引先市区町村・番地 (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます) |  [optional]
**partnerAddress2** | **String** | 取引先建物名・部屋番号など (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます) |  [optional]
**partnerCode** | **String** | 取引先コード |  [optional]
**partnerContactInfo** | **String** | 取引先担当者名 |  [optional]
**partnerDisplayName** | **String** | 請求書に表示する取引先名 | 
**partnerId** | **Integer** | 取引先ID |  [optional]
**partnerPrefectureCode** | **Integer** | 取引先都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄) (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます) |  [optional]
**partnerTitle** | **String** | 敬称（御中、様、(空白)の3つから選択） | 
**partnerZipcode** | **String** | 取引先郵便番号 (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます) |  [optional]
**paymentBankInfo** | **String** | 支払口座 |  [optional]
**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | 支払方法 (振込: transfer, 引き落とし: direct_debit) |  [optional]
**taxEntryMethod** | [**TaxEntryMethodEnum**](#TaxEntryMethodEnum) | 請求書の消費税計算方法(inclusive: 内税表示, exclusive: 外税表示 (デフォルト)) |  [optional]
**title** | **String** | タイトル (デフォルト: 請求書) |  [optional]
**useVirtualTransferAccount** | [**UseVirtualTransferAccountEnum**](#UseVirtualTransferAccountEnum) | 振込専用口座の利用(利用しない: not_use(デフォルト), 利用する: use) |  [optional]



## Enum: InvoiceLayoutEnum

Name | Value
---- | -----
DEFAULT_CLASSIC | &quot;default_classic&quot;
STANDARD_CLASSIC | &quot;standard_classic&quot;
ENVELOPE_CLASSIC | &quot;envelope_classic&quot;
CARRIED_FORWARD_STANDARD_CLASSIC | &quot;carried_forward_standard_classic&quot;
CARRIED_FORWARD_ENVELOPE_CLASSIC | &quot;carried_forward_envelope_classic&quot;
DEFAULT_MODERN | &quot;default_modern&quot;
STANDARD_MODERN | &quot;standard_modern&quot;
ENVELOPE_MODERN | &quot;envelope_modern&quot;



## Enum: InvoiceStatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
ISSUE | &quot;issue&quot;
UNSUBMITTED | &quot;unsubmitted&quot;
SUBMITTED | &quot;submitted&quot;



## Enum: PaymentTypeEnum

Name | Value
---- | -----
TRANSFER | &quot;transfer&quot;
DIRECT_DEBIT | &quot;direct_debit&quot;



## Enum: TaxEntryMethodEnum

Name | Value
---- | -----
INCLUSIVE | &quot;inclusive&quot;
EXCLUSIVE | &quot;exclusive&quot;



## Enum: UseVirtualTransferAccountEnum

Name | Value
---- | -----
NOT_USE | &quot;not_use&quot;
USE | &quot;use&quot;



