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
import jp.co.freee.accounting.models.ApprovalRequestResponseApprovalRequestRequestItems;

/**
 * ApprovalRequestsIndexResponseApprovalRequests
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApprovalRequestsIndexResponseApprovalRequests {
  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private Integer applicantId;

  public static final String SERIALIZED_NAME_APPLICATION_DATE = "application_date";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATE)
  private String applicationDate;

  public static final String SERIALIZED_NAME_APPLICATION_NUMBER = "application_number";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NUMBER)
  private String applicationNumber;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_CURRENT_ROUND = "current_round";
  @SerializedName(SERIALIZED_NAME_CURRENT_ROUND)
  private Integer currentRound;

  public static final String SERIALIZED_NAME_CURRENT_STEP_ID = "current_step_id";
  @SerializedName(SERIALIZED_NAME_CURRENT_STEP_ID)
  private Integer currentStepId;

  public static final String SERIALIZED_NAME_DEAL_ID = "deal_id";
  @SerializedName(SERIALIZED_NAME_DEAL_ID)
  private Integer dealId;

  /**
   * 取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:決済済み, unsettled:未決済)
   */
  @JsonAdapter(DealStatusEnum.Adapter.class)
  public enum DealStatusEnum {
    SETTLED("settled"),
    
    UNSETTLED("unsettled");

    private String value;

    DealStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DealStatusEnum fromValue(String value) {
      for (DealStatusEnum b : DealStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DealStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DealStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DealStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DealStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEAL_STATUS = "deal_status";
  @SerializedName(SERIALIZED_NAME_DEAL_STATUS)
  private DealStatusEnum dealStatus;

  public static final String SERIALIZED_NAME_FORM_ID = "form_id";
  @SerializedName(SERIALIZED_NAME_FORM_ID)
  private Integer formId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MANUAL_JOURNAL_ID = "manual_journal_id";
  @SerializedName(SERIALIZED_NAME_MANUAL_JOURNAL_ID)
  private Integer manualJournalId;

  public static final String SERIALIZED_NAME_REQUEST_ITEMS = "request_items";
  @SerializedName(SERIALIZED_NAME_REQUEST_ITEMS)
  private List<ApprovalRequestResponseApprovalRequestRequestItems> requestItems = new ArrayList<>();

  /**
   * 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("draft"),
    
    IN_PROGRESS("in_progress"),
    
    APPROVED("approved"),
    
    REJECTED("rejected"),
    
    FEEDBACK("feedback");

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

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public ApprovalRequestsIndexResponseApprovalRequests() { 
  }

  public ApprovalRequestsIndexResponseApprovalRequests applicantId(Integer applicantId) {
    
    this.applicantId = applicantId;
    return this;
  }

   /**
   * 申請者のユーザーID
   * minimum: 1
   * maximum: 2147483647
   * @return applicantId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "申請者のユーザーID")

  public Integer getApplicantId() {
    return applicantId;
  }


  public void setApplicantId(Integer applicantId) {
    this.applicantId = applicantId;
  }


  public ApprovalRequestsIndexResponseApprovalRequests applicationDate(String applicationDate) {
    
    this.applicationDate = applicationDate;
    return this;
  }

   /**
   * 申請日 (yyyy-mm-dd)
   * @return applicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-17", required = true, value = "申請日 (yyyy-mm-dd)")

  public String getApplicationDate() {
    return applicationDate;
  }


  public void setApplicationDate(String applicationDate) {
    this.applicationDate = applicationDate;
  }


  public ApprovalRequestsIndexResponseApprovalRequests applicationNumber(String applicationNumber) {
    
    this.applicationNumber = applicationNumber;
    return this;
  }

   /**
   * 申請No.
   * @return applicationNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "申請No.")

  public String getApplicationNumber() {
    return applicationNumber;
  }


  public void setApplicationNumber(String applicationNumber) {
    this.applicationNumber = applicationNumber;
  }


  public ApprovalRequestsIndexResponseApprovalRequests companyId(Integer companyId) {
    
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


  public ApprovalRequestsIndexResponseApprovalRequests currentRound(Integer currentRound) {
    
    this.currentRound = currentRound;
    return this;
  }

   /**
   * 現在のround。差し戻し等により申請がstepの最初からやり直しになるとroundの値が増えます。
   * minimum: 0
   * maximum: 2147483647
   * @return currentRound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "現在のround。差し戻し等により申請がstepの最初からやり直しになるとroundの値が増えます。")

  public Integer getCurrentRound() {
    return currentRound;
  }


  public void setCurrentRound(Integer currentRound) {
    this.currentRound = currentRound;
  }


  public ApprovalRequestsIndexResponseApprovalRequests currentStepId(Integer currentStepId) {
    
    this.currentStepId = currentStepId;
    return this;
  }

   /**
   * 現在承認ステップID
   * minimum: 1
   * maximum: 2147483647
   * @return currentStepId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "現在承認ステップID")

  public Integer getCurrentStepId() {
    return currentStepId;
  }


  public void setCurrentStepId(Integer currentStepId) {
    this.currentStepId = currentStepId;
  }


  public ApprovalRequestsIndexResponseApprovalRequests dealId(Integer dealId) {
    
    this.dealId = dealId;
    return this;
  }

   /**
   * 取引ID (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_idが表示されます)
   * minimum: 1
   * maximum: 2147483647
   * @return dealId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "取引ID (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_idが表示されます)")

  public Integer getDealId() {
    return dealId;
  }


  public void setDealId(Integer dealId) {
    this.dealId = dealId;
  }


  public ApprovalRequestsIndexResponseApprovalRequests dealStatus(DealStatusEnum dealStatus) {
    
    this.dealStatus = dealStatus;
    return this;
  }

   /**
   * 取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:決済済み, unsettled:未決済)
   * @return dealStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "settled", required = true, value = "取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:決済済み, unsettled:未決済)")

  public DealStatusEnum getDealStatus() {
    return dealStatus;
  }


  public void setDealStatus(DealStatusEnum dealStatus) {
    this.dealStatus = dealStatus;
  }


  public ApprovalRequestsIndexResponseApprovalRequests formId(Integer formId) {
    
    this.formId = formId;
    return this;
  }

   /**
   * 申請フォームID
   * minimum: 1
   * maximum: 2147483647
   * @return formId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "申請フォームID")

  public Integer getFormId() {
    return formId;
  }


  public void setFormId(Integer formId) {
    this.formId = formId;
  }


  public ApprovalRequestsIndexResponseApprovalRequests id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 各種申請ID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "各種申請ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ApprovalRequestsIndexResponseApprovalRequests manualJournalId(Integer manualJournalId) {
    
    this.manualJournalId = manualJournalId;
    return this;
  }

   /**
   * 振替伝票のID (申請ステータス:statusがapprovedで、関連する振替伝票が存在する時のみmanual_journal_idが表示されます)  &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/115003827683-#5\&quot; target&#x3D;\&quot;_blank\&quot;&gt;承認された各種申請から支払依頼等を作成する&lt;/a&gt; 
   * minimum: 1
   * maximum: 2147483647
   * @return manualJournalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "振替伝票のID (申請ステータス:statusがapprovedで、関連する振替伝票が存在する時のみmanual_journal_idが表示されます)  <a href=\"https://support.freee.co.jp/hc/ja/articles/115003827683-#5\" target=\"_blank\">承認された各種申請から支払依頼等を作成する</a> ")

  public Integer getManualJournalId() {
    return manualJournalId;
  }


  public void setManualJournalId(Integer manualJournalId) {
    this.manualJournalId = manualJournalId;
  }


  public ApprovalRequestsIndexResponseApprovalRequests requestItems(List<ApprovalRequestResponseApprovalRequestRequestItems> requestItems) {
    
    this.requestItems = requestItems;
    return this;
  }

  public ApprovalRequestsIndexResponseApprovalRequests addRequestItemsItem(ApprovalRequestResponseApprovalRequestRequestItems requestItemsItem) {
    this.requestItems.add(requestItemsItem);
    return this;
  }

   /**
   * 各種申請の項目一覧（配列）
   * @return requestItems
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "各種申請の項目一覧（配列）")

  public List<ApprovalRequestResponseApprovalRequestRequestItems> getRequestItems() {
    return requestItems;
  }


  public void setRequestItems(List<ApprovalRequestResponseApprovalRequestRequestItems> requestItems) {
    this.requestItems = requestItems;
  }


  public ApprovalRequestsIndexResponseApprovalRequests status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "draft", required = true, value = "申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ApprovalRequestsIndexResponseApprovalRequests title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 申請タイトル
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "大阪出張", required = true, value = "申請タイトル")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalRequestsIndexResponseApprovalRequests approvalRequestsIndexResponseApprovalRequests = (ApprovalRequestsIndexResponseApprovalRequests) o;
    return Objects.equals(this.applicantId, approvalRequestsIndexResponseApprovalRequests.applicantId) &&
        Objects.equals(this.applicationDate, approvalRequestsIndexResponseApprovalRequests.applicationDate) &&
        Objects.equals(this.applicationNumber, approvalRequestsIndexResponseApprovalRequests.applicationNumber) &&
        Objects.equals(this.companyId, approvalRequestsIndexResponseApprovalRequests.companyId) &&
        Objects.equals(this.currentRound, approvalRequestsIndexResponseApprovalRequests.currentRound) &&
        Objects.equals(this.currentStepId, approvalRequestsIndexResponseApprovalRequests.currentStepId) &&
        Objects.equals(this.dealId, approvalRequestsIndexResponseApprovalRequests.dealId) &&
        Objects.equals(this.dealStatus, approvalRequestsIndexResponseApprovalRequests.dealStatus) &&
        Objects.equals(this.formId, approvalRequestsIndexResponseApprovalRequests.formId) &&
        Objects.equals(this.id, approvalRequestsIndexResponseApprovalRequests.id) &&
        Objects.equals(this.manualJournalId, approvalRequestsIndexResponseApprovalRequests.manualJournalId) &&
        Objects.equals(this.requestItems, approvalRequestsIndexResponseApprovalRequests.requestItems) &&
        Objects.equals(this.status, approvalRequestsIndexResponseApprovalRequests.status) &&
        Objects.equals(this.title, approvalRequestsIndexResponseApprovalRequests.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, applicationDate, applicationNumber, companyId, currentRound, currentStepId, dealId, dealStatus, formId, id, manualJournalId, requestItems, status, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalRequestsIndexResponseApprovalRequests {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    applicationNumber: ").append(toIndentedString(applicationNumber)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    currentRound: ").append(toIndentedString(currentRound)).append("\n");
    sb.append("    currentStepId: ").append(toIndentedString(currentStepId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    dealStatus: ").append(toIndentedString(dealStatus)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manualJournalId: ").append(toIndentedString(manualJournalId)).append("\n");
    sb.append("    requestItems: ").append(toIndentedString(requestItems)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

