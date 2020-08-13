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
import jp.co.freee.accounting.models.InlineResponse2005;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ItemParams;
import jp.co.freee.accounting.models.ItemResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ItemsApi {
  /**
   * 品目の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目を作成する&lt;/p&gt;
   * @param itemParams 品目の作成 (optional)
   * @return Observable&lt;ItemResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/items")
  Observable<ItemResponse> createItem(
    @retrofit2.http.Body ItemParams itemParams
  );

  /**
   * 品目の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目を削除する&lt;/p&gt;
   * @param id 品目ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/items/{id}")
  Completable destroyItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 品目の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目を取得する&lt;/p&gt;
   * @param id 品目ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ItemResponse&gt;
   */
  @GET("api/1/items/{id}")
  Observable<ItemResponse> getItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 品目一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目一覧を取得する&lt;/p&gt;
   * @param companyId 事業所ID (required)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) (optional)
   * @return Observable&lt;InlineResponse2005&gt;
   */
  @GET("api/1/items")
  Observable<InlineResponse2005> getItems(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 品目の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目を更新する&lt;/p&gt;
   * @param id 品目ID (required)
   * @param itemParams 品目の更新 (optional)
   * @return Observable&lt;ItemResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/items/{id}")
  Observable<ItemResponse> updateItem(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ItemParams itemParams
  );

}
