package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ntt.altemista.hackathon.model.domain.MyDetails;
import com.ntt.altemista.hackathon.model.domain.MyProjects;
import com.ntt.altemista.hackathon.model.domain.MySkills;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class UserProfile   {
  @JsonProperty("profileDetails")
  private MyDetails profileDetails = null;

  @JsonProperty("skills")
  private MySkills skills = null;

  @JsonProperty("projects")
  @Valid
  private List<MyProjects> projects = null;

  public UserProfile profileDetails(MyDetails profileDetails) {
    this.profileDetails = profileDetails;
    return this;
  }

  /**
   * Get profileDetails
   * @return profileDetails
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MyDetails getProfileDetails() {
    return profileDetails;
  }

  public void setProfileDetails(MyDetails profileDetails) {
    this.profileDetails = profileDetails;
  }

  public UserProfile skills(MySkills skills) {
    this.skills = skills;
    return this;
  }

  /**
   * Get skills
   * @return skills
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MySkills getSkills() {
    return skills;
  }

  public void setSkills(MySkills skills) {
    this.skills = skills;
  }

  public UserProfile projects(List<MyProjects> projects) {
    this.projects = projects;
    return this;
  }

  public UserProfile addProjectsItem(MyProjects projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * Get projects
   * @return projects
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<MyProjects> getProjects() {
    return projects;
  }

  public void setProjects(List<MyProjects> projects) {
    this.projects = projects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.profileDetails, userProfile.profileDetails) &&
        Objects.equals(this.skills, userProfile.skills) &&
        Objects.equals(this.projects, userProfile.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileDetails, skills, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    profileDetails: ").append(toIndentedString(profileDetails)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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
