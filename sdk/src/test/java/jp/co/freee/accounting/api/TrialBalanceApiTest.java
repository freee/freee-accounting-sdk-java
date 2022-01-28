package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.TooManyRequestsError;
import jp.co.freee.accounting.models.TrialBsResponse;
import jp.co.freee.accounting.models.TrialBsThreeYearsResponse;
import jp.co.freee.accounting.models.TrialBsTwoYearsResponse;
import jp.co.freee.accounting.models.TrialCrResponse;
import jp.co.freee.accounting.models.TrialCrSectionsResponse;
import jp.co.freee.accounting.models.TrialCrSegment1TagsResponse;
import jp.co.freee.accounting.models.TrialCrSegment2TagsResponse;
import jp.co.freee.accounting.models.TrialCrSegment3TagsResponse;
import jp.co.freee.accounting.models.TrialCrThreeYearsResponse;
import jp.co.freee.accounting.models.TrialCrTwoYearsResponse;
import jp.co.freee.accounting.models.TrialPlResponse;
import jp.co.freee.accounting.models.TrialPlSectionsResponse;
import jp.co.freee.accounting.models.TrialPlSegment1TagsResponse;
import jp.co.freee.accounting.models.TrialPlSegment2TagsResponse;
import jp.co.freee.accounting.models.TrialPlSegment3TagsResponse;
import jp.co.freee.accounting.models.TrialPlThreeYearsResponse;
import jp.co.freee.accounting.models.TrialPlTwoYearsResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrialBalanceApi
 */
public class TrialBalanceApiTest {

    private TrialBalanceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TrialBalanceApi.class);
    }

    /**
     * 貸借対照表の取得
     *
     * 
     */
    @Test
    public void getTrialBsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String approvalFlowStatus = null;
        // TrialBsResponse response = api.getTrialBs(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 貸借対照表(３期間比較)の取得
     *
     * 
     */
    @Test
    public void getTrialBsThreeYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String approvalFlowStatus = null;
        // TrialBsThreeYearsResponse response = api.getTrialBsThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 貸借対照表(前年比較)の取得
     *
     * 
     */
    @Test
    public void getTrialBsTwoYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String approvalFlowStatus = null;
        // TrialBsTwoYearsResponse response = api.getTrialBsTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 製造原価報告書の取得
     *
     * 
     */
    @Test
    public void getTrialCrTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialCrResponse response = api.getTrialCr(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 製造原価報告書(部門比較)の取得
     *
     * 
     */
    @Test
    public void getTrialCrSectionsTest() {
        Integer companyId = null;
        String sectionIds = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialCrSectionsResponse response = api.getTrialCrSections(companyId, sectionIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 製造原価報告書(セグメント1比較)の取得
     *
     * 
     */
    @Test
    public void getTrialCrSegment1TagsTest() {
        Integer companyId = null;
        String segment1TagIds = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialCrSegment1TagsResponse response = api.getTrialCrSegment1Tags(companyId, segment1TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 製造原価報告書(セグメント2比較)の取得
     *
     * 
     */
    @Test
    public void getTrialCrSegment2TagsTest() {
        Integer companyId = null;
        String segment2TagIds = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialCrSegment2TagsResponse response = api.getTrialCrSegment2Tags(companyId, segment2TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 製造原価報告書(セグメント3比較)の取得
     *
     * 
     */
    @Test
    public void getTrialCrSegment3TagsTest() {
        Integer companyId = null;
        String segment3TagIds = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialCrSegment3TagsResponse response = api.getTrialCrSegment3Tags(companyId, segment3TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 製造原価報告書(３期間比較)の取得
     *
     * 
     */
    @Test
    public void getTrialCrThreeYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialCrThreeYearsResponse response = api.getTrialCrThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 製造原価報告書(前年比較)の取得
     *
     * 
     */
    @Test
    public void getTrialCrTwoYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialCrTwoYearsResponse response = api.getTrialCrTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 損益計算書の取得
     *
     * 
     */
    @Test
    public void getTrialPlTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialPlResponse response = api.getTrialPl(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 損益計算書(部門比較)の取得
     *
     * 
     */
    @Test
    public void getTrialPlSectionsTest() {
        Integer companyId = null;
        String sectionIds = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialPlSectionsResponse response = api.getTrialPlSections(companyId, sectionIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 損益計算書(セグメント1比較)の取得
     *
     * 
     */
    @Test
    public void getTrialPlSegment1TagsTest() {
        Integer companyId = null;
        String segment1TagIds = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialPlSegment1TagsResponse response = api.getTrialPlSegment1Tags(companyId, segment1TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 損益計算書(セグメント2比較)の取得
     *
     * 
     */
    @Test
    public void getTrialPlSegment2TagsTest() {
        Integer companyId = null;
        String segment2TagIds = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialPlSegment2TagsResponse response = api.getTrialPlSegment2Tags(companyId, segment2TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 損益計算書(セグメント3比較)の取得
     *
     * 
     */
    @Test
    public void getTrialPlSegment3TagsTest() {
        Integer companyId = null;
        String segment3TagIds = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialPlSegment3TagsResponse response = api.getTrialPlSegment3Tags(companyId, segment3TagIds, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 損益計算書(３期間比較)の取得
     *
     * 
     */
    @Test
    public void getTrialPlThreeYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialPlThreeYearsResponse response = api.getTrialPlThreeYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
    /**
     * 損益計算書(前年比較)の取得
     *
     * 
     */
    @Test
    public void getTrialPlTwoYearsTest() {
        Integer companyId = null;
        Integer fiscalYear = null;
        Integer startMonth = null;
        Integer endMonth = null;
        String startDate = null;
        String endDate = null;
        String accountItemDisplayType = null;
        String breakdownDisplayType = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        String adjustment = null;
        String costAllocation = null;
        String approvalFlowStatus = null;
        // TrialPlTwoYearsResponse response = api.getTrialPlTwoYears(companyId, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, sectionId, adjustment, costAllocation, approvalFlowStatus);

        // TODO: test validations
    }
}
