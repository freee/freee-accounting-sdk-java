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
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.QuotationCreateParams;
import jp.co.freee.accounting.models.QuotationIndexResponse;
import jp.co.freee.accounting.models.QuotationResponse;
import jp.co.freee.accounting.models.QuotationUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface QuotationsApi {
  /**
   * 見積書の作成
   * 
   * @param quotationCreateParams 見積書の作成 (optional)
   * @return Observable&lt;QuotationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/quotations")
  Observable<QuotationResponse> createQuotation(
    @retrofit2.http.Body QuotationCreateParams quotationCreateParams
  );

  /**
   * 見積書の削除
   * 
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/quotations/{id}")
  Completable destroyQuotation(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 見積書の取得
   * 
   * @param id 見積書ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;QuotationResponse&gt;
   */
  @GET("api/1/quotations/{id}")
  Observable<QuotationResponse> getQuotation(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 見積書一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param partnerId 取引先IDで絞込 (optional)
   * @param partnerCode 取引先コードで絞込 (optional)
   * @param startIssueDate 見積日の開始日(yyyy-mm-dd) (optional)
   * @param endIssueDate 見積日の終了日(yyyy-mm-dd) (optional)
   * @param quotationNumber 見積書番号 (optional)
   * @param description 概要 (optional)
   * @param quotationStatus 見積書ステータス  (unsubmitted: 送付待ち, submitted: 送付済み, all: 全て) (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)  (optional)
   * @return Observable&lt;QuotationIndexResponse&gt;
   */
  @GET("api/1/quotations")
  Observable<QuotationIndexResponse> getQuotations(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("start_issue_date") String startIssueDate, @retrofit2.http.Query("end_issue_date") String endIssueDate, @retrofit2.http.Query("quotation_number") String quotationNumber, @retrofit2.http.Query("description") String description, @retrofit2.http.Query("quotation_status") String quotationStatus, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 見積書の更新
   * 
   * @param id 見積書ID (required)
   * @param quotationUpdateParams 見積書の更新 (optional)
   * @return Observable&lt;QuotationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/quotations/{id}")
  Observable<QuotationResponse> updateQuotation(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body QuotationUpdateParams quotationUpdateParams
  );

}
