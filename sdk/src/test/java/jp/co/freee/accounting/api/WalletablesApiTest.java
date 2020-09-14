package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20018;
import jp.co.freee.accounting.models.InlineResponse20019;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.WalletableCreateParams;
import jp.co.freee.accounting.models.WalletableCreateResponse;
import jp.co.freee.accounting.models.WalletableUpdateParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletablesApi
 */
public class WalletablesApiTest {

    private WalletablesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WalletablesApi.class);
    }

    /**
     * 口座の作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所に口座を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;&lt;li&gt;同期に対応した口座はこのAPIでは作成できません&lt;/li&gt;&lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;name : 口座名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;bank_id : サービスID&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;group_name : 決算書表示名（小カテゴリー）　例：売掛金, 受取手形, 未収入金（法人のみ）, 買掛金, 支払手形, 未払金, 預り金, 前受金&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void createWalletableTest() {
        WalletableCreateParams walletableCreateParams = null;
        // WalletableCreateResponse response = api.createWalletable(walletableCreateParams);

        // TODO: test validations
    }
    /**
     * 口座の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の口座を削除する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;削除を実行するには、当該口座に関連する仕訳データを事前に削除する必要があります。&lt;/li&gt; &lt;li&gt;当該口座に仕訳が残っていないか確認するには、レポートの「仕訳帳」等を参照し、必要に応じて、「取引」や「口座振替」も削除します。&lt;/li&gt;  &lt;/ul&gt;
     */
    @Test
    public void destroyWalletableTest() {
        Integer id = null;
        String type = null;
        Integer companyId = null;
        // api.destroyWalletable(id, type, companyId);

        // TODO: test validations
    }
    /**
     * 口座情報の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の口座情報を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt;walletable_balance : 登録残高&lt;/li&gt;  &lt;li&gt;last_balance : 同期残高&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getWalletableTest() {
        Integer id = null;
        String type = null;
        Integer companyId = null;
        // InlineResponse20019 response = api.getWalletable(id, type, companyId);

        // TODO: test validations
    }
    /**
     * 口座一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の口座一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt;walletable_balance : 登録残高&lt;/li&gt;  &lt;li&gt;last_balance : 同期残高&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getWalletablesTest() {
        Integer companyId = null;
        Boolean withBalance = null;
        String type = null;
        // InlineResponse20018 response = api.getWalletables(companyId, withBalance, type);

        // TODO: test validations
    }
    /**
     * 口座の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;口座を更新する&lt;/p&gt;
     */
    @Test
    public void updateWalletableTest() {
        Integer id = null;
        String type = null;
        WalletableUpdateParams walletableUpdateParams = null;
        // InlineResponse20019 response = api.updateWalletable(id, type, walletableUpdateParams);

        // TODO: test validations
    }
}
