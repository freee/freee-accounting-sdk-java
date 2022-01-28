package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.PartnerCreateParams;
import jp.co.freee.accounting.models.PartnerResponse;
import jp.co.freee.accounting.models.PartnerUpdateParams;
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
     * 
     */
    @Test
    public void createPartnerTest() {
        PartnerCreateParams partnerCreateParams = null;
        // PartnerResponse response = api.createPartner(partnerCreateParams);

        // TODO: test validations
    }
    /**
     * 取引先の削除
     *
     * 
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
     * 
     */
    @Test
    public void getPartnerTest() {
        Integer id = null;
        Integer companyId = null;
        // PartnerResponse response = api.getPartner(id, companyId);

        // TODO: test validations
    }
    /**
     * 取引先一覧の取得
     *
     * 
     */
    @Test
    public void getPartnersTest() {
        Integer companyId = null;
        String startUpdateDate = null;
        String endUpdateDate = null;
        Long offset = null;
        Integer limit = null;
        String keyword = null;
        // PartnersResponse response = api.getPartners(companyId, startUpdateDate, endUpdateDate, offset, limit, keyword);

        // TODO: test validations
    }
    /**
     * 取引先の更新
     *
     * 
     */
    @Test
    public void updatePartnerTest() {
        Integer id = null;
        PartnerUpdateParams partnerUpdateParams = null;
        // PartnerResponse response = api.updatePartner(id, partnerUpdateParams);

        // TODO: test validations
    }
    /**
     * 取引先の更新
     *
     * 
     */
    @Test
    public void updatePartnerByCodeTest() {
        String code = null;
        PartnerUpdateParams partnerUpdateParams = null;
        // PartnerResponse response = api.updatePartnerByCode(code, partnerUpdateParams);

        // TODO: test validations
    }
}
