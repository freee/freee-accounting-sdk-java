# ItemsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createItem**](ItemsApi.md#createItem) | **POST** api/1/items | 品目の作成
[**destroyItem**](ItemsApi.md#destroyItem) | **DELETE** api/1/items/{id} | 品目の削除
[**getItem**](ItemsApi.md#getItem) | **GET** api/1/items/{id} | 品目の取得
[**getItems**](ItemsApi.md#getItems) | **GET** api/1/items | 品目一覧の取得
[**updateItem**](ItemsApi.md#updateItem) | **PUT** api/1/items/{id} | 品目の更新



## createItem

> ItemResponse createItem(itemParams)

品目の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        ItemParams itemParams = new ItemParams(); // ItemParams | 品目の作成
        try {
            ItemResponse result = apiInstance.createItem(itemParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#createItem");
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
 **itemParams** | [**ItemParams**](ItemParams.md)| 品目の作成 | [optional]

### Return type

[**ItemResponse**](ItemResponse.md)

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


## destroyItem

> destroyItem(id, companyId)

品目の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        Integer id = 56; // Integer | 品目ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyItem(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#destroyItem");
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
 **id** | **Integer**| 品目ID |
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


## getItem

> ItemResponse getItem(id, companyId)

品目の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        Integer id = 56; // Integer | 品目ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ItemResponse result = apiInstance.getItem(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItem");
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
 **id** | **Integer**| 品目ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**ItemResponse**](ItemResponse.md)

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


## getItems

> InlineResponse2003 getItems(companyId, startUpdateDate, endUpdateDate, offset, limit)

品目一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String startUpdateDate = "startUpdateDate_example"; // String | 更新日で絞り込み：開始日(yyyy-mm-dd)
        String endUpdateDate = "endUpdateDate_example"; // String | 更新日で絞り込み：終了日(yyyy-mm-dd)
        Integer offset = 56; // Integer | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000)
        try {
            InlineResponse2003 result = apiInstance.getItems(companyId, startUpdateDate, endUpdateDate, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItems");
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
 **startUpdateDate** | **String**| 更新日で絞り込み：開始日(yyyy-mm-dd) | [optional]
 **endUpdateDate** | **String**| 更新日で絞り込み：終了日(yyyy-mm-dd) | [optional]
 **offset** | **Integer**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

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


## updateItem

> ItemResponse updateItem(id, itemParams)

品目の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        Integer id = 56; // Integer | 品目ID
        ItemParams itemParams = new ItemParams(); // ItemParams | 品目の更新
        try {
            ItemResponse result = apiInstance.updateItem(id, itemParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#updateItem");
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
 **id** | **Integer**| 品目ID |
 **itemParams** | [**ItemParams**](ItemParams.md)| 品目の更新 | [optional]

### Return type

[**ItemResponse**](ItemResponse.md)

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

