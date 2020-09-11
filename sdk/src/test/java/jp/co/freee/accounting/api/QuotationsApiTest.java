package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2007;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.QuotationCreateParams;
import jp.co.freee.accounting.models.QuotationResponse;
import jp.co.freee.accounting.models.QuotationUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuotationsApi
 */
public class QuotationsApiTest {

    private QuotationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(QuotationsApi.class);
    }

    /**
     * 見積書の作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の見積書を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;partner_code, partner_idはどちらかの指定が必須です。ただし両方同時に指定することはできません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;本APIでは見積内容(quotation_contents)は、最大100行までになります。&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void createQuotationTest() {
        QuotationCreateParams quotationCreateParams = null;
        // QuotationResponse response = api.createQuotation(quotationCreateParams);

        // TODO: test validations
    }
    /**
     * 見積書の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の見積書を削除する&lt;/p&gt;
     */
    @Test
    public void destroyQuotationTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyQuotation(id, companyId);

        // TODO: test validations
    }
    /**
     * 見積書の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の見積書詳細を取得する&lt;/p&gt;
     */
    @Test
    public void getQuotationTest() {
        Integer id = null;
        Integer companyId = null;
        // QuotationResponse response = api.getQuotation(id, companyId);

        // TODO: test validations
    }
    /**
     * 見積書一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の見積書一覧を取得する&lt;/p&gt; 
     */
    @Test
    public void getQuotationsTest() {
        Integer companyId = null;
        Integer partnerId = null;
        String partnerCode = null;
        String startIssueDate = null;
        String endIssueDate = null;
        String quotationNumber = null;
        String description = null;
        String quotationStatus = null;
        Integer offset = null;
        Integer limit = null;
        // InlineResponse2007 response = api.getQuotations(companyId, partnerId, partnerCode, startIssueDate, endIssueDate, quotationNumber, description, quotationStatus, offset, limit);

        // TODO: test validations
    }
    /**
     * 見積書の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の見積書を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;partner_code, partner_idを両方同時に指定することはできません。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;本APIでは見積内容(quotation_contents)は、最大100行までになります。&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void updateQuotationTest() {
        Integer id = null;
        QuotationUpdateParams quotationUpdateParams = null;
        // QuotationResponse response = api.updateQuotation(id, quotationUpdateParams);

        // TODO: test validations
    }
}
