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
import jp.co.freee.accounting.models.PaymentRequestCreateParamsPaymentRequestLines;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PaymentRequestCreateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentRequestCreateParams {
  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  /**
   * &#39;口座種別(ordinary: 普通、checking: 当座、earmarked: 納税準備預金、savings: 貯蓄、other: その他)&#39;&lt;br&gt; &#39;支払先指定時には無効&#39;&lt;br&gt; &#39;デフォルトは ordinary: 普通 です&#39; 
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    ORDINARY("ordinary"),
    
    CHECKING("checking"),
    
    EARMARKED("earmarked"),
    
    SAVINGS("savings"),
    
    OTHER("other");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_APPLICATION_DATE = "application_date";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATE)
  private String applicationDate;

  public static final String SERIALIZED_NAME_APPROVAL_FLOW_ROUTE_ID = "approval_flow_route_id";
  @SerializedName(SERIALIZED_NAME_APPROVAL_FLOW_ROUTE_ID)
  private Integer approvalFlowRouteId;

  public static final String SERIALIZED_NAME_APPROVER_ID = "approver_id";
  @SerializedName(SERIALIZED_NAME_APPROVER_ID)
  private Integer approverId;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_NAME_KANA = "bank_name_kana";
  @SerializedName(SERIALIZED_NAME_BANK_NAME_KANA)
  private String bankNameKana;

  public static final String SERIALIZED_NAME_BRANCH_CODE = "branch_code";
  @SerializedName(SERIALIZED_NAME_BRANCH_CODE)
  private String branchCode;

  public static final String SERIALIZED_NAME_BRANCH_KANA = "branch_kana";
  @SerializedName(SERIALIZED_NAME_BRANCH_KANA)
  private String branchKana;

  public static final String SERIALIZED_NAME_BRANCH_NAME = "branch_name";
  @SerializedName(SERIALIZED_NAME_BRANCH_NAME)
  private String branchName;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOCUMENT_CODE = "document_code";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_CODE)
  private String documentCode;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_PARTNER_CODE = "partner_code";
  @SerializedName(SERIALIZED_NAME_PARTNER_CODE)
  private String partnerCode;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "payment_date";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private String paymentDate;

  /**
   * &#39;支払方法(none: 指定なし, domestic_bank_transfer: 国内振込, abroad_bank_transfer: 国外振込, account_transfer: 口座振替, credit_card: クレジットカード)&#39;&lt;br&gt; &#39;デフォルトは none: 指定なし です。&#39; 
   */
  @JsonAdapter(PaymentMethodEnum.Adapter.class)
  public enum PaymentMethodEnum {
    NONE("none"),
    
    DOMESTIC_BANK_TRANSFER("domestic_bank_transfer"),
    
    ABROAD_BANK_TRANSFER("abroad_bank_transfer"),
    
    ACCOUNT_TRANSFER("account_transfer"),
    
    CREDIT_CARD("credit_card");

    private String value;

    PaymentMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentMethodEnum fromValue(String value) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethodEnum paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_REQUEST_LINES = "payment_request_lines";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUEST_LINES)
  private List<PaymentRequestCreateParamsPaymentRequestLines> paymentRequestLines = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECEIPT_IDS = "receipt_ids";
  @SerializedName(SERIALIZED_NAME_RECEIPT_IDS)
  private List<Integer> receiptIds = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public PaymentRequestCreateParams() { 
  }

  public PaymentRequestCreateParams accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * 受取人名（カナ）（48文字以内）&lt;br&gt; 支払先指定時には無効 
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "フリータロウ", value = "受取人名（カナ）（48文字以内）<br> 支払先指定時には無効 ")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public PaymentRequestCreateParams accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * 口座番号（半角数字1桁〜7桁）&lt;br&gt; 支払先指定時には無効 
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1010101", value = "口座番号（半角数字1桁〜7桁）<br> 支払先指定時には無効 ")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public PaymentRequestCreateParams accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * &#39;口座種別(ordinary: 普通、checking: 当座、earmarked: 納税準備預金、savings: 貯蓄、other: その他)&#39;&lt;br&gt; &#39;支払先指定時には無効&#39;&lt;br&gt; &#39;デフォルトは ordinary: 普通 です&#39; 
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ordinary", value = "'口座種別(ordinary: 普通、checking: 当座、earmarked: 納税準備預金、savings: 貯蓄、other: その他)'<br> '支払先指定時には無効'<br> 'デフォルトは ordinary: 普通 です' ")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public PaymentRequestCreateParams applicationDate(String applicationDate) {
    
    this.applicationDate = applicationDate;
    return this;
  }

   /**
   * 申請日 (yyyy-mm-dd)&lt;br&gt; 指定しない場合は当日の日付が登録されます。 
   * @return applicationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17", value = "申請日 (yyyy-mm-dd)<br> 指定しない場合は当日の日付が登録されます。 ")

  public String getApplicationDate() {
    return applicationDate;
  }


  public void setApplicationDate(String applicationDate) {
    this.applicationDate = applicationDate;
  }


  public PaymentRequestCreateParams approvalFlowRouteId(Integer approvalFlowRouteId) {
    
    this.approvalFlowRouteId = approvalFlowRouteId;
    return this;
  }

   /**
   * 申請経路ID&lt;br&gt; 指定する申請経路IDは、申請経路APIを利用して取得してください。 
   * minimum: 1
   * maximum: 2147483647
   * @return approvalFlowRouteId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "申請経路ID<br> 指定する申請経路IDは、申請経路APIを利用して取得してください。 ")

  public Integer getApprovalFlowRouteId() {
    return approvalFlowRouteId;
  }


  public void setApprovalFlowRouteId(Integer approvalFlowRouteId) {
    this.approvalFlowRouteId = approvalFlowRouteId;
  }


  public PaymentRequestCreateParams approverId(Integer approverId) {
    
    this.approverId = approverId;
    return this;
  }

   /**
   * 承認者のユーザーID&lt;br&gt; 「承認者を指定」の経路を申請経路として使用する場合に指定してください。&lt;br&gt; 指定する承認者のユーザーIDは、申請経路APIを利用して取得してください。 
   * minimum: 1
   * maximum: 2147483647
   * @return approverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "承認者のユーザーID<br> 「承認者を指定」の経路を申請経路として使用する場合に指定してください。<br> 指定する承認者のユーザーIDは、申請経路APIを利用して取得してください。 ")

  public Integer getApproverId() {
    return approverId;
  }


  public void setApproverId(Integer approverId) {
    this.approverId = approverId;
  }


  public PaymentRequestCreateParams bankCode(String bankCode) {
    
    this.bankCode = bankCode;
    return this;
  }

   /**
   * 銀行コード（半角数字1桁〜4桁）&lt;br&gt; 支払先指定時には無効 
   * @return bankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0001", value = "銀行コード（半角数字1桁〜4桁）<br> 支払先指定時には無効 ")

  public String getBankCode() {
    return bankCode;
  }


  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  public PaymentRequestCreateParams bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * 銀行名（255文字以内）&lt;br&gt; 支払先指定時には無効 
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freee銀行", value = "銀行名（255文字以内）<br> 支払先指定時には無効 ")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public PaymentRequestCreateParams bankNameKana(String bankNameKana) {
    
    this.bankNameKana = bankNameKana;
    return this;
  }

   /**
   * 銀行名（カナ）（15文字以内）&lt;br&gt; 支払先指定時には無効 
   * @return bankNameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "フリーギンコウ", value = "銀行名（カナ）（15文字以内）<br> 支払先指定時には無効 ")

  public String getBankNameKana() {
    return bankNameKana;
  }


  public void setBankNameKana(String bankNameKana) {
    this.bankNameKana = bankNameKana;
  }


  public PaymentRequestCreateParams branchCode(String branchCode) {
    
    this.branchCode = branchCode;
    return this;
  }

   /**
   * 支店番号（半角数字1桁〜3桁）&lt;br&gt; 支払先指定時には無効 
   * @return branchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "101", value = "支店番号（半角数字1桁〜3桁）<br> 支払先指定時には無効 ")

  public String getBranchCode() {
    return branchCode;
  }


  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }


  public PaymentRequestCreateParams branchKana(String branchKana) {
    
    this.branchKana = branchKana;
    return this;
  }

   /**
   * 支店名（カナ）（15文字以内）&lt;br&gt; 指定可能な文字は、英数・カナ・丸括弧・ハイフン・スペースのみです。&lt;br&gt; 支払先指定時には無効 
   * @return branchKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ギンザシテン", value = "支店名（カナ）（15文字以内）<br> 指定可能な文字は、英数・カナ・丸括弧・ハイフン・スペースのみです。<br> 支払先指定時には無効 ")

  public String getBranchKana() {
    return branchKana;
  }


  public void setBranchKana(String branchKana) {
    this.branchKana = branchKana;
  }


  public PaymentRequestCreateParams branchName(String branchName) {
    
    this.branchName = branchName;
    return this;
  }

   /**
   * 支店名（255文字以内）&lt;br&gt; 支払先指定時には無効 
   * @return branchName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "銀座支店", value = "支店名（255文字以内）<br> 支払先指定時には無効 ")

  public String getBranchName() {
    return branchName;
  }


  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }


  public PaymentRequestCreateParams companyId(Integer companyId) {
    
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


  public PaymentRequestCreateParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 備考
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "◯◯連携先ID: cx12345", value = "備考")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentRequestCreateParams documentCode(String documentCode) {
    
    this.documentCode = documentCode;
    return this;
  }

   /**
   * 請求書番号（255文字以内）
   * @return documentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "請求書番号（255文字以内）")

  public String getDocumentCode() {
    return documentCode;
  }


  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }


  public PaymentRequestCreateParams draft(Boolean draft) {
    
    this.draft = draft;
    return this;
  }

   /**
   * 支払依頼のステータス&lt;br&gt; falseを指定した時は申請中（in_progress）で支払依頼を作成します。&lt;br&gt; trueを指定した時は下書き（draft）で支払依頼を作成します。&lt;br&gt; 未指定の時は下書きとみなして支払依頼を作成します。 
   * @return draft
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "支払依頼のステータス<br> falseを指定した時は申請中（in_progress）で支払依頼を作成します。<br> trueを指定した時は下書き（draft）で支払依頼を作成します。<br> 未指定の時は下書きとみなして支払依頼を作成します。 ")

  public Boolean getDraft() {
    return draft;
  }


  public void setDraft(Boolean draft) {
    this.draft = draft;
  }


  public PaymentRequestCreateParams issueDate(String issueDate) {
    
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


  public PaymentRequestCreateParams parentId(Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * 親申請ID(法人向け エンタープライズプラン、プロフェッショナルプラン)&lt;br&gt; &lt;ul&gt;   &lt;li&gt;承認済みの既存各種申請IDのみ指定可能です。&lt;/li&gt;   &lt;li&gt;各種申請一覧APIを利用して取得してください。&lt;/li&gt; &lt;/ul&gt; 
   * minimum: 1
   * maximum: 2147483647
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "親申請ID(法人向け エンタープライズプラン、プロフェッショナルプラン)<br> <ul>   <li>承認済みの既存各種申請IDのみ指定可能です。</li>   <li>各種申請一覧APIを利用して取得してください。</li> </ul> ")

  public Integer getParentId() {
    return parentId;
  }


  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public PaymentRequestCreateParams partnerCode(String partnerCode) {
    
    this.partnerCode = partnerCode;
    return this;
  }

   /**
   * 支払先の取引先コード&lt;br&gt; 支払先の取引先ID指定時には無効 
   * @return partnerCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "code001", value = "支払先の取引先コード<br> 支払先の取引先ID指定時には無効 ")

  public String getPartnerCode() {
    return partnerCode;
  }


  public void setPartnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
  }


  public PaymentRequestCreateParams partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 支払先の取引先ID
   * minimum: 1
   * maximum: 2147483647
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201", value = "支払先の取引先ID")

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }


  public PaymentRequestCreateParams paymentDate(String paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * 支払期限 (yyyy-mm-dd)
   * @return paymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17", value = "支払期限 (yyyy-mm-dd)")

  public String getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }


  public PaymentRequestCreateParams paymentMethod(PaymentMethodEnum paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * &#39;支払方法(none: 指定なし, domestic_bank_transfer: 国内振込, abroad_bank_transfer: 国外振込, account_transfer: 口座振替, credit_card: クレジットカード)&#39;&lt;br&gt; &#39;デフォルトは none: 指定なし です。&#39; 
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "'支払方法(none: 指定なし, domestic_bank_transfer: 国内振込, abroad_bank_transfer: 国外振込, account_transfer: 口座振替, credit_card: クレジットカード)'<br> 'デフォルトは none: 指定なし です。' ")

  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentRequestCreateParams paymentRequestLines(List<PaymentRequestCreateParamsPaymentRequestLines> paymentRequestLines) {
    
    this.paymentRequestLines = paymentRequestLines;
    return this;
  }

  public PaymentRequestCreateParams addPaymentRequestLinesItem(PaymentRequestCreateParamsPaymentRequestLines paymentRequestLinesItem) {
    this.paymentRequestLines.add(paymentRequestLinesItem);
    return this;
  }

   /**
   * 支払依頼の項目行一覧（配列）
   * @return paymentRequestLines
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "支払依頼の項目行一覧（配列）")

  public List<PaymentRequestCreateParamsPaymentRequestLines> getPaymentRequestLines() {
    return paymentRequestLines;
  }


  public void setPaymentRequestLines(List<PaymentRequestCreateParamsPaymentRequestLines> paymentRequestLines) {
    this.paymentRequestLines = paymentRequestLines;
  }


  public PaymentRequestCreateParams receiptIds(List<Integer> receiptIds) {
    
    this.receiptIds = receiptIds;
    return this;
  }

  public PaymentRequestCreateParams addReceiptIdsItem(Integer receiptIdsItem) {
    if (this.receiptIds == null) {
      this.receiptIds = new ArrayList<>();
    }
    this.receiptIds.add(receiptIdsItem);
    return this;
  }

   /**
   * 証憑ファイルID（ファイルボックスのファイルID）（配列）
   * @return receiptIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "証憑ファイルID（ファイルボックスのファイルID）（配列）")

  public List<Integer> getReceiptIds() {
    return receiptIds;
  }


  public void setReceiptIds(List<Integer> receiptIds) {
    this.receiptIds = receiptIds;
  }


  public PaymentRequestCreateParams title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 申請タイトル
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "仕入代金支払い", required = true, value = "申請タイトル")

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
    PaymentRequestCreateParams paymentRequestCreateParams = (PaymentRequestCreateParams) o;
    return Objects.equals(this.accountName, paymentRequestCreateParams.accountName) &&
        Objects.equals(this.accountNumber, paymentRequestCreateParams.accountNumber) &&
        Objects.equals(this.accountType, paymentRequestCreateParams.accountType) &&
        Objects.equals(this.applicationDate, paymentRequestCreateParams.applicationDate) &&
        Objects.equals(this.approvalFlowRouteId, paymentRequestCreateParams.approvalFlowRouteId) &&
        Objects.equals(this.approverId, paymentRequestCreateParams.approverId) &&
        Objects.equals(this.bankCode, paymentRequestCreateParams.bankCode) &&
        Objects.equals(this.bankName, paymentRequestCreateParams.bankName) &&
        Objects.equals(this.bankNameKana, paymentRequestCreateParams.bankNameKana) &&
        Objects.equals(this.branchCode, paymentRequestCreateParams.branchCode) &&
        Objects.equals(this.branchKana, paymentRequestCreateParams.branchKana) &&
        Objects.equals(this.branchName, paymentRequestCreateParams.branchName) &&
        Objects.equals(this.companyId, paymentRequestCreateParams.companyId) &&
        Objects.equals(this.description, paymentRequestCreateParams.description) &&
        Objects.equals(this.documentCode, paymentRequestCreateParams.documentCode) &&
        Objects.equals(this.draft, paymentRequestCreateParams.draft) &&
        Objects.equals(this.issueDate, paymentRequestCreateParams.issueDate) &&
        Objects.equals(this.parentId, paymentRequestCreateParams.parentId) &&
        Objects.equals(this.partnerCode, paymentRequestCreateParams.partnerCode) &&
        Objects.equals(this.partnerId, paymentRequestCreateParams.partnerId) &&
        Objects.equals(this.paymentDate, paymentRequestCreateParams.paymentDate) &&
        Objects.equals(this.paymentMethod, paymentRequestCreateParams.paymentMethod) &&
        Objects.equals(this.paymentRequestLines, paymentRequestCreateParams.paymentRequestLines) &&
        Objects.equals(this.receiptIds, paymentRequestCreateParams.receiptIds) &&
        Objects.equals(this.title, paymentRequestCreateParams.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountNumber, accountType, applicationDate, approvalFlowRouteId, approverId, bankCode, bankName, bankNameKana, branchCode, branchKana, branchName, companyId, description, documentCode, draft, issueDate, parentId, partnerCode, partnerId, paymentDate, paymentMethod, paymentRequestLines, receiptIds, title);
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
    sb.append("class PaymentRequestCreateParams {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    approvalFlowRouteId: ").append(toIndentedString(approvalFlowRouteId)).append("\n");
    sb.append("    approverId: ").append(toIndentedString(approverId)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankNameKana: ").append(toIndentedString(bankNameKana)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    branchKana: ").append(toIndentedString(branchKana)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentRequestLines: ").append(toIndentedString(paymentRequestLines)).append("\n");
    sb.append("    receiptIds: ").append(toIndentedString(receiptIds)).append("\n");
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
