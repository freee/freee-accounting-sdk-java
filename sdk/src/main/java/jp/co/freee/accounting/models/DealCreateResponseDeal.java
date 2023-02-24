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
import jp.co.freee.accounting.models.DealCreateResponseDealReceipts;
import jp.co.freee.accounting.models.DealDetails;
import jp.co.freee.accounting.models.DealPayments;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * DealCreateResponseDeal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DealCreateResponseDeal {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<DealDetails> details = null;

  public static final String SERIALIZED_NAME_DUE_AMOUNT = "due_amount";
  @SerializedName(SERIALIZED_NAME_DUE_AMOUNT)
  private Integer dueAmount;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private String dueDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_PARTNER_CODE = "partner_code";
  @SerializedName(SERIALIZED_NAME_PARTNER_CODE)
  private String partnerCode;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private List<DealPayments> payments = null;

  public static final String SERIALIZED_NAME_RECEIPTS = "receipts";
  @SerializedName(SERIALIZED_NAME_RECEIPTS)
  private List<DealCreateResponseDealReceipts> receipts = null;

  public static final String SERIALIZED_NAME_REF_NUMBER = "ref_number";
  @SerializedName(SERIALIZED_NAME_REF_NUMBER)
  private String refNumber;

  /**
   * 決済状況 (未決済: unsettled, 完了: settled)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNSETTLED("unsettled"),
    
    SETTLED("settled");

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

  /**
   * 収支区分 (収入: income, 支出: expense)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INCOME("income"),
    
    EXPENSE("expense");

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

  public DealCreateResponseDeal() { 
  }

  public DealCreateResponseDeal amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 金額
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5250", required = true, value = "金額")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public DealCreateResponseDeal companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 事業所ID
   * minimum: 1
   * maximum: 2147483647
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public DealCreateResponseDeal details(List<DealDetails> details) {
    
    this.details = details;
    return this;
  }

  public DealCreateResponseDeal addDetailsItem(DealDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * 取引の明細行
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "取引の明細行")

  public List<DealDetails> getDetails() {
    return details;
  }


  public void setDetails(List<DealDetails> details) {
    this.details = details;
  }


  public DealCreateResponseDeal dueAmount(Integer dueAmount) {
    
    this.dueAmount = dueAmount;
    return this;
  }

   /**
   * 支払残額
   * @return dueAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "支払残額")

  public Integer getDueAmount() {
    return dueAmount;
  }


  public void setDueAmount(Integer dueAmount) {
    this.dueAmount = dueAmount;
  }


  public DealCreateResponseDeal dueDate(String dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * 支払期日 (yyyy-mm-dd)
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17", value = "支払期日 (yyyy-mm-dd)")

  public String getDueDate() {
    return dueDate;
  }


  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  public DealCreateResponseDeal id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 取引ID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "101", required = true, value = "取引ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public DealCreateResponseDeal issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * 発生日 (yyyy-mm-dd)
   * @return issueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-17", required = true, value = "発生日 (yyyy-mm-dd)")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public DealCreateResponseDeal partnerCode(String partnerCode) {
    
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


  public DealCreateResponseDeal partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 取引先ID
   * minimum: 1
   * maximum: 2147483647
   * @return partnerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "201", required = true, value = "取引先ID")

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }


  public DealCreateResponseDeal payments(List<DealPayments> payments) {
    
    this.payments = payments;
    return this;
  }

  public DealCreateResponseDeal addPaymentsItem(DealPayments paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * 取引の支払行
   * @return payments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "取引の支払行")

  public List<DealPayments> getPayments() {
    return payments;
  }


  public void setPayments(List<DealPayments> payments) {
    this.payments = payments;
  }


  public DealCreateResponseDeal receipts(List<DealCreateResponseDealReceipts> receipts) {
    
    this.receipts = receipts;
    return this;
  }

  public DealCreateResponseDeal addReceiptsItem(DealCreateResponseDealReceipts receiptsItem) {
    if (this.receipts == null) {
      this.receipts = new ArrayList<>();
    }
    this.receipts.add(receiptsItem);
    return this;
  }

   /**
   * ファイルボックス（証憑ファイル）
   * @return receipts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ファイルボックス（証憑ファイル）")

  public List<DealCreateResponseDealReceipts> getReceipts() {
    return receipts;
  }


  public void setReceipts(List<DealCreateResponseDealReceipts> receipts) {
    this.receipts = receipts;
  }


  public DealCreateResponseDeal refNumber(String refNumber) {
    
    this.refNumber = refNumber;
    return this;
  }

   /**
   * 管理番号
   * @return refNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123-456", value = "管理番号")

  public String getRefNumber() {
    return refNumber;
  }


  public void setRefNumber(String refNumber) {
    this.refNumber = refNumber;
  }


  public DealCreateResponseDeal status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * 決済状況 (未決済: unsettled, 完了: settled)
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "settled", required = true, value = "決済状況 (未決済: unsettled, 完了: settled)")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public DealCreateResponseDeal type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * 収支区分 (収入: income, 支出: expense)
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "expense", value = "収支区分 (収入: income, 支出: expense)")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealCreateResponseDeal dealCreateResponseDeal = (DealCreateResponseDeal) o;
    return Objects.equals(this.amount, dealCreateResponseDeal.amount) &&
        Objects.equals(this.companyId, dealCreateResponseDeal.companyId) &&
        Objects.equals(this.details, dealCreateResponseDeal.details) &&
        Objects.equals(this.dueAmount, dealCreateResponseDeal.dueAmount) &&
        Objects.equals(this.dueDate, dealCreateResponseDeal.dueDate) &&
        Objects.equals(this.id, dealCreateResponseDeal.id) &&
        Objects.equals(this.issueDate, dealCreateResponseDeal.issueDate) &&
        Objects.equals(this.partnerCode, dealCreateResponseDeal.partnerCode) &&
        Objects.equals(this.partnerId, dealCreateResponseDeal.partnerId) &&
        Objects.equals(this.payments, dealCreateResponseDeal.payments) &&
        Objects.equals(this.receipts, dealCreateResponseDeal.receipts) &&
        Objects.equals(this.refNumber, dealCreateResponseDeal.refNumber) &&
        Objects.equals(this.status, dealCreateResponseDeal.status) &&
        Objects.equals(this.type, dealCreateResponseDeal.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, companyId, details, dueAmount, dueDate, id, issueDate, partnerCode, partnerId, payments, receipts, refNumber, status, type);
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
    sb.append("class DealCreateResponseDeal {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    dueAmount: ").append(toIndentedString(dueAmount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    receipts: ").append(toIndentedString(receipts)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

