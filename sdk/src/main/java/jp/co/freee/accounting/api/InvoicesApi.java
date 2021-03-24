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
import jp.co.freee.accounting.models.InlineResponse2004;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.InvoiceCreateParams;
import jp.co.freee.accounting.models.InvoiceResponse;
import jp.co.freee.accounting.models.InvoiceUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InvoicesApi {
  /**
   * 請求書の作成
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;partner_code, partner_idはどちらかの指定が必須です。ただし両方同時に指定することはできません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;請求書ステータス(invoice_status)を発行(issue)で利用した場合、請求内容の合計金額が0円以上になる必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;本APIでは請求内容(invoice_contents)は、最大100行までになります。&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
   * @param invoiceCreateParams 請求書の作成 (optional)
   * @return Observable&lt;InvoiceResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/invoices")
  Observable<InvoiceResponse> createInvoice(
    @retrofit2.http.Body InvoiceCreateParams invoiceCreateParams
  );

  /**
   * 請求書の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書を削除する&lt;/p&gt;
   * @param id  (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/invoices/{id}")
  Completable destroyInvoice(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 請求書の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書詳細を取得する&lt;/p&gt;
   * @param id 請求書ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;InvoiceResponse&gt;
   */
  @GET("api/1/invoices/{id}")
  Observable<InvoiceResponse> getInvoice(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 請求書一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書一覧を取得する&lt;/p&gt; 
   * @param companyId 事業所ID (required)
   * @param partnerId 取引先IDで絞込 (optional)
   * @param partnerCode 取引先コードで絞込 (optional)
   * @param startIssueDate 請求日の開始日(yyyy-mm-dd) (optional)
   * @param endIssueDate 請求日の終了日(yyyy-mm-dd) (optional)
   * @param startDueDate 期日の開始日(yyyy-mm-dd) (optional)
   * @param endDueDate 期日の終了日(yyyy-mm-dd) (optional)
   * @param invoiceNumber 請求書番号 (optional)
   * @param description 概要 (optional)
   * @param invoiceStatus 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, unsubmitted: 送付待ち, submitted: 送付済み) (optional)
   * @param paymentStatus 入金ステータス  (unsettled: 入金待ち, settled: 入金済み) (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)  (optional)
   * @return Observable&lt;InlineResponse2004&gt;
   */
  @GET("api/1/invoices")
  Observable<InlineResponse2004> getInvoices(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("partner_id") Integer partnerId, @retrofit2.http.Query("partner_code") String partnerCode, @retrofit2.http.Query("start_issue_date") String startIssueDate, @retrofit2.http.Query("end_issue_date") String endIssueDate, @retrofit2.http.Query("start_due_date") String startDueDate, @retrofit2.http.Query("end_due_date") String endDueDate, @retrofit2.http.Query("invoice_number") String invoiceNumber, @retrofit2.http.Query("description") String description, @retrofit2.http.Query("invoice_status") String invoiceStatus, @retrofit2.http.Query("payment_status") String paymentStatus, @retrofit2.http.Query("offset") Long offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 請求書の更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;入金済みの請求書に対する金額関連の変更はできません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;請求書ステータスは確定(issue)のみ指定可能です。請求書ステータスを確定する時のみ指定してください。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;請求書WFを利用している場合、承認済み請求書は承認権限を持たないユーザーでは更新できません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;更新後の請求書ステータス(invoice_status)が下書き以外の場合、請求内容の合計金額が0円以上になる必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;partner_code, partner_idを両方同時に指定することはできません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;本APIでは請求内容(invoice_contents)は、最大100行までになります。&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
   * @param id 請求書ID (required)
   * @param invoiceUpdateParams 請求書の更新 (optional)
   * @return Observable&lt;InvoiceResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/invoices/{id}")
  Observable<InvoiceResponse> updateInvoice(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body InvoiceUpdateParams invoiceUpdateParams
  );

}
