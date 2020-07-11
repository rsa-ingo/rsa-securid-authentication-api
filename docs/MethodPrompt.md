
# MethodPrompt

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promptResourceId** | **String** | A resource ID of the prompt text. This is an immutable identified that can be used to lookup prompt text for this prompt. For example, this may be \&quot;PROMPT.LDAP.PASSWORD\&quot;, or \&quot;PROMPT.SID.NEXT_TOKENCODE\&quot;. Values that cannot be resolved locally by a client can be retrieved from the server by performing a GET on the \&quot;/authn/resources\&quot; for the required language. Once resolved, the \&quot;promptArgs\&quot; must be formatted into the prompt text place holders ({0}, {1}, etc.) | 
**defaultText** | **String** | Default text for the prompt. This would be in the language requested in the \&quot;initialize\&quot; call with the \&quot;promptArgs\&quot; values already formatted. | 
**formatRegex** | **String** | Format descriptor regular expression for the user&#39;s entry. |  [optional]
**defaultValue** | **String** | Predefined response default value. If no value is provided for this prompt, this is the value the server will use. |  [optional]
**valueBeingDefined** | **Boolean** | This is true if the value is being defined by the user&#39;s entry. Typically true for prompts of values like new passwords or new PINs. It is expected the client will provide some mechanism for the end-user to verify their knowledge of the value entered before returning same to the server. For example, the client may request the value twice and validate that both values match. |  [optional]
**sensitive** | **Boolean** | This is true if the value is considered sensitive and its entry should be masked by the client. |  [optional]
**minLength** | [**BigDecimal**](BigDecimal.md) | Minimum allowed length in characters. |  [optional]
**maxLength** | [**BigDecimal**](BigDecimal.md) | Maximum allowed length in characters. |  [optional]
**promptArgs** | **List&lt;String&gt;** |  |  [optional]



