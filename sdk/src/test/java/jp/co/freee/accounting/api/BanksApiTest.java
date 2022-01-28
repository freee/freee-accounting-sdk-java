package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.BankResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse200;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BanksApi
 */
public class BanksApiTest {

    private BanksApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BanksApi.class);
    }

    /**
     * 連携サービスの取得
     *
     * 
     */
    @Test
    public void getBankTest() {
        Integer id = null;
        // BankResponse response = api.getBank(id);

        // TODO: test validations
    }
    /**
     * 連携サービス一覧の取得
     *
     * 
     */
    @Test
    public void getBanksTest() {
        Long offset = null;
        Integer limit = null;
        String type = null;
        // InlineResponse200 response = api.getBanks(offset, limit, type);

        // TODO: test validations
    }
}
