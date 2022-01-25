# SelectablesApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFormsSelectables**](SelectablesApi.md#getFormsSelectables) | **GET** api/1/forms/selectables | フォーム用選択項目情報の取得



## getFormsSelectables

> SelectablesIndexResponse getFormsSelectables(companyId, includes)

フォーム用選択項目情報の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SelectablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SelectablesApi apiInstance = new SelectablesApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String includes = "account_item"; // String | 取得する項目(項目: account_item)
        try {
            SelectablesIndexResponse result = apiInstance.getFormsSelectables(companyId, includes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelectablesApi#getFormsSelectables");
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
 **includes** | **String**| 取得する項目(項目: account_item) | [optional] [enum: account_item]

### Return type

[**SelectablesIndexResponse**](SelectablesIndexResponse.md)

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
| **500** |  |  -  |

