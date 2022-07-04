/*
 * freee API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PaymentRequestUpdateParamsPaymentRequestLines
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentRequestUpdateParamsPaymentRequestLines {
  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_ID = "account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_ID)
  private Integer accountItemId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

  /**
   * &#39;行の種類 (deal_line: 支払依頼, withholding_tax: 源泉徴収税)&#39;&lt;br&gt; &#39;デフォルトは deal_line: 支払依頼 です&#39; 
   */
  @JsonAdapter(LineTypeEnum.Adapter.class)
  public enum LineTypeEnum {
    DEAL_LINE("deal_line"),
    
    WITHHOLDING_TAX("withholding_tax");

    private String value;

    LineTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LineTypeEnum fromValue(String value) {
      for (LineTypeEnum b : LineTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LineTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LineTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LineTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LineTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LINE_TYPE = "line_type";
  @SerializedName(SERIALIZED_NAME_LINE_TYPE)
  private LineTypeEnum lineType;

  public static final String SERIALIZED_NAME_SECTION_ID = "section_id";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private Integer sectionId;

  public static final String SERIALIZED_NAME_SEGMENT1_TAG_ID = "segment_1_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT1_TAG_ID)
  private Long segment1TagId;

  public static final String SERIALIZED_NAME_SEGMENT2_TAG_ID = "segment_2_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT2_TAG_ID)
  private Long segment2TagId;

  public static final String SERIALIZED_NAME_SEGMENT3_TAG_ID = "segment_3_tag_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT3_TAG_ID)
  private Long segment3TagId;

  public static final String SERIALIZED_NAME_TAG_IDS = "tag_ids";
  @SerializedName(SERIALIZED_NAME_TAG_IDS)
  private List<Integer> tagIds = null;

  public static final String SERIALIZED_NAME_TAX_CODE = "tax_code";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private Integer taxCode;

  public PaymentRequestUpdateParamsPaymentRequestLines() { 
  }

  public PaymentRequestUpdateParamsPaymentRequestLines accountItemId(Integer accountItemId) {
    
    this.accountItemId = accountItemId;
    return this;
  }

   /**
   * 勘定科目ID
   * minimum: 1
   * maximum: 2147483647
   * @return accountItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "勘定科目ID")

  public Integer getAccountItemId() {
    return accountItemId;
  }


  public void setAccountItemId(Integer accountItemId) {
    this.accountItemId = accountItemId;
  }


  public PaymentRequestUpdateParamsPaymentRequestLines amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 金額
   * minimum: 0
   * maximum: 99999999999
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30000", required = true, value = "金額")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public PaymentRequestUpdateParamsPaymentRequestLines description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 内容
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "原稿料", value = "内容")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentRequestUpdateParamsPaymentRequestLines id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 支払依頼の項目行ID: 既存項目行を更新する場合に指定します。IDを指定しない項目行は、新規行として扱われ追加されます。また、payment_request_linesに含まれない既存の項目行は削除されます。更新後も残したい行は、必ず支払依頼の項目行IDを指定してpayment_request_linesに含めてください。
   * minimum: 1
   * maximum: 9223372036854775807
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "支払依頼の項目行ID: 既存項目行を更新する場合に指定します。IDを指定しない項目行は、新規行として扱われ追加されます。また、payment_request_linesに含まれない既存の項目行は削除されます。更新後も残したい行は、必ず支払依頼の項目行IDを指定してpayment_request_linesに含めてください。")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public PaymentRequestUpdateParamsPaymentRequestLines itemId(Integer itemId) {
    
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


  public PaymentRequestUpdateParamsPaymentRequestLines lineType(LineTypeEnum lineType) {
    
    this.lineType = lineType;
    return this;
  }

   /**
   * &#39;行の種類 (deal_line: 支払依頼, withholding_tax: 源泉徴収税)&#39;&lt;br&gt; &#39;デフォルトは deal_line: 支払依頼 です&#39; 
   * @return lineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "deal_line", value = "'行の種類 (deal_line: 支払依頼, withholding_tax: 源泉徴収税)'<br> 'デフォルトは deal_line: 支払依頼 です' ")

  public LineTypeEnum getLineType() {
    return lineType;
  }


  public void setLineType(LineTypeEnum lineType) {
    this.lineType = lineType;
  }


  public PaymentRequestUpdateParamsPaymentRequestLines sectionId(Integer sectionId) {
    
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


  public PaymentRequestUpdateParamsPaymentRequestLines segment1TagId(Long segment1TagId) {
    
    this.segment1TagId = segment1TagId;
    return this;
  }

   /**
   * セグメント１ID&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt; 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return segment1TagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "セグメント１ID<br> セグメントタグ一覧APIを利用して取得してください。<br> <a href=\"https://support.freee.co.jp/hc/ja/articles/360020679611\" target=\"_blank\">セグメント（分析用タグ）の設定</a><br> ")

  public Long getSegment1TagId() {
    return segment1TagId;
  }


  public void setSegment1TagId(Long segment1TagId) {
    this.segment1TagId = segment1TagId;
  }


  public PaymentRequestUpdateParamsPaymentRequestLines segment2TagId(Long segment2TagId) {
    
    this.segment2TagId = segment2TagId;
    return this;
  }

   /**
   * セグメント２ID(法人向けエンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt; 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return segment2TagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "セグメント２ID(法人向けエンタープライズプラン)<br> セグメントタグ一覧APIを利用して取得してください。<br> <a href=\"https://support.freee.co.jp/hc/ja/articles/360020679611\" target=\"_blank\">セグメント（分析用タグ）の設定</a><br> ")

  public Long getSegment2TagId() {
    return segment2TagId;
  }


  public void setSegment2TagId(Long segment2TagId) {
    this.segment2TagId = segment2TagId;
  }


  public PaymentRequestUpdateParamsPaymentRequestLines segment3TagId(Long segment3TagId) {
    
    this.segment3TagId = segment3TagId;
    return this;
  }

   /**
   * セグメント３ID(法人向けエンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt; 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return segment3TagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "セグメント３ID(法人向けエンタープライズプラン)<br> セグメントタグ一覧APIを利用して取得してください。<br> <a href=\"https://support.freee.co.jp/hc/ja/articles/360020679611\" target=\"_blank\">セグメント（分析用タグ）の設定</a><br> ")

  public Long getSegment3TagId() {
    return segment3TagId;
  }


  public void setSegment3TagId(Long segment3TagId) {
    this.segment3TagId = segment3TagId;
  }


  public PaymentRequestUpdateParamsPaymentRequestLines tagIds(List<Integer> tagIds) {
    
    this.tagIds = tagIds;
    return this;
  }

  public PaymentRequestUpdateParamsPaymentRequestLines addTagIdsItem(Integer tagIdsItem) {
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


  public PaymentRequestUpdateParamsPaymentRequestLines taxCode(Integer taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * 税区分コード&lt;br&gt; 勘定科目IDを指定する場合は必須です。 
   * minimum: 0
   * maximum: 2147483647
   * @return taxCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "税区分コード<br> 勘定科目IDを指定する場合は必須です。 ")

  public Integer getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(Integer taxCode) {
    this.taxCode = taxCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequestUpdateParamsPaymentRequestLines paymentRequestUpdateParamsPaymentRequestLines = (PaymentRequestUpdateParamsPaymentRequestLines) o;
    return Objects.equals(this.accountItemId, paymentRequestUpdateParamsPaymentRequestLines.accountItemId) &&
        Objects.equals(this.amount, paymentRequestUpdateParamsPaymentRequestLines.amount) &&
        Objects.equals(this.description, paymentRequestUpdateParamsPaymentRequestLines.description) &&
        Objects.equals(this.id, paymentRequestUpdateParamsPaymentRequestLines.id) &&
        Objects.equals(this.itemId, paymentRequestUpdateParamsPaymentRequestLines.itemId) &&
        Objects.equals(this.lineType, paymentRequestUpdateParamsPaymentRequestLines.lineType) &&
        Objects.equals(this.sectionId, paymentRequestUpdateParamsPaymentRequestLines.sectionId) &&
        Objects.equals(this.segment1TagId, paymentRequestUpdateParamsPaymentRequestLines.segment1TagId) &&
        Objects.equals(this.segment2TagId, paymentRequestUpdateParamsPaymentRequestLines.segment2TagId) &&
        Objects.equals(this.segment3TagId, paymentRequestUpdateParamsPaymentRequestLines.segment3TagId) &&
        Objects.equals(this.tagIds, paymentRequestUpdateParamsPaymentRequestLines.tagIds) &&
        Objects.equals(this.taxCode, paymentRequestUpdateParamsPaymentRequestLines.taxCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItemId, amount, description, id, itemId, lineType, sectionId, segment1TagId, segment2TagId, segment3TagId, tagIds, taxCode);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestUpdateParamsPaymentRequestLines {\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    segment1TagId: ").append(toIndentedString(segment1TagId)).append("\n");
    sb.append("    segment2TagId: ").append(toIndentedString(segment2TagId)).append("\n");
    sb.append("    segment3TagId: ").append(toIndentedString(segment3TagId)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
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

