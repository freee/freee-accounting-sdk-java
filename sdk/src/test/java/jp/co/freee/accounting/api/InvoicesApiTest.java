package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.InvoicesCreateParams;
import jp.co.freee.accounting.models.InvoicesIndexResponse;
import jp.co.freee.accounting.models.InvoicesResponse;
import jp.co.freee.accounting.models.InvoicesUpdateParams;
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
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;取引先ID（partner_id）と取引先の名称項目（partner_name, partner_long_name, partner_zipcode, partner_prefecture_code, partner_address1, partner_address2）を同時に指定することはできません。名称項目のみ指定した場合は新規取引先として登録されます。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;[重要] &lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://developer.freee.co.jp/news/1783\&quot; target&#x3D;\&quot;_blank\&quot;&gt;parnter_idは必須化予定&lt;/a&gt;です。parnter_idを必ず指定してご利用ください。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;請求書ステータス(invoice_status)を発行(issue)で利用した場合、請求内容の合計金額が0円以上になる必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt;&lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。また「partner_code、partner_id、partner_name」は同時に指定することはできません。&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    @Test
    public void createInvoiceTest() {
        InvoicesCreateParams parameters = null;
        // InvoicesResponse response = api.createInvoice(parameters);

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
        // InvoicesResponse response = api.getInvoice(id, companyId);

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
        String issueDateStart = null;
        String issueDateEnd = null;
        String dueDateStart = null;
        String dueDateEnd = null;
        String invoiceNumber = null;
        String description = null;
        String invoiceStatus = null;
        String paymentStatus = null;
        Integer offset = null;
        Integer limit = null;
        // InvoicesIndexResponse response = api.getInvoices(companyId, partnerId, partnerCode, issueDateStart, issueDateEnd, dueDateStart, dueDateEnd, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit);

        // TODO: test validations
    }
    /**
     * 請求書の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の請求書を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;取引先ID（partner_id）と取引先の名称項目（partner_name, partner_long_name, partner_zipcode, partner_prefecture_code, partner_address1, partner_address2）の更新はできません。名称項目を変更したい場合は取引先APIをご利用ください。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;[重要] &lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;https://developer.freee.co.jp/news/1783\&quot; target&#x3D;\&quot;_blank\&quot;&gt;parnter_idは必須化予定&lt;/a&gt;です。parnter_idを必ず指定してご利用ください。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;入金済みの請求書に対する金額関連の変更はできません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;請求書ステータスは確定(issue)のみ指定可能です。請求書ステータスを確定する時のみ指定してください。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;請求書WFを利用している場合、承認済み請求書は承認権限を持たないユーザーでは更新できません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;更新後の請求書ステータス(invoice_status)が下書き以外の場合、請求内容の合計金額が0円以上になる必要があります。&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。また「partner_code、partner_id、partner_name」は同時に指定することはできません。&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    @Test
    public void updateInvoiceTest() {
        Integer id = null;
        InvoicesUpdateParams parameters = null;
        // InvoicesResponse response = api.updateInvoice(id, parameters);

        // TODO: test validations
    }
}
