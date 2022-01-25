package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2008;
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
     * 
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
     * 
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
     * 
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
     * 
     */
    @Test
    public void getTagsTest() {
        Integer companyId = null;
        String startUpdateDate = null;
        String endUpdateDate = null;
        Integer offset = null;
        Integer limit = null;
        // InlineResponse2008 response = api.getTags(companyId, startUpdateDate, endUpdateDate, offset, limit);

        // TODO: test validations
    }
    /**
     * メモタグの更新
     *
     * 
     */
    @Test
    public void updateTagTest() {
        Integer id = null;
        TagParams tagParams = null;
        // TagResponse response = api.updateTag(id, tagParams);

        // TODO: test validations
    }
}
