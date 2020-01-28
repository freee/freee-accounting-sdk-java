package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.PartnerCodeParams;
import jp.co.freee.accounting.models.PartnerCreateParams;
import jp.co.freee.accounting.models.PartnerUpdateParams;
import jp.co.freee.accounting.models.PartnersIndexResponse;
import jp.co.freee.accounting.models.PartnersResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartnersApi
 */
public class PartnersApiTest {

    private PartnersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PartnersApi.class);
    }

    /**
     * 取引先の作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先を作成する&lt;/p&gt; &lt;ul&gt; &lt;li&gt;codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/li&gt; &lt;li&gt;取引先コードの利用を有効にしている場合は、codeの指定は必須です。&lt;/li&gt;&lt;/ul&gt;
     */
    @Test
    public void createPartnerTest() {
        PartnerCreateParams parameters = null;
        // PartnersResponse response = api.createPartner(parameters);

        // TODO: test validations
    }
    /**
     * 取引先の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先を削除する&lt;/p&gt;
     */
    @Test
    public void destroyPartnerTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyPartner(id, companyId);

        // TODO: test validations
    }
    /**
     * 取引先の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先を取得する&lt;/p&gt;
     */
    @Test
    public void getPartnerTest() {
        Integer id = null;
        Integer companyId = null;
        // PartnersResponse response = api.getPartner(id, companyId);

        // TODO: test validations
    }
    /**
     * 取引先一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の取引先一覧を取得する&lt;/p&gt;
     */
    @Test
    public void getPartnersTest() {
        Integer companyId = null;
        Integer offset = null;
        Integer limit = null;
        String keyword = null;
        // PartnersIndexResponse response = api.getPartners(companyId, offset, limit, keyword);

        // TODO: test validations
    }
    /**
     * 取引先の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した取引先の情報を更新する&lt;/p&gt; &lt;ul&gt; &lt;li&gt;codeを指定、更新することはできません。&lt;/li&gt;&lt;/ul&gt;
     */
    @Test
    public void updatePartnerTest() {
        Integer id = null;
        PartnerUpdateParams parameters = null;
        // PartnersResponse response = api.updatePartner(id, parameters);

        // TODO: test validations
    }
    /**
     * 取引先の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;取引先コードをキーに、指定した取引先の情報を更新する&lt;/p&gt; &lt;ul&gt; &lt;li&gt;このAPIを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。&lt;/li&gt; &lt;li&gt;コードを日本語に設定している場合は、URLエンコードしてURLに含めるようにしてください。&lt;/li&gt;&lt;/ul&gt;
     */
    @Test
    public void updatePartnerByCodeTest() {
        String code = null;
        PartnerCodeParams parameters = null;
        // PartnersResponse response = api.updatePartnerByCode(code, parameters);

        // TODO: test validations
    }
}
