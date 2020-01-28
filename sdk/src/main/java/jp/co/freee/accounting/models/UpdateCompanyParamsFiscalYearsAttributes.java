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
 * UpdateCompanyParamsFiscalYearsAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class UpdateCompanyParamsFiscalYearsAttributes {
  public static final String SERIALIZED_NAME_USE_INDUSTRY_TEMPLATE = "use_industry_template";
  @SerializedName(SERIALIZED_NAME_USE_INDUSTRY_TEMPLATE)
  private Integer useIndustryTemplate;

  public static final String SERIALIZED_NAME_INDIRECT_WRITE_OFF_METHOD = "indirect_write_off_method";
  @SerializedName(SERIALIZED_NAME_INDIRECT_WRITE_OFF_METHOD)
  private Integer indirectWriteOffMethod;

  public static final String SERIALIZED_NAME_INDIRECT_WRITE_OFF_METHOD_TYPE = "indirect_write_off_method_type";
  @SerializedName(SERIALIZED_NAME_INDIRECT_WRITE_OFF_METHOD_TYPE)
  private Integer indirectWriteOffMethodType;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_ACCOUNTING_PERIOD = "accounting_period";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_PERIOD)
  private Integer accountingPeriod;

  public static final String SERIALIZED_NAME_DEPRECIATION_FRACTION = "depreciation_fraction";
  @SerializedName(SERIALIZED_NAME_DEPRECIATION_FRACTION)
  private Integer depreciationFraction;

  public static final String SERIALIZED_NAME_RETURN_CODE = "return_code";
  @SerializedName(SERIALIZED_NAME_RETURN_CODE)
  private Integer returnCode;

  public static final String SERIALIZED_NAME_TAX_FRACTION = "tax_fraction";
  @SerializedName(SERIALIZED_NAME_TAX_FRACTION)
  private Integer taxFraction;


  public UpdateCompanyParamsFiscalYearsAttributes useIndustryTemplate(Integer useIndustryTemplate) {
    
    this.useIndustryTemplate = useIndustryTemplate;
    return this;
  }

   /**
   * 製造業向け機能（0: 使用しない、1: 使用する）
   * minimum: 0
   * maximum: 1
   * @return useIndustryTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "製造業向け機能（0: 使用しない、1: 使用する）")

  public Integer getUseIndustryTemplate() {
    return useIndustryTemplate;
  }


  public void setUseIndustryTemplate(Integer useIndustryTemplate) {
    this.useIndustryTemplate = useIndustryTemplate;
  }


  public UpdateCompanyParamsFiscalYearsAttributes indirectWriteOffMethod(Integer indirectWriteOffMethod) {
    
    this.indirectWriteOffMethod = indirectWriteOffMethod;
    return this;
  }

   /**
   * 固定資産の控除法（0: 直接控除法、1: 間接控除法）
   * minimum: 0
   * maximum: 1
   * @return indirectWriteOffMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "固定資産の控除法（0: 直接控除法、1: 間接控除法）")

  public Integer getIndirectWriteOffMethod() {
    return indirectWriteOffMethod;
  }


  public void setIndirectWriteOffMethod(Integer indirectWriteOffMethod) {
    this.indirectWriteOffMethod = indirectWriteOffMethod;
  }


  public UpdateCompanyParamsFiscalYearsAttributes indirectWriteOffMethodType(Integer indirectWriteOffMethodType) {
    
    this.indirectWriteOffMethodType = indirectWriteOffMethodType;
    return this;
  }

   /**
   * 間接控除時の累計額（0: 共通、1: 資産分類別）
   * minimum: 0
   * maximum: 1
   * @return indirectWriteOffMethodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "間接控除時の累計額（0: 共通、1: 資産分類別）")

  public Integer getIndirectWriteOffMethodType() {
    return indirectWriteOffMethodType;
  }


  public void setIndirectWriteOffMethodType(Integer indirectWriteOffMethodType) {
    this.indirectWriteOffMethodType = indirectWriteOffMethodType;
  }


  public UpdateCompanyParamsFiscalYearsAttributes startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 期首日
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "期首日")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public UpdateCompanyParamsFiscalYearsAttributes endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 期末日（決算日）
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "期末日（決算日）")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public UpdateCompanyParamsFiscalYearsAttributes accountingPeriod(Integer accountingPeriod) {
    
    this.accountingPeriod = accountingPeriod;
    return this;
  }

   /**
   * 期
   * @return accountingPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "期")

  public Integer getAccountingPeriod() {
    return accountingPeriod;
  }


  public void setAccountingPeriod(Integer accountingPeriod) {
    this.accountingPeriod = accountingPeriod;
  }


  public UpdateCompanyParamsFiscalYearsAttributes depreciationFraction(Integer depreciationFraction) {
    
    this.depreciationFraction = depreciationFraction;
    return this;
  }

   /**
   * 減価償却端数処理法(法人のみ)(0: 切り捨て、1: 切り上げ)
   * minimum: 0
   * maximum: 1
   * @return depreciationFraction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "減価償却端数処理法(法人のみ)(0: 切り捨て、1: 切り上げ)")

  public Integer getDepreciationFraction() {
    return depreciationFraction;
  }


  public void setDepreciationFraction(Integer depreciationFraction) {
    this.depreciationFraction = depreciationFraction;
  }


  public UpdateCompanyParamsFiscalYearsAttributes returnCode(Integer returnCode) {
    
    this.returnCode = returnCode;
    return this;
  }

   /**
   * 不動産所得使用区分(個人事業主のみ)（0: 使用しない、3: 使用する）
   * @return returnCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "不動産所得使用区分(個人事業主のみ)（0: 使用しない、3: 使用する）")

  public Integer getReturnCode() {
    return returnCode;
  }


  public void setReturnCode(Integer returnCode) {
    this.returnCode = returnCode;
  }


  public UpdateCompanyParamsFiscalYearsAttributes taxFraction(Integer taxFraction) {
    
    this.taxFraction = taxFraction;
    return this;
  }

   /**
   * 消費税端数処理方法（0: 切り上げ、1: 切り捨て, 2: 四捨五入）
   * minimum: 0
   * maximum: 2
   * @return taxFraction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消費税端数処理方法（0: 切り上げ、1: 切り捨て, 2: 四捨五入）")

  public Integer getTaxFraction() {
    return taxFraction;
  }


  public void setTaxFraction(Integer taxFraction) {
    this.taxFraction = taxFraction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCompanyParamsFiscalYearsAttributes updateCompanyParamsFiscalYearsAttributes = (UpdateCompanyParamsFiscalYearsAttributes) o;
    return Objects.equals(this.useIndustryTemplate, updateCompanyParamsFiscalYearsAttributes.useIndustryTemplate) &&
        Objects.equals(this.indirectWriteOffMethod, updateCompanyParamsFiscalYearsAttributes.indirectWriteOffMethod) &&
        Objects.equals(this.indirectWriteOffMethodType, updateCompanyParamsFiscalYearsAttributes.indirectWriteOffMethodType) &&
        Objects.equals(this.startDate, updateCompanyParamsFiscalYearsAttributes.startDate) &&
        Objects.equals(this.endDate, updateCompanyParamsFiscalYearsAttributes.endDate) &&
        Objects.equals(this.accountingPeriod, updateCompanyParamsFiscalYearsAttributes.accountingPeriod) &&
        Objects.equals(this.depreciationFraction, updateCompanyParamsFiscalYearsAttributes.depreciationFraction) &&
        Objects.equals(this.returnCode, updateCompanyParamsFiscalYearsAttributes.returnCode) &&
        Objects.equals(this.taxFraction, updateCompanyParamsFiscalYearsAttributes.taxFraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useIndustryTemplate, indirectWriteOffMethod, indirectWriteOffMethodType, startDate, endDate, accountingPeriod, depreciationFraction, returnCode, taxFraction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCompanyParamsFiscalYearsAttributes {\n");
    sb.append("    useIndustryTemplate: ").append(toIndentedString(useIndustryTemplate)).append("\n");
    sb.append("    indirectWriteOffMethod: ").append(toIndentedString(indirectWriteOffMethod)).append("\n");
    sb.append("    indirectWriteOffMethodType: ").append(toIndentedString(indirectWriteOffMethodType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    accountingPeriod: ").append(toIndentedString(accountingPeriod)).append("\n");
    sb.append("    depreciationFraction: ").append(toIndentedString(depreciationFraction)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    taxFraction: ").append(toIndentedString(taxFraction)).append("\n");
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

