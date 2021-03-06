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
import com.rsa.securid.client.model.MethodPrompt;
import com.rsa.securid.client.model.NameValuePair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Authentication method. This will typically represent a prompt to which the user must respond. Each version may have different method attributes.
 */
@ApiModel(description = "Authentication method. This will typically represent a prompt to which the user must respond. Each version may have different method attributes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-11T15:33:28.173Z")
public class AuthenticationMethodVersion {
  @SerializedName("versionId")
  private String versionId = "1.0.0";

  @SerializedName("methodAttributes")
  private List<NameValuePair> methodAttributes = null;

  @SerializedName("valueRequired")
  private Boolean valueRequired = true;

  @SerializedName("referenceId")
  private String referenceId = null;

  @SerializedName("prompt")
  private MethodPrompt prompt = null;

  public AuthenticationMethodVersion versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public AuthenticationMethodVersion methodAttributes(List<NameValuePair> methodAttributes) {
    this.methodAttributes = methodAttributes;
    return this;
  }

  public AuthenticationMethodVersion addMethodAttributesItem(NameValuePair methodAttributesItem) {
    if (this.methodAttributes == null) {
      this.methodAttributes = new ArrayList<NameValuePair>();
    }
    this.methodAttributes.add(methodAttributesItem);
    return this;
  }

   /**
   * Array of method-specific name/value pairs.
   * @return methodAttributes
  **/
  @ApiModelProperty(value = "Array of method-specific name/value pairs.")
  public List<NameValuePair> getMethodAttributes() {
    return methodAttributes;
  }

  public void setMethodAttributes(List<NameValuePair> methodAttributes) {
    this.methodAttributes = methodAttributes;
  }

  public AuthenticationMethodVersion valueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired;
    return this;
  }

   /**
   * If this is true, a value must be entered and returned to the server for this prompt. If this is false, no value needs to be obtained from the end-user. The client only needs to indicate this method was selected. This will initiate an out-of-band authentication process typically to the end-users mobile device.
   * @return valueRequired
  **/
  @ApiModelProperty(value = "If this is true, a value must be entered and returned to the server for this prompt. If this is false, no value needs to be obtained from the end-user. The client only needs to indicate this method was selected. This will initiate an out-of-band authentication process typically to the end-users mobile device.")
  public Boolean isValueRequired() {
    return valueRequired;
  }

  public void setValueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired;
  }

  public AuthenticationMethodVersion referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * An identifier referencing the verification state of certain out-of-band authentication methods, which may require the client to pass this identifier back in subsequent &#39;verify&#39; calls.
   * @return referenceId
  **/
  @ApiModelProperty(value = "An identifier referencing the verification state of certain out-of-band authentication methods, which may require the client to pass this identifier back in subsequent 'verify' calls.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public AuthenticationMethodVersion prompt(MethodPrompt prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * Get prompt
   * @return prompt
  **/
  @ApiModelProperty(required = true, value = "")
  public MethodPrompt getPrompt() {
    return prompt;
  }

  public void setPrompt(MethodPrompt prompt) {
    this.prompt = prompt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationMethodVersion authenticationMethodVersion = (AuthenticationMethodVersion) o;
    return Objects.equals(this.versionId, authenticationMethodVersion.versionId) &&
        Objects.equals(this.methodAttributes, authenticationMethodVersion.methodAttributes) &&
        Objects.equals(this.valueRequired, authenticationMethodVersion.valueRequired) &&
        Objects.equals(this.referenceId, authenticationMethodVersion.referenceId) &&
        Objects.equals(this.prompt, authenticationMethodVersion.prompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, methodAttributes, valueRequired, referenceId, prompt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethodVersion {\n");
    
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    methodAttributes: ").append(toIndentedString(methodAttributes)).append("\n");
    sb.append("    valueRequired: ").append(toIndentedString(valueRequired)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
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

