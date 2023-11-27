# LandkreisPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLandkreisschluesselPublic**](LandkreisPublicControllerApi.md#getLandkreisschluesselPublic) | **GET** /public/stammdaten/landkreis |  |


<a id="getLandkreisschluesselPublic"></a>
# **getLandkreisschluesselPublic**
> List&lt;LandkreisschluesselShortDto&gt; getLandkreisschluesselPublic()



Returns all Landkreisschluessel

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.LandkreisPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    LandkreisPublicControllerApi apiInstance = new LandkreisPublicControllerApi(defaultClient);
    try {
      List<LandkreisschluesselShortDto> result = apiInstance.getLandkreisschluesselPublic();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LandkreisPublicControllerApi#getLandkreisschluesselPublic");
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

[**List&lt;LandkreisschluesselShortDto&gt;**](LandkreisschluesselShortDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | bad request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |
| **200** | returned all landkreisschluessel |  -  |

