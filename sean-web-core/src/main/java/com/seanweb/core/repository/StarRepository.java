package com.seanweb.core.repository;


import com.seanweb.model.dto.StarsDto;
import com.seanweb.model.params.QueryStarsParam;

import java.util.List;

public interface StarRepository extends RepositoryProvider {

    List<StarsDto> starSearch(QueryStarsParam dto);
}
