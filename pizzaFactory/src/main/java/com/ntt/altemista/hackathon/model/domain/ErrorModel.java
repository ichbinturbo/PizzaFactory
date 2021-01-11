package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class ErrorModel   {
  @JsonProperty("incidentId")
  private UUID incidentId = null;

  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("errorCode")
  private Integer errorCode = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  public ErrorModel incidentId(UUID incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * Get incidentId
   * @return incidentId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(UUID incidentId) {
    this.incidentId = incidentId;
  }

  public ErrorModel statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")
  
    public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ErrorModel errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  
    public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorModel errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  
    public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.incidentId, errorModel.incidentId) &&
        Objects.equals(this.statusCode, errorModel.statusCode) &&
        Objects.equals(this.errorCode, errorModel.errorCode) &&
        Objects.equals(this.errorMessage, errorModel.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentId, statusCode, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
