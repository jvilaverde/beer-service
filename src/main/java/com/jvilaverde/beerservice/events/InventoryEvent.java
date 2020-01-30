package com.jvilaverde.beerservice.events;

import com.jvilaverde.beerservice.web.model.BeerDto;

public class InventoryEvent extends BeerEvent {
    public InventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
