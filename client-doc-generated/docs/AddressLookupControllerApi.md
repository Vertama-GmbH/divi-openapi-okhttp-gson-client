# AddressLookupControllerApi

All URIs are relative to *https://uat.intensivregister.de/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reverseAddressLookup**](AddressLookupControllerApi.md#reverseAddressLookup) | **GET** /public/address-lookup/reverse |  |


<a id="reverseAddressLookup"></a>
# **reverseAddressLookup**
> AddressLookupResponseContainer reverseAddressLookup(latitude, longitude)



Returns geolocation information matching the given latitude+longitude

### Example
```java
// Import classes:
import de.vertama.divi.client.invoker.ApiClient;
import de.vertama.divi.client.invoker.ApiException;
import de.vertama.divi.client.invoker.Configuration;
import de.vertama.divi.client.invoker.models.*;
import de.vertama.divi.client.api.AddressLookupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://uat.intensivregister.de/api");

    AddressLookupControllerApi apiInstance = new AddressLookupControllerApi(defaultClient);
    Double latitude = 3.4D; // Double | 
    Double longitude = 3.4D; // Double | 
    try {
      AddressLookupResponseContainer result = apiInstance.reverseAddressLookup(latitude, longitude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressLookupControllerApi#reverseAddressLookup");
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
| **latitude** | **Double**|  | |
| **longitude** | **Double**|  | |

### Return type

[**AddressLookupResponseContainer**](AddressLookupResponseContainer.md)

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
| **200** | Returns geolocation information matching the search filter |  -  |

