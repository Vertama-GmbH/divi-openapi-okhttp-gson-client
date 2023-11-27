# MeldungsControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**meldeKapazitaet**](MeldungsControllerApi.md#meldeKapazitaet) | **POST** /meldungen |  |


<a id="meldeKapazitaet"></a>
# **meldeKapazitaet**
> SubmitMeldungResponseDto meldeKapazitaet(submitMeldungRequestDto)



notitfy system for new bed situation

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldungsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldungsControllerApi apiInstance = new MeldungsControllerApi(defaultClient);
    SubmitMeldungRequestDto submitMeldungRequestDto = new SubmitMeldungRequestDto(); // SubmitMeldungRequestDto | 
    try {
      SubmitMeldungResponseDto result = apiInstance.meldeKapazitaet(submitMeldungRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldungsControllerApi#meldeKapazitaet");
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
| **submitMeldungRequestDto** | [**SubmitMeldungRequestDto**](SubmitMeldungRequestDto.md)|  | |

### Return type

[**SubmitMeldungResponseDto**](SubmitMeldungResponseDto.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | bad request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |
| **200** | successfully saved |  -  |

