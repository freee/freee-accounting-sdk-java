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
import jp.co.freee.accounting.models.RenewCreateParamsDetails;

/**
 * RenewCreateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RenewCreateParams {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<RenewCreateParamsDetails> details = new ArrayList<>();

  public static final String SERIALIZED_NAME_RENEW_TARGET_ID = "renew_target_id";
  @SerializedName(SERIALIZED_NAME_RENEW_TARGET_ID)
  private Long renewTargetId;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "update_date";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private String updateDate;

  public RenewCreateParams() { 
  }

  public RenewCreateParams companyId(Integer companyId) {
    
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


  public RenewCreateParams details(List<RenewCreateParamsDetails> details) {
    
    this.details = details;
    return this;
  }

  public RenewCreateParams addDetailsItem(RenewCreateParamsDetails detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

   /**
   * +更新の明細行
   * @return details
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "+更新の明細行")

  public List<RenewCreateParamsDetails> getDetails() {
    return details;
  }


  public void setDetails(List<RenewCreateParamsDetails> details) {
    this.details = details;
  }


  public RenewCreateParams renewTargetId(Long renewTargetId) {
    
    this.renewTargetId = renewTargetId;
    return this;
  }

   /**
   * +更新対象行ID (details(取引の明細行), accruals(債権債務行), renewsのdetails(+更新の明細行)のIDを指定) 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return renewTargetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "+更新対象行ID (details(取引の明細行), accruals(債権債務行), renewsのdetails(+更新の明細行)のIDを指定) ")

  public Long getRenewTargetId() {
    return renewTargetId;
  }


  public void setRenewTargetId(Long renewTargetId) {
    this.renewTargetId = renewTargetId;
  }


  public RenewCreateParams updateDate(String updateDate) {
    
    this.updateDate = updateDate;
    return this;
  }

   /**
   * 更新日 (yyyy-mm-dd)
   * @return updateDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-17", required = true, value = "更新日 (yyyy-mm-dd)")

  public String getUpdateDate() {
    return updateDate;
  }


  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewCreateParams renewCreateParams = (RenewCreateParams) o;
    return Objects.equals(this.companyId, renewCreateParams.companyId) &&
        Objects.equals(this.details, renewCreateParams.details) &&
        Objects.equals(this.renewTargetId, renewCreateParams.renewTargetId) &&
        Objects.equals(this.updateDate, renewCreateParams.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, details, renewTargetId, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewCreateParams {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    renewTargetId: ").append(toIndentedString(renewTargetId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

