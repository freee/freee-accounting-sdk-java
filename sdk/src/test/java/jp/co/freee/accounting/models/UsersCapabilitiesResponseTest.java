/*
 * freee API
 *  <h1 id=\"freee_api\">freee API</h1> <hr /> <h2 id=\"\">スタートガイド</h2> <p>1. セットアップ</p> <ol> <ul><li><a href=\"https://support.freee.co.jp/hc/ja/articles/202847230\" class=\"external-link\" rel=\"nofollow\">freeeアカウント（無料）</a>を<a href=\"https://secure.freee.co.jp/users/sign_up\" class=\"external-link\" rel=\"nofollow\">作成</a>します（すでにお持ちの場合は次へ）</li><li><a href=\"https://app.secure.freee.co.jp/developers/demo_companies/description\" class=\"external-link\" rel=\"nofollow\">開発者向け事業所・環境を作成</a>します</li><li><span><a href=\"https://app.secure.freee.co.jp/developers/applications\" class=\"external-link\" rel=\"nofollow\">前のステップで作成した事業所を選択してfreeeアプリを追加</a>します</span></li><li>Client IDをCopyしておきます</li> </ul> </ol>  <p>2. 実際にAPIを叩いてみる（ブラウザからAPIのレスポンスを確認する）</p> <ol> <ul><li><span><span>以下のURLの●をclient_idに入れ替えて<a href=\"https://app.secure.freee.co.jp/developers/tutorials/3-%E3%82%A2%E3%82%AF%E3%82%BB%E3%82%B9%E3%83%88%E3%83%BC%E3%82%AF%E3%83%B3%E3%82%92%E5%8F%96%E5%BE%97%E3%81%99%E3%82%8B#%E8%AA%8D%E5%8F%AF%E3%82%B3%E3%83%BC%E3%83%89%E3%82%92%E5%8F%96%E5%BE%97%E3%81%99%E3%82%8B\" class=\"external-link\" rel=\"nofollow\">アクセストークンを取得</a>します</span></span><ul><li><span><span><pre><code>https://accounts.secure.freee.co.jp/public_api/authorize?client_id=●&amp;redirect_uri=urn%3Aietf%3Awg%3Aoauth%3A2.0%3Aoob&amp;response_type=token</a></code></pre></span></span></li></ul></li><li><span><a href=\"https://developer.freee.co.jp/docs/accounting/reference#/%E9%80%A3%E7%B5%A1%E5%85%88\" class=\"external-link\" rel=\"nofollow\">APIリファレンス</a>で<code>Authorize</code>を押下します</span></li><li><span>アクセストークン<span><span>を入力して</span></span>&nbsp;もう一度<span><code>Authorize</code>を押下して<code>Close</code>を押下します</span></span></li><li>リファレンス内のCompanies（事業所）に移動し、<code>Try it out</code>を押下し、<code>Execute</code>を押下します</li><li>Response bodyを参照し、事業所ID(id属性)を活用して、Companies以外のエンドポイントでどのようなデータのやりとりできるのか確認します</li></ul> </ol> <p>3. 連携を実装する</p> <ol> <ul><li><a href=\"https://developer.freee.co.jp/tips\" class=\"external-link\" rel=\"nofollow\">API TIPS</a>を参考に、ユースケースごとの連携の概要を学びます。<span>例えば</span><span>&nbsp;</span><a href=\"https://developer.freee.co.jp/tips/how-to-cooperate-salesmanegement-system\" class=\"external-link\" rel=\"nofollow\">SFA、CRM、販売管理システムから会計freeeへの連携</a>や<a href=\"https://developer.freee.co.jp/tips/how-to-cooperate-excel-and-spreadsheet\" class=\"external-link\" rel=\"nofollow\">エクセルやgoogle spreadsheetからの連携</a>です</li><li>実利用向け事業所がすでにある場合は利用、ない場合は作成します（セットアップで作成したのは開発者向け環境のため活用不可）</li><li><a href=\"https://developer.freee.co.jp/docs/accounting/reference\" class=\"external-link\" rel=\"nofollow\">API documentation</a><span>&nbsp;を参照し、躓いた場合は</span><span>&nbsp;</span><a href=\"https://developer.freee.co.jp/community/forum/community\" class=\"external-link\" rel=\"nofollow\">Community</a><span>&nbsp;で質問してみましょう</span></li></ul> </ol> <p>アプリケーションの登録方法や認証方法、またはAPIの活用方法でご不明な点がある場合は<a href=\"https://support.freee.co.jp/hc/ja/sections/115000030743\">ヘルプセンター</a>もご確認ください</p> <hr /> <h2 id=\"_2\">仕様</h2>  <h3 id=\"api\">APIエンドポイント</h3>  <p>https://api.freee.co.jp/ (httpsのみ)</p>  <h3 id=\"_3\">認証方式</h3>  <p><a href=\"http://tools.ietf.org/html/rfc6749\">OAuth2</a>に対応</p>  <ul> <li>Authorization Code Flow (Webアプリ向け)</li>  <li>Implicit Flow (Mobileアプリ向け)</li> </ul>  <h3 id=\"_4\">認証エンドポイント</h3>  <p>https://accounts.secure.freee.co.jp/</p>  <ul> <li>authorize : https://accounts.secure.freee.co.jp/public_api/authorize</li>  <li>token : https://accounts.secure.freee.co.jp/public_api/token</li> </ul>  <h3 id=\"_5\">アクセストークンのリフレッシュ</h3>  <p>認証時に得たrefresh_token を使ってtoken の期限をリフレッシュして新規に発行することが出来ます。</p>  <p>grant_type=refresh_token で https://accounts.secure.freee.co.jp/public_api/token にアクセスすればリフレッシュされます。</p>  <p>e.g.)</p>  <p>POST: https://accounts.secure.freee.co.jp/public_api/token</p>  <p>params: grant_type=refresh_token&amp;client_id=UID&amp;client_secret=SECRET&amp;refresh_token=REFRESH_TOKEN</p>  <p>詳細は<a href=\"https://github.com/applicake/doorkeeper/wiki/Enable-Refresh-Token-Credentials#flow\">refresh_token</a>を参照下さい。</p>  <h3 id=\"_6\">アクセストークンの破棄</h3>  <p>認証時に得たaccess_tokenまたはrefresh_tokenを使って、tokenを破棄することができます。 token=access_tokenまたはtoken=refresh_tokenでhttps://accounts.secure.freee.co.jp/public_api/revokeにアクセスすると破棄されます。token_type_hintでaccess_tokenまたはrefresh_tokenを陽に指定できます。</p>  <p>e.g.)</p>  <p>POST: https://accounts.secure.freee.co.jp/public_api/revoke</p>  <p>params: token=ACCESS_TOKEN</p>  <p>または</p>  <p>params: token=REFRESH_TOKEN</p>  <p>または</p>  <p>params: token=ACCESS_TOKEN&amp;token_type_hint=access_token</p>  <p>または</p>  <p>params: token=REFRESH_TOKEN&amp;token_type_hint=refresh_token</p>  <p>詳細は <a href=\"https://tools.ietf.org/html/rfc7009\">OAuth 2.0 Token revocation</a> をご参照ください。</p>  <h3 id=\"_7\">データフォーマット</h3>  <p>リクエスト、レスポンスともにJSON形式をサポート</p>  <h3 id=\"_8\">共通レスポンスヘッダー</h3>  <p>すべてのAPIのレスポンスには以下のHTTPヘッダーが含まれます。</p>  <ul> <li> <p>X-Freee-Request-ID</p> <ul> <li>各リクエスト毎に発行されるID</li> </ul> </li> </ul>  <h3 id=\"_9\">共通エラーレスポンス</h3>  <ul> <li> <p>ステータスコードはレスポンス内のJSONに含まれる他、HTTPヘッダにも含まれる</p> </li>  <li> <p>type</p>  <ul> <li>status : HTTPステータスコードの説明</li>  <li>validation : エラーの詳細の説明（開発者向け）</li> </ul> </li> </ul>  <p>レスポンスの例</p>  <pre><code>  {     &quot;status_code&quot; : 400,     &quot;errors&quot; : [       {         &quot;type&quot; : &quot;status&quot;,         &quot;messages&quot; : [&quot;不正なリクエストです。&quot;]       },       {         &quot;type&quot; : &quot;validation&quot;,         &quot;messages&quot; : [&quot;Date は不正な日付フォーマットです。入力例：2013-01-01&quot;]       }     ]   }</code></pre> <hr /> <h2 id=\"_10\">連絡先</h2>  <p>ご不明点、ご要望等は <a href=\"https://support.freee.co.jp/hc/ja/requests/new\">freee サポートデスクへのお問い合わせフォーム</a> からご連絡ください。</p> <hr />&copy; Since 2013 freee K.K.
 *
 * The version of the OpenAPI document: v1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.freee.accounting.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import jp.co.freee.accounting.models.UsersCapability;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for UsersCapabilitiesResponse
 */
public class UsersCapabilitiesResponseTest {
    private final UsersCapabilitiesResponse model = new UsersCapabilitiesResponse();

    /**
     * Model tests for UsersCapabilitiesResponse
     */
    @Test
    public void testUsersCapabilitiesResponse() {
        // TODO: test UsersCapabilitiesResponse
    }

    /**
     * Test the property 'walletTxns'
     */
    @Test
    public void walletTxnsTest() {
        // TODO: test walletTxns
    }

    /**
     * Test the property 'deals'
     */
    @Test
    public void dealsTest() {
        // TODO: test deals
    }

    /**
     * Test the property 'transfers'
     */
    @Test
    public void transfersTest() {
        // TODO: test transfers
    }

    /**
     * Test the property 'docs'
     */
    @Test
    public void docsTest() {
        // TODO: test docs
    }

    /**
     * Test the property 'docPostings'
     */
    @Test
    public void docPostingsTest() {
        // TODO: test docPostings
    }

    /**
     * Test the property 'receipts'
     */
    @Test
    public void receiptsTest() {
        // TODO: test receipts
    }

    /**
     * Test the property 'receiptStreamEditor'
     */
    @Test
    public void receiptStreamEditorTest() {
        // TODO: test receiptStreamEditor
    }

    /**
     * Test the property 'expenseApplications'
     */
    @Test
    public void expenseApplicationsTest() {
        // TODO: test expenseApplications
    }

    /**
     * Test the property 'spreadsheets'
     */
    @Test
    public void spreadsheetsTest() {
        // TODO: test spreadsheets
    }

    /**
     * Test the property 'paymentRequests'
     */
    @Test
    public void paymentRequestsTest() {
        // TODO: test paymentRequests
    }

    /**
     * Test the property 'requestForms'
     */
    @Test
    public void requestFormsTest() {
        // TODO: test requestForms
    }

    /**
     * Test the property 'approvalRequests'
     */
    @Test
    public void approvalRequestsTest() {
        // TODO: test approvalRequests
    }

    /**
     * Test the property 'reports'
     */
    @Test
    public void reportsTest() {
        // TODO: test reports
    }

    /**
     * Test the property 'reportsIncomeExpense'
     */
    @Test
    public void reportsIncomeExpenseTest() {
        // TODO: test reportsIncomeExpense
    }

    /**
     * Test the property 'reportsReceivables'
     */
    @Test
    public void reportsReceivablesTest() {
        // TODO: test reportsReceivables
    }

    /**
     * Test the property 'reportsPayables'
     */
    @Test
    public void reportsPayablesTest() {
        // TODO: test reportsPayables
    }

    /**
     * Test the property 'reportsCashBalance'
     */
    @Test
    public void reportsCashBalanceTest() {
        // TODO: test reportsCashBalance
    }

    /**
     * Test the property 'reportsCrosstabs'
     */
    @Test
    public void reportsCrosstabsTest() {
        // TODO: test reportsCrosstabs
    }

    /**
     * Test the property 'reportsGeneralLedgers'
     */
    @Test
    public void reportsGeneralLedgersTest() {
        // TODO: test reportsGeneralLedgers
    }

    /**
     * Test the property 'reportsPl'
     */
    @Test
    public void reportsPlTest() {
        // TODO: test reportsPl
    }

    /**
     * Test the property 'reportsBs'
     */
    @Test
    public void reportsBsTest() {
        // TODO: test reportsBs
    }

    /**
     * Test the property 'reportsJournals'
     */
    @Test
    public void reportsJournalsTest() {
        // TODO: test reportsJournals
    }

    /**
     * Test the property 'reportsManagementsPlanning'
     */
    @Test
    public void reportsManagementsPlanningTest() {
        // TODO: test reportsManagementsPlanning
    }

    /**
     * Test the property 'reportsManagementsNavigation'
     */
    @Test
    public void reportsManagementsNavigationTest() {
        // TODO: test reportsManagementsNavigation
    }

    /**
     * Test the property 'manualJournals'
     */
    @Test
    public void manualJournalsTest() {
        // TODO: test manualJournals
    }

    /**
     * Test the property 'fixedAssets'
     */
    @Test
    public void fixedAssetsTest() {
        // TODO: test fixedAssets
    }

    /**
     * Test the property 'inventoryRefreshes'
     */
    @Test
    public void inventoryRefreshesTest() {
        // TODO: test inventoryRefreshes
    }

    /**
     * Test the property 'bizAllocations'
     */
    @Test
    public void bizAllocationsTest() {
        // TODO: test bizAllocations
    }

    /**
     * Test the property 'paymentRecords'
     */
    @Test
    public void paymentRecordsTest() {
        // TODO: test paymentRecords
    }

    /**
     * Test the property 'annualReports'
     */
    @Test
    public void annualReportsTest() {
        // TODO: test annualReports
    }

    /**
     * Test the property 'taxReports'
     */
    @Test
    public void taxReportsTest() {
        // TODO: test taxReports
    }

    /**
     * Test the property 'consumptionEntries'
     */
    @Test
    public void consumptionEntriesTest() {
        // TODO: test consumptionEntries
    }

    /**
     * Test the property 'taxReturn'
     */
    @Test
    public void taxReturnTest() {
        // TODO: test taxReturn
    }

    /**
     * Test the property 'accountItemStatements'
     */
    @Test
    public void accountItemStatementsTest() {
        // TODO: test accountItemStatements
    }

    /**
     * Test the property 'monthEnd'
     */
    @Test
    public void monthEndTest() {
        // TODO: test monthEnd
    }

    /**
     * Test the property 'yearEnd'
     */
    @Test
    public void yearEndTest() {
        // TODO: test yearEnd
    }

    /**
     * Test the property 'walletables'
     */
    @Test
    public void walletablesTest() {
        // TODO: test walletables
    }

    /**
     * Test the property 'companies'
     */
    @Test
    public void companiesTest() {
        // TODO: test companies
    }

    /**
     * Test the property 'invitations'
     */
    @Test
    public void invitationsTest() {
        // TODO: test invitations
    }

    /**
     * Test the property 'signInLogs'
     */
    @Test
    public void signInLogsTest() {
        // TODO: test signInLogs
    }

    /**
     * Test the property 'backups'
     */
    @Test
    public void backupsTest() {
        // TODO: test backups
    }

    /**
     * Test the property 'openingBalances'
     */
    @Test
    public void openingBalancesTest() {
        // TODO: test openingBalances
    }

    /**
     * Test the property 'systemConversion'
     */
    @Test
    public void systemConversionTest() {
        // TODO: test systemConversion
    }

    /**
     * Test the property 'resets'
     */
    @Test
    public void resetsTest() {
        // TODO: test resets
    }

    /**
     * Test the property 'partners'
     */
    @Test
    public void partnersTest() {
        // TODO: test partners
    }

    /**
     * Test the property 'items'
     */
    @Test
    public void itemsTest() {
        // TODO: test items
    }

    /**
     * Test the property 'sections'
     */
    @Test
    public void sectionsTest() {
        // TODO: test sections
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'accountItems'
     */
    @Test
    public void accountItemsTest() {
        // TODO: test accountItems
    }

    /**
     * Test the property 'taxes'
     */
    @Test
    public void taxesTest() {
        // TODO: test taxes
    }

    /**
     * Test the property 'userMatchers'
     */
    @Test
    public void userMatchersTest() {
        // TODO: test userMatchers
    }

    /**
     * Test the property 'dealTemplates'
     */
    @Test
    public void dealTemplatesTest() {
        // TODO: test dealTemplates
    }

    /**
     * Test the property 'manualJournalTemplates'
     */
    @Test
    public void manualJournalTemplatesTest() {
        // TODO: test manualJournalTemplates
    }

    /**
     * Test the property 'costAllocations'
     */
    @Test
    public void costAllocationsTest() {
        // TODO: test costAllocations
    }

    /**
     * Test the property 'approvalFlowRoutes'
     */
    @Test
    public void approvalFlowRoutesTest() {
        // TODO: test approvalFlowRoutes
    }

    /**
     * Test the property 'expenseApplicationTemplates'
     */
    @Test
    public void expenseApplicationTemplatesTest() {
        // TODO: test expenseApplicationTemplates
    }

    /**
     * Test the property 'workflows'
     */
    @Test
    public void workflowsTest() {
        // TODO: test workflows
    }

    /**
     * Test the property 'oauthApplications'
     */
    @Test
    public void oauthApplicationsTest() {
        // TODO: test oauthApplications
    }

    /**
     * Test the property 'oauthAuthorizations'
     */
    @Test
    public void oauthAuthorizationsTest() {
        // TODO: test oauthAuthorizations
    }

    /**
     * Test the property 'bankAccountantStaffUsers'
     */
    @Test
    public void bankAccountantStaffUsersTest() {
        // TODO: test bankAccountantStaffUsers
    }

}
