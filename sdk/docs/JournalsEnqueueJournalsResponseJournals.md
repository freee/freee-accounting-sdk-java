

# JournalsEnqueueJournalsResponseJournals

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 受け付けID | 
**messages** | **String** | 受け付けメッセージ |  [optional]
**companyId** | **Integer** | 事業所ID | 
**downloadType** | [**DownloadTypeEnum**](#DownloadTypeEnum) | ダウンロード形式 |  [optional]
**startDate** | **String** | 取得開始日 (yyyy-mm-dd) |  [optional]
**endDate** | **String** | 取得終了日 (yyyy-mm-dd) |  [optional]
**visibleTags** | [**List&lt;VisibleTagsEnum&gt;**](#List&lt;VisibleTagsEnum&gt;) |  |  [optional]
**statusUrl** | **String** | ステータス確認用URL |  [optional]



## Enum: DownloadTypeEnum

Name | Value
---- | -----
CSV | &quot;csv&quot;
GENERIC | &quot;generic&quot;
PDF | &quot;pdf&quot;



## Enum: List&lt;VisibleTagsEnum&gt;

Name | Value
---- | -----
PARTNER | &quot;partner&quot;
ITEM | &quot;item&quot;
TAG | &quot;tag&quot;
SECTION | &quot;section&quot;
DESCRIPTION | &quot;description&quot;
WALLET_TXN_DESCRIPTION | &quot;wallet_txn_description&quot;
ALL | &quot;all&quot;



