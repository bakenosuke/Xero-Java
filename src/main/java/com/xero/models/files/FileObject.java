/*
 * Xero Files API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.files;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.files.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * FileObject
 */

public class FileObject {
  
  @JsonProperty("Name")
  private String name = null;

  
  @JsonProperty("MimeType")
  private String mimeType = null;

  
  @JsonProperty("Size")
  private Integer size = null;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("CreatedDateUTC")
  private OffsetDateTime createdDateUTC = null;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("UpdatedDateUTC")
  private OffsetDateTime updatedDateUTC = null;

  
  @JsonProperty("User")
  private User user = null;

  
  @JsonProperty("Id")
  private UUID id = null;

  
  @JsonProperty("FolderId")
  private UUID folderId = null;

  public FileObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * TODO
   * @return name
  **/
  @ApiModelProperty(example = "File2.jpg", value = "TODO")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileObject mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * TODO
   * @return mimeType
  **/
  @ApiModelProperty(example = "image/jpeg", value = "TODO")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public FileObject size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * TODO
   * @return size
  **/
  @ApiModelProperty(example = "3615", value = "TODO")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public FileObject createdDateUTC(OffsetDateTime createdDateUTC) {
    this.createdDateUTC = createdDateUTC;
    return this;
  }

   /**
   * TODO
   * @return createdDateUTC
  **/
  @ApiModelProperty(value = "TODO")
  public OffsetDateTime getCreatedDateUTC() {
    return createdDateUTC;
  }

  public void setCreatedDateUTC(OffsetDateTime createdDateUTC) {
    this.createdDateUTC = createdDateUTC;
  }

  public FileObject updatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * TODO
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "TODO")
  public OffsetDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public FileObject user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public FileObject id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * TODO
   * @return id
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", value = "TODO")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public FileObject folderId(UUID folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * TODO
   * @return folderId
  **/
  @ApiModelProperty(example = "0f8ccf21-7267-4268-9167-a1e2c40c84c8", value = "TODO")
  public UUID getFolderId() {
    return folderId;
  }

  public void setFolderId(UUID folderId) {
    this.folderId = folderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileObject fileObject = (FileObject) o;
    return Objects.equals(this.name, fileObject.name) &&
        Objects.equals(this.mimeType, fileObject.mimeType) &&
        Objects.equals(this.size, fileObject.size) &&
        Objects.equals(this.createdDateUTC, fileObject.createdDateUTC) &&
        Objects.equals(this.updatedDateUTC, fileObject.updatedDateUTC) &&
        Objects.equals(this.user, fileObject.user) &&
        Objects.equals(this.id, fileObject.id) &&
        Objects.equals(this.folderId, fileObject.folderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mimeType, size, createdDateUTC, updatedDateUTC, user, id, folderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileObject {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
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

