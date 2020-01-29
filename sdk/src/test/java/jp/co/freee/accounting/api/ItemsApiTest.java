package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.CreateItemParams;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ItemResponse;
import jp.co.freee.accounting.models.ItemsIndexResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.UpdateItemParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemsApi
 */
public class ItemsApiTest {

    private ItemsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ItemsApi.class);
    }

    /**
     * 品目の作成
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目を作成する&lt;/p&gt;
     */
    @Test
    public void createItemTest() {
        CreateItemParams parameters = null;
        // ItemResponse response = api.createItem(parameters);

        // TODO: test validations
    }
    /**
     * 品目の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目を削除する&lt;/p&gt;
     */
    @Test
    public void destroyItemTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyItem(id, companyId);

        // TODO: test validations
    }
    /**
     * 品目の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目を取得する&lt;/p&gt;
     */
    @Test
    public void getItemTest() {
        Integer id = null;
        Integer companyId = null;
        // ItemResponse response = api.getItem(id, companyId);

        // TODO: test validations
    }
    /**
     * 品目一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目一覧を取得する&lt;/p&gt;
     */
    @Test
    public void getItemsTest() {
        Integer companyId = null;
        // ItemsIndexResponse response = api.getItems(companyId);

        // TODO: test validations
    }
    /**
     * 品目の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の品目を更新する&lt;/p&gt;
     */
    @Test
    public void updateItemTest() {
        Integer id = null;
        UpdateItemParams parameters = null;
        // ItemResponse response = api.updateItem(id, parameters);

        // TODO: test validations
    }
}
