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

/**
 * RenewCreateParamsDetails
 */

public class RenewCreateParamsDetails {
  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_ID = "account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_ID)
  private Integer accountItemId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

  public static final String SERIALIZED_NAME_SECTION_ID = "section_id";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private Integer sectionId;

  public static final String SERIALIZED_NAME_SEGMENT1_TAG_ID = "segment_1_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT1_TAG_ID)
  private Integer segment1TagId;

  public static final String SERIALIZED_NAME_SEGMENT2_TAG_ID = "segment_2_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT2_TAG_ID)
  private Integer segment2TagId;

  public static final String SERIALIZED_NAME_SEGMENT3_TAG_ID = "segment_3_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT3_TAG_ID)
  private Integer segment3TagId;

  public static final String SERIALIZED_NAME_TAG_IDS = "tag_ids";
  @SerializedName(SERIALIZED_NAME_TAG_IDS)
  private List<Integer> tagIds = null;

  public static final String SERIALIZED_NAME_TAX_CODE = "tax_code";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private Integer taxCode;

  public static final String SERIALIZED_NAME_VAT = "vat";
  @SerializedName(SERIALIZED_NAME_VAT)
  private Integer vat;


  public RenewCreateParamsDetails accountItemId(Integer accountItemId) {
    
    this.accountItemId = accountItemId;
    return this;
  }

   /**
   * 勘定科目ID
   * minimum: 1
   * maximum: 2147483647
   * @return accountItemId
  **/
  @ApiModelProperty(example = "1", required = true, value = "勘定科目ID")

  public Integer getAccountItemId() {
    return accountItemId;
  }


  public void setAccountItemId(Integer accountItemId) {
    this.accountItemId = accountItemId;
  }


  public RenewCreateParamsDetails amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 取引金額（税込で指定してください）
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return amount
  **/
  @ApiModelProperty(example = "1080", required = true, value = "取引金額（税込で指定してください）")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public RenewCreateParamsDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 備考
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "備考", value = "備考")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RenewCreateParamsDetails itemId(Integer itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 品目ID
   * minimum: 1
   * maximum: 2147483647
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "品目ID")

  public Integer getItemId() {
    return itemId;
  }


  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }


  public RenewCreateParamsDetails sectionId(Integer sectionId) {
    
    this.sectionId = sectionId;
    return this;
  }

   /**
   * 部門ID
   * minimum: 1
   * maximum: 2147483647
   * @return sectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "部門ID")

  public Integer getSectionId() {
    return sectionId;
  }


  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }


  public RenewCreateParamsDetails segment1TagId(Integer segment1TagId) {
    
    this.segment1TagId = segment1TagId;
    return this;
  }

   /**
   * セグメント１ID
   * minimum: 1
   * maximum: 9223372036854775807
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


  public RenewCreateParamsDetails segment2TagId(Integer segment2TagId) {
    
    this.segment2TagId = segment2TagId;
    return this;
  }

   /**
   * セグメント２ID
   * minimum: 1
   * maximum: 9223372036854775807
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


  public RenewCreateParamsDetails segment3TagId(Integer segment3TagId) {
    
    this.segment3TagId = segment3TagId;
    return this;
  }

   /**
   * セグメント３ID
   * minimum: 1
   * maximum: 9223372036854775807
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


  public RenewCreateParamsDetails tagIds(List<Integer> tagIds) {
    
    this.tagIds = tagIds;
    return this;
  }

  public RenewCreateParamsDetails addTagIdsItem(Integer tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * メモタグID
   * @return tagIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1,2,3]", value = "メモタグID")

  public List<Integer> getTagIds() {
    return tagIds;
  }


  public void setTagIds(List<Integer> tagIds) {
    this.tagIds = tagIds;
  }


  public RenewCreateParamsDetails taxCode(Integer taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * 税区分コード
   * minimum: 0
   * maximum: 2147483647
   * @return taxCode
  **/
  @ApiModelProperty(example = "1", required = true, value = "税区分コード")

  public Integer getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(Integer taxCode) {
    this.taxCode = taxCode;
  }


  public RenewCreateParamsDetails vat(Integer vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * 消費税額（指定しない場合は自動で計算されます）
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return vat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "80", value = "消費税額（指定しない場合は自動で計算されます）")

  public Integer getVat() {
    return vat;
  }


  public void setVat(Integer vat) {
    this.vat = vat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewCreateParamsDetails renewCreateParamsDetails = (RenewCreateParamsDetails) o;
    return Objects.equals(this.accountItemId, renewCreateParamsDetails.accountItemId) &&
        Objects.equals(this.amount, renewCreateParamsDetails.amount) &&
        Objects.equals(this.description, renewCreateParamsDetails.description) &&
        Objects.equals(this.itemId, renewCreateParamsDetails.itemId) &&
        Objects.equals(this.sectionId, renewCreateParamsDetails.sectionId) &&
        Objects.equals(this.segment1TagId, renewCreateParamsDetails.segment1TagId) &&
        Objects.equals(this.segment2TagId, renewCreateParamsDetails.segment2TagId) &&
        Objects.equals(this.segment3TagId, renewCreateParamsDetails.segment3TagId) &&
        Objects.equals(this.tagIds, renewCreateParamsDetails.tagIds) &&
        Objects.equals(this.taxCode, renewCreateParamsDetails.taxCode) &&
        Objects.equals(this.vat, renewCreateParamsDetails.vat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItemId, amount, description, itemId, sectionId, segment1TagId, segment2TagId, segment3TagId, tagIds, taxCode, vat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewCreateParamsDetails {\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    segment1TagId: ").append(toIndentedString(segment1TagId)).append("\n");
    sb.append("    segment2TagId: ").append(toIndentedString(segment2TagId)).append("\n");
    sb.append("    segment3TagId: ").append(toIndentedString(segment3TagId)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
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

