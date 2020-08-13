package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.ApprovalRequestActionCreateParams;
import jp.co.freee.accounting.models.ApprovalRequestCreateParams;
import jp.co.freee.accounting.models.ApprovalRequestFormResponse;
import jp.co.freee.accounting.models.ApprovalRequestResponse;
import jp.co.freee.accounting.models.ApprovalRequestUpdateParams;
import jp.co.freee.accounting.models.ApprovalRequestsIndexResponse;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse200;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ApprovalRequestsApi {
  /**
   * 各種申請の作成
   *  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請を作成する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、各種申請を作成することができます。&lt;/li&gt;   &lt;li&gt;     申請項目(request_items)については、申請フォームで設定された項目のIDとそれに対応する値を入力してください。     &lt;ul&gt;       &lt;li&gt;タイトル(title)：文字列(改行なし) 例)予算申請&lt;/li&gt;       &lt;li&gt;1行コメント(single_line)：文字列(改行なし) 例)予算に関する申請&lt;/li&gt;       &lt;li&gt;複数行コメント(multi_line)：文字列(改行あり)       &lt;br&gt;       &amp;nbsp;&amp;nbsp;例)&lt;br&gt;       &amp;nbsp;&amp;nbsp;予算に関する申請&lt;br&gt;       &amp;nbsp;&amp;nbsp;申請日 2020-01-01&lt;br&gt;       &lt;/li&gt;       &lt;li&gt;プルダウン(select)： プルダウンの選択肢の名前(改行なし) 例)開発部&lt;/li&gt;       &lt;li&gt;日付(date)： 日付形式 例)2020-01-01&lt;/li&gt;       &lt;li&gt;金額(amount)： 数値(申請フォームで設定した上限・下限金額内の値, 改行なし) 例)10000&lt;/li&gt;       &lt;li&gt;添付ファイル(receipt)： ファイルボックスAPIのID 例)1&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;     申請ステータス(下書き、申請中)の指定と変更、及び承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）は以下を参考にして行ってください。     &lt;ul&gt;       &lt;li&gt;         承認操作は申請ステータスが申請中、承認済み、却下のものだけが対象です。         &lt;ul&gt;           &lt;li&gt;             初回申請の場合             &lt;ul&gt;&lt;li&gt;申請の作成（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             作成済みの申請の申請ステータス変更・更新する場合             &lt;ul&gt;&lt;li&gt;申請の更新（PUT）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             申請中、承認済み、却下の申請の承認操作を行う場合             &lt;ul&gt;&lt;li&gt;承認操作の実行（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;申請の削除（DELETE）が可能なのは申請ステータスが下書き、差戻しの場合のみです&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請は本API経由で作成ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;Web画面やAPIを通じて申請フォームが変更されると、本APIで使用する項目ID（request_itemsで指定するid）も変更されます。本API利用前に各種申請の取得APIを利用し、最新の申請フォームを取得することを推奨します。&lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;
   * @param approvalRequestCreateParams 各種申請の作成 (optional)
   * @return Observable&lt;ApprovalRequestResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/approval_requests")
  Observable<ApprovalRequestResponse> createApprovalRequest(
    @retrofit2.http.Body ApprovalRequestCreateParams approvalRequestCreateParams
  );

  /**
   * 各種申請の削除
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請を削除する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;     申請ステータス(下書き、申請中)の指定と変更、及び承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）は以下を参考にして行ってください。     &lt;ul&gt;       &lt;li&gt;         承認操作は申請ステータスが申請中、承認済み、却下のものだけが対象です。         &lt;ul&gt;           &lt;li&gt;             初回申請の場合             &lt;ul&gt;&lt;li&gt;申請の作成（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             作成済みの申請の申請ステータス変更・更新する場合             &lt;ul&gt;&lt;li&gt;申請の更新（PUT）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             申請中、承認済み、却下の申請の承認操作を行う場合             &lt;ul&gt;&lt;li&gt;承認操作の実行（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;申請の削除（DELETE）が可能なのは申請ステータスが下書き、差戻しの場合のみです&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;
   * @param id 各種申請ID (required)
   * @param companyId 事業所ID (required)
   * @return Completable
   */
  @DELETE("api/1/approval_requests/{id}")
  Completable destroyApprovalRequest(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 各種申請の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請と申請経路はAPI経由で参照は可能ですが、作成と更新、承認ステータスの変更ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;
   * @param id 各種申請ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ApprovalRequestResponse&gt;
   */
  @GET("api/1/approval_requests/{id}")
  Observable<ApprovalRequestResponse> getApprovalRequest(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 各種申請の申請フォームの取得
   *  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請の申請フォームを取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;
   * @param id 申請フォームID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ApprovalRequestFormResponse&gt;
   */
  @GET("api/1/approval_requests/forms/{id}")
  Observable<ApprovalRequestFormResponse> getApprovalRequestForm(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 各種申請の申請フォーム一覧の取得
   *  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請の申請フォーム一覧を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;
   * @param companyId 事業所ID (required)
   * @return Observable&lt;InlineResponse200&gt;
   */
  @GET("api/1/approval_requests/forms")
  Observable<InlineResponse200> getApprovalRequestForms(
    @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 各種申請の一覧
   *  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請一覧を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、各種申請の一覧を取得することができます。&lt;/li&gt;   &lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請と申請経路はAPI経由で参照は可能ですが、作成と更新、承認ステータスの変更ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;
   * @param companyId 事業所ID (required)
   * @param status 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し) (optional)
   * @param applicationNumber 申請No. (optional)
   * @param title 申請タイトル (optional)
   * @param formId 申請フォームID (optional)
   * @param startApplicationDate 申請日で絞込：開始日(yyyy-mm-dd) (optional)
   * @param endApplicationDate 申請日で絞込：終了日(yyyy-mm-dd) (optional)
   * @param applicantId 申請者のユーザーID (optional)
   * @param approverId 承認者のユーザーID (optional)
   * @param offset 取得レコードのオフセット (デフォルト: 0) (optional)
   * @param limit 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500) (optional)
   * @return Observable&lt;ApprovalRequestsIndexResponse&gt;
   */
  @GET("api/1/approval_requests")
  Observable<ApprovalRequestsIndexResponse> getApprovalRequests(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("application_number") Integer applicationNumber, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("form_id") Integer formId, @retrofit2.http.Query("start_application_date") String startApplicationDate, @retrofit2.http.Query("end_application_date") String endApplicationDate, @retrofit2.http.Query("applicant_id") Integer applicantId, @retrofit2.http.Query("approver_id") Integer approverId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 各種申請の更新
   *  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請を更新する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、各種申請を更新することができます。&lt;/li&gt;   &lt;li&gt;     申請項目(request_items)については、各種申請の取得APIで取得したrequest_items.idとそれに対応する値を入力してください。     &lt;ul&gt;       &lt;li&gt;タイトル(title)：文字列(改行なし) 例)予算申請&lt;/li&gt;       &lt;li&gt;1行コメント(single_line)：文字列(改行なし) 例)予算に関する申請&lt;/li&gt;       &lt;li&gt;複数行コメント(multi_line)：文字列(改行あり)       &lt;br&gt;       &amp;nbsp;&amp;nbsp;例)&lt;br&gt;       &amp;nbsp;&amp;nbsp;予算に関する申請&lt;br&gt;       &amp;nbsp;&amp;nbsp;申請日 2020-01-01&lt;br&gt;       &lt;/li&gt;       &lt;li&gt;プルダウン(select)： プルダウンの選択肢の名前(改行なし) 例)開発部&lt;/li&gt;       &lt;li&gt;日付(date)： 日付形式 例)2020-01-01&lt;/li&gt;       &lt;li&gt;金額(amount)： 数値(申請フォームで設定した上限・下限金額内の値, 改行なし) 例)10000&lt;/li&gt;       &lt;li&gt;添付ファイル(receipt)： ファイルボックスAPIのID 例)1&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIでは、status(申請ステータス): draft:下書き, feedback:差戻しのみ更新可能です。&lt;/li&gt;   &lt;li&gt;     申請ステータス(下書き、申請中)の指定と変更、及び承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）は以下を参考にして行ってください。     &lt;ul&gt;       &lt;li&gt;         承認操作は申請ステータスが申請中、承認済み、却下のものだけが対象です。         &lt;ul&gt;           &lt;li&gt;             初回申請の場合             &lt;ul&gt;&lt;li&gt;申請の作成（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             作成済みの申請の申請ステータス変更・更新する場合             &lt;ul&gt;&lt;li&gt;申請の更新（PUT）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             申請中、承認済み、却下の申請の承認操作を行う場合             &lt;ul&gt;&lt;li&gt;承認操作の実行（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;申請の削除（DELETE）が可能なのは申請ステータスが下書き、差戻しの場合のみです&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請は本API経由で更新ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;Web画面やAPIを通じて申請フォームが変更されると、本APIで使用する項目ID（request_itemsで指定するid）も変更されます。本APIで使用する項目IDは申請作成時点の項目IDです。本API利用前に各種申請の取得APIを利用し、申請作成時点の項目IDを取得することを推奨します。&lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;
   * @param id 各種申請ID (required)
   * @param approvalRequestUpdateParams 各種申請の更新 (required)
   * @return Observable&lt;ApprovalRequestResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/1/approval_requests/{id}")
  Observable<ApprovalRequestResponse> updateApprovalRequest(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ApprovalRequestUpdateParams approvalRequestUpdateParams
  );

  /**
   * 各種申請の承認操作
   *  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請の承認操作を行う&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、各種申請の承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）を行うことができます。&lt;/li&gt;   &lt;li&gt;     申請ステータス(下書き、申請中)の指定と変更、及び承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）は以下を参考にして行ってください。     &lt;ul&gt;       &lt;li&gt;         承認操作は申請ステータスが申請中、承認済み、却下のものだけが対象です。         &lt;ul&gt;           &lt;li&gt;             初回申請の場合             &lt;ul&gt;&lt;li&gt;申請の作成（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             作成済みの申請の申請ステータス変更・更新する場合             &lt;ul&gt;&lt;li&gt;申請の更新（PUT）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             申請中、承認済み、却下の申請の承認操作を行う場合             &lt;ul&gt;&lt;li&gt;承認操作の実行（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;申請の削除（DELETE）が可能なのは申請ステータスが下書き、差戻しの場合のみです&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt; 　&lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請はAPI経由で承認ステータスの変更ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;
   * @param id 各種申請ID (required)
   * @param approvalRequestActionCreateParams 各種申請の承認操作 (required)
   * @return Observable&lt;ApprovalRequestResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/approval_requests/{id}/actions")
  Observable<ApprovalRequestResponse> updateApprovalRequestAction(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ApprovalRequestActionCreateParams approvalRequestActionCreateParams
  );

}
