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
import jp.co.freee.accounting.models.PartnerCreateParamsAddressAttributes;
import jp.co.freee.accounting.models.PartnerCreateParamsInvoicePaymentTermAttributes;
import jp.co.freee.accounting.models.PartnerCreateParamsPartnerBankAccountAttributes;
import jp.co.freee.accounting.models.PartnerCreateParamsPartnerDocSettingAttributes;
import jp.co.freee.accounting.models.PartnerCreateParamsPaymentTermAttributes;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PartnerUpdateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartnerUpdateParams {
  public static final String SERIALIZED_NAME_ADDRESS_ATTRIBUTES = "address_attributes";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ATTRIBUTES)
  private PartnerCreateParamsAddressAttributes addressAttributes;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  /**
   * 地域（JP: 国内、ZZ:国外）、指定しない場合JPになります。
   */
  @JsonAdapter(CountryCodeEnum.Adapter.class)
  public enum CountryCodeEnum {
    JP("JP"),
    
    ZZ("ZZ");

    private String value;

    CountryCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountryCodeEnum fromValue(String value) {
      for (CountryCodeEnum b : CountryCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CountryCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountryCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountryCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CountryCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private CountryCodeEnum countryCode;

  public static final String SERIALIZED_NAME_DEFAULT_TITLE = "default_title";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TITLE)
  private String defaultTitle;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_INVOICE_PAYMENT_TERM_ATTRIBUTES = "invoice_payment_term_attributes";
  @SerializedName(SERIALIZED_NAME_INVOICE_PAYMENT_TERM_ATTRIBUTES)
  private PartnerCreateParamsInvoicePaymentTermAttributes invoicePaymentTermAttributes;

  public static final String SERIALIZED_NAME_LONG_NAME = "long_name";
  @SerializedName(SERIALIZED_NAME_LONG_NAME)
  private String longName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_KANA = "name_kana";
  @SerializedName(SERIALIZED_NAME_NAME_KANA)
  private String nameKana;

  /**
   * 事業所種別（null: 未設定、1: 法人、2: 個人）
   */
  @JsonAdapter(OrgCodeEnum.Adapter.class)
  public enum OrgCodeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    OrgCodeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrgCodeEnum fromValue(Integer value) {
      for (OrgCodeEnum b : OrgCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrgCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrgCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrgCodeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return OrgCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORG_CODE = "org_code";
  @SerializedName(SERIALIZED_NAME_ORG_CODE)
  private OrgCodeEnum orgCode;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES = "partner_bank_account_attributes";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES)
  private PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes;

  public static final String SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES = "partner_doc_setting_attributes";
  @SerializedName(SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES)
  private PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes;

  public static final String SERIALIZED_NAME_PAYER_WALLETABLE_ID = "payer_walletable_id";
  @SerializedName(SERIALIZED_NAME_PAYER_WALLETABLE_ID)
  private Integer payerWalletableId;

  public static final String SERIALIZED_NAME_PAYMENT_TERM_ATTRIBUTES = "payment_term_attributes";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERM_ATTRIBUTES)
  private PartnerCreateParamsPaymentTermAttributes paymentTermAttributes;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_SHORTCUT1 = "shortcut1";
  @SerializedName(SERIALIZED_NAME_SHORTCUT1)
  private String shortcut1;

  public static final String SERIALIZED_NAME_SHORTCUT2 = "shortcut2";
  @SerializedName(SERIALIZED_NAME_SHORTCUT2)
  private String shortcut2;

  /**
   * 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)、指定しない場合payerになります。
   */
  @JsonAdapter(TransferFeeHandlingSideEnum.Adapter.class)
  public enum TransferFeeHandlingSideEnum {
    PAYER("payer"),
    
    PAYEE("payee");

    private String value;

    TransferFeeHandlingSideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransferFeeHandlingSideEnum fromValue(String value) {
      for (TransferFeeHandlingSideEnum b : TransferFeeHandlingSideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransferFeeHandlingSideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransferFeeHandlingSideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransferFeeHandlingSideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransferFeeHandlingSideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSFER_FEE_HANDLING_SIDE = "transfer_fee_handling_side";
  @SerializedName(SERIALIZED_NAME_TRANSFER_FEE_HANDLING_SIDE)
  private TransferFeeHandlingSideEnum transferFeeHandlingSide;

  public PartnerUpdateParams() { 
  }

  public PartnerUpdateParams addressAttributes(PartnerCreateParamsAddressAttributes addressAttributes) {
    
    this.addressAttributes = addressAttributes;
    return this;
  }

   /**
   * Get addressAttributes
   * @return addressAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsAddressAttributes getAddressAttributes() {
    return addressAttributes;
  }


  public void setAddressAttributes(PartnerCreateParamsAddressAttributes addressAttributes) {
    this.addressAttributes = addressAttributes;
  }


  public PartnerUpdateParams companyId(Integer companyId) {
    
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


  public PartnerUpdateParams contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 担当者 氏名 (255文字以内)
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "営業担当", value = "担当者 氏名 (255文字以内)")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public PartnerUpdateParams countryCode(CountryCodeEnum countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 地域（JP: 国内、ZZ:国外）、指定しない場合JPになります。
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JP", value = "地域（JP: 国内、ZZ:国外）、指定しない場合JPになります。")

  public CountryCodeEnum getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(CountryCodeEnum countryCode) {
    this.countryCode = countryCode;
  }


  public PartnerUpdateParams defaultTitle(String defaultTitle) {
    
    this.defaultTitle = defaultTitle;
    return this;
  }

   /**
   * 敬称（御中、様、(空白)の3つから選択）
   * @return defaultTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "御中", value = "敬称（御中、様、(空白)の3つから選択）")

  public String getDefaultTitle() {
    return defaultTitle;
  }


  public void setDefaultTitle(String defaultTitle) {
    this.defaultTitle = defaultTitle;
  }


  public PartnerUpdateParams email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 担当者 メールアドレス (255文字以内)
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "contact@example.com", value = "担当者 メールアドレス (255文字以内)")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PartnerUpdateParams invoicePaymentTermAttributes(PartnerCreateParamsInvoicePaymentTermAttributes invoicePaymentTermAttributes) {
    
    this.invoicePaymentTermAttributes = invoicePaymentTermAttributes;
    return this;
  }

   /**
   * Get invoicePaymentTermAttributes
   * @return invoicePaymentTermAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsInvoicePaymentTermAttributes getInvoicePaymentTermAttributes() {
    return invoicePaymentTermAttributes;
  }


  public void setInvoicePaymentTermAttributes(PartnerCreateParamsInvoicePaymentTermAttributes invoicePaymentTermAttributes) {
    this.invoicePaymentTermAttributes = invoicePaymentTermAttributes;
  }


  public PartnerUpdateParams longName(String longName) {
    
    this.longName = longName;
    return this;
  }

   /**
   * 正式名称（255文字以内）
   * @return longName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "新しい取引先正式名称", value = "正式名称（255文字以内）")

  public String getLongName() {
    return longName;
  }


  public void setLongName(String longName) {
    this.longName = longName;
  }


  public PartnerUpdateParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 取引先名 (255文字以内)
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "新しい取引先", required = true, value = "取引先名 (255文字以内)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PartnerUpdateParams nameKana(String nameKana) {
    
    this.nameKana = nameKana;
    return this;
  }

   /**
   * カナ名称（255文字以内）
   * @return nameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "アタラシイトリヒキサキメイショウ", value = "カナ名称（255文字以内）")

  public String getNameKana() {
    return nameKana;
  }


  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }


  public PartnerUpdateParams orgCode(OrgCodeEnum orgCode) {
    
    this.orgCode = orgCode;
    return this;
  }

   /**
   * 事業所種別（null: 未設定、1: 法人、2: 個人）
   * @return orgCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "事業所種別（null: 未設定、1: 法人、2: 個人）")

  public OrgCodeEnum getOrgCode() {
    return orgCode;
  }


  public void setOrgCode(OrgCodeEnum orgCode) {
    this.orgCode = orgCode;
  }


  public PartnerUpdateParams partnerBankAccountAttributes(PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes) {
    
    this.partnerBankAccountAttributes = partnerBankAccountAttributes;
    return this;
  }

   /**
   * Get partnerBankAccountAttributes
   * @return partnerBankAccountAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsPartnerBankAccountAttributes getPartnerBankAccountAttributes() {
    return partnerBankAccountAttributes;
  }


  public void setPartnerBankAccountAttributes(PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes) {
    this.partnerBankAccountAttributes = partnerBankAccountAttributes;
  }


  public PartnerUpdateParams partnerDocSettingAttributes(PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes) {
    
    this.partnerDocSettingAttributes = partnerDocSettingAttributes;
    return this;
  }

   /**
   * Get partnerDocSettingAttributes
   * @return partnerDocSettingAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsPartnerDocSettingAttributes getPartnerDocSettingAttributes() {
    return partnerDocSettingAttributes;
  }


  public void setPartnerDocSettingAttributes(PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes) {
    this.partnerDocSettingAttributes = partnerDocSettingAttributes;
  }


  public PartnerUpdateParams payerWalletableId(Integer payerWalletableId) {
    
    this.payerWalletableId = payerWalletableId;
    return this;
  }

   /**
   * 振込元口座ID（一括振込ファイル用）:（walletableのtypeが&#39;bank_account&#39;のidのみ指定できます。また、未設定にする場合は、nullを指定してください。）
   * minimum: 1
   * maximum: 2147483647
   * @return payerWalletableId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "振込元口座ID（一括振込ファイル用）:（walletableのtypeが'bank_account'のidのみ指定できます。また、未設定にする場合は、nullを指定してください。）")

  public Integer getPayerWalletableId() {
    return payerWalletableId;
  }


  public void setPayerWalletableId(Integer payerWalletableId) {
    this.payerWalletableId = payerWalletableId;
  }


  public PartnerUpdateParams paymentTermAttributes(PartnerCreateParamsPaymentTermAttributes paymentTermAttributes) {
    
    this.paymentTermAttributes = paymentTermAttributes;
    return this;
  }

   /**
   * Get paymentTermAttributes
   * @return paymentTermAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerCreateParamsPaymentTermAttributes getPaymentTermAttributes() {
    return paymentTermAttributes;
  }


  public void setPaymentTermAttributes(PartnerCreateParamsPaymentTermAttributes paymentTermAttributes) {
    this.paymentTermAttributes = paymentTermAttributes;
  }


  public PartnerUpdateParams phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 電話番号
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03-1234-xxxx", value = "電話番号")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public PartnerUpdateParams shortcut1(String shortcut1) {
    
    this.shortcut1 = shortcut1;
    return this;
  }

   /**
   * ショートカット１ (255文字以内)
   * @return shortcut1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NEWPARTNER", value = "ショートカット１ (255文字以内)")

  public String getShortcut1() {
    return shortcut1;
  }


  public void setShortcut1(String shortcut1) {
    this.shortcut1 = shortcut1;
  }


  public PartnerUpdateParams shortcut2(String shortcut2) {
    
    this.shortcut2 = shortcut2;
    return this;
  }

   /**
   * ショートカット２ (255文字以内)
   * @return shortcut2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "502", value = "ショートカット２ (255文字以内)")

  public String getShortcut2() {
    return shortcut2;
  }


  public void setShortcut2(String shortcut2) {
    this.shortcut2 = shortcut2;
  }


  public PartnerUpdateParams transferFeeHandlingSide(TransferFeeHandlingSideEnum transferFeeHandlingSide) {
    
    this.transferFeeHandlingSide = transferFeeHandlingSide;
    return this;
  }

   /**
   * 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)、指定しない場合payerになります。
   * @return transferFeeHandlingSide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payer", value = "振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)、指定しない場合payerになります。")

  public TransferFeeHandlingSideEnum getTransferFeeHandlingSide() {
    return transferFeeHandlingSide;
  }


  public void setTransferFeeHandlingSide(TransferFeeHandlingSideEnum transferFeeHandlingSide) {
    this.transferFeeHandlingSide = transferFeeHandlingSide;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerUpdateParams partnerUpdateParams = (PartnerUpdateParams) o;
    return Objects.equals(this.addressAttributes, partnerUpdateParams.addressAttributes) &&
        Objects.equals(this.companyId, partnerUpdateParams.companyId) &&
        Objects.equals(this.contactName, partnerUpdateParams.contactName) &&
        Objects.equals(this.countryCode, partnerUpdateParams.countryCode) &&
        Objects.equals(this.defaultTitle, partnerUpdateParams.defaultTitle) &&
        Objects.equals(this.email, partnerUpdateParams.email) &&
        Objects.equals(this.invoicePaymentTermAttributes, partnerUpdateParams.invoicePaymentTermAttributes) &&
        Objects.equals(this.longName, partnerUpdateParams.longName) &&
        Objects.equals(this.name, partnerUpdateParams.name) &&
        Objects.equals(this.nameKana, partnerUpdateParams.nameKana) &&
        Objects.equals(this.orgCode, partnerUpdateParams.orgCode) &&
        Objects.equals(this.partnerBankAccountAttributes, partnerUpdateParams.partnerBankAccountAttributes) &&
        Objects.equals(this.partnerDocSettingAttributes, partnerUpdateParams.partnerDocSettingAttributes) &&
        Objects.equals(this.payerWalletableId, partnerUpdateParams.payerWalletableId) &&
        Objects.equals(this.paymentTermAttributes, partnerUpdateParams.paymentTermAttributes) &&
        Objects.equals(this.phone, partnerUpdateParams.phone) &&
        Objects.equals(this.shortcut1, partnerUpdateParams.shortcut1) &&
        Objects.equals(this.shortcut2, partnerUpdateParams.shortcut2) &&
        Objects.equals(this.transferFeeHandlingSide, partnerUpdateParams.transferFeeHandlingSide);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressAttributes, companyId, contactName, countryCode, defaultTitle, email, invoicePaymentTermAttributes, longName, name, nameKana, orgCode, partnerBankAccountAttributes, partnerDocSettingAttributes, payerWalletableId, paymentTermAttributes, phone, shortcut1, shortcut2, transferFeeHandlingSide);
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
    sb.append("class PartnerUpdateParams {\n");
    sb.append("    addressAttributes: ").append(toIndentedString(addressAttributes)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    defaultTitle: ").append(toIndentedString(defaultTitle)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    invoicePaymentTermAttributes: ").append(toIndentedString(invoicePaymentTermAttributes)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameKana: ").append(toIndentedString(nameKana)).append("\n");
    sb.append("    orgCode: ").append(toIndentedString(orgCode)).append("\n");
    sb.append("    partnerBankAccountAttributes: ").append(toIndentedString(partnerBankAccountAttributes)).append("\n");
    sb.append("    partnerDocSettingAttributes: ").append(toIndentedString(partnerDocSettingAttributes)).append("\n");
    sb.append("    payerWalletableId: ").append(toIndentedString(payerWalletableId)).append("\n");
    sb.append("    paymentTermAttributes: ").append(toIndentedString(paymentTermAttributes)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    shortcut1: ").append(toIndentedString(shortcut1)).append("\n");
    sb.append("    shortcut2: ").append(toIndentedString(shortcut2)).append("\n");
    sb.append("    transferFeeHandlingSide: ").append(toIndentedString(transferFeeHandlingSide)).append("\n");
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

