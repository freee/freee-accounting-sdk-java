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
import jp.co.freee.accounting.models.TrialBsResponseTrialBsBalances;

/**
 * TrialBsResponseTrialBs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class TrialBsResponseTrialBs {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_UP_TO_DATE = "up_to_date";
  @SerializedName(SERIALIZED_NAME_UP_TO_DATE)
  private Boolean upToDate;

  public static final String SERIALIZED_NAME_FISCAL_YEAR = "fiscal_year";
  @SerializedName(SERIALIZED_NAME_FISCAL_YEAR)
  private Integer fiscalYear;

  public static final String SERIALIZED_NAME_START_MONTH = "start_month";
  @SerializedName(SERIALIZED_NAME_START_MONTH)
  private Integer startMonth;

  public static final String SERIALIZED_NAME_END_MONTH = "end_month";
  @SerializedName(SERIALIZED_NAME_END_MONTH)
  private Integer endMonth;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  /**
   * 勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる）
   */
  @JsonAdapter(AccountItemDisplayTypeEnum.Adapter.class)
  public enum AccountItemDisplayTypeEnum {
    ACCOUNT_ITEM("account_item"),
    
    GROUP("group");

    private String value;

    AccountItemDisplayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountItemDisplayTypeEnum fromValue(String value) {
      for (AccountItemDisplayTypeEnum b : AccountItemDisplayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountItemDisplayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountItemDisplayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountItemDisplayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountItemDisplayTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_DISPLAY_TYPE = "account_item_display_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_DISPLAY_TYPE)
  private AccountItemDisplayTypeEnum accountItemDisplayType;

  /**
   * 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item）(条件に指定した時のみ含まれる）
   */
  @JsonAdapter(BreakdownDisplayTypeEnum.Adapter.class)
  public enum BreakdownDisplayTypeEnum {
    PARTNER("partner"),
    
    ITEM("item"),
    
    ACCOUNT_ITEM("account_item");

    private String value;

    BreakdownDisplayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BreakdownDisplayTypeEnum fromValue(String value) {
      for (BreakdownDisplayTypeEnum b : BreakdownDisplayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BreakdownDisplayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BreakdownDisplayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BreakdownDisplayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BreakdownDisplayTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BREAKDOWN_DISPLAY_TYPE = "breakdown_display_type";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN_DISPLAY_TYPE)
  private BreakdownDisplayTypeEnum breakdownDisplayType;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_PARTNER_CODE = "partner_code";
  @SerializedName(SERIALIZED_NAME_PARTNER_CODE)
  private String partnerCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

  /**
   * 決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる）
   */
  @JsonAdapter(AdjustmentEnum.Adapter.class)
  public enum AdjustmentEnum {
    ONLY("only"),
    
    WITHOUT("without");

    private String value;

    AdjustmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AdjustmentEnum fromValue(String value) {
      for (AdjustmentEnum b : AdjustmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AdjustmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AdjustmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AdjustmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AdjustmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ADJUSTMENT = "adjustment";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT)
  private AdjustmentEnum adjustment;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private List<TrialBsResponseTrialBsBalances> balances = new ArrayList<>();


  public TrialBsResponseTrialBs companyId(Integer companyId) {
    
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


  public TrialBsResponseTrialBs upToDate(Boolean upToDate) {
    
    this.upToDate = upToDate;
    return this;
  }

   /**
   * 集計結果が最新かどうか
   * @return upToDate
  **/
  @ApiModelProperty(example = "true", required = true, value = "集計結果が最新かどうか")

  public Boolean getUpToDate() {
    return upToDate;
  }


  public void setUpToDate(Boolean upToDate) {
    this.upToDate = upToDate;
  }


  public TrialBsResponseTrialBs fiscalYear(Integer fiscalYear) {
    
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * 会計年度(条件に指定した時、または条件に月、日条件がない時のみ含まれる）
   * @return fiscalYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019", value = "会計年度(条件に指定した時、または条件に月、日条件がない時のみ含まれる）")

  public Integer getFiscalYear() {
    return fiscalYear;
  }


  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public TrialBsResponseTrialBs startMonth(Integer startMonth) {
    
    this.startMonth = startMonth;
    return this;
  }

   /**
   * 発生月で絞込：開始会計月(mm)(条件に指定した時のみ含まれる）
   * @return startMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "発生月で絞込：開始会計月(mm)(条件に指定した時のみ含まれる）")

  public Integer getStartMonth() {
    return startMonth;
  }


  public void setStartMonth(Integer startMonth) {
    this.startMonth = startMonth;
  }


  public TrialBsResponseTrialBs endMonth(Integer endMonth) {
    
    this.endMonth = endMonth;
    return this;
  }

   /**
   * 発生月で絞込：終了会計月(mm)(条件に指定した時のみ含まれる）
   * @return endMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "発生月で絞込：終了会計月(mm)(条件に指定した時のみ含まれる）")

  public Integer getEndMonth() {
    return endMonth;
  }


  public void setEndMonth(Integer endMonth) {
    this.endMonth = endMonth;
  }


  public TrialBsResponseTrialBs startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 発生日で絞込：開始日(yyyy-mm-dd)(条件に指定した時のみ含まれる）
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01", value = "発生日で絞込：開始日(yyyy-mm-dd)(条件に指定した時のみ含まれる）")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public TrialBsResponseTrialBs endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 発生日で絞込：終了日(yyyy-mm-dd)(条件に指定した時のみ含まれる）
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-31", value = "発生日で絞込：終了日(yyyy-mm-dd)(条件に指定した時のみ含まれる）")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public TrialBsResponseTrialBs accountItemDisplayType(AccountItemDisplayTypeEnum accountItemDisplayType) {
    
    this.accountItemDisplayType = accountItemDisplayType;
    return this;
  }

   /**
   * 勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる）
   * @return accountItemDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる）")

  public AccountItemDisplayTypeEnum getAccountItemDisplayType() {
    return accountItemDisplayType;
  }


  public void setAccountItemDisplayType(AccountItemDisplayTypeEnum accountItemDisplayType) {
    this.accountItemDisplayType = accountItemDisplayType;
  }


  public TrialBsResponseTrialBs breakdownDisplayType(BreakdownDisplayTypeEnum breakdownDisplayType) {
    
    this.breakdownDisplayType = breakdownDisplayType;
    return this;
  }

   /**
   * 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item）(条件に指定した時のみ含まれる）
   * @return breakdownDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item）(条件に指定した時のみ含まれる）")

  public BreakdownDisplayTypeEnum getBreakdownDisplayType() {
    return breakdownDisplayType;
  }


  public void setBreakdownDisplayType(BreakdownDisplayTypeEnum breakdownDisplayType) {
    this.breakdownDisplayType = breakdownDisplayType;
  }


  public TrialBsResponseTrialBs partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 取引先ID(条件に指定した時のみ含まれる）
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "取引先ID(条件に指定した時のみ含まれる）")

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }


  public TrialBsResponseTrialBs partnerCode(String partnerCode) {
    
    this.partnerCode = partnerCode;
    return this;
  }

   /**
   * 取引先コード(条件に指定した時のみ含まれる）
   * @return partnerCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "code001", value = "取引先コード(条件に指定した時のみ含まれる）")

  public String getPartnerCode() {
    return partnerCode;
  }


  public void setPartnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
  }


  public TrialBsResponseTrialBs itemId(Integer itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 品目ID(条件に指定した時のみ含まれる）
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "品目ID(条件に指定した時のみ含まれる）")

  public Integer getItemId() {
    return itemId;
  }


  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }


  public TrialBsResponseTrialBs adjustment(AdjustmentEnum adjustment) {
    
    this.adjustment = adjustment;
    return this;
  }

   /**
   * 決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる）
   * @return adjustment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "only", value = "決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる）")

  public AdjustmentEnum getAdjustment() {
    return adjustment;
  }


  public void setAdjustment(AdjustmentEnum adjustment) {
    this.adjustment = adjustment;
  }


  public TrialBsResponseTrialBs createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 作成日時
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-10T13:47:24.000+09:00", value = "作成日時")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public TrialBsResponseTrialBs balances(List<TrialBsResponseTrialBsBalances> balances) {
    
    this.balances = balances;
    return this;
  }

  public TrialBsResponseTrialBs addBalancesItem(TrialBsResponseTrialBsBalances balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(required = true, value = "")

  public List<TrialBsResponseTrialBsBalances> getBalances() {
    return balances;
  }


  public void setBalances(List<TrialBsResponseTrialBsBalances> balances) {
    this.balances = balances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialBsResponseTrialBs trialBsResponseTrialBs = (TrialBsResponseTrialBs) o;
    return Objects.equals(this.companyId, trialBsResponseTrialBs.companyId) &&
        Objects.equals(this.upToDate, trialBsResponseTrialBs.upToDate) &&
        Objects.equals(this.fiscalYear, trialBsResponseTrialBs.fiscalYear) &&
        Objects.equals(this.startMonth, trialBsResponseTrialBs.startMonth) &&
        Objects.equals(this.endMonth, trialBsResponseTrialBs.endMonth) &&
        Objects.equals(this.startDate, trialBsResponseTrialBs.startDate) &&
        Objects.equals(this.endDate, trialBsResponseTrialBs.endDate) &&
        Objects.equals(this.accountItemDisplayType, trialBsResponseTrialBs.accountItemDisplayType) &&
        Objects.equals(this.breakdownDisplayType, trialBsResponseTrialBs.breakdownDisplayType) &&
        Objects.equals(this.partnerId, trialBsResponseTrialBs.partnerId) &&
        Objects.equals(this.partnerCode, trialBsResponseTrialBs.partnerCode) &&
        Objects.equals(this.itemId, trialBsResponseTrialBs.itemId) &&
        Objects.equals(this.adjustment, trialBsResponseTrialBs.adjustment) &&
        Objects.equals(this.createdAt, trialBsResponseTrialBs.createdAt) &&
        Objects.equals(this.balances, trialBsResponseTrialBs.balances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, upToDate, fiscalYear, startMonth, endMonth, startDate, endDate, accountItemDisplayType, breakdownDisplayType, partnerId, partnerCode, itemId, adjustment, createdAt, balances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialBsResponseTrialBs {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    upToDate: ").append(toIndentedString(upToDate)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    endMonth: ").append(toIndentedString(endMonth)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    accountItemDisplayType: ").append(toIndentedString(accountItemDisplayType)).append("\n");
    sb.append("    breakdownDisplayType: ").append(toIndentedString(breakdownDisplayType)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    adjustment: ").append(toIndentedString(adjustment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

