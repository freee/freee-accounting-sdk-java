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
import jp.co.freee.accounting.models.DealCreateParams;
import jp.co.freee.accounting.models.DealCreateResponse;
import jp.co.freee.accounting.models.DealResponse;
import jp.co.freee.accounting.models.DealUpdateParams;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2001;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DealsApi {
  /**
   * 取引（収入／支出）の作成
   * 
   * @param dealCreateParams 取引（収入／支出）の作成 (optional)
   * @return Observable&lt;DealCreateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/deals")
  Observable<DealCreateResponse> createDeal(
    @retrofit2.http.Body DealCreateParams dealCreateParams
  );

  /**
   * 取引（収入／支出）の削除
   * 
   * @param id 取引ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/deals/{id}")
  Completable destroyDeal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引（収入／支出）の取得
   * 
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @param accruals 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する） (optional)
   * @return Observable&lt;DealResponse&gt;
   */
  @GET("api/1/deals/{id}")
  Observable<DealResponse> getDeal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("accruals") String accruals
  );

  /**
   * 取引（収入／支出）一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param partnerId 取引先IDで絞込 (optional)
   * @param accountItemId 勘定科目IDで絞込 (optional)
   * @param partnerCode 取引先コードで絞込 (optional)
   * @param status 決済状況で絞込 (未決済: unsettled, 完了: settled) (optional)
   * @param type 収支区分 (収入: income, 支出: expense) (optional)
   * @param startIssueDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endIssueDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param startDueDate 支払期日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDueDate 支払期日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param startRenewDate +更新日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endRenewDate +更新日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)  (optional)
   * @param registeredFrom 取引登録元アプリで絞込（me: 本APIを叩くアプリ自身から登録した取引のみ） (optional)
   * @param accruals 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する） (optional)
   * @return Observable&lt;InlineResponse2001&gt;
   */
  @GET("api/1/deals")
  Observable<InlineResponse2001> getDeals(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("account_item_id") Integer accountItemId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("type") String type, @retrofit2.http.Query("start_issue_date") String startIssueDate, @retrofit2.http.Query("end_issue_date") String endIssueDate, @retrofit2.http.Query("start_due_date") String startDueDate, @retrofit2.http.Query("end_due_date") String endDueDate, @retrofit2.http.Query("start_renew_date") String startRenewDate, @retrofit2.http.Query("end_renew_date") String endRenewDate, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("registered_from") String registeredFrom, @retrofit2.http.Query("accruals") String accruals
  );

  /**
   * 取引（収入／支出）の更新
   * 
   * @param id 取引ID (required)
   * @param dealUpdateParams 取引（収入／支出）の更新 (optional)
   * @return Observable&lt;DealResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/deals/{id}")
  Observable<DealResponse> updateDeal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body DealUpdateParams dealUpdateParams
  );

}
