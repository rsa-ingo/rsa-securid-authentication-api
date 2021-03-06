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


package com.rsa.securid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.rsa.securid.client.model.AuthNResponseCredentialValidationResults;
import com.rsa.securid.client.model.ChallengeMethods;
import com.rsa.securid.client.model.MessageContext;
import com.rsa.securid.client.model.ResponseCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Authentication Response. This provides status from any previous \&quot;verify\&quot; call as well as the authentication challenges that must be completed for authentication.
 */
@ApiModel(description = "Authentication Response. This provides status from any previous \"verify\" call as well as the authentication challenges that must be completed for authentication.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-11T15:33:28.173Z")
public class AuthNResponse {
  @SerializedName("context")
  private MessageContext context = null;

  @SerializedName("credentialValidationResults")
  private List<AuthNResponseCredentialValidationResults> credentialValidationResults = null;

  @SerializedName("attemptResponseCode")
  private ResponseCode attemptResponseCode = null;

  @SerializedName("attemptReasonCode")
  private String attemptReasonCode = null;

  @SerializedName("challengeMethods")
  private ChallengeMethods challengeMethods = null;

  public AuthNResponse context(MessageContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(required = true, value = "")
  public MessageContext getContext() {
    return context;
  }

  public void setContext(MessageContext context) {
    this.context = context;
  }

  public AuthNResponse credentialValidationResults(List<AuthNResponseCredentialValidationResults> credentialValidationResults) {
    this.credentialValidationResults = credentialValidationResults;
    return this;
  }

  public AuthNResponse addCredentialValidationResultsItem(AuthNResponseCredentialValidationResults credentialValidationResultsItem) {
    if (this.credentialValidationResults == null) {
      this.credentialValidationResults = new ArrayList<AuthNResponseCredentialValidationResults>();
    }
    this.credentialValidationResults.add(credentialValidationResultsItem);
    return this;
  }

   /**
   * Each entry in this array corresponds with a credential provided to the verify call.
   * @return credentialValidationResults
  **/
  @ApiModelProperty(value = "Each entry in this array corresponds with a credential provided to the verify call.")
  public List<AuthNResponseCredentialValidationResults> getCredentialValidationResults() {
    return credentialValidationResults;
  }

  public void setCredentialValidationResults(List<AuthNResponseCredentialValidationResults> credentialValidationResults) {
    this.credentialValidationResults = credentialValidationResults;
  }

  public AuthNResponse attemptResponseCode(ResponseCode attemptResponseCode) {
    this.attemptResponseCode = attemptResponseCode;
    return this;
  }

   /**
   * Get attemptResponseCode
   * @return attemptResponseCode
  **/
  @ApiModelProperty(required = true, value = "")
  public ResponseCode getAttemptResponseCode() {
    return attemptResponseCode;
  }

  public void setAttemptResponseCode(ResponseCode attemptResponseCode) {
    this.attemptResponseCode = attemptResponseCode;
  }

  public AuthNResponse attemptReasonCode(String attemptReasonCode) {
    this.attemptReasonCode = attemptReasonCode;
    return this;
  }

   /**
   * Specific details about the circumstances of result of the action requested.
   * @return attemptReasonCode
  **/
  @ApiModelProperty(required = true, value = "Specific details about the circumstances of result of the action requested.")
  public String getAttemptReasonCode() {
    return attemptReasonCode;
  }

  public void setAttemptReasonCode(String attemptReasonCode) {
    this.attemptReasonCode = attemptReasonCode;
  }

  public AuthNResponse challengeMethods(ChallengeMethods challengeMethods) {
    this.challengeMethods = challengeMethods;
    return this;
  }

   /**
   * Get challengeMethods
   * @return challengeMethods
  **/
  @ApiModelProperty(value = "")
  public ChallengeMethods getChallengeMethods() {
    return challengeMethods;
  }

  public void setChallengeMethods(ChallengeMethods challengeMethods) {
    this.challengeMethods = challengeMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNResponse authNResponse = (AuthNResponse) o;
    return Objects.equals(this.context, authNResponse.context) &&
        Objects.equals(this.credentialValidationResults, authNResponse.credentialValidationResults) &&
        Objects.equals(this.attemptResponseCode, authNResponse.attemptResponseCode) &&
        Objects.equals(this.attemptReasonCode, authNResponse.attemptReasonCode) &&
        Objects.equals(this.challengeMethods, authNResponse.challengeMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, credentialValidationResults, attemptResponseCode, attemptReasonCode, challengeMethods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNResponse {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    credentialValidationResults: ").append(toIndentedString(credentialValidationResults)).append("\n");
    sb.append("    attemptResponseCode: ").append(toIndentedString(attemptResponseCode)).append("\n");
    sb.append("    attemptReasonCode: ").append(toIndentedString(attemptReasonCode)).append("\n");
    sb.append("    challengeMethods: ").append(toIndentedString(challengeMethods)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

