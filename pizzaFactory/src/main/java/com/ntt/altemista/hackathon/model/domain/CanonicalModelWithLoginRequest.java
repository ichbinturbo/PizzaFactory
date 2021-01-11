package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ntt.altemista.hackathon.model.domain.LoginRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CanonicalModelWithLoginRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class CanonicalModelWithLoginRequest   {
  @JsonProperty("correlationId")
  private UUID correlationId = null;

  @JsonProperty("sessionId")
  private UUID sessionId = null;

  @JsonProperty("payload")
  private LoginRequest payload = null;

  @JsonProperty("error")
  private Object error = null;

  public CanonicalModelWithLoginRequest correlationId(UUID correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * Get correlationId
   * @return correlationId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(UUID correlationId) {
    this.correlationId = correlationId;
  }

  public CanonicalModelWithLoginRequest sessionId(UUID sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getSessionId() {
    return sessionId;
  }

  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }

  public CanonicalModelWithLoginRequest payload(LoginRequest payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LoginRequest getPayload() {
    return payload;
  }

  public void setPayload(LoginRequest payload) {
    this.payload = payload;
  }

  public CanonicalModelWithLoginRequest error(Object error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  
    public Object getError() {
    return error;
  }

  public void setError(Object error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanonicalModelWithLoginRequest canonicalModelWithLoginRequest = (CanonicalModelWithLoginRequest) o;
    return Objects.equals(this.correlationId, canonicalModelWithLoginRequest.correlationId) &&
        Objects.equals(this.sessionId, canonicalModelWithLoginRequest.sessionId) &&
        Objects.equals(this.payload, canonicalModelWithLoginRequest.payload) &&
        Objects.equals(this.error, canonicalModelWithLoginRequest.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, sessionId, payload, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanonicalModelWithLoginRequest {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
