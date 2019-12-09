package com.jvilaverde.beerservice.mappers;

import com.jvilaverde.beerservice.domain.Beer;
import com.jvilaverde.beerservice.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
