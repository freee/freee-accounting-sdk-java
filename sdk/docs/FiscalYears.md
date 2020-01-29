

# FiscalYears

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useIndustryTemplate** | **Boolean** | 製造業向け機能（true: 使用する、false: 使用しない） | 
**indirectWriteOffMethod** | **Boolean** | 固定資産の控除法(false: 減価償却累計額でまとめる、true: 独立間接控除方式) | 
**startDate** | **String** | 期首日 |  [optional]
**endDate** | **String** | 期末日 |  [optional]
**depreciationRecordMethod** | **Integer** | 月次償却（0: しない、1: する） | 
**taxMethod** | **Integer** | 課税区分（0: 免税、1: 簡易課税、2: 本則課税（個別対応方式）、3: 本則課税（一括比例配分方式）、4: 本則課税（全額控除）） | 
**salesTaxBusinessCode** | **Integer** | 簡易課税用事業区分（0: 第一種：卸売業、1: 第二種：小売業、2: 第三種：農林水産業、工業、建設業、製造業など、3: 第四種：飲食店業など、4: 第五種：金融・保険業、運輸通信業、サービス業など、5: 第六種：不動産業など | 
**taxFraction** | **Integer** | 消費税端数処理方法（0: 切り捨て、1: 切り上げ、2: 四捨五入） | 
**taxAccountMethod** | **Integer** | 消費税経理処理方法（0: 税込経理、1: 旧税抜経理、2: 税抜経理） | 
**returnCode** | **Integer** | 不動産所得使用区分（0: 一般、1: 一般/不動産） ※個人事業主のみ設定可能 | 



