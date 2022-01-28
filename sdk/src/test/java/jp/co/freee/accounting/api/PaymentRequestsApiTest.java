package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.PaymentRequestActionCreateParams;
import jp.co.freee.accounting.models.PaymentRequestCreateParams;
import jp.co.freee.accounting.models.PaymentRequestResponse;
import jp.co.freee.accounting.models.PaymentRequestUpdateParams;
import jp.co.freee.accounting.models.PaymentRequestsIndexResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentRequestsApi
 */
public class PaymentRequestsApiTest {

    private PaymentRequestsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentRequestsApi.class);
    }

    /**
     * 支払依頼の作成
     *
     * 
     */
    @Test
    public void createPaymentRequestTest() {
        PaymentRequestCreateParams paymentRequestCreateParams = null;
        // PaymentRequestResponse response = api.createPaymentRequest(paymentRequestCreateParams);

        // TODO: test validations
    }
    /**
     * 支払依頼の削除
     *
     * 
     */
    @Test
    public void destroyPaymentRequestTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyPaymentRequest(id, companyId);

        // TODO: test validations
    }
    /**
     * 支払依頼詳細の取得
     *
     * 
     */
    @Test
    public void getPaymentRequestTest() {
        Integer id = null;
        Integer companyId = null;
        // PaymentRequestResponse response = api.getPaymentRequest(id, companyId);

        // TODO: test validations
    }
    /**
     * 支払依頼一覧の取得
     *
     * 
     */
    @Test
    public void getPaymentRequestsTest() {
        Integer companyId = null;
        String status = null;
        String startApplicationDate = null;
        String endApplicationDate = null;
        String startIssueDate = null;
        String endIssueDate = null;
        Integer applicationNumber = null;
        String title = null;
        Integer applicantId = null;
        Integer approverId = null;
        Integer minAmount = null;
        Integer maxAmount = null;
        Integer partnerId = null;
        String partnerCode = null;
        String paymentMethod = null;
        String startPaymentDate = null;
        String endPaymentDate = null;
        String documentCode = null;
        Long offset = null;
        Integer limit = null;
        // PaymentRequestsIndexResponse response = api.getPaymentRequests(companyId, status, startApplicationDate, endApplicationDate, startIssueDate, endIssueDate, applicationNumber, title, applicantId, approverId, minAmount, maxAmount, partnerId, partnerCode, paymentMethod, startPaymentDate, endPaymentDate, documentCode, offset, limit);

        // TODO: test validations
    }
    /**
     * 支払依頼の更新
     *
     * 
     */
    @Test
    public void updatePaymentRequestTest() {
        Integer id = null;
        PaymentRequestUpdateParams paymentRequestUpdateParams = null;
        // PaymentRequestResponse response = api.updatePaymentRequest(id, paymentRequestUpdateParams);

        // TODO: test validations
    }
    /**
     * 支払依頼の承認操作
     *
     * 
     */
    @Test
    public void updatePaymentRequestActionTest() {
        Integer id = null;
        PaymentRequestActionCreateParams paymentRequestActionCreateParams = null;
        // PaymentRequestResponse response = api.updatePaymentRequestAction(id, paymentRequestActionCreateParams);

        // TODO: test validations
    }
}
