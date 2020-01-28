# BanksApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBank**](BanksApi.md#getBank) | **GET** api/1/banks/{id} | 連携サービスの取得
[**getBanks**](BanksApi.md#getBanks) | **GET** api/1/banks | 連携サービス一覧の取得



## getBank

> BanksShowResponse getBank(id)

連携サービスの取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;連携しているサービスを取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.BanksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BanksApi apiInstance = new BanksApi(defaultClient);
        Integer id = 56; // Integer | 連携サービスID
        try {
            BanksShowResponse result = apiInstance.getBank(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BanksApi#getBank");
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
 **id** | **Integer**| 連携サービスID |

### Return type

[**BanksShowResponse**](BanksShowResponse.md)

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


## getBanks

> BanksIndexResponse getBanks(offset, limit, type)

連携サービス一覧の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;連携しているサービス一覧を取得する&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;定義&lt;/h2&gt;  &lt;ul&gt; &lt;li&gt;type &lt;ul&gt; &lt;li&gt;bank_account : 銀行口座&lt;/li&gt;  &lt;li&gt;credit_card : クレジットカード&lt;/li&gt;  &lt;li&gt;wallet : その他の決済口座&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.BanksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BanksApi apiInstance = new BanksApi(defaultClient);
        Integer offset = 56; // Integer | 開始位置
        Integer limit = 56; // Integer | 取得上限数,最大500件
        String type = "type_example"; // String | サービス種別
        try {
            BanksIndexResponse result = apiInstance.getBanks(offset, limit, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BanksApi#getBanks");
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
 **offset** | **Integer**| 開始位置 | [optional]
 **limit** | **Integer**| 取得上限数,最大500件 | [optional]
 **type** | **String**| サービス種別 | [optional] [enum: bank_account, credit_card, wallet]

### Return type

[**BanksIndexResponse**](BanksIndexResponse.md)

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

