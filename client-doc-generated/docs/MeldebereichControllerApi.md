# MeldebereichControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deactivateMeldebereichViaPath**](MeldebereichControllerApi.md#deactivateMeldebereichViaPath) | **POST** /stammdaten/meldebereich/{meldebereichId}/inaktiv |  |
| [**getLetzteMeldungForMeldebereich**](MeldebereichControllerApi.md#getLetzteMeldungForMeldebereich) | **GET** /stammdaten/meldebereich/{meldebereichId}/letzte-meldung |  |
| [**getMeldebereichById**](MeldebereichControllerApi.md#getMeldebereichById) | **GET** /stammdaten/meldebereich/{meldebereichId} |  |
| [**getMeldungenForMeldebereich**](MeldebereichControllerApi.md#getMeldungenForMeldebereich) | **GET** /stammdaten/meldebereich/{meldebereichId}/meldungen |  |
| [**getMeldungenForMeldebereichIncludeInactive**](MeldebereichControllerApi.md#getMeldungenForMeldebereichIncludeInactive) | **GET** /stammdaten/meldebereich/{meldebereichId}/allmeldungen |  |
| [**getMyMeldebereiche**](MeldebereichControllerApi.md#getMyMeldebereiche) | **GET** /stammdaten/meldebereich |  |
| [**getMyMeldebereichePublic**](MeldebereichControllerApi.md#getMyMeldebereichePublic) | **GET** /stammdaten/meldebereich/public |  |
| [**getPrivateMeldebereichById**](MeldebereichControllerApi.md#getPrivateMeldebereichById) | **GET** /stammdaten/meldebereich/{meldebereichId}/private |  |
| [**saveMeldebereich**](MeldebereichControllerApi.md#saveMeldebereich) | **POST** /stammdaten/meldebereich |  |


<a id="deactivateMeldebereichViaPath"></a>
# **deactivateMeldebereichViaPath**
> String deactivateMeldebereichViaPath(meldebereichId, meldebereichDeaktivierungRequestDto)



Deactivates a Meldebereich in the system.

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldebereichControllerApi apiInstance = new MeldebereichControllerApi(defaultClient);
    String meldebereichId = "meldebereichId_example"; // String | 
    MeldebereichDeaktivierungRequestDto meldebereichDeaktivierungRequestDto = new MeldebereichDeaktivierungRequestDto(); // MeldebereichDeaktivierungRequestDto | 
    try {
      String result = apiInstance.deactivateMeldebereichViaPath(meldebereichId, meldebereichDeaktivierungRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichControllerApi#deactivateMeldebereichViaPath");
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
| **meldebereichDeaktivierungRequestDto** | [**MeldebereichDeaktivierungRequestDto**](MeldebereichDeaktivierungRequestDto.md)|  | |

### Return type

**String**

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
| **204** | successfully deactivated |  -  |

<a id="getLetzteMeldungForMeldebereich"></a>
# **getLetzteMeldungForMeldebereich**
> MeldungshistorieDto getLetzteMeldungForMeldebereich(meldebereichId)



Will return the laste Meldung for the given Meldebereich

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldebereichControllerApi apiInstance = new MeldebereichControllerApi(defaultClient);
    String meldebereichId = "meldebereichId_example"; // String | 
    try {
      MeldungshistorieDto result = apiInstance.getLetzteMeldungForMeldebereich(meldebereichId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichControllerApi#getLetzteMeldungForMeldebereich");
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

[**MeldungshistorieDto**](MeldungshistorieDto.md)

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
| **404** | not found |  -  |

<a id="getMeldebereichById"></a>
# **getMeldebereichById**
> MeldebereichPublicInfoDto getMeldebereichById(meldebereichId)



Will return the Meldebereich information for the given ID

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldebereichControllerApi apiInstance = new MeldebereichControllerApi(defaultClient);
    String meldebereichId = "meldebereichId_example"; // String | 
    try {
      MeldebereichPublicInfoDto result = apiInstance.getMeldebereichById(meldebereichId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichControllerApi#getMeldebereichById");
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
| **404** | not found |  -  |

<a id="getMeldungenForMeldebereich"></a>
# **getMeldungenForMeldebereich**
> MeldungshistorieContainerDto getMeldungenForMeldebereich(meldebereichId, page, size, meldungsversion, nurLetzteMeldung)



Will return active Meldungen for the given Meldebereich

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldebereichControllerApi apiInstance = new MeldebereichControllerApi(defaultClient);
    String meldebereichId = "meldebereichId_example"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 56; // Integer | 
    String meldungsversion = "V2"; // String | 
    Boolean nurLetzteMeldung = false; // Boolean | 
    try {
      MeldungshistorieContainerDto result = apiInstance.getMeldungenForMeldebereich(meldebereichId, page, size, meldungsversion, nurLetzteMeldung);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichControllerApi#getMeldungenForMeldebereich");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] |
| **meldungsversion** | **String**|  | [optional] [enum: V2, V1] |
| **nurLetzteMeldung** | **Boolean**|  | [optional] [default to false] |

### Return type

[**MeldungshistorieContainerDto**](MeldungshistorieContainerDto.md)

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
| **404** | not found |  -  |

<a id="getMeldungenForMeldebereichIncludeInactive"></a>
# **getMeldungenForMeldebereichIncludeInactive**
> MeldungshistorieContainerDto getMeldungenForMeldebereichIncludeInactive(meldebereichId, page, size, meldungsversion, nurLetzteMeldung)



Will return all (active/inactive) Meldungen for the given Meldebereich

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldebereichControllerApi apiInstance = new MeldebereichControllerApi(defaultClient);
    String meldebereichId = "meldebereichId_example"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 56; // Integer | 
    String meldungsversion = "V2"; // String | 
    Boolean nurLetzteMeldung = false; // Boolean | 
    try {
      MeldungshistorieContainerDto result = apiInstance.getMeldungenForMeldebereichIncludeInactive(meldebereichId, page, size, meldungsversion, nurLetzteMeldung);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichControllerApi#getMeldungenForMeldebereichIncludeInactive");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] |
| **meldungsversion** | **String**|  | [optional] [enum: V2, V1] |
| **nurLetzteMeldung** | **Boolean**|  | [optional] [default to false] |

### Return type

[**MeldungshistorieContainerDto**](MeldungshistorieContainerDto.md)

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
| **404** | not found |  -  |

<a id="getMyMeldebereiche"></a>
# **getMyMeldebereiche**
> List&lt;MeldebereichDto&gt; getMyMeldebereiche()



Will return your Meldebereich

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldebereichControllerApi apiInstance = new MeldebereichControllerApi(defaultClient);
    try {
      List<MeldebereichDto> result = apiInstance.getMyMeldebereiche();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichControllerApi#getMyMeldebereiche");
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

[**List&lt;MeldebereichDto&gt;**](MeldebereichDto.md)

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
| **200** | successfully |  -  |

<a id="getMyMeldebereichePublic"></a>
# **getMyMeldebereichePublic**
> List&lt;MeldebereichPublicInfoDto&gt; getMyMeldebereichePublic()



Will return your Meldebereich (public information for third-party clients)

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldebereichControllerApi apiInstance = new MeldebereichControllerApi(defaultClient);
    try {
      List<MeldebereichPublicInfoDto> result = apiInstance.getMyMeldebereichePublic();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichControllerApi#getMyMeldebereichePublic");
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

[**List&lt;MeldebereichPublicInfoDto&gt;**](MeldebereichPublicInfoDto.md)

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
| **200** | successfully |  -  |
| **404** | not found |  -  |

<a id="getPrivateMeldebereichById"></a>
# **getPrivateMeldebereichById**
> MeldebereichDto getPrivateMeldebereichById(meldebereichId)



Will return the Meldebereich with private information for the given ID

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldebereichControllerApi apiInstance = new MeldebereichControllerApi(defaultClient);
    String meldebereichId = "meldebereichId_example"; // String | 
    try {
      MeldebereichDto result = apiInstance.getPrivateMeldebereichById(meldebereichId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichControllerApi#getPrivateMeldebereichById");
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

[**MeldebereichDto**](MeldebereichDto.md)

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
| **404** | not found |  -  |

<a id="saveMeldebereich"></a>
# **saveMeldebereich**
> MeldebereichDto saveMeldebereich(meldebereichDto)



Saves a Meldebereich in the system.

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.auth.*;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.MeldebereichControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    MeldebereichControllerApi apiInstance = new MeldebereichControllerApi(defaultClient);
    MeldebereichDto meldebereichDto = new MeldebereichDto(); // MeldebereichDto | 
    try {
      MeldebereichDto result = apiInstance.saveMeldebereich(meldebereichDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeldebereichControllerApi#saveMeldebereich");
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
| **meldebereichDto** | [**MeldebereichDto**](MeldebereichDto.md)|  | |

### Return type

[**MeldebereichDto**](MeldebereichDto.md)

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
| **417** | Meldebereich not editable due to business error |  -  |

