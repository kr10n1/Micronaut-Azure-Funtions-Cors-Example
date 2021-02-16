package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/**
 * Tenant
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2021-02-16T09:39:11.766Z[GMT]")
public class Tenant   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("dataParam")
  private String dataParam = null;

  public Tenant id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @Schema(example = "1", description = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Tenant label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @Schema(example = "Tenant 1", description = "")

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Tenant dataParam(String dataParam) {
    this.dataParam = dataParam;
    return this;
  }

  /**
   * Get dataParam
   * @return dataParam
  **/
  @Schema(description = "")

  public String getDataParam() {
    return dataParam;
  }

  public void setDataParam(String dataParam) {
    this.dataParam = dataParam;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenant tenant = (Tenant) o;
    return Objects.equals(this.id, tenant.id) &&
        Objects.equals(this.label, tenant.label) &&
        Objects.equals(this.dataParam, tenant.dataParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, dataParam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenant {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    dataParam: ").append(toIndentedString(dataParam)).append("\n");
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
