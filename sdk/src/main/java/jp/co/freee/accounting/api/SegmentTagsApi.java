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
import jp.co.freee.accounting.models.InlineResponse2007;
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
   * 
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
   * 
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
   * 
   * @param segmentId セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン  (required)
   * @param companyId 事業所ID (required)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 500)  (optional)
   * @return Observable&lt;InlineResponse2007&gt;
   */
  @GET("api/1/segments/{segment_id}/tags")
  Observable<InlineResponse2007> getSegmentTags(
    @retrofit2.http.Path("segment_id") Integer segmentId, @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * セグメントタグの更新
   * 
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
