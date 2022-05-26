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
import jp.co.freee.accounting.models.DealUser;

/**
 * DealCreateResponseDealReceipts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DealCreateResponseDealReceipts {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mime_type";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  /**
   * アップロード元種別
   */
  @JsonAdapter(OriginEnum.Adapter.class)
  public enum OriginEnum {
    UNKNOWN("unknown"),
    
    WEB("web"),
    
    MOBILE_CAMERA("mobile_camera"),
    
    MOBILE_ALBUM("mobile_album"),
    
    SCANSNAP("scansnap"),
    
    SCANNABLE("scannable"),
    
    DROPBOX("dropbox"),
    
    MAIL("mail"),
    
    SAFETY_CONTACT_FILE("safety_contact_file"),
    
    PUBLIC_API("public_api");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OriginEnum fromValue(String value) {
      for (OriginEnum b : OriginEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OriginEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private OriginEnum origin;

  /**
   * ステータス(unconfirmed:確認待ち、confirmed:確認済み、deleted:削除済み、ignored:無視)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNCONFIRMED("unconfirmed"),
    
    CONFIRMED("confirmed"),
    
    DELETED("deleted"),
    
    IGNORED("ignored");

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

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private DealUser user;

  public DealCreateResponseDealReceipts() { 
  }

  public DealCreateResponseDealReceipts createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 作成日時（ISO8601形式）
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-17T18:30:24+09:00", required = true, value = "作成日時（ISO8601形式）")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public DealCreateResponseDealReceipts description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * メモ
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "タクシー利用", value = "メモ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DealCreateResponseDealReceipts id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 証憑ファイルID（ファイルボックスのファイルID）
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "証憑ファイルID（ファイルボックスのファイルID）")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public DealCreateResponseDealReceipts issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * 発生日
   * @return issueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17", value = "発生日")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public DealCreateResponseDealReceipts mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * MIMEタイプ
   * @return mimeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "image/png", required = true, value = "MIMEタイプ")

  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public DealCreateResponseDealReceipts origin(OriginEnum origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * アップロード元種別
   * @return origin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "public_api", required = true, value = "アップロード元種別")

  public OriginEnum getOrigin() {
    return origin;
  }


  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }


  public DealCreateResponseDealReceipts status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * ステータス(unconfirmed:確認待ち、confirmed:確認済み、deleted:削除済み、ignored:無視)
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "unconfirmed", required = true, value = "ステータス(unconfirmed:確認待ち、confirmed:確認済み、deleted:削除済み、ignored:無視)")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public DealCreateResponseDealReceipts user(DealUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DealUser getUser() {
    return user;
  }


  public void setUser(DealUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealCreateResponseDealReceipts dealCreateResponseDealReceipts = (DealCreateResponseDealReceipts) o;
    return Objects.equals(this.createdAt, dealCreateResponseDealReceipts.createdAt) &&
        Objects.equals(this.description, dealCreateResponseDealReceipts.description) &&
        Objects.equals(this.id, dealCreateResponseDealReceipts.id) &&
        Objects.equals(this.issueDate, dealCreateResponseDealReceipts.issueDate) &&
        Objects.equals(this.mimeType, dealCreateResponseDealReceipts.mimeType) &&
        Objects.equals(this.origin, dealCreateResponseDealReceipts.origin) &&
        Objects.equals(this.status, dealCreateResponseDealReceipts.status) &&
        Objects.equals(this.user, dealCreateResponseDealReceipts.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, id, issueDate, mimeType, origin, status, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealCreateResponseDealReceipts {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
