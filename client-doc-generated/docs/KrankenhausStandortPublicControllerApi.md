# KrankenhausStandortPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllKrankenhausStandorteByFilterPublic**](KrankenhausStandortPublicControllerApi.md#getAllKrankenhausStandorteByFilterPublic) | **GET** /public/stammdaten/krankenhausstandort |  |
| [**getKrankenhausStandortByIdPublic**](KrankenhausStandortPublicControllerApi.md#getKrankenhausStandortByIdPublic) | **GET** /public/stammdaten/krankenhausstandort/{krankenhausId} |  |
| [**getMeldebereicheForKrankenhausStandortPublic**](KrankenhausStandortPublicControllerApi.md#getMeldebereicheForKrankenhausStandortPublic) | **GET** /public/stammdaten/krankenhausstandort/{krankenhausId}/meldebereiche |  |


<a id="getAllKrankenhausStandorteByFilterPublic"></a>
# **getAllKrankenhausStandorteByFilterPublic**
> KrankenhausStandortContainerDto getAllKrankenhausStandorteByFilterPublic(bezeichnung, bundesland, page, size, khsId, longitude, latitude, distance, withmeldungonly)



Returns information about hospital locations

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.KrankenhausStandortPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    KrankenhausStandortPublicControllerApi apiInstance = new KrankenhausStandortPublicControllerApi(defaultClient);
    String bezeichnung = ""; // String | 
    String bundesland = "SCHLESWIG_HOLSTEIN"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 10; // Integer | 
    String khsId = "khsId_example"; // String | 
    Double longitude = 3.4D; // Double | 
    Double latitude = 3.4D; // Double | 
    Long distance = 56L; // Long | 
    Boolean withmeldungonly = false; // Boolean | 
    try {
      KrankenhausStandortContainerDto result = apiInstance.getAllKrankenhausStandorteByFilterPublic(bezeichnung, bundesland, page, size, khsId, longitude, latitude, distance, withmeldungonly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KrankenhausStandortPublicControllerApi#getAllKrankenhausStandorteByFilterPublic");
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
| **bezeichnung** | **String**|  | [optional] [default to ] |
| **bundesland** | **String**|  | [optional] [enum: SCHLESWIG_HOLSTEIN, HAMBURG, NIEDERSACHSEN, BREMEN, NORDRHEIN_WESTFALEN, HESSEN, RHEINLAND_PFALZ, BADEN_WUERTTEMBERG, BAYERN, SAARLAND, BERLIN, BRANDENBURG, MECKLENBURG_VORPOMMERN, SACHSEN, SACHSEN_ANHALT, THUERINGEN] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |
| **khsId** | **String**|  | [optional] |
| **longitude** | **Double**|  | [optional] |
| **latitude** | **Double**|  | [optional] |
| **distance** | **Long**|  | [optional] |
| **withmeldungonly** | **Boolean**|  | [optional] [default to false] |

### Return type

[**KrankenhausStandortContainerDto**](KrankenhausStandortContainerDto.md)

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
| **200** | return the hospitalLocation |  -  |

<a id="getKrankenhausStandortByIdPublic"></a>
# **getKrankenhausStandortByIdPublic**
> KrankenhausStandortDto getKrankenhausStandortByIdPublic(krankenhausId)



Returns information about hospital location

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.KrankenhausStandortPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    KrankenhausStandortPublicControllerApi apiInstance = new KrankenhausStandortPublicControllerApi(defaultClient);
    String krankenhausId = "krankenhausId_example"; // String | 
    try {
      KrankenhausStandortDto result = apiInstance.getKrankenhausStandortByIdPublic(krankenhausId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KrankenhausStandortPublicControllerApi#getKrankenhausStandortByIdPublic");
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
| **krankenhausId** | **String**|  | |

### Return type

[**KrankenhausStandortDto**](KrankenhausStandortDto.md)

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
| **200** | return the hospitalLocation |  -  |
| **404** | not found |  -  |

<a id="getMeldebereicheForKrankenhausStandortPublic"></a>
# **getMeldebereicheForKrankenhausStandortPublic**
> List&lt;MeldebereichPublicInfoDto&gt; getMeldebereicheForKrankenhausStandortPublic(krankenhausId)



Returns information about the Meldebereiche of a hospital location

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.KrankenhausStandortPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    KrankenhausStandortPublicControllerApi apiInstance = new KrankenhausStandortPublicControllerApi(defaultClient);
    String krankenhausId = "krankenhausId_example"; // String | 
    try {
      List<MeldebereichPublicInfoDto> result = apiInstance.getMeldebereicheForKrankenhausStandortPublic(krankenhausId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KrankenhausStandortPublicControllerApi#getMeldebereicheForKrankenhausStandortPublic");
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
| **krankenhausId** | **String**|  | |

### Return type

[**List&lt;MeldebereichPublicInfoDto&gt;**](MeldebereichPublicInfoDto.md)

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
| **200** | return a list of Meldebereich for the hospital location |  -  |
| **404** | not found |  -  |

