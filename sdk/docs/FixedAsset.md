

# FixedAsset


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID |  [optional]
**acquisitionCost** | **Integer** | 取得価額 |  [optional]
**acquisitionDate** | **LocalDate** | 取得日 |  [optional]
**cityName** | **String** | 申告先市区町村 |  [optional]
**closingAccumulatedDepreciation** | **Integer** | 期末減価償却累計額 |  [optional]
**closingBalance** | **Integer** | 未償却残高(期末残高) |  [optional]
**companyId** | **Integer** | 事業所ID | 
**depreciationAccountItemId** | **Integer** | 減価償却に使う勘定科目ID |  [optional]
**depreciationAmount** | **Integer** | 減価償却費 |  [optional]
**depreciationMethod** | [**DepreciationMethodEnum**](#DepreciationMethodEnum) | 償却方法:(少額償却: small_sum_method, 一括償却: lump_sum_method, 定額法: straight_line_method, 定率法: multiple_method, 旧定率法: old_multiple_method, 旧定額法: old_straight_line_method, 償却なし: non_depreciate_method, 任意償却: voluntary_method, 即時償却: immediate_method, 均等償却: equal_method) |  [optional]
**id** | **Integer** | 固定資産ID | 
**itemId** | **Integer** | 品目ID |  [optional]
**lifeYears** | **Integer** | 耐用年数 |  [optional]
**managementNumber** | **String** | 管理番号 |  [optional]
**name** | **String** | 固定資産名 | 
**openingAccumulatedDepreciation** | **Integer** | 期首減価償却累計額 |  [optional]
**openingBalance** | **Integer** | 期首残高 |  [optional]
**prefectureCode** | **Integer** | 都道府県コード（-1: 設定しない、0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 |  [optional]
**retireDate** | **LocalDate** | 除却日、もしくは売却日 |  [optional]
**retireType** | [**RetireTypeEnum**](#RetireTypeEnum) | 売却もしくは除却ステータス: (売却: sell, 除却: retire, 償却中: depreciating) |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**updatedAt** | **LocalDate** | 更新日 |  [optional]



## Enum: DepreciationMethodEnum

Name | Value
---- | -----
SMALL_SUM_METHOD | &quot;small_sum_method&quot;
LUMP_SUM_METHOD | &quot;lump_sum_method&quot;
STRAIGHT_LINE_METHOD | &quot;straight_line_method&quot;
MULTIPLE_METHOD | &quot;multiple_method&quot;
OLD_MULTIPLE_METHOD | &quot;old_multiple_method&quot;
OLD_STRAIGHT_LINE_METHOD | &quot;old_straight_line_method&quot;
NON_DEPRECIATE_METHOD | &quot;non_depreciate_method&quot;
VOLUNTARY_METHOD | &quot;voluntary_method&quot;
IMMEDIATE_METHOD | &quot;immediate_method&quot;
EQUAL_METHOD | &quot;equal_method&quot;



## Enum: RetireTypeEnum

Name | Value
---- | -----
SELL | &quot;sell&quot;
RETIRE | &quot;retire&quot;
DEPRECIATING | &quot;depreciating&quot;



