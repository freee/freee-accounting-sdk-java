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
import jp.co.freee.accounting.models.InlineResponse20012;
import jp.co.freee.accounting.models.InlineResponse20013;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.MeResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.UserParams;
import jp.co.freee.accounting.models.UserResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsersApi {
  /**
   * 事業所に所属するユーザー一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) (optional)
   * @return Observable&lt;InlineResponse20012&gt;
   */
  @GET("api/1/users")
  Observable<InlineResponse20012> getUsers(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * ログインユーザーの権限の取得
   * 
   * @param companyId 事業所ID (required)
   * @return Observable&lt;InlineResponse20013&gt;
   */
  @GET("api/1/users/capabilities")
  Observable<InlineResponse20013> getUsersCapabilities(
    @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * ログインユーザー情報の取得
   * 
   * @param companies 取得情報にユーザーが所属する事業所一覧を含める (optional)
   * @param advisor 取得情報に事業がアドバイザー事象所の場合は事業所毎の一意なプロフィールIDを含める (optional)
   * @return Observable&lt;MeResponse&gt;
   */
  @GET("api/1/users/me")
  Observable<MeResponse> getUsersMe(
    @retrofit2.http.Query("companies") Boolean companies, @retrofit2.http.Query("advisor") Boolean advisor
  );

  /**
   * ユーザー情報の更新
   * 
   * @param userParams ユーザー情報の更新 (optional)
   * @return Observable&lt;UserResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/users/me")
  Observable<UserResponse> updateUser(
    @retrofit2.http.Body UserParams userParams
  );

}
