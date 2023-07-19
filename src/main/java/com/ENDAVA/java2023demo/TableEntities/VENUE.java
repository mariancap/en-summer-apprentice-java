package com.ENDAVA.java2023demo.TableEntities;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.*;

import javax.naming.Name;

@Entity
@Table(name="VENUE")
public class VENUE {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @NotNull
    @Column ( name = "VenueID" )
    private long VenueID;

    @NotNull
    @Column ( name = "event_location" )
    private String event_location;

    @NotNull
    @Column ( name = "venue_type" )
    private String venue_type;

    @NotNull
    @Column ( name = "capacity" )
    private long capacity;

    public VENUE(long venueID, String event_location, String venue_type, long capacity) {
        VenueID = venueID;
        this.event_location = event_location;
        this.venue_type = venue_type;
        this.capacity = capacity;
    }

    public VENUE() {

    }

    public String getEvent_location() {
        return event_location;
    }

    public long getVenueID() {
        return VenueID;
    }

    public String getVenue_type() {
        return venue_type;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setVenueID(long venueID) {
        VenueID = venueID;
    }

    public void setEvent_location(String event_location) {
        this.event_location = event_location;
    }

    public void setVenue_type(String venue_type) {
        this.venue_type = venue_type;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
}
