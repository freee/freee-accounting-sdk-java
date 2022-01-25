package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.ApprovalRequestActionCreateParams;
import jp.co.freee.accounting.models.ApprovalRequestCreateParams;
import jp.co.freee.accounting.models.ApprovalRequestFormIndexResponse;
import jp.co.freee.accounting.models.ApprovalRequestFormResponse;
import jp.co.freee.accounting.models.ApprovalRequestResponse;
import jp.co.freee.accounting.models.ApprovalRequestUpdateParams;
import jp.co.freee.accounting.models.ApprovalRequestsIndexResponse;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApprovalRequestsApi
 */
public class ApprovalRequestsApiTest {

    private ApprovalRequestsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ApprovalRequestsApi.class);
    }

    /**
     * 各種申請の作成
     *
     * 
     */
    @Test
    public void createApprovalRequestTest() {
        ApprovalRequestCreateParams approvalRequestCreateParams = null;
        // ApprovalRequestResponse response = api.createApprovalRequest(approvalRequestCreateParams);

        // TODO: test validations
    }
    /**
     * 各種申請の削除
     *
     * 
     */
    @Test
    public void destroyApprovalRequestTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyApprovalRequest(id, companyId);

        // TODO: test validations
    }
    /**
     * 各種申請の取得
     *
     * 
     */
    @Test
    public void getApprovalRequestTest() {
        Integer id = null;
        Integer companyId = null;
        // ApprovalRequestResponse response = api.getApprovalRequest(id, companyId);

        // TODO: test validations
    }
    /**
     * 各種申請の申請フォームの取得
     *
     * 
     */
    @Test
    public void getApprovalRequestFormTest() {
        Integer id = null;
        Integer companyId = null;
        // ApprovalRequestFormResponse response = api.getApprovalRequestForm(id, companyId);

        // TODO: test validations
    }
    /**
     * 各種申請の申請フォーム一覧の取得
     *
     * 
     */
    @Test
    public void getApprovalRequestFormsTest() {
        Integer companyId = null;
        // ApprovalRequestFormIndexResponse response = api.getApprovalRequestForms(companyId);

        // TODO: test validations
    }
    /**
     * 各種申請の一覧
     *
     * 
     */
    @Test
    public void getApprovalRequestsTest() {
        Integer companyId = null;
        String status = null;
        Integer applicationNumber = null;
        String title = null;
        Integer formId = null;
        String startApplicationDate = null;
        String endApplicationDate = null;
        Integer applicantId = null;
        Long minAmount = null;
        Long maxAmount = null;
        Integer approverId = null;
        Integer offset = null;
        Integer limit = null;
        // ApprovalRequestsIndexResponse response = api.getApprovalRequests(companyId, status, applicationNumber, title, formId, startApplicationDate, endApplicationDate, applicantId, minAmount, maxAmount, approverId, offset, limit);

        // TODO: test validations
    }
    /**
     * 各種申請の更新
     *
     * 
     */
    @Test
    public void updateApprovalRequestTest() {
        Integer id = null;
        ApprovalRequestUpdateParams approvalRequestUpdateParams = null;
        // ApprovalRequestResponse response = api.updateApprovalRequest(id, approvalRequestUpdateParams);

        // TODO: test validations
    }
    /**
     * 各種申請の承認操作
     *
     * 
     */
    @Test
    public void updateApprovalRequestActionTest() {
        Integer id = null;
        ApprovalRequestActionCreateParams approvalRequestActionCreateParams = null;
        // ApprovalRequestResponse response = api.updateApprovalRequestAction(id, approvalRequestActionCreateParams);

        // TODO: test validations
    }
}
