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
 * UserCapabilityJustRead
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserCapabilityJustRead {
  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public UserCapabilityJustRead() { 
  }

  public UserCapabilityJustRead read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * 閲覧
   * @return read
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "閲覧")

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    this.read = read;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCapabilityJustRead userCapabilityJustRead = (UserCapabilityJustRead) o;
    return Objects.equals(this.read, userCapabilityJustRead.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCapabilityJustRead {\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

