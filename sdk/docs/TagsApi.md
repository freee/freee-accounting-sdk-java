# TagsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTag**](TagsApi.md#createTag) | **POST** api/1/tags | メモタグの作成
[**destroyTag**](TagsApi.md#destroyTag) | **DELETE** api/1/tags/{id} | メモタグの削除
[**getTag**](TagsApi.md#getTag) | **GET** api/1/tags/{id} | メモタグの詳細情報の取得
[**getTags**](TagsApi.md#getTags) | **GET** api/1/tags | メモタグ一覧の取得
[**updateTag**](TagsApi.md#updateTag) | **PUT** api/1/tags/{id} | メモタグの更新



## createTag

> TagsResponse createTag(parameters)

メモタグの作成

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを作成する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        TagsParams parameters = new TagsParams(); // TagsParams | メモタグの作成
        try {
            TagsResponse result = apiInstance.createTag(parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#createTag");
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
 **parameters** | [**TagsParams**](TagsParams.md)| メモタグの作成 |

### Return type

[**TagsResponse**](TagsResponse.md)

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


## destroyTag

> destroyTag(id, companyId)

メモタグの削除

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを削除する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        Integer id = 56; // Integer | タグID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyTag(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#destroyTag");
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
 **id** | **Integer**| タグID |
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
| **404** |  |  -  |
| **500** |  |  -  |


## getTag

> TagsResponse getTag(id, companyId)

メモタグの詳細情報の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを取得する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        Integer id = 56; // Integer | タグID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            TagsResponse result = apiInstance.getTag(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getTag");
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
 **id** | **Integer**| タグID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**TagsResponse**](TagsResponse.md)

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


## getTags

> TagsIndexResponse getTags(companyId)

メモタグ一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグ一覧を取得する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        try {
            TagsIndexResponse result = apiInstance.getTags(companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getTags");
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

### Return type

[**TagsIndexResponse**](TagsIndexResponse.md)

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


## updateTag

> TagsResponse updateTag(id, parameters)

メモタグの更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のメモタグを更新する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        Integer id = 56; // Integer | メモタグID
        TagsParams parameters = new TagsParams(); // TagsParams | メモタグの更新
        try {
            TagsResponse result = apiInstance.updateTag(id, parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#updateTag");
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
 **id** | **Integer**| メモタグID |
 **parameters** | [**TagsParams**](TagsParams.md)| メモタグの更新 | [optional]

### Return type

[**TagsResponse**](TagsResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |

