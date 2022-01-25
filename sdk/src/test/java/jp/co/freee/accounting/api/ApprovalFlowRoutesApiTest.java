package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.ApprovalFlowRouteResponse;
import jp.co.freee.accounting.models.ApprovalFlowRoutesIndexResponse;
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
 * API tests for ApprovalFlowRoutesApi
 */
public class ApprovalFlowRoutesApiTest {

    private ApprovalFlowRoutesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ApprovalFlowRoutesApi.class);
    }

    /**
     * 申請経路の取得
     *
     * 
     */
    @Test
    public void getApprovalFlowRouteTest() {
        Integer id = null;
        Integer companyId = null;
        // ApprovalFlowRouteResponse response = api.getApprovalFlowRoute(id, companyId);

        // TODO: test validations
    }
    /**
     * 申請経路一覧の取得
     *
     * 
     */
    @Test
    public void getApprovalFlowRoutesTest() {
        Integer companyId = null;
        Integer includedUserId = null;
        String usage = null;
        Integer requestFormId = null;
        // ApprovalFlowRoutesIndexResponse response = api.getApprovalFlowRoutes(companyId, includedUserId, usage, requestFormId);

        // TODO: test validations
    }
}
