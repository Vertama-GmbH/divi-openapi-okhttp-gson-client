# DataApiPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getKrankenhausStandorteMeldungen**](DataApiPublicControllerApi.md#getKrankenhausStandorteMeldungen) | **GET** /public/data-api/krankenhaus-standorte-meldungen.csv |  |


<a id="getKrankenhausStandorteMeldungen"></a>
# **getKrankenhausStandorteMeldungen**
> KrankenhausMeldungDataApiDto getKrankenhausStandorteMeldungen(apiKey)



Returns a csv file of all latest Meldungen aggregated on Standort level

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.DataApiPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    DataApiPublicControllerApi apiInstance = new DataApiPublicControllerApi(defaultClient);
    String apiKey = "apiKey_example"; // String | 
    try {
      KrankenhausMeldungDataApiDto result = apiInstance.getKrankenhausStandorteMeldungen(apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApiPublicControllerApi#getKrankenhausStandorteMeldungen");
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
| **apiKey** | **String**|  | |

### Return type

[**KrankenhausMeldungDataApiDto**](KrankenhausMeldungDataApiDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **403** | invalid api key or access denied |  -  |
| **500** | Internal Server Error |  -  |
| **200** | success |  -  |

