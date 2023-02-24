package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20010;
import jp.co.freee.accounting.models.InlineResponse2009;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.TaxResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxesApi
 */
public class TaxesApiTest {

    private TaxesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TaxesApi.class);
    }

    /**
     * 税区分の取得
     *
     * 
     */
    @Test
    public void getTaxCodeTest() {
        Integer code = null;
        // TaxResponse response = api.getTaxCode(code);

        // TODO: test validations
    }
    /**
     * 税区分一覧の取得
     *
     * 
     */
    @Test
    public void getTaxCodesTest() {
        // InlineResponse2009 response = api.getTaxCodes();

        // TODO: test validations
    }
    /**
     * 指定した事業所の税区分一覧の取得
     *
     * 
     */
    @Test
    public void getTaxesCompaniesTest() {
        Integer companyId = null;
        String displayCategory = null;
        Boolean available = null;
        // InlineResponse20010 response = api.getTaxesCompanies(companyId, displayCategory, available);

        // TODO: test validations
    }
}
