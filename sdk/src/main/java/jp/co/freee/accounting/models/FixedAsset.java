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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * FixedAsset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FixedAsset {
  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_ID = "account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_ID)
  private Integer accountItemId;

  public static final String SERIALIZED_NAME_ACQUISITION_COST = "acquisition_cost";
  @SerializedName(SERIALIZED_NAME_ACQUISITION_COST)
  private Integer acquisitionCost;

  public static final String SERIALIZED_NAME_ACQUISITION_DATE = "acquisition_date";
  @SerializedName(SERIALIZED_NAME_ACQUISITION_DATE)
  private LocalDate acquisitionDate;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_CLOSING_ACCUMULATED_DEPRECIATION = "closing_accumulated_depreciation";
  @SerializedName(SERIALIZED_NAME_CLOSING_ACCUMULATED_DEPRECIATION)
  private Integer closingAccumulatedDepreciation;

  public static final String SERIALIZED_NAME_CLOSING_BALANCE = "closing_balance";
  @SerializedName(SERIALIZED_NAME_CLOSING_BALANCE)
  private Integer closingBalance;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DEPRECIATION_ACCOUNT_ITEM_ID = "depreciation_account_item_id";
  @SerializedName(SERIALIZED_NAME_DEPRECIATION_ACCOUNT_ITEM_ID)
  private Integer depreciationAccountItemId;

  public static final String SERIALIZED_NAME_DEPRECIATION_AMOUNT = "depreciation_amount";
  @SerializedName(SERIALIZED_NAME_DEPRECIATION_AMOUNT)
  private Integer depreciationAmount;

  /**
   * 償却方法:(少額償却: small_sum_method, 一括償却: lump_sum_method, 定額法: straight_line_method, 定率法: multiple_method, 旧定率法: old_multiple_method, 旧定額法: old_straight_line_method, 償却なし: non_depreciate_method, 任意償却: voluntary_method, 即時償却: immediate_method, 均等償却: equal_method)
   */
  @JsonAdapter(DepreciationMethodEnum.Adapter.class)
  public enum DepreciationMethodEnum {
    SMALL_SUM_METHOD("small_sum_method"),
    
    LUMP_SUM_METHOD("lump_sum_method"),
    
    STRAIGHT_LINE_METHOD("straight_line_method"),
    
    MULTIPLE_METHOD("multiple_method"),
    
    OLD_MULTIPLE_METHOD("old_multiple_method"),
    
    OLD_STRAIGHT_LINE_METHOD("old_straight_line_method"),
    
    NON_DEPRECIATE_METHOD("non_depreciate_method"),
    
    VOLUNTARY_METHOD("voluntary_method"),
    
    IMMEDIATE_METHOD("immediate_method"),
    
    EQUAL_METHOD("equal_method");

    private String value;

    DepreciationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepreciationMethodEnum fromValue(String value) {
      for (DepreciationMethodEnum b : DepreciationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DepreciationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepreciationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepreciationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DepreciationMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEPRECIATION_METHOD = "depreciation_method";
  @SerializedName(SERIALIZED_NAME_DEPRECIATION_METHOD)
  private DepreciationMethodEnum depreciationMethod;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

  public static final String SERIALIZED_NAME_LIFE_YEARS = "life_years";
  @SerializedName(SERIALIZED_NAME_LIFE_YEARS)
  private Integer lifeYears;

  public static final String SERIALIZED_NAME_MANAGEMENT_NUMBER = "management_number";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_NUMBER)
  private String managementNumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPENING_ACCUMULATED_DEPRECIATION = "opening_accumulated_depreciation";
  @SerializedName(SERIALIZED_NAME_OPENING_ACCUMULATED_DEPRECIATION)
  private Integer openingAccumulatedDepreciation;

  public static final String SERIALIZED_NAME_OPENING_BALANCE = "opening_balance";
  @SerializedName(SERIALIZED_NAME_OPENING_BALANCE)
  private Integer openingBalance;

  public static final String SERIALIZED_NAME_PREFECTURE_CODE = "prefecture_code";
  @SerializedName(SERIALIZED_NAME_PREFECTURE_CODE)
  private Integer prefectureCode;

  public static final String SERIALIZED_NAME_RETIRE_DATE = "retire_date";
  @SerializedName(SERIALIZED_NAME_RETIRE_DATE)
  private LocalDate retireDate;

  /**
   * 売却もしくは除却ステータス: (売却: sell, 除却: retire, 償却中: depreciating)
   */
  @JsonAdapter(RetireTypeEnum.Adapter.class)
  public enum RetireTypeEnum {
    SELL("sell"),
    
    RETIRE("retire"),
    
    DEPRECIATING("depreciating");

    private String value;

    RetireTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RetireTypeEnum fromValue(String value) {
      for (RetireTypeEnum b : RetireTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RetireTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RetireTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RetireTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RetireTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RETIRE_TYPE = "retire_type";
  @SerializedName(SERIALIZED_NAME_RETIRE_TYPE)
  private RetireTypeEnum retireType;

  public static final String SERIALIZED_NAME_SECTION_ID = "section_id";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private Integer sectionId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private LocalDate updatedAt;

  public FixedAsset() { 
  }

  public FixedAsset accountItemId(Integer accountItemId) {
    
    this.accountItemId = accountItemId;
    return this;
  }

   /**
   * 勘定科目ID
   * @return accountItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22", value = "勘定科目ID")

  public Integer getAccountItemId() {
    return accountItemId;
  }


  public void setAccountItemId(Integer accountItemId) {
    this.accountItemId = accountItemId;
  }


  public FixedAsset acquisitionCost(Integer acquisitionCost) {
    
    this.acquisitionCost = acquisitionCost;
    return this;
  }

   /**
   * 取得価額
   * @return acquisitionCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150000", value = "取得価額")

  public Integer getAcquisitionCost() {
    return acquisitionCost;
  }


  public void setAcquisitionCost(Integer acquisitionCost) {
    this.acquisitionCost = acquisitionCost;
  }


  public FixedAsset acquisitionDate(LocalDate acquisitionDate) {
    
    this.acquisitionDate = acquisitionDate;
    return this;
  }

   /**
   * 取得日
   * @return acquisitionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Jul 13 00:00:00 UTC 2021", value = "取得日")

  public LocalDate getAcquisitionDate() {
    return acquisitionDate;
  }


  public void setAcquisitionDate(LocalDate acquisitionDate) {
    this.acquisitionDate = acquisitionDate;
  }


  public FixedAsset cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 申告先市区町村
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "港区", value = "申告先市区町村")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public FixedAsset closingAccumulatedDepreciation(Integer closingAccumulatedDepreciation) {
    
    this.closingAccumulatedDepreciation = closingAccumulatedDepreciation;
    return this;
  }

   /**
   * 期末減価償却累計額
   * @return closingAccumulatedDepreciation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "46000", value = "期末減価償却累計額")

  public Integer getClosingAccumulatedDepreciation() {
    return closingAccumulatedDepreciation;
  }


  public void setClosingAccumulatedDepreciation(Integer closingAccumulatedDepreciation) {
    this.closingAccumulatedDepreciation = closingAccumulatedDepreciation;
  }


  public FixedAsset closingBalance(Integer closingBalance) {
    
    this.closingBalance = closingBalance;
    return this;
  }

   /**
   * 未償却残高(期末残高)
   * @return closingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "46000", value = "未償却残高(期末残高)")

  public Integer getClosingBalance() {
    return closingBalance;
  }


  public void setClosingBalance(Integer closingBalance) {
    this.closingBalance = closingBalance;
  }


  public FixedAsset companyId(Integer companyId) {
    
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


  public FixedAsset depreciationAccountItemId(Integer depreciationAccountItemId) {
    
    this.depreciationAccountItemId = depreciationAccountItemId;
    return this;
  }

   /**
   * 減価償却に使う勘定科目ID
   * @return depreciationAccountItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99", value = "減価償却に使う勘定科目ID")

  public Integer getDepreciationAccountItemId() {
    return depreciationAccountItemId;
  }


  public void setDepreciationAccountItemId(Integer depreciationAccountItemId) {
    this.depreciationAccountItemId = depreciationAccountItemId;
  }


  public FixedAsset depreciationAmount(Integer depreciationAmount) {
    
    this.depreciationAmount = depreciationAmount;
    return this;
  }

   /**
   * 減価償却費
   * @return depreciationAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18533", value = "減価償却費")

  public Integer getDepreciationAmount() {
    return depreciationAmount;
  }


  public void setDepreciationAmount(Integer depreciationAmount) {
    this.depreciationAmount = depreciationAmount;
  }


  public FixedAsset depreciationMethod(DepreciationMethodEnum depreciationMethod) {
    
    this.depreciationMethod = depreciationMethod;
    return this;
  }

   /**
   * 償却方法:(少額償却: small_sum_method, 一括償却: lump_sum_method, 定額法: straight_line_method, 定率法: multiple_method, 旧定率法: old_multiple_method, 旧定額法: old_straight_line_method, 償却なし: non_depreciate_method, 任意償却: voluntary_method, 即時償却: immediate_method, 均等償却: equal_method)
   * @return depreciationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "straight_line_method", value = "償却方法:(少額償却: small_sum_method, 一括償却: lump_sum_method, 定額法: straight_line_method, 定率法: multiple_method, 旧定率法: old_multiple_method, 旧定額法: old_straight_line_method, 償却なし: non_depreciate_method, 任意償却: voluntary_method, 即時償却: immediate_method, 均等償却: equal_method)")

  public DepreciationMethodEnum getDepreciationMethod() {
    return depreciationMethod;
  }


  public void setDepreciationMethod(DepreciationMethodEnum depreciationMethod) {
    this.depreciationMethod = depreciationMethod;
  }


  public FixedAsset id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 固定資産ID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "固定資産ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public FixedAsset itemId(Integer itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 品目ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "品目ID")

  public Integer getItemId() {
    return itemId;
  }


  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }


  public FixedAsset lifeYears(Integer lifeYears) {
    
    this.lifeYears = lifeYears;
    return this;
  }

   /**
   * 耐用年数
   * @return lifeYears
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "耐用年数")

  public Integer getLifeYears() {
    return lifeYears;
  }


  public void setLifeYears(Integer lifeYears) {
    this.lifeYears = lifeYears;
  }


  public FixedAsset managementNumber(String managementNumber) {
    
    this.managementNumber = managementNumber;
    return this;
  }

   /**
   * 管理番号
   * @return managementNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pc-0001", value = "管理番号")

  public String getManagementNumber() {
    return managementNumber;
  }


  public void setManagementNumber(String managementNumber) {
    this.managementNumber = managementNumber;
  }


  public FixedAsset name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 固定資産名
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "pc", required = true, value = "固定資産名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FixedAsset openingAccumulatedDepreciation(Integer openingAccumulatedDepreciation) {
    
    this.openingAccumulatedDepreciation = openingAccumulatedDepreciation;
    return this;
  }

   /**
   * 期首減価償却累計額
   * @return openingAccumulatedDepreciation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000", value = "期首減価償却累計額")

  public Integer getOpeningAccumulatedDepreciation() {
    return openingAccumulatedDepreciation;
  }


  public void setOpeningAccumulatedDepreciation(Integer openingAccumulatedDepreciation) {
    this.openingAccumulatedDepreciation = openingAccumulatedDepreciation;
  }


  public FixedAsset openingBalance(Integer openingBalance) {
    
    this.openingBalance = openingBalance;
    return this;
  }

   /**
   * 期首残高
   * @return openingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "92000", value = "期首残高")

  public Integer getOpeningBalance() {
    return openingBalance;
  }


  public void setOpeningBalance(Integer openingBalance) {
    this.openingBalance = openingBalance;
  }


  public FixedAsset prefectureCode(Integer prefectureCode) {
    
    this.prefectureCode = prefectureCode;
    return this;
  }

   /**
   * 都道府県コード（-1: 設定しない、0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄
   * minimum: -1
   * maximum: 46
   * @return prefectureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "都道府県コード（-1: 設定しない、0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄")

  public Integer getPrefectureCode() {
    return prefectureCode;
  }


  public void setPrefectureCode(Integer prefectureCode) {
    this.prefectureCode = prefectureCode;
  }


  public FixedAsset retireDate(LocalDate retireDate) {
    
    this.retireDate = retireDate;
    return this;
  }

   /**
   * 除却日、もしくは売却日
   * @return retireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Mar 24 00:00:00 UTC 2022", value = "除却日、もしくは売却日")

  public LocalDate getRetireDate() {
    return retireDate;
  }


  public void setRetireDate(LocalDate retireDate) {
    this.retireDate = retireDate;
  }


  public FixedAsset retireType(RetireTypeEnum retireType) {
    
    this.retireType = retireType;
    return this;
  }

   /**
   * 売却もしくは除却ステータス: (売却: sell, 除却: retire, 償却中: depreciating)
   * @return retireType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "retire", value = "売却もしくは除却ステータス: (売却: sell, 除却: retire, 償却中: depreciating)")

  public RetireTypeEnum getRetireType() {
    return retireType;
  }


  public void setRetireType(RetireTypeEnum retireType) {
    this.retireType = retireType;
  }


  public FixedAsset sectionId(Integer sectionId) {
    
    this.sectionId = sectionId;
    return this;
  }

   /**
   * 部門ID
   * @return sectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "部門ID")

  public Integer getSectionId() {
    return sectionId;
  }


  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }


  public FixedAsset updatedAt(LocalDate updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * 更新日
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Jul 13 00:00:00 UTC 2021", value = "更新日")

  public LocalDate getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedAsset fixedAsset = (FixedAsset) o;
    return Objects.equals(this.accountItemId, fixedAsset.accountItemId) &&
        Objects.equals(this.acquisitionCost, fixedAsset.acquisitionCost) &&
        Objects.equals(this.acquisitionDate, fixedAsset.acquisitionDate) &&
        Objects.equals(this.cityName, fixedAsset.cityName) &&
        Objects.equals(this.closingAccumulatedDepreciation, fixedAsset.closingAccumulatedDepreciation) &&
        Objects.equals(this.closingBalance, fixedAsset.closingBalance) &&
        Objects.equals(this.companyId, fixedAsset.companyId) &&
        Objects.equals(this.depreciationAccountItemId, fixedAsset.depreciationAccountItemId) &&
        Objects.equals(this.depreciationAmount, fixedAsset.depreciationAmount) &&
        Objects.equals(this.depreciationMethod, fixedAsset.depreciationMethod) &&
        Objects.equals(this.id, fixedAsset.id) &&
        Objects.equals(this.itemId, fixedAsset.itemId) &&
        Objects.equals(this.lifeYears, fixedAsset.lifeYears) &&
        Objects.equals(this.managementNumber, fixedAsset.managementNumber) &&
        Objects.equals(this.name, fixedAsset.name) &&
        Objects.equals(this.openingAccumulatedDepreciation, fixedAsset.openingAccumulatedDepreciation) &&
        Objects.equals(this.openingBalance, fixedAsset.openingBalance) &&
        Objects.equals(this.prefectureCode, fixedAsset.prefectureCode) &&
        Objects.equals(this.retireDate, fixedAsset.retireDate) &&
        Objects.equals(this.retireType, fixedAsset.retireType) &&
        Objects.equals(this.sectionId, fixedAsset.sectionId) &&
        Objects.equals(this.updatedAt, fixedAsset.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItemId, acquisitionCost, acquisitionDate, cityName, closingAccumulatedDepreciation, closingBalance, companyId, depreciationAccountItemId, depreciationAmount, depreciationMethod, id, itemId, lifeYears, managementNumber, name, openingAccumulatedDepreciation, openingBalance, prefectureCode, retireDate, retireType, sectionId, updatedAt);
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
    sb.append("class FixedAsset {\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    acquisitionCost: ").append(toIndentedString(acquisitionCost)).append("\n");
    sb.append("    acquisitionDate: ").append(toIndentedString(acquisitionDate)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    closingAccumulatedDepreciation: ").append(toIndentedString(closingAccumulatedDepreciation)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    depreciationAccountItemId: ").append(toIndentedString(depreciationAccountItemId)).append("\n");
    sb.append("    depreciationAmount: ").append(toIndentedString(depreciationAmount)).append("\n");
    sb.append("    depreciationMethod: ").append(toIndentedString(depreciationMethod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    lifeYears: ").append(toIndentedString(lifeYears)).append("\n");
    sb.append("    managementNumber: ").append(toIndentedString(managementNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openingAccumulatedDepreciation: ").append(toIndentedString(openingAccumulatedDepreciation)).append("\n");
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    prefectureCode: ").append(toIndentedString(prefectureCode)).append("\n");
    sb.append("    retireDate: ").append(toIndentedString(retireDate)).append("\n");
    sb.append("    retireType: ").append(toIndentedString(retireType)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
