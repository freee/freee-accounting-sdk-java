

# InlineResponse20010Taxes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available** | **Boolean** | true: 使用する、false: 使用しない | 
**code** | **Integer** | 税区分コード | 
**displayCategory** | [**DisplayCategoryEnum**](#DisplayCategoryEnum) | 税区分の表示カテゴリ（tax_5: 5%表示の税区分、tax_8: 8%表示の税区分、tax_r8: 軽減税率8%表示の税区分、tax_10: 10%表示の税区分、null: 税率未設定税区分） | 
**name** | **String** | 税区分名 | 
**nameJa** | **String** | 税区分名（日本語表示用） | 



## Enum: DisplayCategoryEnum

Name | Value
---- | -----
_5 | &quot;tax_5&quot;
_8 | &quot;tax_8&quot;
R8 | &quot;tax_r8&quot;
_10 | &quot;tax_10&quot;



