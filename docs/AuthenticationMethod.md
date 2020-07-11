
# AuthenticationMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**methodId** | **String** | Authentication method ID. This value should be provided back to the server in the CredentialValues name-value array in the response. The methodId will be the name and the value will be the value entered by the end-user or provided by the client (unless no value is required, see valueRequired). | 
**displayName** | **String** | The display name of the authentication method ID. If the server response does not contain a displayName, use the methodId. |  [optional]
**priority** | [**BigDecimal**](BigDecimal.md) | This provides information to the client to indicate the order or priority that should be used when processing methods. Values start at 1 with 1 being the highest priority and larger numbers indicating lower priorities. Generally used to indicate time-sensitive methods to which the user should respond first. |  [optional]
**versions** | [**List&lt;AuthenticationMethodVersion&gt;**](AuthenticationMethodVersion.md) | Array of method-specific name/value pairs. | 



