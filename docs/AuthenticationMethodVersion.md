
# AuthenticationMethodVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionId** | **String** |  | 
**methodAttributes** | [**List&lt;NameValuePair&gt;**](NameValuePair.md) | Array of method-specific name/value pairs. |  [optional]
**valueRequired** | **Boolean** | If this is true, a value must be entered and returned to the server for this prompt. If this is false, no value needs to be obtained from the end-user. The client only needs to indicate this method was selected. This will initiate an out-of-band authentication process typically to the end-users mobile device. |  [optional]
**referenceId** | **String** | An identifier referencing the verification state of certain out-of-band authentication methods, which may require the client to pass this identifier back in subsequent &#39;verify&#39; calls. |  [optional]
**prompt** | [**MethodPrompt**](MethodPrompt.md) |  | 



