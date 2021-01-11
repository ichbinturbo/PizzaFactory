package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ntt.altemista.hackathon.model.domain.UserProfileNoId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserProfilePostRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class UserProfilePostRequest   {
  @JsonProperty("userProfileNoId")
  private UserProfileNoId userProfileNoId = null;

  public UserProfilePostRequest userProfileNoId(UserProfileNoId userProfileNoId) {
    this.userProfileNoId = userProfileNoId;
    return this;
  }

  /**
   * Get userProfileNoId
   * @return userProfileNoId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UserProfileNoId getUserProfileNoId() {
    return userProfileNoId;
  }

  public void setUserProfileNoId(UserProfileNoId userProfileNoId) {
    this.userProfileNoId = userProfileNoId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfilePostRequest userProfilePostRequest = (UserProfilePostRequest) o;
    return Objects.equals(this.userProfileNoId, userProfilePostRequest.userProfileNoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfileNoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfilePostRequest {\n");
    
    sb.append("    userProfileNoId: ").append(toIndentedString(userProfileNoId)).append("\n");
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
