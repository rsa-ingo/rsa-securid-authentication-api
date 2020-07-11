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
import java.io.IOException;

/**
 * Common authentication request context data. This is both provided to and returned by the server. Apart from the replay detection data (messageId/inResponseTo), the server&#39;s response contains the authentication attempt ID. This ID must be returned in subsequent calls.
 */
@ApiModel(description = "Common authentication request context data. This is both provided to and returned by the server. Apart from the replay detection data (messageId/inResponseTo), the server's response contains the authentication attempt ID. This ID must be returned in subsequent calls.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-11T15:33:28.173Z")
public class MessageContext {
  @SerializedName("authnAttemptId")
  private String authnAttemptId = null;

  @SerializedName("messageId")
  private String messageId = null;

  @SerializedName("inResponseTo")
  private String inResponseTo = null;

  public MessageContext authnAttemptId(String authnAttemptId) {
    this.authnAttemptId = authnAttemptId;
    return this;
  }

   /**
   * A random number representing a unique, transient ID to identify and track the authentication. This identifier must be the same for all subsequent calls. This value will be returned by the server and will be a randomly generated GUID. This cannot be provided in the client \&quot;initialize\&quot; request. Required for \&quot;verify\&quot; calls.
   * @return authnAttemptId
  **/
  @ApiModelProperty(value = "A random number representing a unique, transient ID to identify and track the authentication. This identifier must be the same for all subsequent calls. This value will be returned by the server and will be a randomly generated GUID. This cannot be provided in the client \"initialize\" request. Required for \"verify\" calls.")
  public String getAuthnAttemptId() {
    return authnAttemptId;
  }

  public void setAuthnAttemptId(String authnAttemptId) {
    this.authnAttemptId = authnAttemptId;
  }

  public MessageContext messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * A random message ID. The client should check that the server&#39;s response \&quot;inResponseTo\&quot; value contains the \&quot;messageId\&quot; provided by the client. In server responses, this value must be provided back to the server in subsequent responses in the \&quot;inResponseTo\&quot; field. Required.
   * @return messageId
  **/
  @ApiModelProperty(required = true, value = "A random message ID. The client should check that the server's response \"inResponseTo\" value contains the \"messageId\" provided by the client. In server responses, this value must be provided back to the server in subsequent responses in the \"inResponseTo\" field. Required.")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public MessageContext inResponseTo(String inResponseTo) {
    this.inResponseTo = inResponseTo;
    return this;
  }

   /**
   * The random message ID of the previous message to which this request responds. This can be empty or null for the first request context to an initialize call. This must be provided and contain the messageId returned by the server when making subsequent responses. Required for all requests other than \&quot;initialize\&quot; calls.
   * @return inResponseTo
  **/
  @ApiModelProperty(value = "The random message ID of the previous message to which this request responds. This can be empty or null for the first request context to an initialize call. This must be provided and contain the messageId returned by the server when making subsequent responses. Required for all requests other than \"initialize\" calls.")
  public String getInResponseTo() {
    return inResponseTo;
  }

  public void setInResponseTo(String inResponseTo) {
    this.inResponseTo = inResponseTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContext messageContext = (MessageContext) o;
    return Objects.equals(this.authnAttemptId, messageContext.authnAttemptId) &&
        Objects.equals(this.messageId, messageContext.messageId) &&
        Objects.equals(this.inResponseTo, messageContext.inResponseTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authnAttemptId, messageId, inResponseTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContext {\n");
    
    sb.append("    authnAttemptId: ").append(toIndentedString(authnAttemptId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    inResponseTo: ").append(toIndentedString(inResponseTo)).append("\n");
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

