# PaymentsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDealPayment**](PaymentsApi.md#createDealPayment) | **POST** api/1/deals/{id}/payments | 取引（収入／支出）の支払行作成
[**destroyDealPayment**](PaymentsApi.md#destroyDealPayment) | **DELETE** api/1/deals/{id}/payments/{payment_id} | 取引（収入／支出）の支払行削除
[**updateDealPayment**](PaymentsApi.md#updateDealPayment) | **PUT** api/1/deals/{id}/payments/{payment_id} | 取引（収入／支出）の支払行更新



## createDealPayment

> DealResponse createDealPayment(id, paymentParams)

取引（収入／支出）の支払行作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        Integer id = 56; // Integer | 取引ID
        PaymentParams paymentParams = new PaymentParams(); // PaymentParams | 取引（収入／支出）の支払行作成
        try {
            DealResponse result = apiInstance.createDealPayment(id, paymentParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#createDealPayment");
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
 **paymentParams** | [**PaymentParams**](PaymentParams.md)| 取引（収入／支出）の支払行作成 |

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
| **404** |  |  -  |
| **500** |  |  -  |


## destroyDealPayment

> destroyDealPayment(id, paymentId, companyId)

取引（収入／支出）の支払行削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        Integer id = 56; // Integer | 取引ID
        Long paymentId = 56L; // Long | 決済ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyDealPayment(id, paymentId, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#destroyDealPayment");
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
 **paymentId** | **Long**| 決済ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |


## updateDealPayment

> DealResponse updateDealPayment(id, paymentId, paymentParams)

取引（収入／支出）の支払行更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        Integer id = 56; // Integer | 取引ID
        Long paymentId = 56L; // Long | 決済ID
        PaymentParams paymentParams = new PaymentParams(); // PaymentParams | 取引（収入／支出）の支払行更新
        try {
            DealResponse result = apiInstance.updateDealPayment(id, paymentId, paymentParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#updateDealPayment");
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
 **paymentId** | **Long**| 決済ID |
 **paymentParams** | [**PaymentParams**](PaymentParams.md)| 取引（収入／支出）の支払行更新 |

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
| **404** |  |  -  |
| **500** |  |  -  |

