

# QuotationUpdateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyAddress1** | **String** | 市区町村・番地 (デフォルトは事業所設定情報が補完されます) |  [optional]
**companyAddress2** | **String** | 建物名・部屋番号など (デフォルトは事業所設定情報が補完されます) |  [optional]
**companyContactInfo** | **String** | 事業所担当者名 (デフォルトは見積書テンプレート情報が補完されます) |  [optional]
**companyId** | **Integer** | 事業所ID | 
**companyName** | **String** | 事業所名 (デフォルトは事業所設定情報が補完されます) |  [optional]
**companyPrefectureCode** | **Integer** | 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄) (デフォルトは事業所設定情報が補完されます) |  [optional]
**companyZipcode** | **String** | 郵便番号 (デフォルトは事業所設定情報が補完されます) |  [optional]
**description** | **String** | 概要 |  [optional]
**issueDate** | **String** | 見積日 (yyyy-mm-dd) |  [optional]
**message** | **String** | メッセージ (デフォルト: 下記の通り御見積申し上げます。) |  [optional]
**notes** | **String** | 備考 |  [optional]
**partnerAddress1** | **String** | 取引先市区町村・番地 (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます) |  [optional]
**partnerAddress2** | **String** | 取引先建物名・部屋番号など (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます) |  [optional]
**partnerCode** | **String** | 取引先コード |  [optional]
**partnerContactInfo** | **String** | 取引先担当者名 |  [optional]
**partnerDisplayName** | **String** | 見積書に表示する取引先名 | 
**partnerId** | **Integer** | 取引先ID |  [optional]
**partnerPrefectureCode** | **Integer** | 取引先都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄) (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます) |  [optional]
**partnerTitle** | **String** | 敬称（御中、様、(空白)の3つから選択） | 
**partnerZipcode** | **String** | 取引先郵便番号 (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます) |  [optional]
**quotationContents** | [**List&lt;QuotationUpdateParamsQuotationContents&gt;**](QuotationUpdateParamsQuotationContents.md) | 見積内容 |  [optional]
**quotationLayout** | [**QuotationLayoutEnum**](#QuotationLayoutEnum) | 見積書レイアウト * &#x60;default_classic&#x60; - レイアウト１/クラシック (デフォルト)  * &#x60;standard_classic&#x60; - レイアウト２/クラシック  * &#x60;envelope_classic&#x60; - 封筒１/クラシック  * &#x60;default_modern&#x60; - レイアウト１/モダン  * &#x60;standard_modern&#x60; - レイアウト２/モダン  * &#x60;envelope_modern&#x60; - 封筒/モダン |  [optional]
**quotationNumber** | **String** | 見積書番号 (デフォルト: 自動採番されます) |  [optional]
**quotationStatus** | [**QuotationStatusEnum**](#QuotationStatusEnum) | 見積書ステータス  (unsubmitted: 送付待ち, submitted: 送付済み) |  [optional]
**taxEntryMethod** | [**TaxEntryMethodEnum**](#TaxEntryMethodEnum) | 見積書の消費税計算方法(inclusive: 内税表示, exclusive: 外税表示 (デフォルト)) |  [optional]
**title** | **String** | タイトル (デフォルト: 見積書) |  [optional]



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



## Enum: TaxEntryMethodEnum

Name | Value
---- | -----
INCLUSIVE | &quot;inclusive&quot;
EXCLUSIVE | &quot;exclusive&quot;



