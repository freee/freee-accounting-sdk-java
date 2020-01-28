package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.AccountItemParams;
import jp.co.freee.accounting.models.AccountItemsCreateResponse;
import jp.co.freee.accounting.models.AccountItemsIndexResponse;
import jp.co.freee.accounting.models.AccountItemsShowResponse;
import jp.co.freee.accounting.models.AccountItemsUpdateResponse;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountItemsApi
 */
public class AccountItemsApiTest {

    private AccountItemsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountItemsApi.class);
    }

    /**
     * 勘定科目の作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の勘定科目を作成する&lt;/p&gt;
     */
    @Test
    public void createAccountItemTest() {
        AccountItemParams parameters = null;
        // AccountItemsCreateResponse response = api.createAccountItem(parameters);

        // TODO: test validations
    }
    /**
     * 勘定科目の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した勘定科目を削除する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;削除できる勘定科目は、追加で作成したカスタム勘定項目のみです。&lt;/li&gt; &lt;li&gt;デフォルトで存在する勘定科目や口座の勘定科目は削除できません。&lt;/li&gt;&lt;/ul&gt;
     */
    @Test
    public void destroyAccountItemTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyAccountItem(id, companyId);

        // TODO: test validations
    }
    /**
     * 勘定科目の詳細情報の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した勘定科目の詳細を取得する&lt;/p&gt;
     */
    @Test
    public void getAccountItemTest() {
        Integer id = null;
        Integer companyId = null;
        // AccountItemsShowResponse response = api.getAccountItem(id, companyId);

        // TODO: test validations
    }
    /**
     * 勘定科目一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の勘定科目一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;default_tax_id : デフォルト設定がされている税区分ID&lt;/li&gt;  &lt;li&gt;default_tax_code : リクエストした日時を基準とした税区分コード&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getAccountItemsTest() {
        Integer companyId = null;
        String baseDate = null;
        // AccountItemsIndexResponse response = api.getAccountItems(companyId, baseDate);

        // TODO: test validations
    }
    /**
     * 勘定科目の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;勘定科目を更新する&lt;/p&gt;
     */
    @Test
    public void updateAccountItemTest() {
        Integer id = null;
        AccountItemParams parameters = null;
        // AccountItemsUpdateResponse response = api.updateAccountItem(id, parameters);

        // TODO: test validations
    }
}
