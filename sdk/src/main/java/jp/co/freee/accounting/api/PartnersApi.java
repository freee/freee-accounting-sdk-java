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
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.PartnerCodeParams;
import jp.co.freee.accounting.models.PartnerCreateParams;
import jp.co.freee.accounting.models.PartnerUpdateParams;
import jp.co.freee.accounting.models.PartnersIndexResponse;
import jp.co.freee.accounting.models.PartnersResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PartnersApi {
  /**
   * 取引先の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先を作成する&lt;/p&gt; &lt;ul&gt; &lt;li&gt;codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/li&gt; &lt;li&gt;取引先コードの利用を有効にしている場合は、codeの指定は必須です。&lt;/li&gt;&lt;/ul&gt;
   * @param parameters 取引先の作成 (required)
   * @return Observable&lt;PartnersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/partners")
  Observable<PartnersResponse> createPartner(
    @retrofit2.http.Body PartnerCreateParams parameters
  );

  /**
   * 取引先の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先を削除する&lt;/p&gt;
   * @param id 取引先ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/partners/{id}")
  Completable destroyPartner(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引先の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先を取得する&lt;/p&gt;
   * @param id 取引先ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;PartnersResponse&gt;
   */
  @GET("api/1/partners/{id}")
  Observable<PartnersResponse> getPartner(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引先一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先一覧を取得する&lt;/p&gt;
   * @param companyId 事業所ID (required)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最大: 3000) (optional)
   * @param keyword 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致 (optional)
   * @return Observable&lt;PartnersIndexResponse&gt;
   */
  @GET("api/1/partners")
  Observable<PartnersIndexResponse> getPartners(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("keyword") String keyword
  );

  /**
   * 取引先の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した取引先の情報を更新する&lt;/p&gt; &lt;ul&gt; &lt;li&gt;codeを指定、更新することはできません。&lt;/li&gt;&lt;/ul&gt;
   * @param id 取引先ID (required)
   * @param parameters 取引先の更新 (required)
   * @return Observable&lt;PartnersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/partners/{id}")
  Observable<PartnersResponse> updatePartner(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PartnerUpdateParams parameters
  );

  /**
   * 取引先の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;取引先コードをキーに、指定した取引先の情報を更新する&lt;/p&gt; &lt;ul&gt; &lt;li&gt;このAPIを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/li&gt; &lt;li&gt;コードを日本語に設定している場合は、URLエンコードしてURLに含めるようにしてください。&lt;/li&gt;&lt;/ul&gt;
   * @param code 取引先コード (required)
   * @param parameters 取引先の更新 (required)
   * @return Observable&lt;PartnersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/partners/code/{code}")
  Observable<PartnersResponse> updatePartnerByCode(
    @retrofit2.http.Path("code") String code, @retrofit2.http.Body PartnerCodeParams parameters
  );

}
