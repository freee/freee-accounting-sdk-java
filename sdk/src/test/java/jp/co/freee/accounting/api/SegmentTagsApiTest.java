package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2007;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.SegmentTagParams;
import jp.co.freee.accounting.models.SegmentTagResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SegmentTagsApi
 */
public class SegmentTagsApiTest {

    private SegmentTagsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SegmentTagsApi.class);
    }

    /**
     * セグメントの作成
     *
     * 
     */
    @Test
    public void createSegmentTagTest() {
        Integer segmentId = null;
        SegmentTagParams segmentTagParams = null;
        // SegmentTagResponse response = api.createSegmentTag(segmentId, segmentTagParams);

        // TODO: test validations
    }
    /**
     * セグメントタグの削除
     *
     * 
     */
    @Test
    public void destroySegmentsTagTest() {
        Integer segmentId = null;
        Integer id = null;
        Integer companyId = null;
        // api.destroySegmentsTag(segmentId, id, companyId);

        // TODO: test validations
    }
    /**
     * セグメントタグ一覧の取得
     *
     * 
     */
    @Test
    public void getSegmentTagsTest() {
        Integer segmentId = null;
        Integer companyId = null;
        Long offset = null;
        Integer limit = null;
        // InlineResponse2007 response = api.getSegmentTags(segmentId, companyId, offset, limit);

        // TODO: test validations
    }
    /**
     * セグメントタグの更新
     *
     * 
     */
    @Test
    public void updateSegmentTagTest() {
        Integer segmentId = null;
        Integer id = null;
        SegmentTagParams segmentTagParams = null;
        // SegmentTagResponse response = api.updateSegmentTag(segmentId, id, segmentTagParams);

        // TODO: test validations
    }
}
