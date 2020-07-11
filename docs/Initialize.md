
# Initialize

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authnAttemptTimeout** | [**BigDecimal**](BigDecimal.md) | A number in seconds representing how long the server will keep the authentication attempt ID available after each call. During this time is is possible to make other calls using the \&quot;authnAttemptId\&quot;. The server may reject initialization requests if the value provided is beyond the allowable maximum. Defaults to a server-defined session lifetime. Optional. |  [optional]
**tenantId** | **String** | Tenant identifier valid at the IA Service. This is also provided in the request URL. If this is provided, it must match the tenant ID derived from the requst URL or the call may be rejected. Optional. |  [optional]
**clientId** | **String** | Client identifier valid at the IA Service. This may either be a logical client ID  such as \&quot;RADIUS\&quot;, \&quot;Chrome\&quot;, or may be a Fully Qualified Host Name (FQHN) of the client host. This may be used by the server to determine access control. If a clientId is not provided, a default value may be derived from the HTTP header information. Optional. |  [optional]
**subjectName** | **String** | User/Account identifier. This shall contain the login ID of the principal requesting the authentication. The format depends on the context. This value may be a AD \&quot;samAccountName\&quot;, an email address. Required. | 
**display** | **String** | This is intended to provide a \&quot;hint\&quot; to the server as to the display characteristics or capabilities of the client. Possible values may indicate whether the client is rendering the interface in a web page, RADIUS client, Windows, etc. Used by the server to provide responses tailored for rendering on the client. Optional. |  [optional]
**lang** | **String** | This defines the language for prompt text provided by the interface in the \&quot;MethodPrompt\&quot; response. Optional. |  [optional]
**assurancePolicyId** | **String** | This may contain the name of a policy which should be resolved in policy decision stage. For now, we assume this is a policy name. Mutually exclusive with \&quot;assuranceLevel\&quot; and \&quot;authMethodId\&quot;. Optional. |  [optional]
**assuranceLevel** | [**AssuranceLevelEnum**](#AssuranceLevelEnum) | This may contain the required assurance level for authentication. Mutually exclusive with \&quot;assurancePolicyId\&quot; and \&quot;authMethodId\&quot;. Optional. |  [optional]
**authMethodId** | **String** | This may contain the name of an authentication method which should be used to authenticate. Mutually exclusive with \&quot;assurancePolicyId\&quot; and \&quot;assuranceLevel\&quot;. Optional. |  [optional]
**sessionAttributes** | [**List&lt;NameValuePair&gt;**](NameValuePair.md) | This is a list of collected data related to the event. The session attribute values may be used in policy decision flow. Examples of possible values include local IP address, HTML5/GEO location, device fingerprint, accessed resource name (if possible), etc. These values are intended for use in RISK/TRUST evaluation engine. Possible keys will be provided in a session attribute dictionary. Optional. |  [optional]
**subjectCredentials** | [**List&lt;Credential&gt;**](Credential.md) | This can be used to provide a list of previously collected credentials. For example, this can be used to provide a basic credential like a password to MFA interface with the initialize call (to facilitate a &#39;single-step\&quot; authentication process). Optional. |  [optional]
**clientDetails** | [**ClientDetails**](ClientDetails.md) |  |  [optional]
**context** | [**MessageContext**](MessageContext.md) |  | 
**keepAttempt** | **Boolean** | By default, completed authentication attempts are removed from the server. A \&quot;true\&quot; value can be provided to have complete or cancelled authentication attempts retained until they are removed or expire. This value should be set to \&quot;true\&quot; if a subsequent CheckStatus call will be made. A &#39;complete&#39; authentication attempt is any attempt for which an Initialize or Verify call have returned a ResponseCode other than CHALLENGE or IN_PROCESS. |  [optional]


<a name="AssuranceLevelEnum"></a>
## Enum: AssuranceLevelEnum
Name | Value
---- | -----
LOW | &quot;LOW&quot;
MEDIUM | &quot;MEDIUM&quot;
HIGH | &quot;HIGH&quot;



