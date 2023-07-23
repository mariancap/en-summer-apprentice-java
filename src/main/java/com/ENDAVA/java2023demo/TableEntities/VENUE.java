package com.ENDAVA.java2023demo.TableEntities;
import com.ENDAVA.java2023demo.DTOS.VenueDTO;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.*;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="VENUE")
public class VENUE {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    @Column ( name = "VenueID" )
    private int VenueID;


    @Column ( name = "event_location" )
    private String event_location;


    @Column ( name = "venue_type" )
    private String venue_type;


    @Column ( name = "capacity" )
    private int capacity;

    public List<EVENT> getEvents() {
        return events;
    }

    public void setEvents(List<EVENT> events) {
        this.events = events;
    }

    @OneToMany(mappedBy = "venue", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference
    private List<EVENT> events;

    public VENUE(int venueID, String event_location, String venue_type, int capacity) {
        VenueID = venueID;
        this.event_location = event_location;
        this.venue_type = venue_type;
        this.capacity = capacity;
        this.events=new ArrayList<>();
    }

    public VENUE() {

    }

    public String getEvent_location() {
        return event_location;
    }

    public int getVenueID() {
        return VenueID;
    }

    public String getVenue_type() {
        return venue_type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setVenueID(int venueID) {
        VenueID = venueID;
    }

    public void setEvent_location(String event_location) {
        this.event_location = event_location;
    }

    public void setVenue_type(String venue_type) {
        this.venue_type = venue_type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public VenueDTO toVenueDTO(){
        return new VenueDTO(VenueID,venue_type,event_location,capacity);
    }
}
