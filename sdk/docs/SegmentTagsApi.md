# SegmentTagsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSegmentTag**](SegmentTagsApi.md#createSegmentTag) | **POST** api/1/segments/{segment_id}/tags | セグメントの作成
[**destroySegmentsTag**](SegmentTagsApi.md#destroySegmentsTag) | **DELETE** api/1/segments/{segment_id}/tags/{id} | セグメントタグの削除
[**getSegmentTags**](SegmentTagsApi.md#getSegmentTags) | **GET** api/1/segments/{segment_id}/tags | セグメントタグ一覧の取得
[**updateSegmentTag**](SegmentTagsApi.md#updateSegmentTag) | **PUT** api/1/segments/{segment_id}/tags/{id} | セグメントタグの更新



## createSegmentTag

> SegmentTagsResponse createSegmentTag(segmentId, parameters)

セグメントの作成

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SegmentTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SegmentTagsApi apiInstance = new SegmentTagsApi(defaultClient);
        Integer segmentId = 56; // Integer | セグメントID
        SegmentTagParams parameters = new SegmentTagParams(); // SegmentTagParams | セグメントタグの作成
        try {
            SegmentTagsResponse result = apiInstance.createSegmentTag(segmentId, parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentTagsApi#createSegmentTag");
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
 **segmentId** | **Integer**| セグメントID |
 **parameters** | [**SegmentTagParams**](SegmentTagParams.md)| セグメントタグの作成 |

### Return type

[**SegmentTagsResponse**](SegmentTagsResponse.md)

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


## destroySegmentsTag

> destroySegmentsTag(segmentId, id, companyId)

セグメントタグの削除

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを削除する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SegmentTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SegmentTagsApi apiInstance = new SegmentTagsApi(defaultClient);
        Integer segmentId = 56; // Integer | セグメントID
        Integer id = 56; // Integer | セグメントタグID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroySegmentsTag(segmentId, id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentTagsApi#destroySegmentsTag");
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
 **segmentId** | **Integer**| セグメントID |
 **id** | **Integer**| セグメントタグID |
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


## getSegmentTags

> SegmentTagsIndexResponse getSegmentTags(segmentId, companyId, offset, limit)

セグメントタグ一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグ一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SegmentTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SegmentTagsApi apiInstance = new SegmentTagsApi(defaultClient);
        Integer segmentId = 56; // Integer | セグメントID
        Integer companyId = 56; // Integer | 事業所ID
        Integer offset = 56; // Integer | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最大: 500) 
        try {
            SegmentTagsIndexResponse result = apiInstance.getSegmentTags(segmentId, companyId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentTagsApi#getSegmentTags");
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
 **segmentId** | **Integer**| セグメントID |
 **companyId** | **Integer**| 事業所ID |
 **offset** | **Integer**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最大: 500)  | [optional]

### Return type

[**SegmentTagsIndexResponse**](SegmentTagsIndexResponse.md)

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


## updateSegmentTag

> SegmentTagsResponse updateSegmentTag(segmentId, id, parameters)

セグメントタグの更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のセグメントタグを更新する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt;  &lt;ul&gt;  &lt;li&gt;本APIは法人向けのプロフェッショナルプラン以上で利用可能です。利用可能なセグメントの数は、法人向けのプロフェッショナルプランの場合は1つ、エンタープライズプランの場合は3つです。&lt;/li&gt;  &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.SegmentTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        SegmentTagsApi apiInstance = new SegmentTagsApi(defaultClient);
        Integer segmentId = 56; // Integer | セグメントID
        Integer id = 56; // Integer | セグメントタグID
        SegmentTagParams parameters = new SegmentTagParams(); // SegmentTagParams | セグメントタグの作成
        try {
            SegmentTagsResponse result = apiInstance.updateSegmentTag(segmentId, id, parameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentTagsApi#updateSegmentTag");
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
 **segmentId** | **Integer**| セグメントID |
 **id** | **Integer**| セグメントタグID |
 **parameters** | [**SegmentTagParams**](SegmentTagParams.md)| セグメントタグの作成 |

### Return type

[**SegmentTagsResponse**](SegmentTagsResponse.md)

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

