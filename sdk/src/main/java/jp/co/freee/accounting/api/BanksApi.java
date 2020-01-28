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
import jp.co.freee.accounting.models.BanksIndexResponse;
import jp.co.freee.accounting.models.BanksShowResponse;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BanksApi {
  /**
   * 連携サービスの取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;連携しているサービスを取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
   * @param id 連携サービスID (required)
   * @return Observable&lt;BanksShowResponse&gt;
   */
  @GET("api/1/banks/{id}")
  Observable<BanksShowResponse> getBank(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * 連携サービス一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;連携しているサービス一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
   * @param offset 開始位置 (optional)
   * @param limit 取得上限数,最大500件 (optional)
   * @param type サービス種別 (optional)
   * @return Observable&lt;BanksIndexResponse&gt;
   */
  @GET("api/1/banks")
  Observable<BanksIndexResponse> getBanks(
    @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("type") String type
  );

}
