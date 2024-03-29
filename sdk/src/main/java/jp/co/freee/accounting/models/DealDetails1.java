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
 * DealDetails1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DealDetails1 {
  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_ID = "account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_ID)
  private Integer accountItemId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

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
  private List<Integer> tagIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAX_CODE = "tax_code";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private Integer taxCode;

  public static final String SERIALIZED_NAME_VAT = "vat";
  @SerializedName(SERIALIZED_NAME_VAT)
  private Integer vat;

  public DealDetails1() { 
  }

  public DealDetails1 accountItemId(Integer accountItemId) {
    
    this.accountItemId = accountItemId;
    return this;
  }

   /**
   * 勘定科目ID
   * minimum: 1
   * maximum: 2147483647
   * @return accountItemId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "勘定科目ID")

  public Integer getAccountItemId() {
    return accountItemId;
  }


  public void setAccountItemId(Integer accountItemId) {
    this.accountItemId = accountItemId;
  }


  public DealDetails1 amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 金額（税込で指定してください）
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "108000", required = true, value = "金額（税込で指定してください）")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public DealDetails1 description(String description) {
    
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


  public DealDetails1 entrySide(EntrySideEnum entrySide) {
    
    this.entrySide = entrySide;
    return this;
  }

   /**
   * 貸借(貸方: credit, 借方: debit)
   * @return entrySide
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "debit", required = true, value = "貸借(貸方: credit, 借方: debit)")

  public EntrySideEnum getEntrySide() {
    return entrySide;
  }


  public void setEntrySide(EntrySideEnum entrySide) {
    this.entrySide = entrySide;
  }


  public DealDetails1 id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * +更新の明細行ID
   * minimum: 1
   * maximum: 9223372036854775807
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "+更新の明細行ID")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public DealDetails1 itemId(Integer itemId) {
    
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


  public DealDetails1 sectionId(Integer sectionId) {
    
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


  public DealDetails1 segment1TagId(Long segment1TagId) {
    
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

  public Long getSegment1TagId() {
    return segment1TagId;
  }


  public void setSegment1TagId(Long segment1TagId) {
    this.segment1TagId = segment1TagId;
  }


  public DealDetails1 segment2TagId(Long segment2TagId) {
    
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

  public Long getSegment2TagId() {
    return segment2TagId;
  }


  public void setSegment2TagId(Long segment2TagId) {
    this.segment2TagId = segment2TagId;
  }


  public DealDetails1 segment3TagId(Long segment3TagId) {
    
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

  public Long getSegment3TagId() {
    return segment3TagId;
  }


  public void setSegment3TagId(Long segment3TagId) {
    this.segment3TagId = segment3TagId;
  }


  public DealDetails1 tagIds(List<Integer> tagIds) {
    
    this.tagIds = tagIds;
    return this;
  }

  public DealDetails1 addTagIdsItem(Integer tagIdsItem) {
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * Get tagIds
   * @return tagIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getTagIds() {
    return tagIds;
  }


  public void setTagIds(List<Integer> tagIds) {
    this.tagIds = tagIds;
  }


  public DealDetails1 taxCode(Integer taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * 税区分コード
   * minimum: 0
   * maximum: 2147483647
   * @return taxCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "税区分コード")

  public Integer getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(Integer taxCode) {
    this.taxCode = taxCode;
  }


  public DealDetails1 vat(Integer vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * 消費税額（指定しない場合は自動で計算されます）
   * @return vat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8000", required = true, value = "消費税額（指定しない場合は自動で計算されます）")

  public Integer getVat() {
    return vat;
  }


  public void setVat(Integer vat) {
    this.vat = vat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealDetails1 dealDetails1 = (DealDetails1) o;
    return Objects.equals(this.accountItemId, dealDetails1.accountItemId) &&
        Objects.equals(this.amount, dealDetails1.amount) &&
        Objects.equals(this.description, dealDetails1.description) &&
        Objects.equals(this.entrySide, dealDetails1.entrySide) &&
        Objects.equals(this.id, dealDetails1.id) &&
        Objects.equals(this.itemId, dealDetails1.itemId) &&
        Objects.equals(this.sectionId, dealDetails1.sectionId) &&
        Objects.equals(this.segment1TagId, dealDetails1.segment1TagId) &&
        Objects.equals(this.segment2TagId, dealDetails1.segment2TagId) &&
        Objects.equals(this.segment3TagId, dealDetails1.segment3TagId) &&
        Objects.equals(this.tagIds, dealDetails1.tagIds) &&
        Objects.equals(this.taxCode, dealDetails1.taxCode) &&
        Objects.equals(this.vat, dealDetails1.vat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItemId, amount, description, entrySide, id, itemId, sectionId, segment1TagId, segment2TagId, segment3TagId, tagIds, taxCode, vat);
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
    sb.append("class DealDetails1 {\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entrySide: ").append(toIndentedString(entrySide)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

