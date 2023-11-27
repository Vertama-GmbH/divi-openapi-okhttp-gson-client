# VersorgungsclusterPublicControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGroupedByBundeslandPublic**](VersorgungsclusterPublicControllerApi.md#getGroupedByBundeslandPublic) | **GET** /public/stammdaten/versorgungscluster/grouped-by-bundesland |  |
| [**getPublic**](VersorgungsclusterPublicControllerApi.md#getPublic) | **GET** /public/stammdaten/versorgungscluster |  |
| [**getPublicContaining**](VersorgungsclusterPublicControllerApi.md#getPublicContaining) | **GET** /public/stammdaten/versorgungscluster/containing |  |


<a id="getGroupedByBundeslandPublic"></a>
# **getGroupedByBundeslandPublic**
> List&lt;VersorgungsclusterByBundeslandShortDto&gt; getGroupedByBundeslandPublic()



Returns all versorgungsclusters grouped by bundesland

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.VersorgungsclusterPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    VersorgungsclusterPublicControllerApi apiInstance = new VersorgungsclusterPublicControllerApi(defaultClient);
    try {
      List<VersorgungsclusterByBundeslandShortDto> result = apiInstance.getGroupedByBundeslandPublic();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VersorgungsclusterPublicControllerApi#getGroupedByBundeslandPublic");
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

[**List&lt;VersorgungsclusterByBundeslandShortDto&gt;**](VersorgungsclusterByBundeslandShortDto.md)

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
| **200** | returned versorgungsclusters |  -  |

<a id="getPublic"></a>
# **getPublic**
> List&lt;VersorgungsclusterShortDto&gt; getPublic()



Returns all versorgungsclusters

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.VersorgungsclusterPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    VersorgungsclusterPublicControllerApi apiInstance = new VersorgungsclusterPublicControllerApi(defaultClient);
    try {
      List<VersorgungsclusterShortDto> result = apiInstance.getPublic();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VersorgungsclusterPublicControllerApi#getPublic");
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

[**List&lt;VersorgungsclusterShortDto&gt;**](VersorgungsclusterShortDto.md)

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
| **200** | returned versorgungsclusters |  -  |

<a id="getPublicContaining"></a>
# **getPublicContaining**
> List&lt;VersorgungsclusterShortDto&gt; getPublicContaining(gemeindeschluessel)



Returns versorgungsclusters containing the landeskreise with the most significant characters of given gemeindeschluessel

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.VersorgungsclusterPublicControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    VersorgungsclusterPublicControllerApi apiInstance = new VersorgungsclusterPublicControllerApi(defaultClient);
    String gemeindeschluessel = "gemeindeschluessel_example"; // String | 
    try {
      List<VersorgungsclusterShortDto> result = apiInstance.getPublicContaining(gemeindeschluessel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VersorgungsclusterPublicControllerApi#getPublicContaining");
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
| **gemeindeschluessel** | **String**|  | [optional] |

### Return type

[**List&lt;VersorgungsclusterShortDto&gt;**](VersorgungsclusterShortDto.md)

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
| **200** | returned versorgungsclusters |  -  |

