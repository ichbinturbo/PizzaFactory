package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ntt.altemista.hackathon.model.domain.Picture;
import com.ntt.altemista.hackathon.model.domain.SkillProficiencyEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Skill
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class Skill   {
  @JsonProperty("skillId")
  private Integer skillId = null;

  @JsonProperty("skillName")
  private String skillName = null;

  @JsonProperty("icon")
  private Picture icon = null;

  @JsonProperty("proficiency")
  private SkillProficiencyEnum proficiency = null;

  public Skill skillId(Integer skillId) {
    this.skillId = skillId;
    return this;
  }

  /**
   * Get skillId
   * @return skillId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getSkillId() {
    return skillId;
  }

  public void setSkillId(Integer skillId) {
    this.skillId = skillId;
  }

  public Skill skillName(String skillName) {
    this.skillName = skillName;
    return this;
  }

  /**
   * Get skillName
   * @return skillName
  **/
  @ApiModelProperty(value = "")
  
    public String getSkillName() {
    return skillName;
  }

  public void setSkillName(String skillName) {
    this.skillName = skillName;
  }

  public Skill icon(Picture icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Picture getIcon() {
    return icon;
  }

  public void setIcon(Picture icon) {
    this.icon = icon;
  }

  public Skill proficiency(SkillProficiencyEnum proficiency) {
    this.proficiency = proficiency;
    return this;
  }

  /**
   * Get proficiency
   * @return proficiency
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SkillProficiencyEnum getProficiency() {
    return proficiency;
  }

  public void setProficiency(SkillProficiencyEnum proficiency) {
    this.proficiency = proficiency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Skill skill = (Skill) o;
    return Objects.equals(this.skillId, skill.skillId) &&
        Objects.equals(this.skillName, skill.skillName) &&
        Objects.equals(this.icon, skill.icon) &&
        Objects.equals(this.proficiency, skill.proficiency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillId, skillName, icon, proficiency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Skill {\n");
    
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    skillName: ").append(toIndentedString(skillName)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    proficiency: ").append(toIndentedString(proficiency)).append("\n");
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
