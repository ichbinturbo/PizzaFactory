package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ntt.altemista.hackathon.model.domain.ImageFormatEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Picture
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class Picture   {
  @JsonProperty("imageId")
  private UUID imageId = null;

  @JsonProperty("imageFormat")
  @Valid
  private List<ImageFormatEnum> imageFormat = null;

  public Picture imageId(UUID imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   * @return imageId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getImageId() {
    return imageId;
  }

  public void setImageId(UUID imageId) {
    this.imageId = imageId;
  }

  public Picture imageFormat(List<ImageFormatEnum> imageFormat) {
    this.imageFormat = imageFormat;
    return this;
  }

  public Picture addImageFormatItem(ImageFormatEnum imageFormatItem) {
    if (this.imageFormat == null) {
      this.imageFormat = new ArrayList<>();
    }
    this.imageFormat.add(imageFormatItem);
    return this;
  }

  /**
   * Get imageFormat
   * @return imageFormat
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ImageFormatEnum> getImageFormat() {
    return imageFormat;
  }

  public void setImageFormat(List<ImageFormatEnum> imageFormat) {
    this.imageFormat = imageFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Picture picture = (Picture) o;
    return Objects.equals(this.imageId, picture.imageId) &&
        Objects.equals(this.imageFormat, picture.imageFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, imageFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Picture {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
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
