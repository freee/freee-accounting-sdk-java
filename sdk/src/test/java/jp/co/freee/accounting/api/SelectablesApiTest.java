package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.SelectablesIndexResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelectablesApi
 */
public class SelectablesApiTest {

    private SelectablesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelectablesApi.class);
    }

    /**
     * フォーム用選択項目情報の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のフォーム用選択項目情報を取得する&lt;/p&gt;
     */
    @Test
    public void getFormsSelectablesTest() {
        Integer companyId = null;
        String includes = null;
        // SelectablesIndexResponse response = api.getFormsSelectables(companyId, includes);

        // TODO: test validations
    }
}
