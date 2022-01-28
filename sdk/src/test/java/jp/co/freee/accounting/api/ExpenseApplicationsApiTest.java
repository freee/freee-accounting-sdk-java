package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ExpenseApplicationActionCreateParams;
import jp.co.freee.accounting.models.ExpenseApplicationCreateParams;
import jp.co.freee.accounting.models.ExpenseApplicationResponse;
import jp.co.freee.accounting.models.ExpenseApplicationUpdateParams;
import jp.co.freee.accounting.models.ExpenseApplicationsIndexResponse;
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
 * API tests for ExpenseApplicationsApi
 */
public class ExpenseApplicationsApiTest {

    private ExpenseApplicationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExpenseApplicationsApi.class);
    }

    /**
     * 経費申請の作成
     *
     * 
     */
    @Test
    public void createExpenseApplicationTest() {
        ExpenseApplicationCreateParams expenseApplicationCreateParams = null;
        // ExpenseApplicationResponse response = api.createExpenseApplication(expenseApplicationCreateParams);

        // TODO: test validations
    }
    /**
     * 経費申請の削除
     *
     * 
     */
    @Test
    public void destroyExpenseApplicationTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyExpenseApplication(id, companyId);

        // TODO: test validations
    }
    /**
     * 経費申請詳細の取得
     *
     * 
     */
    @Test
    public void getExpenseApplicationTest() {
        Integer id = null;
        Integer companyId = null;
        // ExpenseApplicationResponse response = api.getExpenseApplication(id, companyId);

        // TODO: test validations
    }
    /**
     * 経費申請一覧の取得
     *
     * 
     */
    @Test
    public void getExpenseApplicationsTest() {
        Integer companyId = null;
        String status = null;
        Boolean payrollAttached = null;
        String startTransactionDate = null;
        String endTransactionDate = null;
        Integer applicationNumber = null;
        String title = null;
        String startIssueDate = null;
        String endIssueDate = null;
        Integer applicantId = null;
        Integer approverId = null;
        Integer minAmount = null;
        Integer maxAmount = null;
        Long offset = null;
        Integer limit = null;
        // ExpenseApplicationsIndexResponse response = api.getExpenseApplications(companyId, status, payrollAttached, startTransactionDate, endTransactionDate, applicationNumber, title, startIssueDate, endIssueDate, applicantId, approverId, minAmount, maxAmount, offset, limit);

        // TODO: test validations
    }
    /**
     * 経費申請の更新
     *
     * 
     */
    @Test
    public void updateExpenseApplicationTest() {
        Integer id = null;
        ExpenseApplicationUpdateParams expenseApplicationUpdateParams = null;
        // ExpenseApplicationResponse response = api.updateExpenseApplication(id, expenseApplicationUpdateParams);

        // TODO: test validations
    }
    /**
     * 経費申請の承認操作
     *
     * 
     */
    @Test
    public void updateExpenseApplicationActionTest() {
        Integer id = null;
        ExpenseApplicationActionCreateParams expenseApplicationActionCreateParams = null;
        // ExpenseApplicationResponse response = api.updateExpenseApplicationAction(id, expenseApplicationActionCreateParams);

        // TODO: test validations
    }
}
