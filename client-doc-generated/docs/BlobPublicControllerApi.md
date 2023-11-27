# BlobPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](BlobPublicControllerApi.md#get) | **GET** /public/blob |  |


<a id="get"></a>
# **get**
> StorageDownloadUrl get(filename)



Will return a signed URL for the given blob

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.BlobPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    BlobPublicControllerApi apiInstance = new BlobPublicControllerApi(defaultClient);
    String filename = "filename_example"; // String | 
    try {
      StorageDownloadUrl result = apiInstance.get(filename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlobPublicControllerApi#get");
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

[**StorageDownloadUrl**](StorageDownloadUrl.md)

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

