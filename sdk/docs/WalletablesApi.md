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

> WalletablesCreateResponse createWalletable(parameters)

口座の作成

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所に口座を作成する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;&lt;li&gt;同期に対応した口座はこのAPIでは作成できません&lt;/li&gt;&lt;/ul&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt; &lt;p&gt;type&lt;/p&gt;  &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;name : 口座名&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;bank_id : サービスID&lt;/p&gt; &lt;/li&gt;  &lt;li&gt; &lt;p&gt;group_name : 決算書表示名（小カテゴリー）　例：売掛金, 受取手形, 未収入金（法人のみ）, 買掛金, 支払手形, 未払金, 預り金, 前受金&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;

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
        WalletableCreateParams parameters = new WalletableCreateParams(); // WalletableCreateParams | 口座の作成
        try {
            WalletablesCreateResponse result = apiInstance.createWalletable(parameters);
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
 **parameters** | [**WalletableCreateParams**](WalletableCreateParams.md)| 口座の作成 | [optional]

### Return type

[**WalletablesCreateResponse**](WalletablesCreateResponse.md)

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


## destroyWalletable

> destroyWalletable(id, type, companyId)

口座の削除

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の口座を削除する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;削除を実行するには、当該口座に関連する仕訳データを事前に削除する必要があります。&lt;/li&gt; &lt;li&gt;当該口座に仕訳が残っていないか確認するには、レポートの「仕訳帳」等を参照し、必要に応じて、「取引」や「口座振替」も削除します。&lt;/li&gt;  &lt;/ul&gt;

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
        String type = "type_example"; // String | 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）
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
| **404** |  |  -  |
| **500** |  |  -  |


## getWalletable

> WalletablesResponse getWalletable(id, type, companyId)

口座情報の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の口座情報を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt;walletable_balance : 登録残高&lt;/li&gt;  &lt;li&gt;last_balance : 同期残高&lt;/li&gt; &lt;/ul&gt;

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
        String type = "type_example"; // String | 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）
        Integer companyId = 56; // Integer | 事業所ID
        try {
            WalletablesResponse result = apiInstance.getWalletable(id, type, companyId);
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

[**WalletablesResponse**](WalletablesResponse.md)

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


## getWalletables

> WalletablesIndexResponse getWalletables(companyId, withBalance)

口座一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の口座一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt;  &lt;li&gt;walletable_balance : 登録残高&lt;/li&gt;  &lt;li&gt;last_balance : 同期残高&lt;/li&gt; &lt;/ul&gt;

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
        try {
            WalletablesIndexResponse result = apiInstance.getWalletables(companyId, withBalance);
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

### Return type

[**WalletablesIndexResponse**](WalletablesIndexResponse.md)

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


## updateWalletable

> WalletablesResponse updateWalletable(id, type, companyId, parameters)

口座の更新

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;口座を更新する&lt;/p&gt;

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
        String type = "type_example"; // String | 口座種別（bank_account : 銀行口座, credit_card : クレジットカード, wallet : その他の決済口座）
        Integer companyId = 56; // Integer | 事業所ID
        WalletableUpdateParams parameters = new WalletableUpdateParams(); // WalletableUpdateParams | 口座の作成
        try {
            WalletablesResponse result = apiInstance.updateWalletable(id, type, companyId, parameters);
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
 **companyId** | **Integer**| 事業所ID |
 **parameters** | [**WalletableUpdateParams**](WalletableUpdateParams.md)| 口座の作成 | [optional]

### Return type

[**WalletablesResponse**](WalletablesResponse.md)

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

