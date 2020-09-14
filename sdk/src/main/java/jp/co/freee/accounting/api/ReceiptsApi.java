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
import java.io.File;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2008;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ReceiptResponse;
import jp.co.freee.accounting.models.ReceiptUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ReceiptsApi {
  /**
   * ファイルボックス 証憑ファイルアップロード
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ファイルボックスに証憑ファイルをアップロードする&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;リクエストヘッダーの Content-Type は、multipart/form-dataにのみ対応しています。&lt;/li&gt; &lt;/ul&gt;
   * @param companyId 事業所ID (required)
   * @param receipt 証憑ファイル (required)
   * @param description メモ (255文字以内) (optional)
   * @param issueDate 取引日 (yyyy-mm-dd) (optional)
   * @return Observable&lt;ReceiptResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("api/1/receipts")
  Observable<ReceiptResponse> createReceipt(
    @retrofit2.http.Part("company_id") Integer companyId, @retrofit2.http.Part MultipartBody.Part receipt, @retrofit2.http.Part("description") String description, @retrofit2.http.Part("issue_date") String issueDate
  );

  /**
   * ファイルボックス 証憑ファイルを削除する
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ファイルボックスの証憑ファイルを削除する&lt;/p&gt;
   * @param id 証憑ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/receipts/{id}")
  Completable destroyReceipt(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * ファイルボックス 証憑ファイルの取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のファイルボックス 証憑ファイルを取得する&lt;/p&gt;
   * @param id 証憑ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ReceiptResponse&gt;
   */
  @GET("api/1/receipts/{id}")
  Observable<ReceiptResponse> getReceipt(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * ファイルボックス 証憑ファイル一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のファイルボックス 証憑ファイル一覧を取得する&lt;/p&gt;
   * @param companyId 事業所ID (required)
   * @param startDate アップロード日 (yyyy-mm-dd) (required)
   * @param endDate アップロード日 (yyyy-mm-dd) (required)
   * @param userName アップロードしたユーザー名、メールアドレス (optional)
   * @param number アップロードファイルNo (optional)
   * @param commentType posted:コメントあり, raised:未解決, resolved:解決済 (optional)
   * @param commentImportant trueの時、重要コメント付きが対象 (optional)
   * @param category all:すべて、without_deal:未登録、with_expense_application_line:経費申請中, with_deal:登録済み、ignored:無視 (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) (optional)
   * @return Observable&lt;InlineResponse2008&gt;
   */
  @GET("api/1/receipts")
  Observable<InlineResponse2008> getReceipts(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("start_date") String startDate, @retrofit2.http.Query("end_date") String endDate, @retrofit2.http.Query("user_name") String userName, @retrofit2.http.Query("number") Integer number, @retrofit2.http.Query("comment_type") String commentType, @retrofit2.http.Query("comment_important") Boolean commentImportant, @retrofit2.http.Query("category") String category, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * ファイルボックス 証憑ファイル情報更新
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ファイルボックスの証憑ファイル情報を更新する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、証憑ファイルの再アップロードはできません。&lt;/li&gt; &lt;/ul&gt;
   * @param id 証憑ID (required)
   * @param receiptUpdateParams 経費申請の更新 (required)
   * @return Observable&lt;ReceiptResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/receipts/{id}")
  Observable<ReceiptResponse> updateReceipt(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ReceiptUpdateParams receiptUpdateParams
  );

}
