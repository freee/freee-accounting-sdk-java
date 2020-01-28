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
import jp.co.freee.accounting.models.InvoicesCreateParamsInvoiceContents;

/**
 * InvoicesCreateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class InvoicesCreateParams {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_PARTNER_CODE = "partner_code";
  @SerializedName(SERIALIZED_NAME_PARTNER_CODE)
  private String partnerCode;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoice_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private String dueDate;

  public static final String SERIALIZED_NAME_BOOKING_DATE = "booking_date";
  @SerializedName(SERIALIZED_NAME_BOOKING_DATE)
  private String bookingDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * 請求書ステータス  (draft: 下書き (デフォルト), issue: 発行(請求先ワークフローを利用している場合は指定できません))
   */
  @JsonAdapter(InvoiceStatusEnum.Adapter.class)
  public enum InvoiceStatusEnum {
    DRAFT("draft"),
    
    ISSUE("issue");

    private String value;

    InvoiceStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InvoiceStatusEnum fromValue(String value) {
      for (InvoiceStatusEnum b : InvoiceStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InvoiceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InvoiceStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InvoiceStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InvoiceStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoice_status";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private InvoiceStatusEnum invoiceStatus;

  public static final String SERIALIZED_NAME_PARTNER_NAME = "partner_name";
  @SerializedName(SERIALIZED_NAME_PARTNER_NAME)
  private String partnerName;

  public static final String SERIALIZED_NAME_PARTNER_TITLE = "partner_title";
  @SerializedName(SERIALIZED_NAME_PARTNER_TITLE)
  private String partnerTitle;

  public static final String SERIALIZED_NAME_PARTNER_CONTACT_INFO = "partner_contact_info";
  @SerializedName(SERIALIZED_NAME_PARTNER_CONTACT_INFO)
  private String partnerContactInfo;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_COMPANY_ZIPCODE = "company_zipcode";
  @SerializedName(SERIALIZED_NAME_COMPANY_ZIPCODE)
  private String companyZipcode;

  public static final String SERIALIZED_NAME_COMPANY_PREFECTURE_CODE = "company_prefecture_code";
  @SerializedName(SERIALIZED_NAME_COMPANY_PREFECTURE_CODE)
  private Integer companyPrefectureCode;

  public static final String SERIALIZED_NAME_COMPANY_ADDRESS1 = "company_address1";
  @SerializedName(SERIALIZED_NAME_COMPANY_ADDRESS1)
  private String companyAddress1;

  public static final String SERIALIZED_NAME_COMPANY_ADDRESS2 = "company_address2";
  @SerializedName(SERIALIZED_NAME_COMPANY_ADDRESS2)
  private String companyAddress2;

  public static final String SERIALIZED_NAME_COMPANY_CONTACT_INFO = "company_contact_info";
  @SerializedName(SERIALIZED_NAME_COMPANY_CONTACT_INFO)
  private String companyContactInfo;

  /**
   * 支払方法 (振込: transfer, 引き落とし: direct_debit)
   */
  @JsonAdapter(PaymentTypeEnum.Adapter.class)
  public enum PaymentTypeEnum {
    TRANSFER("transfer"),
    
    DIRECT_DEBIT("direct_debit");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentTypeEnum fromValue(String value) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private PaymentTypeEnum paymentType;

  public static final String SERIALIZED_NAME_PAYMENT_BANK_INFO = "payment_bank_info";
  @SerializedName(SERIALIZED_NAME_PAYMENT_BANK_INFO)
  private String paymentBankInfo;

  /**
   * 振込専用口座の利用(利用しない: not_use(デフォルト), 利用する: use)
   */
  @JsonAdapter(UseVirtualTransferAccountEnum.Adapter.class)
  public enum UseVirtualTransferAccountEnum {
    NOT_USE("not_use"),
    
    USE("use");

    private String value;

    UseVirtualTransferAccountEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UseVirtualTransferAccountEnum fromValue(String value) {
      for (UseVirtualTransferAccountEnum b : UseVirtualTransferAccountEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UseVirtualTransferAccountEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UseVirtualTransferAccountEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UseVirtualTransferAccountEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UseVirtualTransferAccountEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USE_VIRTUAL_TRANSFER_ACCOUNT = "use_virtual_transfer_account";
  @SerializedName(SERIALIZED_NAME_USE_VIRTUAL_TRANSFER_ACCOUNT)
  private UseVirtualTransferAccountEnum useVirtualTransferAccount;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  /**
   * レイアウト(default_classic: レイアウト１/クラシック (デフォルト), standard_classic: レイアウト２/クラシック, envelope_classic: 封筒１/クラシック, carried_forward_standard_classic: レイアウト３（繰越金額欄あり）/クラシック, carried_forward_envelope_classic: 封筒２（繰越金額欄あり）/クラシック, default_modern: レイアウト１/モダン, standard_modern: レイアウト２/モダン, envelope_modern: 封筒/モダン)
   */
  @JsonAdapter(InvoiceLayoutEnum.Adapter.class)
  public enum InvoiceLayoutEnum {
    DEFAULT_CLASSIC("default_classic"),
    
    STANDARD_CLASSIC("standard_classic"),
    
    ENVELOPE_CLASSIC("envelope_classic"),
    
    CARRIED_FORWARD_STANDARD_CLASSIC("carried_forward_standard_classic"),
    
    CARRIED_FORWARD_ENVELOPE_CLASSIC("carried_forward_envelope_classic"),
    
    DEFAULT_MODERN("default_modern"),
    
    STANDARD_MODERN("standard_modern"),
    
    ENVELOPE_MODERN("envelope_modern");

    private String value;

    InvoiceLayoutEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InvoiceLayoutEnum fromValue(String value) {
      for (InvoiceLayoutEnum b : InvoiceLayoutEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InvoiceLayoutEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InvoiceLayoutEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InvoiceLayoutEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InvoiceLayoutEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INVOICE_LAYOUT = "invoice_layout";
  @SerializedName(SERIALIZED_NAME_INVOICE_LAYOUT)
  private InvoiceLayoutEnum invoiceLayout;

  /**
   * 請求書の消費税計算方法(inclusive: 内税表示, exclusive: 外税表示 (デフォルト))
   */
  @JsonAdapter(TaxEntryMethodEnum.Adapter.class)
  public enum TaxEntryMethodEnum {
    INCLUSIVE("inclusive"),
    
    EXCLUSIVE("exclusive");

    private String value;

    TaxEntryMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxEntryMethodEnum fromValue(String value) {
      for (TaxEntryMethodEnum b : TaxEntryMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TaxEntryMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxEntryMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxEntryMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaxEntryMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TAX_ENTRY_METHOD = "tax_entry_method";
  @SerializedName(SERIALIZED_NAME_TAX_ENTRY_METHOD)
  private TaxEntryMethodEnum taxEntryMethod;

  public static final String SERIALIZED_NAME_INVOICE_CONTENTS = "invoice_contents";
  @SerializedName(SERIALIZED_NAME_INVOICE_CONTENTS)
  private List<InvoicesCreateParamsInvoiceContents> invoiceContents = null;


  public InvoicesCreateParams companyId(Integer companyId) {
    
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


  public InvoicesCreateParams issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * 請求日 (yyyy-mm-dd)
   * @return issueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-01-01", value = "請求日 (yyyy-mm-dd)")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public InvoicesCreateParams partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 取引先ID
   * minimum: 1
   * maximum: 999999999999
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201", value = "取引先ID")

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }


  public InvoicesCreateParams partnerCode(String partnerCode) {
    
    this.partnerCode = partnerCode;
    return this;
  }

   /**
   * 取引先コード
   * @return partnerCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "code001", value = "取引先コード")

  public String getPartnerCode() {
    return partnerCode;
  }


  public void setPartnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
  }


  public InvoicesCreateParams invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * 請求書番号 (デフォルト: 自動採番されます)
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A001", value = "請求書番号 (デフォルト: 自動採番されます)")

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public InvoicesCreateParams title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * タイトル (デフォルト: 請求書)
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "請求書", value = "タイトル (デフォルト: 請求書)")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public InvoicesCreateParams dueDate(String dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * 期日 (yyyy-mm-dd)
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-02-28", value = "期日 (yyyy-mm-dd)")

  public String getDueDate() {
    return dueDate;
  }


  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  public InvoicesCreateParams bookingDate(String bookingDate) {
    
    this.bookingDate = bookingDate;
    return this;
  }

   /**
   * 売上計上日
   * @return bookingDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-01-01", value = "売上計上日")

  public String getBookingDate() {
    return bookingDate;
  }


  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }


  public InvoicesCreateParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 概要
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "８月分請求書", value = "概要")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InvoicesCreateParams invoiceStatus(InvoiceStatusEnum invoiceStatus) {
    
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * 請求書ステータス  (draft: 下書き (デフォルト), issue: 発行(請求先ワークフローを利用している場合は指定できません))
   * @return invoiceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "請求書ステータス  (draft: 下書き (デフォルト), issue: 発行(請求先ワークフローを利用している場合は指定できません))")

  public InvoiceStatusEnum getInvoiceStatus() {
    return invoiceStatus;
  }


  public void setInvoiceStatus(InvoiceStatusEnum invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  public InvoicesCreateParams partnerName(String partnerName) {
    
    this.partnerName = partnerName;
    return this;
  }

   /**
   * 取引先名
   * @return partnerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freeeパートナー", value = "取引先名")

  public String getPartnerName() {
    return partnerName;
  }


  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }


  public InvoicesCreateParams partnerTitle(String partnerTitle) {
    
    this.partnerTitle = partnerTitle;
    return this;
  }

   /**
   * 敬称（御中、様、(空白)の3つから選択）
   * @return partnerTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "御中", value = "敬称（御中、様、(空白)の3つから選択）")

  public String getPartnerTitle() {
    return partnerTitle;
  }


  public void setPartnerTitle(String partnerTitle) {
    this.partnerTitle = partnerTitle;
  }


  public InvoicesCreateParams partnerContactInfo(String partnerContactInfo) {
    
    this.partnerContactInfo = partnerContactInfo;
    return this;
  }

   /**
   * 取引先担当者名
   * @return partnerContactInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "営業担当", value = "取引先担当者名")

  public String getPartnerContactInfo() {
    return partnerContactInfo;
  }


  public void setPartnerContactInfo(String partnerContactInfo) {
    this.partnerContactInfo = partnerContactInfo;
  }


  public InvoicesCreateParams companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 事業所名 (デフォルトは事業所設定情報が補完されます)
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freee株式会社", value = "事業所名 (デフォルトは事業所設定情報が補完されます)")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public InvoicesCreateParams companyZipcode(String companyZipcode) {
    
    this.companyZipcode = companyZipcode;
    return this;
  }

   /**
   * 郵便番号 (デフォルトは事業所設定情報が補完されます)
   * @return companyZipcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000-0000", value = "郵便番号 (デフォルトは事業所設定情報が補完されます)")

  public String getCompanyZipcode() {
    return companyZipcode;
  }


  public void setCompanyZipcode(String companyZipcode) {
    this.companyZipcode = companyZipcode;
  }


  public InvoicesCreateParams companyPrefectureCode(Integer companyPrefectureCode) {
    
    this.companyPrefectureCode = companyPrefectureCode;
    return this;
  }

   /**
   * 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 ) (デフォルトは事業所設定情報が補完されます)
   * minimum: 0
   * maximum: 46
   * @return companyPrefectureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 ) (デフォルトは事業所設定情報が補完されます)")

  public Integer getCompanyPrefectureCode() {
    return companyPrefectureCode;
  }


  public void setCompanyPrefectureCode(Integer companyPrefectureCode) {
    this.companyPrefectureCode = companyPrefectureCode;
  }


  public InvoicesCreateParams companyAddress1(String companyAddress1) {
    
    this.companyAddress1 = companyAddress1;
    return this;
  }

   /**
   * 市区町村・番地 (デフォルトは事業所設定情報が補完されます)
   * @return companyAddress1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ＸＸ区ＹＹ１−１−１", value = "市区町村・番地 (デフォルトは事業所設定情報が補完されます)")

  public String getCompanyAddress1() {
    return companyAddress1;
  }


  public void setCompanyAddress1(String companyAddress1) {
    this.companyAddress1 = companyAddress1;
  }


  public InvoicesCreateParams companyAddress2(String companyAddress2) {
    
    this.companyAddress2 = companyAddress2;
    return this;
  }

   /**
   * 建物名・部屋番号など (デフォルトは事業所設定情報が補完されます)
   * @return companyAddress2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ビル1F", value = "建物名・部屋番号など (デフォルトは事業所設定情報が補完されます)")

  public String getCompanyAddress2() {
    return companyAddress2;
  }


  public void setCompanyAddress2(String companyAddress2) {
    this.companyAddress2 = companyAddress2;
  }


  public InvoicesCreateParams companyContactInfo(String companyContactInfo) {
    
    this.companyContactInfo = companyContactInfo;
    return this;
  }

   /**
   * 事業所担当者名 (デフォルトは事業所設定情報が補完されます)
   * @return companyContactInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "法人営業担当", value = "事業所担当者名 (デフォルトは事業所設定情報が補完されます)")

  public String getCompanyContactInfo() {
    return companyContactInfo;
  }


  public void setCompanyContactInfo(String companyContactInfo) {
    this.companyContactInfo = companyContactInfo;
  }


  public InvoicesCreateParams paymentType(PaymentTypeEnum paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * 支払方法 (振込: transfer, 引き落とし: direct_debit)
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "transfer", value = "支払方法 (振込: transfer, 引き落とし: direct_debit)")

  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }


  public InvoicesCreateParams paymentBankInfo(String paymentBankInfo) {
    
    this.paymentBankInfo = paymentBankInfo;
    return this;
  }

   /**
   * 支払口座
   * @return paymentBankInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ＸＸ銀行ＹＹ支店1111111", value = "支払口座")

  public String getPaymentBankInfo() {
    return paymentBankInfo;
  }


  public void setPaymentBankInfo(String paymentBankInfo) {
    this.paymentBankInfo = paymentBankInfo;
  }


  public InvoicesCreateParams useVirtualTransferAccount(UseVirtualTransferAccountEnum useVirtualTransferAccount) {
    
    this.useVirtualTransferAccount = useVirtualTransferAccount;
    return this;
  }

   /**
   * 振込専用口座の利用(利用しない: not_use(デフォルト), 利用する: use)
   * @return useVirtualTransferAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "use", value = "振込専用口座の利用(利用しない: not_use(デフォルト), 利用する: use)")

  public UseVirtualTransferAccountEnum getUseVirtualTransferAccount() {
    return useVirtualTransferAccount;
  }


  public void setUseVirtualTransferAccount(UseVirtualTransferAccountEnum useVirtualTransferAccount) {
    this.useVirtualTransferAccount = useVirtualTransferAccount;
  }


  public InvoicesCreateParams message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * メッセージ (デフォルト: 下記の通りご請求申し上げます。)
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "下記の通りご請求申し上げます。", value = "メッセージ (デフォルト: 下記の通りご請求申し上げます。)")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public InvoicesCreateParams notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * 備考
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "毎度ありがとうございます", value = "備考")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public InvoicesCreateParams invoiceLayout(InvoiceLayoutEnum invoiceLayout) {
    
    this.invoiceLayout = invoiceLayout;
    return this;
  }

   /**
   * レイアウト(default_classic: レイアウト１/クラシック (デフォルト), standard_classic: レイアウト２/クラシック, envelope_classic: 封筒１/クラシック, carried_forward_standard_classic: レイアウト３（繰越金額欄あり）/クラシック, carried_forward_envelope_classic: 封筒２（繰越金額欄あり）/クラシック, default_modern: レイアウト１/モダン, standard_modern: レイアウト２/モダン, envelope_modern: 封筒/モダン)
   * @return invoiceLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default_classic", value = "レイアウト(default_classic: レイアウト１/クラシック (デフォルト), standard_classic: レイアウト２/クラシック, envelope_classic: 封筒１/クラシック, carried_forward_standard_classic: レイアウト３（繰越金額欄あり）/クラシック, carried_forward_envelope_classic: 封筒２（繰越金額欄あり）/クラシック, default_modern: レイアウト１/モダン, standard_modern: レイアウト２/モダン, envelope_modern: 封筒/モダン)")

  public InvoiceLayoutEnum getInvoiceLayout() {
    return invoiceLayout;
  }


  public void setInvoiceLayout(InvoiceLayoutEnum invoiceLayout) {
    this.invoiceLayout = invoiceLayout;
  }


  public InvoicesCreateParams taxEntryMethod(TaxEntryMethodEnum taxEntryMethod) {
    
    this.taxEntryMethod = taxEntryMethod;
    return this;
  }

   /**
   * 請求書の消費税計算方法(inclusive: 内税表示, exclusive: 外税表示 (デフォルト))
   * @return taxEntryMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "exclusive", value = "請求書の消費税計算方法(inclusive: 内税表示, exclusive: 外税表示 (デフォルト))")

  public TaxEntryMethodEnum getTaxEntryMethod() {
    return taxEntryMethod;
  }


  public void setTaxEntryMethod(TaxEntryMethodEnum taxEntryMethod) {
    this.taxEntryMethod = taxEntryMethod;
  }


  public InvoicesCreateParams invoiceContents(List<InvoicesCreateParamsInvoiceContents> invoiceContents) {
    
    this.invoiceContents = invoiceContents;
    return this;
  }

  public InvoicesCreateParams addInvoiceContentsItem(InvoicesCreateParamsInvoiceContents invoiceContentsItem) {
    if (this.invoiceContents == null) {
      this.invoiceContents = new ArrayList<>();
    }
    this.invoiceContents.add(invoiceContentsItem);
    return this;
  }

   /**
   * 請求内容
   * @return invoiceContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "請求内容")

  public List<InvoicesCreateParamsInvoiceContents> getInvoiceContents() {
    return invoiceContents;
  }


  public void setInvoiceContents(List<InvoicesCreateParamsInvoiceContents> invoiceContents) {
    this.invoiceContents = invoiceContents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicesCreateParams invoicesCreateParams = (InvoicesCreateParams) o;
    return Objects.equals(this.companyId, invoicesCreateParams.companyId) &&
        Objects.equals(this.issueDate, invoicesCreateParams.issueDate) &&
        Objects.equals(this.partnerId, invoicesCreateParams.partnerId) &&
        Objects.equals(this.partnerCode, invoicesCreateParams.partnerCode) &&
        Objects.equals(this.invoiceNumber, invoicesCreateParams.invoiceNumber) &&
        Objects.equals(this.title, invoicesCreateParams.title) &&
        Objects.equals(this.dueDate, invoicesCreateParams.dueDate) &&
        Objects.equals(this.bookingDate, invoicesCreateParams.bookingDate) &&
        Objects.equals(this.description, invoicesCreateParams.description) &&
        Objects.equals(this.invoiceStatus, invoicesCreateParams.invoiceStatus) &&
        Objects.equals(this.partnerName, invoicesCreateParams.partnerName) &&
        Objects.equals(this.partnerTitle, invoicesCreateParams.partnerTitle) &&
        Objects.equals(this.partnerContactInfo, invoicesCreateParams.partnerContactInfo) &&
        Objects.equals(this.companyName, invoicesCreateParams.companyName) &&
        Objects.equals(this.companyZipcode, invoicesCreateParams.companyZipcode) &&
        Objects.equals(this.companyPrefectureCode, invoicesCreateParams.companyPrefectureCode) &&
        Objects.equals(this.companyAddress1, invoicesCreateParams.companyAddress1) &&
        Objects.equals(this.companyAddress2, invoicesCreateParams.companyAddress2) &&
        Objects.equals(this.companyContactInfo, invoicesCreateParams.companyContactInfo) &&
        Objects.equals(this.paymentType, invoicesCreateParams.paymentType) &&
        Objects.equals(this.paymentBankInfo, invoicesCreateParams.paymentBankInfo) &&
        Objects.equals(this.useVirtualTransferAccount, invoicesCreateParams.useVirtualTransferAccount) &&
        Objects.equals(this.message, invoicesCreateParams.message) &&
        Objects.equals(this.notes, invoicesCreateParams.notes) &&
        Objects.equals(this.invoiceLayout, invoicesCreateParams.invoiceLayout) &&
        Objects.equals(this.taxEntryMethod, invoicesCreateParams.taxEntryMethod) &&
        Objects.equals(this.invoiceContents, invoicesCreateParams.invoiceContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, issueDate, partnerId, partnerCode, invoiceNumber, title, dueDate, bookingDate, description, invoiceStatus, partnerName, partnerTitle, partnerContactInfo, companyName, companyZipcode, companyPrefectureCode, companyAddress1, companyAddress2, companyContactInfo, paymentType, paymentBankInfo, useVirtualTransferAccount, message, notes, invoiceLayout, taxEntryMethod, invoiceContents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicesCreateParams {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    partnerTitle: ").append(toIndentedString(partnerTitle)).append("\n");
    sb.append("    partnerContactInfo: ").append(toIndentedString(partnerContactInfo)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyZipcode: ").append(toIndentedString(companyZipcode)).append("\n");
    sb.append("    companyPrefectureCode: ").append(toIndentedString(companyPrefectureCode)).append("\n");
    sb.append("    companyAddress1: ").append(toIndentedString(companyAddress1)).append("\n");
    sb.append("    companyAddress2: ").append(toIndentedString(companyAddress2)).append("\n");
    sb.append("    companyContactInfo: ").append(toIndentedString(companyContactInfo)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentBankInfo: ").append(toIndentedString(paymentBankInfo)).append("\n");
    sb.append("    useVirtualTransferAccount: ").append(toIndentedString(useVirtualTransferAccount)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    invoiceLayout: ").append(toIndentedString(invoiceLayout)).append("\n");
    sb.append("    taxEntryMethod: ").append(toIndentedString(taxEntryMethod)).append("\n");
    sb.append("    invoiceContents: ").append(toIndentedString(invoiceContents)).append("\n");
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

