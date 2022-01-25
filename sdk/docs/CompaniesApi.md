# CompaniesApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanies**](CompaniesApi.md#getCompanies) | **GET** api/1/companies | 事業所一覧の取得
[**getCompany**](CompaniesApi.md#getCompany) | **GET** api/1/companies/{id} | 事業所の詳細情報の取得



## getCompanies

> CompanyIndexResponse getCompanies()

事業所一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        try {
            CompanyIndexResponse result = apiInstance.getCompanies();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#getCompanies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**CompanyIndexResponse**](CompanyIndexResponse.md)

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


## getCompany

> CompanyResponse getCompany(id, details, accountItems, taxes, items, partners, sections, tags, walletables)

事業所の詳細情報の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        Integer id = 56; // Integer | 事業所ID
        Boolean details = true; // Boolean | 取得情報に勘定科目・税区分コード・税区分・品目・取引先・部門・メモタグ・口座の一覧を含める
        Boolean accountItems = true; // Boolean | 取得情報に勘定科目一覧を含める
        Boolean taxes = true; // Boolean | 取得情報に税区分コード・税区分一覧を含める
        Boolean items = true; // Boolean | 取得情報に品目一覧を含める
        Boolean partners = true; // Boolean | 取得情報に取引先一覧を含める
        Boolean sections = true; // Boolean | 取得情報に部門一覧を含める
        Boolean tags = true; // Boolean | 取得情報にメモタグ一覧を含める
        Boolean walletables = true; // Boolean | 取得情報に口座一覧を含める
        try {
            CompanyResponse result = apiInstance.getCompany(id, details, accountItems, taxes, items, partners, sections, tags, walletables);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#getCompany");
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
 **id** | **Integer**| 事業所ID |
 **details** | **Boolean**| 取得情報に勘定科目・税区分コード・税区分・品目・取引先・部門・メモタグ・口座の一覧を含める | [optional] [enum: true]
 **accountItems** | **Boolean**| 取得情報に勘定科目一覧を含める | [optional] [enum: true]
 **taxes** | **Boolean**| 取得情報に税区分コード・税区分一覧を含める | [optional] [enum: true]
 **items** | **Boolean**| 取得情報に品目一覧を含める | [optional] [enum: true]
 **partners** | **Boolean**| 取得情報に取引先一覧を含める | [optional] [enum: true]
 **sections** | **Boolean**| 取得情報に部門一覧を含める | [optional] [enum: true]
 **tags** | **Boolean**| 取得情報にメモタグ一覧を含める | [optional] [enum: true]
 **walletables** | **Boolean**| 取得情報に口座一覧を含める | [optional] [enum: true]

### Return type

[**CompanyResponse**](CompanyResponse.md)

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

