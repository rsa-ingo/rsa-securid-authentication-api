
# MessageContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authnAttemptId** | **String** | A random number representing a unique, transient ID to identify and track the authentication. This identifier must be the same for all subsequent calls. This value will be returned by the server and will be a randomly generated GUID. This cannot be provided in the client \&quot;initialize\&quot; request. Required for \&quot;verify\&quot; calls. |  [optional]
**messageId** | **String** | A random message ID. The client should check that the server&#39;s response \&quot;inResponseTo\&quot; value contains the \&quot;messageId\&quot; provided by the client. In server responses, this value must be provided back to the server in subsequent responses in the \&quot;inResponseTo\&quot; field. Required. | 
**inResponseTo** | **String** | The random message ID of the previous message to which this request responds. This can be empty or null for the first request context to an initialize call. This must be provided and contain the messageId returned by the server when making subsequent responses. Required for all requests other than \&quot;initialize\&quot; calls. |  [optional]



