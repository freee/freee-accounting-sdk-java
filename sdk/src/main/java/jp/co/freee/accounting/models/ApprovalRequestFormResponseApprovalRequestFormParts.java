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
import jp.co.freee.accounting.models.ApprovalRequestFormResponseApprovalRequestFormValues;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ApprovalRequestFormResponseApprovalRequestFormParts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApprovalRequestFormResponseApprovalRequestFormParts {
  public static final String SERIALIZED_NAME_ANNOTATION = "annotation";
  @SerializedName(SERIALIZED_NAME_ANNOTATION)
  private String annotation;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_MAX_AMOUNT = "max_amount";
  @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
  private Integer maxAmount;

  public static final String SERIALIZED_NAME_MIN_AMOUNT = "min_amount";
  @SerializedName(SERIALIZED_NAME_MIN_AMOUNT)
  private Integer minAmount;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  /**
   * 項目種別 (title: 申請タイトル, single_line: 自由記述形式 1行, multi_line: 自由記述形式 複数行, select: プルダウン, date: 日付, amount: 金額, receipt: 添付ファイル, section: 部門ID, partner: 取引先ID, ninja_sign_document: 契約書（freeeサイン連携）)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TITLE("title"),
    
    SINGLE_LINE("single_line"),
    
    MULTI_LINE("multi_line"),
    
    SELECT("select"),
    
    DATE("date"),
    
    AMOUNT("amount"),
    
    RECEIPT("receipt"),
    
    SECTION("section"),
    
    PARTNER("partner"),
    
    NINJA_SIGN_DOCUMENT("ninja_sign_document");

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

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<ApprovalRequestFormResponseApprovalRequestFormValues> values = null;

  public ApprovalRequestFormResponseApprovalRequestFormParts() { 
  }

  public ApprovalRequestFormResponseApprovalRequestFormParts annotation(String annotation) {
    
    this.annotation = annotation;
    return this;
  }

   /**
   * 追加説明
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "追加説明", value = "追加説明")

  public String getAnnotation() {
    return annotation;
  }


  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }


  public ApprovalRequestFormResponseApprovalRequestFormParts id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 項目ID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "項目ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ApprovalRequestFormResponseApprovalRequestFormParts label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * 項目名
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "項目名", value = "項目名")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ApprovalRequestFormResponseApprovalRequestFormParts maxAmount(Integer maxAmount) {
    
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * 上限金額
   * minimum: 0
   * maximum: 2147483647
   * @return maxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000", value = "上限金額")

  public Integer getMaxAmount() {
    return maxAmount;
  }


  public void setMaxAmount(Integer maxAmount) {
    this.maxAmount = maxAmount;
  }


  public ApprovalRequestFormResponseApprovalRequestFormParts minAmount(Integer minAmount) {
    
    this.minAmount = minAmount;
    return this;
  }

   /**
   * 下限金額
   * minimum: 0
   * maximum: 2147483647
   * @return minAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "下限金額")

  public Integer getMinAmount() {
    return minAmount;
  }


  public void setMinAmount(Integer minAmount) {
    this.minAmount = minAmount;
  }


  public ApprovalRequestFormResponseApprovalRequestFormParts order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * 順序
   * minimum: 0
   * maximum: 2147483647
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "順序")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public ApprovalRequestFormResponseApprovalRequestFormParts required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * 必須かどうか
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "必須かどうか")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public ApprovalRequestFormResponseApprovalRequestFormParts type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * 項目種別 (title: 申請タイトル, single_line: 自由記述形式 1行, multi_line: 自由記述形式 複数行, select: プルダウン, date: 日付, amount: 金額, receipt: 添付ファイル, section: 部門ID, partner: 取引先ID, ninja_sign_document: 契約書（freeeサイン連携）)
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "single_line", value = "項目種別 (title: 申請タイトル, single_line: 自由記述形式 1行, multi_line: 自由記述形式 複数行, select: プルダウン, date: 日付, amount: 金額, receipt: 添付ファイル, section: 部門ID, partner: 取引先ID, ninja_sign_document: 契約書（freeeサイン連携）)")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ApprovalRequestFormResponseApprovalRequestFormParts values(List<ApprovalRequestFormResponseApprovalRequestFormValues> values) {
    
    this.values = values;
    return this;
  }

  public ApprovalRequestFormResponseApprovalRequestFormParts addValuesItem(ApprovalRequestFormResponseApprovalRequestFormValues valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * 選択項目
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "選択項目")

  public List<ApprovalRequestFormResponseApprovalRequestFormValues> getValues() {
    return values;
  }


  public void setValues(List<ApprovalRequestFormResponseApprovalRequestFormValues> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalRequestFormResponseApprovalRequestFormParts approvalRequestFormResponseApprovalRequestFormParts = (ApprovalRequestFormResponseApprovalRequestFormParts) o;
    return Objects.equals(this.annotation, approvalRequestFormResponseApprovalRequestFormParts.annotation) &&
        Objects.equals(this.id, approvalRequestFormResponseApprovalRequestFormParts.id) &&
        Objects.equals(this.label, approvalRequestFormResponseApprovalRequestFormParts.label) &&
        Objects.equals(this.maxAmount, approvalRequestFormResponseApprovalRequestFormParts.maxAmount) &&
        Objects.equals(this.minAmount, approvalRequestFormResponseApprovalRequestFormParts.minAmount) &&
        Objects.equals(this.order, approvalRequestFormResponseApprovalRequestFormParts.order) &&
        Objects.equals(this.required, approvalRequestFormResponseApprovalRequestFormParts.required) &&
        Objects.equals(this.type, approvalRequestFormResponseApprovalRequestFormParts.type) &&
        Objects.equals(this.values, approvalRequestFormResponseApprovalRequestFormParts.values);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotation, id, label, maxAmount, minAmount, order, required, type, values);
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
    sb.append("class ApprovalRequestFormResponseApprovalRequestFormParts {\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

