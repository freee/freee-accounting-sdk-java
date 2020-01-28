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
 * PartnerCreateParamsPartnerBankAccountAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class PartnerCreateParamsPartnerBankAccountAttributes {
  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_NAME_KANA = "bank_name_kana";
  @SerializedName(SERIALIZED_NAME_BANK_NAME_KANA)
  private String bankNameKana;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_BRANCH_NAME = "branch_name";
  @SerializedName(SERIALIZED_NAME_BRANCH_NAME)
  private String branchName;

  public static final String SERIALIZED_NAME_BRANCH_KANA = "branch_kana";
  @SerializedName(SERIALIZED_NAME_BRANCH_KANA)
  private String branchKana;

  public static final String SERIALIZED_NAME_BRANCH_CODE = "branch_code";
  @SerializedName(SERIALIZED_NAME_BRANCH_CODE)
  private String branchCode;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_LONG_ACCOUNT_NAME = "long_account_name";
  @SerializedName(SERIALIZED_NAME_LONG_ACCOUNT_NAME)
  private String longAccountName;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;


  public PartnerCreateParamsPartnerBankAccountAttributes bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * 銀行名
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ＸＸ銀行", value = "銀行名")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public PartnerCreateParamsPartnerBankAccountAttributes bankNameKana(String bankNameKana) {
    
    this.bankNameKana = bankNameKana;
    return this;
  }

   /**
   * 銀行名（カナ）
   * @return bankNameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ＸＸ", value = "銀行名（カナ）")

  public String getBankNameKana() {
    return bankNameKana;
  }


  public void setBankNameKana(String bankNameKana) {
    this.bankNameKana = bankNameKana;
  }


  public PartnerCreateParamsPartnerBankAccountAttributes bankCode(String bankCode) {
    
    this.bankCode = bankCode;
    return this;
  }

   /**
   * 銀行番号
   * @return bankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001", value = "銀行番号")

  public String getBankCode() {
    return bankCode;
  }


  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  public PartnerCreateParamsPartnerBankAccountAttributes branchName(String branchName) {
    
    this.branchName = branchName;
    return this;
  }

   /**
   * 支店名
   * @return branchName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "銀座支店", value = "支店名")

  public String getBranchName() {
    return branchName;
  }


  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }


  public PartnerCreateParamsPartnerBankAccountAttributes branchKana(String branchKana) {
    
    this.branchKana = branchKana;
    return this;
  }

   /**
   * 支店名（カナ）
   * @return branchKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ギンザ", value = "支店名（カナ）")

  public String getBranchKana() {
    return branchKana;
  }


  public void setBranchKana(String branchKana) {
    this.branchKana = branchKana;
  }


  public PartnerCreateParamsPartnerBankAccountAttributes branchCode(String branchCode) {
    
    this.branchCode = branchCode;
    return this;
  }

   /**
   * 支店番号
   * @return branchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "101", value = "支店番号")

  public String getBranchCode() {
    return branchCode;
  }


  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }


  public PartnerCreateParamsPartnerBankAccountAttributes accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * 口座種別(ordinary:普通、checking：当座、earmarked：納税準備預金、savings：貯蓄、other:その他)
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ordinary", value = "口座種別(ordinary:普通、checking：当座、earmarked：納税準備預金、savings：貯蓄、other:その他)")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public PartnerCreateParamsPartnerBankAccountAttributes accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * 口座番号
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1010101", value = "口座番号")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public PartnerCreateParamsPartnerBankAccountAttributes longAccountName(String longAccountName) {
    
    this.longAccountName = longAccountName;
    return this;
  }

   /**
   * 受取人名
   * @return longAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freee太郎", value = "受取人名")

  public String getLongAccountName() {
    return longAccountName;
  }


  public void setLongAccountName(String longAccountName) {
    this.longAccountName = longAccountName;
  }


  public PartnerCreateParamsPartnerBankAccountAttributes accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * 受取人名（カナ）
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "フリータロウ", value = "受取人名（カナ）")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerCreateParamsPartnerBankAccountAttributes partnerCreateParamsPartnerBankAccountAttributes = (PartnerCreateParamsPartnerBankAccountAttributes) o;
    return Objects.equals(this.bankName, partnerCreateParamsPartnerBankAccountAttributes.bankName) &&
        Objects.equals(this.bankNameKana, partnerCreateParamsPartnerBankAccountAttributes.bankNameKana) &&
        Objects.equals(this.bankCode, partnerCreateParamsPartnerBankAccountAttributes.bankCode) &&
        Objects.equals(this.branchName, partnerCreateParamsPartnerBankAccountAttributes.branchName) &&
        Objects.equals(this.branchKana, partnerCreateParamsPartnerBankAccountAttributes.branchKana) &&
        Objects.equals(this.branchCode, partnerCreateParamsPartnerBankAccountAttributes.branchCode) &&
        Objects.equals(this.accountType, partnerCreateParamsPartnerBankAccountAttributes.accountType) &&
        Objects.equals(this.accountNumber, partnerCreateParamsPartnerBankAccountAttributes.accountNumber) &&
        Objects.equals(this.longAccountName, partnerCreateParamsPartnerBankAccountAttributes.longAccountName) &&
        Objects.equals(this.accountName, partnerCreateParamsPartnerBankAccountAttributes.accountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankName, bankNameKana, bankCode, branchName, branchKana, branchCode, accountType, accountNumber, longAccountName, accountName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCreateParamsPartnerBankAccountAttributes {\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankNameKana: ").append(toIndentedString(bankNameKana)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    branchKana: ").append(toIndentedString(branchKana)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    longAccountName: ").append(toIndentedString(longAccountName)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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

