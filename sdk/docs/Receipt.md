

# Receipt


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **String** | 作成日時（ISO8601形式） | 
**description** | **String** | メモ |  [optional]
**fileSrc** | **String** | ファイルのダウンロードURL（freeeにログインした状態でのみ閲覧可能です。） &lt;br&gt; &lt;br&gt; file_srcは廃止予定の属性になります。&lt;br&gt; file_srcに替わり、証憑ファイルのダウンロード APIをご利用ください。&lt;br&gt; 証憑ファイルのダウンロードAPIを利用することで、以下のようになります。 &lt;ul&gt;   &lt;li&gt;アプリケーション利用者はfreee APIアプリケーションにログインしていれば、証憑ダウンロード毎にfreeeに改めてログインすることなくファイルが参照できるようになります。&lt;/li&gt; &lt;/ul&gt; | 
**id** | **Integer** | 証憑ファイルID | 
**issueDate** | **String** | 発生日 |  [optional]
**mimeType** | **String** | MIMEタイプ | 
**origin** | [**OriginEnum**](#OriginEnum) | アップロード元種別 | 
**status** | [**StatusEnum**](#StatusEnum) | ステータス(unconfirmed:確認待ち、confirmed:確認済み、deleted:削除済み、ignored:無視) | 
**user** | [**DealUser**](DealUser.md) |  | 



## Enum: OriginEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
WEB | &quot;web&quot;
MOBILE_CAMERA | &quot;mobile_camera&quot;
MOBILE_ALBUM | &quot;mobile_album&quot;
SCANSNAP | &quot;scansnap&quot;
SCANNABLE | &quot;scannable&quot;
DROPBOX | &quot;dropbox&quot;
MAIL | &quot;mail&quot;
SAFETY_CONTACT_FILE | &quot;safety_contact_file&quot;
PUBLIC_API | &quot;public_api&quot;



## Enum: StatusEnum

Name | Value
---- | -----
UNCONFIRMED | &quot;unconfirmed&quot;
CONFIRMED | &quot;confirmed&quot;
DELETED | &quot;deleted&quot;
IGNORED | &quot;ignored&quot;



