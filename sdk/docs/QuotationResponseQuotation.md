

# QuotationResponseQuotation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyAddress1** | **String** | 市区町村・番地 |  [optional]
**companyAddress2** | **String** | 建物名・部屋番号など |  [optional]
**companyContactInfo** | **String** | 事業所担当者名 |  [optional]
**companyId** | **Integer** | 事業所ID | 
**companyName** | **String** | 事業所名 | 
**companyPrefectureCode** | **Integer** | 都道府県コード（-1: 設定しない、0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 |  [optional]
**companyPrefectureName** | **String** | 都道府県 |  [optional]
**companyZipcode** | **String** | 郵便番号 |  [optional]
**description** | **String** | 概要 |  [optional]
**id** | **Integer** | 見積書ID | 
**issueDate** | **String** | 見積日 (yyyy-mm-dd) | 
**mailSentAt** | **String** | メール送信日時(最新) |  [optional]
**message** | **String** | メッセージ |  [optional]
**notes** | **String** | 備考 |  [optional]
**partnerAddress1** | **String** | 市区町村・番地 |  [optional]
**partnerAddress2** | **String** | 建物名・部屋番号など |  [optional]
**partnerCode** | **String** | 取引先コード |  [optional]
**partnerContactInfo** | **String** | 取引先担当者名 |  [optional]
**partnerDisplayName** | **String** | 見積書に表示する取引先名 |  [optional]
**partnerId** | **Integer** | 取引先ID | 
**partnerName** | **String** | 取引先名 |  [optional]
**partnerPrefectureCode** | **Integer** | 都道府県コード（-1: 設定しない、0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 |  [optional]
**partnerPrefectureName** | **String** | 都道府県 |  [optional]
**partnerTitle** | **String** | 敬称（御中、様、(空白)の3つから選択） | 
**partnerZipcode** | **String** | 郵便番号 |  [optional]
**quotationContents** | [**List&lt;QuotationIndexResponseQuotationContents&gt;**](QuotationIndexResponseQuotationContents.md) | 見積内容 |  [optional]
**quotationLayout** | [**QuotationLayoutEnum**](#QuotationLayoutEnum) | 見積書レイアウト * &#x60;default_classic&#x60; - レイアウト１/クラシック (デフォルト)  * &#x60;standard_classic&#x60; - レイアウト２/クラシック  * &#x60;envelope_classic&#x60; - 封筒１/クラシック  * &#x60;default_modern&#x60; - レイアウト１/モダン  * &#x60;standard_modern&#x60; - レイアウト２/モダン  * &#x60;envelope_modern&#x60; - 封筒/モダン | 
**quotationNumber** | **String** | 見積書番号 | 
**quotationStatus** | [**QuotationStatusEnum**](#QuotationStatusEnum) | 見積書ステータス  (unsubmitted: 送付待ち, submitted: 送付済み, all: 全て) | 
**relatedInvoiceId** | **Integer** | 関連する請求書ID&lt;br&gt; 下記で作成したものが該当します。  &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/203318410#1-2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;見積書・納品書を納品書・請求書に変換する&lt;/a&gt;&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/209076226\&quot; target&#x3D;\&quot;_blank\&quot;&gt;複数の見積書・納品書から合算請求書を作成する&lt;/a&gt;&lt;br&gt;  |  [optional]
**relatedQuotationIds** | **List&lt;Integer&gt;** | 関連する見積書ID(配列)&lt;br&gt; 下記で作成したものが該当します。  &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/203318410#1-2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;見積書・納品書を納品書・請求書に変換する&lt;/a&gt;&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/209076226\&quot; target&#x3D;\&quot;_blank\&quot;&gt;複数の見積書・納品書から合算請求書を作成する&lt;/a&gt;&lt;br&gt;  |  [optional]
**subTotal** | **Integer** | 小計 |  [optional]
**taxEntryMethod** | [**TaxEntryMethodEnum**](#TaxEntryMethodEnum) | 見積書の消費税計算方法(inclusive: 内税, exclusive: 外税) | 
**title** | **String** | タイトル |  [optional]
**totalAmount** | **Integer** | 合計金額 | 
**totalAmountPerVatRate** | [**InvoiceIndexResponseTotalAmountPerVatRate**](InvoiceIndexResponseTotalAmountPerVatRate.md) |  | 
**totalVat** | **Integer** | 消費税 |  [optional]
**webConfirmedAt** | **String** | Web共有取引先確認日時(最新) |  [optional]
**webDownloadedAt** | **String** | Web共有ダウンロード日時(最新) |  [optional]
**webPublishedAt** | **String** | Web共有日時(最新) |  [optional]



## Enum: QuotationLayoutEnum

Name | Value
---- | -----
DEFAULT_CLASSIC | &quot;default_classic&quot;
STANDARD_CLASSIC | &quot;standard_classic&quot;
ENVELOPE_CLASSIC | &quot;envelope_classic&quot;
DEFAULT_MODERN | &quot;default_modern&quot;
STANDARD_MODERN | &quot;standard_modern&quot;
ENVELOPE_MODERN | &quot;envelope_modern&quot;



## Enum: QuotationStatusEnum

Name | Value
---- | -----
UNSUBMITTED | &quot;unsubmitted&quot;
SUBMITTED | &quot;submitted&quot;
ALL | &quot;all&quot;



## Enum: TaxEntryMethodEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
INCLUSIVE | &quot;inclusive&quot;
EXCLUSIVE | &quot;exclusive&quot;



