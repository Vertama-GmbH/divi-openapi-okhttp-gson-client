# IntensivRegisterPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMeldungenProKrankenhausStandortPublic**](IntensivRegisterPublicControllerApi.md#getMeldungenProKrankenhausStandortPublic) | **GET** /public/intensivregister |  |
| [**postMeldungenProKrankenhausStandortPublic**](IntensivRegisterPublicControllerApi.md#postMeldungenProKrankenhausStandortPublic) | **POST** /public/intensivregister |  |


<a id="getMeldungenProKrankenhausStandortPublic"></a>
# **getMeldungenProKrankenhausStandortPublic**
> KrankenhausmeldungShortContainerDto getMeldungenProKrankenhausStandortPublic(page, size, bundesland, kkhId, kkhBezeichnung, meldebereich, longitude, latitude, distance)



Returns all reported IR figures for a hospital location

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.IntensivRegisterPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    IntensivRegisterPublicControllerApi apiInstance = new IntensivRegisterPublicControllerApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 56; // Integer | 
    String bundesland = "SCHLESWIG_HOLSTEIN"; // String | 
    String kkhId = "kkhId_example"; // String | 
    String kkhBezeichnung = "kkhBezeichnung_example"; // String | 
    String meldebereich = "meldebereich_example"; // String | 
    Double longitude = 3.4D; // Double | 
    Double latitude = 3.4D; // Double | 
    Long distance = 56L; // Long | 
    try {
      KrankenhausmeldungShortContainerDto result = apiInstance.getMeldungenProKrankenhausStandortPublic(page, size, bundesland, kkhId, kkhBezeichnung, meldebereich, longitude, latitude, distance);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntensivRegisterPublicControllerApi#getMeldungenProKrankenhausStandortPublic");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] |
| **bundesland** | **String**|  | [optional] [enum: SCHLESWIG_HOLSTEIN, HAMBURG, NIEDERSACHSEN, BREMEN, NORDRHEIN_WESTFALEN, HESSEN, RHEINLAND_PFALZ, BADEN_WUERTTEMBERG, BAYERN, SAARLAND, BERLIN, BRANDENBURG, MECKLENBURG_VORPOMMERN, SACHSEN, SACHSEN_ANHALT, THUERINGEN] |
| **kkhId** | **String**|  | [optional] |
| **kkhBezeichnung** | **String**|  | [optional] |
| **meldebereich** | **String**|  | [optional] |
| **longitude** | **Double**|  | [optional] |
| **latitude** | **Double**|  | [optional] |
| **distance** | **Long**|  | [optional] |

### Return type

[**KrankenhausmeldungShortContainerDto**](KrankenhausmeldungShortContainerDto.md)

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
| **200** | returns IR hospital location informations |  -  |

<a id="postMeldungenProKrankenhausStandortPublic"></a>
# **postMeldungenProKrankenhausStandortPublic**
> KrankenhausmeldungFullContainerDto postMeldungenProKrankenhausStandortPublic(krankenhausMeldungSearchRequestPublic)



Returns all reported IR figures for a hospital location

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.IntensivRegisterPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    IntensivRegisterPublicControllerApi apiInstance = new IntensivRegisterPublicControllerApi(defaultClient);
    KrankenhausMeldungSearchRequestPublic krankenhausMeldungSearchRequestPublic = new KrankenhausMeldungSearchRequestPublic(); // KrankenhausMeldungSearchRequestPublic | 
    try {
      KrankenhausmeldungFullContainerDto result = apiInstance.postMeldungenProKrankenhausStandortPublic(krankenhausMeldungSearchRequestPublic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntensivRegisterPublicControllerApi#postMeldungenProKrankenhausStandortPublic");
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
| **krankenhausMeldungSearchRequestPublic** | [**KrankenhausMeldungSearchRequestPublic**](KrankenhausMeldungSearchRequestPublic.md)|  | |

### Return type

[**KrankenhausmeldungFullContainerDto**](KrankenhausmeldungFullContainerDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | bad request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |
| **200** | returns IR hospital location informations |  -  |

