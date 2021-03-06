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
import java.util.ArrayList;
import java.util.List;
import jp.co.freee.accounting.models.QuotationUpdateParamsQuotationContents;

/**
 * QuotationUpdateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuotationUpdateParams {
  public static final String SERIALIZED_NAME_COMPANY_ADDRESS1 = "company_address1";
  @SerializedName(SERIALIZED_NAME_COMPANY_ADDRESS1)
  private String companyAddress1;

  public static final String SERIALIZED_NAME_COMPANY_ADDRESS2 = "company_address2";
  @SerializedName(SERIALIZED_NAME_COMPANY_ADDRESS2)
  private String companyAddress2;

  public static final String SERIALIZED_NAME_COMPANY_CONTACT_INFO = "company_contact_info";
  @SerializedName(SERIALIZED_NAME_COMPANY_CONTACT_INFO)
  private String companyContactInfo;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_COMPANY_PREFECTURE_CODE = "company_prefecture_code";
  @SerializedName(SERIALIZED_NAME_COMPANY_PREFECTURE_CODE)
  private Integer companyPrefectureCode;

  public static final String SERIALIZED_NAME_COMPANY_ZIPCODE = "company_zipcode";
  @SerializedName(SERIALIZED_NAME_COMPANY_ZIPCODE)
  private String companyZipcode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_PARTNER_ADDRESS1 = "partner_address1";
  @SerializedName(SERIALIZED_NAME_PARTNER_ADDRESS1)
  private String partnerAddress1;

  public static final String SERIALIZED_NAME_PARTNER_ADDRESS2 = "partner_address2";
  @SerializedName(SERIALIZED_NAME_PARTNER_ADDRESS2)
  private String partnerAddress2;

  public static final String SERIALIZED_NAME_PARTNER_CODE = "partner_code";
  @SerializedName(SERIALIZED_NAME_PARTNER_CODE)
  private String partnerCode;

  public static final String SERIALIZED_NAME_PARTNER_CONTACT_INFO = "partner_contact_info";
  @SerializedName(SERIALIZED_NAME_PARTNER_CONTACT_INFO)
  private String partnerContactInfo;

  public static final String SERIALIZED_NAME_PARTNER_DISPLAY_NAME = "partner_display_name";
  @SerializedName(SERIALIZED_NAME_PARTNER_DISPLAY_NAME)
  private String partnerDisplayName;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_PARTNER_PREFECTURE_CODE = "partner_prefecture_code";
  @SerializedName(SERIALIZED_NAME_PARTNER_PREFECTURE_CODE)
  private Integer partnerPrefectureCode;

  public static final String SERIALIZED_NAME_PARTNER_TITLE = "partner_title";
  @SerializedName(SERIALIZED_NAME_PARTNER_TITLE)
  private String partnerTitle;

  public static final String SERIALIZED_NAME_PARTNER_ZIPCODE = "partner_zipcode";
  @SerializedName(SERIALIZED_NAME_PARTNER_ZIPCODE)
  private String partnerZipcode;

  public static final String SERIALIZED_NAME_QUOTATION_CONTENTS = "quotation_contents";
  @SerializedName(SERIALIZED_NAME_QUOTATION_CONTENTS)
  private List<QuotationUpdateParamsQuotationContents> quotationContents = null;

  /**
   * 見積書レイアウト * &#x60;default_classic&#x60; - レイアウト１/クラシック (デフォルト)  * &#x60;standard_classic&#x60; - レイアウト２/クラシック  * &#x60;envelope_classic&#x60; - 封筒１/クラシック  * &#x60;default_modern&#x60; - レイアウト１/モダン  * &#x60;standard_modern&#x60; - レイアウト２/モダン  * &#x60;envelope_modern&#x60; - 封筒/モダン
   */
  @JsonAdapter(QuotationLayoutEnum.Adapter.class)
  public enum QuotationLayoutEnum {
    DEFAULT_CLASSIC("default_classic"),
    
    STANDARD_CLASSIC("standard_classic"),
    
    ENVELOPE_CLASSIC("envelope_classic"),
    
    DEFAULT_MODERN("default_modern"),
    
    STANDARD_MODERN("standard_modern"),
    
    ENVELOPE_MODERN("envelope_modern");

    private String value;

    QuotationLayoutEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QuotationLayoutEnum fromValue(String value) {
      for (QuotationLayoutEnum b : QuotationLayoutEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QuotationLayoutEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuotationLayoutEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QuotationLayoutEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QuotationLayoutEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUOTATION_LAYOUT = "quotation_layout";
  @SerializedName(SERIALIZED_NAME_QUOTATION_LAYOUT)
  private QuotationLayoutEnum quotationLayout;

  public static final String SERIALIZED_NAME_QUOTATION_NUMBER = "quotation_number";
  @SerializedName(SERIALIZED_NAME_QUOTATION_NUMBER)
  private String quotationNumber;

  /**
   * 見積書ステータス  (unsubmitted: 送付待ち, submitted: 送付済み)
   */
  @JsonAdapter(QuotationStatusEnum.Adapter.class)
  public enum QuotationStatusEnum {
    UNSUBMITTED("unsubmitted"),
    
    SUBMITTED("submitted");

    private String value;

    QuotationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QuotationStatusEnum fromValue(String value) {
      for (QuotationStatusEnum b : QuotationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QuotationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuotationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QuotationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QuotationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUOTATION_STATUS = "quotation_status";
  @SerializedName(SERIALIZED_NAME_QUOTATION_STATUS)
  private QuotationStatusEnum quotationStatus;

  /**
   * 見積書の消費税計算方法(inclusive: 内税表示, exclusive: 外税表示 (デフォルト))
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

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;


  public QuotationUpdateParams companyAddress1(String companyAddress1) {
    
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


  public QuotationUpdateParams companyAddress2(String companyAddress2) {
    
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


  public QuotationUpdateParams companyContactInfo(String companyContactInfo) {
    
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


  public QuotationUpdateParams companyId(Integer companyId) {
    
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


  public QuotationUpdateParams companyName(String companyName) {
    
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


  public QuotationUpdateParams companyPrefectureCode(Integer companyPrefectureCode) {
    
    this.companyPrefectureCode = companyPrefectureCode;
    return this;
  }

   /**
   * 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄) (デフォルトは事業所設定情報が補完されます)
   * minimum: 0
   * maximum: 46
   * @return companyPrefectureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄) (デフォルトは事業所設定情報が補完されます)")

  public Integer getCompanyPrefectureCode() {
    return companyPrefectureCode;
  }


  public void setCompanyPrefectureCode(Integer companyPrefectureCode) {
    this.companyPrefectureCode = companyPrefectureCode;
  }


  public QuotationUpdateParams companyZipcode(String companyZipcode) {
    
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


  public QuotationUpdateParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 概要
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "８月分見積書", value = "概要")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public QuotationUpdateParams issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * 見積日 (yyyy-mm-dd)
   * @return issueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-01-01", value = "見積日 (yyyy-mm-dd)")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public QuotationUpdateParams message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * メッセージ (デフォルト: 下記の通り御見積申し上げます。)
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "下記の通り御見積申し上げます。", value = "メッセージ (デフォルト: 下記の通り御見積申し上げます。)")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public QuotationUpdateParams notes(String notes) {
    
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


  public QuotationUpdateParams partnerAddress1(String partnerAddress1) {
    
    this.partnerAddress1 = partnerAddress1;
    return this;
  }

   /**
   * 取引先市区町村・番地 (デフォルトはpartner_idもしくははpartner_codeで指定された取引先設定情報が補完されます)
   * @return partnerAddress1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "湯沢市", value = "取引先市区町村・番地 (デフォルトはpartner_idもしくははpartner_codeで指定された取引先設定情報が補完されます)")

  public String getPartnerAddress1() {
    return partnerAddress1;
  }


  public void setPartnerAddress1(String partnerAddress1) {
    this.partnerAddress1 = partnerAddress1;
  }


  public QuotationUpdateParams partnerAddress2(String partnerAddress2) {
    
    this.partnerAddress2 = partnerAddress2;
    return this;
  }

   /**
   * 取引先建物名・部屋番号など (デフォルトはpartner_idもしくははpartner_codeで指定された取引先設定情報が補完されます)
   * @return partnerAddress2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Aビル", value = "取引先建物名・部屋番号など (デフォルトはpartner_idもしくははpartner_codeで指定された取引先設定情報が補完されます)")

  public String getPartnerAddress2() {
    return partnerAddress2;
  }


  public void setPartnerAddress2(String partnerAddress2) {
    this.partnerAddress2 = partnerAddress2;
  }


  public QuotationUpdateParams partnerCode(String partnerCode) {
    
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


  public QuotationUpdateParams partnerContactInfo(String partnerContactInfo) {
    
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


  public QuotationUpdateParams partnerDisplayName(String partnerDisplayName) {
    
    this.partnerDisplayName = partnerDisplayName;
    return this;
  }

   /**
   * 見積書に表示する取引先名
   * @return partnerDisplayName
  **/
  @ApiModelProperty(example = "freeeパートナー株式会社", required = true, value = "見積書に表示する取引先名")

  public String getPartnerDisplayName() {
    return partnerDisplayName;
  }


  public void setPartnerDisplayName(String partnerDisplayName) {
    this.partnerDisplayName = partnerDisplayName;
  }


  public QuotationUpdateParams partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 取引先ID
   * minimum: 1
   * maximum: 2147483647
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


  public QuotationUpdateParams partnerPrefectureCode(Integer partnerPrefectureCode) {
    
    this.partnerPrefectureCode = partnerPrefectureCode;
    return this;
  }

   /**
   * 取引先都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄) (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます)
   * minimum: 0
   * maximum: 46
   * @return partnerPrefectureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "取引先都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄) (デフォルトはpartner_idもしくはpartner_codeで指定された取引先設定情報が補完されます)")

  public Integer getPartnerPrefectureCode() {
    return partnerPrefectureCode;
  }


  public void setPartnerPrefectureCode(Integer partnerPrefectureCode) {
    this.partnerPrefectureCode = partnerPrefectureCode;
  }


  public QuotationUpdateParams partnerTitle(String partnerTitle) {
    
    this.partnerTitle = partnerTitle;
    return this;
  }

   /**
   * 敬称（御中、様、(空白)の3つから選択）
   * @return partnerTitle
  **/
  @ApiModelProperty(example = "御中", required = true, value = "敬称（御中、様、(空白)の3つから選択）")

  public String getPartnerTitle() {
    return partnerTitle;
  }


  public void setPartnerTitle(String partnerTitle) {
    this.partnerTitle = partnerTitle;
  }


  public QuotationUpdateParams partnerZipcode(String partnerZipcode) {
    
    this.partnerZipcode = partnerZipcode;
    return this;
  }

   /**
   * 取引先郵便番号 (デフォルトはpartner_idもしくははpartner_codeで指定された取引先設定情報が補完されます)
   * @return partnerZipcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "012-0009", value = "取引先郵便番号 (デフォルトはpartner_idもしくははpartner_codeで指定された取引先設定情報が補完されます)")

  public String getPartnerZipcode() {
    return partnerZipcode;
  }


  public void setPartnerZipcode(String partnerZipcode) {
    this.partnerZipcode = partnerZipcode;
  }


  public QuotationUpdateParams quotationContents(List<QuotationUpdateParamsQuotationContents> quotationContents) {
    
    this.quotationContents = quotationContents;
    return this;
  }

  public QuotationUpdateParams addQuotationContentsItem(QuotationUpdateParamsQuotationContents quotationContentsItem) {
    if (this.quotationContents == null) {
      this.quotationContents = new ArrayList<>();
    }
    this.quotationContents.add(quotationContentsItem);
    return this;
  }

   /**
   * 見積内容
   * @return quotationContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "見積内容")

  public List<QuotationUpdateParamsQuotationContents> getQuotationContents() {
    return quotationContents;
  }


  public void setQuotationContents(List<QuotationUpdateParamsQuotationContents> quotationContents) {
    this.quotationContents = quotationContents;
  }


  public QuotationUpdateParams quotationLayout(QuotationLayoutEnum quotationLayout) {
    
    this.quotationLayout = quotationLayout;
    return this;
  }

   /**
   * 見積書レイアウト * &#x60;default_classic&#x60; - レイアウト１/クラシック (デフォルト)  * &#x60;standard_classic&#x60; - レイアウト２/クラシック  * &#x60;envelope_classic&#x60; - 封筒１/クラシック  * &#x60;default_modern&#x60; - レイアウト１/モダン  * &#x60;standard_modern&#x60; - レイアウト２/モダン  * &#x60;envelope_modern&#x60; - 封筒/モダン
   * @return quotationLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default_classic", value = "見積書レイアウト * `default_classic` - レイアウト１/クラシック (デフォルト)  * `standard_classic` - レイアウト２/クラシック  * `envelope_classic` - 封筒１/クラシック  * `default_modern` - レイアウト１/モダン  * `standard_modern` - レイアウト２/モダン  * `envelope_modern` - 封筒/モダン")

  public QuotationLayoutEnum getQuotationLayout() {
    return quotationLayout;
  }


  public void setQuotationLayout(QuotationLayoutEnum quotationLayout) {
    this.quotationLayout = quotationLayout;
  }


  public QuotationUpdateParams quotationNumber(String quotationNumber) {
    
    this.quotationNumber = quotationNumber;
    return this;
  }

   /**
   * 見積書番号 (デフォルト: 自動採番されます)
   * @return quotationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A001", value = "見積書番号 (デフォルト: 自動採番されます)")

  public String getQuotationNumber() {
    return quotationNumber;
  }


  public void setQuotationNumber(String quotationNumber) {
    this.quotationNumber = quotationNumber;
  }


  public QuotationUpdateParams quotationStatus(QuotationStatusEnum quotationStatus) {
    
    this.quotationStatus = quotationStatus;
    return this;
  }

   /**
   * 見積書ステータス  (unsubmitted: 送付待ち, submitted: 送付済み)
   * @return quotationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "見積書ステータス  (unsubmitted: 送付待ち, submitted: 送付済み)")

  public QuotationStatusEnum getQuotationStatus() {
    return quotationStatus;
  }


  public void setQuotationStatus(QuotationStatusEnum quotationStatus) {
    this.quotationStatus = quotationStatus;
  }


  public QuotationUpdateParams taxEntryMethod(TaxEntryMethodEnum taxEntryMethod) {
    
    this.taxEntryMethod = taxEntryMethod;
    return this;
  }

   /**
   * 見積書の消費税計算方法(inclusive: 内税表示, exclusive: 外税表示 (デフォルト))
   * @return taxEntryMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "exclusive", value = "見積書の消費税計算方法(inclusive: 内税表示, exclusive: 外税表示 (デフォルト))")

  public TaxEntryMethodEnum getTaxEntryMethod() {
    return taxEntryMethod;
  }


  public void setTaxEntryMethod(TaxEntryMethodEnum taxEntryMethod) {
    this.taxEntryMethod = taxEntryMethod;
  }


  public QuotationUpdateParams title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * タイトル (デフォルト: 見積書)
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "見積書", value = "タイトル (デフォルト: 見積書)")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotationUpdateParams quotationUpdateParams = (QuotationUpdateParams) o;
    return Objects.equals(this.companyAddress1, quotationUpdateParams.companyAddress1) &&
        Objects.equals(this.companyAddress2, quotationUpdateParams.companyAddress2) &&
        Objects.equals(this.companyContactInfo, quotationUpdateParams.companyContactInfo) &&
        Objects.equals(this.companyId, quotationUpdateParams.companyId) &&
        Objects.equals(this.companyName, quotationUpdateParams.companyName) &&
        Objects.equals(this.companyPrefectureCode, quotationUpdateParams.companyPrefectureCode) &&
        Objects.equals(this.companyZipcode, quotationUpdateParams.companyZipcode) &&
        Objects.equals(this.description, quotationUpdateParams.description) &&
        Objects.equals(this.issueDate, quotationUpdateParams.issueDate) &&
        Objects.equals(this.message, quotationUpdateParams.message) &&
        Objects.equals(this.notes, quotationUpdateParams.notes) &&
        Objects.equals(this.partnerAddress1, quotationUpdateParams.partnerAddress1) &&
        Objects.equals(this.partnerAddress2, quotationUpdateParams.partnerAddress2) &&
        Objects.equals(this.partnerCode, quotationUpdateParams.partnerCode) &&
        Objects.equals(this.partnerContactInfo, quotationUpdateParams.partnerContactInfo) &&
        Objects.equals(this.partnerDisplayName, quotationUpdateParams.partnerDisplayName) &&
        Objects.equals(this.partnerId, quotationUpdateParams.partnerId) &&
        Objects.equals(this.partnerPrefectureCode, quotationUpdateParams.partnerPrefectureCode) &&
        Objects.equals(this.partnerTitle, quotationUpdateParams.partnerTitle) &&
        Objects.equals(this.partnerZipcode, quotationUpdateParams.partnerZipcode) &&
        Objects.equals(this.quotationContents, quotationUpdateParams.quotationContents) &&
        Objects.equals(this.quotationLayout, quotationUpdateParams.quotationLayout) &&
        Objects.equals(this.quotationNumber, quotationUpdateParams.quotationNumber) &&
        Objects.equals(this.quotationStatus, quotationUpdateParams.quotationStatus) &&
        Objects.equals(this.taxEntryMethod, quotationUpdateParams.taxEntryMethod) &&
        Objects.equals(this.title, quotationUpdateParams.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyAddress1, companyAddress2, companyContactInfo, companyId, companyName, companyPrefectureCode, companyZipcode, description, issueDate, message, notes, partnerAddress1, partnerAddress2, partnerCode, partnerContactInfo, partnerDisplayName, partnerId, partnerPrefectureCode, partnerTitle, partnerZipcode, quotationContents, quotationLayout, quotationNumber, quotationStatus, taxEntryMethod, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotationUpdateParams {\n");
    sb.append("    companyAddress1: ").append(toIndentedString(companyAddress1)).append("\n");
    sb.append("    companyAddress2: ").append(toIndentedString(companyAddress2)).append("\n");
    sb.append("    companyContactInfo: ").append(toIndentedString(companyContactInfo)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyPrefectureCode: ").append(toIndentedString(companyPrefectureCode)).append("\n");
    sb.append("    companyZipcode: ").append(toIndentedString(companyZipcode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    partnerAddress1: ").append(toIndentedString(partnerAddress1)).append("\n");
    sb.append("    partnerAddress2: ").append(toIndentedString(partnerAddress2)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    partnerContactInfo: ").append(toIndentedString(partnerContactInfo)).append("\n");
    sb.append("    partnerDisplayName: ").append(toIndentedString(partnerDisplayName)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerPrefectureCode: ").append(toIndentedString(partnerPrefectureCode)).append("\n");
    sb.append("    partnerTitle: ").append(toIndentedString(partnerTitle)).append("\n");
    sb.append("    partnerZipcode: ").append(toIndentedString(partnerZipcode)).append("\n");
    sb.append("    quotationContents: ").append(toIndentedString(quotationContents)).append("\n");
    sb.append("    quotationLayout: ").append(toIndentedString(quotationLayout)).append("\n");
    sb.append("    quotationNumber: ").append(toIndentedString(quotationNumber)).append("\n");
    sb.append("    quotationStatus: ").append(toIndentedString(quotationStatus)).append("\n");
    sb.append("    taxEntryMethod: ").append(toIndentedString(taxEntryMethod)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

