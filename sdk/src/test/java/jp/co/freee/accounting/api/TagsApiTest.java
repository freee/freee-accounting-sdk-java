package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20011;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.TagParams;
import jp.co.freee.accounting.models.TagResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagsApi
 */
public class TagsApiTest {

    private TagsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TagsApi.class);
    }

    /**
     * メモタグの作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを作成する&lt;/p&gt;
     */
    @Test
    public void createTagTest() {
        TagParams tagParams = null;
        // TagResponse response = api.createTag(tagParams);

        // TODO: test validations
    }
    /**
     * メモタグの削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを削除する&lt;/p&gt;
     */
    @Test
    public void destroyTagTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyTag(id, companyId);

        // TODO: test validations
    }
    /**
     * メモタグの詳細情報の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを取得する&lt;/p&gt;
     */
    @Test
    public void getTagTest() {
        Integer id = null;
        Integer companyId = null;
        // TagResponse response = api.getTag(id, companyId);

        // TODO: test validations
    }
    /**
     * メモタグ一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグ一覧を取得する&lt;/p&gt;
     */
    @Test
    public void getTagsTest() {
        Integer companyId = null;
        Integer offset = null;
        Integer limit = null;
        // InlineResponse20011 response = api.getTags(companyId, offset, limit);

        // TODO: test validations
    }
    /**
     * メモタグの更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを更新する&lt;/p&gt;
     */
    @Test
    public void updateTagTest() {
        Integer id = null;
        TagParams tagParams = null;
        // TagResponse response = api.updateTag(id, tagParams);

        // TODO: test validations
    }
}
