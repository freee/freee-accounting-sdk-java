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
import jp.co.freee.accounting.models.ManualJournal;

/**
 * ManualJournalResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ManualJournalResponse {
  public static final String SERIALIZED_NAME_MANUAL_JOURNAL = "manual_journal";
  @SerializedName(SERIALIZED_NAME_MANUAL_JOURNAL)
  private ManualJournal manualJournal;

  public ManualJournalResponse() { 
  }

  public ManualJournalResponse manualJournal(ManualJournal manualJournal) {
    
    this.manualJournal = manualJournal;
    return this;
  }

   /**
   * Get manualJournal
   * @return manualJournal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ManualJournal getManualJournal() {
    return manualJournal;
  }


  public void setManualJournal(ManualJournal manualJournal) {
    this.manualJournal = manualJournal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualJournalResponse manualJournalResponse = (ManualJournalResponse) o;
    return Objects.equals(this.manualJournal, manualJournalResponse.manualJournal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manualJournal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualJournalResponse {\n");
    sb.append("    manualJournal: ").append(toIndentedString(manualJournal)).append("\n");
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

