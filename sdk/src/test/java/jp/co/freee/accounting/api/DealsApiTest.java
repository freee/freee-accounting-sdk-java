package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.DealCreateParams;
import jp.co.freee.accounting.models.DealCreateResponse;
import jp.co.freee.accounting.models.DealResponse;
import jp.co.freee.accounting.models.DealUpdateParams;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2001;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DealsApi
 */
public class DealsApiTest {

    private DealsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DealsApi.class);
    }

    /**
     * 取引（収入／支出）の作成
     *
     * 
     */
    @Test
    public void createDealTest() {
        DealCreateParams dealCreateParams = null;
        // DealCreateResponse response = api.createDeal(dealCreateParams);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の削除
     *
     * 
     */
    @Test
    public void destroyDealTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyDeal(id, companyId);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の取得
     *
     * 
     */
    @Test
    public void getDealTest() {
        Integer id = null;
        Integer companyId = null;
        String accruals = null;
        // DealResponse response = api.getDeal(id, companyId, accruals);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）一覧の取得
     *
     * 
     */
    @Test
    public void getDealsTest() {
        Integer companyId = null;
        Integer partnerId = null;
        Integer accountItemId = null;
        String partnerCode = null;
        String status = null;
        String type = null;
        String startIssueDate = null;
        String endIssueDate = null;
        String startDueDate = null;
        String endDueDate = null;
        String startRenewDate = null;
        String endRenewDate = null;
        Long offset = null;
        Integer limit = null;
        String registeredFrom = null;
        String accruals = null;
        // InlineResponse2001 response = api.getDeals(companyId, partnerId, accountItemId, partnerCode, status, type, startIssueDate, endIssueDate, startDueDate, endDueDate, startRenewDate, endRenewDate, offset, limit, registeredFrom, accruals);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の更新
     *
     * 
     */
    @Test
    public void updateDealTest() {
        Integer id = null;
        DealUpdateParams dealUpdateParams = null;
        // DealResponse response = api.updateDeal(id, dealUpdateParams);

        // TODO: test validations
    }
}
