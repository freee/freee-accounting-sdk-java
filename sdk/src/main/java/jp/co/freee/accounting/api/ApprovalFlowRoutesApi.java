package jp.co.freee.accounting.api;

import jp.co.freee.accounting.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import jp.co.freee.accounting.models.ApprovalFlowRouteResponse;
import jp.co.freee.accounting.models.ApprovalFlowRoutesIndexResponse;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ApprovalFlowRoutesApi {
  /**
   * 申請経路の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の申請経路を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;   &lt;li&gt;     &lt;p&gt;申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請と申請経路はAPI経由で参照は可能ですが、作成と更新、承認ステータスの変更ができません。&lt;/p&gt;     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;個人アカウントの場合は、プレミアムプランでご利用できます。&lt;/li&gt;   &lt;li&gt;法人アカウントの場合は、ベーシックプラン、プロフェッショナルプラン、エンタープライズプランでご利用できます。&lt;/li&gt; &lt;/ul&gt;
   * @param id 経路申請ID (required)
   * @param companyId 事業所ID (required)
   * @return Observable&lt;ApprovalFlowRouteResponse&gt;
   */
  @GET("api/1/approval_flow_routes/{id}")
  Observable<ApprovalFlowRouteResponse> getApprovalFlowRoute(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("company_id") Integer companyId
  );

  /**
   * 申請経路一覧の取得
   *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の申請経路一覧を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;   &lt;li&gt;     &lt;p&gt;申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請と申請経路はAPI経由で参照は可能ですが、作成と更新、承認ステータスの変更ができません。&lt;/p&gt;     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;個人アカウントの場合は、プレミアムプランでご利用できます。&lt;/li&gt;   &lt;li&gt;法人アカウントの場合は、ベーシックプラン、プロフェッショナルプラン、エンタープライズプランでご利用できます。&lt;/li&gt; &lt;/ul&gt;
   * @param companyId 事業所ID (required)
   * @param includedUserId 経路に含まれるユーザーのユーザーID (optional)
   * @param usage 申請種別（各申請種別が使用できる申請経路に絞り込めます。例えば、ApprovalRequest を指定すると、各種申請が使用できる申請経路に絞り込めます。） * &#x60;TxnApproval&#x60; - 仕訳承認 * &#x60;ExpenseApplication&#x60; - 経費精算 * &#x60;PaymentRequest&#x60; - 支払依頼 * &#x60;ApprovalRequest&#x60; - 各種申請 * &#x60;DocApproval&#x60; - 請求書等 (見積書・納品書・請求書・発注書) (optional)
   * @param requestFormId 申請フォームID request_form_id指定時はusage条件をApprovalRequestに指定してください。指定しない場合無効になります。 (optional)
   * @return Observable&lt;ApprovalFlowRoutesIndexResponse&gt;
   */
  @GET("api/1/approval_flow_routes")
  Observable<ApprovalFlowRoutesIndexResponse> getApprovalFlowRoutes(
    @retrofit2.http.Query("company_id") Integer companyId, @retrofit2.http.Query("included_user_id") Integer includedUserId, @retrofit2.http.Query("usage") String usage, @retrofit2.http.Query("request_form_id") Integer requestFormId
  );

}
