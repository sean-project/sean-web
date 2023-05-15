package com.seanweb.model.contract.contracts;

import com.seanweb.model.contract.contracts.common.StarsType;
import lombok.Data;

import java.util.List;

@Data
public class StarSearchResponseType {
    private List<StarsType> stars;
}
