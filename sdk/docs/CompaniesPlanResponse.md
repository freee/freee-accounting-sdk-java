

# CompaniesPlanResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 事業所ID | 
**orgCode** | [**OrgCodeEnum**](#OrgCodeEnum) | 事業形態（個人事業主: personal、法人: corporate） | 
**plan** | [**PlanEnum**](#PlanEnum) | 会計プラン 個人用(non_charged: 無料プラン、starter: スターター、standard: スタンダード、premium: プレミアム) 法人用(non_charged: 無料プラン、minimum: ミニマム、basic: ベーシック、professional: プロフェッショナル、enterprise: エンタープライズ) | 



## Enum: OrgCodeEnum

Name | Value
---- | -----
PERSONAL | &quot;personal&quot;
CORPORATE | &quot;corporate&quot;



## Enum: PlanEnum

Name | Value
---- | -----
NON_CHARGED | &quot;non_charged&quot;
STARTER | &quot;starter&quot;
STANDARD | &quot;standard&quot;
PREMIUM | &quot;premium&quot;
MINIMUM | &quot;minimum&quot;
BASIC | &quot;basic&quot;
PROFESSIONAL | &quot;professional&quot;
ENTERPRISE | &quot;enterprise&quot;



