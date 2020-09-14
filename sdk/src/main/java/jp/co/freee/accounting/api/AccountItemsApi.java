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
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountItemsApi {
  /**
   * 勘定科目の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の勘定科目を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;p&gt;tax_nameは、api/1/taxes/companies/{company_id} で該当事業所の税区分の一覧を取得して、availableの値がtrue、かつ”name_ja”に”税率%”を含んでいない税区分を確認して、そのnameを指定して勘定科目の作成をしてください&lt;/p&gt;
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
   * @return Observable&lt;AccountItemResponse&gt;
   */
  @GET("api/1/account_items/{id}")
  Observable<AccountItemResponse> getAccountItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 勘定科目一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の勘定科目一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;default_tax_id : デフォルト設定がされている税区分ID&lt;/li&gt;  &lt;li&gt;default_tax_code : リクエストした日時を基準とした税区分コード&lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;p&gt;default_tax_code は勘定科目作成・更新時に利用するものではありません&lt;/p&gt;
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
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;勘定科目を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;p&gt;tax_codeは、api/1/taxes/companies/{company_id} で該当事業所の税区分の一覧を取得して、availableの値がtrue、かつ”name_ja”に”税率%”を含んでいない税区分を確認して、そのcodeを指定して勘定科目の更新をしてください&lt;/p&gt;
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
