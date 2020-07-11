
# Cancel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | [**ReasonEnum**](#ReasonEnum) | Optional reason code for the cancel request. |  [optional]
**authnAttemptId** | **String** | This is an authnAttemptId returned by a previous \&quot;initialize\&quot; call in the \&quot;AuthNResponse:RequestContext:authnAttemptId\&quot;. | 
**removeAttemptId** | **Boolean** | Requests that the authentication attempt ID be removed as a part of this \&quot;cancel\&quot; call. |  [optional]


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
USER_ACTION | &quot;USER_ACTION&quot;
TIME_OUT | &quot;TIME_OUT&quot;



