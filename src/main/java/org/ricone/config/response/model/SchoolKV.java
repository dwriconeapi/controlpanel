package org.ricone.config.response.model;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "school_id", "value", "field"})
public class SchoolKV implements Serializable {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("school_id")
    private String schoolId;
    @JsonProperty("value")
    private String value;
    @JsonProperty("field")
    private String field;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7563589737211801882L;

    /**
     * No args constructor for use in serialization
     */
    public SchoolKV() {
    }

    /**
     * @param field
     * @param id
     * @param districtId
     * @param value
     */
    public SchoolKV(Integer id, String districtId, String value, String field) {
        super();
        this.id = id;
        this.schoolId = districtId;
        this.value = value;
        this.field = field;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("school_id")
    public String getSchoolId() {
        return schoolId;
    }

    @JsonProperty("school_id")
    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}