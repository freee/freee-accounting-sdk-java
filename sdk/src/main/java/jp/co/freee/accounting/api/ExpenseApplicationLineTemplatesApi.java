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
import jp.co.freee.accounting.models.ExpenseApplicationLineTemplateParams;
import jp.co.freee.accounting.models.ExpenseApplicationLineTemplateResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2002;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExpenseApplicationLineTemplatesApi {
  /**
   * 経費科目の作成
   * 
   * @param expenseApplicationLineTemplateParams 経費科目の作成 (required)
   * @return Observable&lt;ExpenseApplicationLineTemplateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/expense_application_line_templates")
  Observable<ExpenseApplicationLineTemplateResponse> createExpenseApplicationLineTemplate(
    @retrofit2.http.Body ExpenseApplicationLineTemplateParams expenseApplicationLineTemplateParams
  );

  /**
   * 経費科目の削除
   * 
   * @param id 経費科目ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/expense_application_line_templates/{id}")
  Completable destroyExpenseApplicationLineTemplate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 経費科目の取得
   * 
   * @param id 経費科目ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ExpenseApplicationLineTemplateResponse&gt;
   */
  @GET("api/1/expense_application_line_templates/{id}")
  Observable<ExpenseApplicationLineTemplateResponse> getExpenseApplicationLineTemplate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 経費科目一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 100) (optional)
   * @return Observable&lt;InlineResponse2002&gt;
   */
  @GET("api/1/expense_application_line_templates")
  Observable<InlineResponse2002> getExpenseApplicationLineTemplates(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 経費科目の更新
   * 
   * @param id 経費科目ID (required)
   * @param expenseApplicationLineTemplateParams 経費科目の更新 (required)
   * @return Observable&lt;ExpenseApplicationLineTemplateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/expense_application_line_templates/{id}")
  Observable<ExpenseApplicationLineTemplateResponse> updateExpenseApplicationLineTemplate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ExpenseApplicationLineTemplateParams expenseApplicationLineTemplateParams
  );

}
