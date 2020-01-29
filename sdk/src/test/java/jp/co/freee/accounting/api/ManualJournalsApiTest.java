package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ManualJournalsCreateParams;
import jp.co.freee.accounting.models.ManualJournalsCreateResponse;
import jp.co.freee.accounting.models.ManualJournalsIndexResponse;
import jp.co.freee.accounting.models.ManualJournalsShowResponse;
import jp.co.freee.accounting.models.ManualJournalsUpdateParams;
import jp.co.freee.accounting.models.ManualJournalsUpdateResponse;
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
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt;  &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt; &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;貸借合わせて100行まで仕訳行を登録できます。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt;&lt;/ul&gt;  
     */
    @Test
    public void createManualJournalTest() {
        ManualJournalsCreateParams parameters = null;
        // ManualJournalsCreateResponse response = api.createManualJournal(parameters);

        // TODO: test validations
    }
    /**
     * 振替伝票の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を削除する&lt;/p&gt;
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
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt; &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt; &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt; &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getManualJournalTest() {
        Integer id = null;
        Integer companyId = null;
        // ManualJournalsShowResponse response = api.getManualJournal(id, companyId);

        // TODO: test validations
    }
    /**
     * 振替伝票一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt;  &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt; &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt;&lt;/ul&gt;
     */
    @Test
    public void getManualJournalsTest() {
        Integer companyId = null;
        String startIssueDate = null;
        String endIssueDate = null;
        String entrySide = null;
        Integer accountItemId = null;
        Integer minAmount = null;
        Integer maxAmount = null;
        Integer partnerId = null;
        String partnerCode = null;
        Integer itemId = null;
        Integer sectionId = null;
        Integer segment1TagId = null;
        Integer segment2TagId = null;
        Integer segment3TagId = null;
        String commentStatus = null;
        Boolean commentImportant = null;
        String adjustment = null;
        String txnNumber = null;
        Integer offset = null;
        Integer limit = null;
        // ManualJournalsIndexResponse response = api.getManualJournals(companyId, startIssueDate, endIssueDate, entrySide, accountItemId, minAmount, maxAmount, partnerId, partnerCode, itemId, sectionId, segment1TagId, segment2TagId, segment3TagId, commentStatus, commentImportant, adjustment, txnNumber, offset, limit);

        // TODO: test validations
    }
    /**
     * 振替伝票の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の振替伝票を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;issue_date : 発生日&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;adjustment : 決算整理仕訳フラグ（true: 決算整理仕訳, false: 日常仕訳）&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;txn_number : 仕訳番号&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;details : 振替伝票の貸借行&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side : 貸借区分&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;credit : 貸方&lt;/li&gt;  &lt;li&gt;debit : 借方&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;amount : 金額&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_3\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;振替伝票は売掛・買掛レポートには反映されません。債権・債務データの登録は取引(Deals)をお使いください。&lt;/li&gt;  &lt;li&gt;事業所の仕訳番号形式が有効な場合のみ、レスポンスで仕訳番号(txn_number)を返します。&lt;/li&gt; &lt;li&gt;貸借合わせて100行まで仕訳行を登録できます。&lt;/li&gt;  &lt;li&gt;detailsに含まれない既存の貸借行は削除されます。更新後も残したい行は、必ず貸借行IDを指定してdetailsに含めてください。&lt;/li&gt;  &lt;li&gt;detailsに含まれる貸借行IDの指定がある行は、更新行として扱われ更新されます。&lt;/li&gt;  &lt;li&gt;detailsに含まれる貸借行IDの指定がない行は、新規行として扱われ追加されます。&lt;/li&gt; &lt;li&gt;セグメントタグ情報は法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt; &lt;li&gt;partner_codeを利用するには、事業所の設定から取引先コードの利用を有効にする必要があります。またpartner_codeとpartner_idは同時に指定することはできません。&lt;/li&gt;&lt;/ul&gt;  
     */
    @Test
    public void updateManualJournalTest() {
        Integer id = null;
        ManualJournalsUpdateParams parameters = null;
        // ManualJournalsUpdateResponse response = api.updateManualJournal(id, parameters);

        // TODO: test validations
    }
}
