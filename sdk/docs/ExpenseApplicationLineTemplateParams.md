

# ExpenseApplicationLineTemplateParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **Integer** | 事業所ID | 
**name** | **String** | 経費科目名 | 
**accountItemsId** | **Integer** | 勘定科目ID |  [optional]
**itemId** | **Integer** | 品目ID |  [optional]
**taxCode** | **Integer** | 税区分コード（税区分のdisplay_categoryがtax_5: 5%表示の税区分, tax_r8: 軽減税率8%表示の税区分に該当するtax_codeのみ利用可能です。税区分のdisplay_categoryは /taxes/companies/{:company_id}のAPIから取得可能です。） | 
**description** | **String** | 経費科目の説明 |  [optional]
**lineDescription** | **String** | 内容の補足 |  [optional]



