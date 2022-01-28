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
import jp.co.freee.accounting.models.BankResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse200;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BanksApi {
  /**
   * 連携サービスの取得
   * 
   * @param id 連携サービスID (required)
   * @return Observable&lt;BankResponse&gt;
   */
  @GET("api/1/banks/{id}")
  Observable<BankResponse> getBank(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * 連携サービス一覧の取得
   * 
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 500) (optional)
   * @param type サービス種別 (optional)
   * @return Observable&lt;InlineResponse200&gt;
   */
  @GET("api/1/banks")
  Observable<InlineResponse200> getBanks(
    @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("type") String type
  );

}
