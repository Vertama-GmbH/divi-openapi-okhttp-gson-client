# BlobPublicControllerWebApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUpdateTimeStamp**](BlobPublicControllerWebApi.md#getUpdateTimeStamp) | **GET** /public/blob/timestamp/web |  |
| [**getUpdateTimeStampOfRestrictedFile**](BlobPublicControllerWebApi.md#getUpdateTimeStampOfRestrictedFile) | **GET** /public/blob/timestamp/restricted |  |


<a id="getUpdateTimeStamp"></a>
# **getUpdateTimeStamp**
> OffsetDateTime getUpdateTimeStamp(filename)



returns the upate timestamp of the given public storage file

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.BlobPublicControllerWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    BlobPublicControllerWebApi apiInstance = new BlobPublicControllerWebApi(defaultClient);
    String filename = "filename_example"; // String | 
    try {
      OffsetDateTime result = apiInstance.getUpdateTimeStamp(filename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlobPublicControllerWebApi#getUpdateTimeStamp");
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
| **filename** | **String**|  | |

### Return type

[**OffsetDateTime**](OffsetDateTime.md)

### Authorization

[bearer](../README.md#bearer)

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

<a id="getUpdateTimeStampOfRestrictedFile"></a>
# **getUpdateTimeStampOfRestrictedFile**
> OffsetDateTime getUpdateTimeStampOfRestrictedFile(filename)



returns the upate timestamp of the given restricted storage file

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.BlobPublicControllerWebApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    BlobPublicControllerWebApi apiInstance = new BlobPublicControllerWebApi(defaultClient);
    String filename = "filename_example"; // String | 
    try {
      OffsetDateTime result = apiInstance.getUpdateTimeStampOfRestrictedFile(filename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlobPublicControllerWebApi#getUpdateTimeStampOfRestrictedFile");
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
| **filename** | **String**|  | |

### Return type

[**OffsetDateTime**](OffsetDateTime.md)

### Authorization

[bearer](../README.md#bearer)

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

