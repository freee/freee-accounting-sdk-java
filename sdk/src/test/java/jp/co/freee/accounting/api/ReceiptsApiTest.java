package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import java.io.File;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2008;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ReceiptResponse;
import jp.co.freee.accounting.models.ReceiptUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReceiptsApi
 */
public class ReceiptsApiTest {

    private ReceiptsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReceiptsApi.class);
    }

    /**
     * ファイルボックス 証憑ファイルアップロード
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ファイルボックスに証憑ファイルをアップロードする&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;リクエストヘッダーの Content-Type は、multipart/form-dataにのみ対応しています。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void createReceiptTest() {
        Integer companyId = null;
        File receipt = null;
        String description = null;
        String issueDate = null;
        // ReceiptResponse response = api.createReceipt(companyId, receipt, description, issueDate);

        // TODO: test validations
    }
    /**
     * ファイルボックス 証憑ファイルを削除する
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ファイルボックスの証憑ファイルを削除する&lt;/p&gt;
     */
    @Test
    public void destroyReceiptTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyReceipt(id, companyId);

        // TODO: test validations
    }
    /**
     * ファイルボックス 証憑ファイルの取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のファイルボックス 証憑ファイルを取得する&lt;/p&gt;
     */
    @Test
    public void getReceiptTest() {
        Integer id = null;
        Integer companyId = null;
        // ReceiptResponse response = api.getReceipt(id, companyId);

        // TODO: test validations
    }
    /**
     * ファイルボックス 証憑ファイル一覧の取得
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のファイルボックス 証憑ファイル一覧を取得する&lt;/p&gt;
     */
    @Test
    public void getReceiptsTest() {
        Integer companyId = null;
        String startDate = null;
        String endDate = null;
        String userName = null;
        Integer number = null;
        String commentType = null;
        Boolean commentImportant = null;
        String category = null;
        Long offset = null;
        Integer limit = null;
        // InlineResponse2008 response = api.getReceipts(companyId, startDate, endDate, userName, number, commentType, commentImportant, category, offset, limit);

        // TODO: test validations
    }
    /**
     * ファイルボックス 証憑ファイル情報更新
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ファイルボックスの証憑ファイル情報を更新する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、証憑ファイルの再アップロードはできません。&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void updateReceiptTest() {
        Integer id = null;
        ReceiptUpdateParams receiptUpdateParams = null;
        // ReceiptResponse response = api.updateReceipt(id, receiptUpdateParams);

        // TODO: test validations
    }
}
