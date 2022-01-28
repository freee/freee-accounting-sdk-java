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
import jp.co.freee.accounting.models.TransferParams;
import jp.co.freee.accounting.models.TransferResponse;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TransfersApi {
  /**
   * 取引（振替）の作成
   * 
   * @param transferParams 取引（振替）の作成 (optional)
   * @return Observable&lt;TransferResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/transfers")
  Observable<TransferResponse> createTransfer(
    @retrofit2.http.Body TransferParams transferParams
  );

  /**
   * 取引（振替）の削除する
   * 
   * @param id 取引(振替)ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/transfers/{id}")
  Completable destroyTransfer(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引（振替）の取得
   * 
   * @param id 取引(振替)ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;TransferResponse&gt;
   */
  @GET("api/1/transfers/{id}")
  Observable<TransferResponse> getTransfer(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引（振替）一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param startDate 振替日で絞込：開始日 (yyyy-mm-dd) (optional)
   * @param endDate 振替日で絞込：終了日 (yyyy-mm-dd) (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 100)  (optional)
   * @return Observable&lt;InlineResponse20011&gt;
   */
  @GET("api/1/transfers")
  Observable<InlineResponse20011> getTransfers(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 取引（振替）の更新
   * 
   * @param id 取引(振替)ID (required)
   * @param transferParams 取引（振替）の更新 (required)
   * @return Observable&lt;TransferResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/transfers/{id}")
  Observable<TransferResponse> updateTransfer(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body TransferParams transferParams
  );

}
