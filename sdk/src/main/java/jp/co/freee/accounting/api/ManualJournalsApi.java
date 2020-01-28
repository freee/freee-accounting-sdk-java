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
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ManualJournalsCreateParams;
import jp.co.freee.accounting.models.ManualJournalsCreateResponse;
import jp.co.freee.accounting.models.ManualJournalsIndexResponse;
import jp.co.freee.accounting.models.ManualJournalsShowResponse;
import jp.co.freee.accounting.models.ManualJournalsUpdateParams;
import jp.co.freee.accounting.models.ManualJournalsUpdateResponse;
import jp.co.freee.accounting.models.ServiceUnavailableError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ManualJournalsApi {
  /**
   * 振替伝票の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt;  &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt; &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;貸借合わせて100行まで仕訳行を登録できます。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt;&lt;/ul&gt;  
   * @param parameters 振替伝票の作成 (optional)
   * @return Observable&lt;ManualJournalsCreateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/manual_journals")
  Observable<ManualJournalsCreateResponse> createManualJournal(
    @retrofit2.http.Body ManualJournalsCreateParams parameters
  );

  /**
   * 振替伝票の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を削除する&lt;/p&gt;
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/manual_journals/{id}")
  Completable destroyManualJournal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 振替伝票の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt; &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt; &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt; &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;/ul&gt;
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ManualJournalsShowResponse&gt;
   */
  @GET("api/1/manual_journals/{id}")
  Observable<ManualJournalsShowResponse> getManualJournal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 振替伝票一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt;  &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt; &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt;&lt;/ul&gt;
   * @param companyId 事業所ID (required)
   * @param startIssueDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endIssueDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param entrySide 貸借で絞込 (貸方: credit, 借方: debit) (optional)
   * @param accountItemId 勘定科目IDで絞込 (optional)
   * @param minAmount 金額で絞込：下限 (optional)
   * @param maxAmount 金額で絞込：上限 (optional)
   * @param partnerId 取引先IDで絞込（0を指定すると、取引先が未選択の貸借行を絞り込めます） (optional)
   * @param partnerCode 取引先コードで絞込 (optional)
   * @param itemId 品目IDで絞込（0を指定すると、品目が未選択の貸借行を絞り込めます） (optional)
   * @param sectionId 部門IDで絞込（0を指定すると、部門が未選択の貸借行を絞り込めます） (optional)
   * @param segment1TagId セグメント１IDで絞り込み（0を指定すると、セグメント１が未選択の貸借行を絞り込めます） (optional)
   * @param segment2TagId セグメント２IDで絞り込み（0を指定すると、セグメント２が未選択の貸借行を絞り込めます） (optional)
   * @param segment3TagId セグメント３IDで絞り込み（0を指定すると、セグメント３が未選択の貸借行を絞り込めます） (optional)
   * @param commentStatus コメント状態で絞込（自分宛のコメント: posted_with_mention, 自分宛のコメント-未解決: raised_with_mention, 自分宛のコメント-解決済: resolved_with_mention, コメントあり: posted, 未解決: raised, 解決済: resolved, コメントなし: none） (optional)
   * @param commentImportant 重要コメント付きの振替伝票を絞込 (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） (optional)
   * @param txnNumber 仕訳番号で絞込（事業所の仕訳番号形式が有効な場合のみ） (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 500)  (optional)
   * @return Observable&lt;ManualJournalsIndexResponse&gt;
   */
  @GET("api/1/manual_journals")
  Observable<ManualJournalsIndexResponse> getManualJournals(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("start_issue_date") String startIssueDate, @retrofit2.http.Query("end_issue_date") String endIssueDate, @retrofit2.http.Query("entry_side") String entrySide, @retrofit2.http.Query("account_item_id") Integer accountItemId, @retrofit2.http.Query("min_amount") Integer minAmount, @retrofit2.http.Query("max_amount") Integer maxAmount, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("segment_1_tag_id") Integer segment1TagId, @retrofit2.http.Query("segment_2_tag_id") Integer segment2TagId, @retrofit2.http.Query("segment_3_tag_id") Integer segment3TagId, @retrofit2.http.Query("comment_status") String commentStatus, @retrofit2.http.Query("comment_important") Boolean commentImportant, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("txn_number") String txnNumber, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 振替伝票の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt;  &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt;  &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;貸借合わせて100行まで仕訳行を登録できます。&lt;/li&gt;  &lt;li&gt;detailsに含まれない既存の貸借行は削除されます。更新後も残したい行は、必ず貸借行IDを指定してdetailsに含めてください。&lt;/li&gt;  &lt;li&gt;detailsに含まれる貸借行IDの指定がある行は、更新行として扱われ更新されます。&lt;/li&gt;  &lt;li&gt;detailsに含まれる貸借行IDの指定がない行は、新規行として扱われ追加されます。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt;&lt;/ul&gt;  
   * @param id  (required)
   * @param parameters 振替伝票の更新 (optional)
   * @return Observable&lt;ManualJournalsUpdateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/manual_journals/{id}")
  Observable<ManualJournalsUpdateResponse> updateManualJournal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ManualJournalsUpdateParams parameters
  );

}
