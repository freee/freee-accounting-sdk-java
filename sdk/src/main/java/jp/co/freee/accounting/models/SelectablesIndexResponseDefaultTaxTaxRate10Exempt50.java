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
 * SelectablesIndexResponseDefaultTaxTaxRate10Exempt50
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SelectablesIndexResponseDefaultTaxTaxRate10Exempt50 {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public SelectablesIndexResponseDefaultTaxTaxRate10Exempt50() { 
  }

  public SelectablesIndexResponseDefaultTaxTaxRate10Exempt50 code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 税区分コード（この項目はインボイス制度で利用する項目です。2023年7月頃から利用できる予定です。）
   * minimum: 0
   * maximum: 2147483647
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "税区分コード（この項目はインボイス制度で利用する項目です。2023年7月頃から利用できる予定です。）")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public SelectablesIndexResponseDefaultTaxTaxRate10Exempt50 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 税区分
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "課対仕入（控50）10%", value = "税区分")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectablesIndexResponseDefaultTaxTaxRate10Exempt50 selectablesIndexResponseDefaultTaxTaxRate10Exempt50 = (SelectablesIndexResponseDefaultTaxTaxRate10Exempt50) o;
    return Objects.equals(this.code, selectablesIndexResponseDefaultTaxTaxRate10Exempt50.code) &&
        Objects.equals(this.name, selectablesIndexResponseDefaultTaxTaxRate10Exempt50.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectablesIndexResponseDefaultTaxTaxRate10Exempt50 {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

