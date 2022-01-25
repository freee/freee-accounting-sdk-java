package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2004;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ManualJournalCreateParams;
import jp.co.freee.accounting.models.ManualJournalResponse;
import jp.co.freee.accounting.models.ManualJournalUpdateParams;
import jp.co.freee.accounting.models.ServiceUnavailableError;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManualJournalsApi
 */
public class ManualJournalsApiTest {

    private ManualJournalsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ManualJournalsApi.class);
    }

    /**
     * 振替伝票の作成
     *
     * 
     */
    @Test
    public void createManualJournalTest() {
        ManualJournalCreateParams manualJournalCreateParams = null;
        // ManualJournalResponse response = api.createManualJournal(manualJournalCreateParams);

        // TODO: test validations
    }
    /**
     * 振替伝票の削除
     *
     * 
     */
    @Test
    public void destroyManualJournalTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyManualJournal(id, companyId);

        // TODO: test validations
    }
    /**
     * 振替伝票の取得
     *
     * 
     */
    @Test
    public void getManualJournalTest() {
        Integer id = null;
        Integer companyId = null;
        // ManualJournalResponse response = api.getManualJournal(id, companyId);

        // TODO: test validations
    }
    /**
     * 振替伝票一覧の取得
     *
     * 
     */
    @Test
    public void getManualJournalsTest() {
        Integer companyId = null;
        String startIssueDate = null;
        String endIssueDate = null;
        String entrySide = null;
        Integer accountItemId = null;
        Long minAmount = null;
        Long maxAmount = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        Long segment1TagId = null;
        Long segment2TagId = null;
        Long segment3TagId = null;
        String commentStatus = null;
        Boolean commentImportant = null;
        String adjustment = null;
        String txnNumber = null;
        Long offset = null;
        Integer limit = null;
        // InlineResponse2004 response = api.getManualJournals(companyId, startIssueDate, endIssueDate, entrySide, accountItemId, minAmount, maxAmount, partnerId, partnerCode, itemId, sectionId, segment1TagId, segment2TagId, segment3TagId, commentStatus, commentImportant, adjustment, txnNumber, offset, limit);

        // TODO: test validations
    }
    /**
     * 振替伝票の更新
     *
     * 
     */
    @Test
    public void updateManualJournalTest() {
        Integer id = null;
        ManualJournalUpdateParams manualJournalUpdateParams = null;
        // ManualJournalResponse response = api.updateManualJournal(id, manualJournalUpdateParams);

        // TODO: test validations
    }
}
