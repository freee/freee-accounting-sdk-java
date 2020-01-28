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
import jp.co.freee.accounting.models.UpdateCompanyParamsAddressAttributes;
import jp.co.freee.accounting.models.UpdateCompanyParamsDocTemplate;
import jp.co.freee.accounting.models.UpdateCompanyParamsFiscalYearsAttributes;
import jp.co.freee.accounting.models.UpdateCompanyParamsSalesInformationAttributes;

/**
 * UpdateCompanyParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class UpdateCompanyParams {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_KANA = "name_kana";
  @SerializedName(SERIALIZED_NAME_NAME_KANA)
  private String nameKana;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_ADDRESS_ATTRIBUTES = "address_attributes";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ATTRIBUTES)
  private UpdateCompanyParamsAddressAttributes addressAttributes;

  public static final String SERIALIZED_NAME_PHONE1 = "phone1";
  @SerializedName(SERIALIZED_NAME_PHONE1)
  private String phone1;

  public static final String SERIALIZED_NAME_PHONE2 = "phone2";
  @SerializedName(SERIALIZED_NAME_PHONE2)
  private String phone2;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_SALES_INFORMATION_ATTRIBUTES = "sales_information_attributes";
  @SerializedName(SERIALIZED_NAME_SALES_INFORMATION_ATTRIBUTES)
  private UpdateCompanyParamsSalesInformationAttributes salesInformationAttributes;

  public static final String SERIALIZED_NAME_HEAD_COUNT = "head_count";
  @SerializedName(SERIALIZED_NAME_HEAD_COUNT)
  private BigDecimal headCount;

  public static final String SERIALIZED_NAME_CORPORATE_NUMBER = "corporate_number";
  @SerializedName(SERIALIZED_NAME_CORPORATE_NUMBER)
  private String corporateNumber;

  public static final String SERIALIZED_NAME_FISCAL_YEARS_ATTRIBUTES = "fiscal_years_attributes";
  @SerializedName(SERIALIZED_NAME_FISCAL_YEARS_ATTRIBUTES)
  private UpdateCompanyParamsFiscalYearsAttributes fiscalYearsAttributes;

  public static final String SERIALIZED_NAME_DOC_TEMPLATE = "doc_template";
  @SerializedName(SERIALIZED_NAME_DOC_TEMPLATE)
  private UpdateCompanyParamsDocTemplate docTemplate;

  /**
   * 仕訳番号形式（not_used: 使用しない、digits: 数字（例：5091824）、alnum: 英数字（例：59J0P））Available values : not_used, digits, alnum
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

  public static final String SERIALIZED_NAME_PRIVATE_SETTLEMENT = "private_settlement";
  @SerializedName(SERIALIZED_NAME_PRIVATE_SETTLEMENT)
  private Integer privateSettlement;


  public UpdateCompanyParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 事業所の正式名称 (100文字以内)
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freee事務所", value = "事業所の正式名称 (100文字以内)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateCompanyParams nameKana(String nameKana) {
    
    this.nameKana = nameKana;
    return this;
  }

   /**
   * 正式名称フリガナ (100文字以内)
   * @return nameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "フリージムショ", value = "正式名称フリガナ (100文字以内)")

  public String getNameKana() {
    return nameKana;
  }


  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }


  public UpdateCompanyParams contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * user1
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "担当者名 (50文字以内)", value = "user1")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public UpdateCompanyParams addressAttributes(UpdateCompanyParamsAddressAttributes addressAttributes) {
    
    this.addressAttributes = addressAttributes;
    return this;
  }

   /**
   * Get addressAttributes
   * @return addressAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpdateCompanyParamsAddressAttributes getAddressAttributes() {
    return addressAttributes;
  }


  public void setAddressAttributes(UpdateCompanyParamsAddressAttributes addressAttributes) {
    this.addressAttributes = addressAttributes;
  }


  public UpdateCompanyParams phone1(String phone1) {
    
    this.phone1 = phone1;
    return this;
  }

   /**
   * 電話番号１
   * @return phone1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03-1234-xxxx", value = "電話番号１")

  public String getPhone1() {
    return phone1;
  }


  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }


  public UpdateCompanyParams phone2(String phone2) {
    
    this.phone2 = phone2;
    return this;
  }

   /**
   * 電話番号２
   * @return phone2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "090-1234-xxxx", value = "電話番号２")

  public String getPhone2() {
    return phone2;
  }


  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }


  public UpdateCompanyParams fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * FAX
   * @return fax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03-1234-xxxx", value = "FAX")

  public String getFax() {
    return fax;
  }


  public void setFax(String fax) {
    this.fax = fax;
  }


  public UpdateCompanyParams salesInformationAttributes(UpdateCompanyParamsSalesInformationAttributes salesInformationAttributes) {
    
    this.salesInformationAttributes = salesInformationAttributes;
    return this;
  }

   /**
   * Get salesInformationAttributes
   * @return salesInformationAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpdateCompanyParamsSalesInformationAttributes getSalesInformationAttributes() {
    return salesInformationAttributes;
  }


  public void setSalesInformationAttributes(UpdateCompanyParamsSalesInformationAttributes salesInformationAttributes) {
    this.salesInformationAttributes = salesInformationAttributes;
  }


  public UpdateCompanyParams headCount(BigDecimal headCount) {
    
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
  @ApiModelProperty(example = "1", value = "従業員数（0: 経営者のみ、1: 2~5人、2: 6~10人、3: 11~20人、4: 21~30人、5: 31~40人、6: 41~100人、7: 100人以上")

  public BigDecimal getHeadCount() {
    return headCount;
  }


  public void setHeadCount(BigDecimal headCount) {
    this.headCount = headCount;
  }


  public UpdateCompanyParams corporateNumber(String corporateNumber) {
    
    this.corporateNumber = corporateNumber;
    return this;
  }

   /**
   * 法人番号 (半角数字13桁、法人のみ)
   * @return corporateNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890123", value = "法人番号 (半角数字13桁、法人のみ)")

  public String getCorporateNumber() {
    return corporateNumber;
  }


  public void setCorporateNumber(String corporateNumber) {
    this.corporateNumber = corporateNumber;
  }


  public UpdateCompanyParams fiscalYearsAttributes(UpdateCompanyParamsFiscalYearsAttributes fiscalYearsAttributes) {
    
    this.fiscalYearsAttributes = fiscalYearsAttributes;
    return this;
  }

   /**
   * Get fiscalYearsAttributes
   * @return fiscalYearsAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpdateCompanyParamsFiscalYearsAttributes getFiscalYearsAttributes() {
    return fiscalYearsAttributes;
  }


  public void setFiscalYearsAttributes(UpdateCompanyParamsFiscalYearsAttributes fiscalYearsAttributes) {
    this.fiscalYearsAttributes = fiscalYearsAttributes;
  }


  public UpdateCompanyParams docTemplate(UpdateCompanyParamsDocTemplate docTemplate) {
    
    this.docTemplate = docTemplate;
    return this;
  }

   /**
   * Get docTemplate
   * @return docTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpdateCompanyParamsDocTemplate getDocTemplate() {
    return docTemplate;
  }


  public void setDocTemplate(UpdateCompanyParamsDocTemplate docTemplate) {
    this.docTemplate = docTemplate;
  }


  public UpdateCompanyParams txnNumberFormat(TxnNumberFormatEnum txnNumberFormat) {
    
    this.txnNumberFormat = txnNumberFormat;
    return this;
  }

   /**
   * 仕訳番号形式（not_used: 使用しない、digits: 数字（例：5091824）、alnum: 英数字（例：59J0P））Available values : not_used, digits, alnum
   * @return txnNumberFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "not_used", value = "仕訳番号形式（not_used: 使用しない、digits: 数字（例：5091824）、alnum: 英数字（例：59J0P））Available values : not_used, digits, alnum")

  public TxnNumberFormatEnum getTxnNumberFormat() {
    return txnNumberFormat;
  }


  public void setTxnNumberFormat(TxnNumberFormatEnum txnNumberFormat) {
    this.txnNumberFormat = txnNumberFormat;
  }


  public UpdateCompanyParams privateSettlement(Integer privateSettlement) {
    
    this.privateSettlement = privateSettlement;
    return this;
  }

   /**
   * プライベート資金/役員資金（0: 使用しない、1: 使用する）
   * minimum: 0
   * maximum: 1
   * @return privateSettlement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "プライベート資金/役員資金（0: 使用しない、1: 使用する）")

  public Integer getPrivateSettlement() {
    return privateSettlement;
  }


  public void setPrivateSettlement(Integer privateSettlement) {
    this.privateSettlement = privateSettlement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCompanyParams updateCompanyParams = (UpdateCompanyParams) o;
    return Objects.equals(this.name, updateCompanyParams.name) &&
        Objects.equals(this.nameKana, updateCompanyParams.nameKana) &&
        Objects.equals(this.contactName, updateCompanyParams.contactName) &&
        Objects.equals(this.addressAttributes, updateCompanyParams.addressAttributes) &&
        Objects.equals(this.phone1, updateCompanyParams.phone1) &&
        Objects.equals(this.phone2, updateCompanyParams.phone2) &&
        Objects.equals(this.fax, updateCompanyParams.fax) &&
        Objects.equals(this.salesInformationAttributes, updateCompanyParams.salesInformationAttributes) &&
        Objects.equals(this.headCount, updateCompanyParams.headCount) &&
        Objects.equals(this.corporateNumber, updateCompanyParams.corporateNumber) &&
        Objects.equals(this.fiscalYearsAttributes, updateCompanyParams.fiscalYearsAttributes) &&
        Objects.equals(this.docTemplate, updateCompanyParams.docTemplate) &&
        Objects.equals(this.txnNumberFormat, updateCompanyParams.txnNumberFormat) &&
        Objects.equals(this.privateSettlement, updateCompanyParams.privateSettlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nameKana, contactName, addressAttributes, phone1, phone2, fax, salesInformationAttributes, headCount, corporateNumber, fiscalYearsAttributes, docTemplate, txnNumberFormat, privateSettlement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCompanyParams {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameKana: ").append(toIndentedString(nameKana)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    addressAttributes: ").append(toIndentedString(addressAttributes)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    salesInformationAttributes: ").append(toIndentedString(salesInformationAttributes)).append("\n");
    sb.append("    headCount: ").append(toIndentedString(headCount)).append("\n");
    sb.append("    corporateNumber: ").append(toIndentedString(corporateNumber)).append("\n");
    sb.append("    fiscalYearsAttributes: ").append(toIndentedString(fiscalYearsAttributes)).append("\n");
    sb.append("    docTemplate: ").append(toIndentedString(docTemplate)).append("\n");
    sb.append("    txnNumberFormat: ").append(toIndentedString(txnNumberFormat)).append("\n");
    sb.append("    privateSettlement: ").append(toIndentedString(privateSettlement)).append("\n");
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

