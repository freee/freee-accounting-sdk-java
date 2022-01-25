package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.QuotationCreateParams;
import jp.co.freee.accounting.models.QuotationIndexResponse;
import jp.co.freee.accounting.models.QuotationResponse;
import jp.co.freee.accounting.models.QuotationUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuotationsApi
 */
public class QuotationsApiTest {

    private QuotationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(QuotationsApi.class);
    }

    /**
     * 見積書の作成
     *
     * 
     */
    @Test
    public void createQuotationTest() {
        QuotationCreateParams quotationCreateParams = null;
        // QuotationResponse response = api.createQuotation(quotationCreateParams);

        // TODO: test validations
    }
    /**
     * 見積書の削除
     *
     * 
     */
    @Test
    public void destroyQuotationTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyQuotation(id, companyId);

        // TODO: test validations
    }
    /**
     * 見積書の取得
     *
     * 
     */
    @Test
    public void getQuotationTest() {
        Integer id = null;
        Integer companyId = null;
        // QuotationResponse response = api.getQuotation(id, companyId);

        // TODO: test validations
    }
    /**
     * 見積書一覧の取得
     *
     * 
     */
    @Test
    public void getQuotationsTest() {
        Integer companyId = null;
        Integer partnerId = null;
        String partnerCode = null;
        String startIssueDate = null;
        String endIssueDate = null;
        String quotationNumber = null;
        String description = null;
        String quotationStatus = null;
        Long offset = null;
        Integer limit = null;
        // QuotationIndexResponse response = api.getQuotations(companyId, partnerId, partnerCode, startIssueDate, endIssueDate, quotationNumber, description, quotationStatus, offset, limit);

        // TODO: test validations
    }
    /**
     * 見積書の更新
     *
     * 
     */
    @Test
    public void updateQuotationTest() {
        Integer id = null;
        QuotationUpdateParams quotationUpdateParams = null;
        // QuotationResponse response = api.updateQuotation(id, quotationUpdateParams);

        // TODO: test validations
    }
}
