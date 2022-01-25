

# PaymentRequestUpdateParamsPaymentRequestLines


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID |  [optional]
**amount** | **Integer** | 金額 | 
**description** | **String** | 内容 |  [optional]
**id** | **Long** | 支払依頼の項目行ID: 既存項目行を更新する場合に指定します。IDを指定しない項目行は、新規行として扱われ追加されます。また、payment_request_linesに含まれない既存の項目行は削除されます。更新後も残したい行は、必ず支払依頼の項目行IDを指定してpayment_request_linesに含めてください。 |  [optional]
**itemId** | **Integer** | 品目ID |  [optional]
**lineType** | [**LineTypeEnum**](#LineTypeEnum) | &#39;行の種類 (deal_line: 支払依頼, withholding_tax: 源泉徴収税)&#39;&lt;br&gt; &#39;デフォルトは deal_line: 支払依頼 です&#39;  |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**segment1TagId** | **Long** | セグメント１ID&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt;  |  [optional]
**segment2TagId** | **Long** | セグメント２ID(法人向けエンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt;  |  [optional]
**segment3TagId** | **Long** | セグメント３ID(法人向けエンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt;  |  [optional]
**tagIds** | **List&lt;Integer&gt;** | メモタグID |  [optional]
**taxCode** | **Integer** | 税区分コード&lt;br&gt; 勘定科目IDを指定する場合は必須です。  |  [optional]



## Enum: LineTypeEnum

Name | Value
---- | -----
DEAL_LINE | &quot;deal_line&quot;
WITHHOLDING_TAX | &quot;withholding_tax&quot;



