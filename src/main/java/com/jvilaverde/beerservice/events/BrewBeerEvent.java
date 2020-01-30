package com.jvilaverde.beerservice.events;

import com.jvilaverde.beerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent {
    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
