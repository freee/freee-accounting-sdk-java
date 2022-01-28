package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20011;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.TransferParams;
import jp.co.freee.accounting.models.TransferResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransfersApi
 */
public class TransfersApiTest {

    private TransfersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TransfersApi.class);
    }

    /**
     * 取引（振替）の作成
     *
     * 
     */
    @Test
    public void createTransferTest() {
        TransferParams transferParams = null;
        // TransferResponse response = api.createTransfer(transferParams);

        // TODO: test validations
    }
    /**
     * 取引（振替）の削除する
     *
     * 
     */
    @Test
    public void destroyTransferTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyTransfer(id, companyId);

        // TODO: test validations
    }
    /**
     * 取引（振替）の取得
     *
     * 
     */
    @Test
    public void getTransferTest() {
        Integer id = null;
        Integer companyId = null;
        // TransferResponse response = api.getTransfer(id, companyId);

        // TODO: test validations
    }
    /**
     * 取引（振替）一覧の取得
     *
     * 
     */
    @Test
    public void getTransfersTest() {
        Integer companyId = null;
        String startDate = null;
        String endDate = null;
        Long offset = null;
        Integer limit = null;
        // InlineResponse20011 response = api.getTransfers(companyId, startDate, endDate, offset, limit);

        // TODO: test validations
    }
    /**
     * 取引（振替）の更新
     *
     * 
     */
    @Test
    public void updateTransferTest() {
        Integer id = null;
        TransferParams transferParams = null;
        // TransferResponse response = api.updateTransfer(id, transferParams);

        // TODO: test validations
    }
}
