package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.SegmentTagParams;
import jp.co.freee.accounting.models.SegmentTagsIndexResponse;
import jp.co.freee.accounting.models.SegmentTagsResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SegmentTagsApi {
  /**
   * セグメントの作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
   * @param segmentId セグメントID (required)
   * @param parameters セグメントタグの作成 (required)
   * @return Observable&lt;SegmentTagsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/segments/{segment_id}/tags")
  Observable<SegmentTagsResponse> createSegmentTag(
    @retrofit2.http.Path("segment_id") Integer segmentId, @retrofit2.http.Body SegmentTagParams parameters
  );

  /**
   * セグメントタグの削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを削除する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
   * @param segmentId セグメントID (required)
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
   * @param segmentId セグメントID (required)
   * @param companyId 事業所ID (required)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 500)  (optional)
   * @return Observable&lt;SegmentTagsIndexResponse&gt;
   */
  @GET("api/1/segments/{segment_id}/tags")
  Observable<SegmentTagsIndexResponse> getSegmentTags(
    @retrofit2.http.Path("segment_id") Integer segmentId, @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * セグメントタグの更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;
   * @param segmentId セグメントID (required)
   * @param id セグメントタグID (required)
   * @param parameters セグメントタグの作成 (required)
   * @return Observable&lt;SegmentTagsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/segments/{segment_id}/tags/{id}")
  Observable<SegmentTagsResponse> updateSegmentTag(
    @retrofit2.http.Path("segment_id") Integer segmentId, @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body SegmentTagParams parameters
  );

}
