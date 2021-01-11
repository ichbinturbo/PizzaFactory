package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ntt.altemista.hackathon.model.domain.SkillSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MySkills
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class MySkills   {
  @JsonProperty("skillsIntroduction")
  private String skillsIntroduction = null;

  @JsonProperty("skillSets")
  @Valid
  private List<SkillSet> skillSets = null;

  public MySkills skillsIntroduction(String skillsIntroduction) {
    this.skillsIntroduction = skillsIntroduction;
    return this;
  }

  /**
   * Get skillsIntroduction
   * @return skillsIntroduction
  **/
  @ApiModelProperty(value = "")
  
    public String getSkillsIntroduction() {
    return skillsIntroduction;
  }

  public void setSkillsIntroduction(String skillsIntroduction) {
    this.skillsIntroduction = skillsIntroduction;
  }

  public MySkills skillSets(List<SkillSet> skillSets) {
    this.skillSets = skillSets;
    return this;
  }

  public MySkills addSkillSetsItem(SkillSet skillSetsItem) {
    if (this.skillSets == null) {
      this.skillSets = new ArrayList<>();
    }
    this.skillSets.add(skillSetsItem);
    return this;
  }

  /**
   * Get skillSets
   * @return skillSets
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<SkillSet> getSkillSets() {
    return skillSets;
  }

  public void setSkillSets(List<SkillSet> skillSets) {
    this.skillSets = skillSets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MySkills mySkills = (MySkills) o;
    return Objects.equals(this.skillsIntroduction, mySkills.skillsIntroduction) &&
        Objects.equals(this.skillSets, mySkills.skillSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillsIntroduction, skillSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MySkills {\n");
    
    sb.append("    skillsIntroduction: ").append(toIndentedString(skillsIntroduction)).append("\n");
    sb.append("    skillSets: ").append(toIndentedString(skillSets)).append("\n");
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
