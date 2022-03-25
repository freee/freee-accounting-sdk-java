

# PartnerResponsePartner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressAttributes** | [**PartnerResponsePartnerAddressAttributes**](PartnerResponsePartnerAddressAttributes.md) |  |  [optional]
**available** | **Boolean** | 取引先の使用設定（true: 使用する、false: 使用しない） &lt;br&gt; &lt;ul&gt;   &lt;li&gt;     本APIでpartnerを作成した場合はtrueになります。   &lt;/li&gt;   &lt;li&gt;     falseにする場合はWeb画面から変更できます。   &lt;/li&gt;   &lt;li&gt;     trueの場合、Web画面での取引登録時などに入力候補として表示されます。   &lt;/li&gt;   &lt;li&gt;     falseの場合、取引先自体は削除せず、Web画面での取引登録時などに入力候補として表示されません。ただし取引（収入／支出）の作成APIなどでfalseの取引先をパラメータに指定すれば、取引などにfalseの取引先を設定できます。   &lt;/li&gt; &lt;/ul&gt; | 
**code** | **String** | 取引先コード | 
**companyId** | **Integer** | 事業所ID | 
**contactName** | **String** | 担当者 氏名 |  [optional]
**countryCode** | **String** | 地域（JP: 国内、ZZ:国外） |  [optional]
**defaultTitle** | **String** | 敬称（御中、様、(空白)の3つから選択） |  [optional]
**email** | **String** | 担当者 メールアドレス |  [optional]
**id** | **Integer** | 取引先ID | 
**invoicePaymentTermAttributes** | [**PartnerResponsePartnerInvoicePaymentTermAttributes**](PartnerResponsePartnerInvoicePaymentTermAttributes.md) |  |  [optional]
**longName** | **String** | 正式名称（255文字以内） |  [optional]
**name** | **String** | 取引先名 | 
**nameKana** | **String** | カナ名称（255文字以内） |  [optional]
**orgCode** | **Integer** | 事業所種別（null: 未設定、1: 法人、2: 個人） |  [optional]
**partnerBankAccountAttributes** | [**PartnerResponsePartnerPartnerBankAccountAttributes**](PartnerResponsePartnerPartnerBankAccountAttributes.md) |  |  [optional]
**partnerDocSettingAttributes** | [**PartnerResponsePartnerPartnerDocSettingAttributes**](PartnerResponsePartnerPartnerDocSettingAttributes.md) |  |  [optional]
**payerWalletableId** | **Integer** | 振込元口座ID（一括振込ファイル用）:（未設定の場合は、nullです。） |  [optional]
**paymentTermAttributes** | [**PartnerResponsePartnerInvoicePaymentTermAttributes**](PartnerResponsePartnerInvoicePaymentTermAttributes.md) |  |  [optional]
**phone** | **String** | 電話番号 |  [optional]
**shortcut1** | **String** | ショートカット1 (255文字以内) |  [optional]
**shortcut2** | **String** | ショートカット2 (255文字以内) |  [optional]
**transferFeeHandlingSide** | [**TransferFeeHandlingSideEnum**](#TransferFeeHandlingSideEnum) | 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee) |  [optional]
**updateDate** | **String** | 更新日 (yyyy-mm-dd) | 



## Enum: TransferFeeHandlingSideEnum

Name | Value
---- | -----
PAYER | &quot;payer&quot;
PAYEE | &quot;payee&quot;



