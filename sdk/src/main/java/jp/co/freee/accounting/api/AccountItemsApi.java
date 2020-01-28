package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.AccountItemParams;
import jp.co.freee.accounting.models.AccountItemsCreateResponse;
import jp.co.freee.accounting.models.AccountItemsIndexResponse;
import jp.co.freee.accounting.models.AccountItemsShowResponse;
import jp.co.freee.accounting.models.AccountItemsUpdateResponse;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountItemsApi {
  /**
   * 勘定科目の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の勘定科目を作成する&lt;/p&gt;
   * @param parameters 勘定科目の作成 (required)
   * @return Observable&lt;AccountItemsCreateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/account_items")
  Observable<AccountItemsCreateResponse> createAccountItem(
    @retrofit2.http.Body AccountItemParams parameters
  );

  /**
   * 勘定科目の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した勘定科目を削除する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;削除できる勘定科目は、追加で作成したカスタム勘定項目のみです。&lt;/li&gt; &lt;li&gt;デフォルトで存在する勘定科目や口座の勘定科目は削除できません。&lt;/li&gt;&lt;/ul&gt;
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
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した勘定科目の詳細を取得する&lt;/p&gt;
   * @param id 勘定科目ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;AccountItemsShowResponse&gt;
   */
  @GET("api/1/account_items/{id}")
  Observable<AccountItemsShowResponse> getAccountItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 勘定科目一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の勘定科目一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;default_tax_id : デフォルト設定がされている税区分ID&lt;/li&gt;  &lt;li&gt;default_tax_code : リクエストした日時を基準とした税区分コード&lt;/li&gt; &lt;/ul&gt;
   * @param companyId 事業所ID (required)
   * @param baseDate 基準日:指定した場合、勘定科目に紐づく税区分(default_tax_code)が、基準日の税率に基づいて返ります。 (optional)
   * @return Observable&lt;AccountItemsIndexResponse&gt;
   */
  @GET("api/1/account_items")
  Observable<AccountItemsIndexResponse> getAccountItems(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("base_date") String baseDate
  );

  /**
   * 勘定科目の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;勘定科目を更新する&lt;/p&gt;
   * @param id  (required)
   * @param parameters 勘定科目の更新 (required)
   * @return Observable&lt;AccountItemsUpdateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/account_items/{id}")
  Observable<AccountItemsUpdateResponse> updateAccountItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body AccountItemParams parameters
  );

}
