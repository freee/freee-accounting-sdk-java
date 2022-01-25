package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20014;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.WalletTxnParams;
import jp.co.freee.accounting.models.WalletTxnResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletTxnsApi
 */
public class WalletTxnsApiTest {

    private WalletTxnsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WalletTxnsApi.class);
    }

    /**
     * 明細の作成
     *
     * 
     */
    @Test
    public void createWalletTxnTest() {
        WalletTxnParams walletTxnParams = null;
        // WalletTxnResponse response = api.createWalletTxn(walletTxnParams);

        // TODO: test validations
    }
    /**
     * 明細の削除
     *
     * 
     */
    @Test
    public void destroyWalletTxnTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyWalletTxn(id, companyId);

        // TODO: test validations
    }
    /**
     * 明細の取得
     *
     * 
     */
    @Test
    public void getWalletTxnTest() {
        Integer id = null;
        Integer companyId = null;
        // WalletTxnResponse response = api.getWalletTxn(id, companyId);

        // TODO: test validations
    }
    /**
     * 明細一覧の取得
     *
     * 
     */
    @Test
    public void getWalletTxnsTest() {
        Integer companyId = null;
        String walletableType = null;
        Integer walletableId = null;
        String startDate = null;
        String endDate = null;
        String entrySide = null;
        Long offset = null;
        Integer limit = null;
        // InlineResponse20014 response = api.getWalletTxns(companyId, walletableType, walletableId, startDate, endDate, entrySide, offset, limit);

        // TODO: test validations
    }
}
