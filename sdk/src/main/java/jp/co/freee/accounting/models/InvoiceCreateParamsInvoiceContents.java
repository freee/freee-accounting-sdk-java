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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * InvoiceCreateParamsInvoiceContents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceCreateParamsInvoiceContents {
  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_ID = "account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_ID)
  private Integer accountItemId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_QTY = "qty";
  @SerializedName(SERIALIZED_NAME_QTY)
  private BigDecimal qty;

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

  /**
   * 行の種類 &lt;ul&gt; &lt;li&gt;normal、discountを指定する場合、account_item_id,tax_codeとunit_priceが必須となります。&lt;/li&gt; &lt;li&gt;normalを指定した場合、qtyが必須となります。&lt;/li&gt; &lt;/ul&gt;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NORMAL("normal"),
    
    DISCOUNT("discount"),
    
    TEXT("text");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unit_price";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_VAT = "vat";
  @SerializedName(SERIALIZED_NAME_VAT)
  private Integer vat;

  public InvoiceCreateParamsInvoiceContents() { 
  }

  public InvoiceCreateParamsInvoiceContents accountItemId(Integer accountItemId) {
    
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


  public InvoiceCreateParamsInvoiceContents description(String description) {
    
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


  public InvoiceCreateParamsInvoiceContents itemId(Integer itemId) {
    
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


  public InvoiceCreateParamsInvoiceContents order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * 順序
   * minimum: 0
   * maximum: 2147483647
   * @return order
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "順序")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public InvoiceCreateParamsInvoiceContents qty(BigDecimal qty) {
    
    this.qty = qty;
    return this;
  }

   /**
   * 数量
   * minimum: 0
   * maximum: 99999999
   * @return qty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "数量")

  public BigDecimal getQty() {
    return qty;
  }


  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }


  public InvoiceCreateParamsInvoiceContents sectionId(Integer sectionId) {
    
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


  public InvoiceCreateParamsInvoiceContents segment1TagId(Long segment1TagId) {
    
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


  public InvoiceCreateParamsInvoiceContents segment2TagId(Long segment2TagId) {
    
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


  public InvoiceCreateParamsInvoiceContents segment3TagId(Long segment3TagId) {
    
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


  public InvoiceCreateParamsInvoiceContents tagIds(List<Integer> tagIds) {
    
    this.tagIds = tagIds;
    return this;
  }

  public InvoiceCreateParamsInvoiceContents addTagIdsItem(Integer tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * Get tagIds
   * @return tagIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTagIds() {
    return tagIds;
  }


  public void setTagIds(List<Integer> tagIds) {
    this.tagIds = tagIds;
  }


  public InvoiceCreateParamsInvoiceContents taxCode(Integer taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * 税区分コード
   * minimum: 0
   * maximum: 2147483647
   * @return taxCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "税区分コード")

  public Integer getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(Integer taxCode) {
    this.taxCode = taxCode;
  }


  public InvoiceCreateParamsInvoiceContents type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * 行の種類 &lt;ul&gt; &lt;li&gt;normal、discountを指定する場合、account_item_id,tax_codeとunit_priceが必須となります。&lt;/li&gt; &lt;li&gt;normalを指定した場合、qtyが必須となります。&lt;/li&gt; &lt;/ul&gt;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "normal", required = true, value = "行の種類 <ul> <li>normal、discountを指定する場合、account_item_id,tax_codeとunit_priceが必須となります。</li> <li>normalを指定した場合、qtyが必須となります。</li> </ul>")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InvoiceCreateParamsInvoiceContents unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * 単位
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "個", value = "単位")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public InvoiceCreateParamsInvoiceContents unitPrice(BigDecimal unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * 単価 (tax_entry_method: inclusiveの場合は税込価格、tax_entry_method: exclusiveの場合は税抜価格となります)
   * minimum: -999999999999
   * maximum: 999999999999
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "単価 (tax_entry_method: inclusiveの場合は税込価格、tax_entry_method: exclusiveの場合は税抜価格となります)")

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public InvoiceCreateParamsInvoiceContents vat(Integer vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * 消費税額
   * @return vat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8000", value = "消費税額")

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
    InvoiceCreateParamsInvoiceContents invoiceCreateParamsInvoiceContents = (InvoiceCreateParamsInvoiceContents) o;
    return Objects.equals(this.accountItemId, invoiceCreateParamsInvoiceContents.accountItemId) &&
        Objects.equals(this.description, invoiceCreateParamsInvoiceContents.description) &&
        Objects.equals(this.itemId, invoiceCreateParamsInvoiceContents.itemId) &&
        Objects.equals(this.order, invoiceCreateParamsInvoiceContents.order) &&
        Objects.equals(this.qty, invoiceCreateParamsInvoiceContents.qty) &&
        Objects.equals(this.sectionId, invoiceCreateParamsInvoiceContents.sectionId) &&
        Objects.equals(this.segment1TagId, invoiceCreateParamsInvoiceContents.segment1TagId) &&
        Objects.equals(this.segment2TagId, invoiceCreateParamsInvoiceContents.segment2TagId) &&
        Objects.equals(this.segment3TagId, invoiceCreateParamsInvoiceContents.segment3TagId) &&
        Objects.equals(this.tagIds, invoiceCreateParamsInvoiceContents.tagIds) &&
        Objects.equals(this.taxCode, invoiceCreateParamsInvoiceContents.taxCode) &&
        Objects.equals(this.type, invoiceCreateParamsInvoiceContents.type) &&
        Objects.equals(this.unit, invoiceCreateParamsInvoiceContents.unit) &&
        Objects.equals(this.unitPrice, invoiceCreateParamsInvoiceContents.unitPrice) &&
        Objects.equals(this.vat, invoiceCreateParamsInvoiceContents.vat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItemId, description, itemId, order, qty, sectionId, segment1TagId, segment2TagId, segment3TagId, tagIds, taxCode, type, unit, unitPrice, vat);
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
    sb.append("class InvoiceCreateParamsInvoiceContents {\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    segment1TagId: ").append(toIndentedString(segment1TagId)).append("\n");
    sb.append("    segment2TagId: ").append(toIndentedString(segment2TagId)).append("\n");
    sb.append("    segment3TagId: ").append(toIndentedString(segment3TagId)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

