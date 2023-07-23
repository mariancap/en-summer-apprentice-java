package com.ENDAVA.java2023demo.DTOS;

import com.ENDAVA.java2023demo.TableEntities.VENUE;

import java.util.function.Function;

public class VenutDTOMapper implements Function<VENUE,VenueDTO> {
    @Override
    public VenueDTO apply(VENUE venue) {
        return new VenueDTO(
                venue.getVenueID(),
        venue.getVenue_type(),
        venue.getEvent_location(),
        venue.getCapacity());
    }
}
