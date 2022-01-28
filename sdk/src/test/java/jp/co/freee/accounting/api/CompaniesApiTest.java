package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.CompanyIndexResponse;
import jp.co.freee.accounting.models.CompanyResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
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
     * 
     */
    @Test
    public void getCompaniesTest() {
        // CompanyIndexResponse response = api.getCompanies();

        // TODO: test validations
    }
    /**
     * 事業所の詳細情報の取得
     *
     * 
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
        // CompanyResponse response = api.getCompany(id, details, accountItems, taxes, items, partners, sections, tags, walletables);

        // TODO: test validations
    }
}
