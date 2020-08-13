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
import jp.co.freee.accounting.models.InlineResponse20011;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.TagParams;
import jp.co.freee.accounting.models.TagResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TagsApi {
  /**
   * メモタグの作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを作成する&lt;/p&gt;
   * @param tagParams メモタグの作成 (required)
   * @return Observable&lt;TagResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/tags")
  Observable<TagResponse> createTag(
    @retrofit2.http.Body TagParams tagParams
  );

  /**
   * メモタグの削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを削除する&lt;/p&gt;
   * @param id タグID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/tags/{id}")
  Completable destroyTag(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * メモタグの詳細情報の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを取得する&lt;/p&gt;
   * @param id タグID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;TagResponse&gt;
   */
  @GET("api/1/tags/{id}")
  Observable<TagResponse> getTag(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * メモタグ一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグ一覧を取得する&lt;/p&gt;
   * @param companyId 事業所ID (required)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) (optional)
   * @return Observable&lt;InlineResponse20011&gt;
   */
  @GET("api/1/tags")
  Observable<InlineResponse20011> getTags(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * メモタグの更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを更新する&lt;/p&gt;
   * @param id メモタグID (required)
   * @param tagParams メモタグの更新 (optional)
   * @return Observable&lt;TagResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/tags/{id}")
  Observable<TagResponse> updateTag(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body TagParams tagParams
  );

}
