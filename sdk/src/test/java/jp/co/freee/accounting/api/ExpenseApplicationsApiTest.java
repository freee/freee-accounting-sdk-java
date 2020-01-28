package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import jp.co.freee.accounting.models.CreateExpenseApplicationParams;
import jp.co.freee.accounting.models.ExpenseApplicationsIndexResponse;
import jp.co.freee.accounting.models.ExpenseApplicationsResponse;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.UnauthorizedError;
import jp.co.freee.accounting.models.UpdateExpenseApplicationParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExpenseApplicationsApi
 */
public class ExpenseApplicationsApiTest {

    private ExpenseApplicationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExpenseApplicationsApi.class);
    }

    /**
     * 経費申請の作成
     *
     *  &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の経費申請を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、経費申請の下書きを作成することができます。申請作業はWebから行ってください。&lt;/li&gt;   &lt;li&gt;現在、申請経路はWeb上からのみ入力できます。Web上での申請時に指定してください。&lt;/li&gt;   &lt;li&gt;申請時には、申請タイトル(title)に加え、申請日(issue_date)、項目行については金額(amount)、日付(transaction_date)、内容(description)が必須項目となります。申請時の業務効率化のため、API入力をお勧めします。&lt;/li&gt;   &lt;li&gt;個人アカウントの場合は、プレミアムプランでご利用できます。&lt;/li&gt;   &lt;li&gt;法人アカウントの場合は、ベーシックプラン、プロフェッショナルプラン、エンタープライズプランでご利用できます。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void createExpenseApplicationTest() {
        CreateExpenseApplicationParams parameters = null;
        // ExpenseApplicationsResponse response = api.createExpenseApplication(parameters);

        // TODO: test validations
    }
    /**
     * 経費申請の削除
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の経費申請を削除する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;個人アカウントの場合は、プレミアムプランでご利用できます。&lt;/li&gt;   &lt;li&gt;法人アカウントの場合は、ベーシックプラン、プロフェッショナルプラン、エンタープライズプランでご利用できます。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void destroyExpenseApplicationTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyExpenseApplication(id, companyId);

        // TODO: test validations
    }
    /**
     * 経費申請詳細の取得
     *
     * 
     */
    @Test
    public void getExpenseApplicationTest() {
        Integer id = null;
        Integer companyId = null;
        // ExpenseApplicationsResponse response = api.getExpenseApplication(id, companyId);

        // TODO: test validations
    }
    /**
     * 経費申請一覧の取得
     *
     * 
     */
    @Test
    public void getExpenseApplicationsTest() {
        Integer companyId = null;
        Integer offset = null;
        Integer limit = null;
        // ExpenseApplicationsIndexResponse response = api.getExpenseApplications(companyId, offset, limit);

        // TODO: test validations
    }
    /**
     * 経費申請の更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の経費申請を更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、経費申請の下書きを更新することができます。申請作業はWebから行ってください。&lt;/li&gt;   &lt;li&gt;現在、申請経路はWeb上からのみ入力できます。Web上での申請時に指定してください。&lt;/li&gt;   &lt;li&gt;申請時には、申請タイトル(title)に加え、申請日(issue_date)、項目行については金額(amount)、日付(transaction_date)、内容(description)が必須項目となります。申請時の業務効率化のため、API入力をお勧めします。&lt;/li&gt;   &lt;li&gt;個人アカウントの場合は、プレミアムプランでご利用できます。&lt;/li&gt;   &lt;li&gt;法人アカウントの場合は、ベーシックプラン、プロフェッショナルプラン、エンタープライズプランでご利用できます。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void updateExpenseApplicationTest() {
        Integer id = null;
        UpdateExpenseApplicationParams parameters = null;
        // ExpenseApplicationsResponse response = api.updateExpenseApplication(id, parameters);

        // TODO: test validations
    }
}
