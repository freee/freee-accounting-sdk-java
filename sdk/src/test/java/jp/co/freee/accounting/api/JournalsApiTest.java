package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import java.io.File;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.JournalStatusResponse;
import jp.co.freee.accounting.models.JournalsResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JournalsApi
 */
public class JournalsApiTest {

    private JournalsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(JournalsApi.class);
    }

    /**
     * ダウンロード実行
     *
     * 
     */
    @Test
    public void downloadJournalTest() {
        Integer id = null;
        Integer companyId = null;
        // File response = api.downloadJournal(id, companyId);

        // TODO: test validations
    }
    /**
     * ステータス確認
     *
     * 
     */
    @Test
    public void getJournalStatusTest() {
        Integer id = null;
        Integer companyId = null;
        // JournalStatusResponse response = api.getJournalStatus(id, companyId);

        // TODO: test validations
    }
    /**
     * ダウンロード要求
     *
     * 
     */
    @Test
    public void getJournalsTest() {
        String downloadType = null;
        Integer companyId = null;
        List<String> visibleTags = null;
        List<String> visibleIds = null;
        String startDate = null;
        String endDate = null;
        // JournalsResponse response = api.getJournals(downloadType, companyId, visibleTags, visibleIds, startDate, endDate);

        // TODO: test validations
    }
}
