# SegmentTagsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSegmentTag**](SegmentTagsApi.md#createSegmentTag) | **POST** api/1/segments/{segment_id}/tags | セグメントの作成
[**destroySegmentsTag**](SegmentTagsApi.md#destroySegmentsTag) | **DELETE** api/1/segments/{segment_id}/tags/{id} | セグメントタグの削除
[**getSegmentTags**](SegmentTagsApi.md#getSegmentTags) | **GET** api/1/segments/{segment_id}/tags | セグメントタグ一覧の取得
[**updateSegmentTag**](SegmentTagsApi.md#updateSegmentTag) | **PUT** api/1/segments/{segment_id}/tags/{id} | セグメントタグの更新



## createSegmentTag

> SegmentTagResponse createSegmentTag(segmentId, segmentTagParams)

セグメントの作成

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
        Integer segmentId = 56; // Integer | セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン 
        SegmentTagParams segmentTagParams = new SegmentTagParams(); // SegmentTagParams | セグメントタグの作成
        try {
            SegmentTagResponse result = apiInstance.createSegmentTag(segmentId, segmentTagParams);
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
 **segmentId** | **Integer**| セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン  |
 **segmentTagParams** | [**SegmentTagParams**](SegmentTagParams.md)| セグメントタグの作成 |

### Return type

[**SegmentTagResponse**](SegmentTagResponse.md)

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


## destroySegmentsTag

> destroySegmentsTag(segmentId, id, companyId)

セグメントタグの削除

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
        Integer segmentId = 56; // Integer | セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン 
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
 **segmentId** | **Integer**| セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン  |
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
| **403** |  |  -  |
| **500** |  |  -  |


## getSegmentTags

> InlineResponse2007 getSegmentTags(segmentId, companyId, offset, limit)

セグメントタグ一覧の取得

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
        Integer segmentId = 56; // Integer | セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン 
        Integer companyId = 56; // Integer | 事業所ID
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 500) 
        try {
            InlineResponse2007 result = apiInstance.getSegmentTags(segmentId, companyId, offset, limit);
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
 **segmentId** | **Integer**| セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン  |
 **companyId** | **Integer**| 事業所ID |
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 500)  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

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


## updateSegmentTag

> SegmentTagResponse updateSegmentTag(segmentId, id, segmentTagParams)

セグメントタグの更新

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
        Integer segmentId = 56; // Integer | セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン 
        Integer id = 56; // Integer | セグメントタグID
        SegmentTagParams segmentTagParams = new SegmentTagParams(); // SegmentTagParams | セグメントタグの作成
        try {
            SegmentTagResponse result = apiInstance.updateSegmentTag(segmentId, id, segmentTagParams);
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
 **segmentId** | **Integer**| セグメントID（1,2,3のいずれか） 該当プラン以外で参照した場合にはエラーとなります。   1: 法人向けプロフェッショナル, 法人向けエンタープライズプラン   2,3: 法人向け エンタープライズプラン  |
 **id** | **Integer**| セグメントタグID |
 **segmentTagParams** | [**SegmentTagParams**](SegmentTagParams.md)| セグメントタグの作成 |

### Return type

[**SegmentTagResponse**](SegmentTagResponse.md)

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

