

# Item


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**available** | **Boolean** | 品目の使用設定（true: 使用する、false: 使用しない） &lt;br&gt; &lt;ul&gt;   &lt;li&gt;     本APIでitemを作成した場合はtrueになります。   &lt;/li&gt;   &lt;li&gt;     falseにする場合はWeb画面から変更できます。   &lt;/li&gt;   &lt;li&gt;     trueの場合、Web画面での取引登録時などに入力候補として表示されます。   &lt;/li&gt;   &lt;li&gt;     falseの場合、品目自体は削除せず、Web画面での取引登録時などに入力候補として表示されません。ただし取引（収入／支出）の作成APIなどでfalseの品目をパラメータに指定すれば、取引などにfalseの品目を設定できます。   &lt;/li&gt; &lt;/ul&gt; |  |
|**companyId** | **Integer** | 事業所ID |  |
|**id** | **Integer** | 品目ID |  |
|**name** | **String** | 品目名 (30文字以内) |  |
|**shortcut1** | **String** | ショートカット１ (20文字以内) |  [optional] |
|**shortcut2** | **String** | ショートカット２ (20文字以内) |  [optional] |
|**updateDate** | **String** | 更新日(yyyy-mm-dd) |  |



