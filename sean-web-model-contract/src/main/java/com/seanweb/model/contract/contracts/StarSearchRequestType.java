package com.seanweb.model.contract.contracts;
import com.seanweb.model.contract.PagingRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class StarSearchRequestType implements PagingRequest {
    private Integer pageIndex;
    private Integer pageSize;
    private Boolean needTotal;

    private Integer starID;
}
