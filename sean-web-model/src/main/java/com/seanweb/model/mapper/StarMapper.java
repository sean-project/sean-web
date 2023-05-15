package com.seanweb.model.mapper;
import com.seanweb.model.contract.contracts.StarSearchRequestType;
import com.seanweb.model.contract.contracts.common.StarsType;
//import com.seanweb.model.dao.mongodb.entity.StarCollection;
import com.seanweb.model.dto.StarsDto;
import com.seanweb.model.params.QueryStarsParam;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StarMapper {
    StarMapper INSTANCE = Mappers.getMapper(StarMapper.class);
//    StarCollection daoFromDto(String dto);
//    StarsDto dtoFromDao(StarCollection dao);

    QueryStarsParam fromRequest(StarSearchRequestType request);
    StarsType contractFromDto(StarsDto dto);
}
