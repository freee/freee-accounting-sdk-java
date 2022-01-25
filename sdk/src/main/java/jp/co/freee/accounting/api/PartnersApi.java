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
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.PartnerCreateParams;
import jp.co.freee.accounting.models.PartnerResponse;
import jp.co.freee.accounting.models.PartnerUpdateParams;
import jp.co.freee.accounting.models.PartnersResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PartnersApi {
  /**
   * 取引先の作成
   * 
   * @param partnerCreateParams 取引先の作成 (required)
   * @return Observable&lt;PartnerResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/partners")
  Observable<PartnerResponse> createPartner(
    @retrofit2.http.Body PartnerCreateParams partnerCreateParams
  );

  /**
   * 取引先の削除
   * 
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
   * 
   * @param id 取引先ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;PartnerResponse&gt;
   */
  @GET("api/1/partners/{id}")
  Observable<PartnerResponse> getPartner(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引先一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param startUpdateDate 更新日で絞り込み：開始日(yyyy-mm-dd) (optional)
   * @param endUpdateDate 更新日で絞り込み：終了日(yyyy-mm-dd) (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) (optional)
   * @param keyword 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致 (optional)
   * @return Observable&lt;PartnersResponse&gt;
   */
  @GET("api/1/partners")
  Observable<PartnersResponse> getPartners(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("start_update_date") String startUpdateDate, @retrofit2.http.Query("end_update_date") String endUpdateDate, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("keyword") String keyword
  );

  /**
   * 取引先の更新
   * 
   * @param id 取引先ID (required)
   * @param partnerUpdateParams 取引先の更新 (required)
   * @return Observable&lt;PartnerResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/partners/{id}")
  Observable<PartnerResponse> updatePartner(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PartnerUpdateParams partnerUpdateParams
  );

  /**
   * 取引先の更新
   * 
   * @param code 取引先コード (required)
   * @param partnerUpdateParams 取引先の更新 (required)
   * @return Observable&lt;PartnerResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/partners/code/{code}")
  Observable<PartnerResponse> updatePartnerByCode(
    @retrofit2.http.Path("code") String code, @retrofit2.http.Body PartnerUpdateParams partnerUpdateParams
  );

}
