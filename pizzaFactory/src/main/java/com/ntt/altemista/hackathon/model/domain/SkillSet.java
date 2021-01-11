package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ntt.altemista.hackathon.model.domain.Skill;
import com.ntt.altemista.hackathon.model.domain.SkillSetEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SkillSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class SkillSet   {
  @JsonProperty("skillSetId")
  private Integer skillSetId = null;

  @JsonProperty("skillSetName")
  private SkillSetEnum skillSetName = null;

  @JsonProperty("skills")
  @Valid
  private List<Skill> skills = null;

  public SkillSet skillSetId(Integer skillSetId) {
    this.skillSetId = skillSetId;
    return this;
  }

  /**
   * Get skillSetId
   * @return skillSetId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getSkillSetId() {
    return skillSetId;
  }

  public void setSkillSetId(Integer skillSetId) {
    this.skillSetId = skillSetId;
  }

  public SkillSet skillSetName(SkillSetEnum skillSetName) {
    this.skillSetName = skillSetName;
    return this;
  }

  /**
   * Get skillSetName
   * @return skillSetName
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SkillSetEnum getSkillSetName() {
    return skillSetName;
  }

  public void setSkillSetName(SkillSetEnum skillSetName) {
    this.skillSetName = skillSetName;
  }

  public SkillSet skills(List<Skill> skills) {
    this.skills = skills;
    return this;
  }

  public SkillSet addSkillsItem(Skill skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<>();
    }
    this.skills.add(skillsItem);
    return this;
  }

  /**
   * Get skills
   * @return skills
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillSet skillSet = (SkillSet) o;
    return Objects.equals(this.skillSetId, skillSet.skillSetId) &&
        Objects.equals(this.skillSetName, skillSet.skillSetName) &&
        Objects.equals(this.skills, skillSet.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillSetId, skillSetName, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillSet {\n");
    
    sb.append("    skillSetId: ").append(toIndentedString(skillSetId)).append("\n");
    sb.append("    skillSetName: ").append(toIndentedString(skillSetName)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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
