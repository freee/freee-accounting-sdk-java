

# CompanyResponseCompany


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | [**List&lt;CompanyResponseCompanyTags&gt;**](CompanyResponseCompanyTags.md) |  |  [optional]
**accountItems** | [**List&lt;CompanyResponseCompanyAccountItems&gt;**](CompanyResponseCompanyAccountItems.md) |  |  [optional]
**amountFraction** | **Integer** | 金額端数処理方法（0: 切り捨て、1: 切り上げ、2: 四捨五入） | 
**contactName** | **String** | 担当者名 (50文字以内) | 
**corporateNumber** | **String** | 法人番号 (半角数字13桁、法人のみ) | 
**defaultWalletAccountId** | **Integer** | 決済口座のデフォルト |  [optional]
**displayName** | **String** | 事業所名 | 
**fax** | **String** | FAX | 
**fiscalYears** | [**List&lt;FiscalYears&gt;**](FiscalYears.md) |  | 
**headCount** | **Integer** | 従業員数（0: 経営者のみ、1: 2~5人、2: 6~10人、3: 11~20人、4: 21~30人、5: 31~40人、6: 41~100人、7: 100人以上 | 
**id** | **Integer** | 事業所ID | 
**industryClass** | [**IndustryClassEnum**](#IndustryClassEnum) | 種別（agriculture_forestry_fisheries_ore: 農林水産業/鉱業、construction: 建設、manufacturing_processing: 製造/加工、it: IT、transportation_logistics: 運輸/物流、retail_wholesale: 小売/卸売、finance_insurance: 金融/保険、real_estate_rental: 不動産/レンタル、profession: 士業/学術/専門技術サービス、design_production: デザイン/制作、food: 飲食、leisure_entertainment: レジャー/娯楽、lifestyle: 生活関連サービス、education: 教育/学習支援、medical_welfare: 医療/福祉、other_services: その他サービス、other: その他） | 
**industryCode** | [**IndustryCodeEnum**](#IndustryCodeEnum) | 業種（agriculture: 農業, forestry: 林業, fishing_industry: 漁業、水産養殖業, mining: 鉱業、採石業、砂利採取業, civil_contractors: 土木工事業, pavement: 舗装工事業, carpenter: とび、大工、左官等の建設工事業, renovation: リフォーム工事業, electrical_plumbing: 電気、管工事等の設備工事業, grocery: 食料品の製造加工業, machinery_manufacturing: 機械器具の製造加工業, printing: 印刷業, other_manufacturing: その他の製造加工業, software_development: 受託：ソフトウェア、アプリ開発業, system_development: 受託：システム開発業, survey_analysis: 受託：調査、分析等の情報処理業, server_management: 受託：サーバー運営管理, website_production: 受託：ウェブサイト制作, online_service_management: オンラインサービス運営業, online_advertising_agency: オンライン広告代理店業, online_advertising_planning_production: オンライン広告企画・制作業, online_media_management: オンラインメディア運営業, portal_site_management: ポータルサイト運営業, other_it_services: その他、IT サービス業, transport_delivery: 輸送業、配送業, delivery: バイク便等の配達業, other_transportation_logistics: その他の運輸業、物流業, other_wholesale: 卸売業：その他, clothing_wholesale_fiber: 卸売業：衣類卸売／繊維, food_wholesale: 卸売業：飲食料品, entrusted_development_wholesale: 卸売業：機械器具, online_shop: 小売業：無店舗　オンラインショップ, fashion_grocery_store: 小売業：店舗あり　ファッション、雑貨, food_store: 小売業：店舗あり　生鮮食品、飲食料品, entrusted_store: 小売業：店舗あり　機械、器具, other_store: 小売業：店舗あり　その他, financial_instruments_exchange: 金融業：金融商品取引, commodity_futures_investment_advisor: 金融業：商品先物取引、商品投資顧問, other_financial: 金融業：その他, brokerage_insurance: 保険業：仲介、代理, other_insurance: 保険業：その他, real_estate_developer: 不動産業：ディベロッパー, real_estate_brokerage: 不動産業：売買、仲介, rent_coin_parking_management: 不動産業：賃貸、コインパーキング、管理, rental_office_co_working_space: 不動産業：レンタルオフィス、コワーキングスペース, rental_lease: レンタル業、リース業, cpa_tax_accountant: 士業：公認会計士事務所、税理士事務所, law_office: 士業：法律事務所, judicial_and_administrative_scrivener: 士業：司法書士事務所／行政書士事務所, labor_consultant: 士業：社会保険労務士事務所, other_profession: 士業：その他, business_consultant: 経営コンサルタント, academic_research_development: 学術・開発研究機関, advertising_agency: 広告代理店, advertising_planning_production: 広告企画／制作, design_development: ソフトウェア、アプリ開発業（受託）, apparel_industry_design: 服飾デザイン業、工業デザイン業, website_design: ウェブサイト制作（受託）, advertising_planning_design: 広告企画／制作業, other_design: その他、デザイン／制作, restaurants_coffee_shops: レストラン、喫茶店等の飲食店業, sale_of_lunch: 弁当の販売業, bread_confectionery_manufacture_sale: パン、菓子等の製造販売業, delivery_catering_mobile_catering: デリバリー業、ケータリング業、移動販売業, hotel_inn: 宿泊業：ホテル、旅館, homestay: 宿泊業：民泊, travel_agency: 旅行代理店業, leisure_sports_facility_management: レジャー、スポーツ等の施設運営業, show_event_management: ショー、イベント等の興行、イベント運営業, barber: ビューティ、ヘルスケア業：床屋、理容室, beauty_salon: ビューティ、ヘルスケア業：美容室, spa_sand_bath_sauna: ビューティ、ヘルスケア業：スパ、砂風呂、サウナ等, este_ail_salon: ビューティ、ヘルスケア業：その他、エステサロン、ネイルサロン等, bridal_planning_introduce_wedding: 冠婚葬祭業：ブライダルプランニング、結婚式場紹介等, memorial_ceremony_funeral: 冠婚葬祭業：メモリアルセレモニー、葬儀等, moving: 引っ越し業, courier_industry: 宅配業, house_maid_cleaning_agency: 家事代行サービス業：無店舗　ハウスメイド、掃除代行等, re_tailoring_clothes: 家事代行サービス業：店舗あり　衣類修理、衣類仕立て直し等, training_institute_management: 研修所等の施設運営業, tutoring_school: 学習塾、進学塾等の教育・学習支援業, music_calligraphy_abacus_classroom: 音楽教室、書道教室、そろばん教室等のの教育・学習支援業, english_school: 英会話スクール等の語学学習支援業, tennis_yoga_judo_school: テニススクール、ヨガ教室、柔道場等のスポーツ指導、支援業, culture_school: その他、カルチャースクール等の教育・学習支援業, seminar_planning_management: セミナー等の企画、運営業, hospital_clinic: 医療業：病院、一般診療所、クリニック等, dental_clinic: 医療業：歯科診療所, other_medical_services: 医療業：その他、医療サービス等, nursery: 福祉業：保育所等、児童向け施設型サービス, nursing_home: 福祉業：老人ホーム等、老人向け施設型サービス, rehabilitation_support_services: 福祉業：療育支援サービス等、障害者等向け施設型サービス, other_welfare: 福祉業：その他、施設型福祉サービス, visit_welfare_service: 福祉業：訪問型福祉サービス, recruitment_temporary_staffing: 人材紹介業、人材派遣業, life_related_recruitment_temporary_staffing: 生活関連サービスの人材紹介業、人材派遣業, car_maintenance_car_repair: 自動車整備業、自動車修理業, machinery_equipment_maintenance_repair: 機械機器類の整備業、修理業, cleaning_maintenance_building_management: 清掃業、メンテナンス業、建物管理業, security: 警備業, other_services: その他のサービス業, npo: NPO, general_incorporated_association: 一般社団法人, general_incorporated_foundation: 一般財団法人, other_association: その他組織) | 
**invoiceLayout** | [**InvoiceLayoutEnum**](#InvoiceLayoutEnum) | 請求書レイアウト * &#x60;default_classic&#x60; - レイアウト１/クラシック (デフォルト)  * &#x60;standard_classic&#x60; - レイアウト２/クラシック  * &#x60;envelope_classic&#x60; - 封筒１/クラシック  * &#x60;carried_forward_standard_classic&#x60; - レイアウト３（繰越金額欄あり）/クラシック  * &#x60;carried_forward_envelope_classic&#x60; - 封筒２（繰越金額欄あり）/クラシック  * &#x60;default_modern&#x60; - レイアウト１/モダン  * &#x60;standard_modern&#x60; - レイアウト２/モダン  * &#x60;envelope_modern&#x60; - 封筒/モダン | 
**items** | [**List&lt;CompanyResponseCompanyItems&gt;**](CompanyResponseCompanyItems.md) |  |  [optional]
**minusFormat** | **Integer** | マイナスの表示方法（0: -、 1: △） | 
**name** | **String** | 事業所の正式名称 (100文字以内) | 
**nameKana** | **String** | 正式名称フリガナ (100文字以内) | 
**partners** | [**List&lt;CompanyResponseCompanyPartners&gt;**](CompanyResponseCompanyPartners.md) |  |  [optional]
**phone1** | **String** | 電話番号１ | 
**phone2** | **String** | 電話番号２ | 
**prefectureCode** | **Integer** | 都道府県コード（-1: 設定しない、0: 北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 | 
**privateSettlement** | **Boolean** | プライベート資金/役員資金（false: 使用しない、true: 使用する） | 
**role** | [**RoleEnum**](#RoleEnum) | ユーザーの権限 | 
**sections** | [**List&lt;CompanyResponseCompanySections&gt;**](CompanyResponseCompanySections.md) |  |  [optional]
**streetName1** | **String** | 市区町村・番地 | 
**streetName2** | **String** | 建物名・部屋番号など | 
**taxAtSourceCalcType** | **Integer** | 源泉徴収税計算（0: 消費税を含める、1: 消費税を含めない） | 
**taxCodes** | [**List&lt;CompanyResponseCompanyTaxCodes&gt;**](CompanyResponseCompanyTaxCodes.md) |  |  [optional]
**taxes** | [**List&lt;CompanyResponseCompanyTaxes&gt;**](CompanyResponseCompanyTaxes.md) |  |  [optional]
**txnNumberFormat** | [**TxnNumberFormatEnum**](#TxnNumberFormatEnum) | 仕訳番号形式（not_used: 使用しない、digits: 数字（例：5091824）、alnum: 英数字（例：59J0P）） | 
**usePartnerCode** | **Boolean** | 取引先コードの利用設定（true: 有効、 false: 無効） | 
**walletables** | [**List&lt;CompanyResponseCompanyWalletables&gt;**](CompanyResponseCompanyWalletables.md) |  |  [optional]
**workflowSetting** | [**WorkflowSettingEnum**](#WorkflowSettingEnum) | 仕訳承認フロー（enable: 有効、 disable: 無効） | 
**zipcode** | **String** | 郵便番号 | 



## Enum: IndustryClassEnum

Name | Value
---- | -----
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
LEISURE_ENTERTAINMENT | &quot;leisure_entertainment&quot;
LIFESTYLE | &quot;lifestyle&quot;
EDUCATION | &quot;education&quot;
MEDICAL_WELFARE | &quot;medical_welfare&quot;
OTHER_SERVICES | &quot;other_services&quot;
OTHER | &quot;other&quot;



## Enum: IndustryCodeEnum

Name | Value
---- | -----
AGRICULTURE | &quot;agriculture&quot;
FORESTRY | &quot;forestry&quot;
FISHING_INDUSTRY | &quot;fishing_industry&quot;
MINING | &quot;mining&quot;
CIVIL_CONTRACTORS | &quot;civil_contractors&quot;
PAVEMENT | &quot;pavement&quot;
CARPENTER | &quot;carpenter&quot;
RENOVATION | &quot;renovation&quot;
ELECTRICAL_PLUMBING | &quot;electrical_plumbing&quot;
GROCERY | &quot;grocery&quot;
MACHINERY_MANUFACTURING | &quot;machinery_manufacturing&quot;
PRINTING | &quot;printing&quot;
OTHER_MANUFACTURING | &quot;other_manufacturing&quot;
SOFTWARE_DEVELOPMENT | &quot;software_development&quot;
SYSTEM_DEVELOPMENT | &quot;system_development&quot;
SURVEY_ANALYSIS | &quot;survey_analysis&quot;
SERVER_MANAGEMENT | &quot;server_management&quot;
WEBSITE_PRODUCTION | &quot;website_production&quot;
ONLINE_SERVICE_MANAGEMENT | &quot;online_service_management&quot;
ONLINE_ADVERTISING_AGENCY | &quot;online_advertising_agency&quot;
ONLINE_ADVERTISING_PLANNING_PRODUCTION | &quot;online_advertising_planning_production&quot;
ONLINE_MEDIA_MANAGEMENT | &quot;online_media_management&quot;
PORTAL_SITE_MANAGEMENT | &quot;portal_site_management&quot;
OTHER_IT_SERVICES | &quot;other_it_services&quot;
TRANSPORT_DELIVERY | &quot;transport_delivery&quot;
DELIVERY | &quot;delivery&quot;
OTHER_TRANSPORTATION_LOGISTICS | &quot;other_transportation_logistics&quot;
OTHER_WHOLESALE | &quot;other_wholesale&quot;
CLOTHING_WHOLESALE_FIBER | &quot;clothing_wholesale_fiber&quot;
FOOD_WHOLESALE | &quot;food_wholesale&quot;
ENTRUSTED_DEVELOPMENT_WHOLESALE | &quot;entrusted_development_wholesale&quot;
ONLINE_SHOP | &quot;online_shop&quot;
FASHION_GROCERY_STORE | &quot;fashion_grocery_store&quot;
FOOD_STORE | &quot;food_store&quot;
ENTRUSTED_STORE | &quot;entrusted_store&quot;
OTHER_STORE | &quot;other_store&quot;
FINANCIAL_INSTRUMENTS_EXCHANGE | &quot;financial_instruments_exchange&quot;
COMMODITY_FUTURES_INVESTMENT_ADVISOR | &quot;commodity_futures_investment_advisor&quot;
OTHER_FINANCIAL | &quot;other_financial&quot;
BROKERAGE_INSURANCE | &quot;brokerage_insurance&quot;
OTHER_INSURANCE | &quot;other_insurance&quot;
REAL_ESTATE_DEVELOPER | &quot;real_estate_developer&quot;
REAL_ESTATE_BROKERAGE | &quot;real_estate_brokerage&quot;
RENT_COIN_PARKING_MANAGEMENT | &quot;rent_coin_parking_management&quot;
RENTAL_OFFICE_CO_WORKING_SPACE | &quot;rental_office_co_working_space&quot;
RENTAL_LEASE | &quot;rental_lease&quot;
CPA_TAX_ACCOUNTANT | &quot;cpa_tax_accountant&quot;
LAW_OFFICE | &quot;law_office&quot;
JUDICIAL_AND_ADMINISTRATIVE_SCRIVENER | &quot;judicial_and_administrative_scrivener&quot;
LABOR_CONSULTANT | &quot;labor_consultant&quot;
OTHER_PROFESSION | &quot;other_profession&quot;
BUSINESS_CONSULTANT | &quot;business_consultant&quot;
ACADEMIC_RESEARCH_DEVELOPMENT | &quot;academic_research_development&quot;
ADVERTISING_AGENCY | &quot;advertising_agency&quot;
ADVERTISING_PLANNING_PRODUCTION | &quot;advertising_planning_production&quot;
DESIGN_DEVELOPMENT | &quot;design_development&quot;
APPAREL_INDUSTRY_DESIGN | &quot;apparel_industry_design&quot;
WEBSITE_DESIGN | &quot;website_design&quot;
ADVERTISING_PLANNING_DESIGN | &quot;advertising_planning_design&quot;
OTHER_DESIGN | &quot;other_design&quot;
RESTAURANTS_COFFEE_SHOPS | &quot;restaurants_coffee_shops&quot;
SALE_OF_LUNCH | &quot;sale_of_lunch&quot;
BREAD_CONFECTIONERY_MANUFACTURE_SALE | &quot;bread_confectionery_manufacture_sale&quot;
DELIVERY_CATERING_MOBILE_CATERING | &quot;delivery_catering_mobile_catering&quot;
HOTEL_INN | &quot;hotel_inn&quot;
HOMESTAY | &quot;homestay&quot;
TRAVEL_AGENCY | &quot;travel_agency&quot;
LEISURE_SPORTS_FACILITY_MANAGEMENT | &quot;leisure_sports_facility_management&quot;
SHOW_EVENT_MANAGEMENT | &quot;show_event_management&quot;
BARBER | &quot;barber&quot;
BEAUTY_SALON | &quot;beauty_salon&quot;
SPA_SAND_BATH_SAUNA | &quot;spa_sand_bath_sauna&quot;
ESTE_AIL_SALON | &quot;este_ail_salon&quot;
BRIDAL_PLANNING_INTRODUCE_WEDDING | &quot;bridal_planning_introduce_wedding&quot;
MEMORIAL_CEREMONY_FUNERAL | &quot;memorial_ceremony_funeral&quot;
MOVING | &quot;moving&quot;
COURIER_INDUSTRY | &quot;courier_industry&quot;
HOUSE_MAID_CLEANING_AGENCY | &quot;house_maid_cleaning_agency&quot;
RE_TAILORING_CLOTHES | &quot;re_tailoring_clothes&quot;
TRAINING_INSTITUTE_MANAGEMENT | &quot;training_institute_management&quot;
TUTORING_SCHOOL | &quot;tutoring_school&quot;
MUSIC_CALLIGRAPHY_ABACUS_CLASSROOM | &quot;music_calligraphy_abacus_classroom&quot;
ENGLISH_SCHOOL | &quot;english_school&quot;
TENNIS_YOGA_JUDO_SCHOOL | &quot;tennis_yoga_judo_school&quot;
CULTURE_SCHOOL | &quot;culture_school&quot;
SEMINAR_PLANNING_MANAGEMENT | &quot;seminar_planning_management&quot;
HOSPITAL_CLINIC | &quot;hospital_clinic&quot;
DENTAL_CLINIC | &quot;dental_clinic&quot;
OTHER_MEDICAL_SERVICES | &quot;other_medical_services&quot;
NURSERY | &quot;nursery&quot;
NURSING_HOME | &quot;nursing_home&quot;
REHABILITATION_SUPPORT_SERVICES | &quot;rehabilitation_support_services&quot;
OTHER_WELFARE | &quot;other_welfare&quot;
VISIT_WELFARE_SERVICE | &quot;visit_welfare_service&quot;
RECRUITMENT_TEMPORARY_STAFFING | &quot;recruitment_temporary_staffing&quot;
LIFE_RELATED_RECRUITMENT_TEMPORARY_STAFFING | &quot;life_related_recruitment_temporary_staffing&quot;
CAR_MAINTENANCE_CAR_REPAIR | &quot;car_maintenance_car_repair&quot;
MACHINERY_EQUIPMENT_MAINTENANCE_REPAIR | &quot;machinery_equipment_maintenance_repair&quot;
CLEANING_MAINTENANCE_BUILDING_MANAGEMENT | &quot;cleaning_maintenance_building_management&quot;
SECURITY | &quot;security&quot;
OTHER_SERVICES | &quot;other_services&quot;
NPO | &quot;npo&quot;
GENERAL_INCORPORATED_ASSOCIATION | &quot;general_incorporated_association&quot;
GENERAL_INCORPORATED_FOUNDATION | &quot;general_incorporated_foundation&quot;
OTHER_ASSOCIATION | &quot;other_association&quot;



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



## Enum: RoleEnum

Name | Value
---- | -----
ADMIN | &quot;admin&quot;
SIMPLE_ACCOUNTING | &quot;simple_accounting&quot;
SELF_ONLY | &quot;self_only&quot;
READ_ONLY | &quot;read_only&quot;
WORKFLOW | &quot;workflow&quot;



## Enum: TxnNumberFormatEnum

Name | Value
---- | -----
NOT_USED | &quot;not_used&quot;
DIGITS | &quot;digits&quot;
ALNUM | &quot;alnum&quot;



## Enum: WorkflowSettingEnum

Name | Value
---- | -----
ENABLE | &quot;enable&quot;
DISABLE | &quot;disable&quot;



