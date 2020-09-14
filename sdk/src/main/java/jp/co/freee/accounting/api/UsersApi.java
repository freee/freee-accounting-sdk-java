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
import jp.co.freee.accounting.models.InlineResponse20015;
import jp.co.freee.accounting.models.InlineResponse20016;
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
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;事業所に所属するユーザーの一覧を取得する&lt;/p&gt;
   * @param companyId 事業所ID (required)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) (optional)
   * @return Observable&lt;InlineResponse20015&gt;
   */
  @GET("api/1/users")
  Observable<InlineResponse20015> getUsers(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * ログインユーザーの権限の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザーの権限情報を取得する&lt;/p&gt;
   * @param companyId 事業所ID (required)
   * @return Observable&lt;InlineResponse20016&gt;
   */
  @GET("api/1/users/capabilities")
  Observable<InlineResponse20016> getUsersCapabilities(
    @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * ログインユーザー情報の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザーの情報を取得する&lt;/p&gt;
   * @param companies 取得情報にユーザーが所属する事業所一覧を含める (optional)
   * @return Observable&lt;MeResponse&gt;
   */
  @GET("api/1/users/me")
  Observable<MeResponse> getUsersMe(
    @retrofit2.http.Query("companies") Boolean companies
  );

  /**
   * ユーザー情報の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザー情報を更新する&lt;/p&gt;
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
