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
import jp.co.freee.accounting.models.AccountItemCreateParamsAccountItemItems;

/**
 * AccountItemUpdateParamsAccountItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountItemUpdateParamsAccountItem {
  public static final String SERIALIZED_NAME_ACCOUNT_CATEGORY_ID = "account_category_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CATEGORY_ID)
  private Integer accountCategoryId;

  public static final String SERIALIZED_NAME_ACCUMULATED_DEP_ACCOUNT_ITEM_ID = "accumulated_dep_account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCUMULATED_DEP_ACCOUNT_ITEM_ID)
  private Integer accumulatedDepAccountItemId;

  public static final String SERIALIZED_NAME_CORRESPONDING_EXPENSE_ID = "corresponding_expense_id";
  @SerializedName(SERIALIZED_NAME_CORRESPONDING_EXPENSE_ID)
  private Integer correspondingExpenseId;

  public static final String SERIALIZED_NAME_CORRESPONDING_INCOME_ID = "corresponding_income_id";
  @SerializedName(SERIALIZED_NAME_CORRESPONDING_INCOME_ID)
  private Integer correspondingIncomeId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AccountItemCreateParamsAccountItemItems> items = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARTNERS = "partners";
  @SerializedName(SERIALIZED_NAME_PARTNERS)
  private List<AccountItemCreateParamsAccountItemItems> partners = null;

  public static final String SERIALIZED_NAME_SEARCHABLE = "searchable";
  @SerializedName(SERIALIZED_NAME_SEARCHABLE)
  private Integer searchable;

  public static final String SERIALIZED_NAME_SHORTCUT = "shortcut";
  @SerializedName(SERIALIZED_NAME_SHORTCUT)
  private String shortcut;

  public static final String SERIALIZED_NAME_SHORTCUT_NUM = "shortcut_num";
  @SerializedName(SERIALIZED_NAME_SHORTCUT_NUM)
  private String shortcutNum;

  public static final String SERIALIZED_NAME_TAX_CODE = "tax_code";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private Integer taxCode;

  public AccountItemUpdateParamsAccountItem() { 
  }

  public AccountItemUpdateParamsAccountItem accountCategoryId(Integer accountCategoryId) {
    
    this.accountCategoryId = accountCategoryId;
    return this;
  }

   /**
   * 勘定科目カテゴリーID Selectablesフォーム用選択項目情報エンドポイント(account_groups.account_category_id)で取得可能です
   * minimum: 1
   * maximum: 2147483647
   * @return accountCategoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "勘定科目カテゴリーID Selectablesフォーム用選択項目情報エンドポイント(account_groups.account_category_id)で取得可能です")

  public Integer getAccountCategoryId() {
    return accountCategoryId;
  }


  public void setAccountCategoryId(Integer accountCategoryId) {
    this.accountCategoryId = accountCategoryId;
  }


  public AccountItemUpdateParamsAccountItem accumulatedDepAccountItemId(Integer accumulatedDepAccountItemId) {
    
    this.accumulatedDepAccountItemId = accumulatedDepAccountItemId;
    return this;
  }

   /**
   * 減価償却累計額勘定科目ID（法人のみ利用可能）
   * @return accumulatedDepAccountItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "減価償却累計額勘定科目ID（法人のみ利用可能）")

  public Integer getAccumulatedDepAccountItemId() {
    return accumulatedDepAccountItemId;
  }


  public void setAccumulatedDepAccountItemId(Integer accumulatedDepAccountItemId) {
    this.accumulatedDepAccountItemId = accumulatedDepAccountItemId;
  }


  public AccountItemUpdateParamsAccountItem correspondingExpenseId(Integer correspondingExpenseId) {
    
    this.correspondingExpenseId = correspondingExpenseId;
    return this;
  }

   /**
   * 支出取引相手勘定科目ID
   * @return correspondingExpenseId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "支出取引相手勘定科目ID")

  public Integer getCorrespondingExpenseId() {
    return correspondingExpenseId;
  }


  public void setCorrespondingExpenseId(Integer correspondingExpenseId) {
    this.correspondingExpenseId = correspondingExpenseId;
  }


  public AccountItemUpdateParamsAccountItem correspondingIncomeId(Integer correspondingIncomeId) {
    
    this.correspondingIncomeId = correspondingIncomeId;
    return this;
  }

   /**
   * 収入取引相手勘定科目ID
   * @return correspondingIncomeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "収入取引相手勘定科目ID")

  public Integer getCorrespondingIncomeId() {
    return correspondingIncomeId;
  }


  public void setCorrespondingIncomeId(Integer correspondingIncomeId) {
    this.correspondingIncomeId = correspondingIncomeId;
  }


  public AccountItemUpdateParamsAccountItem groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * 決算書表示名（小カテゴリー） Selectablesフォーム用選択項目情報エンドポイント(account_groups.name)で取得可能です
   * @return groupName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "その他預金", required = true, value = "決算書表示名（小カテゴリー） Selectablesフォーム用選択項目情報エンドポイント(account_groups.name)で取得可能です")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public AccountItemUpdateParamsAccountItem items(List<AccountItemCreateParamsAccountItemItems> items) {
    
    this.items = items;
    return this;
  }

  public AccountItemUpdateParamsAccountItem addItemsItem(AccountItemCreateParamsAccountItemItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 品目
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "品目")

  public List<AccountItemCreateParamsAccountItemItems> getItems() {
    return items;
  }


  public void setItems(List<AccountItemCreateParamsAccountItemItems> items) {
    this.items = items;
  }


  public AccountItemUpdateParamsAccountItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 勘定科目名 (30文字以内) 口座に紐付かない勘定科目の更新時は必須です。 口座に紐付く勘定科目の更新時は指定することができません。 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "新しい勘定科目", value = "勘定科目名 (30文字以内) 口座に紐付かない勘定科目の更新時は必須です。 口座に紐付く勘定科目の更新時は指定することができません。 ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AccountItemUpdateParamsAccountItem partners(List<AccountItemCreateParamsAccountItemItems> partners) {
    
    this.partners = partners;
    return this;
  }

  public AccountItemUpdateParamsAccountItem addPartnersItem(AccountItemCreateParamsAccountItemItems partnersItem) {
    if (this.partners == null) {
      this.partners = new ArrayList<>();
    }
    this.partners.add(partnersItem);
    return this;
  }

   /**
   * 取引先
   * @return partners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "取引先")

  public List<AccountItemCreateParamsAccountItemItems> getPartners() {
    return partners;
  }


  public void setPartners(List<AccountItemCreateParamsAccountItemItems> partners) {
    this.partners = partners;
  }


  public AccountItemUpdateParamsAccountItem searchable(Integer searchable) {
    
    this.searchable = searchable;
    return this;
  }

   /**
   * 検索可能:2, 検索不可：3(登録時未指定の場合は2で登録されます。更新時未指定の場合はsearchableは変更されません。)
   * minimum: 2
   * maximum: 3
   * @return searchable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "検索可能:2, 検索不可：3(登録時未指定の場合は2で登録されます。更新時未指定の場合はsearchableは変更されません。)")

  public Integer getSearchable() {
    return searchable;
  }


  public void setSearchable(Integer searchable) {
    this.searchable = searchable;
  }


  public AccountItemUpdateParamsAccountItem shortcut(String shortcut) {
    
    this.shortcut = shortcut;
    return this;
  }

   /**
   * ショートカット1 (20文字以内)
   * @return shortcut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NEWACCOUNTITEM", value = "ショートカット1 (20文字以内)")

  public String getShortcut() {
    return shortcut;
  }


  public void setShortcut(String shortcut) {
    this.shortcut = shortcut;
  }


  public AccountItemUpdateParamsAccountItem shortcutNum(String shortcutNum) {
    
    this.shortcutNum = shortcutNum;
    return this;
  }

   /**
   * ショートカット2(勘定科目コード)(20文字以内)
   * @return shortcutNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "999", value = "ショートカット2(勘定科目コード)(20文字以内)")

  public String getShortcutNum() {
    return shortcutNum;
  }


  public void setShortcutNum(String shortcutNum) {
    this.shortcutNum = shortcutNum;
  }


  public AccountItemUpdateParamsAccountItem taxCode(Integer taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * 税区分コード
   * minimum: 0
   * maximum: 2147483647
   * @return taxCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "税区分コード")

  public Integer getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(Integer taxCode) {
    this.taxCode = taxCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountItemUpdateParamsAccountItem accountItemUpdateParamsAccountItem = (AccountItemUpdateParamsAccountItem) o;
    return Objects.equals(this.accountCategoryId, accountItemUpdateParamsAccountItem.accountCategoryId) &&
        Objects.equals(this.accumulatedDepAccountItemId, accountItemUpdateParamsAccountItem.accumulatedDepAccountItemId) &&
        Objects.equals(this.correspondingExpenseId, accountItemUpdateParamsAccountItem.correspondingExpenseId) &&
        Objects.equals(this.correspondingIncomeId, accountItemUpdateParamsAccountItem.correspondingIncomeId) &&
        Objects.equals(this.groupName, accountItemUpdateParamsAccountItem.groupName) &&
        Objects.equals(this.items, accountItemUpdateParamsAccountItem.items) &&
        Objects.equals(this.name, accountItemUpdateParamsAccountItem.name) &&
        Objects.equals(this.partners, accountItemUpdateParamsAccountItem.partners) &&
        Objects.equals(this.searchable, accountItemUpdateParamsAccountItem.searchable) &&
        Objects.equals(this.shortcut, accountItemUpdateParamsAccountItem.shortcut) &&
        Objects.equals(this.shortcutNum, accountItemUpdateParamsAccountItem.shortcutNum) &&
        Objects.equals(this.taxCode, accountItemUpdateParamsAccountItem.taxCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategoryId, accumulatedDepAccountItemId, correspondingExpenseId, correspondingIncomeId, groupName, items, name, partners, searchable, shortcut, shortcutNum, taxCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountItemUpdateParamsAccountItem {\n");
    sb.append("    accountCategoryId: ").append(toIndentedString(accountCategoryId)).append("\n");
    sb.append("    accumulatedDepAccountItemId: ").append(toIndentedString(accumulatedDepAccountItemId)).append("\n");
    sb.append("    correspondingExpenseId: ").append(toIndentedString(correspondingExpenseId)).append("\n");
    sb.append("    correspondingIncomeId: ").append(toIndentedString(correspondingIncomeId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    shortcut: ").append(toIndentedString(shortcut)).append("\n");
    sb.append("    shortcutNum: ").append(toIndentedString(shortcutNum)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
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

