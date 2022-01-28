package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20015;
import jp.co.freee.accounting.models.InlineResponse20016;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.WalletableCreateParams;
import jp.co.freee.accounting.models.WalletableCreateResponse;
import jp.co.freee.accounting.models.WalletableUpdateParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletablesApi
 */
public class WalletablesApiTest {

    private WalletablesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WalletablesApi.class);
    }

    /**
     * 口座の作成
     *
     * 
     */
    @Test
    public void createWalletableTest() {
        WalletableCreateParams walletableCreateParams = null;
        // WalletableCreateResponse response = api.createWalletable(walletableCreateParams);

        // TODO: test validations
    }
    /**
     * 口座の削除
     *
     * 
     */
    @Test
    public void destroyWalletableTest() {
        Integer id = null;
        String type = null;
        Integer companyId = null;
        // api.destroyWalletable(id, type, companyId);

        // TODO: test validations
    }
    /**
     * 口座情報の取得
     *
     * 
     */
    @Test
    public void getWalletableTest() {
        Integer id = null;
        String type = null;
        Integer companyId = null;
        // InlineResponse20016 response = api.getWalletable(id, type, companyId);

        // TODO: test validations
    }
    /**
     * 口座一覧の取得
     *
     * 
     */
    @Test
    public void getWalletablesTest() {
        Integer companyId = null;
        Boolean withBalance = null;
        String type = null;
        // InlineResponse20015 response = api.getWalletables(companyId, withBalance, type);

        // TODO: test validations
    }
    /**
     * 口座の更新
     *
     * 
     */
    @Test
    public void updateWalletableTest() {
        Integer id = null;
        String type = null;
        WalletableUpdateParams walletableUpdateParams = null;
        // InlineResponse20016 response = api.updateWalletable(id, type, walletableUpdateParams);

        // TODO: test validations
    }
}
