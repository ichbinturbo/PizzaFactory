package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserProfilePostResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class UserProfilePostResponse   {
  @JsonProperty("userProfileId")
  private Integer userProfileId = null;

  @JsonProperty("acknowledgement")
  private UUID acknowledgement = null;

  @JsonProperty("message")
  private String message = null;

  public UserProfilePostResponse userProfileId(Integer userProfileId) {
    this.userProfileId = userProfileId;
    return this;
  }

  /**
   * Get userProfileId
   * @return userProfileId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getUserProfileId() {
    return userProfileId;
  }

  public void setUserProfileId(Integer userProfileId) {
    this.userProfileId = userProfileId;
  }

  public UserProfilePostResponse acknowledgement(UUID acknowledgement) {
    this.acknowledgement = acknowledgement;
    return this;
  }

  /**
   * Get acknowledgement
   * @return acknowledgement
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getAcknowledgement() {
    return acknowledgement;
  }

  public void setAcknowledgement(UUID acknowledgement) {
    this.acknowledgement = acknowledgement;
  }

  public UserProfilePostResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfilePostResponse userProfilePostResponse = (UserProfilePostResponse) o;
    return Objects.equals(this.userProfileId, userProfilePostResponse.userProfileId) &&
        Objects.equals(this.acknowledgement, userProfilePostResponse.acknowledgement) &&
        Objects.equals(this.message, userProfilePostResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfileId, acknowledgement, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfilePostResponse {\n");
    
    sb.append("    userProfileId: ").append(toIndentedString(userProfileId)).append("\n");
    sb.append("    acknowledgement: ").append(toIndentedString(acknowledgement)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
