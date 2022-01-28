package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.AccountItemParams;
import jp.co.freee.accounting.models.AccountItemResponse;
import jp.co.freee.accounting.models.AccountItemsResponse;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ServiceUnavailableError;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountItemsApi
 */
public class AccountItemsApiTest {

    private AccountItemsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountItemsApi.class);
    }

    /**
     * 勘定科目の作成
     *
     * 
     */
    @Test
    public void createAccountItemTest() {
        AccountItemParams accountItemParams = null;
        // AccountItemResponse response = api.createAccountItem(accountItemParams);

        // TODO: test validations
    }
    /**
     * 勘定科目の削除
     *
     * 
     */
    @Test
    public void destroyAccountItemTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyAccountItem(id, companyId);

        // TODO: test validations
    }
    /**
     * 勘定科目の詳細情報の取得
     *
     * 
     */
    @Test
    public void getAccountItemTest() {
        Integer id = null;
        Integer companyId = null;
        // AccountItemResponse response = api.getAccountItem(id, companyId);

        // TODO: test validations
    }
    /**
     * 勘定科目一覧の取得
     *
     * 
     */
    @Test
    public void getAccountItemsTest() {
        Integer companyId = null;
        String baseDate = null;
        // AccountItemsResponse response = api.getAccountItems(companyId, baseDate);

        // TODO: test validations
    }
    /**
     * 勘定科目の更新
     *
     * 
     */
    @Test
    public void updateAccountItemTest() {
        Integer id = null;
        AccountItemParams accountItemParams = null;
        // AccountItemResponse response = api.updateAccountItem(id, accountItemParams);

        // TODO: test validations
    }
}
