package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SkillProficiencyEnum
 */
public enum SkillProficiencyEnum {
  BEGINNER("BEGINNER"),
    INTERMEDIATE("INTERMEDIATE"),
    GOOD("GOOD"),
    PROFICIENT("PROFICIENT"),
    VETERAN("VETERAN");

  private String value;

  SkillProficiencyEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SkillProficiencyEnum fromValue(String text) {
    for (SkillProficiencyEnum b : SkillProficiencyEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
