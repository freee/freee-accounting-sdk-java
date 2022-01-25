# RenewsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDealRenew**](RenewsApi.md#createDealRenew) | **POST** api/1/deals/{id}/renews | 取引（収入／支出）に対する+更新の作成
[**deleteDealRenew**](RenewsApi.md#deleteDealRenew) | **DELETE** api/1/deals/{id}/renews/{renew_id} | 取引（収入／支出）の+更新の削除
[**updateDealRenew**](RenewsApi.md#updateDealRenew) | **PUT** api/1/deals/{id}/renews/{renew_id} | 取引（収入／支出）の+更新の更新



## createDealRenew

> DealResponse createDealRenew(id, renewCreateParams)

取引（収入／支出）に対する+更新の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.RenewsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        RenewsApi apiInstance = new RenewsApi(defaultClient);
        Integer id = 56; // Integer | 取引ID
        RenewCreateParams renewCreateParams = new RenewCreateParams(); // RenewCreateParams | 取引（収入／支出）に対する+更新の情報
        try {
            DealResponse result = apiInstance.createDealRenew(id, renewCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RenewsApi#createDealRenew");
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
 **id** | **Integer**| 取引ID |
 **renewCreateParams** | [**RenewCreateParams**](RenewCreateParams.md)| 取引（収入／支出）に対する+更新の情報 |

### Return type

[**DealResponse**](DealResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |


## deleteDealRenew

> DealResponse deleteDealRenew(id, renewId, companyId)

取引（収入／支出）の+更新の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.RenewsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        RenewsApi apiInstance = new RenewsApi(defaultClient);
        Integer id = 56; // Integer | 取引ID
        Integer renewId = 56; // Integer | +更新ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            DealResponse result = apiInstance.deleteDealRenew(id, renewId, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RenewsApi#deleteDealRenew");
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
 **id** | **Integer**| 取引ID |
 **renewId** | **Integer**| +更新ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**DealResponse**](DealResponse.md)

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


## updateDealRenew

> DealResponse updateDealRenew(id, renewId, renewUpdateParams)

取引（収入／支出）の+更新の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.RenewsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        RenewsApi apiInstance = new RenewsApi(defaultClient);
        Integer id = 56; // Integer | 取引ID
        Integer renewId = 56; // Integer | +更新ID
        RenewUpdateParams renewUpdateParams = new RenewUpdateParams(); // RenewUpdateParams | +更新の更新情報
        try {
            DealResponse result = apiInstance.updateDealRenew(id, renewId, renewUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RenewsApi#updateDealRenew");
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
 **id** | **Integer**| 取引ID |
 **renewId** | **Integer**| +更新ID |
 **renewUpdateParams** | [**RenewUpdateParams**](RenewUpdateParams.md)| +更新の更新情報 |

### Return type

[**DealResponse**](DealResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |

