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
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2004;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ManualJournalCreateParams;
import jp.co.freee.accounting.models.ManualJournalResponse;
import jp.co.freee.accounting.models.ManualJournalUpdateParams;
import jp.co.freee.accounting.models.ServiceUnavailableError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ManualJournalsApi {
  /**
   * 振替伝票の作成
   * 
   * @param manualJournalCreateParams 振替伝票の作成 (optional)
   * @return Observable&lt;ManualJournalResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/manual_journals")
  Observable<ManualJournalResponse> createManualJournal(
    @retrofit2.http.Body ManualJournalCreateParams manualJournalCreateParams
  );

  /**
   * 振替伝票の削除
   * 
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
   * 
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ManualJournalResponse&gt;
   */
  @GET("api/1/manual_journals/{id}")
  Observable<ManualJournalResponse> getManualJournal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 振替伝票一覧の取得
   * 
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
   * @param segment1TagId セグメント１IDで絞込（0を指定すると、セグメント１が未選択の貸借行を絞り込めます） (optional)
   * @param segment2TagId セグメント２IDで絞込（0を指定すると、セグメント２が未選択の貸借行を絞り込めます） (optional)
   * @param segment3TagId セグメント３IDで絞込（0を指定すると、セグメント３が未選択の貸借行を絞り込めます） (optional)
   * @param commentStatus コメント状態で絞込（自分宛のコメント: posted_with_mention, 自分宛のコメント-未解決: raised_with_mention, 自分宛のコメント-解決済: resolved_with_mention, コメントあり: posted, 未解決: raised, 解決済: resolved, コメントなし: none） (optional)
   * @param commentImportant 重要コメント付きの振替伝票を絞込 (optional)
   * @param adjustment 決算整理仕訳で絞込（決算整理仕訳のみ: only, 決算整理仕訳以外: without） (optional)
   * @param txnNumber 仕訳番号で絞込（事業所の仕訳番号形式が有効な場合のみ） (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 500)  (optional)
   * @return Observable&lt;InlineResponse2004&gt;
   */
  @GET("api/1/manual_journals")
  Observable<InlineResponse2004> getManualJournals(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("start_issue_date") String startIssueDate, @retrofit2.http.Query("end_issue_date") String endIssueDate, @retrofit2.http.Query("entry_side") String entrySide, @retrofit2.http.Query("account_item_id") Integer accountItemId, @retrofit2.http.Query("min_amount") Long minAmount, @retrofit2.http.Query("max_amount") Long maxAmount, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("item_id") Integer itemId, @retrofit2.http.Query("section_id") Integer sectionId, @retrofit2.http.Query("segment_1_tag_id") Long segment1TagId, @retrofit2.http.Query("segment_2_tag_id") Long segment2TagId, @retrofit2.http.Query("segment_3_tag_id") Long segment3TagId, @retrofit2.http.Query("comment_status") String commentStatus, @retrofit2.http.Query("comment_important") Boolean commentImportant, @retrofit2.http.Query("adjustment") String adjustment, @retrofit2.http.Query("txn_number") String txnNumber, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 振替伝票の更新
   * 
   * @param id  (required)
   * @param manualJournalUpdateParams 振替伝票の更新 (optional)
   * @return Observable&lt;ManualJournalResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/manual_journals/{id}")
  Observable<ManualJournalResponse> updateManualJournal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ManualJournalUpdateParams manualJournalUpdateParams
  );

}
