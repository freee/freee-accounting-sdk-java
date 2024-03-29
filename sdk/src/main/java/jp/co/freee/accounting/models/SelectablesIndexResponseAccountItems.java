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
import jp.co.freee.accounting.models.SelectablesIndexResponseDefaultTax;

/**
 * SelectablesIndexResponseAccountItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SelectablesIndexResponseAccountItems {
  public static final String SERIALIZED_NAME_DEFAULT_TAX = "default_tax";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TAX)
  private SelectablesIndexResponseDefaultTax defaultTax;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_HELP = "help";
  @SerializedName(SERIALIZED_NAME_HELP)
  private String help;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORTCUT = "shortcut";
  @SerializedName(SERIALIZED_NAME_SHORTCUT)
  private String shortcut;

  public SelectablesIndexResponseAccountItems() { 
  }

  public SelectablesIndexResponseAccountItems defaultTax(SelectablesIndexResponseDefaultTax defaultTax) {
    
    this.defaultTax = defaultTax;
    return this;
  }

   /**
   * Get defaultTax
   * @return defaultTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SelectablesIndexResponseDefaultTax getDefaultTax() {
    return defaultTax;
  }


  public void setDefaultTax(SelectablesIndexResponseDefaultTax defaultTax) {
    this.defaultTax = defaultTax;
  }


  public SelectablesIndexResponseAccountItems desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 勘定科目の説明
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "福利厚生以外の飲食費", value = "勘定科目の説明")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public SelectablesIndexResponseAccountItems help(String help) {
    
    this.help = help;
    return this;
  }

   /**
   * 勘定科目の説明（詳細）
   * @return help
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "勘定科目の説明（詳細）")

  public String getHelp() {
    return help;
  }


  public void setHelp(String help) {
    this.help = help;
  }


  public SelectablesIndexResponseAccountItems id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 勘定科目ID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "勘定科目ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public SelectablesIndexResponseAccountItems name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 勘定科目
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "交際費", value = "勘定科目")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SelectablesIndexResponseAccountItems shortcut(String shortcut) {
    
    this.shortcut = shortcut;
    return this;
  }

   /**
   * ショートカット
   * @return shortcut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KOUSAI", value = "ショートカット")

  public String getShortcut() {
    return shortcut;
  }


  public void setShortcut(String shortcut) {
    this.shortcut = shortcut;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectablesIndexResponseAccountItems selectablesIndexResponseAccountItems = (SelectablesIndexResponseAccountItems) o;
    return Objects.equals(this.defaultTax, selectablesIndexResponseAccountItems.defaultTax) &&
        Objects.equals(this.desc, selectablesIndexResponseAccountItems.desc) &&
        Objects.equals(this.help, selectablesIndexResponseAccountItems.help) &&
        Objects.equals(this.id, selectablesIndexResponseAccountItems.id) &&
        Objects.equals(this.name, selectablesIndexResponseAccountItems.name) &&
        Objects.equals(this.shortcut, selectablesIndexResponseAccountItems.shortcut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTax, desc, help, id, name, shortcut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectablesIndexResponseAccountItems {\n");
    sb.append("    defaultTax: ").append(toIndentedString(defaultTax)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortcut: ").append(toIndentedString(shortcut)).append("\n");
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

