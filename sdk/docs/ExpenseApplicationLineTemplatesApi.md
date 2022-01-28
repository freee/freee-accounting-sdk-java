# ExpenseApplicationLineTemplatesApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExpenseApplicationLineTemplate**](ExpenseApplicationLineTemplatesApi.md#createExpenseApplicationLineTemplate) | **POST** api/1/expense_application_line_templates | 経費科目の作成
[**destroyExpenseApplicationLineTemplate**](ExpenseApplicationLineTemplatesApi.md#destroyExpenseApplicationLineTemplate) | **DELETE** api/1/expense_application_line_templates/{id} | 経費科目の削除
[**getExpenseApplicationLineTemplate**](ExpenseApplicationLineTemplatesApi.md#getExpenseApplicationLineTemplate) | **GET** api/1/expense_application_line_templates/{id} | 経費科目の取得
[**getExpenseApplicationLineTemplates**](ExpenseApplicationLineTemplatesApi.md#getExpenseApplicationLineTemplates) | **GET** api/1/expense_application_line_templates | 経費科目一覧の取得
[**updateExpenseApplicationLineTemplate**](ExpenseApplicationLineTemplatesApi.md#updateExpenseApplicationLineTemplate) | **PUT** api/1/expense_application_line_templates/{id} | 経費科目の更新



## createExpenseApplicationLineTemplate

> ExpenseApplicationLineTemplateResponse createExpenseApplicationLineTemplate(expenseApplicationLineTemplateParams)

経費科目の作成

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationLineTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationLineTemplatesApi apiInstance = new ExpenseApplicationLineTemplatesApi(defaultClient);
        ExpenseApplicationLineTemplateParams expenseApplicationLineTemplateParams = new ExpenseApplicationLineTemplateParams(); // ExpenseApplicationLineTemplateParams | 経費科目の作成
        try {
            ExpenseApplicationLineTemplateResponse result = apiInstance.createExpenseApplicationLineTemplate(expenseApplicationLineTemplateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationLineTemplatesApi#createExpenseApplicationLineTemplate");
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
 **expenseApplicationLineTemplateParams** | [**ExpenseApplicationLineTemplateParams**](ExpenseApplicationLineTemplateParams.md)| 経費科目の作成 |

### Return type

[**ExpenseApplicationLineTemplateResponse**](ExpenseApplicationLineTemplateResponse.md)

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


## destroyExpenseApplicationLineTemplate

> destroyExpenseApplicationLineTemplate(id, companyId)

経費科目の削除

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationLineTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationLineTemplatesApi apiInstance = new ExpenseApplicationLineTemplatesApi(defaultClient);
        Integer id = 56; // Integer | 経費科目ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyExpenseApplicationLineTemplate(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationLineTemplatesApi#destroyExpenseApplicationLineTemplate");
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
 **id** | **Integer**| 経費科目ID |
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


## getExpenseApplicationLineTemplate

> ExpenseApplicationLineTemplateResponse getExpenseApplicationLineTemplate(id, companyId)

経費科目の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationLineTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationLineTemplatesApi apiInstance = new ExpenseApplicationLineTemplatesApi(defaultClient);
        Integer id = 56; // Integer | 経費科目ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ExpenseApplicationLineTemplateResponse result = apiInstance.getExpenseApplicationLineTemplate(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationLineTemplatesApi#getExpenseApplicationLineTemplate");
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
 **id** | **Integer**| 経費科目ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**ExpenseApplicationLineTemplateResponse**](ExpenseApplicationLineTemplateResponse.md)

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


## getExpenseApplicationLineTemplates

> InlineResponse2002 getExpenseApplicationLineTemplates(companyId, offset, limit)

経費科目一覧の取得

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationLineTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationLineTemplatesApi apiInstance = new ExpenseApplicationLineTemplatesApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        Long offset = 56L; // Long | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 100)
        try {
            InlineResponse2002 result = apiInstance.getExpenseApplicationLineTemplates(companyId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationLineTemplatesApi#getExpenseApplicationLineTemplates");
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
 **offset** | **Long**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 20, 最小: 1, 最大: 100) | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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


## updateExpenseApplicationLineTemplate

> ExpenseApplicationLineTemplateResponse updateExpenseApplicationLineTemplate(id, expenseApplicationLineTemplateParams)

経費科目の更新

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ExpenseApplicationLineTemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ExpenseApplicationLineTemplatesApi apiInstance = new ExpenseApplicationLineTemplatesApi(defaultClient);
        Integer id = 56; // Integer | 経費科目ID
        ExpenseApplicationLineTemplateParams expenseApplicationLineTemplateParams = new ExpenseApplicationLineTemplateParams(); // ExpenseApplicationLineTemplateParams | 経費科目の更新
        try {
            ExpenseApplicationLineTemplateResponse result = apiInstance.updateExpenseApplicationLineTemplate(id, expenseApplicationLineTemplateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExpenseApplicationLineTemplatesApi#updateExpenseApplicationLineTemplate");
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
 **id** | **Integer**| 経費科目ID |
 **expenseApplicationLineTemplateParams** | [**ExpenseApplicationLineTemplateParams**](ExpenseApplicationLineTemplateParams.md)| 経費科目の更新 |

### Return type

[**ExpenseApplicationLineTemplateResponse**](ExpenseApplicationLineTemplateResponse.md)

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

