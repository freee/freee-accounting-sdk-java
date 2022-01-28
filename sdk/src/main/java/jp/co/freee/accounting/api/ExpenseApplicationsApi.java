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
import jp.co.freee.accounting.models.ExpenseApplicationActionCreateParams;
import jp.co.freee.accounting.models.ExpenseApplicationCreateParams;
import jp.co.freee.accounting.models.ExpenseApplicationResponse;
import jp.co.freee.accounting.models.ExpenseApplicationUpdateParams;
import jp.co.freee.accounting.models.ExpenseApplicationsIndexResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExpenseApplicationsApi {
  /**
   * 経費申請の作成
   * 
   * @param expenseApplicationCreateParams 経費申請の作成 (optional)
   * @return Observable&lt;ExpenseApplicationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/expense_applications")
  Observable<ExpenseApplicationResponse> createExpenseApplication(
    @retrofit2.http.Body ExpenseApplicationCreateParams expenseApplicationCreateParams
  );

  /**
   * 経費申請の削除
   * 
   * @param id 経費申請ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/expense_applications/{id}")
  Completable destroyExpenseApplication(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 経費申請詳細の取得
   * 
   * @param id 経費申請ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ExpenseApplicationResponse&gt;
   */
  @GET("api/1/expense_applications/{id}")
  Observable<ExpenseApplicationResponse> getExpenseApplication(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 経費申請一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param status 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)、 取引ステータス(unsettled:清算待ち, settled:精算済み) (optional)
   * @param payrollAttached true:給与連携あり、false:給与連携なし、未指定時:絞り込みなし (optional)
   * @param startTransactionDate 発生日(経費申請項目の日付)で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endTransactionDate 発生日(経費申請項目の日付)で絞込：終了日(yyyy-mm-dd) (optional)
   * @param applicationNumber 申請No. (optional)
   * @param title 申請タイトル (optional)
   * @param startIssueDate 申請日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endIssueDate 申請日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param applicantId 申請者のユーザーID (optional)
   * @param approverId 承認者のユーザーID (optional)
   * @param minAmount 金額で絞込 (下限金額) (optional)
   * @param maxAmount 金額で絞込 (上限金額) (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500) (optional)
   * @return Observable&lt;ExpenseApplicationsIndexResponse&gt;
   */
  @GET("api/1/expense_applications")
  Observable<ExpenseApplicationsIndexResponse> getExpenseApplications(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("payroll_attached") Boolean payrollAttached, @retrofit2.http.Query("start_transaction_date") String startTransactionDate, @retrofit2.http.Query("end_transaction_date") String endTransactionDate, @retrofit2.http.Query("application_number") Integer applicationNumber, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("start_issue_date") String startIssueDate, @retrofit2.http.Query("end_issue_date") String endIssueDate, @retrofit2.http.Query("applicant_id") Integer applicantId, @retrofit2.http.Query("approver_id") Integer approverId, @retrofit2.http.Query("min_amount") Integer minAmount, @retrofit2.http.Query("max_amount") Integer maxAmount, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 経費申請の更新
   * 
   * @param id 経費申請ID (required)
   * @param expenseApplicationUpdateParams 経費申請の更新 (optional)
   * @return Observable&lt;ExpenseApplicationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/expense_applications/{id}")
  Observable<ExpenseApplicationResponse> updateExpenseApplication(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ExpenseApplicationUpdateParams expenseApplicationUpdateParams
  );

  /**
   * 経費申請の承認操作
   * 
   * @param id 経費申請ID (required)
   * @param expenseApplicationActionCreateParams 経費申請の承認操作 (required)
   * @return Observable&lt;ExpenseApplicationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/expense_applications/{id}/actions")
  Observable<ExpenseApplicationResponse> updateExpenseApplicationAction(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ExpenseApplicationActionCreateParams expenseApplicationActionCreateParams
  );

}
