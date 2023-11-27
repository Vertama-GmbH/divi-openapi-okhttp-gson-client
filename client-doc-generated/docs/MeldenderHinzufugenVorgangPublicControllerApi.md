# MeldenderHinzufugenVorgangPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizeMeldenderHinzufugenVorgang**](MeldenderHinzufugenVorgangPublicControllerApi.md#authorizeMeldenderHinzufugenVorgang) | **POST** /public/meldenderhinzufugenvorgang/{vorgangId}/meldenderhinzufugenvorgang |  |
| [**getMeldenderHinzufugenVorgangById**](MeldenderHinzufugenVorgangPublicControllerApi.md#getMeldenderHinzufugenVorgangById) | **GET** /public/meldenderhinzufugenvorgang/{vorgangId}/meldenderhinzufugenvorgang/byvorgangid |  |


<a id="authorizeMeldenderHinzufugenVorgang"></a>
# **authorizeMeldenderHinzufugenVorgang**
> String authorizeMeldenderHinzufugenVorgang(vorgangId)



Authorize MeldenderHinzufugenVorgang

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldenderHinzufugenVorgangPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldenderHinzufugenVorgangPublicControllerApi apiInstance = new MeldenderHinzufugenVorgangPublicControllerApi(defaultClient);
    String vorgangId = "vorgangId_example"; // String | 
    try {
      String result = apiInstance.authorizeMeldenderHinzufugenVorgang(vorgangId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldenderHinzufugenVorgangPublicControllerApi#authorizeMeldenderHinzufugenVorgang");
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
| **vorgangId** | **String**|  | |

### Return type

**String**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | bad request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |
| **204** | success |  -  |

<a id="getMeldenderHinzufugenVorgangById"></a>
# **getMeldenderHinzufugenVorgangById**
> MeldenderHinzufugenVorgangDto getMeldenderHinzufugenVorgangById(vorgangId)



Will return MeldenderHinzufugenVorgang by Vorgangs Id

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldenderHinzufugenVorgangPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldenderHinzufugenVorgangPublicControllerApi apiInstance = new MeldenderHinzufugenVorgangPublicControllerApi(defaultClient);
    String vorgangId = "vorgangId_example"; // String | 
    try {
      MeldenderHinzufugenVorgangDto result = apiInstance.getMeldenderHinzufugenVorgangById(vorgangId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldenderHinzufugenVorgangPublicControllerApi#getMeldenderHinzufugenVorgangById");
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
| **vorgangId** | **String**|  | |

### Return type

[**MeldenderHinzufugenVorgangDto**](MeldenderHinzufugenVorgangDto.md)

### Authorization

[bearer](../README.md#bearer)

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
| **404** | Meldebereich not found |  -  |

