# MeldebereichAntragPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMeldebereichAntrag**](MeldebereichAntragPublicControllerApi.md#createMeldebereichAntrag) | **POST** /public/stammdaten/meldebereichAntrag |  |


<a id="createMeldebereichAntrag"></a>
# **createMeldebereichAntrag**
> MeldebereichAntragDto createMeldebereichAntrag(meldebereichAntragDto)



Creates a new MeldebereichAntrag in the system.

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichAntragPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    MeldebereichAntragPublicControllerApi apiInstance = new MeldebereichAntragPublicControllerApi(defaultClient);
    MeldebereichAntragDto meldebereichAntragDto = new MeldebereichAntragDto(); // MeldebereichAntragDto | 
    try {
      MeldebereichAntragDto result = apiInstance.createMeldebereichAntrag(meldebereichAntragDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichAntragPublicControllerApi#createMeldebereichAntrag");
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
| **meldebereichAntragDto** | [**MeldebereichAntragDto**](MeldebereichAntragDto.md)|  | |

### Return type

[**MeldebereichAntragDto**](MeldebereichAntragDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | returns the newly created one |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |
| **200** | returns the newly created one |  -  |

