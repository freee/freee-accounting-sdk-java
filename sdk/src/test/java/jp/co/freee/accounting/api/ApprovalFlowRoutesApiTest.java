package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.ApprovalFlowRouteResponse;
import jp.co.freee.accounting.models.ApprovalFlowRoutesIndexResponse;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApprovalFlowRoutesApi
 */
public class ApprovalFlowRoutesApiTest {

    private ApprovalFlowRoutesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ApprovalFlowRoutesApi.class);
    }

    /**
     * 申請経路の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の申請経路を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;   &lt;li&gt;     &lt;p&gt;申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請と申請経路はAPI経由で参照は可能ですが、作成と更新、承認ステータスの変更ができません。&lt;/p&gt;     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;個人アカウントの場合は、プレミアムプランでご利用できます。&lt;/li&gt;   &lt;li&gt;法人アカウントの場合は、ベーシックプラン、プロフェッショナルプラン、エンタープライズプランでご利用できます。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getApprovalFlowRouteTest() {
        Integer id = null;
        Integer companyId = null;
        // ApprovalFlowRouteResponse response = api.getApprovalFlowRoute(id, companyId);

        // TODO: test validations
    }
    /**
     * 申請経路一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の申請経路一覧を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;   &lt;li&gt;     &lt;p&gt;申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請と申請経路はAPI経由で参照は可能ですが、作成と更新、承認ステータスの変更ができません。&lt;/p&gt;     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;個人アカウントの場合は、プレミアムプランでご利用できます。&lt;/li&gt;   &lt;li&gt;法人アカウントの場合は、ベーシックプラン、プロフェッショナルプラン、エンタープライズプランでご利用できます。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getApprovalFlowRoutesTest() {
        Integer companyId = null;
        Integer includedUserId = null;
        String usage = null;
        Integer requestFormId = null;
        // ApprovalFlowRoutesIndexResponse response = api.getApprovalFlowRoutes(companyId, includedUserId, usage, requestFormId);

        // TODO: test validations
    }
}
