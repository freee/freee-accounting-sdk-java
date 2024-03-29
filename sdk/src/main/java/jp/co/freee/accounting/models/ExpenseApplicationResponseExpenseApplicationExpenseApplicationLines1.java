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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1 {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXPENSE_APPLICATION_LINE_TEMPLATE_ID = "expense_application_line_template_id";
  @SerializedName(SERIALIZED_NAME_EXPENSE_APPLICATION_LINE_TEMPLATE_ID)
  private Integer expenseApplicationLineTemplateId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1() { 
  }

  public ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1 amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 金額
   * minimum: 0
   * maximum: 2147483647
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30000", value = "金額")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 内容
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "交通費：新幹線往復（東京〜大阪）", value = "内容")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1 expenseApplicationLineTemplateId(Integer expenseApplicationLineTemplateId) {
    
    this.expenseApplicationLineTemplateId = expenseApplicationLineTemplateId;
    return this;
  }

   /**
   * 経費科目ID
   * minimum: 1
   * maximum: 2147483647
   * @return expenseApplicationLineTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "505", value = "経費科目ID")

  public Integer getExpenseApplicationLineTemplateId() {
    return expenseApplicationLineTemplateId;
  }


  public void setExpenseApplicationLineTemplateId(Integer expenseApplicationLineTemplateId) {
    this.expenseApplicationLineTemplateId = expenseApplicationLineTemplateId;
  }


  public ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1 id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 明細行ID
   * minimum: 1
   * maximum: 9223372036854775807
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "明細行ID")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1 expenseApplicationResponseExpenseApplicationExpenseApplicationLines1 = (ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1) o;
    return Objects.equals(this.amount, expenseApplicationResponseExpenseApplicationExpenseApplicationLines1.amount) &&
        Objects.equals(this.description, expenseApplicationResponseExpenseApplicationExpenseApplicationLines1.description) &&
        Objects.equals(this.expenseApplicationLineTemplateId, expenseApplicationResponseExpenseApplicationExpenseApplicationLines1.expenseApplicationLineTemplateId) &&
        Objects.equals(this.id, expenseApplicationResponseExpenseApplicationExpenseApplicationLines1.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, expenseApplicationLineTemplateId, id);
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
    sb.append("class ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1 {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expenseApplicationLineTemplateId: ").append(toIndentedString(expenseApplicationLineTemplateId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

