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
import java.util.ArrayList;
import java.util.List;
import jp.co.freee.accounting.models.AccountItemItems;
import jp.co.freee.accounting.models.AccountItemPartners;

/**
 * AccountItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class AccountItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_TAX_CODE = "tax_code";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private Integer taxCode;

  public static final String SERIALIZED_NAME_ACCOUNT_CATEGORY_ID = "account_category_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CATEGORY_ID)
  private Integer accountCategoryId;

  public static final String SERIALIZED_NAME_SHORTCUT = "shortcut";
  @SerializedName(SERIALIZED_NAME_SHORTCUT)
  private String shortcut;

  public static final String SERIALIZED_NAME_SHORTCUT_NUM = "shortcut_num";
  @SerializedName(SERIALIZED_NAME_SHORTCUT_NUM)
  private String shortcutNum;

  public static final String SERIALIZED_NAME_CORRESPONDING_TYPE_EXPENSE = "corresponding_type_expense";
  @SerializedName(SERIALIZED_NAME_CORRESPONDING_TYPE_EXPENSE)
  private Integer correspondingTypeExpense;

  public static final String SERIALIZED_NAME_CORRESPONDING_TYPE_INCOME = "corresponding_type_income";
  @SerializedName(SERIALIZED_NAME_CORRESPONDING_TYPE_INCOME)
  private Integer correspondingTypeIncome;

  public static final String SERIALIZED_NAME_SEARCHABLE = "searchable";
  @SerializedName(SERIALIZED_NAME_SEARCHABLE)
  private Integer searchable;

  public static final String SERIALIZED_NAME_ACCUMULATED_DEP_ACCOUNT_ITEM_NAME = "accumulated_dep_account_item_name";
  @SerializedName(SERIALIZED_NAME_ACCUMULATED_DEP_ACCOUNT_ITEM_NAME)
  private String accumulatedDepAccountItemName;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AccountItemItems> items = null;

  public static final String SERIALIZED_NAME_PARTNERS = "partners";
  @SerializedName(SERIALIZED_NAME_PARTNERS)
  private List<AccountItemPartners> partners = null;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Boolean available;

  public static final String SERIALIZED_NAME_WALLETABLE_ID = "walletable_id";
  @SerializedName(SERIALIZED_NAME_WALLETABLE_ID)
  private Integer walletableId;


  public AccountItem id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 勘定科目ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "勘定科目ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AccountItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 勘定科目名 (30文字以内)
   * @return name
  **/
  @ApiModelProperty(example = "ソフトウェア", required = true, value = "勘定科目名 (30文字以内)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AccountItem companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 事業所ID
   * minimum: 1
   * maximum: 999999999999
   * @return companyId
  **/
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public AccountItem taxCode(Integer taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * 税区分コード
   * @return taxCode
  **/
  @ApiModelProperty(example = "1", required = true, value = "税区分コード")

  public Integer getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(Integer taxCode) {
    this.taxCode = taxCode;
  }


  public AccountItem accountCategoryId(Integer accountCategoryId) {
    
    this.accountCategoryId = accountCategoryId;
    return this;
  }

   /**
   * 勘定科目のカテゴリーコード
   * @return accountCategoryId
  **/
  @ApiModelProperty(example = "1", required = true, value = "勘定科目のカテゴリーコード")

  public Integer getAccountCategoryId() {
    return accountCategoryId;
  }


  public void setAccountCategoryId(Integer accountCategoryId) {
    this.accountCategoryId = accountCategoryId;
  }


  public AccountItem shortcut(String shortcut) {
    
    this.shortcut = shortcut;
    return this;
  }

   /**
   * ショートカット1 (20文字以内)
   * @return shortcut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SOFUTO", value = "ショートカット1 (20文字以内)")

  public String getShortcut() {
    return shortcut;
  }


  public void setShortcut(String shortcut) {
    this.shortcut = shortcut;
  }


  public AccountItem shortcutNum(String shortcutNum) {
    
    this.shortcutNum = shortcutNum;
    return this;
  }

   /**
   * ショートカット2(勘定科目コード) (20文字以内)
   * @return shortcutNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "ショートカット2(勘定科目コード) (20文字以内)")

  public String getShortcutNum() {
    return shortcutNum;
  }


  public void setShortcutNum(String shortcutNum) {
    this.shortcutNum = shortcutNum;
  }


  public AccountItem correspondingTypeExpense(Integer correspondingTypeExpense) {
    
    this.correspondingTypeExpense = correspondingTypeExpense;
    return this;
  }

   /**
   * 支出取引相手勘定科目ID
   * @return correspondingTypeExpense
  **/
  @ApiModelProperty(example = "5", required = true, value = "支出取引相手勘定科目ID")

  public Integer getCorrespondingTypeExpense() {
    return correspondingTypeExpense;
  }


  public void setCorrespondingTypeExpense(Integer correspondingTypeExpense) {
    this.correspondingTypeExpense = correspondingTypeExpense;
  }


  public AccountItem correspondingTypeIncome(Integer correspondingTypeIncome) {
    
    this.correspondingTypeIncome = correspondingTypeIncome;
    return this;
  }

   /**
   * 収入取引相手勘定科目ID
   * @return correspondingTypeIncome
  **/
  @ApiModelProperty(example = "2", required = true, value = "収入取引相手勘定科目ID")

  public Integer getCorrespondingTypeIncome() {
    return correspondingTypeIncome;
  }


  public void setCorrespondingTypeIncome(Integer correspondingTypeIncome) {
    this.correspondingTypeIncome = correspondingTypeIncome;
  }


  public AccountItem searchable(Integer searchable) {
    
    this.searchable = searchable;
    return this;
  }

   /**
   * 検索可能:2, 検索不可：3
   * @return searchable
  **/
  @ApiModelProperty(example = "2", required = true, value = "検索可能:2, 検索不可：3")

  public Integer getSearchable() {
    return searchable;
  }


  public void setSearchable(Integer searchable) {
    this.searchable = searchable;
  }


  public AccountItem accumulatedDepAccountItemName(String accumulatedDepAccountItemName) {
    
    this.accumulatedDepAccountItemName = accumulatedDepAccountItemName;
    return this;
  }

   /**
   * 減価償却累計額勘定科目
   * @return accumulatedDepAccountItemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "減価償却累計額", value = "減価償却累計額勘定科目")

  public String getAccumulatedDepAccountItemName() {
    return accumulatedDepAccountItemName;
  }


  public void setAccumulatedDepAccountItemName(String accumulatedDepAccountItemName) {
    this.accumulatedDepAccountItemName = accumulatedDepAccountItemName;
  }


  public AccountItem items(List<AccountItemItems> items) {
    
    this.items = items;
    return this;
  }

  public AccountItem addItemsItem(AccountItemItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountItemItems> getItems() {
    return items;
  }


  public void setItems(List<AccountItemItems> items) {
    this.items = items;
  }


  public AccountItem partners(List<AccountItemPartners> partners) {
    
    this.partners = partners;
    return this;
  }

  public AccountItem addPartnersItem(AccountItemPartners partnersItem) {
    if (this.partners == null) {
      this.partners = new ArrayList<>();
    }
    this.partners.add(partnersItem);
    return this;
  }

   /**
   * Get partners
   * @return partners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountItemPartners> getPartners() {
    return partners;
  }


  public void setPartners(List<AccountItemPartners> partners) {
    this.partners = partners;
  }


  public AccountItem available(Boolean available) {
    
    this.available = available;
    return this;
  }

   /**
   * 勘定科目の使用設定（true: 使用する、false: 使用しない）
   * @return available
  **/
  @ApiModelProperty(example = "true", required = true, value = "勘定科目の使用設定（true: 使用する、false: 使用しない）")

  public Boolean getAvailable() {
    return available;
  }


  public void setAvailable(Boolean available) {
    this.available = available;
  }


  public AccountItem walletableId(Integer walletableId) {
    
    this.walletableId = walletableId;
    return this;
  }

   /**
   * 口座ID
   * @return walletableId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "口座ID")

  public Integer getWalletableId() {
    return walletableId;
  }


  public void setWalletableId(Integer walletableId) {
    this.walletableId = walletableId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountItem accountItem = (AccountItem) o;
    return Objects.equals(this.id, accountItem.id) &&
        Objects.equals(this.name, accountItem.name) &&
        Objects.equals(this.companyId, accountItem.companyId) &&
        Objects.equals(this.taxCode, accountItem.taxCode) &&
        Objects.equals(this.accountCategoryId, accountItem.accountCategoryId) &&
        Objects.equals(this.shortcut, accountItem.shortcut) &&
        Objects.equals(this.shortcutNum, accountItem.shortcutNum) &&
        Objects.equals(this.correspondingTypeExpense, accountItem.correspondingTypeExpense) &&
        Objects.equals(this.correspondingTypeIncome, accountItem.correspondingTypeIncome) &&
        Objects.equals(this.searchable, accountItem.searchable) &&
        Objects.equals(this.accumulatedDepAccountItemName, accountItem.accumulatedDepAccountItemName) &&
        Objects.equals(this.items, accountItem.items) &&
        Objects.equals(this.partners, accountItem.partners) &&
        Objects.equals(this.available, accountItem.available) &&
        Objects.equals(this.walletableId, accountItem.walletableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, companyId, taxCode, accountCategoryId, shortcut, shortcutNum, correspondingTypeExpense, correspondingTypeIncome, searchable, accumulatedDepAccountItemName, items, partners, available, walletableId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    accountCategoryId: ").append(toIndentedString(accountCategoryId)).append("\n");
    sb.append("    shortcut: ").append(toIndentedString(shortcut)).append("\n");
    sb.append("    shortcutNum: ").append(toIndentedString(shortcutNum)).append("\n");
    sb.append("    correspondingTypeExpense: ").append(toIndentedString(correspondingTypeExpense)).append("\n");
    sb.append("    correspondingTypeIncome: ").append(toIndentedString(correspondingTypeIncome)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    accumulatedDepAccountItemName: ").append(toIndentedString(accumulatedDepAccountItemName)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    walletableId: ").append(toIndentedString(walletableId)).append("\n");
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

