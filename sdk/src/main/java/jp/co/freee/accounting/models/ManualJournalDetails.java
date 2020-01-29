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

/**
 * ManualJournalDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class ManualJournalDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  /**
   * 貸借(貸方: credit, 借方: debit)
   */
  @JsonAdapter(EntrySideEnum.Adapter.class)
  public enum EntrySideEnum {
    CREDIT("credit"),
    
    DEBIT("debit");

    private String value;

    EntrySideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntrySideEnum fromValue(String value) {
      for (EntrySideEnum b : EntrySideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntrySideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntrySideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntrySideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntrySideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTRY_SIDE = "entry_side";
  @SerializedName(SERIALIZED_NAME_ENTRY_SIDE)
  private EntrySideEnum entrySide;

  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_ID = "account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_ID)
  private Integer accountItemId;

  public static final String SERIALIZED_NAME_TAX_CODE = "tax_code";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private Integer taxCode;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_PARTNER_NAME = "partner_name";
  @SerializedName(SERIALIZED_NAME_PARTNER_NAME)
  private String partnerName;

  public static final String SERIALIZED_NAME_PARTNER_CODE = "partner_code";
  @SerializedName(SERIALIZED_NAME_PARTNER_CODE)
  private String partnerCode;

  public static final String SERIALIZED_NAME_PARTNER_LONG_NAME = "partner_long_name";
  @SerializedName(SERIALIZED_NAME_PARTNER_LONG_NAME)
  private String partnerLongName;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_SECTION_ID = "section_id";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private Integer sectionId;

  public static final String SERIALIZED_NAME_SECTION_NAME = "section_name";
  @SerializedName(SERIALIZED_NAME_SECTION_NAME)
  private String sectionName;

  public static final String SERIALIZED_NAME_TAG_IDS = "tag_ids";
  @SerializedName(SERIALIZED_NAME_TAG_IDS)
  private List<Integer> tagIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAG_NAMES = "tag_names";
  @SerializedName(SERIALIZED_NAME_TAG_NAMES)
  private List<String> tagNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEGMENT1_TAG_ID = "segment_1_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT1_TAG_ID)
  private Integer segment1TagId;

  public static final String SERIALIZED_NAME_SEGMENT1_TAG_NAME = "segment_1_tag_name";
  @SerializedName(SERIALIZED_NAME_SEGMENT1_TAG_NAME)
  private Integer segment1TagName;

  public static final String SERIALIZED_NAME_SEGMENT2_TAG_ID = "segment_2_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT2_TAG_ID)
  private Integer segment2TagId;

  public static final String SERIALIZED_NAME_SEGMENT2_TAG_NAME = "segment_2_tag_name";
  @SerializedName(SERIALIZED_NAME_SEGMENT2_TAG_NAME)
  private Integer segment2TagName;

  public static final String SERIALIZED_NAME_SEGMENT3_TAG_ID = "segment_3_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT3_TAG_ID)
  private Integer segment3TagId;

  public static final String SERIALIZED_NAME_SEGMENT3_TAG_NAME = "segment_3_tag_name";
  @SerializedName(SERIALIZED_NAME_SEGMENT3_TAG_NAME)
  private Integer segment3TagName;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_VAT = "vat";
  @SerializedName(SERIALIZED_NAME_VAT)
  private Integer vat;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public ManualJournalDetails id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 貸借行ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "貸借行ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ManualJournalDetails entrySide(EntrySideEnum entrySide) {
    
    this.entrySide = entrySide;
    return this;
  }

   /**
   * 貸借(貸方: credit, 借方: debit)
   * @return entrySide
  **/
  @ApiModelProperty(example = "credit", required = true, value = "貸借(貸方: credit, 借方: debit)")

  public EntrySideEnum getEntrySide() {
    return entrySide;
  }


  public void setEntrySide(EntrySideEnum entrySide) {
    this.entrySide = entrySide;
  }


  public ManualJournalDetails accountItemId(Integer accountItemId) {
    
    this.accountItemId = accountItemId;
    return this;
  }

   /**
   * 勘定科目ID
   * @return accountItemId
  **/
  @ApiModelProperty(example = "1", required = true, value = "勘定科目ID")

  public Integer getAccountItemId() {
    return accountItemId;
  }


  public void setAccountItemId(Integer accountItemId) {
    this.accountItemId = accountItemId;
  }


  public ManualJournalDetails taxCode(Integer taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * 税区分ID
   * @return taxCode
  **/
  @ApiModelProperty(example = "1", required = true, value = "税区分ID")

  public Integer getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(Integer taxCode) {
    this.taxCode = taxCode;
  }


  public ManualJournalDetails partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 取引先ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "取引先ID")

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }


  public ManualJournalDetails partnerName(String partnerName) {
    
    this.partnerName = partnerName;
    return this;
  }

   /**
   * 取引先名
   * @return partnerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freee", required = true, value = "取引先名")

  public String getPartnerName() {
    return partnerName;
  }


  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }


  public ManualJournalDetails partnerCode(String partnerCode) {
    
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


  public ManualJournalDetails partnerLongName(String partnerLongName) {
    
    this.partnerLongName = partnerLongName;
    return this;
  }

   /**
   * 正式名称（255文字以内）
   * @return partnerLongName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freee株式会社", required = true, value = "正式名称（255文字以内）")

  public String getPartnerLongName() {
    return partnerLongName;
  }


  public void setPartnerLongName(String partnerLongName) {
    this.partnerLongName = partnerLongName;
  }


  public ManualJournalDetails itemId(Integer itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 品目ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "品目ID")

  public Integer getItemId() {
    return itemId;
  }


  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }


  public ManualJournalDetails itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * 品目
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "会計freee", required = true, value = "品目")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public ManualJournalDetails sectionId(Integer sectionId) {
    
    this.sectionId = sectionId;
    return this;
  }

   /**
   * 部門ID
   * @return sectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "部門ID")

  public Integer getSectionId() {
    return sectionId;
  }


  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }


  public ManualJournalDetails sectionName(String sectionName) {
    
    this.sectionName = sectionName;
    return this;
  }

   /**
   * 部門
   * @return sectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "開発部", required = true, value = "部門")

  public String getSectionName() {
    return sectionName;
  }


  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }


  public ManualJournalDetails tagIds(List<Integer> tagIds) {
    
    this.tagIds = tagIds;
    return this;
  }

  public ManualJournalDetails addTagIdsItem(Integer tagIdsItem) {
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * Get tagIds
   * @return tagIds
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getTagIds() {
    return tagIds;
  }


  public void setTagIds(List<Integer> tagIds) {
    this.tagIds = tagIds;
  }


  public ManualJournalDetails tagNames(List<String> tagNames) {
    
    this.tagNames = tagNames;
    return this;
  }

  public ManualJournalDetails addTagNamesItem(String tagNamesItem) {
    this.tagNames.add(tagNamesItem);
    return this;
  }

   /**
   * Get tagNames
   * @return tagNames
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getTagNames() {
    return tagNames;
  }


  public void setTagNames(List<String> tagNames) {
    this.tagNames = tagNames;
  }


  public ManualJournalDetails segment1TagId(Integer segment1TagId) {
    
    this.segment1TagId = segment1TagId;
    return this;
  }

   /**
   * セグメント１ID
   * @return segment1TagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "セグメント１ID")

  public Integer getSegment1TagId() {
    return segment1TagId;
  }


  public void setSegment1TagId(Integer segment1TagId) {
    this.segment1TagId = segment1TagId;
  }


  public ManualJournalDetails segment1TagName(Integer segment1TagName) {
    
    this.segment1TagName = segment1TagName;
    return this;
  }

   /**
   * セグメント１ID
   * @return segment1TagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "セグメント１ID")

  public Integer getSegment1TagName() {
    return segment1TagName;
  }


  public void setSegment1TagName(Integer segment1TagName) {
    this.segment1TagName = segment1TagName;
  }


  public ManualJournalDetails segment2TagId(Integer segment2TagId) {
    
    this.segment2TagId = segment2TagId;
    return this;
  }

   /**
   * セグメント２ID
   * @return segment2TagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "セグメント２ID")

  public Integer getSegment2TagId() {
    return segment2TagId;
  }


  public void setSegment2TagId(Integer segment2TagId) {
    this.segment2TagId = segment2TagId;
  }


  public ManualJournalDetails segment2TagName(Integer segment2TagName) {
    
    this.segment2TagName = segment2TagName;
    return this;
  }

   /**
   * セグメント２
   * @return segment2TagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "セグメント２")

  public Integer getSegment2TagName() {
    return segment2TagName;
  }


  public void setSegment2TagName(Integer segment2TagName) {
    this.segment2TagName = segment2TagName;
  }


  public ManualJournalDetails segment3TagId(Integer segment3TagId) {
    
    this.segment3TagId = segment3TagId;
    return this;
  }

   /**
   * セグメント３ID
   * @return segment3TagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "セグメント３ID")

  public Integer getSegment3TagId() {
    return segment3TagId;
  }


  public void setSegment3TagId(Integer segment3TagId) {
    this.segment3TagId = segment3TagId;
  }


  public ManualJournalDetails segment3TagName(Integer segment3TagName) {
    
    this.segment3TagName = segment3TagName;
    return this;
  }

   /**
   * セグメント３
   * @return segment3TagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "セグメント３")

  public Integer getSegment3TagName() {
    return segment3TagName;
  }


  public void setSegment3TagName(Integer segment3TagName) {
    this.segment3TagName = segment3TagName;
  }


  public ManualJournalDetails amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 金額（税込で指定してください）
   * @return amount
  **/
  @ApiModelProperty(example = "108000", required = true, value = "金額（税込で指定してください）")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ManualJournalDetails vat(Integer vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * 消費税額（指定しない場合は自動で計算されます）
   * @return vat
  **/
  @ApiModelProperty(example = "8000", required = true, value = "消費税額（指定しない場合は自動で計算されます）")

  public Integer getVat() {
    return vat;
  }


  public void setVat(Integer vat) {
    this.vat = vat;
  }


  public ManualJournalDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 備考
   * @return description
  **/
  @ApiModelProperty(example = "備考", required = true, value = "備考")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualJournalDetails manualJournalDetails = (ManualJournalDetails) o;
    return Objects.equals(this.id, manualJournalDetails.id) &&
        Objects.equals(this.entrySide, manualJournalDetails.entrySide) &&
        Objects.equals(this.accountItemId, manualJournalDetails.accountItemId) &&
        Objects.equals(this.taxCode, manualJournalDetails.taxCode) &&
        Objects.equals(this.partnerId, manualJournalDetails.partnerId) &&
        Objects.equals(this.partnerName, manualJournalDetails.partnerName) &&
        Objects.equals(this.partnerCode, manualJournalDetails.partnerCode) &&
        Objects.equals(this.partnerLongName, manualJournalDetails.partnerLongName) &&
        Objects.equals(this.itemId, manualJournalDetails.itemId) &&
        Objects.equals(this.itemName, manualJournalDetails.itemName) &&
        Objects.equals(this.sectionId, manualJournalDetails.sectionId) &&
        Objects.equals(this.sectionName, manualJournalDetails.sectionName) &&
        Objects.equals(this.tagIds, manualJournalDetails.tagIds) &&
        Objects.equals(this.tagNames, manualJournalDetails.tagNames) &&
        Objects.equals(this.segment1TagId, manualJournalDetails.segment1TagId) &&
        Objects.equals(this.segment1TagName, manualJournalDetails.segment1TagName) &&
        Objects.equals(this.segment2TagId, manualJournalDetails.segment2TagId) &&
        Objects.equals(this.segment2TagName, manualJournalDetails.segment2TagName) &&
        Objects.equals(this.segment3TagId, manualJournalDetails.segment3TagId) &&
        Objects.equals(this.segment3TagName, manualJournalDetails.segment3TagName) &&
        Objects.equals(this.amount, manualJournalDetails.amount) &&
        Objects.equals(this.vat, manualJournalDetails.vat) &&
        Objects.equals(this.description, manualJournalDetails.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entrySide, accountItemId, taxCode, partnerId, partnerName, partnerCode, partnerLongName, itemId, itemName, sectionId, sectionName, tagIds, tagNames, segment1TagId, segment1TagName, segment2TagId, segment2TagName, segment3TagId, segment3TagName, amount, vat, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualJournalDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entrySide: ").append(toIndentedString(entrySide)).append("\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    partnerLongName: ").append(toIndentedString(partnerLongName)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
    sb.append("    segment1TagId: ").append(toIndentedString(segment1TagId)).append("\n");
    sb.append("    segment1TagName: ").append(toIndentedString(segment1TagName)).append("\n");
    sb.append("    segment2TagId: ").append(toIndentedString(segment2TagId)).append("\n");
    sb.append("    segment2TagName: ").append(toIndentedString(segment2TagName)).append("\n");
    sb.append("    segment3TagId: ").append(toIndentedString(segment3TagId)).append("\n");
    sb.append("    segment3TagName: ").append(toIndentedString(segment3TagName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

