package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MyProjects
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class MyProjects   {
  @JsonProperty("projectId")
  private Integer projectId = null;

  @JsonProperty("projectTitle")
  private String projectTitle = null;

  @JsonProperty("projectName")
  private String projectName = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("projectExperience")
  private String projectExperience = null;

  public MyProjects projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public MyProjects projectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
    return this;
  }

  /**
   * Get projectTitle
   * @return projectTitle
  **/
  @ApiModelProperty(value = "")
  
    public String getProjectTitle() {
    return projectTitle;
  }

  public void setProjectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
  }

  public MyProjects projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
  **/
  @ApiModelProperty(value = "")
  
    public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public MyProjects startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public MyProjects endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public MyProjects description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=10)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MyProjects projectExperience(String projectExperience) {
    this.projectExperience = projectExperience;
    return this;
  }

  /**
   * Get projectExperience
   * @return projectExperience
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=10)   public String getProjectExperience() {
    return projectExperience;
  }

  public void setProjectExperience(String projectExperience) {
    this.projectExperience = projectExperience;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyProjects myProjects = (MyProjects) o;
    return Objects.equals(this.projectId, myProjects.projectId) &&
        Objects.equals(this.projectTitle, myProjects.projectTitle) &&
        Objects.equals(this.projectName, myProjects.projectName) &&
        Objects.equals(this.startDate, myProjects.startDate) &&
        Objects.equals(this.endDate, myProjects.endDate) &&
        Objects.equals(this.description, myProjects.description) &&
        Objects.equals(this.projectExperience, myProjects.projectExperience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectTitle, projectName, startDate, endDate, description, projectExperience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyProjects {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectTitle: ").append(toIndentedString(projectTitle)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectExperience: ").append(toIndentedString(projectExperience)).append("\n");
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
