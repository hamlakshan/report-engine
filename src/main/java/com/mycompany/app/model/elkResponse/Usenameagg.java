
package com.mycompany.app.model.elkResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "doc_count_error_upper_bound",
    "sum_other_doc_count",
    "buckets"
})
public class Usenameagg {

    @JsonProperty("doc_count_error_upper_bound")
    private Integer docCountErrorUpperBound;
    @JsonProperty("sum_other_doc_count")
    private Integer sumOtherDocCount;
    @JsonProperty("buckets")
    private List<SPBucket> buckets = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("doc_count_error_upper_bound")
    public Integer getDocCountErrorUpperBound() {
        return docCountErrorUpperBound;
    }

    @JsonProperty("doc_count_error_upper_bound")
    public void setDocCountErrorUpperBound(Integer docCountErrorUpperBound) {
        this.docCountErrorUpperBound = docCountErrorUpperBound;
    }

    @JsonProperty("sum_other_doc_count")
    public Integer getSumOtherDocCount() {
        return sumOtherDocCount;
    }

    @JsonProperty("sum_other_doc_count")
    public void setSumOtherDocCount(Integer sumOtherDocCount) {
        this.sumOtherDocCount = sumOtherDocCount;
    }

    @JsonProperty("buckets")
    public List<SPBucket> getBuckets() {
        return buckets;
    }

    @JsonProperty("buckets")
    public void setBuckets(List<SPBucket> buckets) {
        this.buckets = buckets;
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
