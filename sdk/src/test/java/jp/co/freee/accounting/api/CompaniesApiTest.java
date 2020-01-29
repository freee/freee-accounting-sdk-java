package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.CompaniesIndexResponse;
import jp.co.freee.accounting.models.CompaniesShowResponse;
import jp.co.freee.accounting.models.CompaniesUpdateResponse;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.UpdateCompanyParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompaniesApi
 */
public class CompaniesApiTest {

    private CompaniesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CompaniesApi.class);
    }

    /**
     * 事業所一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザが所属する事業所の一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;role &lt;ul&gt; &lt;li&gt;admin : 管理者&lt;/li&gt;  &lt;li&gt;simple_accounting : 一般&lt;/li&gt;  &lt;li&gt;self_only : 取引登録のみ&lt;/li&gt;  &lt;li&gt;read_only : 閲覧のみ&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getCompaniesTest() {
        // CompaniesIndexResponse response = api.getCompanies();

        // TODO: test validations
    }
    /**
     * 事業所の詳細情報の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザが所属する事業所の詳細を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;role &lt;ul&gt; &lt;li&gt;admin : 管理者&lt;/li&gt;  &lt;li&gt;simple_accounting : 一般&lt;/li&gt;  &lt;li&gt;self_only : 取引登録のみ&lt;/li&gt;  &lt;li&gt;read_only : 閲覧のみ&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;
     */
    @Test
    public void getCompanyTest() {
        Integer id = null;
        Boolean details = null;
        Boolean accountItems = null;
        Boolean taxes = null;
        Boolean items = null;
        Boolean partners = null;
        Boolean sections = null;
        Boolean tags = null;
        Boolean walletables = null;
        // CompaniesShowResponse response = api.getCompany(id, details, accountItems, taxes, items, partners, sections, tags, walletables);

        // TODO: test validations
    }
    /**
     * 事業所情報の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザが所属する事業所の情報を更新する&lt;/p&gt;  &lt;p&gt;※同時に複数のリクエストを受け付けない&lt;/p&gt;
     */
    @Test
    public void updateCompanyTest() {
        Integer id = null;
        UpdateCompanyParams parameters = null;
        // CompaniesUpdateResponse response = api.updateCompany(id, parameters);

        // TODO: test validations
    }
}
