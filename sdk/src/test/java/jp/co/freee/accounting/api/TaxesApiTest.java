package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.TaxesCodesIndexResponse;
import jp.co.freee.accounting.models.TaxesCodesShowResponse;
import jp.co.freee.accounting.models.TaxesCompaniesResponse;
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
     * 税区分コードの取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;税区分コードを取得する&lt;/p&gt;
     */
    @Test
    public void getTaxCodeTest() {
        Integer code = null;
        // TaxesCodesShowResponse response = api.getTaxCode(code);

        // TODO: test validations
    }
    /**
     * 税区分コード一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;税区分コード一覧を取得する&lt;/p&gt;
     */
    @Test
    public void getTaxCodesTest() {
        // TaxesCodesIndexResponse response = api.getTaxCodes();

        // TODO: test validations
    }
    /**
     * 税区分コード詳細一覧の取得
     *
     * 
     */
    @Test
    public void getTaxesCompaniesTest() {
        Integer companyId = null;
        // TaxesCompaniesResponse response = api.getTaxesCompanies(companyId);

        // TODO: test validations
    }
}
