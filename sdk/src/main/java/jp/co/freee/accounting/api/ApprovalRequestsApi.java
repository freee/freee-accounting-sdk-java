package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.ApprovalRequestActionCreateParams;
import jp.co.freee.accounting.models.ApprovalRequestCreateParams;
import jp.co.freee.accounting.models.ApprovalRequestFormIndexResponse;
import jp.co.freee.accounting.models.ApprovalRequestFormResponse;
import jp.co.freee.accounting.models.ApprovalRequestResponse;
import jp.co.freee.accounting.models.ApprovalRequestUpdateParams;
import jp.co.freee.accounting.models.ApprovalRequestsIndexResponse;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ApprovalRequestsApi {
  /**
   * 各種申請の作成
   * 
   * @param approvalRequestCreateParams 各種申請の作成 (optional)
   * @return Observable&lt;ApprovalRequestResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/approval_requests")
  Observable<ApprovalRequestResponse> createApprovalRequest(
    @retrofit2.http.Body ApprovalRequestCreateParams approvalRequestCreateParams
  );

  /**
   * 各種申請の削除
   * 
   * @param id 各種申請ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/approval_requests/{id}")
  Completable destroyApprovalRequest(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 各種申請の取得
   * 
   * @param id 各種申請ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ApprovalRequestResponse&gt;
   */
  @GET("api/1/approval_requests/{id}")
  Observable<ApprovalRequestResponse> getApprovalRequest(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 各種申請の申請フォームの取得
   * 
   * @param id 申請フォームID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ApprovalRequestFormResponse&gt;
   */
  @GET("api/1/approval_requests/forms/{id}")
  Observable<ApprovalRequestFormResponse> getApprovalRequestForm(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 各種申請の申請フォーム一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ApprovalRequestFormIndexResponse&gt;
   */
  @GET("api/1/approval_requests/forms")
  Observable<ApprovalRequestFormIndexResponse> getApprovalRequestForms(
    @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 各種申請の一覧
   * 
   * @param companyId 事業所ID (required)
   * @param status 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し) 承認者指定時には無効です。 (optional)
   * @param applicationNumber 申請No. (optional)
   * @param title 申請タイトル (optional)
   * @param formId 申請フォームID (optional)
   * @param startApplicationDate 申請日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endApplicationDate 申請日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param applicantId 申請者のユーザーID (optional)
   * @param minAmount 金額で絞込：以上 (optional)
   * @param maxAmount 金額で絞込：以下 (optional)
   * @param approverId 承認者のユーザーID 承認者指定時には申請ステータスが申請中のものだけが取得可能です。 (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500) (optional)
   * @return Observable&lt;ApprovalRequestsIndexResponse&gt;
   */
  @GET("api/1/approval_requests")
  Observable<ApprovalRequestsIndexResponse> getApprovalRequests(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("application_number") Integer applicationNumber, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("form_id") Integer formId, @retrofit2.http.Query("start_application_date") String startApplicationDate, @retrofit2.http.Query("end_application_date") String endApplicationDate, @retrofit2.http.Query("applicant_id") Integer applicantId, @retrofit2.http.Query("min_amount") Long minAmount, @retrofit2.http.Query("max_amount") Long maxAmount, @retrofit2.http.Query("approver_id") Integer approverId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 各種申請の更新
   * 
   * @param id 各種申請ID (required)
   * @param approvalRequestUpdateParams 各種申請の更新 (required)
   * @return Observable&lt;ApprovalRequestResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/approval_requests/{id}")
  Observable<ApprovalRequestResponse> updateApprovalRequest(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ApprovalRequestUpdateParams approvalRequestUpdateParams
  );

  /**
   * 各種申請の承認操作
   * 
   * @param id 各種申請ID (required)
   * @param approvalRequestActionCreateParams 各種申請の承認操作 (required)
   * @return Observable&lt;ApprovalRequestResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/approval_requests/{id}/actions")
  Observable<ApprovalRequestResponse> updateApprovalRequestAction(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ApprovalRequestActionCreateParams approvalRequestActionCreateParams
  );

}
