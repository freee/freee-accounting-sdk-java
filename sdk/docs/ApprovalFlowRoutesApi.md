# ApprovalFlowRoutesApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApprovalFlowRoute**](ApprovalFlowRoutesApi.md#getApprovalFlowRoute) | **GET** api/1/approval_flow_routes/{id} | 申請経路の取得
[**getApprovalFlowRoutes**](ApprovalFlowRoutesApi.md#getApprovalFlowRoutes) | **GET** api/1/approval_flow_routes | 申請経路一覧の取得



## getApprovalFlowRoute

> ApprovalFlowRouteResponse getApprovalFlowRoute(id, companyId)

申請経路の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalFlowRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalFlowRoutesApi apiInstance = new ApprovalFlowRoutesApi(defaultClient);
        Integer id = 56; // Integer | 経路申請ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ApprovalFlowRouteResponse result = apiInstance.getApprovalFlowRoute(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalFlowRoutesApi#getApprovalFlowRoute");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 経路申請ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**ApprovalFlowRouteResponse**](ApprovalFlowRouteResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |


## getApprovalFlowRoutes

> ApprovalFlowRoutesIndexResponse getApprovalFlowRoutes(companyId, includedUserId, usage, requestFormId)

申請経路一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalFlowRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalFlowRoutesApi apiInstance = new ApprovalFlowRoutesApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Integer includedUserId = 56; // Integer | 経路に含まれるユーザーのユーザーID
        String usage = "TxnApproval"; // String | 申請種別（各申請種別が使用できる申請経路に絞り込めます。例えば、ApprovalRequest を指定すると、各種申請が使用できる申請経路に絞り込めます。） * `TxnApproval` - 仕訳承認 * `ExpenseApplication` - 経費精算 * `PaymentRequest` - 支払依頼 * `ApprovalRequest` - 各種申請 * `DocApproval` - 請求書等 (見積書・納品書・請求書・発注書)
        Integer requestFormId = 56; // Integer | 申請フォームID request_form_id指定時はusage条件をApprovalRequestに指定してください。指定しない場合無効になります。
        try {
            ApprovalFlowRoutesIndexResponse result = apiInstance.getApprovalFlowRoutes(companyId, includedUserId, usage, requestFormId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalFlowRoutesApi#getApprovalFlowRoutes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**| 事業所ID |
 **includedUserId** | **Integer**| 経路に含まれるユーザーのユーザーID | [optional]
 **usage** | **String**| 申請種別（各申請種別が使用できる申請経路に絞り込めます。例えば、ApprovalRequest を指定すると、各種申請が使用できる申請経路に絞り込めます。） * &#x60;TxnApproval&#x60; - 仕訳承認 * &#x60;ExpenseApplication&#x60; - 経費精算 * &#x60;PaymentRequest&#x60; - 支払依頼 * &#x60;ApprovalRequest&#x60; - 各種申請 * &#x60;DocApproval&#x60; - 請求書等 (見積書・納品書・請求書・発注書) | [optional] [enum: TxnApproval, ExpenseApplication, PaymentRequest, ApprovalRequest, DocApproval]
 **requestFormId** | **Integer**| 申請フォームID request_form_id指定時はusage条件をApprovalRequestに指定してください。指定しない場合無効になります。 | [optional]

### Return type

[**ApprovalFlowRoutesIndexResponse**](ApprovalFlowRoutesIndexResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

