

# JournalStatusResponseJournals


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **Integer** | 事業所ID | 
**downloadType** | [**DownloadTypeEnum**](#DownloadTypeEnum) | ダウンロード形式 | 
**downloadUrl** | **String** | ダウンロードURL |  [optional]
**endDate** | **String** | 取得終了日 (yyyy-mm-dd) | 
**id** | **Integer** | 受け付けID | 
**startDate** | **String** | 取得開始日 (yyyy-mm-dd) | 
**status** | [**StatusEnum**](#StatusEnum) | ダウンロードリクエストのステータス | 
**visibleIds** | [**List&lt;VisibleIdsEnum&gt;**](#List&lt;VisibleIdsEnum&gt;) |  |  [optional]
**visibleTags** | [**List&lt;VisibleTagsEnum&gt;**](#List&lt;VisibleTagsEnum&gt;) |  |  [optional]



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



## Enum: List&lt;VisibleIdsEnum&gt;

Name | Value
---- | -----
DEAL_ID | &quot;deal_id&quot;
TRANSFER_ID | &quot;transfer_id&quot;
MANUAL_JOURNAL_ID | &quot;manual_journal_id&quot;



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
SEGMENT_1_TAG | &quot;segment_1_tag&quot;
SEGMENT_2_TAG | &quot;segment_2_tag&quot;
SEGMENT_3_TAG | &quot;segment_3_tag&quot;



