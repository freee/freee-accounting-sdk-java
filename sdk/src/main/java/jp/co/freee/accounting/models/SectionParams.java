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

/**
 * SectionParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SectionParams {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_LONG_NAME = "long_name";
  @SerializedName(SERIALIZED_NAME_LONG_NAME)
  private String longName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_SHORTCUT1 = "shortcut1";
  @SerializedName(SERIALIZED_NAME_SHORTCUT1)
  private String shortcut1;

  public static final String SERIALIZED_NAME_SHORTCUT2 = "shortcut2";
  @SerializedName(SERIALIZED_NAME_SHORTCUT2)
  private String shortcut2;

  public SectionParams() { 
  }

  public SectionParams companyId(Integer companyId) {
    
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


  public SectionParams longName(String longName) {
    
    this.longName = longName;
    return this;
  }

   /**
   * 正式名称 (255文字以内)
   * @return longName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxx開発部門", value = "正式名称 (255文字以内)")

  public String getLongName() {
    return longName;
  }


  public void setLongName(String longName) {
    this.longName = longName;
  }


  public SectionParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 部門名 (30文字以内)
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "開発部門", required = true, value = "部門名 (30文字以内)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SectionParams parentId(Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * 親部門ID (個人:プレミアムプラン、法人:ベーシックプラン以上)
   * minimum: 1
   * maximum: 2147483647
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "101", value = "親部門ID (個人:プレミアムプラン、法人:ベーシックプラン以上)")

  public Integer getParentId() {
    return parentId;
  }


  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public SectionParams shortcut1(String shortcut1) {
    
    this.shortcut1 = shortcut1;
    return this;
  }

   /**
   * ショートカット１ (20文字以内)
   * @return shortcut1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEVELOPER", value = "ショートカット１ (20文字以内)")

  public String getShortcut1() {
    return shortcut1;
  }


  public void setShortcut1(String shortcut1) {
    this.shortcut1 = shortcut1;
  }


  public SectionParams shortcut2(String shortcut2) {
    
    this.shortcut2 = shortcut2;
    return this;
  }

   /**
   * ショートカット２ (20文字以内)
   * @return shortcut2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "ショートカット２ (20文字以内)")

  public String getShortcut2() {
    return shortcut2;
  }


  public void setShortcut2(String shortcut2) {
    this.shortcut2 = shortcut2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionParams sectionParams = (SectionParams) o;
    return Objects.equals(this.companyId, sectionParams.companyId) &&
        Objects.equals(this.longName, sectionParams.longName) &&
        Objects.equals(this.name, sectionParams.name) &&
        Objects.equals(this.parentId, sectionParams.parentId) &&
        Objects.equals(this.shortcut1, sectionParams.shortcut1) &&
        Objects.equals(this.shortcut2, sectionParams.shortcut2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, longName, name, parentId, shortcut1, shortcut2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionParams {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    shortcut1: ").append(toIndentedString(shortcut1)).append("\n");
    sb.append("    shortcut2: ").append(toIndentedString(shortcut2)).append("\n");
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

