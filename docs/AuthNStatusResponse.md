
# AuthNStatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptResponseCode** | [**ResponseCode**](ResponseCode.md) |  |  [optional]
**attemptReasonCode** | **String** | Specific details about the circumstances of result of the action requested. |  [optional]
**subjectName** | **String** | The name of the subject that completed the authentication. |  [optional]
**authnPolicyId** | **String** | The name of the policy ID provided with the initialize call. |  [optional]
**sessionAttributes** | [**List&lt;NameValuePair&gt;**](NameValuePair.md) | This is an array of session attributes provided with the Initialize call. |  [optional]
**successfulMethods** | **List&lt;String&gt;** | This is an array of method ID strings of methods successfully completed in association with this authentication. |  [optional]
**attemptExpires** | **String** | This is the date and time at which this authentication attempt expires. No further verify or status calls can be made after this time (or if the status check requests deletion of the attempt). |  [optional]



