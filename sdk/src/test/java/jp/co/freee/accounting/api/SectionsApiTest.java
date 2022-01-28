package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2006;
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
     * 
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
     * 
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
     * 
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
     * 
     */
    @Test
    public void getSectionsTest() {
        Integer companyId = null;
        // InlineResponse2006 response = api.getSections(companyId);

        // TODO: test validations
    }
    /**
     * 部門の更新
     *
     * 
     */
    @Test
    public void updateSectionTest() {
        Integer id = null;
        SectionParams sectionParams = null;
        // SectionResponse response = api.updateSection(id, sectionParams);

        // TODO: test validations
    }
}
