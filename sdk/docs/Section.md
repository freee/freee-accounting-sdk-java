

# Section


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available** | **Boolean** | 部門の使用設定（true: 使用する、false: 使用しない） &lt;br&gt; &lt;ul&gt;   &lt;li&gt;     本APIでsectionを作成した場合はtrueになります。   &lt;/li&gt;   &lt;li&gt;     falseにする場合はWeb画面から変更できます。   &lt;/li&gt;   &lt;li&gt;     trueの場合、Web画面での取引登録時などに入力候補として表示されます。   &lt;/li&gt;   &lt;li&gt;     falseの場合、部門自体は削除せず、Web画面での取引登録時などに入力候補として表示されません。ただし取引（収入／支出）の作成APIなどでfalseの部門をパラメータに指定すれば、取引などにfalseの部門を設定できます。   &lt;/li&gt; &lt;/ul&gt; | 
**companyId** | **Integer** | 事業所ID | 
**id** | **Integer** | 部門ID | 
**indentCount** | **Integer** | &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/209093566\&quot;&gt;部門階層&lt;/a&gt; &lt;br&gt; ※ indent_count が 0 のときは第一階層の親部門です。  |  [optional]
**longName** | **String** | 正式名称（255文字以内） |  [optional]
**name** | **String** | 部門名 (30文字以内) | 
**parentId** | **Integer** | &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/209093566\&quot;&gt;親部門ID&lt;/a&gt; &lt;br&gt; ※ parent_id が null のときは第一階層の親部門です。  |  [optional]
**shortcut1** | **String** | ショートカット１ (20文字以内) |  [optional]
**shortcut2** | **String** | ショートカット２ (20文字以内) |  [optional]



