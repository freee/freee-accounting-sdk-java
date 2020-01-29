

# UsersMeResponseUserCompanies

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 事業所ID | 
**displayName** | **String** | 表示名 | 
**role** | [**RoleEnum**](#RoleEnum) | ユーザーの権限 | 
**useCustomRole** | **Boolean** | カスタム権限（true: 使用する、false: 使用しない） | 



## Enum: RoleEnum

Name | Value
---- | -----
ADMIN | &quot;admin&quot;
SIMPLE_ACCOUNTING | &quot;simple_accounting&quot;
SELF_ONLY | &quot;self_only&quot;
READ_ONLY | &quot;read_only&quot;



