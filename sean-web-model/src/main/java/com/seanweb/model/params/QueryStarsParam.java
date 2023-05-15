package com.seanweb.model.params;

import lombok.Data;

import java.util.Map;

@Data
public class QueryStarsParam {
    private Integer pageSize;

    private String previousId;
    private String level;
    private Long startTime;
    private Long endTime;
    private Map<String, String> tags;
}
