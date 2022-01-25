package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.AccountItemParams;
import jp.co.freee.accounting.models.AccountItemResponse;
import jp.co.freee.accounting.models.AccountItemsResponse;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ServiceUnavailableError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountItemsApi {
  /**
   * 勘定科目の作成
   * 
   * @param accountItemParams 勘定科目の作成 (required)
   * @return Observable&lt;AccountItemResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/account_items")
  Observable<AccountItemResponse> createAccountItem(
    @retrofit2.http.Body AccountItemParams accountItemParams
  );

  /**
   * 勘定科目の削除
   * 
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/account_items/{id}")
  Completable destroyAccountItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 勘定科目の詳細情報の取得
   * 
   * @param id 勘定科目ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;AccountItemResponse&gt;
   */
  @GET("api/1/account_items/{id}")
  Observable<AccountItemResponse> getAccountItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 勘定科目一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param baseDate 基準日:指定した場合、勘定科目に紐づく税区分(default_tax_code)が、基準日の税率に基づいて返ります。 (optional)
   * @return Observable&lt;AccountItemsResponse&gt;
   */
  @GET("api/1/account_items")
  Observable<AccountItemsResponse> getAccountItems(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("base_date") String baseDate
  );

  /**
   * 勘定科目の更新
   * 
   * @param id  (required)
   * @param accountItemParams 勘定科目の更新 (required)
   * @return Observable&lt;AccountItemResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/account_items/{id}")
  Observable<AccountItemResponse> updateAccountItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body AccountItemParams accountItemParams
  );

}
