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
import jp.co.freee.accounting.models.InlineResponse2006;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.SectionParams;
import jp.co.freee.accounting.models.SectionResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SectionsApi {
  /**
   * 部門の作成
   * 
   * @param sectionParams 部門の作成 (optional)
   * @return Observable&lt;SectionResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/sections")
  Observable<SectionResponse> createSection(
    @retrofit2.http.Body SectionParams sectionParams
  );

  /**
   * 部門の削除
   * 
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/sections/{id}")
  Completable destroySection(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 
   * 
   * @param id 部門ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;SectionResponse&gt;
   */
  @GET("api/1/sections/{id}")
  Observable<SectionResponse> getSection(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 部門一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @return Observable&lt;InlineResponse2006&gt;
   */
  @GET("api/1/sections")
  Observable<InlineResponse2006> getSections(
    @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 部門の更新
   * 
   * @param id  (required)
   * @param sectionParams 部門の更新 (optional)
   * @return Observable&lt;SectionResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/sections/{id}")
  Observable<SectionResponse> updateSection(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body SectionParams sectionParams
  );

}
