# ApprovalRequestsApi

All URIs are relative to *https://api.freee.co.jp*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApprovalRequest**](ApprovalRequestsApi.md#createApprovalRequest) | **POST** api/1/approval_requests | 各種申請の作成
[**destroyApprovalRequest**](ApprovalRequestsApi.md#destroyApprovalRequest) | **DELETE** api/1/approval_requests/{id} | 各種申請の削除
[**getApprovalRequest**](ApprovalRequestsApi.md#getApprovalRequest) | **GET** api/1/approval_requests/{id} | 各種申請の取得
[**getApprovalRequestForm**](ApprovalRequestsApi.md#getApprovalRequestForm) | **GET** api/1/approval_requests/forms/{id} | 各種申請の申請フォームの取得
[**getApprovalRequestForms**](ApprovalRequestsApi.md#getApprovalRequestForms) | **GET** api/1/approval_requests/forms | 各種申請の申請フォーム一覧の取得
[**getApprovalRequests**](ApprovalRequestsApi.md#getApprovalRequests) | **GET** api/1/approval_requests | 各種申請の一覧
[**updateApprovalRequest**](ApprovalRequestsApi.md#updateApprovalRequest) | **PUT** api/1/approval_requests/{id} | 各種申請の更新
[**updateApprovalRequestAction**](ApprovalRequestsApi.md#updateApprovalRequestAction) | **POST** api/1/approval_requests/{id}/actions | 各種申請の承認操作



## createApprovalRequest

> ApprovalRequestResponse createApprovalRequest(approvalRequestCreateParams)

各種申請の作成

 &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請を作成する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、各種申請を作成することができます。&lt;/li&gt;   &lt;li&gt;     申請項目(request_items)については、申請フォームで設定された項目のIDとそれに対応する値を入力してください。     &lt;ul&gt;       &lt;li&gt;タイトル(title)：文字列(改行なし) 例)予算申請&lt;/li&gt;       &lt;li&gt;1行コメント(single_line)：文字列(改行なし) 例)予算に関する申請&lt;/li&gt;       &lt;li&gt;複数行コメント(multi_line)：文字列(改行あり)       &lt;br&gt;       &amp;nbsp;&amp;nbsp;例)&lt;br&gt;       &amp;nbsp;&amp;nbsp;予算に関する申請&lt;br&gt;       &amp;nbsp;&amp;nbsp;申請日 2020-01-01&lt;br&gt;       &lt;/li&gt;       &lt;li&gt;プルダウン(select)： プルダウンの選択肢の名前(改行なし) 例)開発部&lt;/li&gt;       &lt;li&gt;日付(date)： 日付形式 例)2020-01-01&lt;/li&gt;       &lt;li&gt;金額(amount)： 数値(申請フォームで設定した上限・下限金額内の値, 改行なし) 例)10000&lt;/li&gt;       &lt;li&gt;添付ファイル(receipt)： ファイルボックスAPIのID 例)1&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;     申請ステータス(下書き、申請中)の指定と変更、及び承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）は以下を参考にして行ってください。     &lt;ul&gt;       &lt;li&gt;         承認操作は申請ステータスが申請中、承認済み、却下のものだけが対象です。         &lt;ul&gt;           &lt;li&gt;             初回申請の場合             &lt;ul&gt;&lt;li&gt;申請の作成（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             作成済みの申請の申請ステータス変更・更新する場合             &lt;ul&gt;&lt;li&gt;申請の更新（PUT）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             申請中、承認済み、却下の申請の承認操作を行う場合             &lt;ul&gt;&lt;li&gt;承認操作の実行（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;申請の削除（DELETE）が可能なのは申請ステータスが下書き、差戻しの場合のみです&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請は本API経由で作成ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;Web画面やAPIを通じて申請フォームが変更されると、本APIで使用する項目ID（request_itemsで指定するid）も変更されます。本API利用前に各種申請の取得APIを利用し、最新の申請フォームを取得することを推奨します。&lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        ApprovalRequestCreateParams approvalRequestCreateParams = new ApprovalRequestCreateParams(); // ApprovalRequestCreateParams | 各種申請の作成
        try {
            ApprovalRequestResponse result = apiInstance.createApprovalRequest(approvalRequestCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#createApprovalRequest");
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
 **approvalRequestCreateParams** | [**ApprovalRequestCreateParams**](ApprovalRequestCreateParams.md)| 各種申請の作成 | [optional]

### Return type

[**ApprovalRequestResponse**](ApprovalRequestResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |


## destroyApprovalRequest

> destroyApprovalRequest(id, companyId)

各種申請の削除

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請を削除する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;     申請ステータス(下書き、申請中)の指定と変更、及び承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）は以下を参考にして行ってください。     &lt;ul&gt;       &lt;li&gt;         承認操作は申請ステータスが申請中、承認済み、却下のものだけが対象です。         &lt;ul&gt;           &lt;li&gt;             初回申請の場合             &lt;ul&gt;&lt;li&gt;申請の作成（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             作成済みの申請の申請ステータス変更・更新する場合             &lt;ul&gt;&lt;li&gt;申請の更新（PUT）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             申請中、承認済み、却下の申請の承認操作を行う場合             &lt;ul&gt;&lt;li&gt;承認操作の実行（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;申請の削除（DELETE）が可能なのは申請ステータスが下書き、差戻しの場合のみです&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 各種申請ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            apiInstance.destroyApprovalRequest(id, companyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#destroyApprovalRequest");
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
 **id** | **Integer**| 各種申請ID |
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


## getApprovalRequest

> ApprovalRequestResponse getApprovalRequest(id, companyId)

各種申請の取得

 &lt;h2 id&#x3D;\&quot;\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請と申請経路はAPI経由で参照は可能ですが、作成と更新、承認ステータスの変更ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 各種申請ID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ApprovalRequestResponse result = apiInstance.getApprovalRequest(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#getApprovalRequest");
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
 **id** | **Integer**| 各種申請ID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**ApprovalRequestResponse**](ApprovalRequestResponse.md)

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


## getApprovalRequestForm

> ApprovalRequestFormResponse getApprovalRequestForm(id, companyId)

各種申請の申請フォームの取得

 &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請の申請フォームを取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 申請フォームID
        Integer companyId = 56; // Integer | 事業所ID
        try {
            ApprovalRequestFormResponse result = apiInstance.getApprovalRequestForm(id, companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#getApprovalRequestForm");
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
 **id** | **Integer**| 申請フォームID |
 **companyId** | **Integer**| 事業所ID |

### Return type

[**ApprovalRequestFormResponse**](ApprovalRequestFormResponse.md)

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


## getApprovalRequestForms

> InlineResponse200 getApprovalRequestForms(companyId)

各種申請の申請フォーム一覧の取得

 &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請の申請フォーム一覧を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        try {
            InlineResponse200 result = apiInstance.getApprovalRequestForms(companyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#getApprovalRequestForms");
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

[**InlineResponse200**](InlineResponse200.md)

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


## getApprovalRequests

> ApprovalRequestsIndexResponse getApprovalRequests(companyId, status, applicationNumber, title, formId, startApplicationDate, endApplicationDate, applicantId, approverId, offset, limit)

各種申請の一覧

 &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請一覧を取得する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、各種申請の一覧を取得することができます。&lt;/li&gt;   &lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請と申請経路はAPI経由で参照は可能ですが、作成と更新、承認ステータスの変更ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer companyId = 56; // Integer | 事業所ID
        String status = "draft"; // String | 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)
        Integer applicationNumber = 2; // Integer | 申請No.
        String title = "大阪出張"; // String | 申請タイトル
        Integer formId = 56; // Integer | 申請フォームID
        String startApplicationDate = "startApplicationDate_example"; // String | 申請日で絞込：開始日(yyyy-mm-dd)
        String endApplicationDate = "endApplicationDate_example"; // String | 申請日で絞込：終了日(yyyy-mm-dd)
        Integer applicantId = 56; // Integer | 申請者のユーザーID
        Integer approverId = 1; // Integer | 承認者のユーザーID
        Integer offset = 56; // Integer | 取得レコードのオフセット (デフォルト: 0)
        Integer limit = 56; // Integer | 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500)
        try {
            ApprovalRequestsIndexResponse result = apiInstance.getApprovalRequests(companyId, status, applicationNumber, title, formId, startApplicationDate, endApplicationDate, applicantId, approverId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#getApprovalRequests");
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
 **status** | **String**| 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し) | [optional] [enum: draft, in_progress, approved, rejected, feedback]
 **applicationNumber** | **Integer**| 申請No. | [optional]
 **title** | **String**| 申請タイトル | [optional]
 **formId** | **Integer**| 申請フォームID | [optional]
 **startApplicationDate** | **String**| 申請日で絞込：開始日(yyyy-mm-dd) | [optional]
 **endApplicationDate** | **String**| 申請日で絞込：終了日(yyyy-mm-dd) | [optional]
 **applicantId** | **Integer**| 申請者のユーザーID | [optional]
 **approverId** | **Integer**| 承認者のユーザーID | [optional]
 **offset** | **Integer**| 取得レコードのオフセット (デフォルト: 0) | [optional]
 **limit** | **Integer**| 取得レコードの件数 (デフォルト: 50, 最小: 1, 最大: 500) | [optional]

### Return type

[**ApprovalRequestsIndexResponse**](ApprovalRequestsIndexResponse.md)

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


## updateApprovalRequest

> ApprovalRequestResponse updateApprovalRequest(id, approvalRequestUpdateParams)

各種申請の更新

 &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請を更新する&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、各種申請を更新することができます。&lt;/li&gt;   &lt;li&gt;     申請項目(request_items)については、各種申請の取得APIで取得したrequest_items.idとそれに対応する値を入力してください。     &lt;ul&gt;       &lt;li&gt;タイトル(title)：文字列(改行なし) 例)予算申請&lt;/li&gt;       &lt;li&gt;1行コメント(single_line)：文字列(改行なし) 例)予算に関する申請&lt;/li&gt;       &lt;li&gt;複数行コメント(multi_line)：文字列(改行あり)       &lt;br&gt;       &amp;nbsp;&amp;nbsp;例)&lt;br&gt;       &amp;nbsp;&amp;nbsp;予算に関する申請&lt;br&gt;       &amp;nbsp;&amp;nbsp;申請日 2020-01-01&lt;br&gt;       &lt;/li&gt;       &lt;li&gt;プルダウン(select)： プルダウンの選択肢の名前(改行なし) 例)開発部&lt;/li&gt;       &lt;li&gt;日付(date)： 日付形式 例)2020-01-01&lt;/li&gt;       &lt;li&gt;金額(amount)： 数値(申請フォームで設定した上限・下限金額内の値, 改行なし) 例)10000&lt;/li&gt;       &lt;li&gt;添付ファイル(receipt)： ファイルボックスAPIのID 例)1&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIでは、status(申請ステータス): draft:下書き, feedback:差戻しのみ更新可能です。&lt;/li&gt;   &lt;li&gt;     申請ステータス(下書き、申請中)の指定と変更、及び承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）は以下を参考にして行ってください。     &lt;ul&gt;       &lt;li&gt;         承認操作は申請ステータスが申請中、承認済み、却下のものだけが対象です。         &lt;ul&gt;           &lt;li&gt;             初回申請の場合             &lt;ul&gt;&lt;li&gt;申請の作成（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             作成済みの申請の申請ステータス変更・更新する場合             &lt;ul&gt;&lt;li&gt;申請の更新（PUT）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             申請中、承認済み、却下の申請の承認操作を行う場合             &lt;ul&gt;&lt;li&gt;承認操作の実行（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;申請の削除（DELETE）が可能なのは申請ステータスが下書き、差戻しの場合のみです&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請は本API経由で更新ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;Web画面やAPIを通じて申請フォームが変更されると、本APIで使用する項目ID（request_itemsで指定するid）も変更されます。本APIで使用する項目IDは申請作成時点の項目IDです。本API利用前に各種申請の取得APIを利用し、申請作成時点の項目IDを取得することを推奨します。&lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 各種申請ID
        ApprovalRequestUpdateParams approvalRequestUpdateParams = new ApprovalRequestUpdateParams(); // ApprovalRequestUpdateParams | 各種申請の更新
        try {
            ApprovalRequestResponse result = apiInstance.updateApprovalRequest(id, approvalRequestUpdateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#updateApprovalRequest");
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
 **id** | **Integer**| 各種申請ID |
 **approvalRequestUpdateParams** | [**ApprovalRequestUpdateParams**](ApprovalRequestUpdateParams.md)| 各種申請の更新 |

### Return type

[**ApprovalRequestResponse**](ApprovalRequestResponse.md)

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


## updateApprovalRequestAction

> ApprovalRequestResponse updateApprovalRequestAction(id, approvalRequestActionCreateParams)

各種申請の承認操作

 &lt;h2 id&#x3D;\&quot;_1\&quot;&gt;概要&lt;/h2&gt;  &lt;p&gt;指定した事業所の各種申請の承認操作を行う&lt;/p&gt;  &lt;p&gt;各種申請APIの使い方については、&lt;a href&#x3D;\&quot;https://developer.freee.co.jp/tips/accounting-approval-requests\&quot; target&#x3D;\&quot;_blank\&quot;&gt;会計freeeの各種申請APIの使い方&lt;/a&gt;をご参照ください&lt;/p&gt;  &lt;h2 id&#x3D;\&quot;_2\&quot;&gt;注意点&lt;/h2&gt; &lt;ul&gt;   &lt;li&gt;本APIでは、各種申請の承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）を行うことができます。&lt;/li&gt;   &lt;li&gt;     申請ステータス(下書き、申請中)の指定と変更、及び承認操作（承認する、却下する、申請者へ差し戻す、代理承認する、承認済み・却下済みを取り消す）は以下を参考にして行ってください。     &lt;ul&gt;       &lt;li&gt;         承認操作は申請ステータスが申請中、承認済み、却下のものだけが対象です。         &lt;ul&gt;           &lt;li&gt;             初回申請の場合             &lt;ul&gt;&lt;li&gt;申請の作成（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             作成済みの申請の申請ステータス変更・更新する場合             &lt;ul&gt;&lt;li&gt;申請の更新（PUT）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;           &lt;li&gt;             申請中、承認済み、却下の申請の承認操作を行う場合             &lt;ul&gt;&lt;li&gt;承認操作の実行（POST）&lt;/li&gt;&lt;/ul&gt;           &lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;申請の削除（DELETE）が可能なのは申請ステータスが下書き、差戻しの場合のみです&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt; 　&lt;li&gt;     申請経路、承認者の指定として部門役職データ連携を活用し、以下のいずれかを利用している各種申請はAPI経由で承認ステータスの変更ができません。     &lt;ul&gt;       &lt;li&gt;役職指定（申請者の所属部門）&lt;/li&gt;       &lt;li&gt;役職指定（申請時に部門指定）&lt;/li&gt;       &lt;li&gt;部門および役職指定&lt;/li&gt;     &lt;/ul&gt;   &lt;/li&gt;   &lt;li&gt;本APIはエンタープライズプランをご利用の事業所のみ利用可能です。&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.ApiException;
import jp.co.freee.accounting.Configuration;
import jp.co.freee.accounting.auth.*;
import jp.co.freee.accounting.models.*;
import jp.co.freee.accounting.api.ApprovalRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.freee.co.jp");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ApprovalRequestsApi apiInstance = new ApprovalRequestsApi(defaultClient);
        Integer id = 56; // Integer | 各種申請ID
        ApprovalRequestActionCreateParams approvalRequestActionCreateParams = new ApprovalRequestActionCreateParams(); // ApprovalRequestActionCreateParams | 各種申請の承認操作
        try {
            ApprovalRequestResponse result = apiInstance.updateApprovalRequestAction(id, approvalRequestActionCreateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApprovalRequestsApi#updateApprovalRequestAction");
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
 **id** | **Integer**| 各種申請ID |
 **approvalRequestActionCreateParams** | [**ApprovalRequestActionCreateParams**](ApprovalRequestActionCreateParams.md)| 各種申請の承認操作 |

### Return type

[**ApprovalRequestResponse**](ApprovalRequestResponse.md)

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
| **404** |  |  -  |
| **500** |  |  -  |

