package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.BanksIndexResponse;
import jp.co.freee.accounting.models.BanksShowResponse;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BanksApi
 */
public class BanksApiTest {

    private BanksApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BanksApi.class);
    }

    /**
     * 連携サービスの取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;連携しているサービスを取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getBankTest() {
        Integer id = null;
        // BanksShowResponse response = api.getBank(id);

        // TODO: test validations
    }
    /**
     * 連携サービス一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;連携しているサービス一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getBanksTest() {
        Integer offset = null;
        Integer limit = null;
        String type = null;
        // BanksIndexResponse response = api.getBanks(offset, limit, type);

        // TODO: test validations
    }
}
