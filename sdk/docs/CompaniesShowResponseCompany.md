

# CompaniesShowResponseCompany

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 事業所ID | 
**name** | **String** | 事業所の正式名称 (100文字以内) | 
**nameKana** | **String** | 正式名称フリガナ (100文字以内) | 
**displayName** | **String** | 事業所名 | 
**taxAtSourceCalcType** | **Integer** | 源泉徴収税計算（0: 消費税を含める、1: 消費税を含めない） | 
**contactName** | **String** | 担当者名 (50文字以内) | 
**headCount** | **Integer** | 従業員数（0: 経営者のみ、1: 2~5人、2: 6~10人、3: 11~20人、4: 21~30人、5: 31~40人、6: 41~100人、7: 100人以上 | 
**corporateNumber** | **String** | 法人番号 (半角数字13桁、法人のみ) | 
**txnNumberFormat** | [**TxnNumberFormatEnum**](#TxnNumberFormatEnum) | 仕訳番号形式（not_used: 使用しない、digits: 数字（例：5091824）、alnum: 英数字（例：59J0P）） | 
**defaultWalletAccountId** | **Integer** | 決済口座のデフォルト |  [optional]
**privateSettlement** | **Boolean** | プライベート資金/役員資金（false: 使用しない、true: 使用する） | 
**minusFormat** | **Integer** | マイナスの表示方法（0: -、 1: △） | 
**role** | [**RoleEnum**](#RoleEnum) | ユーザーの権限 | 
**phone1** | **String** | 電話番号１ | 
**phone2** | **String** | 電話番号２ | 
**fax** | **String** | FAX | 
**zipcode** | **String** | 郵便番号 | 
**prefectureCode** | **Integer** | 都道府県コード（0: 北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 | 
**streetName1** | **String** | 市区町村・番地 | 
**streetName2** | **String** | 建物名・部屋番号など | 
**invoiceLayout** | **Integer** | レイアウト(0: レイアウト1, 1:レイアウト2, 3:封筒1, 4:レイアウト3(繰越金額欄あり), 5: 封筒2(繰越金額欄あり)) | 
**invoiceStyle** | **Integer** | スタイル(0: クラシック, 1: モダン) | 
**amountFraction** | **Integer** | 金額端数処理方法（0: 切り捨て、1: 切り上げ、2: 四捨五入） | 
**industryClass** | [**IndustryClassEnum**](#IndustryClassEnum) | 種別（agriculture_forestry_fisheries_ore: 農林水産業/鉱業、construction: 建設、manufacturing_processing: 製造/加工、it: IT、transportation_logistics: 運輸/物流、retail_wholesale: 小売/卸売、finance_insurance: 金融/保険、real_estate_rental: 不動産/レンタル、profession: 士業/学術/専門技術サービス、design_production: デザイン/制作、food: 飲食、leisure_entertainment: レジャー/娯楽、lifestyle: 生活関連サービス、education: 教育/学習支援、medical_welfare: 医療/福祉、other_services: その他サービス、other: その他） | 
**industryCode** | [**IndustryCodeEnum**](#IndustryCodeEnum) | コード（transport_delivery: 輸送業/配送業、delivery: バイク便等の配達業、other_transportation_logistics: その他の運輸業、物流業） | 
**workflowSetting** | [**WorkflowSettingEnum**](#WorkflowSettingEnum) | 仕訳承認フロー（enable: 有効、 disable: 無効） | 
**usePartnerCode** | **Boolean** | 取引先コードの利用設定（true: 有効、 false: 無効） | 



## Enum: TxnNumberFormatEnum

Name | Value
---- | -----
NOT_USED | &quot;not_used&quot;
DIGITS | &quot;digits&quot;
ALNUM | &quot;alnum&quot;



## Enum: RoleEnum

Name | Value
---- | -----
ADMIN | &quot;admin&quot;
SIMPLE_ACCOUNTING | &quot;simple_accounting&quot;
SELF_ONLY | &quot;self_only&quot;
READ_ONLY | &quot;read_only&quot;



## Enum: IndustryClassEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
AGRICULTURE_FORESTRY_FISHERIES_ORE | &quot;agriculture_forestry_fisheries_ore&quot;
CONSTRUCTION | &quot;construction&quot;
MANUFACTURING_PROCESSING | &quot;manufacturing_processing&quot;
IT | &quot;it&quot;
TRANSPORTATION_LOGISTICS | &quot;transportation_logistics&quot;
RETAIL_WHOLESALE | &quot;retail_wholesale&quot;
FINANCE_INSURANCE | &quot;finance_insurance&quot;
REAL_ESTATE_RENTAL | &quot;real_estate_rental&quot;
PROFESSION | &quot;profession&quot;
DESIGN_PRODUCTION | &quot;design_production&quot;
FOOD | &quot;food&quot;
LIFESTYLE | &quot;lifestyle&quot;
EDUCATION | &quot;education&quot;
MEDICAL_WELFARE | &quot;medical_welfare&quot;
OTHER_SERVICES | &quot;other_services&quot;
OTHER | &quot;other&quot;



## Enum: IndustryCodeEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
TRANSPORT_DELIVERY | &quot;transport_delivery&quot;
DELIVERY | &quot;delivery&quot;
OTHER_TRANSPORTATION_LOGISTICS | &quot;other_transportation_logistics&quot;



## Enum: WorkflowSettingEnum

Name | Value
---- | -----
ENABLE | &quot;enable&quot;
DISABLE | &quot;disable&quot;



