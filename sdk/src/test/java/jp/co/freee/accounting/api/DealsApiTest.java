package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.DealCreateParams;
import jp.co.freee.accounting.models.DealCreateResponse;
import jp.co.freee.accounting.models.DealResponse;
import jp.co.freee.accounting.models.DealUpdateParams;
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
 * API tests for DealsApi
 */
public class DealsApiTest {

    private DealsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DealsApi.class);
    }

    /**
     * 取引（収入／支出）の作成
     *
     * &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt; &lt;p&gt;指定した事業所の取引（収入／支出）を作成する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt; &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;ref_number : 管理番号&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;details : 取引の明細行(最大40行)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;receipt_ids : 証憑ファイルID&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt; &lt;li&gt;credit_card : クレジットカード&lt;/li&gt; &lt;li&gt;wallet : 現金&lt;/li&gt; &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;     &lt;li&gt;&lt;p&gt;本APIでは+更新行(renews)の操作ができません。+更新行の作成APIをご利用ください。&lt;/p&gt;&lt;/li&gt;     &lt;li&gt;&lt;p&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/p&gt;&lt;/li&gt;     &lt;li&gt;         &lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/p&gt;&lt;/li&gt;     &lt;li&gt;         &lt;p&gt;本APIでは取引の明細行(details)は、最大40行までになります。&lt;/p&gt;     &lt;/li&gt; &lt;/ul&gt; 
     */
    @Test
    public void createDealTest() {
        DealCreateParams dealCreateParams = null;
        // DealCreateResponse response = api.createDeal(dealCreateParams);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の削除
     *
     * 
     */
    @Test
    public void destroyDealTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyDeal(id, companyId);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の取得
     *
     * &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt; &lt;p&gt;指定した事業所の取引（収入／支出）を取得する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt; &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;accruals : 取引の債権債務行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt; &lt;li&gt;credit_card : クレジットカード&lt;/li&gt; &lt;li&gt;wallet : 現金&lt;/li&gt; &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;registered_from&lt;/p&gt; &lt;ul&gt; &lt;li&gt;all : すべての取引&lt;/li&gt; &lt;li&gt;me : 自身が登録した取引&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getDealTest() {
        Integer id = null;
        Integer companyId = null;
        String accruals = null;
        // DealResponse response = api.getDeal(id, companyId, accruals);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）一覧の取得
     *
     * &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt; &lt;p&gt;指定した事業所の取引一覧（収入／支出）を取得する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt; &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;details : 取引の明細行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;accruals : 取引の債権債務行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt; &lt;li&gt;credit_card : クレジットカード&lt;/li&gt; &lt;li&gt;wallet : 現金&lt;/li&gt; &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;registered_from&lt;/p&gt; &lt;ul&gt; &lt;li&gt;all : すべての取引&lt;/li&gt; &lt;li&gt;me : 自身が登録した取引&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getDealsTest() {
        Integer companyId = null;
        Integer partnerId = null;
        Integer accountItemId = null;
        String partnerCode = null;
        String status = null;
        String type = null;
        String startIssueDate = null;
        String endIssueDate = null;
        String startDueDate = null;
        String endDueDate = null;
        String startRenewDate = null;
        String endRenewDate = null;
        Long offset = null;
        Integer limit = null;
        String registeredFrom = null;
        String accruals = null;
        // InlineResponse2002 response = api.getDeals(companyId, partnerId, accountItemId, partnerCode, status, type, startIssueDate, endIssueDate, startDueDate, endDueDate, startRenewDate, endRenewDate, offset, limit, registeredFrom, accruals);

        // TODO: test validations
    }
    /**
     * 取引（収入／支出）の更新
     *
     * &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt; &lt;p&gt;指定した事業所の取引（収入／支出）を更新する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_date : 支払期日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;due_amount : 支払残額&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;income : 収入&lt;/li&gt; &lt;li&gt;expense : 支出&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;details : 取引の明細行(最大40行)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;renews : 取引の+更新行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;payments : 取引の支払行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;from_walletable_type&lt;/p&gt; &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt; &lt;li&gt;credit_card : クレジットカード&lt;/li&gt; &lt;li&gt;wallet : 現金&lt;/li&gt; &lt;li&gt;private_account_item : プライベート資金（法人の場合は役員借入金もしくは役員借入金、個人の場合は事業主貸もしくは事業主借）&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;receipt_ids : 証憑ファイルID&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;     &lt;li&gt;&lt;p&gt;本APIでは支払行(payments)の操作ができません。支払行の作成・更新・削除APIをご利用ください。&lt;/p&gt;&lt;/li&gt;     &lt;li&gt;&lt;p&gt;本APIでは+更新行(renews)の操作ができません。+更新行の作成・更新・削除APIをご利用ください。&lt;/p&gt;&lt;/li&gt;     &lt;li&gt;&lt;p&gt;本APIでは収入／支出の切替えができません。既存の取引を削除後、再度作成してください。&lt;/p&gt;&lt;/li&gt;     &lt;li&gt;&lt;p&gt;本APIで取引を更新すると、消費税の計算方法は必ず内税方式が選択されます。&lt;/p&gt;&lt;/li&gt;     &lt;li&gt;&lt;p&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/p&gt;&lt;/li&gt;     &lt;li&gt;&lt;p&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/p&gt;&lt;/li&gt;     &lt;li&gt;         &lt;p&gt;本APIでは取引の明細行(details)は、最大40行までになります。&lt;/p&gt;     &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void updateDealTest() {
        Integer id = null;
        DealUpdateParams dealUpdateParams = null;
        // DealResponse response = api.updateDeal(id, dealUpdateParams);

        // TODO: test validations
    }
}
