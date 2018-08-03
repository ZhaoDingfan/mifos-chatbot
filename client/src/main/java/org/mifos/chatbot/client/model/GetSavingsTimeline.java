/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetSavingsTimeline
 */

public class GetSavingsTimeline {
  @SerializedName("submittedOnDate")
  private List<Long> submittedOnDate = null;

  @SerializedName("submittedByUsername")
  private String submittedByUsername = null;

  @SerializedName("submittedByFirstname")
  private String submittedByFirstname = null;

  @SerializedName("submittedByLastname")
  private String submittedByLastname = null;

  @SerializedName("approvedOnDate")
  private List<Long> approvedOnDate = null;

  @SerializedName("approvedByUsername")
  private String approvedByUsername = null;

  @SerializedName("approvedByFirstname")
  private String approvedByFirstname = null;

  @SerializedName("approvedByLastname")
  private String approvedByLastname = null;

  @SerializedName("activatedOnDate")
  private List<Long> activatedOnDate = null;

  @SerializedName("activatedByUsername")
  private String activatedByUsername = null;

  @SerializedName("activatedByFirstname")
  private String activatedByFirstname = null;

  @SerializedName("activatedByLastname")
  private String activatedByLastname = null;

  public GetSavingsTimeline submittedOnDate(List<Long> submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
    return this;
  }

  public GetSavingsTimeline addSubmittedOnDateItem(Long submittedOnDateItem) {
    if (this.submittedOnDate == null) {
      this.submittedOnDate = new ArrayList<Long>();
    }
    this.submittedOnDate.add(submittedOnDateItem);
    return this;
  }

  /**
   * Get submittedOnDate
   * @return submittedOnDate
   **/
  @ApiModelProperty(example = "[2013,1,1]", value = "")
  public List<Long> getSubmittedOnDate() {
    return submittedOnDate;
  }

  public void setSubmittedOnDate(List<Long> submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }

  public GetSavingsTimeline submittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
    return this;
  }

  /**
   * Get submittedByUsername
   * @return submittedByUsername
   **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getSubmittedByUsername() {
    return submittedByUsername;
  }

  public void setSubmittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
  }

  public GetSavingsTimeline submittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
    return this;
  }

  /**
   * Get submittedByFirstname
   * @return submittedByFirstname
   **/
  @ApiModelProperty(example = "App", value = "")
  public String getSubmittedByFirstname() {
    return submittedByFirstname;
  }

  public void setSubmittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
  }

  public GetSavingsTimeline submittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
    return this;
  }

  /**
   * Get submittedByLastname
   * @return submittedByLastname
   **/
  @ApiModelProperty(example = "Administrator", value = "")
  public String getSubmittedByLastname() {
    return submittedByLastname;
  }

  public void setSubmittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
  }

  public GetSavingsTimeline approvedOnDate(List<Long> approvedOnDate) {
    this.approvedOnDate = approvedOnDate;
    return this;
  }

  public GetSavingsTimeline addApprovedOnDateItem(Long approvedOnDateItem) {
    if (this.approvedOnDate == null) {
      this.approvedOnDate = new ArrayList<Long>();
    }
    this.approvedOnDate.add(approvedOnDateItem);
    return this;
  }

  /**
   * Get approvedOnDate
   * @return approvedOnDate
   **/
  @ApiModelProperty(example = "[2013,1,1]", value = "")
  public List<Long> getApprovedOnDate() {
    return approvedOnDate;
  }

  public void setApprovedOnDate(List<Long> approvedOnDate) {
    this.approvedOnDate = approvedOnDate;
  }

  public GetSavingsTimeline approvedByUsername(String approvedByUsername) {
    this.approvedByUsername = approvedByUsername;
    return this;
  }

  /**
   * Get approvedByUsername
   * @return approvedByUsername
   **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getApprovedByUsername() {
    return approvedByUsername;
  }

  public void setApprovedByUsername(String approvedByUsername) {
    this.approvedByUsername = approvedByUsername;
  }

  public GetSavingsTimeline approvedByFirstname(String approvedByFirstname) {
    this.approvedByFirstname = approvedByFirstname;
    return this;
  }

  /**
   * Get approvedByFirstname
   * @return approvedByFirstname
   **/
  @ApiModelProperty(example = "App", value = "")
  public String getApprovedByFirstname() {
    return approvedByFirstname;
  }

  public void setApprovedByFirstname(String approvedByFirstname) {
    this.approvedByFirstname = approvedByFirstname;
  }

  public GetSavingsTimeline approvedByLastname(String approvedByLastname) {
    this.approvedByLastname = approvedByLastname;
    return this;
  }

  /**
   * Get approvedByLastname
   * @return approvedByLastname
   **/
  @ApiModelProperty(example = "Administrator", value = "")
  public String getApprovedByLastname() {
    return approvedByLastname;
  }

  public void setApprovedByLastname(String approvedByLastname) {
    this.approvedByLastname = approvedByLastname;
  }

  public GetSavingsTimeline activatedOnDate(List<Long> activatedOnDate) {
    this.activatedOnDate = activatedOnDate;
    return this;
  }

  public GetSavingsTimeline addActivatedOnDateItem(Long activatedOnDateItem) {
    if (this.activatedOnDate == null) {
      this.activatedOnDate = new ArrayList<Long>();
    }
    this.activatedOnDate.add(activatedOnDateItem);
    return this;
  }

  /**
   * Get activatedOnDate
   * @return activatedOnDate
   **/
  @ApiModelProperty(example = "[2013,1,1]", value = "")
  public List<Long> getActivatedOnDate() {
    return activatedOnDate;
  }

  public void setActivatedOnDate(List<Long> activatedOnDate) {
    this.activatedOnDate = activatedOnDate;
  }

  public GetSavingsTimeline activatedByUsername(String activatedByUsername) {
    this.activatedByUsername = activatedByUsername;
    return this;
  }

  /**
   * Get activatedByUsername
   * @return activatedByUsername
   **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getActivatedByUsername() {
    return activatedByUsername;
  }

  public void setActivatedByUsername(String activatedByUsername) {
    this.activatedByUsername = activatedByUsername;
  }

  public GetSavingsTimeline activatedByFirstname(String activatedByFirstname) {
    this.activatedByFirstname = activatedByFirstname;
    return this;
  }

  /**
   * Get activatedByFirstname
   * @return activatedByFirstname
   **/
  @ApiModelProperty(example = "App", value = "")
  public String getActivatedByFirstname() {
    return activatedByFirstname;
  }

  public void setActivatedByFirstname(String activatedByFirstname) {
    this.activatedByFirstname = activatedByFirstname;
  }

  public GetSavingsTimeline activatedByLastname(String activatedByLastname) {
    this.activatedByLastname = activatedByLastname;
    return this;
  }

  /**
   * Get activatedByLastname
   * @return activatedByLastname
   **/
  @ApiModelProperty(example = "Administrator", value = "")
  public String getActivatedByLastname() {
    return activatedByLastname;
  }

  public void setActivatedByLastname(String activatedByLastname) {
    this.activatedByLastname = activatedByLastname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsTimeline getSavingsTimeline = (GetSavingsTimeline) o;
    return Objects.equals(this.submittedOnDate, getSavingsTimeline.submittedOnDate) &&
            Objects.equals(this.submittedByUsername, getSavingsTimeline.submittedByUsername) &&
            Objects.equals(this.submittedByFirstname, getSavingsTimeline.submittedByFirstname) &&
            Objects.equals(this.submittedByLastname, getSavingsTimeline.submittedByLastname) &&
            Objects.equals(this.approvedOnDate, getSavingsTimeline.approvedOnDate) &&
            Objects.equals(this.approvedByUsername, getSavingsTimeline.approvedByUsername) &&
            Objects.equals(this.approvedByFirstname, getSavingsTimeline.approvedByFirstname) &&
            Objects.equals(this.approvedByLastname, getSavingsTimeline.approvedByLastname) &&
            Objects.equals(this.activatedOnDate, getSavingsTimeline.activatedOnDate) &&
            Objects.equals(this.activatedByUsername, getSavingsTimeline.activatedByUsername) &&
            Objects.equals(this.activatedByFirstname, getSavingsTimeline.activatedByFirstname) &&
            Objects.equals(this.activatedByLastname, getSavingsTimeline.activatedByLastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submittedOnDate, submittedByUsername, submittedByFirstname, submittedByLastname, approvedOnDate, approvedByUsername, approvedByFirstname, approvedByLastname, activatedOnDate, activatedByUsername, activatedByFirstname, activatedByLastname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsTimeline {\n");

    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    submittedByUsername: ").append(toIndentedString(submittedByUsername)).append("\n");
    sb.append("    submittedByFirstname: ").append(toIndentedString(submittedByFirstname)).append("\n");
    sb.append("    submittedByLastname: ").append(toIndentedString(submittedByLastname)).append("\n");
    sb.append("    approvedOnDate: ").append(toIndentedString(approvedOnDate)).append("\n");
    sb.append("    approvedByUsername: ").append(toIndentedString(approvedByUsername)).append("\n");
    sb.append("    approvedByFirstname: ").append(toIndentedString(approvedByFirstname)).append("\n");
    sb.append("    approvedByLastname: ").append(toIndentedString(approvedByLastname)).append("\n");
    sb.append("    activatedOnDate: ").append(toIndentedString(activatedOnDate)).append("\n");
    sb.append("    activatedByUsername: ").append(toIndentedString(activatedByUsername)).append("\n");
    sb.append("    activatedByFirstname: ").append(toIndentedString(activatedByFirstname)).append("\n");
    sb.append("    activatedByLastname: ").append(toIndentedString(activatedByLastname)).append("\n");
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

