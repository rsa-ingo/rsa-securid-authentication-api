
# AuthNResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**MessageContext**](MessageContext.md) |  | 
**credentialValidationResults** | [**List&lt;AuthNResponseCredentialValidationResults&gt;**](AuthNResponseCredentialValidationResults.md) | Each entry in this array corresponds with a credential provided to the verify call. |  [optional]
**attemptResponseCode** | [**ResponseCode**](ResponseCode.md) |  | 
**attemptReasonCode** | **String** | Specific details about the circumstances of result of the action requested. | 
**challengeMethods** | [**ChallengeMethods**](ChallengeMethods.md) |  |  [optional]



