# ClientApi

All URIs are relative to *https://localhost/mfa/v1_1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResourceId**](ClientApi.md#getResourceId) | **GET** /authn/resources | Provides I18N language resources.


<a name="getResourceId"></a>
# **getResourceId**
> List&lt;NameValuePair&gt; getResourceId(lang, resourceId)

Provides I18N language resources.

The client can use this interface to GET prompt text values for all prompts or for a specific prompt.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: client-key
ApiKeyAuth client-key = (ApiKeyAuth) defaultClient.getAuthentication("client-key");
client-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client-key.setApiKeyPrefix("Token");

ClientApi apiInstance = new ClientApi();
String lang = "lang_example"; // String | Locale of language to be used for prompt text. ISO 639-1 language code followed by an ISO 3166 country code separated by an underscore. For example, \"en_US\". See https://www.ietf.org/rfc/rfc3066.txt
String resourceId = "resourceId_example"; // String | A specific promptResourceId to be obtained by the client.
try {
    List<NameValuePair> result = apiInstance.getResourceId(lang, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getResourceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lang** | **String**| Locale of language to be used for prompt text. ISO 639-1 language code followed by an ISO 3166 country code separated by an underscore. For example, \&quot;en_US\&quot;. See https://www.ietf.org/rfc/rfc3066.txt |
 **resourceId** | **String**| A specific promptResourceId to be obtained by the client. | [optional]

### Return type

[**List&lt;NameValuePair&gt;**](NameValuePair.md)

### Authorization

[client-key](../README.md#client-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

