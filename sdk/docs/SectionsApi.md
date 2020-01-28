# SectionsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSection**](SectionsApi.md#createSection) | **POST** api/1/sections | 部門の作成
[**destroySection**](SectionsApi.md#destroySection) | **DELETE** api/1/sections/{id} | 部門の削除
[**getSection**](SectionsApi.md#getSection) | **GET** api/1/sections/{id} | 
[**getSections**](SectionsApi.md#getSections) | **GET** api/1/sections | 部門一覧の取得
[**updateSection**](SectionsApi.md#updateSection) | **PUT** api/1/sections/{id} | 部門の更新



## createSection

> SectionsCreateResponse createSection(parameters)

部門の作成

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,     &amp;quot;indent_count&amp;quot;: 1,     &amp;quot;parent_id&amp;quot;: 101   } } // それ以外のプラン {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;   } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        SectionParams parameters = new SectionParams(); // SectionParams | 部門の作成
        try {
            SectionsCreateResponse result = apiInstance.createSection(parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#createSection");
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
 **parameters** | [**SectionParams**](SectionParams.md)| 部門の作成 | [optional]

### Return type

[**SectionsCreateResponse**](SectionsCreateResponse.md)

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


## destroySection

> destroySection(id, companyId)

部門の削除

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を削除する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        Integer id = 56; // Integer | 
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroySection(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#destroySection");
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


## getSection

> SectionsShowResponse getSection(id, companyId)



 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を参照する&lt;/p&gt;&lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,     &amp;quot;indent_count&amp;quot;: 1,     &amp;quot;parent_id&amp;quot;: 101   } } // それ以外のプラン {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;   } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        Integer id = 56; // Integer | 部門ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            SectionsShowResponse result = apiInstance.getSection(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#getSection");
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
 **id** | **Integer**| 部門ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**SectionsShowResponse**](SectionsShowResponse.md)

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


## getSections

> SectionsIndexResponse getSections(companyId)

部門一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;blockquote&gt; &lt;p&gt;GET https://api.freee.co.jp/api/1/sections?company_id&#x3D;1&lt;/p&gt; &lt;/blockquote&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;sections&amp;quot; : [     {       &amp;quot;id&amp;quot; : 101,       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,       &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,       &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,       &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,       &amp;quot;indent_count&amp;quot;: 1,       &amp;quot;parent_id&amp;quot;: 11     },     ...   ] } // それ以外のプラン {   &amp;quot;sections&amp;quot; : [     {       &amp;quot;id&amp;quot; : 101,       &amp;quot;company_id&amp;quot; : 1,       &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,       &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,       &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,       &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;     },     ...   ] }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        try {
            SectionsIndexResponse result = apiInstance.getSections(companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#getSections");
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

[**SectionsIndexResponse**](SectionsIndexResponse.md)

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


## updateSection

> SectionsUpdateResponse updateSection(id, parameters)

部門の更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の部門を更新する&lt;/p&gt;&lt;h2 id&#x3D;\&quot;_2\&quot;&gt;レスポンスの例&lt;/h2&gt;  &lt;pre&gt;&lt;code&gt;// プレミアムプラン（個人）、ビジネスプラン（法人）、エンタープライズプラン（法人） {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;,     &amp;quot;indent_count&amp;quot;: 1,     &amp;quot;parent_id&amp;quot;: 101   } } // それ以外のプラン {   &amp;quot;section&amp;quot; : {     &amp;quot;id&amp;quot; : 102,     &amp;quot;company_id&amp;quot; : 1,     &amp;quot;name&amp;quot; : &amp;quot;開発部門&amp;quot;,     &amp;quot;long_name&amp;quot;: &amp;quot;開発部門&amp;quot;,     &amp;quot;shortcut1&amp;quot; : &amp;quot;DEVELOPER&amp;quot;,     &amp;quot;shortcut2&amp;quot; : &amp;quot;123&amp;quot;   } }&lt;/code&gt;&lt;/pre&gt; 

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        Integer id = 56; // Integer | 
        SectionParams parameters = new SectionParams(); // SectionParams | 部門の更新
        try {
            SectionsUpdateResponse result = apiInstance.updateSection(id, parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#updateSection");
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
 **parameters** | [**SectionParams**](SectionParams.md)| 部門の更新 | [optional]

### Return type

[**SectionsUpdateResponse**](SectionsUpdateResponse.md)

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

