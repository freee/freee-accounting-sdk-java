

# JournalsStatusResponseJournals

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 受け付けID | 
**companyId** | **Integer** | 事業所ID | 
**downloadType** | [**DownloadTypeEnum**](#DownloadTypeEnum) | ダウンロード形式 | 
**status** | [**StatusEnum**](#StatusEnum) | 事業所ID | 
**startDate** | **String** | 取得開始日 (yyyy-mm-dd) | 
**endDate** | **String** | 取得終了日 (yyyy-mm-dd) | 
**visibleTags** | [**List&lt;VisibleTagsEnum&gt;**](#List&lt;VisibleTagsEnum&gt;) |  | 
**downloadUrl** | **String** | ダウンロードURL |  [optional]



## Enum: DownloadTypeEnum

Name | Value
---- | -----
CSV | &quot;csv&quot;
GENERIC | &quot;generic&quot;
PDF | &quot;pdf&quot;



## Enum: StatusEnum

Name | Value
---- | -----
ENQUEUED | &quot;enqueued&quot;
WORKING | &quot;working&quot;
UPLOADED | &quot;uploaded&quot;
FAILED | &quot;failed&quot;



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



