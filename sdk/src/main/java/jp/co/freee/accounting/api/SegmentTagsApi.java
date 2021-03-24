package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20010;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.SegmentTagParams;
import jp.co.freee.accounting.models.SegmentTagResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SegmentTagsApi {
  /**
   * セグメントの作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
   * @param segmentId セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン  (required)
   * @param segmentTagParams セグメントタグの作成 (required)
   * @return Observable&lt;SegmentTagResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/segments/{segment_id}/tags")
  Observable<SegmentTagResponse> createSegmentTag(
    @retrofit2.http.Path("segment_id") Integer segmentId, @retrofit2.http.Body SegmentTagParams segmentTagParams
  );

  /**
   * セグメントタグの削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを削除する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
   * @param segmentId セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン  (required)
   * @param id セグメントタグID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/segments/{segment_id}/tags/{id}")
  Completable destroySegmentsTag(
    @retrofit2.http.Path("segment_id") Integer segmentId, @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * セグメントタグ一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグ一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
   * @param segmentId セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン  (required)
   * @param companyId 事業所ID (required)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 500)  (optional)
   * @return Observable&lt;InlineResponse20010&gt;
   */
  @GET("api/1/segments/{segment_id}/tags")
  Observable<InlineResponse20010> getSegmentTags(
    @retrofit2.http.Path("segment_id") Integer segmentId, @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * セグメントタグの更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
   * @param segmentId セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン  (required)
   * @param id セグメントタグID (required)
   * @param segmentTagParams セグメントタグの作成 (required)
   * @return Observable&lt;SegmentTagResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/segments/{segment_id}/tags/{id}")
  Observable<SegmentTagResponse> updateSegmentTag(
    @retrofit2.http.Path("segment_id") Integer segmentId, @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body SegmentTagParams segmentTagParams
  );

}
