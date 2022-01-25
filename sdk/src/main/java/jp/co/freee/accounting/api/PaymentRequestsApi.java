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
import jp.co.freee.accounting.models.PaymentRequestActionCreateParams;
import jp.co.freee.accounting.models.PaymentRequestCreateParams;
import jp.co.freee.accounting.models.PaymentRequestResponse;
import jp.co.freee.accounting.models.PaymentRequestUpdateParams;
import jp.co.freee.accounting.models.PaymentRequestsIndexResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PaymentRequestsApi {
  /**
   * 支払依頼の作成
   * 
   * @param paymentRequestCreateParams 支払依頼の作成 (optional)
   * @return Observable&lt;PaymentRequestResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/payment_requests")
  Observable<PaymentRequestResponse> createPaymentRequest(
    @retrofit2.http.Body PaymentRequestCreateParams paymentRequestCreateParams
  );

  /**
   * 支払依頼の削除
   * 
   * @param id 支払依頼ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/payment_requests/{id}")
  Completable destroyPaymentRequest(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 支払依頼詳細の取得
   * 
   * @param id 支払依頼ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;PaymentRequestResponse&gt;
   */
  @GET("api/1/payment_requests/{id}")
  Observable<PaymentRequestResponse> getPaymentRequest(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 支払依頼一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param status &#39;申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)、 取引ステータス(unsettled:支払待ち, settled:支払済み)&#39;&lt;br&gt; approver_id を指定した場合は無効です。  (optional)
   * @param startApplicationDate 申請日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endApplicationDate 申請日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param startIssueDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endIssueDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param applicationNumber 申請No. (optional)
   * @param title 申請タイトル (optional)
   * @param applicantId 申請者のユーザーID (optional)
   * @param approverId 承認者のユーザーID&lt;br&gt; &#39;approver_id を指定した場合は、 in_progress: 申請中 の支払依頼のみを返します。&#39;  (optional)
   * @param minAmount 金額で絞込 (下限金額) (optional)
   * @param maxAmount 金額で絞込 (上限金額) (optional)
   * @param partnerId 取引先IDで絞込 (optional)
   * @param partnerCode 取引先コードで絞込 (optional)
   * @param paymentMethod 支払方法で絞込 (none: 指定なし, domestic_bank_transfer: 国内振込, abroad_bank_transfer: 国外振込, account_transfer: 口座振替, credit_card: クレジットカード) (optional)
   * @param startPaymentDate 支払期限で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endPaymentDate 支払期限で絞込：終了日(yyyy-mm-dd) (optional)
   * @param documentCode 請求書番号で絞込 (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500) (optional)
   * @return Observable&lt;PaymentRequestsIndexResponse&gt;
   */
  @GET("api/1/payment_requests")
  Observable<PaymentRequestsIndexResponse> getPaymentRequests(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("start_application_date") String startApplicationDate, @retrofit2.http.Query("end_application_date") String endApplicationDate, @retrofit2.http.Query("start_issue_date") String startIssueDate, @retrofit2.http.Query("end_issue_date") String endIssueDate, @retrofit2.http.Query("application_number") Integer applicationNumber, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("applicant_id") Integer applicantId, @retrofit2.http.Query("approver_id") Integer approverId, @retrofit2.http.Query("min_amount") Integer minAmount, @retrofit2.http.Query("max_amount") Integer maxAmount, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("payment_method") String paymentMethod, @retrofit2.http.Query("start_payment_date") String startPaymentDate, @retrofit2.http.Query("end_payment_date") String endPaymentDate, @retrofit2.http.Query("document_code") String documentCode, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 支払依頼の更新
   * 
   * @param id 支払依頼ID (required)
   * @param paymentRequestUpdateParams 支払依頼の更新 (optional)
   * @return Observable&lt;PaymentRequestResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/payment_requests/{id}")
  Observable<PaymentRequestResponse> updatePaymentRequest(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PaymentRequestUpdateParams paymentRequestUpdateParams
  );

  /**
   * 支払依頼の承認操作
   * 
   * @param id 支払依頼ID (required)
   * @param paymentRequestActionCreateParams 支払依頼の承認操作 (required)
   * @return Observable&lt;PaymentRequestResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/payment_requests/{id}/actions")
  Observable<PaymentRequestResponse> updatePaymentRequestAction(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PaymentRequestActionCreateParams paymentRequestActionCreateParams
  );

}
