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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import jp.co.freee.accounting.models.UsersCapability;

/**
 * UsersCapabilitiesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class UsersCapabilitiesResponse {
  public static final String SERIALIZED_NAME_WALLET_TXNS = "wallet_txns";
  @SerializedName(SERIALIZED_NAME_WALLET_TXNS)
  private UsersCapability walletTxns;

  public static final String SERIALIZED_NAME_DEALS = "deals";
  @SerializedName(SERIALIZED_NAME_DEALS)
  private UsersCapability deals;

  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private UsersCapability transfers;

  public static final String SERIALIZED_NAME_DOCS = "docs";
  @SerializedName(SERIALIZED_NAME_DOCS)
  private UsersCapability docs;

  public static final String SERIALIZED_NAME_DOC_POSTINGS = "doc_postings";
  @SerializedName(SERIALIZED_NAME_DOC_POSTINGS)
  private UsersCapability docPostings;

  public static final String SERIALIZED_NAME_RECEIPTS = "receipts";
  @SerializedName(SERIALIZED_NAME_RECEIPTS)
  private UsersCapability receipts;

  public static final String SERIALIZED_NAME_RECEIPT_STREAM_EDITOR = "receipt_stream_editor";
  @SerializedName(SERIALIZED_NAME_RECEIPT_STREAM_EDITOR)
  private UsersCapability receiptStreamEditor;

  public static final String SERIALIZED_NAME_EXPENSE_APPLICATIONS = "expense_applications";
  @SerializedName(SERIALIZED_NAME_EXPENSE_APPLICATIONS)
  private UsersCapability expenseApplications;

  public static final String SERIALIZED_NAME_SPREADSHEETS = "spreadsheets";
  @SerializedName(SERIALIZED_NAME_SPREADSHEETS)
  private UsersCapability spreadsheets;

  public static final String SERIALIZED_NAME_PAYMENT_REQUESTS = "payment_requests";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUESTS)
  private UsersCapability paymentRequests;

  public static final String SERIALIZED_NAME_REQUEST_FORMS = "request_forms";
  @SerializedName(SERIALIZED_NAME_REQUEST_FORMS)
  private UsersCapability requestForms;

  public static final String SERIALIZED_NAME_APPROVAL_REQUESTS = "approval_requests";
  @SerializedName(SERIALIZED_NAME_APPROVAL_REQUESTS)
  private UsersCapability approvalRequests;

  public static final String SERIALIZED_NAME_REPORTS = "reports";
  @SerializedName(SERIALIZED_NAME_REPORTS)
  private UsersCapability reports;

  public static final String SERIALIZED_NAME_REPORTS_INCOME_EXPENSE = "reports_income_expense";
  @SerializedName(SERIALIZED_NAME_REPORTS_INCOME_EXPENSE)
  private UsersCapability reportsIncomeExpense;

  public static final String SERIALIZED_NAME_REPORTS_RECEIVABLES = "reports_receivables";
  @SerializedName(SERIALIZED_NAME_REPORTS_RECEIVABLES)
  private UsersCapability reportsReceivables;

  public static final String SERIALIZED_NAME_REPORTS_PAYABLES = "reports_payables";
  @SerializedName(SERIALIZED_NAME_REPORTS_PAYABLES)
  private UsersCapability reportsPayables;

  public static final String SERIALIZED_NAME_REPORTS_CASH_BALANCE = "reports_cash_balance";
  @SerializedName(SERIALIZED_NAME_REPORTS_CASH_BALANCE)
  private UsersCapability reportsCashBalance;

  public static final String SERIALIZED_NAME_REPORTS_CROSSTABS = "reports_crosstabs";
  @SerializedName(SERIALIZED_NAME_REPORTS_CROSSTABS)
  private UsersCapability reportsCrosstabs;

  public static final String SERIALIZED_NAME_REPORTS_GENERAL_LEDGERS = "reports_general_ledgers";
  @SerializedName(SERIALIZED_NAME_REPORTS_GENERAL_LEDGERS)
  private UsersCapability reportsGeneralLedgers;

  public static final String SERIALIZED_NAME_REPORTS_PL = "reports_pl";
  @SerializedName(SERIALIZED_NAME_REPORTS_PL)
  private UsersCapability reportsPl;

  public static final String SERIALIZED_NAME_REPORTS_BS = "reports_bs";
  @SerializedName(SERIALIZED_NAME_REPORTS_BS)
  private UsersCapability reportsBs;

  public static final String SERIALIZED_NAME_REPORTS_JOURNALS = "reports_journals";
  @SerializedName(SERIALIZED_NAME_REPORTS_JOURNALS)
  private UsersCapability reportsJournals;

  public static final String SERIALIZED_NAME_REPORTS_MANAGEMENTS_PLANNING = "reports_managements_planning";
  @SerializedName(SERIALIZED_NAME_REPORTS_MANAGEMENTS_PLANNING)
  private UsersCapability reportsManagementsPlanning;

  public static final String SERIALIZED_NAME_REPORTS_MANAGEMENTS_NAVIGATION = "reports_managements_navigation";
  @SerializedName(SERIALIZED_NAME_REPORTS_MANAGEMENTS_NAVIGATION)
  private UsersCapability reportsManagementsNavigation;

  public static final String SERIALIZED_NAME_MANUAL_JOURNALS = "manual_journals";
  @SerializedName(SERIALIZED_NAME_MANUAL_JOURNALS)
  private UsersCapability manualJournals;

  public static final String SERIALIZED_NAME_FIXED_ASSETS = "fixed_assets";
  @SerializedName(SERIALIZED_NAME_FIXED_ASSETS)
  private UsersCapability fixedAssets;

  public static final String SERIALIZED_NAME_INVENTORY_REFRESHES = "inventory_refreshes";
  @SerializedName(SERIALIZED_NAME_INVENTORY_REFRESHES)
  private UsersCapability inventoryRefreshes;

  public static final String SERIALIZED_NAME_BIZ_ALLOCATIONS = "biz_allocations";
  @SerializedName(SERIALIZED_NAME_BIZ_ALLOCATIONS)
  private UsersCapability bizAllocations;

  public static final String SERIALIZED_NAME_PAYMENT_RECORDS = "payment_records";
  @SerializedName(SERIALIZED_NAME_PAYMENT_RECORDS)
  private UsersCapability paymentRecords;

  public static final String SERIALIZED_NAME_ANNUAL_REPORTS = "annual_reports";
  @SerializedName(SERIALIZED_NAME_ANNUAL_REPORTS)
  private UsersCapability annualReports;

  public static final String SERIALIZED_NAME_TAX_REPORTS = "tax_reports";
  @SerializedName(SERIALIZED_NAME_TAX_REPORTS)
  private UsersCapability taxReports;

  public static final String SERIALIZED_NAME_CONSUMPTION_ENTRIES = "consumption_entries";
  @SerializedName(SERIALIZED_NAME_CONSUMPTION_ENTRIES)
  private UsersCapability consumptionEntries;

  public static final String SERIALIZED_NAME_TAX_RETURN = "tax_return";
  @SerializedName(SERIALIZED_NAME_TAX_RETURN)
  private UsersCapability taxReturn;

  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_STATEMENTS = "account_item_statements";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_STATEMENTS)
  private UsersCapability accountItemStatements;

  public static final String SERIALIZED_NAME_MONTH_END = "month_end";
  @SerializedName(SERIALIZED_NAME_MONTH_END)
  private UsersCapability monthEnd;

  public static final String SERIALIZED_NAME_YEAR_END = "year_end";
  @SerializedName(SERIALIZED_NAME_YEAR_END)
  private UsersCapability yearEnd;

  public static final String SERIALIZED_NAME_WALLETABLES = "walletables";
  @SerializedName(SERIALIZED_NAME_WALLETABLES)
  private UsersCapability walletables;

  public static final String SERIALIZED_NAME_COMPANIES = "companies";
  @SerializedName(SERIALIZED_NAME_COMPANIES)
  private UsersCapability companies;

  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  private UsersCapability invitations;

  public static final String SERIALIZED_NAME_SIGN_IN_LOGS = "sign_in_logs";
  @SerializedName(SERIALIZED_NAME_SIGN_IN_LOGS)
  private UsersCapability signInLogs;

  public static final String SERIALIZED_NAME_BACKUPS = "backups";
  @SerializedName(SERIALIZED_NAME_BACKUPS)
  private UsersCapability backups;

  public static final String SERIALIZED_NAME_OPENING_BALANCES = "opening_balances";
  @SerializedName(SERIALIZED_NAME_OPENING_BALANCES)
  private UsersCapability openingBalances;

  public static final String SERIALIZED_NAME_SYSTEM_CONVERSION = "system_conversion";
  @SerializedName(SERIALIZED_NAME_SYSTEM_CONVERSION)
  private UsersCapability systemConversion;

  public static final String SERIALIZED_NAME_RESETS = "resets";
  @SerializedName(SERIALIZED_NAME_RESETS)
  private UsersCapability resets;

  public static final String SERIALIZED_NAME_PARTNERS = "partners";
  @SerializedName(SERIALIZED_NAME_PARTNERS)
  private UsersCapability partners;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private UsersCapability items;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private UsersCapability sections;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private UsersCapability tags;

  public static final String SERIALIZED_NAME_ACCOUNT_ITEMS = "account_items";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEMS)
  private UsersCapability accountItems;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private UsersCapability taxes;

  public static final String SERIALIZED_NAME_USER_MATCHERS = "user_matchers";
  @SerializedName(SERIALIZED_NAME_USER_MATCHERS)
  private UsersCapability userMatchers;

  public static final String SERIALIZED_NAME_DEAL_TEMPLATES = "deal_templates";
  @SerializedName(SERIALIZED_NAME_DEAL_TEMPLATES)
  private UsersCapability dealTemplates;

  public static final String SERIALIZED_NAME_MANUAL_JOURNAL_TEMPLATES = "manual_journal_templates";
  @SerializedName(SERIALIZED_NAME_MANUAL_JOURNAL_TEMPLATES)
  private UsersCapability manualJournalTemplates;

  public static final String SERIALIZED_NAME_COST_ALLOCATIONS = "cost_allocations";
  @SerializedName(SERIALIZED_NAME_COST_ALLOCATIONS)
  private UsersCapability costAllocations;

  public static final String SERIALIZED_NAME_APPROVAL_FLOW_ROUTES = "approval_flow_routes";
  @SerializedName(SERIALIZED_NAME_APPROVAL_FLOW_ROUTES)
  private UsersCapability approvalFlowRoutes;

  public static final String SERIALIZED_NAME_EXPENSE_APPLICATION_TEMPLATES = "expense_application_templates";
  @SerializedName(SERIALIZED_NAME_EXPENSE_APPLICATION_TEMPLATES)
  private UsersCapability expenseApplicationTemplates;

  public static final String SERIALIZED_NAME_WORKFLOWS = "workflows";
  @SerializedName(SERIALIZED_NAME_WORKFLOWS)
  private UsersCapability workflows;

  public static final String SERIALIZED_NAME_OAUTH_APPLICATIONS = "oauth_applications";
  @SerializedName(SERIALIZED_NAME_OAUTH_APPLICATIONS)
  private UsersCapability oauthApplications;

  public static final String SERIALIZED_NAME_OAUTH_AUTHORIZATIONS = "oauth_authorizations";
  @SerializedName(SERIALIZED_NAME_OAUTH_AUTHORIZATIONS)
  private UsersCapability oauthAuthorizations;

  public static final String SERIALIZED_NAME_BANK_ACCOUNTANT_STAFF_USERS = "bank_accountant_staff_users";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNTANT_STAFF_USERS)
  private UsersCapability bankAccountantStaffUsers;


  public UsersCapabilitiesResponse walletTxns(UsersCapability walletTxns) {
    
    this.walletTxns = walletTxns;
    return this;
  }

   /**
   * Get walletTxns
   * @return walletTxns
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getWalletTxns() {
    return walletTxns;
  }


  public void setWalletTxns(UsersCapability walletTxns) {
    this.walletTxns = walletTxns;
  }


  public UsersCapabilitiesResponse deals(UsersCapability deals) {
    
    this.deals = deals;
    return this;
  }

   /**
   * Get deals
   * @return deals
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getDeals() {
    return deals;
  }


  public void setDeals(UsersCapability deals) {
    this.deals = deals;
  }


  public UsersCapabilitiesResponse transfers(UsersCapability transfers) {
    
    this.transfers = transfers;
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getTransfers() {
    return transfers;
  }


  public void setTransfers(UsersCapability transfers) {
    this.transfers = transfers;
  }


  public UsersCapabilitiesResponse docs(UsersCapability docs) {
    
    this.docs = docs;
    return this;
  }

   /**
   * Get docs
   * @return docs
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getDocs() {
    return docs;
  }


  public void setDocs(UsersCapability docs) {
    this.docs = docs;
  }


  public UsersCapabilitiesResponse docPostings(UsersCapability docPostings) {
    
    this.docPostings = docPostings;
    return this;
  }

   /**
   * Get docPostings
   * @return docPostings
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getDocPostings() {
    return docPostings;
  }


  public void setDocPostings(UsersCapability docPostings) {
    this.docPostings = docPostings;
  }


  public UsersCapabilitiesResponse receipts(UsersCapability receipts) {
    
    this.receipts = receipts;
    return this;
  }

   /**
   * Get receipts
   * @return receipts
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReceipts() {
    return receipts;
  }


  public void setReceipts(UsersCapability receipts) {
    this.receipts = receipts;
  }


  public UsersCapabilitiesResponse receiptStreamEditor(UsersCapability receiptStreamEditor) {
    
    this.receiptStreamEditor = receiptStreamEditor;
    return this;
  }

   /**
   * Get receiptStreamEditor
   * @return receiptStreamEditor
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReceiptStreamEditor() {
    return receiptStreamEditor;
  }


  public void setReceiptStreamEditor(UsersCapability receiptStreamEditor) {
    this.receiptStreamEditor = receiptStreamEditor;
  }


  public UsersCapabilitiesResponse expenseApplications(UsersCapability expenseApplications) {
    
    this.expenseApplications = expenseApplications;
    return this;
  }

   /**
   * Get expenseApplications
   * @return expenseApplications
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getExpenseApplications() {
    return expenseApplications;
  }


  public void setExpenseApplications(UsersCapability expenseApplications) {
    this.expenseApplications = expenseApplications;
  }


  public UsersCapabilitiesResponse spreadsheets(UsersCapability spreadsheets) {
    
    this.spreadsheets = spreadsheets;
    return this;
  }

   /**
   * Get spreadsheets
   * @return spreadsheets
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getSpreadsheets() {
    return spreadsheets;
  }


  public void setSpreadsheets(UsersCapability spreadsheets) {
    this.spreadsheets = spreadsheets;
  }


  public UsersCapabilitiesResponse paymentRequests(UsersCapability paymentRequests) {
    
    this.paymentRequests = paymentRequests;
    return this;
  }

   /**
   * Get paymentRequests
   * @return paymentRequests
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getPaymentRequests() {
    return paymentRequests;
  }


  public void setPaymentRequests(UsersCapability paymentRequests) {
    this.paymentRequests = paymentRequests;
  }


  public UsersCapabilitiesResponse requestForms(UsersCapability requestForms) {
    
    this.requestForms = requestForms;
    return this;
  }

   /**
   * Get requestForms
   * @return requestForms
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getRequestForms() {
    return requestForms;
  }


  public void setRequestForms(UsersCapability requestForms) {
    this.requestForms = requestForms;
  }


  public UsersCapabilitiesResponse approvalRequests(UsersCapability approvalRequests) {
    
    this.approvalRequests = approvalRequests;
    return this;
  }

   /**
   * Get approvalRequests
   * @return approvalRequests
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getApprovalRequests() {
    return approvalRequests;
  }


  public void setApprovalRequests(UsersCapability approvalRequests) {
    this.approvalRequests = approvalRequests;
  }


  public UsersCapabilitiesResponse reports(UsersCapability reports) {
    
    this.reports = reports;
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReports() {
    return reports;
  }


  public void setReports(UsersCapability reports) {
    this.reports = reports;
  }


  public UsersCapabilitiesResponse reportsIncomeExpense(UsersCapability reportsIncomeExpense) {
    
    this.reportsIncomeExpense = reportsIncomeExpense;
    return this;
  }

   /**
   * Get reportsIncomeExpense
   * @return reportsIncomeExpense
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsIncomeExpense() {
    return reportsIncomeExpense;
  }


  public void setReportsIncomeExpense(UsersCapability reportsIncomeExpense) {
    this.reportsIncomeExpense = reportsIncomeExpense;
  }


  public UsersCapabilitiesResponse reportsReceivables(UsersCapability reportsReceivables) {
    
    this.reportsReceivables = reportsReceivables;
    return this;
  }

   /**
   * Get reportsReceivables
   * @return reportsReceivables
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsReceivables() {
    return reportsReceivables;
  }


  public void setReportsReceivables(UsersCapability reportsReceivables) {
    this.reportsReceivables = reportsReceivables;
  }


  public UsersCapabilitiesResponse reportsPayables(UsersCapability reportsPayables) {
    
    this.reportsPayables = reportsPayables;
    return this;
  }

   /**
   * Get reportsPayables
   * @return reportsPayables
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsPayables() {
    return reportsPayables;
  }


  public void setReportsPayables(UsersCapability reportsPayables) {
    this.reportsPayables = reportsPayables;
  }


  public UsersCapabilitiesResponse reportsCashBalance(UsersCapability reportsCashBalance) {
    
    this.reportsCashBalance = reportsCashBalance;
    return this;
  }

   /**
   * Get reportsCashBalance
   * @return reportsCashBalance
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsCashBalance() {
    return reportsCashBalance;
  }


  public void setReportsCashBalance(UsersCapability reportsCashBalance) {
    this.reportsCashBalance = reportsCashBalance;
  }


  public UsersCapabilitiesResponse reportsCrosstabs(UsersCapability reportsCrosstabs) {
    
    this.reportsCrosstabs = reportsCrosstabs;
    return this;
  }

   /**
   * Get reportsCrosstabs
   * @return reportsCrosstabs
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsCrosstabs() {
    return reportsCrosstabs;
  }


  public void setReportsCrosstabs(UsersCapability reportsCrosstabs) {
    this.reportsCrosstabs = reportsCrosstabs;
  }


  public UsersCapabilitiesResponse reportsGeneralLedgers(UsersCapability reportsGeneralLedgers) {
    
    this.reportsGeneralLedgers = reportsGeneralLedgers;
    return this;
  }

   /**
   * Get reportsGeneralLedgers
   * @return reportsGeneralLedgers
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsGeneralLedgers() {
    return reportsGeneralLedgers;
  }


  public void setReportsGeneralLedgers(UsersCapability reportsGeneralLedgers) {
    this.reportsGeneralLedgers = reportsGeneralLedgers;
  }


  public UsersCapabilitiesResponse reportsPl(UsersCapability reportsPl) {
    
    this.reportsPl = reportsPl;
    return this;
  }

   /**
   * Get reportsPl
   * @return reportsPl
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsPl() {
    return reportsPl;
  }


  public void setReportsPl(UsersCapability reportsPl) {
    this.reportsPl = reportsPl;
  }


  public UsersCapabilitiesResponse reportsBs(UsersCapability reportsBs) {
    
    this.reportsBs = reportsBs;
    return this;
  }

   /**
   * Get reportsBs
   * @return reportsBs
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsBs() {
    return reportsBs;
  }


  public void setReportsBs(UsersCapability reportsBs) {
    this.reportsBs = reportsBs;
  }


  public UsersCapabilitiesResponse reportsJournals(UsersCapability reportsJournals) {
    
    this.reportsJournals = reportsJournals;
    return this;
  }

   /**
   * Get reportsJournals
   * @return reportsJournals
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsJournals() {
    return reportsJournals;
  }


  public void setReportsJournals(UsersCapability reportsJournals) {
    this.reportsJournals = reportsJournals;
  }


  public UsersCapabilitiesResponse reportsManagementsPlanning(UsersCapability reportsManagementsPlanning) {
    
    this.reportsManagementsPlanning = reportsManagementsPlanning;
    return this;
  }

   /**
   * Get reportsManagementsPlanning
   * @return reportsManagementsPlanning
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsManagementsPlanning() {
    return reportsManagementsPlanning;
  }


  public void setReportsManagementsPlanning(UsersCapability reportsManagementsPlanning) {
    this.reportsManagementsPlanning = reportsManagementsPlanning;
  }


  public UsersCapabilitiesResponse reportsManagementsNavigation(UsersCapability reportsManagementsNavigation) {
    
    this.reportsManagementsNavigation = reportsManagementsNavigation;
    return this;
  }

   /**
   * Get reportsManagementsNavigation
   * @return reportsManagementsNavigation
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getReportsManagementsNavigation() {
    return reportsManagementsNavigation;
  }


  public void setReportsManagementsNavigation(UsersCapability reportsManagementsNavigation) {
    this.reportsManagementsNavigation = reportsManagementsNavigation;
  }


  public UsersCapabilitiesResponse manualJournals(UsersCapability manualJournals) {
    
    this.manualJournals = manualJournals;
    return this;
  }

   /**
   * Get manualJournals
   * @return manualJournals
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getManualJournals() {
    return manualJournals;
  }


  public void setManualJournals(UsersCapability manualJournals) {
    this.manualJournals = manualJournals;
  }


  public UsersCapabilitiesResponse fixedAssets(UsersCapability fixedAssets) {
    
    this.fixedAssets = fixedAssets;
    return this;
  }

   /**
   * Get fixedAssets
   * @return fixedAssets
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getFixedAssets() {
    return fixedAssets;
  }


  public void setFixedAssets(UsersCapability fixedAssets) {
    this.fixedAssets = fixedAssets;
  }


  public UsersCapabilitiesResponse inventoryRefreshes(UsersCapability inventoryRefreshes) {
    
    this.inventoryRefreshes = inventoryRefreshes;
    return this;
  }

   /**
   * Get inventoryRefreshes
   * @return inventoryRefreshes
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getInventoryRefreshes() {
    return inventoryRefreshes;
  }


  public void setInventoryRefreshes(UsersCapability inventoryRefreshes) {
    this.inventoryRefreshes = inventoryRefreshes;
  }


  public UsersCapabilitiesResponse bizAllocations(UsersCapability bizAllocations) {
    
    this.bizAllocations = bizAllocations;
    return this;
  }

   /**
   * Get bizAllocations
   * @return bizAllocations
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getBizAllocations() {
    return bizAllocations;
  }


  public void setBizAllocations(UsersCapability bizAllocations) {
    this.bizAllocations = bizAllocations;
  }


  public UsersCapabilitiesResponse paymentRecords(UsersCapability paymentRecords) {
    
    this.paymentRecords = paymentRecords;
    return this;
  }

   /**
   * Get paymentRecords
   * @return paymentRecords
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getPaymentRecords() {
    return paymentRecords;
  }


  public void setPaymentRecords(UsersCapability paymentRecords) {
    this.paymentRecords = paymentRecords;
  }


  public UsersCapabilitiesResponse annualReports(UsersCapability annualReports) {
    
    this.annualReports = annualReports;
    return this;
  }

   /**
   * Get annualReports
   * @return annualReports
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getAnnualReports() {
    return annualReports;
  }


  public void setAnnualReports(UsersCapability annualReports) {
    this.annualReports = annualReports;
  }


  public UsersCapabilitiesResponse taxReports(UsersCapability taxReports) {
    
    this.taxReports = taxReports;
    return this;
  }

   /**
   * Get taxReports
   * @return taxReports
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getTaxReports() {
    return taxReports;
  }


  public void setTaxReports(UsersCapability taxReports) {
    this.taxReports = taxReports;
  }


  public UsersCapabilitiesResponse consumptionEntries(UsersCapability consumptionEntries) {
    
    this.consumptionEntries = consumptionEntries;
    return this;
  }

   /**
   * Get consumptionEntries
   * @return consumptionEntries
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getConsumptionEntries() {
    return consumptionEntries;
  }


  public void setConsumptionEntries(UsersCapability consumptionEntries) {
    this.consumptionEntries = consumptionEntries;
  }


  public UsersCapabilitiesResponse taxReturn(UsersCapability taxReturn) {
    
    this.taxReturn = taxReturn;
    return this;
  }

   /**
   * Get taxReturn
   * @return taxReturn
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getTaxReturn() {
    return taxReturn;
  }


  public void setTaxReturn(UsersCapability taxReturn) {
    this.taxReturn = taxReturn;
  }


  public UsersCapabilitiesResponse accountItemStatements(UsersCapability accountItemStatements) {
    
    this.accountItemStatements = accountItemStatements;
    return this;
  }

   /**
   * Get accountItemStatements
   * @return accountItemStatements
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getAccountItemStatements() {
    return accountItemStatements;
  }


  public void setAccountItemStatements(UsersCapability accountItemStatements) {
    this.accountItemStatements = accountItemStatements;
  }


  public UsersCapabilitiesResponse monthEnd(UsersCapability monthEnd) {
    
    this.monthEnd = monthEnd;
    return this;
  }

   /**
   * Get monthEnd
   * @return monthEnd
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getMonthEnd() {
    return monthEnd;
  }


  public void setMonthEnd(UsersCapability monthEnd) {
    this.monthEnd = monthEnd;
  }


  public UsersCapabilitiesResponse yearEnd(UsersCapability yearEnd) {
    
    this.yearEnd = yearEnd;
    return this;
  }

   /**
   * Get yearEnd
   * @return yearEnd
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getYearEnd() {
    return yearEnd;
  }


  public void setYearEnd(UsersCapability yearEnd) {
    this.yearEnd = yearEnd;
  }


  public UsersCapabilitiesResponse walletables(UsersCapability walletables) {
    
    this.walletables = walletables;
    return this;
  }

   /**
   * Get walletables
   * @return walletables
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getWalletables() {
    return walletables;
  }


  public void setWalletables(UsersCapability walletables) {
    this.walletables = walletables;
  }


  public UsersCapabilitiesResponse companies(UsersCapability companies) {
    
    this.companies = companies;
    return this;
  }

   /**
   * Get companies
   * @return companies
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getCompanies() {
    return companies;
  }


  public void setCompanies(UsersCapability companies) {
    this.companies = companies;
  }


  public UsersCapabilitiesResponse invitations(UsersCapability invitations) {
    
    this.invitations = invitations;
    return this;
  }

   /**
   * Get invitations
   * @return invitations
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getInvitations() {
    return invitations;
  }


  public void setInvitations(UsersCapability invitations) {
    this.invitations = invitations;
  }


  public UsersCapabilitiesResponse signInLogs(UsersCapability signInLogs) {
    
    this.signInLogs = signInLogs;
    return this;
  }

   /**
   * Get signInLogs
   * @return signInLogs
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getSignInLogs() {
    return signInLogs;
  }


  public void setSignInLogs(UsersCapability signInLogs) {
    this.signInLogs = signInLogs;
  }


  public UsersCapabilitiesResponse backups(UsersCapability backups) {
    
    this.backups = backups;
    return this;
  }

   /**
   * Get backups
   * @return backups
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getBackups() {
    return backups;
  }


  public void setBackups(UsersCapability backups) {
    this.backups = backups;
  }


  public UsersCapabilitiesResponse openingBalances(UsersCapability openingBalances) {
    
    this.openingBalances = openingBalances;
    return this;
  }

   /**
   * Get openingBalances
   * @return openingBalances
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getOpeningBalances() {
    return openingBalances;
  }


  public void setOpeningBalances(UsersCapability openingBalances) {
    this.openingBalances = openingBalances;
  }


  public UsersCapabilitiesResponse systemConversion(UsersCapability systemConversion) {
    
    this.systemConversion = systemConversion;
    return this;
  }

   /**
   * Get systemConversion
   * @return systemConversion
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getSystemConversion() {
    return systemConversion;
  }


  public void setSystemConversion(UsersCapability systemConversion) {
    this.systemConversion = systemConversion;
  }


  public UsersCapabilitiesResponse resets(UsersCapability resets) {
    
    this.resets = resets;
    return this;
  }

   /**
   * Get resets
   * @return resets
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getResets() {
    return resets;
  }


  public void setResets(UsersCapability resets) {
    this.resets = resets;
  }


  public UsersCapabilitiesResponse partners(UsersCapability partners) {
    
    this.partners = partners;
    return this;
  }

   /**
   * Get partners
   * @return partners
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getPartners() {
    return partners;
  }


  public void setPartners(UsersCapability partners) {
    this.partners = partners;
  }


  public UsersCapabilitiesResponse items(UsersCapability items) {
    
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getItems() {
    return items;
  }


  public void setItems(UsersCapability items) {
    this.items = items;
  }


  public UsersCapabilitiesResponse sections(UsersCapability sections) {
    
    this.sections = sections;
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getSections() {
    return sections;
  }


  public void setSections(UsersCapability sections) {
    this.sections = sections;
  }


  public UsersCapabilitiesResponse tags(UsersCapability tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getTags() {
    return tags;
  }


  public void setTags(UsersCapability tags) {
    this.tags = tags;
  }


  public UsersCapabilitiesResponse accountItems(UsersCapability accountItems) {
    
    this.accountItems = accountItems;
    return this;
  }

   /**
   * Get accountItems
   * @return accountItems
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getAccountItems() {
    return accountItems;
  }


  public void setAccountItems(UsersCapability accountItems) {
    this.accountItems = accountItems;
  }


  public UsersCapabilitiesResponse taxes(UsersCapability taxes) {
    
    this.taxes = taxes;
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getTaxes() {
    return taxes;
  }


  public void setTaxes(UsersCapability taxes) {
    this.taxes = taxes;
  }


  public UsersCapabilitiesResponse userMatchers(UsersCapability userMatchers) {
    
    this.userMatchers = userMatchers;
    return this;
  }

   /**
   * Get userMatchers
   * @return userMatchers
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getUserMatchers() {
    return userMatchers;
  }


  public void setUserMatchers(UsersCapability userMatchers) {
    this.userMatchers = userMatchers;
  }


  public UsersCapabilitiesResponse dealTemplates(UsersCapability dealTemplates) {
    
    this.dealTemplates = dealTemplates;
    return this;
  }

   /**
   * Get dealTemplates
   * @return dealTemplates
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getDealTemplates() {
    return dealTemplates;
  }


  public void setDealTemplates(UsersCapability dealTemplates) {
    this.dealTemplates = dealTemplates;
  }


  public UsersCapabilitiesResponse manualJournalTemplates(UsersCapability manualJournalTemplates) {
    
    this.manualJournalTemplates = manualJournalTemplates;
    return this;
  }

   /**
   * Get manualJournalTemplates
   * @return manualJournalTemplates
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getManualJournalTemplates() {
    return manualJournalTemplates;
  }


  public void setManualJournalTemplates(UsersCapability manualJournalTemplates) {
    this.manualJournalTemplates = manualJournalTemplates;
  }


  public UsersCapabilitiesResponse costAllocations(UsersCapability costAllocations) {
    
    this.costAllocations = costAllocations;
    return this;
  }

   /**
   * Get costAllocations
   * @return costAllocations
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getCostAllocations() {
    return costAllocations;
  }


  public void setCostAllocations(UsersCapability costAllocations) {
    this.costAllocations = costAllocations;
  }


  public UsersCapabilitiesResponse approvalFlowRoutes(UsersCapability approvalFlowRoutes) {
    
    this.approvalFlowRoutes = approvalFlowRoutes;
    return this;
  }

   /**
   * Get approvalFlowRoutes
   * @return approvalFlowRoutes
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getApprovalFlowRoutes() {
    return approvalFlowRoutes;
  }


  public void setApprovalFlowRoutes(UsersCapability approvalFlowRoutes) {
    this.approvalFlowRoutes = approvalFlowRoutes;
  }


  public UsersCapabilitiesResponse expenseApplicationTemplates(UsersCapability expenseApplicationTemplates) {
    
    this.expenseApplicationTemplates = expenseApplicationTemplates;
    return this;
  }

   /**
   * Get expenseApplicationTemplates
   * @return expenseApplicationTemplates
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getExpenseApplicationTemplates() {
    return expenseApplicationTemplates;
  }


  public void setExpenseApplicationTemplates(UsersCapability expenseApplicationTemplates) {
    this.expenseApplicationTemplates = expenseApplicationTemplates;
  }


  public UsersCapabilitiesResponse workflows(UsersCapability workflows) {
    
    this.workflows = workflows;
    return this;
  }

   /**
   * Get workflows
   * @return workflows
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getWorkflows() {
    return workflows;
  }


  public void setWorkflows(UsersCapability workflows) {
    this.workflows = workflows;
  }


  public UsersCapabilitiesResponse oauthApplications(UsersCapability oauthApplications) {
    
    this.oauthApplications = oauthApplications;
    return this;
  }

   /**
   * Get oauthApplications
   * @return oauthApplications
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getOauthApplications() {
    return oauthApplications;
  }


  public void setOauthApplications(UsersCapability oauthApplications) {
    this.oauthApplications = oauthApplications;
  }


  public UsersCapabilitiesResponse oauthAuthorizations(UsersCapability oauthAuthorizations) {
    
    this.oauthAuthorizations = oauthAuthorizations;
    return this;
  }

   /**
   * Get oauthAuthorizations
   * @return oauthAuthorizations
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getOauthAuthorizations() {
    return oauthAuthorizations;
  }


  public void setOauthAuthorizations(UsersCapability oauthAuthorizations) {
    this.oauthAuthorizations = oauthAuthorizations;
  }


  public UsersCapabilitiesResponse bankAccountantStaffUsers(UsersCapability bankAccountantStaffUsers) {
    
    this.bankAccountantStaffUsers = bankAccountantStaffUsers;
    return this;
  }

   /**
   * Get bankAccountantStaffUsers
   * @return bankAccountantStaffUsers
  **/
  @ApiModelProperty(required = true, value = "")

  public UsersCapability getBankAccountantStaffUsers() {
    return bankAccountantStaffUsers;
  }


  public void setBankAccountantStaffUsers(UsersCapability bankAccountantStaffUsers) {
    this.bankAccountantStaffUsers = bankAccountantStaffUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersCapabilitiesResponse usersCapabilitiesResponse = (UsersCapabilitiesResponse) o;
    return Objects.equals(this.walletTxns, usersCapabilitiesResponse.walletTxns) &&
        Objects.equals(this.deals, usersCapabilitiesResponse.deals) &&
        Objects.equals(this.transfers, usersCapabilitiesResponse.transfers) &&
        Objects.equals(this.docs, usersCapabilitiesResponse.docs) &&
        Objects.equals(this.docPostings, usersCapabilitiesResponse.docPostings) &&
        Objects.equals(this.receipts, usersCapabilitiesResponse.receipts) &&
        Objects.equals(this.receiptStreamEditor, usersCapabilitiesResponse.receiptStreamEditor) &&
        Objects.equals(this.expenseApplications, usersCapabilitiesResponse.expenseApplications) &&
        Objects.equals(this.spreadsheets, usersCapabilitiesResponse.spreadsheets) &&
        Objects.equals(this.paymentRequests, usersCapabilitiesResponse.paymentRequests) &&
        Objects.equals(this.requestForms, usersCapabilitiesResponse.requestForms) &&
        Objects.equals(this.approvalRequests, usersCapabilitiesResponse.approvalRequests) &&
        Objects.equals(this.reports, usersCapabilitiesResponse.reports) &&
        Objects.equals(this.reportsIncomeExpense, usersCapabilitiesResponse.reportsIncomeExpense) &&
        Objects.equals(this.reportsReceivables, usersCapabilitiesResponse.reportsReceivables) &&
        Objects.equals(this.reportsPayables, usersCapabilitiesResponse.reportsPayables) &&
        Objects.equals(this.reportsCashBalance, usersCapabilitiesResponse.reportsCashBalance) &&
        Objects.equals(this.reportsCrosstabs, usersCapabilitiesResponse.reportsCrosstabs) &&
        Objects.equals(this.reportsGeneralLedgers, usersCapabilitiesResponse.reportsGeneralLedgers) &&
        Objects.equals(this.reportsPl, usersCapabilitiesResponse.reportsPl) &&
        Objects.equals(this.reportsBs, usersCapabilitiesResponse.reportsBs) &&
        Objects.equals(this.reportsJournals, usersCapabilitiesResponse.reportsJournals) &&
        Objects.equals(this.reportsManagementsPlanning, usersCapabilitiesResponse.reportsManagementsPlanning) &&
        Objects.equals(this.reportsManagementsNavigation, usersCapabilitiesResponse.reportsManagementsNavigation) &&
        Objects.equals(this.manualJournals, usersCapabilitiesResponse.manualJournals) &&
        Objects.equals(this.fixedAssets, usersCapabilitiesResponse.fixedAssets) &&
        Objects.equals(this.inventoryRefreshes, usersCapabilitiesResponse.inventoryRefreshes) &&
        Objects.equals(this.bizAllocations, usersCapabilitiesResponse.bizAllocations) &&
        Objects.equals(this.paymentRecords, usersCapabilitiesResponse.paymentRecords) &&
        Objects.equals(this.annualReports, usersCapabilitiesResponse.annualReports) &&
        Objects.equals(this.taxReports, usersCapabilitiesResponse.taxReports) &&
        Objects.equals(this.consumptionEntries, usersCapabilitiesResponse.consumptionEntries) &&
        Objects.equals(this.taxReturn, usersCapabilitiesResponse.taxReturn) &&
        Objects.equals(this.accountItemStatements, usersCapabilitiesResponse.accountItemStatements) &&
        Objects.equals(this.monthEnd, usersCapabilitiesResponse.monthEnd) &&
        Objects.equals(this.yearEnd, usersCapabilitiesResponse.yearEnd) &&
        Objects.equals(this.walletables, usersCapabilitiesResponse.walletables) &&
        Objects.equals(this.companies, usersCapabilitiesResponse.companies) &&
        Objects.equals(this.invitations, usersCapabilitiesResponse.invitations) &&
        Objects.equals(this.signInLogs, usersCapabilitiesResponse.signInLogs) &&
        Objects.equals(this.backups, usersCapabilitiesResponse.backups) &&
        Objects.equals(this.openingBalances, usersCapabilitiesResponse.openingBalances) &&
        Objects.equals(this.systemConversion, usersCapabilitiesResponse.systemConversion) &&
        Objects.equals(this.resets, usersCapabilitiesResponse.resets) &&
        Objects.equals(this.partners, usersCapabilitiesResponse.partners) &&
        Objects.equals(this.items, usersCapabilitiesResponse.items) &&
        Objects.equals(this.sections, usersCapabilitiesResponse.sections) &&
        Objects.equals(this.tags, usersCapabilitiesResponse.tags) &&
        Objects.equals(this.accountItems, usersCapabilitiesResponse.accountItems) &&
        Objects.equals(this.taxes, usersCapabilitiesResponse.taxes) &&
        Objects.equals(this.userMatchers, usersCapabilitiesResponse.userMatchers) &&
        Objects.equals(this.dealTemplates, usersCapabilitiesResponse.dealTemplates) &&
        Objects.equals(this.manualJournalTemplates, usersCapabilitiesResponse.manualJournalTemplates) &&
        Objects.equals(this.costAllocations, usersCapabilitiesResponse.costAllocations) &&
        Objects.equals(this.approvalFlowRoutes, usersCapabilitiesResponse.approvalFlowRoutes) &&
        Objects.equals(this.expenseApplicationTemplates, usersCapabilitiesResponse.expenseApplicationTemplates) &&
        Objects.equals(this.workflows, usersCapabilitiesResponse.workflows) &&
        Objects.equals(this.oauthApplications, usersCapabilitiesResponse.oauthApplications) &&
        Objects.equals(this.oauthAuthorizations, usersCapabilitiesResponse.oauthAuthorizations) &&
        Objects.equals(this.bankAccountantStaffUsers, usersCapabilitiesResponse.bankAccountantStaffUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletTxns, deals, transfers, docs, docPostings, receipts, receiptStreamEditor, expenseApplications, spreadsheets, paymentRequests, requestForms, approvalRequests, reports, reportsIncomeExpense, reportsReceivables, reportsPayables, reportsCashBalance, reportsCrosstabs, reportsGeneralLedgers, reportsPl, reportsBs, reportsJournals, reportsManagementsPlanning, reportsManagementsNavigation, manualJournals, fixedAssets, inventoryRefreshes, bizAllocations, paymentRecords, annualReports, taxReports, consumptionEntries, taxReturn, accountItemStatements, monthEnd, yearEnd, walletables, companies, invitations, signInLogs, backups, openingBalances, systemConversion, resets, partners, items, sections, tags, accountItems, taxes, userMatchers, dealTemplates, manualJournalTemplates, costAllocations, approvalFlowRoutes, expenseApplicationTemplates, workflows, oauthApplications, oauthAuthorizations, bankAccountantStaffUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersCapabilitiesResponse {\n");
    sb.append("    walletTxns: ").append(toIndentedString(walletTxns)).append("\n");
    sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    docPostings: ").append(toIndentedString(docPostings)).append("\n");
    sb.append("    receipts: ").append(toIndentedString(receipts)).append("\n");
    sb.append("    receiptStreamEditor: ").append(toIndentedString(receiptStreamEditor)).append("\n");
    sb.append("    expenseApplications: ").append(toIndentedString(expenseApplications)).append("\n");
    sb.append("    spreadsheets: ").append(toIndentedString(spreadsheets)).append("\n");
    sb.append("    paymentRequests: ").append(toIndentedString(paymentRequests)).append("\n");
    sb.append("    requestForms: ").append(toIndentedString(requestForms)).append("\n");
    sb.append("    approvalRequests: ").append(toIndentedString(approvalRequests)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    reportsIncomeExpense: ").append(toIndentedString(reportsIncomeExpense)).append("\n");
    sb.append("    reportsReceivables: ").append(toIndentedString(reportsReceivables)).append("\n");
    sb.append("    reportsPayables: ").append(toIndentedString(reportsPayables)).append("\n");
    sb.append("    reportsCashBalance: ").append(toIndentedString(reportsCashBalance)).append("\n");
    sb.append("    reportsCrosstabs: ").append(toIndentedString(reportsCrosstabs)).append("\n");
    sb.append("    reportsGeneralLedgers: ").append(toIndentedString(reportsGeneralLedgers)).append("\n");
    sb.append("    reportsPl: ").append(toIndentedString(reportsPl)).append("\n");
    sb.append("    reportsBs: ").append(toIndentedString(reportsBs)).append("\n");
    sb.append("    reportsJournals: ").append(toIndentedString(reportsJournals)).append("\n");
    sb.append("    reportsManagementsPlanning: ").append(toIndentedString(reportsManagementsPlanning)).append("\n");
    sb.append("    reportsManagementsNavigation: ").append(toIndentedString(reportsManagementsNavigation)).append("\n");
    sb.append("    manualJournals: ").append(toIndentedString(manualJournals)).append("\n");
    sb.append("    fixedAssets: ").append(toIndentedString(fixedAssets)).append("\n");
    sb.append("    inventoryRefreshes: ").append(toIndentedString(inventoryRefreshes)).append("\n");
    sb.append("    bizAllocations: ").append(toIndentedString(bizAllocations)).append("\n");
    sb.append("    paymentRecords: ").append(toIndentedString(paymentRecords)).append("\n");
    sb.append("    annualReports: ").append(toIndentedString(annualReports)).append("\n");
    sb.append("    taxReports: ").append(toIndentedString(taxReports)).append("\n");
    sb.append("    consumptionEntries: ").append(toIndentedString(consumptionEntries)).append("\n");
    sb.append("    taxReturn: ").append(toIndentedString(taxReturn)).append("\n");
    sb.append("    accountItemStatements: ").append(toIndentedString(accountItemStatements)).append("\n");
    sb.append("    monthEnd: ").append(toIndentedString(monthEnd)).append("\n");
    sb.append("    yearEnd: ").append(toIndentedString(yearEnd)).append("\n");
    sb.append("    walletables: ").append(toIndentedString(walletables)).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    signInLogs: ").append(toIndentedString(signInLogs)).append("\n");
    sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
    sb.append("    openingBalances: ").append(toIndentedString(openingBalances)).append("\n");
    sb.append("    systemConversion: ").append(toIndentedString(systemConversion)).append("\n");
    sb.append("    resets: ").append(toIndentedString(resets)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    accountItems: ").append(toIndentedString(accountItems)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    userMatchers: ").append(toIndentedString(userMatchers)).append("\n");
    sb.append("    dealTemplates: ").append(toIndentedString(dealTemplates)).append("\n");
    sb.append("    manualJournalTemplates: ").append(toIndentedString(manualJournalTemplates)).append("\n");
    sb.append("    costAllocations: ").append(toIndentedString(costAllocations)).append("\n");
    sb.append("    approvalFlowRoutes: ").append(toIndentedString(approvalFlowRoutes)).append("\n");
    sb.append("    expenseApplicationTemplates: ").append(toIndentedString(expenseApplicationTemplates)).append("\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
    sb.append("    oauthApplications: ").append(toIndentedString(oauthApplications)).append("\n");
    sb.append("    oauthAuthorizations: ").append(toIndentedString(oauthAuthorizations)).append("\n");
    sb.append("    bankAccountantStaffUsers: ").append(toIndentedString(bankAccountantStaffUsers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

