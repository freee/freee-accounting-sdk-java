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
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.UserUpdateParams;
import jp.co.freee.accounting.models.UsersCapabilitiesResponse;
import jp.co.freee.accounting.models.UsersIndexResponse;
import jp.co.freee.accounting.models.UsersMeResponse;
import jp.co.freee.accounting.models.UsersUpdateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsersApi {
  /**
   * 事業所に所属するユーザー一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;事業所に所属するユーザーの一覧を取得する&lt;/p&gt;
   * @param companyId 事業所ID (required)
   * @param limit 取得上限数,最大3000件 (optional)
   * @return Observable&lt;UsersIndexResponse&gt;
   */
  @GET("api/1/users")
  Observable<UsersIndexResponse> getUsers(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * ログインユーザの権限の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザの権限情報を取得する&lt;/p&gt;
   * @param companyId 事業所ID (required)
   * @return Observable&lt;UsersCapabilitiesResponse&gt;
   */
  @GET("api/1/users/capabilities")
  Observable<UsersCapabilitiesResponse> getUsersCapabilities(
    @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * ログインユーザ情報の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザの情報を取得する&lt;/p&gt;
   * @param companies 取得情報にユーザが所属する事業所一覧を含める (optional)
   * @return Observable&lt;UsersMeResponse&gt;
   */
  @GET("api/1/users/me")
  Observable<UsersMeResponse> getUsersMe(
    @retrofit2.http.Query("companies") Boolean companies
  );

  /**
   * ユーザー情報の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザー情報を更新する&lt;/p&gt;
   * @param parameters ユーザー情報の更新 (optional)
   * @return Observable&lt;UsersUpdateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/users/me")
  Observable<UsersUpdateResponse> updateUser(
    @retrofit2.http.Body UserUpdateParams parameters
  );

}
