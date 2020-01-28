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
import jp.co.freee.accounting.models.ApprovalRequestRequestItems;

/**
 * ApprovalRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class ApprovalRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_APPLICATION_DATE = "application_date";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATE)
  private String applicationDate;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private Integer applicantId;

  public static final String SERIALIZED_NAME_APPROVER_ID = "approver_id";
  @SerializedName(SERIALIZED_NAME_APPROVER_ID)
  private Integer approverId;

  public static final String SERIALIZED_NAME_APPLICATION_NUMBER = "application_number";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NUMBER)
  private String applicationNumber;

  /**
   * 申請ステータス
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("draft");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_REQUEST_ITEMS = "request_items";
  @SerializedName(SERIALIZED_NAME_REQUEST_ITEMS)
  private List<ApprovalRequestRequestItems> requestItems = new ArrayList<>();


  public ApprovalRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 各種申請ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "各種申請ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ApprovalRequest companyId(Integer companyId) {
    
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


  public ApprovalRequest applicationDate(String applicationDate) {
    
    this.applicationDate = applicationDate;
    return this;
  }

   /**
   * 申請日 (yyyy-mm-dd)
   * @return applicationDate
  **/
  @ApiModelProperty(example = "2018-07-19", required = true, value = "申請日 (yyyy-mm-dd)")

  public String getApplicationDate() {
    return applicationDate;
  }


  public void setApplicationDate(String applicationDate) {
    this.applicationDate = applicationDate;
  }


  public ApprovalRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 申請タイトル
   * @return title
  **/
  @ApiModelProperty(example = "大阪出張", required = true, value = "申請タイトル")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ApprovalRequest applicantId(Integer applicantId) {
    
    this.applicantId = applicantId;
    return this;
  }

   /**
   * 申請者ID
   * @return applicantId
  **/
  @ApiModelProperty(example = "1", required = true, value = "申請者ID")

  public Integer getApplicantId() {
    return applicantId;
  }


  public void setApplicantId(Integer applicantId) {
    this.applicantId = applicantId;
  }


  public ApprovalRequest approverId(Integer approverId) {
    
    this.approverId = approverId;
    return this;
  }

   /**
   * 承認者ID
   * @return approverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "承認者ID")

  public Integer getApproverId() {
    return approverId;
  }


  public void setApproverId(Integer approverId) {
    this.approverId = approverId;
  }


  public ApprovalRequest applicationNumber(String applicationNumber) {
    
    this.applicationNumber = applicationNumber;
    return this;
  }

   /**
   * 申請No.
   * @return applicationNumber
  **/
  @ApiModelProperty(example = "2", required = true, value = "申請No.")

  public String getApplicationNumber() {
    return applicationNumber;
  }


  public void setApplicationNumber(String applicationNumber) {
    this.applicationNumber = applicationNumber;
  }


  public ApprovalRequest status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * 申請ステータス
   * @return status
  **/
  @ApiModelProperty(example = "draft", required = true, value = "申請ステータス")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ApprovalRequest requestItems(List<ApprovalRequestRequestItems> requestItems) {
    
    this.requestItems = requestItems;
    return this;
  }

  public ApprovalRequest addRequestItemsItem(ApprovalRequestRequestItems requestItemsItem) {
    this.requestItems.add(requestItemsItem);
    return this;
  }

   /**
   * 各種申請の項目一覧（配列）
   * @return requestItems
  **/
  @ApiModelProperty(required = true, value = "各種申請の項目一覧（配列）")

  public List<ApprovalRequestRequestItems> getRequestItems() {
    return requestItems;
  }


  public void setRequestItems(List<ApprovalRequestRequestItems> requestItems) {
    this.requestItems = requestItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalRequest approvalRequest = (ApprovalRequest) o;
    return Objects.equals(this.id, approvalRequest.id) &&
        Objects.equals(this.companyId, approvalRequest.companyId) &&
        Objects.equals(this.applicationDate, approvalRequest.applicationDate) &&
        Objects.equals(this.title, approvalRequest.title) &&
        Objects.equals(this.applicantId, approvalRequest.applicantId) &&
        Objects.equals(this.approverId, approvalRequest.approverId) &&
        Objects.equals(this.applicationNumber, approvalRequest.applicationNumber) &&
        Objects.equals(this.status, approvalRequest.status) &&
        Objects.equals(this.requestItems, approvalRequest.requestItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, applicationDate, title, applicantId, approverId, applicationNumber, status, requestItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    approverId: ").append(toIndentedString(approverId)).append("\n");
    sb.append("    applicationNumber: ").append(toIndentedString(applicationNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requestItems: ").append(toIndentedString(requestItems)).append("\n");
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

