# MeldebereichPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPublicMeldebereichById**](MeldebereichPublicControllerApi.md#getPublicMeldebereichById) | **GET** /public/stammdaten/meldebereich/{meldebereichId} |  |


<a id="getPublicMeldebereichById"></a>
# **getPublicMeldebereichById**
> MeldebereichPublicInfoDto getPublicMeldebereichById(meldebereichId)



Will return the Meldebereich with the given ID

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    MeldebereichPublicControllerApi apiInstance = new MeldebereichPublicControllerApi(defaultClient);
    String meldebereichId = "meldebereichId_example"; // String | 
    try {
      MeldebereichPublicInfoDto result = apiInstance.getPublicMeldebereichById(meldebereichId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichPublicControllerApi#getPublicMeldebereichById");
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
| **meldebereichId** | **String**|  | |

### Return type

[**MeldebereichPublicInfoDto**](MeldebereichPublicInfoDto.md)

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
| **200** | success |  -  |
| **404** | not found |  -  |

