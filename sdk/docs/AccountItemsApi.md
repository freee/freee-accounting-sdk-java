# AccountItemsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountItem**](AccountItemsApi.md#createAccountItem) | **POST** api/1/account_items | 勘定科目の作成
[**destroyAccountItem**](AccountItemsApi.md#destroyAccountItem) | **DELETE** api/1/account_items/{id} | 勘定科目の削除
[**getAccountItem**](AccountItemsApi.md#getAccountItem) | **GET** api/1/account_items/{id} | 勘定科目の詳細情報の取得
[**getAccountItems**](AccountItemsApi.md#getAccountItems) | **GET** api/1/account_items | 勘定科目一覧の取得
[**updateAccountItem**](AccountItemsApi.md#updateAccountItem) | **PUT** api/1/account_items/{id} | 勘定科目の更新



## createAccountItem

> AccountItemsCreateResponse createAccountItem(parameters)

勘定科目の作成

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の勘定科目を作成する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.AccountItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountItemsApi apiInstance = new AccountItemsApi(defaultClient);
        AccountItemParams parameters = new AccountItemParams(); // AccountItemParams | 勘定科目の作成
        try {
            AccountItemsCreateResponse result = apiInstance.createAccountItem(parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountItemsApi#createAccountItem");
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
 **parameters** | [**AccountItemParams**](AccountItemParams.md)| 勘定科目の作成 |

### Return type

[**AccountItemsCreateResponse**](AccountItemsCreateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |


## destroyAccountItem

> destroyAccountItem(id, companyId)

勘定科目の削除

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した勘定科目を削除する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;削除できる勘定科目は、追加で作成したカスタム勘定項目のみです。&lt;/li&gt; &lt;li&gt;デフォルトで存在する勘定科目や口座の勘定科目は削除できません。&lt;/li&gt;&lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.AccountItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountItemsApi apiInstance = new AccountItemsApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyAccountItem(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountItemsApi#destroyAccountItem");
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
| **500** |  |  -  |


## getAccountItem

> AccountItemsShowResponse getAccountItem(id, companyId)

勘定科目の詳細情報の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した勘定科目の詳細を取得する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.AccountItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountItemsApi apiInstance = new AccountItemsApi(defaultClient);
        Integer id = 56; // Integer | 勘定科目ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            AccountItemsShowResponse result = apiInstance.getAccountItem(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountItemsApi#getAccountItem");
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
 **id** | **Integer**| 勘定科目ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**AccountItemsShowResponse**](AccountItemsShowResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |


## getAccountItems

> AccountItemsIndexResponse getAccountItems(companyId, baseDate)

勘定科目一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の勘定科目一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;default_tax_id : デフォルト設定がされている税区分ID&lt;/li&gt;  &lt;li&gt;default_tax_code : リクエストした日時を基準とした税区分コード&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.AccountItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountItemsApi apiInstance = new AccountItemsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String baseDate = "baseDate_example"; // String | 基準日:指定した場合、勘定科目に紐づく税区分(default_tax_code)が、基準日の税率に基づいて返ります。
        try {
            AccountItemsIndexResponse result = apiInstance.getAccountItems(companyId, baseDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountItemsApi#getAccountItems");
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
 **baseDate** | **String**| 基準日:指定した場合、勘定科目に紐づく税区分(default_tax_code)が、基準日の税率に基づいて返ります。 | [optional]

### Return type

[**AccountItemsIndexResponse**](AccountItemsIndexResponse.md)

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
| **500** |  |  -  |


## updateAccountItem

> AccountItemsUpdateResponse updateAccountItem(id, parameters)

勘定科目の更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;勘定科目を更新する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.AccountItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AccountItemsApi apiInstance = new AccountItemsApi(defaultClient);
        Integer id = 56; // Integer | 
        AccountItemParams parameters = new AccountItemParams(); // AccountItemParams | 勘定科目の更新
        try {
            AccountItemsUpdateResponse result = apiInstance.updateAccountItem(id, parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountItemsApi#updateAccountItem");
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
 **parameters** | [**AccountItemParams**](AccountItemParams.md)| 勘定科目の更新 |

### Return type

[**AccountItemsUpdateResponse**](AccountItemsUpdateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

