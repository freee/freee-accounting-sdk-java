package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2004;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.InvoiceCreateParams;
import jp.co.freee.accounting.models.InvoiceResponse;
import jp.co.freee.accounting.models.InvoiceUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesApi
 */
public class InvoicesApiTest {

    private InvoicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(InvoicesApi.class);
    }

    /**
     * 請求書の作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;partner_code, partner_idはどちらかの指定が必須です。ただし両方同時に指定することはできません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;請求書ステータス(invoice_status)を発行(issue)で利用した場合、請求内容の合計金額が0円以上になる必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;本APIでは請求内容(invoice_contents)は、最大100行までになります。&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void createInvoiceTest() {
        InvoiceCreateParams invoiceCreateParams = null;
        // InvoiceResponse response = api.createInvoice(invoiceCreateParams);

        // TODO: test validations
    }
    /**
     * 請求書の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書を削除する&lt;/p&gt;
     */
    @Test
    public void destroyInvoiceTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyInvoice(id, companyId);

        // TODO: test validations
    }
    /**
     * 請求書の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書詳細を取得する&lt;/p&gt;
     */
    @Test
    public void getInvoiceTest() {
        Integer id = null;
        Integer companyId = null;
        // InvoiceResponse response = api.getInvoice(id, companyId);

        // TODO: test validations
    }
    /**
     * 請求書一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書一覧を取得する&lt;/p&gt; 
     */
    @Test
    public void getInvoicesTest() {
        Integer companyId = null;
        Integer partnerId = null;
        String partnerCode = null;
        String startIssueDate = null;
        String endIssueDate = null;
        String startDueDate = null;
        String endDueDate = null;
        String invoiceNumber = null;
        String description = null;
        String invoiceStatus = null;
        String paymentStatus = null;
        Long offset = null;
        Integer limit = null;
        // InlineResponse2004 response = api.getInvoices(companyId, partnerId, partnerCode, startIssueDate, endIssueDate, startDueDate, endDueDate, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit);

        // TODO: test validations
    }
    /**
     * 請求書の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;入金済みの請求書に対する金額関連の変更はできません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;請求書ステータスは確定(issue)のみ指定可能です。請求書ステータスを確定する時のみ指定してください。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;請求書WFを利用している場合、承認済み請求書は承認権限を持たないユーザーでは更新できません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;更新後の請求書ステータス(invoice_status)が下書き以外の場合、請求内容の合計金額が0円以上になる必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;partner_code, partner_idを両方同時に指定することはできません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;本APIでは請求内容(invoice_contents)は、最大100行までになります。&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void updateInvoiceTest() {
        Integer id = null;
        InvoiceUpdateParams invoiceUpdateParams = null;
        // InvoiceResponse response = api.updateInvoice(id, invoiceUpdateParams);

        // TODO: test validations
    }
}
