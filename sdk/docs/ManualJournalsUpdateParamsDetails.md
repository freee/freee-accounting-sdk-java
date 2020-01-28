

# ManualJournalsUpdateParamsDetails

貸借行一覧（配列）: 貸借合わせて100行まで登録できます。
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 貸借行ID: 既存貸借行を更新または削除する場合に指定します。IDを指定しない貸借行は、新規行として扱われ追加されます。 |  [optional]
**entrySide** | [**EntrySideEnum**](#EntrySideEnum) | 貸借（貸方: credit, 借方: debit） | 
**taxCode** | **Integer** | 税区分コード | 
**accountItemId** | **Integer** | 勘定科目ID | 
**amount** | **Integer** | 取引金額（税込で指定してください） | 
**vat** | **Integer** | 消費税額（指定しない場合は自動で計算されます） |  [optional]
**partnerId** | **Integer** | 取引先ID |  [optional]
**partnerCode** | **String** | 取引先コード |  [optional]
**itemId** | **Integer** | 品目ID |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**tagIds** | **List&lt;Integer&gt;** | メモタグID |  [optional]
**segment1TagId** | **Integer** | セグメント１ID |  [optional]
**segment2TagId** | **Integer** | セグメント２ID |  [optional]
**segment3TagId** | **Integer** | セグメント３ID |  [optional]
**description** | **String** | 備考 |  [optional]



## Enum: EntrySideEnum

Name | Value
---- | -----
DEBIT | &quot;debit&quot;
CREDIT | &quot;credit&quot;



