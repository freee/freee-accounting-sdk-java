# ReceiptsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReceipt**](ReceiptsApi.md#createReceipt) | **POST** api/1/receipts | ファイルボックス 証憑ファイルアップロード
[**destroyReceipt**](ReceiptsApi.md#destroyReceipt) | **DELETE** api/1/receipts/{id} | ファイルボックス 証憑ファイルを削除する
[**getReceipt**](ReceiptsApi.md#getReceipt) | **GET** api/1/receipts/{id} | ファイルボックス 証憑ファイルの取得
[**getReceipts**](ReceiptsApi.md#getReceipts) | **GET** api/1/receipts | ファイルボックス 証憑ファイル一覧の取得
[**updateReceipt**](ReceiptsApi.md#updateReceipt) | **PUT** api/1/receipts/{id} | ファイルボックス 証憑ファイル情報更新



## createReceipt

> ReceiptResponse createReceipt(companyId, receipt, description, issueDate)

ファイルボックス 証憑ファイルアップロード

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ファイルボックスに証憑ファイルをアップロードする&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;リクエストヘッダーの Content-Type は、multipart/form-dataにのみ対応しています。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ReceiptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        File receipt = new File("/path/to/file"); // File | 証憑ファイル
        String description = "description_example"; // String | メモ (255文字以内)
        String issueDate = "issueDate_example"; // String | 取引日 (yyyy-mm-dd)
        try {
            ReceiptResponse result = apiInstance.createReceipt(companyId, receipt, description, issueDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceiptsApi#createReceipt");
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
 **receipt** | **File**| 証憑ファイル |
 **description** | **String**| メモ (255文字以内) | [optional]
 **issueDate** | **String**| 取引日 (yyyy-mm-dd) | [optional]

### Return type

[**ReceiptResponse**](ReceiptResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |


## destroyReceipt

> destroyReceipt(id, companyId)

ファイルボックス 証憑ファイルを削除する

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ファイルボックスの証憑ファイルを削除する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ReceiptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
        Integer id = 56; // Integer | 証憑ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyReceipt(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceiptsApi#destroyReceipt");
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
 **id** | **Integer**| 証憑ID |
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


## getReceipt

> ReceiptResponse getReceipt(id, companyId)

ファイルボックス 証憑ファイルの取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のファイルボックス 証憑ファイルを取得する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ReceiptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
        Integer id = 56; // Integer | 証憑ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ReceiptResponse result = apiInstance.getReceipt(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceiptsApi#getReceipt");
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
 **id** | **Integer**| 証憑ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**ReceiptResponse**](ReceiptResponse.md)

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


## getReceipts

> InlineResponse2008 getReceipts(companyId, startDate, endDate, userName, number, commentType, commentImportant, category, offset, limit)

ファイルボックス 証憑ファイル一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所のファイルボックス 証憑ファイル一覧を取得する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ReceiptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String startDate = "startDate_example"; // String | アップロード日 (yyyy-mm-dd)
        String endDate = "endDate_example"; // String | アップロード日 (yyyy-mm-dd)
        String userName = "userName_example"; // String | アップロードしたユーザー名、メールアドレス
        Integer number = 56; // Integer | アップロードファイルNo
        String commentType = "commentType_example"; // String | posted:コメントあり, raised:未解決, resolved:解決済
        Boolean commentImportant = true; // Boolean | trueの時、重要コメント付きが対象
        String category = "category_example"; // String | all:すべて、without_deal:未登録、with_expense_application_line:経費申請中, with_deal:登録済み、ignored:無視
        Integer offset = 56; // Integer | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000)
        try {
            InlineResponse2008 result = apiInstance.getReceipts(companyId, startDate, endDate, userName, number, commentType, commentImportant, category, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceiptsApi#getReceipts");
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
 **startDate** | **String**| アップロード日 (yyyy-mm-dd) |
 **endDate** | **String**| アップロード日 (yyyy-mm-dd) |
 **userName** | **String**| アップロードしたユーザー名、メールアドレス | [optional]
 **number** | **Integer**| アップロードファイルNo | [optional]
 **commentType** | **String**| posted:コメントあり, raised:未解決, resolved:解決済 | [optional] [enum: posted, raised, resolved]
 **commentImportant** | **Boolean**| trueの時、重要コメント付きが対象 | [optional]
 **category** | **String**| all:すべて、without_deal:未登録、with_expense_application_line:経費申請中, with_deal:登録済み、ignored:無視 | [optional] [enum: all, without_deal, with_expense_application_line, with_deal, ignored]
 **offset** | **Integer**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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


## updateReceipt

> ReceiptResponse updateReceipt(id, receiptUpdateParams)

ファイルボックス 証憑ファイル情報更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;ファイルボックスの証憑ファイル情報を更新する&lt;/p&gt; &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、証憑ファイルの再アップロードはできません。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ReceiptsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ReceiptsApi apiInstance = new ReceiptsApi(defaultClient);
        Integer id = 56; // Integer | 証憑ID
        ReceiptUpdateParams receiptUpdateParams = new ReceiptUpdateParams(); // ReceiptUpdateParams | 経費申請の更新
        try {
            ReceiptResponse result = apiInstance.updateReceipt(id, receiptUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceiptsApi#updateReceipt");
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
 **id** | **Integer**| 証憑ID |
 **receiptUpdateParams** | [**ReceiptUpdateParams**](ReceiptUpdateParams.md)| 経費申請の更新 |

### Return type

[**ReceiptResponse**](ReceiptResponse.md)

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

