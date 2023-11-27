# LaendertabellePublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPublicLaendertabelle**](LaendertabellePublicControllerApi.md#getPublicLaendertabelle) | **GET** /public/reporting/laendertabelle |  |


<a id="getPublicLaendertabelle"></a>
# **getPublicLaendertabelle**
> PublicLaendertabelleContainerDto getPublicLaendertabelle(format, onlyErwachsenenBetten, onlyHaupversorgerCovid19)



returns data for show the IR Laendertabelle

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.LaendertabellePublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    LaendertabellePublicControllerApi apiInstance = new LaendertabellePublicControllerApi(defaultClient);
    String format = "format_example"; // String | 
    Boolean onlyErwachsenenBetten = true; // Boolean | 
    Boolean onlyHaupversorgerCovid19 = true; // Boolean | 
    try {
      PublicLaendertabelleContainerDto result = apiInstance.getPublicLaendertabelle(format, onlyErwachsenenBetten, onlyHaupversorgerCovid19);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LaendertabellePublicControllerApi#getPublicLaendertabelle");
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
| **format** | **String**|  | [optional] |
| **onlyErwachsenenBetten** | **Boolean**|  | [optional] |
| **onlyHaupversorgerCovid19** | **Boolean**|  | [optional] |

### Return type

[**PublicLaendertabelleContainerDto**](PublicLaendertabelleContainerDto.md)

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

