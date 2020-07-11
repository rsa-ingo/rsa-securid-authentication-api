/*
 * RSA SecurID Authentication API
 * This defines the RSA SecurID Authentication API. This supports a REST interface to perform multi-factor, multi-step authentications. The caller must invoke the Initialize interface to start an authentication attempt and call the Verify method until the ResponseCode is either SUCCESS, ERROR, or FAIL. Each server response contains CredentialMethods, one of which must be provided in the subjectCredentials of the next Verify call. The server verifies the entered credentials and responds with CHALLENGE or IN_PROCESS if additional information (or confirmations) are required to complete the authentication. The IN_PROCESS status is returned for authentication steps that may take a lot of time. The caller should invoke the Verify call again using the same referenceID to 'poll' on the result of a previous IN_PROCESS authentication. Alternatively, Verify responds with SUCCESS if all required authentication credentials have been provided, FAIL if the verification of a credential failed, or ERROR for malformed requests.
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rsa.securid.client;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-11T15:33:28.173Z")
public class Pair {
    private String name = "";
    private String value = "";

    public Pair (String name, String value) {
        setName(name);
        setValue(value);
    }

    private void setName(String name) {
        if (!isValidString(name)) return;

        this.name = name;
    }

    private void setValue(String value) {
        if (!isValidString(value)) return;

        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) return false;
        if (arg.trim().isEmpty()) return false;

        return true;
    }
}
