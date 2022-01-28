package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.DealResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.RenewCreateParams;
import jp.co.freee.accounting.models.RenewUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RenewsApi
 */
public class RenewsApiTest {

    private RenewsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RenewsApi.class);
    }

    /**
     * 取引（収入／支出）に対する+更新の作成
     *
     * 
     */
    @Test
    public void createDealRenewTest() {
        Integer id = null;
        RenewCreateParams renewCreateParams = null;
        // DealResponse response = api.createDealRenew(id, renewCreateParams);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の+更新の削除
     *
     * 
     */
    @Test
    public void deleteDealRenewTest() {
        Integer id = null;
        Integer renewId = null;
        Integer companyId = null;
        // DealResponse response = api.deleteDealRenew(id, renewId, companyId);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の+更新の更新
     *
     * 
     */
    @Test
    public void updateDealRenewTest() {
        Integer id = null;
        Integer renewId = null;
        RenewUpdateParams renewUpdateParams = null;
        // DealResponse response = api.updateDealRenew(id, renewId, renewUpdateParams);

        // TODO: test validations
    }
}
