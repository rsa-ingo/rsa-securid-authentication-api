# UserApi

All URIs are relative to *https://localhost/mfa/v1_1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](UserApi.md#cancel) | **POST** /authn/cancel | Cancels a previously initialized authentication.
[**initialize**](UserApi.md#initialize) | **POST** /authn/initialize | Initialize an authentication attempt.
[**status**](UserApi.md#status) | **POST** /authn/status | Checks status of initialized authentication.
[**verify**](UserApi.md#verify) | **POST** /authn/verify | Verify authentication credentials.


<a name="cancel"></a>
# **cancel**
> AuthNResponse cancel(cancelParams)

Cancels a previously initialized authentication.

This request should be used when the client wants to explicitly cancel an authentication attempt.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: client-key
ApiKeyAuth client-key = (ApiKeyAuth) defaultClient.getAuthentication("client-key");
client-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client-key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Cancel cancelParams = new Cancel(); // Cancel | 
try {
    AuthNResponse result = apiInstance.cancel(cancelParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#cancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancelParams** | [**Cancel**](Cancel.md)|  |

### Return type

[**AuthNResponse**](AuthNResponse.md)

### Authorization

[client-key](../README.md#client-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="initialize"></a>
# **initialize**
> AuthNResponse initialize(initializeParams)

Initialize an authentication attempt.

This request should be used when the client wants to start an authentication attempt. This calls returns an \&quot;authnAttemptId\&quot; in the \&quot;AuthnResponse:ResponseContext\&quot; that will be used to identify the attempt in subsequent calls.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: client-key
ApiKeyAuth client-key = (ApiKeyAuth) defaultClient.getAuthentication("client-key");
client-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client-key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Initialize initializeParams = new Initialize(); // Initialize | Authentication request initialization parameters
try {
    AuthNResponse result = apiInstance.initialize(initializeParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#initialize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **initializeParams** | [**Initialize**](Initialize.md)| Authentication request initialization parameters |

### Return type

[**AuthNResponse**](AuthNResponse.md)

### Authorization

[client-key](../README.md#client-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="status"></a>
# **status**
> AuthNStatusResponse status(statusParams)

Checks status of initialized authentication.

This is called by a subsequent session to be able to check or verify a previous authentication result. The \&quot;CheckStatus\&quot; request contains a \&quot;authnAttemptId\&quot; from a previous successful authentication. By default, this interface can be called once (see \&quot;CheckStatus\&quot; definition).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: client-key
ApiKeyAuth client-key = (ApiKeyAuth) defaultClient.getAuthentication("client-key");
client-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client-key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
CheckStatus statusParams = new CheckStatus(); // CheckStatus | 
try {
    AuthNStatusResponse result = apiInstance.status(statusParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#status");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusParams** | [**CheckStatus**](CheckStatus.md)|  |

### Return type

[**AuthNStatusResponse**](AuthNStatusResponse.md)

### Authorization

[client-key](../README.md#client-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verify"></a>
# **verify**
> AuthNResponse verify(verifyParams)

Verify authentication credentials.

This request should be used when the client wants to provide authentication credentials (i.e., a password, an OTP, etc.) in association with a previously initialized authentication attempt.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: client-key
ApiKeyAuth client-key = (ApiKeyAuth) defaultClient.getAuthentication("client-key");
client-key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client-key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Verify verifyParams = new Verify(); // Verify | Authentication request verification parameters
try {
    AuthNResponse result = apiInstance.verify(verifyParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#verify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyParams** | [**Verify**](Verify.md)| Authentication request verification parameters |

### Return type

[**AuthNResponse**](AuthNResponse.md)

### Authorization

[client-key](../README.md#client-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

