package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2009;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.SectionParams;
import jp.co.freee.accounting.models.SectionResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SectionsApi
 */
public class SectionsApiTest {

    private SectionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SectionsApi.class);
    }

    /**
     * 部門の作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,     &amp;quot;indent_count&amp;quot;: 1,     &amp;quot;parent_id&amp;quot;: 101   } } // それ以外のプラン {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;   } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void createSectionTest() {
        SectionParams sectionParams = null;
        // SectionResponse response = api.createSection(sectionParams);

        // TODO: test validations
    }
    /**
     * 部門の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を削除する&lt;/p&gt;
     */
    @Test
    public void destroySectionTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroySection(id, companyId);

        // TODO: test validations
    }
    /**
     * 
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を参照する&lt;/p&gt;&lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,     &amp;quot;indent_count&amp;quot;: 1,     &amp;quot;parent_id&amp;quot;: 101   } } // それ以外のプラン {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;   } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void getSectionTest() {
        Integer id = null;
        Integer companyId = null;
        // SectionResponse response = api.getSection(id, companyId);

        // TODO: test validations
    }
    /**
     * 部門一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/sections?company_id&#x3D;1&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;sections&amp;quot; : [     {       &amp;quot;id&amp;quot; : 101,       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,       &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,       &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,       &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,       &amp;quot;indent_count&amp;quot;: 1,       &amp;quot;parent_id&amp;quot;: 11     },     ...   ] } // それ以外のプラン {   &amp;quot;sections&amp;quot; : [     {       &amp;quot;id&amp;quot; : 101,       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,       &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,       &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,       &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;     },     ...   ] }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void getSectionsTest() {
        Integer companyId = null;
        // InlineResponse2009 response = api.getSections(companyId);

        // TODO: test validations
    }
    /**
     * 部門の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を更新する&lt;/p&gt;&lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,     &amp;quot;indent_count&amp;quot;: 1,     &amp;quot;parent_id&amp;quot;: 101   } } // それ以外のプラン {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;   } }&lt;/code&gt;&lt;/pre&gt; 
     */
    @Test
    public void updateSectionTest() {
        Integer id = null;
        SectionParams sectionParams = null;
        // SectionResponse response = api.updateSection(id, sectionParams);

        // TODO: test validations
    }
}
