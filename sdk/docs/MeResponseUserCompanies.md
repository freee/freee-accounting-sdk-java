

# MeResponseUserCompanies


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advisorId** | **Integer** | アドバイザープロファイルID（アドバイザー事業所で無い場合にnullになります） |  [optional]
**displayName** | **String** | 表示名 | 
**id** | **Integer** | 事業所ID | 
**role** | [**RoleEnum**](#RoleEnum) | ユーザーの権限 &lt;ul&gt; &lt;li&gt;admin: 管理者&lt;/li&gt; &lt;li&gt;simple_accounting: 一般&lt;/li&gt; &lt;li&gt;self_only: 取引登録のみ&lt;/li&gt; &lt;li&gt;read_only: 閲覧のみ&lt;/li&gt; &lt;li&gt;workflow: 申請・承認&lt;/li&gt; &lt;/ul&gt; | 
**useCustomRole** | **Boolean** | カスタム権限（true: 使用する、false: 使用しない） | 



## Enum: RoleEnum

Name | Value
---- | -----
ADMIN | &quot;admin&quot;
SIMPLE_ACCOUNTING | &quot;simple_accounting&quot;
SELF_ONLY | &quot;self_only&quot;
READ_ONLY | &quot;read_only&quot;
WORKFLOW | &quot;workflow&quot;



