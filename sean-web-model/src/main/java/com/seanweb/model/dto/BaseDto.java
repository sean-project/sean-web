package com.seanweb.model.dto;

import lombok.Data;


@Data
public class BaseDto {
    private String id;
    private Long dataChangeCreateTime;
    private Long dataChangeUpdateTime;
}
