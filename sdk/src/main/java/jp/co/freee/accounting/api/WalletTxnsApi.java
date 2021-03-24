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
import jp.co.freee.accounting.models.InlineResponse20017;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.WalletTxnParams;
import jp.co.freee.accounting.models.WalletTxnResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WalletTxnsApi {
  /**
   * 明細の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;amount : 明細金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 取引登録待ち金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;balance : 残高&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 入金&lt;/li&gt;  &lt;li&gt;expense : 出金&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
   * @param walletTxnParams 明細の作成 (optional)
   * @return Observable&lt;WalletTxnResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/wallet_txns")
  Observable<WalletTxnResponse> createWalletTxn(
    @retrofit2.http.Body WalletTxnParams walletTxnParams
  );

  /**
   * 明細の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細を削除する&lt;/p&gt;
   * @param id 明細ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/wallet_txns/{id}")
  Completable destroyWalletTxn(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 明細の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;amount : 明細金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 取引登録待ち金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;balance : 残高&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 入金&lt;/li&gt;  &lt;li&gt;expense : 出金&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
   * @param id 明細ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;WalletTxnResponse&gt;
   */
  @GET("api/1/wallet_txns/{id}")
  Observable<WalletTxnResponse> getWalletTxn(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 明細一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;amount : 明細金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 取引登録待ち金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;balance : 残高&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 入金&lt;/li&gt;  &lt;li&gt;expense : 出金&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
   * @param companyId 事業所ID (required)
   * @param walletableType 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) walletable_type、walletable_idは同時に指定が必要です。 (optional)
   * @param walletableId 口座ID walletable_type、walletable_idは同時に指定が必要です。 (optional)
   * @param startDate 取引日で絞込：開始日 (yyyy-mm-dd) (optional)
   * @param endDate 取引日で絞込：終了日 (yyyy-mm-dd) (optional)
   * @param entrySide 入金／出金 (入金: income, 出金: expense) (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 100)  (optional)
   * @return Observable&lt;InlineResponse20017&gt;
   */
  @GET("api/1/wallet_txns")
  Observable<InlineResponse20017> getWalletTxns(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("walletable_type") String walletableType, @retrofit2.http.Query("walletable_id") Integer walletableId, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("entry_side") String entrySide, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

}
