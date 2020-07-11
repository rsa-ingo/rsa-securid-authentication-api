# rsa-securid-authentication-api
RSA SecurID Authentication API
This is a unofficial build of the RSA SecurID Authentication API.
Based on the swagger.io yaml file provided by RSA.
This is in no way an official build from RSA nor is it supported by RSA.

For the official API documentation and download of the swagger.io codegen yaml file please look at https://community.rsa.com/docs/DOC-75741


------------------------------------

RSA SecurID Authentication API
- API version: 1.0.2
  - Build date: 2020-07-11T15:33:28.173Z

This defines the RSA SecurID Authentication API. This supports a REST interface to perform multi-factor, multi-step authentications. The caller must invoke the Initialize interface to start an authentication attempt and call the Verify method until the ResponseCode is either SUCCESS, ERROR, or FAIL. Each server response contains CredentialMethods, one of which must be provided in the subjectCredentials of the next Verify call. The server verifies the entered credentials and responds with CHALLENGE or IN_PROCESS if additional information (or confirmations) are required to complete the authentication. The IN_PROCESS status is returned for authentication steps that may take a lot of time. The caller should invoke the Verify call again using the same referenceID to 'poll' on the result of a previous IN_PROCESS authentication. Alternatively, Verify responds with SUCCESS if all required authentication credentials have been provided, FAIL if the verification of a credential failed, or ERROR for malformed requests.

For more information, please visit [https://community.rsa.com/community/products/securid](https://community.rsa.com/community/products/securid)

