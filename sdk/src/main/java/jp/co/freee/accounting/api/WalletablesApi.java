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
import jp.co.freee.accounting.models.WalletableCreateParams;
import jp.co.freee.accounting.models.WalletableUpdateParams;
import jp.co.freee.accounting.models.WalletablesCreateResponse;
import jp.co.freee.accounting.models.WalletablesIndexResponse;
import jp.co.freee.accounting.models.WalletablesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WalletablesApi {
  /**
   * 口座の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所に口座を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;&lt;li&gt;同期に対応した口座はこのAPIでは作成できません&lt;/li&gt;&lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;name : 口座名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;bank_id : サービスID&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;group_name : 決算書表示名（小カテゴリー）　例：売掛金, 受取手形, 未収入金（法人のみ）, 買掛金, 支払手形, 未払金, 預り金, 前受金&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
   * @param parameters 口座の作成 (optional)
   * @return Observable&lt;WalletablesCreateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/walletables")
  Observable<WalletablesCreateResponse> createWalletable(
    @retrofit2.http.Body WalletableCreateParams parameters
  );

  /**
   * 口座の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の口座を削除する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;削除を実行するには、当該口座に関連する仕訳データを事前に削除する必要があります。&lt;/li&gt; &lt;li&gt;当該口座に仕訳が残っていないか確認するには、レポートの「仕訳帳」等を参照し、必要に応じて、「取引」や「口座振替」も削除します。&lt;/li&gt;  &lt;/ul&gt;
   * @param id 口座ID (required)
   * @param type 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/walletables/{type}/{id}")
  Completable destroyWalletable(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("type") String type, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 口座情報の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の口座情報を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt;walletable_balance : 登録残高&lt;/li&gt;  &lt;li&gt;last_balance : 同期残高&lt;/li&gt; &lt;/ul&gt;
   * @param id 口座ID (required)
   * @param type 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;WalletablesResponse&gt;
   */
  @GET("api/1/walletables/{type}/{id}")
  Observable<WalletablesResponse> getWalletable(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("type") String type, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 口座一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の口座一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt;walletable_balance : 登録残高&lt;/li&gt;  &lt;li&gt;last_balance : 同期残高&lt;/li&gt; &lt;/ul&gt;
   * @param companyId 事業所ID (required)
   * @param withBalance 残高情報を含める (optional)
   * @return Observable&lt;WalletablesIndexResponse&gt;
   */
  @GET("api/1/walletables")
  Observable<WalletablesIndexResponse> getWalletables(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("with_balance") Boolean withBalance
  );

  /**
   * 口座の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;口座を更新する&lt;/p&gt;
   * @param id  (required)
   * @param type 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） (required)
   * @param companyId 事業所ID (required)
   * @param parameters 口座の作成 (optional)
   * @return Observable&lt;WalletablesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/walletables/{type}/{id}")
  Observable<WalletablesResponse> updateWalletable(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("type") String type, @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Body WalletableUpdateParams parameters
  );

}
