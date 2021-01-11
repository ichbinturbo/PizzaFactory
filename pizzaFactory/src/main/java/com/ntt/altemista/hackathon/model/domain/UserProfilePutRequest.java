package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ntt.altemista.hackathon.model.domain.UserProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserProfilePutRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class UserProfilePutRequest   {
  @JsonProperty("userProfile")
  private UserProfile userProfile = null;

  public UserProfilePutRequest userProfile(UserProfile userProfile) {
    this.userProfile = userProfile;
    return this;
  }

  /**
   * Get userProfile
   * @return userProfile
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UserProfile getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(UserProfile userProfile) {
    this.userProfile = userProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfilePutRequest userProfilePutRequest = (UserProfilePutRequest) o;
    return Objects.equals(this.userProfile, userProfilePutRequest.userProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfilePutRequest {\n");
    
    sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
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
