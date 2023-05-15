package com.seanweb.core.repository.mongo;

import com.seanweb.core.repository.StarRepository;
import com.seanweb.model.dto.StarsDto;
import com.seanweb.model.params.QueryStarsParam;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StarRepositoryImpl implements StarRepository {
    @Override
    public List<StarsDto> starSearch(QueryStarsParam param) {
        return null;
    }
}
