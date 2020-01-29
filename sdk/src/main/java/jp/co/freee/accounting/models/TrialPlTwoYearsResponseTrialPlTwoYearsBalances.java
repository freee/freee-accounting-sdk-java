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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jp.co.freee.accounting.models.TrialBsTwoYearsResponseTrialBsTwoYearsItems;
import jp.co.freee.accounting.models.TrialBsTwoYearsResponseTrialBsTwoYearsPartners;
import jp.co.freee.accounting.models.TrialPlTwoYearsResponseTrialPlTwoYearsSections;

/**
 * TrialPlTwoYearsResponseTrialPlTwoYearsBalances
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class TrialPlTwoYearsResponseTrialPlTwoYearsBalances {
  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_ID = "account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_ID)
  private Integer accountItemId;

  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_NAME = "account_item_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_NAME)
  private String accountItemName;

  public static final String SERIALIZED_NAME_PARTNERS = "partners";
  @SerializedName(SERIALIZED_NAME_PARTNERS)
  private List<TrialBsTwoYearsResponseTrialBsTwoYearsPartners> partners = null;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<TrialBsTwoYearsResponseTrialBsTwoYearsItems> items = null;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<TrialPlTwoYearsResponseTrialPlTwoYearsSections> sections = null;

  public static final String SERIALIZED_NAME_ACCOUNT_CATEGORY_ID = "account_category_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CATEGORY_ID)
  private Integer accountCategoryId;

  public static final String SERIALIZED_NAME_ACCOUNT_CATEGORY_NAME = "account_category_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CATEGORY_NAME)
  private String accountCategoryName;

  public static final String SERIALIZED_NAME_TOTAL_LINE = "total_line";
  @SerializedName(SERIALIZED_NAME_TOTAL_LINE)
  private Boolean totalLine;

  public static final String SERIALIZED_NAME_HIERARCHY_LEVEL = "hierarchy_level";
  @SerializedName(SERIALIZED_NAME_HIERARCHY_LEVEL)
  private Integer hierarchyLevel;

  public static final String SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_ID = "parent_account_category_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_ID)
  private Integer parentAccountCategoryId;

  public static final String SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_NAME = "parent_account_category_name";
  @SerializedName(SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_NAME)
  private String parentAccountCategoryName;

  public static final String SERIALIZED_NAME_LAST_YEAR_CLOSING_BALANCE = "last_year_closing_balance";
  @SerializedName(SERIALIZED_NAME_LAST_YEAR_CLOSING_BALANCE)
  private Integer lastYearClosingBalance;

  public static final String SERIALIZED_NAME_CLOSING_BALANCE = "closing_balance";
  @SerializedName(SERIALIZED_NAME_CLOSING_BALANCE)
  private Integer closingBalance;

  public static final String SERIALIZED_NAME_YEAR_ON_YEAR = "year_on_year";
  @SerializedName(SERIALIZED_NAME_YEAR_ON_YEAR)
  private BigDecimal yearOnYear;


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances accountItemId(Integer accountItemId) {
    
    this.accountItemId = accountItemId;
    return this;
  }

   /**
   * 勘定科目ID(勘定科目の時のみ含まれる)
   * @return accountItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192", value = "勘定科目ID(勘定科目の時のみ含まれる)")

  public Integer getAccountItemId() {
    return accountItemId;
  }


  public void setAccountItemId(Integer accountItemId) {
    this.accountItemId = accountItemId;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances accountItemName(String accountItemName) {
    
    this.accountItemName = accountItemName;
    return this;
  }

   /**
   * 勘定科目名(勘定科目の時のみ含まれる)
   * @return accountItemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "現金", value = "勘定科目名(勘定科目の時のみ含まれる)")

  public String getAccountItemName() {
    return accountItemName;
  }


  public void setAccountItemName(String accountItemName) {
    this.accountItemName = accountItemName;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances partners(List<TrialBsTwoYearsResponseTrialBsTwoYearsPartners> partners) {
    
    this.partners = partners;
    return this;
  }

  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances addPartnersItem(TrialBsTwoYearsResponseTrialBsTwoYearsPartners partnersItem) {
    if (this.partners == null) {
      this.partners = new ArrayList<>();
    }
    this.partners.add(partnersItem);
    return this;
  }

   /**
   * breakdown_display_type:partner, account_item_display_type:account_item指定時のみ含まれる
   * @return partners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "breakdown_display_type:partner, account_item_display_type:account_item指定時のみ含まれる")

  public List<TrialBsTwoYearsResponseTrialBsTwoYearsPartners> getPartners() {
    return partners;
  }


  public void setPartners(List<TrialBsTwoYearsResponseTrialBsTwoYearsPartners> partners) {
    this.partners = partners;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances items(List<TrialBsTwoYearsResponseTrialBsTwoYearsItems> items) {
    
    this.items = items;
    return this;
  }

  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances addItemsItem(TrialBsTwoYearsResponseTrialBsTwoYearsItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * breakdown_display_type:item, account_item_display_type:account_item指定時のみ含まれる
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "breakdown_display_type:item, account_item_display_type:account_item指定時のみ含まれる")

  public List<TrialBsTwoYearsResponseTrialBsTwoYearsItems> getItems() {
    return items;
  }


  public void setItems(List<TrialBsTwoYearsResponseTrialBsTwoYearsItems> items) {
    this.items = items;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances sections(List<TrialPlTwoYearsResponseTrialPlTwoYearsSections> sections) {
    
    this.sections = sections;
    return this;
  }

  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances addSectionsItem(TrialPlTwoYearsResponseTrialPlTwoYearsSections sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * breakdown_display_type:section, account_item_display_type:account_item指定時のみ含まれる
   * @return sections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "breakdown_display_type:section, account_item_display_type:account_item指定時のみ含まれる")

  public List<TrialPlTwoYearsResponseTrialPlTwoYearsSections> getSections() {
    return sections;
  }


  public void setSections(List<TrialPlTwoYearsResponseTrialPlTwoYearsSections> sections) {
    this.sections = sections;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances accountCategoryId(Integer accountCategoryId) {
    
    this.accountCategoryId = accountCategoryId;
    return this;
  }

   /**
   * 勘定科目カテゴリーID(勘定科目カテゴリーの時のみ含まれる)
   * @return accountCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "勘定科目カテゴリーID(勘定科目カテゴリーの時のみ含まれる)")

  public Integer getAccountCategoryId() {
    return accountCategoryId;
  }


  public void setAccountCategoryId(Integer accountCategoryId) {
    this.accountCategoryId = accountCategoryId;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances accountCategoryName(String accountCategoryName) {
    
    this.accountCategoryName = accountCategoryName;
    return this;
  }

   /**
   * 勘定科目カテゴリー名(勘定科目カテゴリーの時のみ含まれる)
   * @return accountCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "流動資産", value = "勘定科目カテゴリー名(勘定科目カテゴリーの時のみ含まれる)")

  public String getAccountCategoryName() {
    return accountCategoryName;
  }


  public void setAccountCategoryName(String accountCategoryName) {
    this.accountCategoryName = accountCategoryName;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances totalLine(Boolean totalLine) {
    
    this.totalLine = totalLine;
    return this;
  }

   /**
   * 合計行(勘定科目カテゴリー名の時のみ含まれる)
   * @return totalLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "合計行(勘定科目カテゴリー名の時のみ含まれる)")

  public Boolean getTotalLine() {
    return totalLine;
  }


  public void setTotalLine(Boolean totalLine) {
    this.totalLine = totalLine;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances hierarchyLevel(Integer hierarchyLevel) {
    
    this.hierarchyLevel = hierarchyLevel;
    return this;
  }

   /**
   * 階層レベル
   * @return hierarchyLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "階層レベル")

  public Integer getHierarchyLevel() {
    return hierarchyLevel;
  }


  public void setHierarchyLevel(Integer hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances parentAccountCategoryId(Integer parentAccountCategoryId) {
    
    this.parentAccountCategoryId = parentAccountCategoryId;
    return this;
  }

   /**
   * 上位科目カテゴリーID(上層が存在する場合含まれる)
   * @return parentAccountCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19", value = "上位科目カテゴリーID(上層が存在する場合含まれる)")

  public Integer getParentAccountCategoryId() {
    return parentAccountCategoryId;
  }


  public void setParentAccountCategoryId(Integer parentAccountCategoryId) {
    this.parentAccountCategoryId = parentAccountCategoryId;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances parentAccountCategoryName(String parentAccountCategoryName) {
    
    this.parentAccountCategoryName = parentAccountCategoryName;
    return this;
  }

   /**
   * 上位勘定科目カテゴリー名(上層が存在する場合含まれる)
   * @return parentAccountCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "他流動資産", value = "上位勘定科目カテゴリー名(上層が存在する場合含まれる)")

  public String getParentAccountCategoryName() {
    return parentAccountCategoryName;
  }


  public void setParentAccountCategoryName(String parentAccountCategoryName) {
    this.parentAccountCategoryName = parentAccountCategoryName;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances lastYearClosingBalance(Integer lastYearClosingBalance) {
    
    this.lastYearClosingBalance = lastYearClosingBalance;
    return this;
  }

   /**
   * 前年度期末残高
   * @return lastYearClosingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "前年度期末残高")

  public Integer getLastYearClosingBalance() {
    return lastYearClosingBalance;
  }


  public void setLastYearClosingBalance(Integer lastYearClosingBalance) {
    this.lastYearClosingBalance = lastYearClosingBalance;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances closingBalance(Integer closingBalance) {
    
    this.closingBalance = closingBalance;
    return this;
  }

   /**
   * 期末残高
   * @return closingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-25920", value = "期末残高")

  public Integer getClosingBalance() {
    return closingBalance;
  }


  public void setClosingBalance(Integer closingBalance) {
    this.closingBalance = closingBalance;
  }


  public TrialPlTwoYearsResponseTrialPlTwoYearsBalances yearOnYear(BigDecimal yearOnYear) {
    
    this.yearOnYear = yearOnYear;
    return this;
  }

   /**
   * 前年比
   * @return yearOnYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.12", value = "前年比")

  public BigDecimal getYearOnYear() {
    return yearOnYear;
  }


  public void setYearOnYear(BigDecimal yearOnYear) {
    this.yearOnYear = yearOnYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialPlTwoYearsResponseTrialPlTwoYearsBalances trialPlTwoYearsResponseTrialPlTwoYearsBalances = (TrialPlTwoYearsResponseTrialPlTwoYearsBalances) o;
    return Objects.equals(this.accountItemId, trialPlTwoYearsResponseTrialPlTwoYearsBalances.accountItemId) &&
        Objects.equals(this.accountItemName, trialPlTwoYearsResponseTrialPlTwoYearsBalances.accountItemName) &&
        Objects.equals(this.partners, trialPlTwoYearsResponseTrialPlTwoYearsBalances.partners) &&
        Objects.equals(this.items, trialPlTwoYearsResponseTrialPlTwoYearsBalances.items) &&
        Objects.equals(this.sections, trialPlTwoYearsResponseTrialPlTwoYearsBalances.sections) &&
        Objects.equals(this.accountCategoryId, trialPlTwoYearsResponseTrialPlTwoYearsBalances.accountCategoryId) &&
        Objects.equals(this.accountCategoryName, trialPlTwoYearsResponseTrialPlTwoYearsBalances.accountCategoryName) &&
        Objects.equals(this.totalLine, trialPlTwoYearsResponseTrialPlTwoYearsBalances.totalLine) &&
        Objects.equals(this.hierarchyLevel, trialPlTwoYearsResponseTrialPlTwoYearsBalances.hierarchyLevel) &&
        Objects.equals(this.parentAccountCategoryId, trialPlTwoYearsResponseTrialPlTwoYearsBalances.parentAccountCategoryId) &&
        Objects.equals(this.parentAccountCategoryName, trialPlTwoYearsResponseTrialPlTwoYearsBalances.parentAccountCategoryName) &&
        Objects.equals(this.lastYearClosingBalance, trialPlTwoYearsResponseTrialPlTwoYearsBalances.lastYearClosingBalance) &&
        Objects.equals(this.closingBalance, trialPlTwoYearsResponseTrialPlTwoYearsBalances.closingBalance) &&
        Objects.equals(this.yearOnYear, trialPlTwoYearsResponseTrialPlTwoYearsBalances.yearOnYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItemId, accountItemName, partners, items, sections, accountCategoryId, accountCategoryName, totalLine, hierarchyLevel, parentAccountCategoryId, parentAccountCategoryName, lastYearClosingBalance, closingBalance, yearOnYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialPlTwoYearsResponseTrialPlTwoYearsBalances {\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    accountItemName: ").append(toIndentedString(accountItemName)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    accountCategoryId: ").append(toIndentedString(accountCategoryId)).append("\n");
    sb.append("    accountCategoryName: ").append(toIndentedString(accountCategoryName)).append("\n");
    sb.append("    totalLine: ").append(toIndentedString(totalLine)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    parentAccountCategoryId: ").append(toIndentedString(parentAccountCategoryId)).append("\n");
    sb.append("    parentAccountCategoryName: ").append(toIndentedString(parentAccountCategoryName)).append("\n");
    sb.append("    lastYearClosingBalance: ").append(toIndentedString(lastYearClosingBalance)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    yearOnYear: ").append(toIndentedString(yearOnYear)).append("\n");
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

