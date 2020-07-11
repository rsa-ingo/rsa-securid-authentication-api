
# Credential

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**methodId** | **String** | This is the method for which the input was collected. | 
**referenceId** | **String** | This is the identifier that the server returns in the previous response, in reference to the current verification state of the method. See referenceId in AuthenticationMethodVersion. |  [optional]
**versionId** | **String** | This is the version of method implementation supported and collected by a client. |  [optional]
**collectedInputs** | [**List&lt;NameValuePair&gt;**](NameValuePair.md) | This provides an array of one or more collected credential input values.  Required. | 



