package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.CreateWalletTxnParams;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.WalletTxnsIndexResponse;
import jp.co.freee.accounting.models.WalletTxnsShowResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletTxnsApi
 */
public class WalletTxnsApiTest {

    private WalletTxnsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WalletTxnsApi.class);
    }

    /**
     * 明細の作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;amount : 明細金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 取引登録待ち金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;balance : 残高&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 入金&lt;/li&gt;  &lt;li&gt;expense : 出金&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void createWalletTxnTest() {
        CreateWalletTxnParams parameters = null;
        // WalletTxnsShowResponse response = api.createWalletTxn(parameters);

        // TODO: test validations
    }
    /**
     * 明細の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細を削除する&lt;/p&gt;
     */
    @Test
    public void destroyWalletTxnTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyWalletTxn(id, companyId);

        // TODO: test validations
    }
    /**
     * 明細の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;amount : 明細金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 取引登録待ち金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;balance : 残高&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 入金&lt;/li&gt;  &lt;li&gt;expense : 出金&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getWalletTxnTest() {
        Integer id = null;
        Integer companyId = null;
        // WalletTxnsShowResponse response = api.getWalletTxn(id, companyId);

        // TODO: test validations
    }
    /**
     * 明細一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;amount : 明細金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 取引登録待ち金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;balance : 残高&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 入金&lt;/li&gt;  &lt;li&gt;expense : 出金&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getWalletTxnsTest() {
        Integer companyId = null;
        String walletableType = null;
        Integer walletableId = null;
        String startDate = null;
        String endDate = null;
        String entrySide = null;
        Integer offset = null;
        Integer limit = null;
        // WalletTxnsIndexResponse response = api.getWalletTxns(companyId, walletableType, walletableId, startDate, endDate, entrySide, offset, limit);

        // TODO: test validations
    }
}
