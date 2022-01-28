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
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.WalletableCreateParams;
import jp.co.freee.accounting.models.WalletableCreateResponse;
import jp.co.freee.accounting.models.WalletableUpdateParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WalletablesApi {
  /**
   * 口座の作成
   * 
   * @param walletableCreateParams 口座の作成 (optional)
   * @return Observable&lt;WalletableCreateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/walletables")
  Observable<WalletableCreateResponse> createWalletable(
    @retrofit2.http.Body WalletableCreateParams walletableCreateParams
  );

  /**
   * 口座の削除
   * 
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
   * 
   * @param id 口座ID (required)
   * @param type 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;InlineResponse20016&gt;
   */
  @GET("api/1/walletables/{type}/{id}")
  Observable<InlineResponse20016> getWalletable(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("type") String type, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 口座一覧の取得
   * 
   * @param companyId 事業所ID (required)
   * @param withBalance 残高情報を含める (optional)
   * @param type 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） (optional)
   * @return Observable&lt;InlineResponse20015&gt;
   */
  @GET("api/1/walletables")
  Observable<InlineResponse20015> getWalletables(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("with_balance") Boolean withBalance, @retrofit2.http.Query("type") String type
  );

  /**
   * 口座の更新
   * 
   * @param id  (required)
   * @param type 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） (required)
   * @param walletableUpdateParams 口座の作成 (optional)
   * @return Observable&lt;InlineResponse20016&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/walletables/{type}/{id}")
  Observable<InlineResponse20016> updateWalletable(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("type") String type, @retrofit2.http.Body WalletableUpdateParams walletableUpdateParams
  );

}
