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
import jp.co.freee.accounting.models.ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ExpenseApplicationResponseExpenseApplicationPurchaseLines
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseApplicationResponseExpenseApplicationPurchaseLines {
  public static final String SERIALIZED_NAME_EXPENSE_APPLICATION_LINES = "expense_application_lines";
  @SerializedName(SERIALIZED_NAME_EXPENSE_APPLICATION_LINES)
  private List<ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1> expenseApplicationLines = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_RECEIPT_ID = "receipt_id";
  @SerializedName(SERIALIZED_NAME_RECEIPT_ID)
  private Integer receiptId;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transaction_date";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private String transactionDate;

  public ExpenseApplicationResponseExpenseApplicationPurchaseLines() { 
  }

  public ExpenseApplicationResponseExpenseApplicationPurchaseLines expenseApplicationLines(List<ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1> expenseApplicationLines) {
    
    this.expenseApplicationLines = expenseApplicationLines;
    return this;
  }

  public ExpenseApplicationResponseExpenseApplicationPurchaseLines addExpenseApplicationLinesItem(ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1 expenseApplicationLinesItem) {
    if (this.expenseApplicationLines == null) {
      this.expenseApplicationLines = new ArrayList<>();
    }
    this.expenseApplicationLines.add(expenseApplicationLinesItem);
    return this;
  }

   /**
   * 明細行一覧（配列）
   * @return expenseApplicationLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "明細行一覧（配列）")

  public List<ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1> getExpenseApplicationLines() {
    return expenseApplicationLines;
  }


  public void setExpenseApplicationLines(List<ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines1> expenseApplicationLines) {
    this.expenseApplicationLines = expenseApplicationLines;
  }


  public ExpenseApplicationResponseExpenseApplicationPurchaseLines id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 経費申請の申請行ID
   * minimum: 1
   * maximum: 9223372036854775807
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "経費申請の申請行ID")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ExpenseApplicationResponseExpenseApplicationPurchaseLines receiptId(Integer receiptId) {
    
    this.receiptId = receiptId;
    return this;
  }

   /**
   * ファイルボックス（証憑ファイル）ID
   * minimum: 1
   * maximum: 2147483647
   * @return receiptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "606", value = "ファイルボックス（証憑ファイル）ID")

  public Integer getReceiptId() {
    return receiptId;
  }


  public void setReceiptId(Integer receiptId) {
    this.receiptId = receiptId;
  }


  public ExpenseApplicationResponseExpenseApplicationPurchaseLines transactionDate(String transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * 日付 (yyyy-mm-dd)
   * @return transactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17", value = "日付 (yyyy-mm-dd)")

  public String getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseApplicationResponseExpenseApplicationPurchaseLines expenseApplicationResponseExpenseApplicationPurchaseLines = (ExpenseApplicationResponseExpenseApplicationPurchaseLines) o;
    return Objects.equals(this.expenseApplicationLines, expenseApplicationResponseExpenseApplicationPurchaseLines.expenseApplicationLines) &&
        Objects.equals(this.id, expenseApplicationResponseExpenseApplicationPurchaseLines.id) &&
        Objects.equals(this.receiptId, expenseApplicationResponseExpenseApplicationPurchaseLines.receiptId) &&
        Objects.equals(this.transactionDate, expenseApplicationResponseExpenseApplicationPurchaseLines.transactionDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseApplicationLines, id, receiptId, transactionDate);
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
    sb.append("class ExpenseApplicationResponseExpenseApplicationPurchaseLines {\n");
    sb.append("    expenseApplicationLines: ").append(toIndentedString(expenseApplicationLines)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    receiptId: ").append(toIndentedString(receiptId)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
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
