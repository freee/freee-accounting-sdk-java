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
import jp.co.freee.accounting.models.CreateDealParams;
import jp.co.freee.accounting.models.DealsCreateResponse;
import jp.co.freee.accounting.models.DealsIndexResponse;
import jp.co.freee.accounting.models.DealsResponse;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.UpdateDealParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DealsApi {
  /**
   * 取引（収入／支出）の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引（収入／支出）を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt;  &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;ref_number : 管理番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;receipt_ids : 証憑ファイルID&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : 現金&lt;/li&gt;  &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;tax_idは廃止予定です。tax_codeをご利用ください。&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;tax_code, tax_idはどちらかの指定が必須です。両方指定した場合はtax_codeが優先されます。&lt;/p&gt; &lt;/li&gt; &lt;p&gt;&lt;li&gt;本APIでは+更新行(renews)の操作ができません。+更新行の作成APIをご利用ください。&lt;/p&gt;&lt;/li&gt;  &lt;p&gt;&lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/p&gt;&lt;/li&gt;  &lt;li&gt; &lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/p&gt;&lt;/li&gt; &lt;/ul&gt;  
   * @param parameters 取引（収入／支出）の作成 (optional)
   * @return Observable&lt;DealsCreateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/deals")
  Observable<DealsCreateResponse> createDeal(
    @retrofit2.http.Body CreateDealParams parameters
  );

  /**
   * 取引（収入／支出）の削除
   * 
   * @param id 取引ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/deals/{id}")
  Completable destroyDeal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 取引（収入／支出）の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引（収入／支出）を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt;  &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;accruals : 取引の債権債務行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : 現金&lt;/li&gt;  &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;registered_from&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;all : すべての取引&lt;/li&gt;  &lt;li&gt;me : 自身が登録した取引&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;tax_idは廃止予定です。tax_codeをご利用ください。&lt;/li&gt;  &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;/ul&gt;
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @param accruals 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する） (optional)
   * @return Observable&lt;DealsResponse&gt;
   */
  @GET("api/1/deals/{id}")
  Observable<DealsResponse> getDeal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("accruals") String accruals
  );

  /**
   * 取引（収入／支出）一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引一覧（収入／支出）を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt;  &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;accruals : 取引の債権債務行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : 現金&lt;/li&gt;  &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;registered_from&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;all : すべての取引&lt;/li&gt;  &lt;li&gt;me : 自身が登録した取引&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;tax_idは廃止予定です。tax_codeをご利用ください。&lt;/li&gt;  &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt; &lt;/ul&gt;
   * @param companyId 事業所ID (required)
   * @param partnerId 取引先IDで絞込 (optional)
   * @param accountItemId 勘定科目IDで絞込 (optional)
   * @param partnerCode 取引先コードで絞込 (optional)
   * @param status 決済状況で絞込 (未決済: unsettled, 完了: settled) (optional)
   * @param type 収支区分 (収入: income, 支出: expense) (optional)
   * @param startIssueDate 発生日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endIssueDate 発生日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param startDueDate 支払期日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endDueDate 支払期日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param startRenewDate +更新日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endRenewDate +更新日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)  (optional)
   * @param registeredFrom 取引登録元アプリで絞込（me: 本APIを叩くアプリ自身から登録した取引のみ） (optional)
   * @param accruals 取引の債権債務行の表示（without: 表示しない(デフォルト), with: 表示する） (optional)
   * @return Observable&lt;DealsIndexResponse&gt;
   */
  @GET("api/1/deals")
  Observable<DealsIndexResponse> getDeals(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("account_item_id") Integer accountItemId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("type") String type, @retrofit2.http.Query("start_issue_date") String startIssueDate, @retrofit2.http.Query("end_issue_date") String endIssueDate, @retrofit2.http.Query("start_due_date") String startDueDate, @retrofit2.http.Query("end_due_date") String endDueDate, @retrofit2.http.Query("start_renew_date") String startRenewDate, @retrofit2.http.Query("end_renew_date") String endRenewDate, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("registered_from") String registeredFrom, @retrofit2.http.Query("accruals") String accruals
  );

  /**
   * 取引（収入／支出）の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引（収入／支出）を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt;  &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt; &lt;li&gt;credit_card : クレジットカード&lt;/li&gt; &lt;li&gt;wallet : 現金&lt;/li&gt; &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;receipt_ids : 証憑ファイルID&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;本APIでは支払行(payments)の操作ができません。支払行の作成・更新・削除APIをご利用ください。&lt;/li&gt; &lt;li&gt;本APIでは+更新行(renews)の操作ができません。+更新行の作成・更新・削除APIをご利用ください。&lt;/li&gt;  &lt;li&gt;本APIでは収入／支出の切替えができません。既存の取引を削除後、再度作成してください。&lt;/li&gt;  &lt;li&gt;本APIで取引を更新すると、消費税の計算方法は必ず内税方式が選択されます。&lt;/li&gt;  &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/ul&gt;
   * @param id 取引ID (required)
   * @param parameters 取引（収入／支出）の更新 (optional)
   * @return Observable&lt;DealsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/deals/{id}")
  Observable<DealsResponse> updateDeal(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body UpdateDealParams parameters
  );

}
