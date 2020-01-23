package com.jvilaverde.beerservice.services;

import com.jvilaverde.beerservice.web.model.BeerDto;
import com.jvilaverde.beerservice.web.model.BeerPagedList;
import com.jvilaverde.beerservice.web.model.BeerStyle;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyle beerStyle, PageRequest pageRequest, Boolean showQuantityOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
