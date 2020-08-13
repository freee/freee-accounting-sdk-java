# WalletTxnsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWalletTxn**](WalletTxnsApi.md#createWalletTxn) | **POST** api/1/wallet_txns | 明細の作成
[**destroyWalletTxn**](WalletTxnsApi.md#destroyWalletTxn) | **DELETE** api/1/wallet_txns/{id} | 明細の削除
[**getWalletTxn**](WalletTxnsApi.md#getWalletTxn) | **GET** api/1/wallet_txns/{id} | 明細の取得
[**getWalletTxns**](WalletTxnsApi.md#getWalletTxns) | **GET** api/1/wallet_txns | 明細一覧の取得



## createWalletTxn

> WalletTxnResponse createWalletTxn(walletTxnParams)

明細の作成

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;amount : 明細金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 取引登録待ち金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;balance : 残高&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 入金&lt;/li&gt;  &lt;li&gt;expense : 出金&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.WalletTxnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletTxnsApi apiInstance = new WalletTxnsApi(defaultClient);
        WalletTxnParams walletTxnParams = new WalletTxnParams(); // WalletTxnParams | 明細の作成
        try {
            WalletTxnResponse result = apiInstance.createWalletTxn(walletTxnParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletTxnsApi#createWalletTxn");
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
 **walletTxnParams** | [**WalletTxnParams**](WalletTxnParams.md)| 明細の作成 | [optional]

### Return type

[**WalletTxnResponse**](WalletTxnResponse.md)

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


## destroyWalletTxn

> destroyWalletTxn(id, companyId)

明細の削除

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細を削除する&lt;/p&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.WalletTxnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletTxnsApi apiInstance = new WalletTxnsApi(defaultClient);
        Integer id = 56; // Integer | 明細ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyWalletTxn(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletTxnsApi#destroyWalletTxn");
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
 **id** | **Integer**| 明細ID |
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


## getWalletTxn

> WalletTxnResponse getWalletTxn(id, companyId)

明細の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;amount : 明細金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 取引登録待ち金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;balance : 残高&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 入金&lt;/li&gt;  &lt;li&gt;expense : 出金&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.WalletTxnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletTxnsApi apiInstance = new WalletTxnsApi(defaultClient);
        Integer id = 56; // Integer | 明細ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            WalletTxnResponse result = apiInstance.getWalletTxn(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletTxnsApi#getWalletTxn");
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
 **id** | **Integer**| 明細ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**WalletTxnResponse**](WalletTxnResponse.md)

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


## getWalletTxns

> InlineResponse20017 getWalletTxns(companyId, walletableType, walletableId, startDate, endDate, entrySide, offset, limit)

明細一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の明細一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;amount : 明細金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;due_amount : 取引登録待ち金額&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;balance : 残高&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;entry_side&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;income : 入金&lt;/li&gt;  &lt;li&gt;expense : 出金&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;walletable_type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.WalletTxnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WalletTxnsApi apiInstance = new WalletTxnsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String walletableType = "walletableType_example"; // String | 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) walletable_type、walletable_idは同時に指定が必要です。
        Integer walletableId = 56; // Integer | 口座ID walletable_type、walletable_idは同時に指定が必要です。
        String startDate = "startDate_example"; // String | 取引日で絞込：開始日 (yyyy-mm-dd)
        String endDate = "endDate_example"; // String | 取引日で絞込：終了日 (yyyy-mm-dd)
        String entrySide = "entrySide_example"; // String | 入金／出金 (入金: income, 出金: expense)
        Integer offset = 56; // Integer | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 100) 
        try {
            InlineResponse20017 result = apiInstance.getWalletTxns(companyId, walletableType, walletableId, startDate, endDate, entrySide, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletTxnsApi#getWalletTxns");
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
 **walletableType** | **String**| 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet) walletable_type、walletable_idは同時に指定が必要です。 | [optional] [enum: bank_account, credit_card, wallet]
 **walletableId** | **Integer**| 口座ID walletable_type、walletable_idは同時に指定が必要です。 | [optional]
 **startDate** | **String**| 取引日で絞込：開始日 (yyyy-mm-dd) | [optional]
 **endDate** | **String**| 取引日で絞込：終了日 (yyyy-mm-dd) | [optional]
 **entrySide** | **String**| 入金／出金 (入金: income, 出金: expense) | [optional] [enum: income, expense]
 **offset** | **Integer**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 100)  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

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

