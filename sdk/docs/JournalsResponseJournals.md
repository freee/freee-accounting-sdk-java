

# JournalsResponseJournals


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **Integer** | 事業所ID | 
**downloadType** | [**DownloadTypeEnum**](#DownloadTypeEnum) | ダウンロード形式 |  [optional]
**endDate** | **String** | 取得終了日 (yyyy-mm-dd) |  [optional]
**id** | **Integer** | 受け付けID | 
**messages** | **List&lt;String&gt;** |  |  [optional]
**startDate** | **String** | 取得開始日 (yyyy-mm-dd) |  [optional]
**statusUrl** | **String** | ステータス確認用URL |  [optional]
**upToDate** | **Boolean** | 集計結果が最新かどうか |  [optional]
**upToDateReasons** | [**List&lt;JournalsResponseJournalsUpToDateReasons&gt;**](JournalsResponseJournalsUpToDateReasons.md) | 集計が最新でない場合の要因情報 |  [optional]
**visibleIds** | [**List&lt;VisibleIdsEnum&gt;**](#List&lt;VisibleIdsEnum&gt;) |  |  [optional]
**visibleTags** | [**List&lt;VisibleTagsEnum&gt;**](#List&lt;VisibleTagsEnum&gt;) |  |  [optional]



## Enum: DownloadTypeEnum

Name | Value
---- | -----
CSV | &quot;csv&quot;
GENERIC | &quot;generic&quot;
PDF | &quot;pdf&quot;



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



