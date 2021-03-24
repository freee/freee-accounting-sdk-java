

# CompanyParamsFiscalYears


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingPeriod** | **Integer** | 期 |  [optional]
**depreciationFraction** | **Integer** | 減価償却端数処理法(法人のみ)(0: 切り捨て、1: 切り上げ) |  [optional]
**endDate** | **String** | 期末日（決算日） |  [optional]
**indirectWriteOffMethod** | **Boolean** | 固定資産の控除法（true: 間接控除法、false: 直接控除法） |  [optional]
**indirectWriteOffMethodType** | **Boolean** | 間接控除時の累計額（true: 資産分類別、false: 共通） |  [optional]
**returnCode** | **Integer** | 不動産所得使用区分（0: 一般、3: 一般/不動産） ※個人事業主のみ設定可能 |  [optional]
**startDate** | **String** | 期首日 |  [optional]
**taxFraction** | **Integer** | 消費税端数処理方法（0: 切り上げ、1: 切り捨て, 2: 四捨五入） |  [optional]
**useIndustryTemplate** | **Boolean** | 製造業向け機能（true: 使用する、false: 使用しない） |  [optional]



