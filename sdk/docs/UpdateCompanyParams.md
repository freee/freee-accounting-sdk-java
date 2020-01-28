

# UpdateCompanyParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 事業所の正式名称 (100文字以内) |  [optional]
**nameKana** | **String** | 正式名称フリガナ (100文字以内) |  [optional]
**contactName** | **String** | user1 |  [optional]
**addressAttributes** | [**UpdateCompanyParamsAddressAttributes**](UpdateCompanyParamsAddressAttributes.md) |  |  [optional]
**phone1** | **String** | 電話番号１ |  [optional]
**phone2** | **String** | 電話番号２ |  [optional]
**fax** | **String** | FAX |  [optional]
**salesInformationAttributes** | [**UpdateCompanyParamsSalesInformationAttributes**](UpdateCompanyParamsSalesInformationAttributes.md) |  |  [optional]
**headCount** | [**BigDecimal**](BigDecimal.md) | 従業員数（0: 経営者のみ、1: 2~5人、2: 6~10人、3: 11~20人、4: 21~30人、5: 31~40人、6: 41~100人、7: 100人以上 |  [optional]
**corporateNumber** | **String** | 法人番号 (半角数字13桁、法人のみ) |  [optional]
**fiscalYearsAttributes** | [**UpdateCompanyParamsFiscalYearsAttributes**](UpdateCompanyParamsFiscalYearsAttributes.md) |  |  [optional]
**docTemplate** | [**UpdateCompanyParamsDocTemplate**](UpdateCompanyParamsDocTemplate.md) |  |  [optional]
**txnNumberFormat** | [**TxnNumberFormatEnum**](#TxnNumberFormatEnum) | 仕訳番号形式（not_used: 使用しない、digits: 数字（例：5091824）、alnum: 英数字（例：59J0P））Available values : not_used, digits, alnum |  [optional]
**privateSettlement** | **Integer** | プライベート資金/役員資金（0: 使用しない、1: 使用する） |  [optional]



## Enum: TxnNumberFormatEnum

Name | Value
---- | -----
NOT_USED | &quot;not_used&quot;
DIGITS | &quot;digits&quot;
ALNUM | &quot;alnum&quot;



