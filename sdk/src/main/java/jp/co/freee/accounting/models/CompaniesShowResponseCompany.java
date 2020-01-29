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

/**
 * CompaniesShowResponseCompany
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class CompaniesShowResponseCompany {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_KANA = "name_kana";
  @SerializedName(SERIALIZED_NAME_NAME_KANA)
  private String nameKana;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_TAX_AT_SOURCE_CALC_TYPE = "tax_at_source_calc_type";
  @SerializedName(SERIALIZED_NAME_TAX_AT_SOURCE_CALC_TYPE)
  private Integer taxAtSourceCalcType;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_HEAD_COUNT = "head_count";
  @SerializedName(SERIALIZED_NAME_HEAD_COUNT)
  private Integer headCount;

  public static final String SERIALIZED_NAME_CORPORATE_NUMBER = "corporate_number";
  @SerializedName(SERIALIZED_NAME_CORPORATE_NUMBER)
  private String corporateNumber;

  /**
   * 仕訳番号形式（not_used: 使用しない、digits: 数字（例：5091824）、alnum: 英数字（例：59J0P））
   */
  @JsonAdapter(TxnNumberFormatEnum.Adapter.class)
  public enum TxnNumberFormatEnum {
    NOT_USED("not_used"),
    
    DIGITS("digits"),
    
    ALNUM("alnum");

    private String value;

    TxnNumberFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TxnNumberFormatEnum fromValue(String value) {
      for (TxnNumberFormatEnum b : TxnNumberFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TxnNumberFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TxnNumberFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TxnNumberFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TxnNumberFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TXN_NUMBER_FORMAT = "txn_number_format";
  @SerializedName(SERIALIZED_NAME_TXN_NUMBER_FORMAT)
  private TxnNumberFormatEnum txnNumberFormat;

  public static final String SERIALIZED_NAME_DEFAULT_WALLET_ACCOUNT_ID = "default_wallet_account_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WALLET_ACCOUNT_ID)
  private Integer defaultWalletAccountId;

  public static final String SERIALIZED_NAME_PRIVATE_SETTLEMENT = "private_settlement";
  @SerializedName(SERIALIZED_NAME_PRIVATE_SETTLEMENT)
  private Boolean privateSettlement;

  public static final String SERIALIZED_NAME_MINUS_FORMAT = "minus_format";
  @SerializedName(SERIALIZED_NAME_MINUS_FORMAT)
  private Integer minusFormat;

  /**
   * ユーザーの権限
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    ADMIN("admin"),
    
    SIMPLE_ACCOUNTING("simple_accounting"),
    
    SELF_ONLY("self_only"),
    
    READ_ONLY("read_only");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  public static final String SERIALIZED_NAME_PHONE1 = "phone1";
  @SerializedName(SERIALIZED_NAME_PHONE1)
  private String phone1;

  public static final String SERIALIZED_NAME_PHONE2 = "phone2";
  @SerializedName(SERIALIZED_NAME_PHONE2)
  private String phone2;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_ZIPCODE = "zipcode";
  @SerializedName(SERIALIZED_NAME_ZIPCODE)
  private String zipcode;

  public static final String SERIALIZED_NAME_PREFECTURE_CODE = "prefecture_code";
  @SerializedName(SERIALIZED_NAME_PREFECTURE_CODE)
  private Integer prefectureCode;

  public static final String SERIALIZED_NAME_STREET_NAME1 = "street_name1";
  @SerializedName(SERIALIZED_NAME_STREET_NAME1)
  private String streetName1;

  public static final String SERIALIZED_NAME_STREET_NAME2 = "street_name2";
  @SerializedName(SERIALIZED_NAME_STREET_NAME2)
  private String streetName2;

  public static final String SERIALIZED_NAME_INVOICE_LAYOUT = "invoice_layout";
  @SerializedName(SERIALIZED_NAME_INVOICE_LAYOUT)
  private Integer invoiceLayout;

  public static final String SERIALIZED_NAME_INVOICE_STYLE = "invoice_style";
  @SerializedName(SERIALIZED_NAME_INVOICE_STYLE)
  private Integer invoiceStyle;

  public static final String SERIALIZED_NAME_AMOUNT_FRACTION = "amount_fraction";
  @SerializedName(SERIALIZED_NAME_AMOUNT_FRACTION)
  private Integer amountFraction;

  /**
   * 種別（agriculture_forestry_fisheries_ore: 農林水産業/鉱業、construction: 建設、manufacturing_processing: 製造/加工、it: IT、transportation_logistics: 運輸/物流、retail_wholesale: 小売/卸売、finance_insurance: 金融/保険、real_estate_rental: 不動産/レンタル、profession: 士業/学術/専門技術サービス、design_production: デザイン/制作、food: 飲食、leisure_entertainment: レジャー/娯楽、lifestyle: 生活関連サービス、education: 教育/学習支援、medical_welfare: 医療/福祉、other_services: その他サービス、other: その他）
   */
  @JsonAdapter(IndustryClassEnum.Adapter.class)
  public enum IndustryClassEnum {
    EMPTY(""),
    
    AGRICULTURE_FORESTRY_FISHERIES_ORE("agriculture_forestry_fisheries_ore"),
    
    CONSTRUCTION("construction"),
    
    MANUFACTURING_PROCESSING("manufacturing_processing"),
    
    IT("it"),
    
    TRANSPORTATION_LOGISTICS("transportation_logistics"),
    
    RETAIL_WHOLESALE("retail_wholesale"),
    
    FINANCE_INSURANCE("finance_insurance"),
    
    REAL_ESTATE_RENTAL("real_estate_rental"),
    
    PROFESSION("profession"),
    
    DESIGN_PRODUCTION("design_production"),
    
    FOOD("food"),
    
    LIFESTYLE("lifestyle"),
    
    EDUCATION("education"),
    
    MEDICAL_WELFARE("medical_welfare"),
    
    OTHER_SERVICES("other_services"),
    
    OTHER("other");

    private String value;

    IndustryClassEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IndustryClassEnum fromValue(String value) {
      for (IndustryClassEnum b : IndustryClassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IndustryClassEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndustryClassEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndustryClassEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IndustryClassEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INDUSTRY_CLASS = "industry_class";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_CLASS)
  private IndustryClassEnum industryClass;

  /**
   * コード（transport_delivery: 輸送業/配送業、delivery: バイク便等の配達業、other_transportation_logistics: その他の運輸業、物流業）
   */
  @JsonAdapter(IndustryCodeEnum.Adapter.class)
  public enum IndustryCodeEnum {
    EMPTY(""),
    
    TRANSPORT_DELIVERY("transport_delivery"),
    
    DELIVERY("delivery"),
    
    OTHER_TRANSPORTATION_LOGISTICS("other_transportation_logistics");

    private String value;

    IndustryCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IndustryCodeEnum fromValue(String value) {
      for (IndustryCodeEnum b : IndustryCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IndustryCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndustryCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndustryCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IndustryCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INDUSTRY_CODE = "industry_code";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_CODE)
  private IndustryCodeEnum industryCode;

  /**
   * 仕訳承認フロー（enable: 有効、 disable: 無効）
   */
  @JsonAdapter(WorkflowSettingEnum.Adapter.class)
  public enum WorkflowSettingEnum {
    ENABLE("enable"),
    
    DISABLE("disable");

    private String value;

    WorkflowSettingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkflowSettingEnum fromValue(String value) {
      for (WorkflowSettingEnum b : WorkflowSettingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WorkflowSettingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkflowSettingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkflowSettingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WorkflowSettingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WORKFLOW_SETTING = "workflow_setting";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_SETTING)
  private WorkflowSettingEnum workflowSetting;

  public static final String SERIALIZED_NAME_USE_PARTNER_CODE = "use_partner_code";
  @SerializedName(SERIALIZED_NAME_USE_PARTNER_CODE)
  private Boolean usePartnerCode;


  public CompaniesShowResponseCompany id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 事業所ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CompaniesShowResponseCompany name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 事業所の正式名称 (100文字以内)
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freee事務所", required = true, value = "事業所の正式名称 (100文字以内)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CompaniesShowResponseCompany nameKana(String nameKana) {
    
    this.nameKana = nameKana;
    return this;
  }

   /**
   * 正式名称フリガナ (100文字以内)
   * @return nameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "フリージムショ", required = true, value = "正式名称フリガナ (100文字以内)")

  public String getNameKana() {
    return nameKana;
  }


  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }


  public CompaniesShowResponseCompany displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * 事業所名
   * @return displayName
  **/
  @ApiModelProperty(example = "freee事務所", required = true, value = "事業所名")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CompaniesShowResponseCompany taxAtSourceCalcType(Integer taxAtSourceCalcType) {
    
    this.taxAtSourceCalcType = taxAtSourceCalcType;
    return this;
  }

   /**
   * 源泉徴収税計算（0: 消費税を含める、1: 消費税を含めない）
   * @return taxAtSourceCalcType
  **/
  @ApiModelProperty(example = "0", required = true, value = "源泉徴収税計算（0: 消費税を含める、1: 消費税を含めない）")

  public Integer getTaxAtSourceCalcType() {
    return taxAtSourceCalcType;
  }


  public void setTaxAtSourceCalcType(Integer taxAtSourceCalcType) {
    this.taxAtSourceCalcType = taxAtSourceCalcType;
  }


  public CompaniesShowResponseCompany contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 担当者名 (50文字以内)
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user1", required = true, value = "担当者名 (50文字以内)")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public CompaniesShowResponseCompany headCount(Integer headCount) {
    
    this.headCount = headCount;
    return this;
  }

   /**
   * 従業員数（0: 経営者のみ、1: 2~5人、2: 6~10人、3: 11~20人、4: 21~30人、5: 31~40人、6: 41~100人、7: 100人以上
   * minimum: 0
   * maximum: 7
   * @return headCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "従業員数（0: 経営者のみ、1: 2~5人、2: 6~10人、3: 11~20人、4: 21~30人、5: 31~40人、6: 41~100人、7: 100人以上")

  public Integer getHeadCount() {
    return headCount;
  }


  public void setHeadCount(Integer headCount) {
    this.headCount = headCount;
  }


  public CompaniesShowResponseCompany corporateNumber(String corporateNumber) {
    
    this.corporateNumber = corporateNumber;
    return this;
  }

   /**
   * 法人番号 (半角数字13桁、法人のみ)
   * @return corporateNumber
  **/
  @ApiModelProperty(example = "1234567890123", required = true, value = "法人番号 (半角数字13桁、法人のみ)")

  public String getCorporateNumber() {
    return corporateNumber;
  }


  public void setCorporateNumber(String corporateNumber) {
    this.corporateNumber = corporateNumber;
  }


  public CompaniesShowResponseCompany txnNumberFormat(TxnNumberFormatEnum txnNumberFormat) {
    
    this.txnNumberFormat = txnNumberFormat;
    return this;
  }

   /**
   * 仕訳番号形式（not_used: 使用しない、digits: 数字（例：5091824）、alnum: 英数字（例：59J0P））
   * @return txnNumberFormat
  **/
  @ApiModelProperty(example = "not_used", required = true, value = "仕訳番号形式（not_used: 使用しない、digits: 数字（例：5091824）、alnum: 英数字（例：59J0P））")

  public TxnNumberFormatEnum getTxnNumberFormat() {
    return txnNumberFormat;
  }


  public void setTxnNumberFormat(TxnNumberFormatEnum txnNumberFormat) {
    this.txnNumberFormat = txnNumberFormat;
  }


  public CompaniesShowResponseCompany defaultWalletAccountId(Integer defaultWalletAccountId) {
    
    this.defaultWalletAccountId = defaultWalletAccountId;
    return this;
  }

   /**
   * 決済口座のデフォルト
   * @return defaultWalletAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "決済口座のデフォルト")

  public Integer getDefaultWalletAccountId() {
    return defaultWalletAccountId;
  }


  public void setDefaultWalletAccountId(Integer defaultWalletAccountId) {
    this.defaultWalletAccountId = defaultWalletAccountId;
  }


  public CompaniesShowResponseCompany privateSettlement(Boolean privateSettlement) {
    
    this.privateSettlement = privateSettlement;
    return this;
  }

   /**
   * プライベート資金/役員資金（false: 使用しない、true: 使用する）
   * @return privateSettlement
  **/
  @ApiModelProperty(example = "true", required = true, value = "プライベート資金/役員資金（false: 使用しない、true: 使用する）")

  public Boolean getPrivateSettlement() {
    return privateSettlement;
  }


  public void setPrivateSettlement(Boolean privateSettlement) {
    this.privateSettlement = privateSettlement;
  }


  public CompaniesShowResponseCompany minusFormat(Integer minusFormat) {
    
    this.minusFormat = minusFormat;
    return this;
  }

   /**
   * マイナスの表示方法（0: -、 1: △）
   * minimum: 0
   * maximum: 1
   * @return minusFormat
  **/
  @ApiModelProperty(example = "0", required = true, value = "マイナスの表示方法（0: -、 1: △）")

  public Integer getMinusFormat() {
    return minusFormat;
  }


  public void setMinusFormat(Integer minusFormat) {
    this.minusFormat = minusFormat;
  }


  public CompaniesShowResponseCompany role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * ユーザーの権限
   * @return role
  **/
  @ApiModelProperty(example = "admin", required = true, value = "ユーザーの権限")

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public CompaniesShowResponseCompany phone1(String phone1) {
    
    this.phone1 = phone1;
    return this;
  }

   /**
   * 電話番号１
   * @return phone1
  **/
  @ApiModelProperty(example = "03-1234-xxxx", required = true, value = "電話番号１")

  public String getPhone1() {
    return phone1;
  }


  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }


  public CompaniesShowResponseCompany phone2(String phone2) {
    
    this.phone2 = phone2;
    return this;
  }

   /**
   * 電話番号２
   * @return phone2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "090-1234-xxxx", required = true, value = "電話番号２")

  public String getPhone2() {
    return phone2;
  }


  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }


  public CompaniesShowResponseCompany fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * FAX
   * @return fax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03-1234-xxxx", required = true, value = "FAX")

  public String getFax() {
    return fax;
  }


  public void setFax(String fax) {
    this.fax = fax;
  }


  public CompaniesShowResponseCompany zipcode(String zipcode) {
    
    this.zipcode = zipcode;
    return this;
  }

   /**
   * 郵便番号
   * @return zipcode
  **/
  @ApiModelProperty(example = "000-0000", required = true, value = "郵便番号")

  public String getZipcode() {
    return zipcode;
  }


  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }


  public CompaniesShowResponseCompany prefectureCode(Integer prefectureCode) {
    
    this.prefectureCode = prefectureCode;
    return this;
  }

   /**
   * 都道府県コード（0: 北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄
   * @return prefectureCode
  **/
  @ApiModelProperty(example = "4", required = true, value = "都道府県コード（0: 北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄")

  public Integer getPrefectureCode() {
    return prefectureCode;
  }


  public void setPrefectureCode(Integer prefectureCode) {
    this.prefectureCode = prefectureCode;
  }


  public CompaniesShowResponseCompany streetName1(String streetName1) {
    
    this.streetName1 = streetName1;
    return this;
  }

   /**
   * 市区町村・番地
   * @return streetName1
  **/
  @ApiModelProperty(example = "ＸＸ区ＹＹ１−１−１", required = true, value = "市区町村・番地")

  public String getStreetName1() {
    return streetName1;
  }


  public void setStreetName1(String streetName1) {
    this.streetName1 = streetName1;
  }


  public CompaniesShowResponseCompany streetName2(String streetName2) {
    
    this.streetName2 = streetName2;
    return this;
  }

   /**
   * 建物名・部屋番号など
   * @return streetName2
  **/
  @ApiModelProperty(example = "ビル１Ｆ", required = true, value = "建物名・部屋番号など")

  public String getStreetName2() {
    return streetName2;
  }


  public void setStreetName2(String streetName2) {
    this.streetName2 = streetName2;
  }


  public CompaniesShowResponseCompany invoiceLayout(Integer invoiceLayout) {
    
    this.invoiceLayout = invoiceLayout;
    return this;
  }

   /**
   * レイアウト(0: レイアウト1, 1:レイアウト2, 3:封筒1, 4:レイアウト3(繰越金額欄あり), 5: 封筒2(繰越金額欄あり))
   * minimum: 0
   * maximum: 5
   * @return invoiceLayout
  **/
  @ApiModelProperty(example = "0", required = true, value = "レイアウト(0: レイアウト1, 1:レイアウト2, 3:封筒1, 4:レイアウト3(繰越金額欄あり), 5: 封筒2(繰越金額欄あり))")

  public Integer getInvoiceLayout() {
    return invoiceLayout;
  }


  public void setInvoiceLayout(Integer invoiceLayout) {
    this.invoiceLayout = invoiceLayout;
  }


  public CompaniesShowResponseCompany invoiceStyle(Integer invoiceStyle) {
    
    this.invoiceStyle = invoiceStyle;
    return this;
  }

   /**
   * スタイル(0: クラシック, 1: モダン)
   * minimum: 0
   * maximum: 1
   * @return invoiceStyle
  **/
  @ApiModelProperty(example = "0", required = true, value = "スタイル(0: クラシック, 1: モダン)")

  public Integer getInvoiceStyle() {
    return invoiceStyle;
  }


  public void setInvoiceStyle(Integer invoiceStyle) {
    this.invoiceStyle = invoiceStyle;
  }


  public CompaniesShowResponseCompany amountFraction(Integer amountFraction) {
    
    this.amountFraction = amountFraction;
    return this;
  }

   /**
   * 金額端数処理方法（0: 切り捨て、1: 切り上げ、2: 四捨五入）
   * minimum: 0
   * maximum: 2
   * @return amountFraction
  **/
  @ApiModelProperty(example = "0", required = true, value = "金額端数処理方法（0: 切り捨て、1: 切り上げ、2: 四捨五入）")

  public Integer getAmountFraction() {
    return amountFraction;
  }


  public void setAmountFraction(Integer amountFraction) {
    this.amountFraction = amountFraction;
  }


  public CompaniesShowResponseCompany industryClass(IndustryClassEnum industryClass) {
    
    this.industryClass = industryClass;
    return this;
  }

   /**
   * 種別（agriculture_forestry_fisheries_ore: 農林水産業/鉱業、construction: 建設、manufacturing_processing: 製造/加工、it: IT、transportation_logistics: 運輸/物流、retail_wholesale: 小売/卸売、finance_insurance: 金融/保険、real_estate_rental: 不動産/レンタル、profession: 士業/学術/専門技術サービス、design_production: デザイン/制作、food: 飲食、leisure_entertainment: レジャー/娯楽、lifestyle: 生活関連サービス、education: 教育/学習支援、medical_welfare: 医療/福祉、other_services: その他サービス、other: その他）
   * @return industryClass
  **/
  @ApiModelProperty(example = "agriculture_forestry_fisheries_ore", required = true, value = "種別（agriculture_forestry_fisheries_ore: 農林水産業/鉱業、construction: 建設、manufacturing_processing: 製造/加工、it: IT、transportation_logistics: 運輸/物流、retail_wholesale: 小売/卸売、finance_insurance: 金融/保険、real_estate_rental: 不動産/レンタル、profession: 士業/学術/専門技術サービス、design_production: デザイン/制作、food: 飲食、leisure_entertainment: レジャー/娯楽、lifestyle: 生活関連サービス、education: 教育/学習支援、medical_welfare: 医療/福祉、other_services: その他サービス、other: その他）")

  public IndustryClassEnum getIndustryClass() {
    return industryClass;
  }


  public void setIndustryClass(IndustryClassEnum industryClass) {
    this.industryClass = industryClass;
  }


  public CompaniesShowResponseCompany industryCode(IndustryCodeEnum industryCode) {
    
    this.industryCode = industryCode;
    return this;
  }

   /**
   * コード（transport_delivery: 輸送業/配送業、delivery: バイク便等の配達業、other_transportation_logistics: その他の運輸業、物流業）
   * @return industryCode
  **/
  @ApiModelProperty(example = "transport_delivery", required = true, value = "コード（transport_delivery: 輸送業/配送業、delivery: バイク便等の配達業、other_transportation_logistics: その他の運輸業、物流業）")

  public IndustryCodeEnum getIndustryCode() {
    return industryCode;
  }


  public void setIndustryCode(IndustryCodeEnum industryCode) {
    this.industryCode = industryCode;
  }


  public CompaniesShowResponseCompany workflowSetting(WorkflowSettingEnum workflowSetting) {
    
    this.workflowSetting = workflowSetting;
    return this;
  }

   /**
   * 仕訳承認フロー（enable: 有効、 disable: 無効）
   * @return workflowSetting
  **/
  @ApiModelProperty(example = "disabled", required = true, value = "仕訳承認フロー（enable: 有効、 disable: 無効）")

  public WorkflowSettingEnum getWorkflowSetting() {
    return workflowSetting;
  }


  public void setWorkflowSetting(WorkflowSettingEnum workflowSetting) {
    this.workflowSetting = workflowSetting;
  }


  public CompaniesShowResponseCompany usePartnerCode(Boolean usePartnerCode) {
    
    this.usePartnerCode = usePartnerCode;
    return this;
  }

   /**
   * 取引先コードの利用設定（true: 有効、 false: 無効）
   * @return usePartnerCode
  **/
  @ApiModelProperty(example = "true", required = true, value = "取引先コードの利用設定（true: 有効、 false: 無効）")

  public Boolean getUsePartnerCode() {
    return usePartnerCode;
  }


  public void setUsePartnerCode(Boolean usePartnerCode) {
    this.usePartnerCode = usePartnerCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompaniesShowResponseCompany companiesShowResponseCompany = (CompaniesShowResponseCompany) o;
    return Objects.equals(this.id, companiesShowResponseCompany.id) &&
        Objects.equals(this.name, companiesShowResponseCompany.name) &&
        Objects.equals(this.nameKana, companiesShowResponseCompany.nameKana) &&
        Objects.equals(this.displayName, companiesShowResponseCompany.displayName) &&
        Objects.equals(this.taxAtSourceCalcType, companiesShowResponseCompany.taxAtSourceCalcType) &&
        Objects.equals(this.contactName, companiesShowResponseCompany.contactName) &&
        Objects.equals(this.headCount, companiesShowResponseCompany.headCount) &&
        Objects.equals(this.corporateNumber, companiesShowResponseCompany.corporateNumber) &&
        Objects.equals(this.txnNumberFormat, companiesShowResponseCompany.txnNumberFormat) &&
        Objects.equals(this.defaultWalletAccountId, companiesShowResponseCompany.defaultWalletAccountId) &&
        Objects.equals(this.privateSettlement, companiesShowResponseCompany.privateSettlement) &&
        Objects.equals(this.minusFormat, companiesShowResponseCompany.minusFormat) &&
        Objects.equals(this.role, companiesShowResponseCompany.role) &&
        Objects.equals(this.phone1, companiesShowResponseCompany.phone1) &&
        Objects.equals(this.phone2, companiesShowResponseCompany.phone2) &&
        Objects.equals(this.fax, companiesShowResponseCompany.fax) &&
        Objects.equals(this.zipcode, companiesShowResponseCompany.zipcode) &&
        Objects.equals(this.prefectureCode, companiesShowResponseCompany.prefectureCode) &&
        Objects.equals(this.streetName1, companiesShowResponseCompany.streetName1) &&
        Objects.equals(this.streetName2, companiesShowResponseCompany.streetName2) &&
        Objects.equals(this.invoiceLayout, companiesShowResponseCompany.invoiceLayout) &&
        Objects.equals(this.invoiceStyle, companiesShowResponseCompany.invoiceStyle) &&
        Objects.equals(this.amountFraction, companiesShowResponseCompany.amountFraction) &&
        Objects.equals(this.industryClass, companiesShowResponseCompany.industryClass) &&
        Objects.equals(this.industryCode, companiesShowResponseCompany.industryCode) &&
        Objects.equals(this.workflowSetting, companiesShowResponseCompany.workflowSetting) &&
        Objects.equals(this.usePartnerCode, companiesShowResponseCompany.usePartnerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, nameKana, displayName, taxAtSourceCalcType, contactName, headCount, corporateNumber, txnNumberFormat, defaultWalletAccountId, privateSettlement, minusFormat, role, phone1, phone2, fax, zipcode, prefectureCode, streetName1, streetName2, invoiceLayout, invoiceStyle, amountFraction, industryClass, industryCode, workflowSetting, usePartnerCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompaniesShowResponseCompany {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameKana: ").append(toIndentedString(nameKana)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    taxAtSourceCalcType: ").append(toIndentedString(taxAtSourceCalcType)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    headCount: ").append(toIndentedString(headCount)).append("\n");
    sb.append("    corporateNumber: ").append(toIndentedString(corporateNumber)).append("\n");
    sb.append("    txnNumberFormat: ").append(toIndentedString(txnNumberFormat)).append("\n");
    sb.append("    defaultWalletAccountId: ").append(toIndentedString(defaultWalletAccountId)).append("\n");
    sb.append("    privateSettlement: ").append(toIndentedString(privateSettlement)).append("\n");
    sb.append("    minusFormat: ").append(toIndentedString(minusFormat)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    prefectureCode: ").append(toIndentedString(prefectureCode)).append("\n");
    sb.append("    streetName1: ").append(toIndentedString(streetName1)).append("\n");
    sb.append("    streetName2: ").append(toIndentedString(streetName2)).append("\n");
    sb.append("    invoiceLayout: ").append(toIndentedString(invoiceLayout)).append("\n");
    sb.append("    invoiceStyle: ").append(toIndentedString(invoiceStyle)).append("\n");
    sb.append("    amountFraction: ").append(toIndentedString(amountFraction)).append("\n");
    sb.append("    industryClass: ").append(toIndentedString(industryClass)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    workflowSetting: ").append(toIndentedString(workflowSetting)).append("\n");
    sb.append("    usePartnerCode: ").append(toIndentedString(usePartnerCode)).append("\n");
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

