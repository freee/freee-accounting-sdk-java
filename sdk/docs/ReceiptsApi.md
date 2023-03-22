# ReceiptsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReceipt**](ReceiptsApi.md#createReceipt) | **POST** api/1/receipts | ファイルボックス（証憑ファイル）のアップロード
[**destroyReceipt**](ReceiptsApi.md#destroyReceipt) | **DELETE** api/1/receipts/{id} | ファイルボックス（証憑ファイル）の削除
[**downloadReceipt**](ReceiptsApi.md#downloadReceipt) | **GET** api/1/receipts/{id}/download | ファイルボックス（証憑ファイル）のダウンロード
[**getReceipt**](ReceiptsApi.md#getReceipt) | **GET** api/1/receipts/{id} | ファイルボックス（証憑ファイル）の取得
[**getReceipts**](ReceiptsApi.md#getReceipts) | **GET** api/1/receipts | ファイルボックス（証憑ファイル）一覧の取得
[**updateReceipt**](ReceiptsApi.md#updateReceipt) | **PUT** api/1/receipts/{id} | ファイルボックス（証憑ファイル）の更新



## createReceipt

> ReceiptResponse createReceipt(companyId, receipt, description, documentType, issueDate, qualifiedInvoice, receiptMetadatumAmount, receiptMetadatumIssueDate, receiptMetadatumPartnerName)

ファイルボックス（証憑ファイル）のアップロード

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
        String documentType = "receipt"; // String | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 書類の種類（receipt: 領収書、invoice: 請求書、other: その他） 
        String issueDate = "issueDate_example"; // String | 取引日 (yyyy-mm-dd)
        String qualifiedInvoice = "qualified"; // String | この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない、unselected: 未選択） 
        Long receiptMetadatumAmount = 56L; // Long | 金額
        String receiptMetadatumIssueDate = "receiptMetadatumIssueDate_example"; // String | 発行日 (yyyy-mm-dd)
        String receiptMetadatumPartnerName = "receiptMetadatumPartnerName_example"; // String | 発行元
        try {
            ReceiptResponse result = apiInstance.createReceipt(companyId, receipt, description, documentType, issueDate, qualifiedInvoice, receiptMetadatumAmount, receiptMetadatumIssueDate, receiptMetadatumPartnerName);
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
 **documentType** | **String**| この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 書類の種類（receipt: 領収書、invoice: 請求書、other: その他）  | [optional] [enum: receipt, invoice, other]
 **issueDate** | **String**| 取引日 (yyyy-mm-dd) | [optional]
 **qualifiedInvoice** | **String**| この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない、unselected: 未選択）  | [optional] [enum: qualified, not_qualified, unselected]
 **receiptMetadatumAmount** | **Long**| 金額 | [optional]
 **receiptMetadatumIssueDate** | **String**| 発行日 (yyyy-mm-dd) | [optional]
 **receiptMetadatumPartnerName** | **String**| 発行元 | [optional]

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

ファイルボックス（証憑ファイル）の削除

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
        Integer id = 56; // Integer | ファイルボックス（証憑ファイル）ID
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
 **id** | **Integer**| ファイルボックス（証憑ファイル）ID |
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


## downloadReceipt

> File downloadReceipt(id, companyId)

ファイルボックス（証憑ファイル）のダウンロード

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
        Integer id = 56; // Integer | ファイルボックス（証憑ファイル）ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            File result = apiInstance.downloadReceipt(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceiptsApi#downloadReceipt");
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
 **id** | **Integer**| ファイルボックス（証憑ファイル）ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**File**](File.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, image/_*, text/csv, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |


## getReceipt

> ReceiptResponse getReceipt(id, companyId)

ファイルボックス（証憑ファイル）の取得

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
        Integer id = 56; // Integer | ファイルボックス（証憑ファイル）ID
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
 **id** | **Integer**| ファイルボックス（証憑ファイル）ID |
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

> InlineResponse2005 getReceipts(companyId, startDate, endDate, userName, number, commentType, commentImportant, category, offset, limit)

ファイルボックス（証憑ファイル）一覧の取得

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
        String commentType = "posted"; // String | posted:コメントあり, raised:未解決, resolved:解決済
        Boolean commentImportant = true; // Boolean | trueの時、重要コメント付きが対象
        String category = "all"; // String | all:すべて、without_deal:未登録、with_expense_application_line:経費申請中, with_deal:登録済み、ignored:無視
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000)
        try {
            InlineResponse2005 result = apiInstance.getReceipts(companyId, startDate, endDate, userName, number, commentType, commentImportant, category, offset, limit);
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
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 3000) | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

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

ファイルボックス（証憑ファイル）の更新

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
        Integer id = 56; // Integer | ファイルボックス（証憑ファイル）ID
        ReceiptUpdateParams receiptUpdateParams = new ReceiptUpdateParams(); // ReceiptUpdateParams | 
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
 **id** | **Integer**| ファイルボックス（証憑ファイル）ID |
 **receiptUpdateParams** | [**ReceiptUpdateParams**](ReceiptUpdateParams.md)|  |

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

