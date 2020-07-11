
# AuthNResponseCredentialValidationResults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**methodId** | **String** | This is the method ID of the AuthenticationMethod associated with this result. |  [optional]
**methodResponseCode** | [**ResponseCode**](ResponseCode.md) |  |  [optional]
**methodReasonCode** | **String** | Specific details about the circumstances of result of the action requested. |  [optional]
**authnAttributes** | [**List&lt;NameValuePair&gt;**](NameValuePair.md) | This is an array of attributes resulting from a successful authentication. This contains information specific to the authentication type and request. For example, this may contain RADIUS attributes or data to permit additional exchanges such as an off-line data download ticket. This will only be optionally provided if the \&quot;methodResponseCode\&quot; is \&quot;SUCCESS\&quot;. |  [optional]



