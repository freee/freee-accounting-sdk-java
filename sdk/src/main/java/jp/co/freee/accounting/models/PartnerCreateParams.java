/*
 * freee API
 *  <h1 id=\"freee_api\">freee API</h1> <hr /> <h2 id=\"start_guide\">スタートガイド</h2>  <p>freee API開発がはじめての方は<a href=\"https://developer.freee.co.jp/getting-started\">freee API スタートガイド</a>を参照してください。</p>  <hr /> <h2 id=\"specification\">仕様</h2>  <pre><code>【重要】会計freee APIの新バージョンについて 2020年12月まで、2つのバージョンが利用できる状態です。古いものは2020年12月に利用不可となります。<br> 新しいAPIを利用するにはリクエストヘッダーに以下を指定します。 X-Api-Version: 2020-06-15<br> 指定がない場合は2020年12月に廃止予定のAPIを利用することとなります。<br> 【重要】APIのバージョン指定をせずに利用し続ける場合 2020年12月に新しいバージョンのAPIに自動的に切り替わります。 詳細は、<a href=\"https://developer.freee.co.jp/release-note/2948\" target=\"_blank\">リリースノート</a>をご覧ください。<br> 旧バージョンのAPIリファレンスを確認したい場合は、<a href=\"https://freee.github.io/freee-api-schema/\" target=\"_blank\">旧バージョンのAPIリファレンスページ</a>をご覧ください。 </code></pre>  <h3 id=\"api_endpoint\">APIエンドポイント</h3>  <p>https://api.freee.co.jp/ (httpsのみ)</p>  <h3 id=\"about_authorize\">認証について</h3> <p>OAuth2.0を利用します。詳細は<a href=\"https://developer.freee.co.jp/docs\" target=\"_blank\">ドキュメントの認証</a>パートを参照してください。</p>  <h3 id=\"data_format\">データフォーマット</h3>  <p>リクエスト、レスポンスともにJSON形式をサポートしていますが、詳細は、API毎の説明欄（application/jsonなど）を確認してください。</p>  <h3 id=\"compatibility\">後方互換性ありの変更</h3>  <p>freeeでは、APIを改善していくために以下のような変更は後方互換性ありとして通知なく変更を入れることがあります。アプリケーション実装者は以下を踏まえて開発を行ってください。</p>  <ul> <li>新しいAPIリソース・エンドポイントの追加</li> <li>既存のAPIに対して必須ではない新しいリクエストパラメータの追加</li> <li>既存のAPIレスポンスに対する新しいプロパティの追加</li> <li>既存のAPIレスポンスに対するプロパティの順番の入れ変え</li> <li>keyとなっているidやcodeの長さの変更（長くする）</li> </ul>  <h3 id=\"common_response_header\">共通レスポンスヘッダー</h3>  <p>すべてのAPIのレスポンスには以下のHTTPヘッダーが含まれます。</p>  <ul> <li> <p>X-Freee-Request-ID</p> <ul> <li>各リクエスト毎に発行されるID</li> </ul> </li> </ul>  <h3 id=\"common_error_response\">共通エラーレスポンス</h3>  <ul> <li> <p>ステータスコードはレスポンス内のJSONに含まれる他、HTTPヘッダにも含まれる</p> </li> <li> <p>一部のエラーレスポンスにはエラーコードが含まれます。<br>詳細は、<a href=\"https://developer.freee.co.jp/tips/faq/40x-checkpoint\">HTTPステータスコード400台エラー時のチェックポイント</a>を参照してください</p> </li> <p>type</p>  <ul> <li>status : HTTPステータスコードの説明</li>  <li>validation : エラーの詳細の説明（開発者向け）</li> </ul> </li> </ul>  <p>レスポンスの例</p>  <pre><code>  {     &quot;status_code&quot; : 400,     &quot;errors&quot; : [       {         &quot;type&quot; : &quot;status&quot;,         &quot;messages&quot; : [&quot;不正なリクエストです。&quot;]       },       {         &quot;type&quot; : &quot;validation&quot;,         &quot;messages&quot; : [&quot;Date は不正な日付フォーマットです。入力例：2013-01-01&quot;]       }     ]   }</code></pre>  </br>  <h3 id=\"api_rate_limit\">API使用制限</h3>    <p>freeeは一定期間に過度のアクセスを検知した場合、APIアクセスをコントロールする場合があります。</p>   <p>その際のhttp status codeは403となります。制限がかかってから10分程度が過ぎると再度使用することができるようになります。</p>  <h4 id=\"reports_api_endpoint\">/reportsエンドポイント</h4>  <p>freeeは/reportsエンドポイントに対して1秒間に10以上のアクセスを検知した場合、APIアクセスをコントロールする場合があります。その際のhttp status codeは429（too many requests）となります。</p>  <p>レスポンスボディのmetaプロパティに以下を含めます。</p>  <ul>   <li>設定されている上限値</li>   <li>上限に達するまでの使用可能回数</li>   <li>（上限値に達した場合）使用回数がリセットされる時刻</li> </ul>  <h3 id=\"plan_api_rate_limit\">プラン別のAPI Rate Limit</h3>   <table border=\"1\">     <tbody>       <tr>         <th style=\"padding: 10px\"><strong>会計freeeプラン名</strong></th>         <th style=\"padding: 10px\"><strong>事業所とアプリケーション毎に1日でのAPIコール数</strong></th>       </tr>       <tr>         <td style=\"padding: 10px\">エンタープライズ</td>         <td style=\"padding: 10px\">10,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">プロフェッショナル</td>         <td style=\"padding: 10px\">5,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">ベーシック</td>         <td style=\"padding: 10px\">3,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">ミニマム</td>         <td style=\"padding: 10px\">3,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">上記以外</td>         <td style=\"padding: 10px\">3,000</td>       </tr>     </tbody>   </table>  <h3 id=\"webhook\">Webhookについて</h3>  <p>詳細は<a href=\"https://developer.freee.co.jp/docs/accounting/webhook\" target=\"_blank\">会計Webhook概要</a>を参照してください。</p>  <hr /> <h2 id=\"contact\">連絡先</h2>  <p>ご不明点、ご要望等は <a href=\"https://support.freee.co.jp/hc/ja/requests/new\">freee サポートデスクへのお問い合わせフォーム</a> からご連絡ください。</p> <hr />&copy; Since 2013 freee K.K.
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
import jp.co.freee.accounting.models.PartnerCreateParamsInvoicePaymentTermAttributes;
import jp.co.freee.accounting.models.PartnerCreateParamsPartnerBankAccountAttributes;
import jp.co.freee.accounting.models.PartnerCreateParamsPartnerDocSettingAttributes;

/**
 * PartnerCreateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartnerCreateParams {
  public static final String SERIALIZED_NAME_ADDRESS_ATTRIBUTES = "address_attributes";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ATTRIBUTES)
  private PartnerCreateParamsAddressAttributes addressAttributes;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  /**
   * 地域（JP: 国内、ZZ:国外）
   */
  @JsonAdapter(CountryCodeEnum.Adapter.class)
  public enum CountryCodeEnum {
    JP("JP"),
    
    ZZ("ZZ");

    private String value;

    CountryCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountryCodeEnum fromValue(String value) {
      for (CountryCodeEnum b : CountryCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CountryCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountryCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountryCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CountryCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private CountryCodeEnum countryCode;

  public static final String SERIALIZED_NAME_DEFAULT_TITLE = "default_title";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TITLE)
  private String defaultTitle;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_INVOICE_PAYMENT_TERM_ATTRIBUTES = "invoice_payment_term_attributes";
  @SerializedName(SERIALIZED_NAME_INVOICE_PAYMENT_TERM_ATTRIBUTES)
  private PartnerCreateParamsInvoicePaymentTermAttributes invoicePaymentTermAttributes;

  public static final String SERIALIZED_NAME_LONG_NAME = "long_name";
  @SerializedName(SERIALIZED_NAME_LONG_NAME)
  private String longName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_KANA = "name_kana";
  @SerializedName(SERIALIZED_NAME_NAME_KANA)
  private String nameKana;

  /**
   * 事業所種別（null: 未設定、1: 法人、2: 個人）
   */
  @JsonAdapter(OrgCodeEnum.Adapter.class)
  public enum OrgCodeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    OrgCodeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrgCodeEnum fromValue(Integer value) {
      for (OrgCodeEnum b : OrgCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrgCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrgCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrgCodeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return OrgCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORG_CODE = "org_code";
  @SerializedName(SERIALIZED_NAME_ORG_CODE)
  private OrgCodeEnum orgCode;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES = "partner_bank_account_attributes";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES)
  private PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes;

  public static final String SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES = "partner_doc_setting_attributes";
  @SerializedName(SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES)
  private PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes;

  public static final String SERIALIZED_NAME_PAYER_WALLETABLE_ID = "payer_walletable_id";
  @SerializedName(SERIALIZED_NAME_PAYER_WALLETABLE_ID)
  private Integer payerWalletableId;

  public static final String SERIALIZED_NAME_PAYMENT_TERM_ATTRIBUTES = "payment_term_attributes";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERM_ATTRIBUTES)
  private PartnerCreateParamsInvoicePaymentTermAttributes paymentTermAttributes;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_SHORTCUT1 = "shortcut1";
  @SerializedName(SERIALIZED_NAME_SHORTCUT1)
  private String shortcut1;

  public static final String SERIALIZED_NAME_SHORTCUT2 = "shortcut2";
  @SerializedName(SERIALIZED_NAME_SHORTCUT2)
  private String shortcut2;

  /**
   * 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)
   */
  @JsonAdapter(TransferFeeHandlingSideEnum.Adapter.class)
  public enum TransferFeeHandlingSideEnum {
    PAYER("payer"),
    
    PAYEE("payee");

    private String value;

    TransferFeeHandlingSideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransferFeeHandlingSideEnum fromValue(String value) {
      for (TransferFeeHandlingSideEnum b : TransferFeeHandlingSideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransferFeeHandlingSideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransferFeeHandlingSideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransferFeeHandlingSideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransferFeeHandlingSideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSFER_FEE_HANDLING_SIDE = "transfer_fee_handling_side";
  @SerializedName(SERIALIZED_NAME_TRANSFER_FEE_HANDLING_SIDE)
  private TransferFeeHandlingSideEnum transferFeeHandlingSide;


  public PartnerCreateParams addressAttributes(PartnerCreateParamsAddressAttributes addressAttributes) {
    
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


  public PartnerCreateParams code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 取引先コード（取引先コードの利用を有効にしている場合は、codeの指定は必須です。）
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "code001", value = "取引先コード（取引先コードの利用を有効にしている場合は、codeの指定は必須です。）")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public PartnerCreateParams companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 事業所ID
   * minimum: 1
   * maximum: 2147483647
   * @return companyId
  **/
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public PartnerCreateParams contactName(String contactName) {
    
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


  public PartnerCreateParams countryCode(CountryCodeEnum countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 地域（JP: 国内、ZZ:国外）
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JP", value = "地域（JP: 国内、ZZ:国外）")

  public CountryCodeEnum getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(CountryCodeEnum countryCode) {
    this.countryCode = countryCode;
  }


  public PartnerCreateParams defaultTitle(String defaultTitle) {
    
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


  public PartnerCreateParams email(String email) {
    
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


  public PartnerCreateParams invoicePaymentTermAttributes(PartnerCreateParamsInvoicePaymentTermAttributes invoicePaymentTermAttributes) {
    
    this.invoicePaymentTermAttributes = invoicePaymentTermAttributes;
    return this;
  }

   /**
   * Get invoicePaymentTermAttributes
   * @return invoicePaymentTermAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsInvoicePaymentTermAttributes getInvoicePaymentTermAttributes() {
    return invoicePaymentTermAttributes;
  }


  public void setInvoicePaymentTermAttributes(PartnerCreateParamsInvoicePaymentTermAttributes invoicePaymentTermAttributes) {
    this.invoicePaymentTermAttributes = invoicePaymentTermAttributes;
  }


  public PartnerCreateParams longName(String longName) {
    
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


  public PartnerCreateParams name(String name) {
    
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


  public PartnerCreateParams nameKana(String nameKana) {
    
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


  public PartnerCreateParams orgCode(OrgCodeEnum orgCode) {
    
    this.orgCode = orgCode;
    return this;
  }

   /**
   * 事業所種別（null: 未設定、1: 法人、2: 個人）
   * @return orgCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "事業所種別（null: 未設定、1: 法人、2: 個人）")

  public OrgCodeEnum getOrgCode() {
    return orgCode;
  }


  public void setOrgCode(OrgCodeEnum orgCode) {
    this.orgCode = orgCode;
  }


  public PartnerCreateParams partnerBankAccountAttributes(PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes) {
    
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


  public PartnerCreateParams partnerDocSettingAttributes(PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes) {
    
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


  public PartnerCreateParams payerWalletableId(Integer payerWalletableId) {
    
    this.payerWalletableId = payerWalletableId;
    return this;
  }

   /**
   * 振込元口座ID（一括振込ファイル用）:（walletableのtypeが&#39;bank_account&#39;のidのみ指定できます。また、未設定にする場合は、nullを指定してください。）
   * minimum: 1
   * maximum: 2147483647
   * @return payerWalletableId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "振込元口座ID（一括振込ファイル用）:（walletableのtypeが'bank_account'のidのみ指定できます。また、未設定にする場合は、nullを指定してください。）")

  public Integer getPayerWalletableId() {
    return payerWalletableId;
  }


  public void setPayerWalletableId(Integer payerWalletableId) {
    this.payerWalletableId = payerWalletableId;
  }


  public PartnerCreateParams paymentTermAttributes(PartnerCreateParamsInvoicePaymentTermAttributes paymentTermAttributes) {
    
    this.paymentTermAttributes = paymentTermAttributes;
    return this;
  }

   /**
   * Get paymentTermAttributes
   * @return paymentTermAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsInvoicePaymentTermAttributes getPaymentTermAttributes() {
    return paymentTermAttributes;
  }


  public void setPaymentTermAttributes(PartnerCreateParamsInvoicePaymentTermAttributes paymentTermAttributes) {
    this.paymentTermAttributes = paymentTermAttributes;
  }


  public PartnerCreateParams phone(String phone) {
    
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


  public PartnerCreateParams shortcut1(String shortcut1) {
    
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


  public PartnerCreateParams shortcut2(String shortcut2) {
    
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


  public PartnerCreateParams transferFeeHandlingSide(TransferFeeHandlingSideEnum transferFeeHandlingSide) {
    
    this.transferFeeHandlingSide = transferFeeHandlingSide;
    return this;
  }

   /**
   * 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)
   * @return transferFeeHandlingSide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payer", value = "振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)")

  public TransferFeeHandlingSideEnum getTransferFeeHandlingSide() {
    return transferFeeHandlingSide;
  }


  public void setTransferFeeHandlingSide(TransferFeeHandlingSideEnum transferFeeHandlingSide) {
    this.transferFeeHandlingSide = transferFeeHandlingSide;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerCreateParams partnerCreateParams = (PartnerCreateParams) o;
    return Objects.equals(this.addressAttributes, partnerCreateParams.addressAttributes) &&
        Objects.equals(this.code, partnerCreateParams.code) &&
        Objects.equals(this.companyId, partnerCreateParams.companyId) &&
        Objects.equals(this.contactName, partnerCreateParams.contactName) &&
        Objects.equals(this.countryCode, partnerCreateParams.countryCode) &&
        Objects.equals(this.defaultTitle, partnerCreateParams.defaultTitle) &&
        Objects.equals(this.email, partnerCreateParams.email) &&
        Objects.equals(this.invoicePaymentTermAttributes, partnerCreateParams.invoicePaymentTermAttributes) &&
        Objects.equals(this.longName, partnerCreateParams.longName) &&
        Objects.equals(this.name, partnerCreateParams.name) &&
        Objects.equals(this.nameKana, partnerCreateParams.nameKana) &&
        Objects.equals(this.orgCode, partnerCreateParams.orgCode) &&
        Objects.equals(this.partnerBankAccountAttributes, partnerCreateParams.partnerBankAccountAttributes) &&
        Objects.equals(this.partnerDocSettingAttributes, partnerCreateParams.partnerDocSettingAttributes) &&
        Objects.equals(this.payerWalletableId, partnerCreateParams.payerWalletableId) &&
        Objects.equals(this.paymentTermAttributes, partnerCreateParams.paymentTermAttributes) &&
        Objects.equals(this.phone, partnerCreateParams.phone) &&
        Objects.equals(this.shortcut1, partnerCreateParams.shortcut1) &&
        Objects.equals(this.shortcut2, partnerCreateParams.shortcut2) &&
        Objects.equals(this.transferFeeHandlingSide, partnerCreateParams.transferFeeHandlingSide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressAttributes, code, companyId, contactName, countryCode, defaultTitle, email, invoicePaymentTermAttributes, longName, name, nameKana, orgCode, partnerBankAccountAttributes, partnerDocSettingAttributes, payerWalletableId, paymentTermAttributes, phone, shortcut1, shortcut2, transferFeeHandlingSide);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCreateParams {\n");
    sb.append("    addressAttributes: ").append(toIndentedString(addressAttributes)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    defaultTitle: ").append(toIndentedString(defaultTitle)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    invoicePaymentTermAttributes: ").append(toIndentedString(invoicePaymentTermAttributes)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameKana: ").append(toIndentedString(nameKana)).append("\n");
    sb.append("    orgCode: ").append(toIndentedString(orgCode)).append("\n");
    sb.append("    partnerBankAccountAttributes: ").append(toIndentedString(partnerBankAccountAttributes)).append("\n");
    sb.append("    partnerDocSettingAttributes: ").append(toIndentedString(partnerDocSettingAttributes)).append("\n");
    sb.append("    payerWalletableId: ").append(toIndentedString(payerWalletableId)).append("\n");
    sb.append("    paymentTermAttributes: ").append(toIndentedString(paymentTermAttributes)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    shortcut1: ").append(toIndentedString(shortcut1)).append("\n");
    sb.append("    shortcut2: ").append(toIndentedString(shortcut2)).append("\n");
    sb.append("    transferFeeHandlingSide: ").append(toIndentedString(transferFeeHandlingSide)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

