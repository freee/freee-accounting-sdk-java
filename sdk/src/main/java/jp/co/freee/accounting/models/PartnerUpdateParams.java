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
import jp.co.freee.accounting.models.PartnerCreateParamsAddressAttributes;
import jp.co.freee.accounting.models.PartnerCreateParamsPartnerBankAccountAttributes;
import jp.co.freee.accounting.models.PartnerCreateParamsPartnerDocSettingAttributes;

/**
 * PartnerUpdateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class PartnerUpdateParams {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORTCUT1 = "shortcut1";
  @SerializedName(SERIALIZED_NAME_SHORTCUT1)
  private String shortcut1;

  public static final String SERIALIZED_NAME_SHORTCUT2 = "shortcut2";
  @SerializedName(SERIALIZED_NAME_SHORTCUT2)
  private String shortcut2;

  public static final String SERIALIZED_NAME_LONG_NAME = "long_name";
  @SerializedName(SERIALIZED_NAME_LONG_NAME)
  private String longName;

  public static final String SERIALIZED_NAME_NAME_KANA = "name_kana";
  @SerializedName(SERIALIZED_NAME_NAME_KANA)
  private String nameKana;

  public static final String SERIALIZED_NAME_DEFAULT_TITLE = "default_title";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TITLE)
  private String defaultTitle;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ADDRESS_ATTRIBUTES = "address_attributes";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ATTRIBUTES)
  private PartnerCreateParamsAddressAttributes addressAttributes;

  public static final String SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES = "partner_doc_setting_attributes";
  @SerializedName(SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES)
  private PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES = "partner_bank_account_attributes";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES)
  private PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes;


  public PartnerUpdateParams companyId(Integer companyId) {
    
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


  public PartnerUpdateParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 取引先名 (255文字以内)
   * @return name
  **/
  @ApiModelProperty(example = "新しい取引先", required = true, value = "取引先名 (255文字以内)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PartnerUpdateParams shortcut1(String shortcut1) {
    
    this.shortcut1 = shortcut1;
    return this;
  }

   /**
   * ショートカット１ (255文字以内)
   * @return shortcut1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NEWPARTNER", value = "ショートカット１ (255文字以内)")

  public String getShortcut1() {
    return shortcut1;
  }


  public void setShortcut1(String shortcut1) {
    this.shortcut1 = shortcut1;
  }


  public PartnerUpdateParams shortcut2(String shortcut2) {
    
    this.shortcut2 = shortcut2;
    return this;
  }

   /**
   * ショートカット２ (255文字以内)
   * @return shortcut2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "502", value = "ショートカット２ (255文字以内)")

  public String getShortcut2() {
    return shortcut2;
  }


  public void setShortcut2(String shortcut2) {
    this.shortcut2 = shortcut2;
  }


  public PartnerUpdateParams longName(String longName) {
    
    this.longName = longName;
    return this;
  }

   /**
   * 正式名称（255文字以内）
   * @return longName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "新しい取引先正式名称", value = "正式名称（255文字以内）")

  public String getLongName() {
    return longName;
  }


  public void setLongName(String longName) {
    this.longName = longName;
  }


  public PartnerUpdateParams nameKana(String nameKana) {
    
    this.nameKana = nameKana;
    return this;
  }

   /**
   * カナ名称（255文字以内）
   * @return nameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "アタラシイトリヒキサキメイショウ", value = "カナ名称（255文字以内）")

  public String getNameKana() {
    return nameKana;
  }


  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }


  public PartnerUpdateParams defaultTitle(String defaultTitle) {
    
    this.defaultTitle = defaultTitle;
    return this;
  }

   /**
   * 敬称（御中、様、(空白)の3つから選択）
   * @return defaultTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "御中", value = "敬称（御中、様、(空白)の3つから選択）")

  public String getDefaultTitle() {
    return defaultTitle;
  }


  public void setDefaultTitle(String defaultTitle) {
    this.defaultTitle = defaultTitle;
  }


  public PartnerUpdateParams phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 電話番号
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03-1234-xxxx", value = "電話番号")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public PartnerUpdateParams contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 担当者 氏名 (255文字以内)
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "営業担当", value = "担当者 氏名 (255文字以内)")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public PartnerUpdateParams email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 担当者 メールアドレス (255文字以内)
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "contact@example.com", value = "担当者 メールアドレス (255文字以内)")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PartnerUpdateParams addressAttributes(PartnerCreateParamsAddressAttributes addressAttributes) {
    
    this.addressAttributes = addressAttributes;
    return this;
  }

   /**
   * Get addressAttributes
   * @return addressAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsAddressAttributes getAddressAttributes() {
    return addressAttributes;
  }


  public void setAddressAttributes(PartnerCreateParamsAddressAttributes addressAttributes) {
    this.addressAttributes = addressAttributes;
  }


  public PartnerUpdateParams partnerDocSettingAttributes(PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes) {
    
    this.partnerDocSettingAttributes = partnerDocSettingAttributes;
    return this;
  }

   /**
   * Get partnerDocSettingAttributes
   * @return partnerDocSettingAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsPartnerDocSettingAttributes getPartnerDocSettingAttributes() {
    return partnerDocSettingAttributes;
  }


  public void setPartnerDocSettingAttributes(PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes) {
    this.partnerDocSettingAttributes = partnerDocSettingAttributes;
  }


  public PartnerUpdateParams partnerBankAccountAttributes(PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes) {
    
    this.partnerBankAccountAttributes = partnerBankAccountAttributes;
    return this;
  }

   /**
   * Get partnerBankAccountAttributes
   * @return partnerBankAccountAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsPartnerBankAccountAttributes getPartnerBankAccountAttributes() {
    return partnerBankAccountAttributes;
  }


  public void setPartnerBankAccountAttributes(PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes) {
    this.partnerBankAccountAttributes = partnerBankAccountAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerUpdateParams partnerUpdateParams = (PartnerUpdateParams) o;
    return Objects.equals(this.companyId, partnerUpdateParams.companyId) &&
        Objects.equals(this.name, partnerUpdateParams.name) &&
        Objects.equals(this.shortcut1, partnerUpdateParams.shortcut1) &&
        Objects.equals(this.shortcut2, partnerUpdateParams.shortcut2) &&
        Objects.equals(this.longName, partnerUpdateParams.longName) &&
        Objects.equals(this.nameKana, partnerUpdateParams.nameKana) &&
        Objects.equals(this.defaultTitle, partnerUpdateParams.defaultTitle) &&
        Objects.equals(this.phone, partnerUpdateParams.phone) &&
        Objects.equals(this.contactName, partnerUpdateParams.contactName) &&
        Objects.equals(this.email, partnerUpdateParams.email) &&
        Objects.equals(this.addressAttributes, partnerUpdateParams.addressAttributes) &&
        Objects.equals(this.partnerDocSettingAttributes, partnerUpdateParams.partnerDocSettingAttributes) &&
        Objects.equals(this.partnerBankAccountAttributes, partnerUpdateParams.partnerBankAccountAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, name, shortcut1, shortcut2, longName, nameKana, defaultTitle, phone, contactName, email, addressAttributes, partnerDocSettingAttributes, partnerBankAccountAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerUpdateParams {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortcut1: ").append(toIndentedString(shortcut1)).append("\n");
    sb.append("    shortcut2: ").append(toIndentedString(shortcut2)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    nameKana: ").append(toIndentedString(nameKana)).append("\n");
    sb.append("    defaultTitle: ").append(toIndentedString(defaultTitle)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    addressAttributes: ").append(toIndentedString(addressAttributes)).append("\n");
    sb.append("    partnerDocSettingAttributes: ").append(toIndentedString(partnerDocSettingAttributes)).append("\n");
    sb.append("    partnerBankAccountAttributes: ").append(toIndentedString(partnerBankAccountAttributes)).append("\n");
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

