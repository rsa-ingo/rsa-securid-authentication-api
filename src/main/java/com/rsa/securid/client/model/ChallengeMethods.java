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
import com.rsa.securid.client.model.ChallengeMethodSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An array of challenge method sets one of which must be completed. There may be only one item in the \&quot;challenges\&quot;. The client is free to select any of the challenges. The client must complete one set -OR- any of the other set(s).
 */
@ApiModel(description = "An array of challenge method sets one of which must be completed. There may be only one item in the \"challenges\". The client is free to select any of the challenges. The client must complete one set -OR- any of the other set(s).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-11T15:33:28.173Z")
public class ChallengeMethods {
  @SerializedName("challenges")
  private List<ChallengeMethodSet> challenges = new ArrayList<ChallengeMethodSet>();

  public ChallengeMethods challenges(List<ChallengeMethodSet> challenges) {
    this.challenges = challenges;
    return this;
  }

  public ChallengeMethods addChallengesItem(ChallengeMethodSet challengesItem) {
    this.challenges.add(challengesItem);
    return this;
  }

   /**
   * An array of sets of challenges.
   * @return challenges
  **/
  @ApiModelProperty(required = true, value = "An array of sets of challenges.")
  public List<ChallengeMethodSet> getChallenges() {
    return challenges;
  }

  public void setChallenges(List<ChallengeMethodSet> challenges) {
    this.challenges = challenges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeMethods challengeMethods = (ChallengeMethods) o;
    return Objects.equals(this.challenges, challengeMethods.challenges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challenges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeMethods {\n");
    
    sb.append("    challenges: ").append(toIndentedString(challenges)).append("\n");
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

