package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2003;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ItemParams;
import jp.co.freee.accounting.models.ItemResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
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
     * 
     */
    @Test
    public void createItemTest() {
        ItemParams itemParams = null;
        // ItemResponse response = api.createItem(itemParams);

        // TODO: test validations
    }
    /**
     * 品目の削除
     *
     * 
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
     * 
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
     * 
     */
    @Test
    public void getItemsTest() {
        Integer companyId = null;
        String startUpdateDate = null;
        String endUpdateDate = null;
        Integer offset = null;
        Integer limit = null;
        // InlineResponse2003 response = api.getItems(companyId, startUpdateDate, endUpdateDate, offset, limit);

        // TODO: test validations
    }
    /**
     * 品目の更新
     *
     * 
     */
    @Test
    public void updateItemTest() {
        Integer id = null;
        ItemParams itemParams = null;
        // ItemResponse response = api.updateItem(id, itemParams);

        // TODO: test validations
    }
}
