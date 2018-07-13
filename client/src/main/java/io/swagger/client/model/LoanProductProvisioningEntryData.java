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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * LoanProductProvisioningEntryData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-12T09:13:59.001Z")
public class LoanProductProvisioningEntryData {
  @SerializedName("historyId")
  private Long historyId = null;

  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("productId")
  private Long productId = null;

  @SerializedName("categoryId")
  private Long categoryId = null;

  @SerializedName("overdueInDays")
  private Long overdueInDays = null;

  @SerializedName("percentage")
  private BigDecimal percentage = null;

  @SerializedName("liablityAccount")
  private Long liablityAccount = null;

  @SerializedName("expenseAccount")
  private Long expenseAccount = null;

  @SerializedName("criteriaId")
  private Long criteriaId = null;

  @SerializedName("outstandingBalance")
  private BigDecimal outstandingBalance = null;

  public LoanProductProvisioningEntryData historyId(Long historyId) {
    this.historyId = historyId;
    return this;
  }

   /**
   * Get historyId
   * @return historyId
  **/
  @ApiModelProperty(value = "")
  public Long getHistoryId() {
    return historyId;
  }

  public void setHistoryId(Long historyId) {
    this.historyId = historyId;
  }

  public LoanProductProvisioningEntryData officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(value = "")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public LoanProductProvisioningEntryData currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public LoanProductProvisioningEntryData productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public LoanProductProvisioningEntryData categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(value = "")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public LoanProductProvisioningEntryData overdueInDays(Long overdueInDays) {
    this.overdueInDays = overdueInDays;
    return this;
  }

   /**
   * Get overdueInDays
   * @return overdueInDays
  **/
  @ApiModelProperty(value = "")
  public Long getOverdueInDays() {
    return overdueInDays;
  }

  public void setOverdueInDays(Long overdueInDays) {
    this.overdueInDays = overdueInDays;
  }

  public LoanProductProvisioningEntryData percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }

  public LoanProductProvisioningEntryData liablityAccount(Long liablityAccount) {
    this.liablityAccount = liablityAccount;
    return this;
  }

   /**
   * Get liablityAccount
   * @return liablityAccount
  **/
  @ApiModelProperty(value = "")
  public Long getLiablityAccount() {
    return liablityAccount;
  }

  public void setLiablityAccount(Long liablityAccount) {
    this.liablityAccount = liablityAccount;
  }

  public LoanProductProvisioningEntryData expenseAccount(Long expenseAccount) {
    this.expenseAccount = expenseAccount;
    return this;
  }

   /**
   * Get expenseAccount
   * @return expenseAccount
  **/
  @ApiModelProperty(value = "")
  public Long getExpenseAccount() {
    return expenseAccount;
  }

  public void setExpenseAccount(Long expenseAccount) {
    this.expenseAccount = expenseAccount;
  }

  public LoanProductProvisioningEntryData criteriaId(Long criteriaId) {
    this.criteriaId = criteriaId;
    return this;
  }

   /**
   * Get criteriaId
   * @return criteriaId
  **/
  @ApiModelProperty(value = "")
  public Long getCriteriaId() {
    return criteriaId;
  }

  public void setCriteriaId(Long criteriaId) {
    this.criteriaId = criteriaId;
  }

  public LoanProductProvisioningEntryData outstandingBalance(BigDecimal outstandingBalance) {
    this.outstandingBalance = outstandingBalance;
    return this;
  }

   /**
   * Get outstandingBalance
   * @return outstandingBalance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOutstandingBalance() {
    return outstandingBalance;
  }

  public void setOutstandingBalance(BigDecimal outstandingBalance) {
    this.outstandingBalance = outstandingBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProductProvisioningEntryData loanProductProvisioningEntryData = (LoanProductProvisioningEntryData) o;
    return Objects.equals(this.historyId, loanProductProvisioningEntryData.historyId) &&
        Objects.equals(this.officeId, loanProductProvisioningEntryData.officeId) &&
        Objects.equals(this.currencyCode, loanProductProvisioningEntryData.currencyCode) &&
        Objects.equals(this.productId, loanProductProvisioningEntryData.productId) &&
        Objects.equals(this.categoryId, loanProductProvisioningEntryData.categoryId) &&
        Objects.equals(this.overdueInDays, loanProductProvisioningEntryData.overdueInDays) &&
        Objects.equals(this.percentage, loanProductProvisioningEntryData.percentage) &&
        Objects.equals(this.liablityAccount, loanProductProvisioningEntryData.liablityAccount) &&
        Objects.equals(this.expenseAccount, loanProductProvisioningEntryData.expenseAccount) &&
        Objects.equals(this.criteriaId, loanProductProvisioningEntryData.criteriaId) &&
        Objects.equals(this.outstandingBalance, loanProductProvisioningEntryData.outstandingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyId, officeId, currencyCode, productId, categoryId, overdueInDays, percentage, liablityAccount, expenseAccount, criteriaId, outstandingBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProductProvisioningEntryData {\n");
    
    sb.append("    historyId: ").append(toIndentedString(historyId)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    overdueInDays: ").append(toIndentedString(overdueInDays)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    liablityAccount: ").append(toIndentedString(liablityAccount)).append("\n");
    sb.append("    expenseAccount: ").append(toIndentedString(expenseAccount)).append("\n");
    sb.append("    criteriaId: ").append(toIndentedString(criteriaId)).append("\n");
    sb.append("    outstandingBalance: ").append(toIndentedString(outstandingBalance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

