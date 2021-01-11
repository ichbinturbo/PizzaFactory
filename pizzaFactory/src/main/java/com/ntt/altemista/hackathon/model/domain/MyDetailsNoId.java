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
 * MyDetailsNoId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-07T09:23:14.543375800Z[Europe/London]")
public class MyDetailsNoId   {
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

  @JsonProperty("skillsQuote")
  private String skillsQuote = null;

  @JsonProperty("certifications")
  @Valid
  private List<String> certifications = null;

  @JsonProperty("image")
  private Picture image = null;

  public MyDetailsNoId firstName(String firstName) {
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

  public MyDetailsNoId lastName(String lastName) {
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

  public MyDetailsNoId dob(LocalDate dob) {
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

  public MyDetailsNoId phone(String phone) {
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

  public MyDetailsNoId email(String email) {
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

  public MyDetailsNoId jobTitle(String jobTitle) {
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

  public MyDetailsNoId quote(String quote) {
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

  public MyDetailsNoId aboutMe(String aboutMe) {
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

  public MyDetailsNoId inspiration(String inspiration) {
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

  public MyDetailsNoId skillsQuote(String skillsQuote) {
    this.skillsQuote = skillsQuote;
    return this;
  }

  /**
   * Get skillsQuote
   * @return skillsQuote
  **/
  @ApiModelProperty(value = "")
  
    public String getSkillsQuote() {
    return skillsQuote;
  }

  public void setSkillsQuote(String skillsQuote) {
    this.skillsQuote = skillsQuote;
  }

  public MyDetailsNoId certifications(List<String> certifications) {
    this.certifications = certifications;
    return this;
  }

  public MyDetailsNoId addCertificationsItem(String certificationsItem) {
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

  public MyDetailsNoId image(Picture image) {
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
    MyDetailsNoId myDetailsNoId = (MyDetailsNoId) o;
    return Objects.equals(this.firstName, myDetailsNoId.firstName) &&
        Objects.equals(this.lastName, myDetailsNoId.lastName) &&
        Objects.equals(this.dob, myDetailsNoId.dob) &&
        Objects.equals(this.phone, myDetailsNoId.phone) &&
        Objects.equals(this.email, myDetailsNoId.email) &&
        Objects.equals(this.jobTitle, myDetailsNoId.jobTitle) &&
        Objects.equals(this.quote, myDetailsNoId.quote) &&
        Objects.equals(this.aboutMe, myDetailsNoId.aboutMe) &&
        Objects.equals(this.inspiration, myDetailsNoId.inspiration) &&
        Objects.equals(this.skillsQuote, myDetailsNoId.skillsQuote) &&
        Objects.equals(this.certifications, myDetailsNoId.certifications) &&
        Objects.equals(this.image, myDetailsNoId.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, dob, phone, email, jobTitle, quote, aboutMe, inspiration, skillsQuote, certifications, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyDetailsNoId {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    aboutMe: ").append(toIndentedString(aboutMe)).append("\n");
    sb.append("    inspiration: ").append(toIndentedString(inspiration)).append("\n");
    sb.append("    skillsQuote: ").append(toIndentedString(skillsQuote)).append("\n");
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
