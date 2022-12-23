

# RenewCreateParamsDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID | 
**amount** | **Long** | 取引金額（税込で指定してください）&lt;br&gt; マイナスの値を指定した場合、控除・マイナス行として登録されます。&lt;br&gt; 上記以外の値を指定した場合、通常行として登録されます。  | 
**description** | **String** | 備考 |  [optional]
**itemId** | **Integer** | 品目ID |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**segment1TagId** | **Long** | セグメント１ID |  [optional]
**segment2TagId** | **Long** | セグメント２ID |  [optional]
**segment3TagId** | **Long** | セグメント３ID |  [optional]
**tagIds** | **List&lt;Integer&gt;** | メモタグID |  [optional]
**taxCode** | **Integer** | 税区分コード | 
**vat** | **Long** | 消費税額（指定しない場合は自動で計算されます） |  [optional]



