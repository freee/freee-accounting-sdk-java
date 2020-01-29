package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.RenewsCreateParams;
import jp.co.freee.accounting.models.RenewsResponse;
import jp.co.freee.accounting.models.RenewsUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RenewsApi {
  /**
   * 取引（収入／支出）に対する+更新の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引（収入／支出）の+更新を作成する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt; &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;accruals : 取引の債権債務行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt; &lt;li&gt;credit_card : クレジットカード&lt;/li&gt; &lt;li&gt;wallet : 現金&lt;/li&gt; &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;本APIではdetails(取引の明細行)、accruals(債権債務行)、renewsのdetails(+更新の明細行)のみ操作可能です。&lt;/li&gt; &lt;li&gt;本APIで取引を更新すると、消費税の計算方法は必ず内税方式が選択されます。&lt;/li&gt; &lt;/ul&gt; 
   * @param id 取引ID (required)
   * @param parameters 取引（収入／支出）に対する+更新の情報 (required)
   * @return Observable&lt;RenewsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/deals/{id}/renews")
  Observable<RenewsResponse> createDealRenew(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body RenewsCreateParams parameters
  );

  /**
   * 取引（収入／支出）の+更新の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt; &lt;p&gt;指定した事業所の取引（収入／支出）の+更新を削除する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;本APIでは+更新の削除のみ可能です。取引や支払行に対する削除はできません。&lt;/li&gt; &lt;li&gt;renew_idにはrenewsのid(+更新ID)を指定してください。renewsのdetailsのid(+更新の明細行ID)を指定できません。&lt;/li&gt; &lt;li&gt;月締めされている仕訳に紐づく＋更新行の編集・削除はできません。&lt;/li&gt; &lt;li&gt;承認済み仕訳に紐づく＋更新行の編集・削除は管理者権限のユーザーのみ可能です。&lt;/li&gt; &lt;li&gt;本APIで取引を更新すると、消費税の計算方法は必ず内税方式が選択されます。&lt;/li&gt; &lt;/ul&gt; 
   * @param id 取引ID (required)
   * @param renewId +更新ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;RenewsResponse&gt;
   */
  @DELETE("api/1/deals/{id}/renews/{renew_id}")
  Observable<RenewsResponse> deleteDealRenew(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("renew_id") Integer renewId, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引（収入／支出）の+更新の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引（収入／支出）の+更新を更新する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt; &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;accruals : 取引の債権債務行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt; &lt;li&gt;credit_card : クレジットカード&lt;/li&gt; &lt;li&gt;wallet : 現金&lt;/li&gt; &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;本APIでは+更新の更新のみ可能です。取引や支払行に対する更新はできません。&lt;/li&gt; &lt;li&gt;renew_idにはrenewsのid(+更新ID)を指定してください。renewsのdetailsのid(+更新の明細行ID)を指定できません。&lt;/li&gt; &lt;li&gt;月締めされている仕訳に紐づく＋更新行の編集・削除はできません。&lt;/li&gt; &lt;li&gt;承認済み仕訳に紐づく＋更新行の編集・削除は管理者権限のユーザーのみ可能です。&lt;/li&gt; &lt;li&gt;本APIで取引を更新すると、消費税の計算方法は必ず内税方式が選択されます。&lt;/li&gt; &lt;/ul&gt; 
   * @param id 取引ID (required)
   * @param renewId +更新ID (required)
   * @param parameters +更新の更新情報 (required)
   * @return Observable&lt;RenewsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/deals/{id}/renews/{renew_id}")
  Observable<RenewsResponse> updateDealRenew(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Path("renew_id") Integer renewId, @retrofit2.http.Body RenewsUpdateParams parameters
  );

}
