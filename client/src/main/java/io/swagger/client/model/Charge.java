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
import io.swagger.client.model.GLAccount;
import io.swagger.client.model.MonthDay;
import io.swagger.client.model.TaxGroup;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Charge
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-12T09:13:59.001Z")
public class Charge {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("chargeTimeType")
  private Integer chargeTimeType = null;

  @SerializedName("chargeCalculation")
  private Integer chargeCalculation = null;

  @SerializedName("chargePaymentMode")
  private Integer chargePaymentMode = null;

  @SerializedName("feeInterval")
  private Integer feeInterval = null;

  @SerializedName("penalty")
  private Boolean penalty = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("minCap")
  private BigDecimal minCap = null;

  @SerializedName("maxCap")
  private BigDecimal maxCap = null;

  @SerializedName("account")
  private GLAccount account = null;

  @SerializedName("taxGroup")
  private TaxGroup taxGroup = null;

  @SerializedName("feeOnMonthDay")
  private MonthDay feeOnMonthDay = null;

  @SerializedName("savingsCharge")
  private Boolean savingsCharge = null;

  @SerializedName("annualFee")
  private Boolean annualFee = null;

  @SerializedName("monthlyFee")
  private Boolean monthlyFee = null;

  @SerializedName("overdueInstallment")
  private Boolean overdueInstallment = null;

  @SerializedName("allowedLoanChargeTime")
  private Boolean allowedLoanChargeTime = null;

  @SerializedName("allowedClientChargeTime")
  private Boolean allowedClientChargeTime = null;

  @SerializedName("allowedSavingsChargeTime")
  private Boolean allowedSavingsChargeTime = null;

  @SerializedName("loanCharge")
  private Boolean loanCharge = null;

  @SerializedName("clientCharge")
  private Boolean clientCharge = null;

  @SerializedName("allowedSavingsChargeCalculationType")
  private Boolean allowedSavingsChargeCalculationType = null;

  @SerializedName("allowedClientChargeCalculationType")
  private Boolean allowedClientChargeCalculationType = null;

  @SerializedName("percentageOfApprovedAmount")
  private Boolean percentageOfApprovedAmount = null;

  @SerializedName("percentageOfDisbursementAmount")
  private Boolean percentageOfDisbursementAmount = null;

  @SerializedName("disbursementCharge")
  private Boolean disbursementCharge = null;

  @SerializedName("new")
  private Boolean _new = null;

  public Charge id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Charge name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Charge amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Charge currencyCode(String currencyCode) {
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

  public Charge chargeTimeType(Integer chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @ApiModelProperty(value = "")
  public Integer getChargeTimeType() {
    return chargeTimeType;
  }

  public void setChargeTimeType(Integer chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }

  public Charge chargeCalculation(Integer chargeCalculation) {
    this.chargeCalculation = chargeCalculation;
    return this;
  }

   /**
   * Get chargeCalculation
   * @return chargeCalculation
  **/
  @ApiModelProperty(value = "")
  public Integer getChargeCalculation() {
    return chargeCalculation;
  }

  public void setChargeCalculation(Integer chargeCalculation) {
    this.chargeCalculation = chargeCalculation;
  }

  public Charge chargePaymentMode(Integer chargePaymentMode) {
    this.chargePaymentMode = chargePaymentMode;
    return this;
  }

   /**
   * Get chargePaymentMode
   * @return chargePaymentMode
  **/
  @ApiModelProperty(value = "")
  public Integer getChargePaymentMode() {
    return chargePaymentMode;
  }

  public void setChargePaymentMode(Integer chargePaymentMode) {
    this.chargePaymentMode = chargePaymentMode;
  }

  public Charge feeInterval(Integer feeInterval) {
    this.feeInterval = feeInterval;
    return this;
  }

   /**
   * Get feeInterval
   * @return feeInterval
  **/
  @ApiModelProperty(value = "")
  public Integer getFeeInterval() {
    return feeInterval;
  }

  public void setFeeInterval(Integer feeInterval) {
    this.feeInterval = feeInterval;
  }

  public Charge penalty(Boolean penalty) {
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @ApiModelProperty(value = "")
  public Boolean isPenalty() {
    return penalty;
  }

  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }

  public Charge active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Charge deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Charge minCap(BigDecimal minCap) {
    this.minCap = minCap;
    return this;
  }

   /**
   * Get minCap
   * @return minCap
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinCap() {
    return minCap;
  }

  public void setMinCap(BigDecimal minCap) {
    this.minCap = minCap;
  }

  public Charge maxCap(BigDecimal maxCap) {
    this.maxCap = maxCap;
    return this;
  }

   /**
   * Get maxCap
   * @return maxCap
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxCap() {
    return maxCap;
  }

  public void setMaxCap(BigDecimal maxCap) {
    this.maxCap = maxCap;
  }

  public Charge account(GLAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public GLAccount getAccount() {
    return account;
  }

  public void setAccount(GLAccount account) {
    this.account = account;
  }

  public Charge taxGroup(TaxGroup taxGroup) {
    this.taxGroup = taxGroup;
    return this;
  }

   /**
   * Get taxGroup
   * @return taxGroup
  **/
  @ApiModelProperty(value = "")
  public TaxGroup getTaxGroup() {
    return taxGroup;
  }

  public void setTaxGroup(TaxGroup taxGroup) {
    this.taxGroup = taxGroup;
  }

  public Charge feeOnMonthDay(MonthDay feeOnMonthDay) {
    this.feeOnMonthDay = feeOnMonthDay;
    return this;
  }

   /**
   * Get feeOnMonthDay
   * @return feeOnMonthDay
  **/
  @ApiModelProperty(value = "")
  public MonthDay getFeeOnMonthDay() {
    return feeOnMonthDay;
  }

  public void setFeeOnMonthDay(MonthDay feeOnMonthDay) {
    this.feeOnMonthDay = feeOnMonthDay;
  }

  public Charge savingsCharge(Boolean savingsCharge) {
    this.savingsCharge = savingsCharge;
    return this;
  }

   /**
   * Get savingsCharge
   * @return savingsCharge
  **/
  @ApiModelProperty(value = "")
  public Boolean isSavingsCharge() {
    return savingsCharge;
  }

  public void setSavingsCharge(Boolean savingsCharge) {
    this.savingsCharge = savingsCharge;
  }

  public Charge annualFee(Boolean annualFee) {
    this.annualFee = annualFee;
    return this;
  }

   /**
   * Get annualFee
   * @return annualFee
  **/
  @ApiModelProperty(value = "")
  public Boolean isAnnualFee() {
    return annualFee;
  }

  public void setAnnualFee(Boolean annualFee) {
    this.annualFee = annualFee;
  }

  public Charge monthlyFee(Boolean monthlyFee) {
    this.monthlyFee = monthlyFee;
    return this;
  }

   /**
   * Get monthlyFee
   * @return monthlyFee
  **/
  @ApiModelProperty(value = "")
  public Boolean isMonthlyFee() {
    return monthlyFee;
  }

  public void setMonthlyFee(Boolean monthlyFee) {
    this.monthlyFee = monthlyFee;
  }

  public Charge overdueInstallment(Boolean overdueInstallment) {
    this.overdueInstallment = overdueInstallment;
    return this;
  }

   /**
   * Get overdueInstallment
   * @return overdueInstallment
  **/
  @ApiModelProperty(value = "")
  public Boolean isOverdueInstallment() {
    return overdueInstallment;
  }

  public void setOverdueInstallment(Boolean overdueInstallment) {
    this.overdueInstallment = overdueInstallment;
  }

  public Charge allowedLoanChargeTime(Boolean allowedLoanChargeTime) {
    this.allowedLoanChargeTime = allowedLoanChargeTime;
    return this;
  }

   /**
   * Get allowedLoanChargeTime
   * @return allowedLoanChargeTime
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowedLoanChargeTime() {
    return allowedLoanChargeTime;
  }

  public void setAllowedLoanChargeTime(Boolean allowedLoanChargeTime) {
    this.allowedLoanChargeTime = allowedLoanChargeTime;
  }

  public Charge allowedClientChargeTime(Boolean allowedClientChargeTime) {
    this.allowedClientChargeTime = allowedClientChargeTime;
    return this;
  }

   /**
   * Get allowedClientChargeTime
   * @return allowedClientChargeTime
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowedClientChargeTime() {
    return allowedClientChargeTime;
  }

  public void setAllowedClientChargeTime(Boolean allowedClientChargeTime) {
    this.allowedClientChargeTime = allowedClientChargeTime;
  }

  public Charge allowedSavingsChargeTime(Boolean allowedSavingsChargeTime) {
    this.allowedSavingsChargeTime = allowedSavingsChargeTime;
    return this;
  }

   /**
   * Get allowedSavingsChargeTime
   * @return allowedSavingsChargeTime
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowedSavingsChargeTime() {
    return allowedSavingsChargeTime;
  }

  public void setAllowedSavingsChargeTime(Boolean allowedSavingsChargeTime) {
    this.allowedSavingsChargeTime = allowedSavingsChargeTime;
  }

  public Charge loanCharge(Boolean loanCharge) {
    this.loanCharge = loanCharge;
    return this;
  }

   /**
   * Get loanCharge
   * @return loanCharge
  **/
  @ApiModelProperty(value = "")
  public Boolean isLoanCharge() {
    return loanCharge;
  }

  public void setLoanCharge(Boolean loanCharge) {
    this.loanCharge = loanCharge;
  }

  public Charge clientCharge(Boolean clientCharge) {
    this.clientCharge = clientCharge;
    return this;
  }

   /**
   * Get clientCharge
   * @return clientCharge
  **/
  @ApiModelProperty(value = "")
  public Boolean isClientCharge() {
    return clientCharge;
  }

  public void setClientCharge(Boolean clientCharge) {
    this.clientCharge = clientCharge;
  }

  public Charge allowedSavingsChargeCalculationType(Boolean allowedSavingsChargeCalculationType) {
    this.allowedSavingsChargeCalculationType = allowedSavingsChargeCalculationType;
    return this;
  }

   /**
   * Get allowedSavingsChargeCalculationType
   * @return allowedSavingsChargeCalculationType
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowedSavingsChargeCalculationType() {
    return allowedSavingsChargeCalculationType;
  }

  public void setAllowedSavingsChargeCalculationType(Boolean allowedSavingsChargeCalculationType) {
    this.allowedSavingsChargeCalculationType = allowedSavingsChargeCalculationType;
  }

  public Charge allowedClientChargeCalculationType(Boolean allowedClientChargeCalculationType) {
    this.allowedClientChargeCalculationType = allowedClientChargeCalculationType;
    return this;
  }

   /**
   * Get allowedClientChargeCalculationType
   * @return allowedClientChargeCalculationType
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowedClientChargeCalculationType() {
    return allowedClientChargeCalculationType;
  }

  public void setAllowedClientChargeCalculationType(Boolean allowedClientChargeCalculationType) {
    this.allowedClientChargeCalculationType = allowedClientChargeCalculationType;
  }

  public Charge percentageOfApprovedAmount(Boolean percentageOfApprovedAmount) {
    this.percentageOfApprovedAmount = percentageOfApprovedAmount;
    return this;
  }

   /**
   * Get percentageOfApprovedAmount
   * @return percentageOfApprovedAmount
  **/
  @ApiModelProperty(value = "")
  public Boolean isPercentageOfApprovedAmount() {
    return percentageOfApprovedAmount;
  }

  public void setPercentageOfApprovedAmount(Boolean percentageOfApprovedAmount) {
    this.percentageOfApprovedAmount = percentageOfApprovedAmount;
  }

  public Charge percentageOfDisbursementAmount(Boolean percentageOfDisbursementAmount) {
    this.percentageOfDisbursementAmount = percentageOfDisbursementAmount;
    return this;
  }

   /**
   * Get percentageOfDisbursementAmount
   * @return percentageOfDisbursementAmount
  **/
  @ApiModelProperty(value = "")
  public Boolean isPercentageOfDisbursementAmount() {
    return percentageOfDisbursementAmount;
  }

  public void setPercentageOfDisbursementAmount(Boolean percentageOfDisbursementAmount) {
    this.percentageOfDisbursementAmount = percentageOfDisbursementAmount;
  }

  public Charge disbursementCharge(Boolean disbursementCharge) {
    this.disbursementCharge = disbursementCharge;
    return this;
  }

   /**
   * Get disbursementCharge
   * @return disbursementCharge
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisbursementCharge() {
    return disbursementCharge;
  }

  public void setDisbursementCharge(Boolean disbursementCharge) {
    this.disbursementCharge = disbursementCharge;
  }

  public Charge _new(Boolean _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @ApiModelProperty(value = "")
  public Boolean isNew() {
    return _new;
  }

  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.id, charge.id) &&
        Objects.equals(this.name, charge.name) &&
        Objects.equals(this.amount, charge.amount) &&
        Objects.equals(this.currencyCode, charge.currencyCode) &&
        Objects.equals(this.chargeTimeType, charge.chargeTimeType) &&
        Objects.equals(this.chargeCalculation, charge.chargeCalculation) &&
        Objects.equals(this.chargePaymentMode, charge.chargePaymentMode) &&
        Objects.equals(this.feeInterval, charge.feeInterval) &&
        Objects.equals(this.penalty, charge.penalty) &&
        Objects.equals(this.active, charge.active) &&
        Objects.equals(this.deleted, charge.deleted) &&
        Objects.equals(this.minCap, charge.minCap) &&
        Objects.equals(this.maxCap, charge.maxCap) &&
        Objects.equals(this.account, charge.account) &&
        Objects.equals(this.taxGroup, charge.taxGroup) &&
        Objects.equals(this.feeOnMonthDay, charge.feeOnMonthDay) &&
        Objects.equals(this.savingsCharge, charge.savingsCharge) &&
        Objects.equals(this.annualFee, charge.annualFee) &&
        Objects.equals(this.monthlyFee, charge.monthlyFee) &&
        Objects.equals(this.overdueInstallment, charge.overdueInstallment) &&
        Objects.equals(this.allowedLoanChargeTime, charge.allowedLoanChargeTime) &&
        Objects.equals(this.allowedClientChargeTime, charge.allowedClientChargeTime) &&
        Objects.equals(this.allowedSavingsChargeTime, charge.allowedSavingsChargeTime) &&
        Objects.equals(this.loanCharge, charge.loanCharge) &&
        Objects.equals(this.clientCharge, charge.clientCharge) &&
        Objects.equals(this.allowedSavingsChargeCalculationType, charge.allowedSavingsChargeCalculationType) &&
        Objects.equals(this.allowedClientChargeCalculationType, charge.allowedClientChargeCalculationType) &&
        Objects.equals(this.percentageOfApprovedAmount, charge.percentageOfApprovedAmount) &&
        Objects.equals(this.percentageOfDisbursementAmount, charge.percentageOfDisbursementAmount) &&
        Objects.equals(this.disbursementCharge, charge.disbursementCharge) &&
        Objects.equals(this._new, charge._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, amount, currencyCode, chargeTimeType, chargeCalculation, chargePaymentMode, feeInterval, penalty, active, deleted, minCap, maxCap, account, taxGroup, feeOnMonthDay, savingsCharge, annualFee, monthlyFee, overdueInstallment, allowedLoanChargeTime, allowedClientChargeTime, allowedSavingsChargeTime, loanCharge, clientCharge, allowedSavingsChargeCalculationType, allowedClientChargeCalculationType, percentageOfApprovedAmount, percentageOfDisbursementAmount, disbursementCharge, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    chargeCalculation: ").append(toIndentedString(chargeCalculation)).append("\n");
    sb.append("    chargePaymentMode: ").append(toIndentedString(chargePaymentMode)).append("\n");
    sb.append("    feeInterval: ").append(toIndentedString(feeInterval)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    minCap: ").append(toIndentedString(minCap)).append("\n");
    sb.append("    maxCap: ").append(toIndentedString(maxCap)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    taxGroup: ").append(toIndentedString(taxGroup)).append("\n");
    sb.append("    feeOnMonthDay: ").append(toIndentedString(feeOnMonthDay)).append("\n");
    sb.append("    savingsCharge: ").append(toIndentedString(savingsCharge)).append("\n");
    sb.append("    annualFee: ").append(toIndentedString(annualFee)).append("\n");
    sb.append("    monthlyFee: ").append(toIndentedString(monthlyFee)).append("\n");
    sb.append("    overdueInstallment: ").append(toIndentedString(overdueInstallment)).append("\n");
    sb.append("    allowedLoanChargeTime: ").append(toIndentedString(allowedLoanChargeTime)).append("\n");
    sb.append("    allowedClientChargeTime: ").append(toIndentedString(allowedClientChargeTime)).append("\n");
    sb.append("    allowedSavingsChargeTime: ").append(toIndentedString(allowedSavingsChargeTime)).append("\n");
    sb.append("    loanCharge: ").append(toIndentedString(loanCharge)).append("\n");
    sb.append("    clientCharge: ").append(toIndentedString(clientCharge)).append("\n");
    sb.append("    allowedSavingsChargeCalculationType: ").append(toIndentedString(allowedSavingsChargeCalculationType)).append("\n");
    sb.append("    allowedClientChargeCalculationType: ").append(toIndentedString(allowedClientChargeCalculationType)).append("\n");
    sb.append("    percentageOfApprovedAmount: ").append(toIndentedString(percentageOfApprovedAmount)).append("\n");
    sb.append("    percentageOfDisbursementAmount: ").append(toIndentedString(percentageOfDisbursementAmount)).append("\n");
    sb.append("    disbursementCharge: ").append(toIndentedString(disbursementCharge)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

