package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SkillSetEnum
 */
public enum SkillSetEnum {
  FRONT_END("FRONT_END"),
    BACK_END("BACK_END"),
    UTILITIES_AND_OTHERS("UTILITIES_AND_OTHERS");

  private String value;

  SkillSetEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SkillSetEnum fromValue(String text) {
    for (SkillSetEnum b : SkillSetEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
