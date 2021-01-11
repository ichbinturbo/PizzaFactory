package com.ntt.altemista.hackathon.model.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ntt.altemista.hackathon.model.domain.Picture;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MyDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class MyDetails   {
  @JsonProperty("userProfileId")
  private Integer userProfileId = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("dob")
  private LocalDate dob = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("jobTitle")
  private String jobTitle = null;

  @JsonProperty("quote")
  private String quote = null;

  @JsonProperty("aboutMe")
  private String aboutMe = null;

  @JsonProperty("inspiration")
  private String inspiration = null;

  @JsonProperty("certifications")
  @Valid
  private List<String> certifications = null;

  @JsonProperty("image")
  private Picture image = null;

  public MyDetails userProfileId(Integer userProfileId) {
    this.userProfileId = userProfileId;
    return this;
  }

  /**
   * Get userProfileId
   * @return userProfileId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getUserProfileId() {
    return userProfileId;
  }

  public void setUserProfileId(Integer userProfileId) {
    this.userProfileId = userProfileId;
  }

  public MyDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public MyDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public MyDetails dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public MyDetails phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=10)   public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public MyDetails email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MyDetails jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  
    public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public MyDetails quote(String quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
  **/
  @ApiModelProperty(value = "")
  
    public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  public MyDetails aboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
    return this;
  }

  /**
   * Get aboutMe
   * @return aboutMe
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=10)   public String getAboutMe() {
    return aboutMe;
  }

  public void setAboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
  }

  public MyDetails inspiration(String inspiration) {
    this.inspiration = inspiration;
    return this;
  }

  /**
   * Get inspiration
   * @return inspiration
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=10)   public String getInspiration() {
    return inspiration;
  }

  public void setInspiration(String inspiration) {
    this.inspiration = inspiration;
  }

  public MyDetails certifications(List<String> certifications) {
    this.certifications = certifications;
    return this;
  }

  public MyDetails addCertificationsItem(String certificationsItem) {
    if (this.certifications == null) {
      this.certifications = new ArrayList<>();
    }
    this.certifications.add(certificationsItem);
    return this;
  }

  /**
   * Get certifications
   * @return certifications
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getCertifications() {
    return certifications;
  }

  public void setCertifications(List<String> certifications) {
    this.certifications = certifications;
  }

  public MyDetails image(Picture image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Picture getImage() {
    return image;
  }

  public void setImage(Picture image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyDetails myDetails = (MyDetails) o;
    return Objects.equals(this.userProfileId, myDetails.userProfileId) &&
        Objects.equals(this.firstName, myDetails.firstName) &&
        Objects.equals(this.lastName, myDetails.lastName) &&
        Objects.equals(this.dob, myDetails.dob) &&
        Objects.equals(this.phone, myDetails.phone) &&
        Objects.equals(this.email, myDetails.email) &&
        Objects.equals(this.jobTitle, myDetails.jobTitle) &&
        Objects.equals(this.quote, myDetails.quote) &&
        Objects.equals(this.aboutMe, myDetails.aboutMe) &&
        Objects.equals(this.inspiration, myDetails.inspiration) &&
        Objects.equals(this.certifications, myDetails.certifications) &&
        Objects.equals(this.image, myDetails.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfileId, firstName, lastName, dob, phone, email, jobTitle, quote, aboutMe, inspiration, certifications, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyDetails {\n");
    
    sb.append("    userProfileId: ").append(toIndentedString(userProfileId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    aboutMe: ").append(toIndentedString(aboutMe)).append("\n");
    sb.append("    inspiration: ").append(toIndentedString(inspiration)).append("\n");
    sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
