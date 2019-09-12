/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateWalletableParams model.
 */
public class CreateWalletableParams {
    /**
     * 口座名.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）.
     * Possible values include: 'bank_account', 'credit_card', 'wallet'.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * サービスID.
     */
    @JsonProperty(value = "bank_id")
    private Integer bankId;

    /**
     * 決算書表示名（小カテゴリー） 例：売掛金, 受取手形, 未収入金（法人のみ）, 買掛金, 支払手形, 未払金, 預り金, 前受金.
     */
    @JsonProperty(value = "group_name")
    private String groupName;

    /**
     * Get 口座名.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 口座名.
     *
     * @param name the name value to set
     * @return the CreateWalletableParams object itself.
     */
    public CreateWalletableParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）. Possible values include: 'bank_account', 'credit_card', 'wallet'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）. Possible values include: 'bank_account', 'credit_card', 'wallet'.
     *
     * @param type the type value to set
     * @return the CreateWalletableParams object itself.
     */
    public CreateWalletableParams withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get 事業所ID.
     *
     * @return the companyId value
     */
    public int companyId() {
        return this.companyId;
    }

    /**
     * Set 事業所ID.
     *
     * @param companyId the companyId value to set
     * @return the CreateWalletableParams object itself.
     */
    public CreateWalletableParams withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get サービスID.
     *
     * @return the bankId value
     */
    public Integer bankId() {
        return this.bankId;
    }

    /**
     * Set サービスID.
     *
     * @param bankId the bankId value to set
     * @return the CreateWalletableParams object itself.
     */
    public CreateWalletableParams withBankId(Integer bankId) {
        this.bankId = bankId;
        return this;
    }

    /**
     * Get 決算書表示名（小カテゴリー） 例：売掛金, 受取手形, 未収入金（法人のみ）, 買掛金, 支払手形, 未払金, 預り金, 前受金.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set 決算書表示名（小カテゴリー） 例：売掛金, 受取手形, 未収入金（法人のみ）, 買掛金, 支払手形, 未払金, 預り金, 前受金.
     *
     * @param groupName the groupName value to set
     * @return the CreateWalletableParams object itself.
     */
    public CreateWalletableParams withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

}
