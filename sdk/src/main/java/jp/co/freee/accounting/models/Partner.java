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
import jp.co.freee.accounting.models.PartnerAllOf;
import jp.co.freee.accounting.models.PartnerAllOf1;

/**
 * Partner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class Partner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

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

  public static final String SERIALIZED_NAME_ADDRESS_ATTRIBUTES_ZIPCODE = "address_attributes[zipcode]";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ATTRIBUTES_ZIPCODE)
  private String addressAttributesZipcode;

  public static final String SERIALIZED_NAME_ADDRESS_ATTRIBUTES_PREFECTURE_CODE = "address_attributes[prefecture_code]";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ATTRIBUTES_PREFECTURE_CODE)
  private Integer addressAttributesPrefectureCode;

  public static final String SERIALIZED_NAME_ADDRESS_ATTRIBUTES_STREET_NAME1 = "address_attributes[street_name1]";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ATTRIBUTES_STREET_NAME1)
  private String addressAttributesStreetName1;

  public static final String SERIALIZED_NAME_ADDRESS_ATTRIBUTES_STREET_NAME2 = "address_attributes[street_name2]";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ATTRIBUTES_STREET_NAME2)
  private String addressAttributesStreetName2;

  /**
   * 請求書送付方法(mail:メール、posting:郵送、mail_and_posting:メールと郵送)
   */
  @JsonAdapter(PartnerDocSettingAttributesSendingMethodEnum.Adapter.class)
  public enum PartnerDocSettingAttributesSendingMethodEnum {
    MAIL("mail"),
    
    POSTING("posting"),
    
    MAIN_AND_POSTING("main_and_posting");

    private String value;

    PartnerDocSettingAttributesSendingMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PartnerDocSettingAttributesSendingMethodEnum fromValue(String value) {
      for (PartnerDocSettingAttributesSendingMethodEnum b : PartnerDocSettingAttributesSendingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PartnerDocSettingAttributesSendingMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PartnerDocSettingAttributesSendingMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PartnerDocSettingAttributesSendingMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PartnerDocSettingAttributesSendingMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES_SENDING_METHOD = "partner_doc_setting_attributes[sending_method]";
  @SerializedName(SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES_SENDING_METHOD)
  private PartnerDocSettingAttributesSendingMethodEnum partnerDocSettingAttributesSendingMethod;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BANK_NAME = "partner_bank_account_attributes[bank_name]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BANK_NAME)
  private String partnerBankAccountAttributesBankName;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BANK_NAME_KANA = "partner_bank_account_attributes[bank_name_kana]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BANK_NAME_KANA)
  private String partnerBankAccountAttributesBankNameKana;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BANK_CODE = "partner_bank_account_attributes[bank_code]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BANK_CODE)
  private String partnerBankAccountAttributesBankCode;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BRANCH_NAME = "partner_bank_account_attributes[branch_name]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BRANCH_NAME)
  private String partnerBankAccountAttributesBranchName;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BRANCH_KANA = "partner_bank_account_attributes[branch_kana]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BRANCH_KANA)
  private String partnerBankAccountAttributesBranchKana;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BRANCH_CODE = "partner_bank_account_attributes[branch_code]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_BRANCH_CODE)
  private String partnerBankAccountAttributesBranchCode;

  /**
   * 口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他)
   */
  @JsonAdapter(PartnerBankAccountAttributesAccountTypeEnum.Adapter.class)
  public enum PartnerBankAccountAttributesAccountTypeEnum {
    ORDINARY("ordinary"),
    
    CHECKING("checking"),
    
    EARMARKED("earmarked"),
    
    SAVINGS("savings"),
    
    OTHER("other");

    private String value;

    PartnerBankAccountAttributesAccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PartnerBankAccountAttributesAccountTypeEnum fromValue(String value) {
      for (PartnerBankAccountAttributesAccountTypeEnum b : PartnerBankAccountAttributesAccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PartnerBankAccountAttributesAccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PartnerBankAccountAttributesAccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PartnerBankAccountAttributesAccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PartnerBankAccountAttributesAccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_ACCOUNT_TYPE = "partner_bank_account_attributes[account_type]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_ACCOUNT_TYPE)
  private PartnerBankAccountAttributesAccountTypeEnum partnerBankAccountAttributesAccountType;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_ACCOUNT_NUMBER = "partner_bank_account_attributes[account_number]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_ACCOUNT_NUMBER)
  private String partnerBankAccountAttributesAccountNumber;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_ACCOUNT_NAME = "partner_bank_account_attributes[account_name]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_ACCOUNT_NAME)
  private String partnerBankAccountAttributesAccountName;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_LONG_ACCOUNT_NAME = "partner_bank_account_attributes[long_account_name]";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES_LONG_ACCOUNT_NAME)
  private String partnerBankAccountAttributesLongAccountName;


  public Partner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 取引先ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "取引先ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Partner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 取引先コード
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "code001", required = true, value = "取引先コード")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Partner companyId(Integer companyId) {
    
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


  public Partner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 取引先名
   * @return name
  **/
  @ApiModelProperty(example = "ABC商店", required = true, value = "取引先名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Partner shortcut1(String shortcut1) {
    
    this.shortcut1 = shortcut1;
    return this;
  }

   /**
   * ショートカット1 (20文字以内)
   * @return shortcut1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABC", value = "ショートカット1 (20文字以内)")

  public String getShortcut1() {
    return shortcut1;
  }


  public void setShortcut1(String shortcut1) {
    this.shortcut1 = shortcut1;
  }


  public Partner shortcut2(String shortcut2) {
    
    this.shortcut2 = shortcut2;
    return this;
  }

   /**
   * ショートカット2 (20文字以内)
   * @return shortcut2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "501", value = "ショートカット2 (20文字以内)")

  public String getShortcut2() {
    return shortcut2;
  }


  public void setShortcut2(String shortcut2) {
    this.shortcut2 = shortcut2;
  }


  public Partner longName(String longName) {
    
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


  public Partner nameKana(String nameKana) {
    
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


  public Partner defaultTitle(String defaultTitle) {
    
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


  public Partner phone(String phone) {
    
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


  public Partner contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 担当者 氏名
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "営業担当", value = "担当者 氏名")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public Partner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 担当者 メールアドレス
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "contact@example.com", value = "担当者 メールアドレス")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Partner addressAttributesZipcode(String addressAttributesZipcode) {
    
    this.addressAttributesZipcode = addressAttributesZipcode;
    return this;
  }

   /**
   * 郵便番号
   * @return addressAttributesZipcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000-0000", value = "郵便番号")

  public String getAddressAttributesZipcode() {
    return addressAttributesZipcode;
  }


  public void setAddressAttributesZipcode(String addressAttributesZipcode) {
    this.addressAttributesZipcode = addressAttributesZipcode;
  }


  public Partner addressAttributesPrefectureCode(Integer addressAttributesPrefectureCode) {
    
    this.addressAttributesPrefectureCode = addressAttributesPrefectureCode;
    return this;
  }

   /**
   * 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄
   * minimum: 0
   * maximum: 46
   * @return addressAttributesPrefectureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄")

  public Integer getAddressAttributesPrefectureCode() {
    return addressAttributesPrefectureCode;
  }


  public void setAddressAttributesPrefectureCode(Integer addressAttributesPrefectureCode) {
    this.addressAttributesPrefectureCode = addressAttributesPrefectureCode;
  }


  public Partner addressAttributesStreetName1(String addressAttributesStreetName1) {
    
    this.addressAttributesStreetName1 = addressAttributesStreetName1;
    return this;
  }

   /**
   * 市区町村・番地
   * @return addressAttributesStreetName1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ＸＸ区ＹＹ１−１−１", value = "市区町村・番地")

  public String getAddressAttributesStreetName1() {
    return addressAttributesStreetName1;
  }


  public void setAddressAttributesStreetName1(String addressAttributesStreetName1) {
    this.addressAttributesStreetName1 = addressAttributesStreetName1;
  }


  public Partner addressAttributesStreetName2(String addressAttributesStreetName2) {
    
    this.addressAttributesStreetName2 = addressAttributesStreetName2;
    return this;
  }

   /**
   * 建物名・部屋番号など
   * @return addressAttributesStreetName2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ビル１Ｆ", value = "建物名・部屋番号など")

  public String getAddressAttributesStreetName2() {
    return addressAttributesStreetName2;
  }


  public void setAddressAttributesStreetName2(String addressAttributesStreetName2) {
    this.addressAttributesStreetName2 = addressAttributesStreetName2;
  }


  public Partner partnerDocSettingAttributesSendingMethod(PartnerDocSettingAttributesSendingMethodEnum partnerDocSettingAttributesSendingMethod) {
    
    this.partnerDocSettingAttributesSendingMethod = partnerDocSettingAttributesSendingMethod;
    return this;
  }

   /**
   * 請求書送付方法(mail:メール、posting:郵送、mail_and_posting:メールと郵送)
   * @return partnerDocSettingAttributesSendingMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "posting", value = "請求書送付方法(mail:メール、posting:郵送、mail_and_posting:メールと郵送)")

  public PartnerDocSettingAttributesSendingMethodEnum getPartnerDocSettingAttributesSendingMethod() {
    return partnerDocSettingAttributesSendingMethod;
  }


  public void setPartnerDocSettingAttributesSendingMethod(PartnerDocSettingAttributesSendingMethodEnum partnerDocSettingAttributesSendingMethod) {
    this.partnerDocSettingAttributesSendingMethod = partnerDocSettingAttributesSendingMethod;
  }


  public Partner partnerBankAccountAttributesBankName(String partnerBankAccountAttributesBankName) {
    
    this.partnerBankAccountAttributesBankName = partnerBankAccountAttributesBankName;
    return this;
  }

   /**
   * 銀行名
   * @return partnerBankAccountAttributesBankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ＸＸ銀行", value = "銀行名")

  public String getPartnerBankAccountAttributesBankName() {
    return partnerBankAccountAttributesBankName;
  }


  public void setPartnerBankAccountAttributesBankName(String partnerBankAccountAttributesBankName) {
    this.partnerBankAccountAttributesBankName = partnerBankAccountAttributesBankName;
  }


  public Partner partnerBankAccountAttributesBankNameKana(String partnerBankAccountAttributesBankNameKana) {
    
    this.partnerBankAccountAttributesBankNameKana = partnerBankAccountAttributesBankNameKana;
    return this;
  }

   /**
   * 銀行名（カナ）
   * @return partnerBankAccountAttributesBankNameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ＸＸ", value = "銀行名（カナ）")

  public String getPartnerBankAccountAttributesBankNameKana() {
    return partnerBankAccountAttributesBankNameKana;
  }


  public void setPartnerBankAccountAttributesBankNameKana(String partnerBankAccountAttributesBankNameKana) {
    this.partnerBankAccountAttributesBankNameKana = partnerBankAccountAttributesBankNameKana;
  }


  public Partner partnerBankAccountAttributesBankCode(String partnerBankAccountAttributesBankCode) {
    
    this.partnerBankAccountAttributesBankCode = partnerBankAccountAttributesBankCode;
    return this;
  }

   /**
   * 銀行番号
   * @return partnerBankAccountAttributesBankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001", value = "銀行番号")

  public String getPartnerBankAccountAttributesBankCode() {
    return partnerBankAccountAttributesBankCode;
  }


  public void setPartnerBankAccountAttributesBankCode(String partnerBankAccountAttributesBankCode) {
    this.partnerBankAccountAttributesBankCode = partnerBankAccountAttributesBankCode;
  }


  public Partner partnerBankAccountAttributesBranchName(String partnerBankAccountAttributesBranchName) {
    
    this.partnerBankAccountAttributesBranchName = partnerBankAccountAttributesBranchName;
    return this;
  }

   /**
   * 支店名
   * @return partnerBankAccountAttributesBranchName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "銀座支店", value = "支店名")

  public String getPartnerBankAccountAttributesBranchName() {
    return partnerBankAccountAttributesBranchName;
  }


  public void setPartnerBankAccountAttributesBranchName(String partnerBankAccountAttributesBranchName) {
    this.partnerBankAccountAttributesBranchName = partnerBankAccountAttributesBranchName;
  }


  public Partner partnerBankAccountAttributesBranchKana(String partnerBankAccountAttributesBranchKana) {
    
    this.partnerBankAccountAttributesBranchKana = partnerBankAccountAttributesBranchKana;
    return this;
  }

   /**
   * 支店名（カナ）
   * @return partnerBankAccountAttributesBranchKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ギンザ", value = "支店名（カナ）")

  public String getPartnerBankAccountAttributesBranchKana() {
    return partnerBankAccountAttributesBranchKana;
  }


  public void setPartnerBankAccountAttributesBranchKana(String partnerBankAccountAttributesBranchKana) {
    this.partnerBankAccountAttributesBranchKana = partnerBankAccountAttributesBranchKana;
  }


  public Partner partnerBankAccountAttributesBranchCode(String partnerBankAccountAttributesBranchCode) {
    
    this.partnerBankAccountAttributesBranchCode = partnerBankAccountAttributesBranchCode;
    return this;
  }

   /**
   * 受取人名（カナ）
   * @return partnerBankAccountAttributesBranchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "フリータロウ", value = "受取人名（カナ）")

  public String getPartnerBankAccountAttributesBranchCode() {
    return partnerBankAccountAttributesBranchCode;
  }


  public void setPartnerBankAccountAttributesBranchCode(String partnerBankAccountAttributesBranchCode) {
    this.partnerBankAccountAttributesBranchCode = partnerBankAccountAttributesBranchCode;
  }


  public Partner partnerBankAccountAttributesAccountType(PartnerBankAccountAttributesAccountTypeEnum partnerBankAccountAttributesAccountType) {
    
    this.partnerBankAccountAttributesAccountType = partnerBankAccountAttributesAccountType;
    return this;
  }

   /**
   * 口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他)
   * @return partnerBankAccountAttributesAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ordinary", value = "口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他)")

  public PartnerBankAccountAttributesAccountTypeEnum getPartnerBankAccountAttributesAccountType() {
    return partnerBankAccountAttributesAccountType;
  }


  public void setPartnerBankAccountAttributesAccountType(PartnerBankAccountAttributesAccountTypeEnum partnerBankAccountAttributesAccountType) {
    this.partnerBankAccountAttributesAccountType = partnerBankAccountAttributesAccountType;
  }


  public Partner partnerBankAccountAttributesAccountNumber(String partnerBankAccountAttributesAccountNumber) {
    
    this.partnerBankAccountAttributesAccountNumber = partnerBankAccountAttributesAccountNumber;
    return this;
  }

   /**
   * 口座番号
   * @return partnerBankAccountAttributesAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1010101", value = "口座番号")

  public String getPartnerBankAccountAttributesAccountNumber() {
    return partnerBankAccountAttributesAccountNumber;
  }


  public void setPartnerBankAccountAttributesAccountNumber(String partnerBankAccountAttributesAccountNumber) {
    this.partnerBankAccountAttributesAccountNumber = partnerBankAccountAttributesAccountNumber;
  }


  public Partner partnerBankAccountAttributesAccountName(String partnerBankAccountAttributesAccountName) {
    
    this.partnerBankAccountAttributesAccountName = partnerBankAccountAttributesAccountName;
    return this;
  }

   /**
   * 受取人名（カナ）
   * @return partnerBankAccountAttributesAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "フリータロウ", value = "受取人名（カナ）")

  public String getPartnerBankAccountAttributesAccountName() {
    return partnerBankAccountAttributesAccountName;
  }


  public void setPartnerBankAccountAttributesAccountName(String partnerBankAccountAttributesAccountName) {
    this.partnerBankAccountAttributesAccountName = partnerBankAccountAttributesAccountName;
  }


  public Partner partnerBankAccountAttributesLongAccountName(String partnerBankAccountAttributesLongAccountName) {
    
    this.partnerBankAccountAttributesLongAccountName = partnerBankAccountAttributesLongAccountName;
    return this;
  }

   /**
   * 受取人名
   * @return partnerBankAccountAttributesLongAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freee太郎", value = "受取人名")

  public String getPartnerBankAccountAttributesLongAccountName() {
    return partnerBankAccountAttributesLongAccountName;
  }


  public void setPartnerBankAccountAttributesLongAccountName(String partnerBankAccountAttributesLongAccountName) {
    this.partnerBankAccountAttributesLongAccountName = partnerBankAccountAttributesLongAccountName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partner partner = (Partner) o;
    return Objects.equals(this.id, partner.id) &&
        Objects.equals(this.code, partner.code) &&
        Objects.equals(this.companyId, partner.companyId) &&
        Objects.equals(this.name, partner.name) &&
        Objects.equals(this.shortcut1, partner.shortcut1) &&
        Objects.equals(this.shortcut2, partner.shortcut2) &&
        Objects.equals(this.longName, partner.longName) &&
        Objects.equals(this.nameKana, partner.nameKana) &&
        Objects.equals(this.defaultTitle, partner.defaultTitle) &&
        Objects.equals(this.phone, partner.phone) &&
        Objects.equals(this.contactName, partner.contactName) &&
        Objects.equals(this.email, partner.email) &&
        Objects.equals(this.addressAttributesZipcode, partner.addressAttributesZipcode) &&
        Objects.equals(this.addressAttributesPrefectureCode, partner.addressAttributesPrefectureCode) &&
        Objects.equals(this.addressAttributesStreetName1, partner.addressAttributesStreetName1) &&
        Objects.equals(this.addressAttributesStreetName2, partner.addressAttributesStreetName2) &&
        Objects.equals(this.partnerDocSettingAttributesSendingMethod, partner.partnerDocSettingAttributesSendingMethod) &&
        Objects.equals(this.partnerBankAccountAttributesBankName, partner.partnerBankAccountAttributesBankName) &&
        Objects.equals(this.partnerBankAccountAttributesBankNameKana, partner.partnerBankAccountAttributesBankNameKana) &&
        Objects.equals(this.partnerBankAccountAttributesBankCode, partner.partnerBankAccountAttributesBankCode) &&
        Objects.equals(this.partnerBankAccountAttributesBranchName, partner.partnerBankAccountAttributesBranchName) &&
        Objects.equals(this.partnerBankAccountAttributesBranchKana, partner.partnerBankAccountAttributesBranchKana) &&
        Objects.equals(this.partnerBankAccountAttributesBranchCode, partner.partnerBankAccountAttributesBranchCode) &&
        Objects.equals(this.partnerBankAccountAttributesAccountType, partner.partnerBankAccountAttributesAccountType) &&
        Objects.equals(this.partnerBankAccountAttributesAccountNumber, partner.partnerBankAccountAttributesAccountNumber) &&
        Objects.equals(this.partnerBankAccountAttributesAccountName, partner.partnerBankAccountAttributesAccountName) &&
        Objects.equals(this.partnerBankAccountAttributesLongAccountName, partner.partnerBankAccountAttributesLongAccountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, companyId, name, shortcut1, shortcut2, longName, nameKana, defaultTitle, phone, contactName, email, addressAttributesZipcode, addressAttributesPrefectureCode, addressAttributesStreetName1, addressAttributesStreetName2, partnerDocSettingAttributesSendingMethod, partnerBankAccountAttributesBankName, partnerBankAccountAttributesBankNameKana, partnerBankAccountAttributesBankCode, partnerBankAccountAttributesBranchName, partnerBankAccountAttributesBranchKana, partnerBankAccountAttributesBranchCode, partnerBankAccountAttributesAccountType, partnerBankAccountAttributesAccountNumber, partnerBankAccountAttributesAccountName, partnerBankAccountAttributesLongAccountName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
    sb.append("    addressAttributesZipcode: ").append(toIndentedString(addressAttributesZipcode)).append("\n");
    sb.append("    addressAttributesPrefectureCode: ").append(toIndentedString(addressAttributesPrefectureCode)).append("\n");
    sb.append("    addressAttributesStreetName1: ").append(toIndentedString(addressAttributesStreetName1)).append("\n");
    sb.append("    addressAttributesStreetName2: ").append(toIndentedString(addressAttributesStreetName2)).append("\n");
    sb.append("    partnerDocSettingAttributesSendingMethod: ").append(toIndentedString(partnerDocSettingAttributesSendingMethod)).append("\n");
    sb.append("    partnerBankAccountAttributesBankName: ").append(toIndentedString(partnerBankAccountAttributesBankName)).append("\n");
    sb.append("    partnerBankAccountAttributesBankNameKana: ").append(toIndentedString(partnerBankAccountAttributesBankNameKana)).append("\n");
    sb.append("    partnerBankAccountAttributesBankCode: ").append(toIndentedString(partnerBankAccountAttributesBankCode)).append("\n");
    sb.append("    partnerBankAccountAttributesBranchName: ").append(toIndentedString(partnerBankAccountAttributesBranchName)).append("\n");
    sb.append("    partnerBankAccountAttributesBranchKana: ").append(toIndentedString(partnerBankAccountAttributesBranchKana)).append("\n");
    sb.append("    partnerBankAccountAttributesBranchCode: ").append(toIndentedString(partnerBankAccountAttributesBranchCode)).append("\n");
    sb.append("    partnerBankAccountAttributesAccountType: ").append(toIndentedString(partnerBankAccountAttributesAccountType)).append("\n");
    sb.append("    partnerBankAccountAttributesAccountNumber: ").append(toIndentedString(partnerBankAccountAttributesAccountNumber)).append("\n");
    sb.append("    partnerBankAccountAttributesAccountName: ").append(toIndentedString(partnerBankAccountAttributesAccountName)).append("\n");
    sb.append("    partnerBankAccountAttributesLongAccountName: ").append(toIndentedString(partnerBankAccountAttributesLongAccountName)).append("\n");
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

