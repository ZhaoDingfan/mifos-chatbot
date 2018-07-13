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
import io.swagger.client.model.Client;
import io.swagger.client.model.Group;
import io.swagger.client.model.GroupLevel;
import io.swagger.client.model.Office;
import io.swagger.client.model.Staff;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * Group
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-12T09:13:59.001Z")
public class Group {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("office")
  private Office office = null;

  @SerializedName("staff")
  private Staff staff = null;

  @SerializedName("parent")
  private Group parent = null;

  @SerializedName("groupLevel")
  private GroupLevel groupLevel = null;

  @SerializedName("clientMembers")
  private List<Client> clientMembers = null;

  @SerializedName("submittedOnDate")
  private LocalDate submittedOnDate = null;

  @SerializedName("accountNumberRequiresAutoGeneration")
  private Boolean accountNumberRequiresAutoGeneration = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("activeClientMembers")
  private List<Client> activeClientMembers = null;

  @SerializedName("childGroup")
  private Boolean childGroup = null;

  @SerializedName("notActive")
  private Boolean notActive = null;

  @SerializedName("pending")
  private Boolean pending = null;

  @SerializedName("transferInProgress")
  private Boolean transferInProgress = null;

  @SerializedName("transferOnHold")
  private Boolean transferOnHold = null;

  @SerializedName("group")
  private Boolean group = null;

  @SerializedName("center")
  private Boolean center = null;

  @SerializedName("transferInProgressOrOnHold")
  private Boolean transferInProgressOrOnHold = null;

  @SerializedName("notPending")
  private Boolean notPending = null;

  @SerializedName("activationLocalDate")
  private LocalDate activationLocalDate = null;

  @SerializedName("new")
  private Boolean _new = null;

  public Group id(Long id) {
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

  public Group office(Office office) {
    this.office = office;
    return this;
  }

   /**
   * Get office
   * @return office
  **/
  @ApiModelProperty(value = "")
  public Office getOffice() {
    return office;
  }

  public void setOffice(Office office) {
    this.office = office;
  }

  public Group staff(Staff staff) {
    this.staff = staff;
    return this;
  }

   /**
   * Get staff
   * @return staff
  **/
  @ApiModelProperty(value = "")
  public Staff getStaff() {
    return staff;
  }

  public void setStaff(Staff staff) {
    this.staff = staff;
  }

  public Group parent(Group parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public Group getParent() {
    return parent;
  }

  public void setParent(Group parent) {
    this.parent = parent;
  }

  public Group groupLevel(GroupLevel groupLevel) {
    this.groupLevel = groupLevel;
    return this;
  }

   /**
   * Get groupLevel
   * @return groupLevel
  **/
  @ApiModelProperty(value = "")
  public GroupLevel getGroupLevel() {
    return groupLevel;
  }

  public void setGroupLevel(GroupLevel groupLevel) {
    this.groupLevel = groupLevel;
  }

  public Group clientMembers(List<Client> clientMembers) {
    this.clientMembers = clientMembers;
    return this;
  }

  public Group addClientMembersItem(Client clientMembersItem) {
    if (this.clientMembers == null) {
      this.clientMembers = new ArrayList<Client>();
    }
    this.clientMembers.add(clientMembersItem);
    return this;
  }

   /**
   * Get clientMembers
   * @return clientMembers
  **/
  @ApiModelProperty(value = "")
  public List<Client> getClientMembers() {
    return clientMembers;
  }

  public void setClientMembers(List<Client> clientMembers) {
    this.clientMembers = clientMembers;
  }

  public Group submittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getSubmittedOnDate() {
    return submittedOnDate;
  }

  public void setSubmittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }

  public Group accountNumberRequiresAutoGeneration(Boolean accountNumberRequiresAutoGeneration) {
    this.accountNumberRequiresAutoGeneration = accountNumberRequiresAutoGeneration;
    return this;
  }

   /**
   * Get accountNumberRequiresAutoGeneration
   * @return accountNumberRequiresAutoGeneration
  **/
  @ApiModelProperty(value = "")
  public Boolean isAccountNumberRequiresAutoGeneration() {
    return accountNumberRequiresAutoGeneration;
  }

  public void setAccountNumberRequiresAutoGeneration(Boolean accountNumberRequiresAutoGeneration) {
    this.accountNumberRequiresAutoGeneration = accountNumberRequiresAutoGeneration;
  }

  public Group active(Boolean active) {
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

  public Group closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @ApiModelProperty(value = "")
  public Boolean isClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public Group activeClientMembers(List<Client> activeClientMembers) {
    this.activeClientMembers = activeClientMembers;
    return this;
  }

  public Group addActiveClientMembersItem(Client activeClientMembersItem) {
    if (this.activeClientMembers == null) {
      this.activeClientMembers = new ArrayList<Client>();
    }
    this.activeClientMembers.add(activeClientMembersItem);
    return this;
  }

   /**
   * Get activeClientMembers
   * @return activeClientMembers
  **/
  @ApiModelProperty(value = "")
  public List<Client> getActiveClientMembers() {
    return activeClientMembers;
  }

  public void setActiveClientMembers(List<Client> activeClientMembers) {
    this.activeClientMembers = activeClientMembers;
  }

  public Group childGroup(Boolean childGroup) {
    this.childGroup = childGroup;
    return this;
  }

   /**
   * Get childGroup
   * @return childGroup
  **/
  @ApiModelProperty(value = "")
  public Boolean isChildGroup() {
    return childGroup;
  }

  public void setChildGroup(Boolean childGroup) {
    this.childGroup = childGroup;
  }

  public Group notActive(Boolean notActive) {
    this.notActive = notActive;
    return this;
  }

   /**
   * Get notActive
   * @return notActive
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotActive() {
    return notActive;
  }

  public void setNotActive(Boolean notActive) {
    this.notActive = notActive;
  }

  public Group pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @ApiModelProperty(value = "")
  public Boolean isPending() {
    return pending;
  }

  public void setPending(Boolean pending) {
    this.pending = pending;
  }

  public Group transferInProgress(Boolean transferInProgress) {
    this.transferInProgress = transferInProgress;
    return this;
  }

   /**
   * Get transferInProgress
   * @return transferInProgress
  **/
  @ApiModelProperty(value = "")
  public Boolean isTransferInProgress() {
    return transferInProgress;
  }

  public void setTransferInProgress(Boolean transferInProgress) {
    this.transferInProgress = transferInProgress;
  }

  public Group transferOnHold(Boolean transferOnHold) {
    this.transferOnHold = transferOnHold;
    return this;
  }

   /**
   * Get transferOnHold
   * @return transferOnHold
  **/
  @ApiModelProperty(value = "")
  public Boolean isTransferOnHold() {
    return transferOnHold;
  }

  public void setTransferOnHold(Boolean transferOnHold) {
    this.transferOnHold = transferOnHold;
  }

  public Group group(Boolean group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public Boolean isGroup() {
    return group;
  }

  public void setGroup(Boolean group) {
    this.group = group;
  }

  public Group center(Boolean center) {
    this.center = center;
    return this;
  }

   /**
   * Get center
   * @return center
  **/
  @ApiModelProperty(value = "")
  public Boolean isCenter() {
    return center;
  }

  public void setCenter(Boolean center) {
    this.center = center;
  }

  public Group transferInProgressOrOnHold(Boolean transferInProgressOrOnHold) {
    this.transferInProgressOrOnHold = transferInProgressOrOnHold;
    return this;
  }

   /**
   * Get transferInProgressOrOnHold
   * @return transferInProgressOrOnHold
  **/
  @ApiModelProperty(value = "")
  public Boolean isTransferInProgressOrOnHold() {
    return transferInProgressOrOnHold;
  }

  public void setTransferInProgressOrOnHold(Boolean transferInProgressOrOnHold) {
    this.transferInProgressOrOnHold = transferInProgressOrOnHold;
  }

  public Group notPending(Boolean notPending) {
    this.notPending = notPending;
    return this;
  }

   /**
   * Get notPending
   * @return notPending
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotPending() {
    return notPending;
  }

  public void setNotPending(Boolean notPending) {
    this.notPending = notPending;
  }

  public Group activationLocalDate(LocalDate activationLocalDate) {
    this.activationLocalDate = activationLocalDate;
    return this;
  }

   /**
   * Get activationLocalDate
   * @return activationLocalDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getActivationLocalDate() {
    return activationLocalDate;
  }

  public void setActivationLocalDate(LocalDate activationLocalDate) {
    this.activationLocalDate = activationLocalDate;
  }

  public Group _new(Boolean _new) {
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
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.office, group.office) &&
        Objects.equals(this.staff, group.staff) &&
        Objects.equals(this.parent, group.parent) &&
        Objects.equals(this.groupLevel, group.groupLevel) &&
        Objects.equals(this.clientMembers, group.clientMembers) &&
        Objects.equals(this.submittedOnDate, group.submittedOnDate) &&
        Objects.equals(this.accountNumberRequiresAutoGeneration, group.accountNumberRequiresAutoGeneration) &&
        Objects.equals(this.active, group.active) &&
        Objects.equals(this.closed, group.closed) &&
        Objects.equals(this.activeClientMembers, group.activeClientMembers) &&
        Objects.equals(this.childGroup, group.childGroup) &&
        Objects.equals(this.notActive, group.notActive) &&
        Objects.equals(this.pending, group.pending) &&
        Objects.equals(this.transferInProgress, group.transferInProgress) &&
        Objects.equals(this.transferOnHold, group.transferOnHold) &&
        Objects.equals(this.group, group.group) &&
        Objects.equals(this.center, group.center) &&
        Objects.equals(this.transferInProgressOrOnHold, group.transferInProgressOrOnHold) &&
        Objects.equals(this.notPending, group.notPending) &&
        Objects.equals(this.activationLocalDate, group.activationLocalDate) &&
        Objects.equals(this._new, group._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, office, staff, parent, groupLevel, clientMembers, submittedOnDate, accountNumberRequiresAutoGeneration, active, closed, activeClientMembers, childGroup, notActive, pending, transferInProgress, transferOnHold, group, center, transferInProgressOrOnHold, notPending, activationLocalDate, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    groupLevel: ").append(toIndentedString(groupLevel)).append("\n");
    sb.append("    clientMembers: ").append(toIndentedString(clientMembers)).append("\n");
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    accountNumberRequiresAutoGeneration: ").append(toIndentedString(accountNumberRequiresAutoGeneration)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    activeClientMembers: ").append(toIndentedString(activeClientMembers)).append("\n");
    sb.append("    childGroup: ").append(toIndentedString(childGroup)).append("\n");
    sb.append("    notActive: ").append(toIndentedString(notActive)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    transferInProgress: ").append(toIndentedString(transferInProgress)).append("\n");
    sb.append("    transferOnHold: ").append(toIndentedString(transferOnHold)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    transferInProgressOrOnHold: ").append(toIndentedString(transferInProgressOrOnHold)).append("\n");
    sb.append("    notPending: ").append(toIndentedString(notPending)).append("\n");
    sb.append("    activationLocalDate: ").append(toIndentedString(activationLocalDate)).append("\n");
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
