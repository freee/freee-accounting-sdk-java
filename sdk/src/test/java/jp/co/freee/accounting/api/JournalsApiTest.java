package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import java.io.File;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.JournalStatusResponse;
import jp.co.freee.accounting.models.JournalsResponse;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JournalsApi
 */
public class JournalsApiTest {

    private JournalsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(JournalsApi.class);
    }

    /**
     * ダウンロード実行
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ダウンロードを実行する&lt;/p&gt;  &lt;p&gt;＊このAPIは無料プランのアカウントではご利用になれません&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;id : 受け付けID&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void downloadJournalTest() {
        Integer id = null;
        Integer companyId = null;
        // File response = api.downloadJournal(id, companyId);

        // TODO: test validations
    }
    /**
     * ステータス確認
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ダウンロードリクエストのステータスを確認する&lt;/p&gt;  &lt;p&gt;＊このAPIは無料プランのアカウントではご利用になれません&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;status&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;enqueued : 実行待ち&lt;/li&gt;  &lt;li&gt;working : 実行中&lt;/li&gt;  &lt;li&gt;uploaded : 準備完了&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;id : 受け付けID&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getJournalStatusTest() {
        Integer id = null;
        Integer companyId = null;
        List<String> visibleTags = null;
        String startDate = null;
        String endDate = null;
        // JournalStatusResponse response = api.getJournalStatus(id, companyId, visibleTags, startDate, endDate);

        // TODO: test validations
    }
    /**
     * ダウンロード要求
     *
     *  &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ユーザーが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/204599604#2\&quot;&gt;ヘルプページ&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;p&gt;＊このAPIは無料プランのアカウントではご利用になれません&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;download_type &lt;ul&gt; &lt;li&gt;generic(freee Webからダウンロードできるものと同じ)&lt;/li&gt;  &lt;li&gt;csv (yayoi形式)&lt;/li&gt;  &lt;li&gt;pdf&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt;visible_tags : 指定しない場合は従来の仕様の仕訳帳が出力されます &lt;ul&gt; &lt;li&gt;partner : 取引先タグ&lt;/li&gt;  &lt;li&gt;item : 品目タグ&lt;/li&gt;  &lt;li&gt;tag : メモタグ&lt;/li&gt;  &lt;li&gt;section : 部門タグ&lt;/li&gt;  &lt;li&gt;description : 備考欄&lt;/li&gt;  &lt;li&gt;wallet_txn_description : 明細の備考欄&lt;/li&gt;  &lt;li&gt;all : 指定された場合は上記の設定をすべて有効として扱います&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt;id : 受け付けID&lt;/li&gt; &lt;/ul&gt;
     */
    @Test
    public void getJournalsTest() {
        String downloadType = null;
        Integer companyId = null;
        List<String> visibleTags = null;
        String startDate = null;
        String endDate = null;
        // JournalsResponse response = api.getJournals(downloadType, companyId, visibleTags, startDate, endDate);

        // TODO: test validations
    }
}
