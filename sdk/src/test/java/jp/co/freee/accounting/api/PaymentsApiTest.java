package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.DealResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.PaymentParams;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
public class PaymentsApiTest {

    private PaymentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsApi.class);
    }

    /**
     * 取引（収入／支出）の支払行作成
     *
     * 
     */
    @Test
    public void createDealPaymentTest() {
        Integer id = null;
        PaymentParams paymentParams = null;
        // DealResponse response = api.createDealPayment(id, paymentParams);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の支払行削除
     *
     * 
     */
    @Test
    public void destroyDealPaymentTest() {
        Integer id = null;
        Long paymentId = null;
        Integer companyId = null;
        // api.destroyDealPayment(id, paymentId, companyId);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の支払行更新
     *
     * 
     */
    @Test
    public void updateDealPaymentTest() {
        Integer id = null;
        Long paymentId = null;
        PaymentParams paymentParams = null;
        // DealResponse response = api.updateDealPayment(id, paymentId, paymentParams);

        // TODO: test validations
    }
}
