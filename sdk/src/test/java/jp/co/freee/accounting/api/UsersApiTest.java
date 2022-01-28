package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse20012;
import jp.co.freee.accounting.models.InlineResponse20013;
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
     * 
     */
    @Test
    public void getUsersTest() {
        Integer companyId = null;
        Integer limit = null;
        // InlineResponse20012 response = api.getUsers(companyId, limit);

        // TODO: test validations
    }
    /**
     * ログインユーザーの権限の取得
     *
     * 
     */
    @Test
    public void getUsersCapabilitiesTest() {
        Integer companyId = null;
        // InlineResponse20013 response = api.getUsersCapabilities(companyId);

        // TODO: test validations
    }
    /**
     * ログインユーザー情報の取得
     *
     * 
     */
    @Test
    public void getUsersMeTest() {
        Boolean companies = null;
        Boolean advisor = null;
        // MeResponse response = api.getUsersMe(companies, advisor);

        // TODO: test validations
    }
    /**
     * ユーザー情報の更新
     *
     * 
     */
    @Test
    public void updateUserTest() {
        UserParams userParams = null;
        // UserResponse response = api.updateUser(userParams);

        // TODO: test validations
    }
}
