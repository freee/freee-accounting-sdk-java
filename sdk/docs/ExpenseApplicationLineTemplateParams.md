

# ExpenseApplicationLineTemplateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID | 
**companyId** | **Integer** | 事業所ID | 
**description** | **String** | 経費科目の説明 (1000文字以内) |  [optional]
**itemId** | **Integer** | 品目ID |  [optional]
**lineDescription** | **String** | 内容の補足 (1000文字以内) |  [optional]
**name** | **String** | 経費科目名 (100文字以内) | 
**requiredReceipt** | **Boolean** | 添付ファイルの必須/任意&lt;br&gt; falseを指定した時は申請時の領収書の添付を任意とします。&lt;br&gt; trueを指定した時は申請時の領収書の添付を必須とします。&lt;br&gt; 未指定の時は申請時の領収書の添付を任意とします。 |  [optional]
**taxCode** | **Integer** | 税区分コード（税区分のdisplay_categoryがtax_5: 5%表示の税区分, tax_r8: 軽減税率8%表示の税区分に該当するtax_codeのみ利用可能です。税区分のdisplay_categoryは /taxes/companies/{:company_id}のAPIから取得可能です。） | 



