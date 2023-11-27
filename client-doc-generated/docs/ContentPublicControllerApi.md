# ContentPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllContentsPublic**](ContentPublicControllerApi.md#getAllContentsPublic) | **GET** /public/cms/{cmsContentType} |  |
| [**getContentPublicStartingWithId**](ContentPublicControllerApi.md#getContentPublicStartingWithId) | **GET** /public/cms/starting-with/{cmsContentType}/{contentId} |  |
| [**getOneContentPublic**](ContentPublicControllerApi.md#getOneContentPublic) | **GET** /public/cms/{cmsContentType}/{contentId} |  |


<a id="getAllContentsPublic"></a>
# **getAllContentsPublic**
> ContentContainerDto getAllContentsPublic(cmsContentType)



Will return all Contents for given ContentType

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.ContentPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    ContentPublicControllerApi apiInstance = new ContentPublicControllerApi(defaultClient);
    String cmsContentType = "PAGE_ELEMENT"; // String | 
    try {
      ContentContainerDto result = apiInstance.getAllContentsPublic(cmsContentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentPublicControllerApi#getAllContentsPublic");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmsContentType** | **String**|  | [enum: PAGE_ELEMENT, BLOG, FAQ, ANSPRECHPARTNER, EMAIL_TEMPLATE] |

### Return type

[**ContentContainerDto**](ContentContainerDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |
| **200** | success |  -  |

<a id="getContentPublicStartingWithId"></a>
# **getContentPublicStartingWithId**
> ContentContainerDto getContentPublicStartingWithId(cmsContentType, contentId)



Get specific Content starting with Id

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.ContentPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    ContentPublicControllerApi apiInstance = new ContentPublicControllerApi(defaultClient);
    String cmsContentType = "PAGE_ELEMENT"; // String | 
    String contentId = "contentId_example"; // String | 
    try {
      ContentContainerDto result = apiInstance.getContentPublicStartingWithId(cmsContentType, contentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentPublicControllerApi#getContentPublicStartingWithId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmsContentType** | **String**|  | [enum: PAGE_ELEMENT, BLOG, FAQ, ANSPRECHPARTNER, EMAIL_TEMPLATE] |
| **contentId** | **String**|  | |

### Return type

[**ContentContainerDto**](ContentContainerDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |
| **200** | success |  -  |
| **404** | not found |  -  |

<a id="getOneContentPublic"></a>
# **getOneContentPublic**
> ContentDto getOneContentPublic(cmsContentType, contentId)



Get specific Content

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.ContentPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    ContentPublicControllerApi apiInstance = new ContentPublicControllerApi(defaultClient);
    String cmsContentType = "PAGE_ELEMENT"; // String | 
    String contentId = "contentId_example"; // String | 
    try {
      ContentDto result = apiInstance.getOneContentPublic(cmsContentType, contentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContentPublicControllerApi#getOneContentPublic");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmsContentType** | **String**|  | [enum: PAGE_ELEMENT, BLOG, FAQ, ANSPRECHPARTNER, EMAIL_TEMPLATE] |
| **contentId** | **String**|  | |

### Return type

[**ContentDto**](ContentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |
| **200** | success |  -  |
| **404** | not found |  -  |

