package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20015;
import jp.co.freee.accounting.models.InlineResponse20016;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.MeResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.UserParams;
import jp.co.freee.accounting.models.UserResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }

    /**
     * 事業所に所属するユーザー一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;事業所に所属するユーザーの一覧を取得する&lt;/p&gt;
     */
    @Test
    public void getUsersTest() {
        Integer companyId = null;
        Integer limit = null;
        // InlineResponse20015 response = api.getUsers(companyId, limit);

        // TODO: test validations
    }
    /**
     * ログインユーザーの権限の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザーの権限情報を取得する&lt;/p&gt;
     */
    @Test
    public void getUsersCapabilitiesTest() {
        Integer companyId = null;
        // InlineResponse20016 response = api.getUsersCapabilities(companyId);

        // TODO: test validations
    }
    /**
     * ログインユーザー情報の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザーの情報を取得する&lt;/p&gt;
     */
    @Test
    public void getUsersMeTest() {
        Boolean companies = null;
        // MeResponse response = api.getUsersMe(companies);

        // TODO: test validations
    }
    /**
     * ユーザー情報の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザー情報を更新する&lt;/p&gt;
     */
    @Test
    public void updateUserTest() {
        UserParams userParams = null;
        // UserResponse response = api.updateUser(userParams);

        // TODO: test validations
    }
}
