package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.InvoiceCreateParams;
import jp.co.freee.accounting.models.InvoiceIndexResponse;
import jp.co.freee.accounting.models.InvoiceResponse;
import jp.co.freee.accounting.models.InvoiceUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesApi
 */
public class InvoicesApiTest {

    private InvoicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(InvoicesApi.class);
    }

    /**
     * 請求書の作成
     *
     * 
     */
    @Test
    public void createInvoiceTest() {
        InvoiceCreateParams invoiceCreateParams = null;
        // InvoiceResponse response = api.createInvoice(invoiceCreateParams);

        // TODO: test validations
    }
    /**
     * 請求書の削除
     *
     * 
     */
    @Test
    public void destroyInvoiceTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyInvoice(id, companyId);

        // TODO: test validations
    }
    /**
     * 請求書の取得
     *
     * 
     */
    @Test
    public void getInvoiceTest() {
        Integer id = null;
        Integer companyId = null;
        // InvoiceResponse response = api.getInvoice(id, companyId);

        // TODO: test validations
    }
    /**
     * 請求書一覧の取得
     *
     * 
     */
    @Test
    public void getInvoicesTest() {
        Integer companyId = null;
        Integer partnerId = null;
        String partnerCode = null;
        String startIssueDate = null;
        String endIssueDate = null;
        String startDueDate = null;
        String endDueDate = null;
        String invoiceNumber = null;
        String description = null;
        String invoiceStatus = null;
        String paymentStatus = null;
        Long offset = null;
        Integer limit = null;
        // InvoiceIndexResponse response = api.getInvoices(companyId, partnerId, partnerCode, startIssueDate, endIssueDate, startDueDate, endDueDate, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit);

        // TODO: test validations
    }
    /**
     * 請求書の更新
     *
     * 
     */
    @Test
    public void updateInvoiceTest() {
        Integer id = null;
        InvoiceUpdateParams invoiceUpdateParams = null;
        // InvoiceResponse response = api.updateInvoice(id, invoiceUpdateParams);

        // TODO: test validations
    }
}
