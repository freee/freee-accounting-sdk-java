# WalletablesApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWalletable**](WalletablesApi.md#createWalletable) | **POST** api/1/walletables | 口座の作成
[**destroyWalletable**](WalletablesApi.md#destroyWalletable) | **DELETE** api/1/walletables/{type}/{id} | 口座の削除
[**getWalletable**](WalletablesApi.md#getWalletable) | **GET** api/1/walletables/{type}/{id} | 口座情報の取得
[**getWalletables**](WalletablesApi.md#getWalletables) | **GET** api/1/walletables | 口座一覧の取得
[**updateWalletable**](WalletablesApi.md#updateWalletable) | **PUT** api/1/walletables/{type}/{id} | 口座の更新



## createWalletable

> WalletableCreateResponse createWalletable(walletableCreateParams)

口座の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.WalletablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletablesApi apiInstance = new WalletablesApi(defaultClient);
        WalletableCreateParams walletableCreateParams = new WalletableCreateParams(); // WalletableCreateParams | 口座の作成
        try {
            WalletableCreateResponse result = apiInstance.createWalletable(walletableCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletablesApi#createWalletable");
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
 **walletableCreateParams** | [**WalletableCreateParams**](WalletableCreateParams.md)| 口座の作成 | [optional]

### Return type

[**WalletableCreateResponse**](WalletableCreateResponse.md)

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


## destroyWalletable

> destroyWalletable(id, type, companyId)

口座の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.WalletablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletablesApi apiInstance = new WalletablesApi(defaultClient);
        Integer id = 56; // Integer | 口座ID
        String type = "bank_account"; // String | 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyWalletable(id, type, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletablesApi#destroyWalletable");
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
 **id** | **Integer**| 口座ID |
 **type** | **String**| 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） | [enum: bank_account, credit_card, wallet]
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


## getWalletable

> InlineResponse20016 getWalletable(id, type, companyId)

口座情報の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.WalletablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletablesApi apiInstance = new WalletablesApi(defaultClient);
        Integer id = 56; // Integer | 口座ID
        String type = "bank_account"; // String | 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）
        Integer companyId = 56; // Integer | 事業所ID
        try {
            InlineResponse20016 result = apiInstance.getWalletable(id, type, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletablesApi#getWalletable");
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
 **id** | **Integer**| 口座ID |
 **type** | **String**| 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） | [enum: bank_account, credit_card, wallet]
 **companyId** | **Integer**| 事業所ID |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

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


## getWalletables

> InlineResponse20015 getWalletables(companyId, withBalance, type)

口座一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.WalletablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletablesApi apiInstance = new WalletablesApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Boolean withBalance = true; // Boolean | 残高情報を含める
        String type = "bank_account"; // String | 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）
        try {
            InlineResponse20015 result = apiInstance.getWalletables(companyId, withBalance, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletablesApi#getWalletables");
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
 **withBalance** | **Boolean**| 残高情報を含める | [optional]
 **type** | **String**| 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） | [optional] [enum: bank_account, credit_card, wallet]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

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


## updateWalletable

> InlineResponse20016 updateWalletable(id, type, walletableUpdateParams)

口座の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.WalletablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletablesApi apiInstance = new WalletablesApi(defaultClient);
        Integer id = 56; // Integer | 
        String type = "bank_account"; // String | 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）
        WalletableUpdateParams walletableUpdateParams = new WalletableUpdateParams(); // WalletableUpdateParams | 口座の作成
        try {
            InlineResponse20016 result = apiInstance.updateWalletable(id, type, walletableUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletablesApi#updateWalletable");
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
 **id** | **Integer**|  |
 **type** | **String**| 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座） | [enum: bank_account, credit_card, wallet]
 **walletableUpdateParams** | [**WalletableUpdateParams**](WalletableUpdateParams.md)| 口座の作成 | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

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

