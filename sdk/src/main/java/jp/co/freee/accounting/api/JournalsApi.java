package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import java.io.File;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.JournalStatusResponse;
import jp.co.freee.accounting.models.JournalsResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface JournalsApi {
  /**
   * ダウンロード実行
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ダウンロードを実行する&lt;/p&gt;  &lt;p&gt;＊このAPIは無料プランのアカウントではご利用になれません&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;id : 受け付けID&lt;/li&gt; &lt;/ul&gt;
   * @param id 受け付けID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ResponseBody&gt;
   */
  @GET("api/1/journals/reports/{id}/download")
  Observable<ResponseBody> downloadJournal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * ステータス確認
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ダウンロードリクエストのステータスを確認する&lt;/p&gt;  &lt;p&gt;＊このAPIは無料プランのアカウントではご利用になれません&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;status&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;enqueued : 実行待ち&lt;/li&gt;  &lt;li&gt;working : 実行中&lt;/li&gt;  &lt;li&gt;uploaded : 準備完了&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;id : 受け付けID&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
   * @param id 受け付けID (required)
   * @param companyId 事業所ID (required)
   * @param visibleTags 補助科目やコメントとして出力する項目 (optional)
   * @param startDate 取得開始日 (yyyy-mm-dd) (optional)
   * @param endDate 取得終了日 (yyyy-mm-dd) (optional)
   * @return Observable&lt;JournalStatusResponse&gt;
   */
  @GET("api/1/journals/reports/{id}/status")
  Observable<JournalStatusResponse> getJournalStatus(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("visible_tags[]") List<String> visibleTags, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate
  );

  /**
   * ダウンロード要求
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザーが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/204599604#2\&quot;&gt;ヘルプページ&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;p&gt;＊このAPIは無料プランのアカウントではご利用になれません&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;download_type &lt;ul&gt; &lt;li&gt;generic(freee Webからダウンロードできるものと同じ)&lt;/li&gt; &lt;li&gt;csv (yayoi形式)&lt;/li&gt; &lt;li&gt;pdf&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt;visible_tags : 指定しない場合は従来の仕様の仕訳帳が出力されます &lt;ul&gt; &lt;li&gt;partner : 取引先タグ&lt;/li&gt; &lt;li&gt;item : 品目タグ&lt;/li&gt; &lt;li&gt;tag : メモタグ&lt;/li&gt; &lt;li&gt;section : 部門タグ&lt;/li&gt; &lt;li&gt;description : 備考欄&lt;/li&gt; &lt;li&gt;wallet_txn_description : 明細の備考欄&lt;/li&gt;       &lt;li&gt;         segment_1_tag : セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン)&lt;br&gt;         segment_2_tag : セグメント2(法人向け エンタープライズプラン)&lt;br&gt;         segment_3_tag : セグメント3(法人向け エンタープライズプラン)&lt;br&gt;&lt;br&gt;         &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611-%E3%82%BB%E3%82%B0%E3%83%A1%E3%83%B3%E3%83%88-%E5%88%86%E6%9E%90%E7%94%A8%E3%82%BF%E3%82%B0-%E3%81%AE%E8%A8%AD%E5%AE%9A\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt;       &lt;/li&gt;       &lt;li&gt;all : 指定された場合は上記の設定をすべて有効として扱いますが、セグメント1、セグメント2、セグメント3は含みません。セグメントが必要な場合はallではなく、segment_1_tag, segment_2_tag, segment_3_tagを指定してください。&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt;id : 受け付けID&lt;/li&gt; &lt;/ul&gt;
   * @param downloadType ダウンロード形式 (required)
   * @param companyId 事業所ID (required)
   * @param visibleTags 補助科目やコメントとして出力する項目 (optional)
   * @param startDate 取得開始日 (yyyy-mm-dd) (optional)
   * @param endDate 取得終了日 (yyyy-mm-dd) (optional)
   * @return Observable&lt;JournalsResponse&gt;
   */
  @GET("api/1/journals")
  Observable<JournalsResponse> getJournals(
    @retrofit2.http.Query("download_type") String downloadType, @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("visible_tags[]") List<String> visibleTags, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate
  );

}
