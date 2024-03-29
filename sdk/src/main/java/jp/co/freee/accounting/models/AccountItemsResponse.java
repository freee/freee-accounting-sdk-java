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
import jp.co.freee.accounting.models.AccountItemsResponseAccountItems;

/**
 * AccountItemsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountItemsResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_ITEMS = "account_items";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEMS)
  private List<AccountItemsResponseAccountItems> accountItems = new ArrayList<>();

  public AccountItemsResponse() { 
  }

  public AccountItemsResponse accountItems(List<AccountItemsResponseAccountItems> accountItems) {
    
    this.accountItems = accountItems;
    return this;
  }

  public AccountItemsResponse addAccountItemsItem(AccountItemsResponseAccountItems accountItemsItem) {
    this.accountItems.add(accountItemsItem);
    return this;
  }

   /**
   * Get accountItems
   * @return accountItems
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<AccountItemsResponseAccountItems> getAccountItems() {
    return accountItems;
  }


  public void setAccountItems(List<AccountItemsResponseAccountItems> accountItems) {
    this.accountItems = accountItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountItemsResponse accountItemsResponse = (AccountItemsResponse) o;
    return Objects.equals(this.accountItems, accountItemsResponse.accountItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountItemsResponse {\n");
    sb.append("    accountItems: ").append(toIndentedString(accountItems)).append("\n");
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

