package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ExpenseApplicationLineTemplateParams;
import jp.co.freee.accounting.models.ExpenseApplicationLineTemplateResponse;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2002;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExpenseApplicationLineTemplatesApi
 */
public class ExpenseApplicationLineTemplatesApiTest {

    private ExpenseApplicationLineTemplatesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExpenseApplicationLineTemplatesApi.class);
    }

    /**
     * 経費科目の作成
     *
     * 
     */
    @Test
    public void createExpenseApplicationLineTemplateTest() {
        ExpenseApplicationLineTemplateParams expenseApplicationLineTemplateParams = null;
        // ExpenseApplicationLineTemplateResponse response = api.createExpenseApplicationLineTemplate(expenseApplicationLineTemplateParams);

        // TODO: test validations
    }
    /**
     * 経費科目の削除
     *
     * 
     */
    @Test
    public void destroyExpenseApplicationLineTemplateTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyExpenseApplicationLineTemplate(id, companyId);

        // TODO: test validations
    }
    /**
     * 経費科目の取得
     *
     * 
     */
    @Test
    public void getExpenseApplicationLineTemplateTest() {
        Integer id = null;
        Integer companyId = null;
        // ExpenseApplicationLineTemplateResponse response = api.getExpenseApplicationLineTemplate(id, companyId);

        // TODO: test validations
    }
    /**
     * 経費科目一覧の取得
     *
     * 
     */
    @Test
    public void getExpenseApplicationLineTemplatesTest() {
        Integer companyId = null;
        Long offset = null;
        Integer limit = null;
        // InlineResponse2002 response = api.getExpenseApplicationLineTemplates(companyId, offset, limit);

        // TODO: test validations
    }
    /**
     * 経費科目の更新
     *
     * 
     */
    @Test
    public void updateExpenseApplicationLineTemplateTest() {
        Integer id = null;
        ExpenseApplicationLineTemplateParams expenseApplicationLineTemplateParams = null;
        // ExpenseApplicationLineTemplateResponse response = api.updateExpenseApplicationLineTemplate(id, expenseApplicationLineTemplateParams);

        // TODO: test validations
    }
}
