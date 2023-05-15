package com.seanweb.core.business;
import com.seanweb.core.repository.StarRepository;
import com.seanweb.model.contract.contracts.StarSearchRequestType;
import com.seanweb.model.contract.contracts.common.StarsType;
import com.seanweb.model.dto.StarsDto;
import com.seanweb.model.mapper.StarMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StarService {
    @Resource
    private StarRepository starRepository;

    public List<StarsType> StarSearch(StarSearchRequestType request){
        List<StarsDto> dtos = starRepository.starSearch(StarMapper.INSTANCE.fromRequest(request));
        return dtos.stream().map(StarMapper.INSTANCE::contractFromDto).collect(Collectors.toList());
    }

}
