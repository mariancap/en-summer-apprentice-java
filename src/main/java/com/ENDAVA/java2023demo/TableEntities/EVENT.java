package com.ENDAVA.java2023demo.TableEntities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="EVENT")
public class EVENT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column ( name = "EventID" )
    private int EventID;

    @JoinColumn(name = "venue_id", nullable = false)
    @ManyToOne
    private VENUE venue;

    @JoinColumn(name = "event_type_id", nullable = false)
    @ManyToOne
    private EVENT_TYPE eventType;

    @Column ( name = "event_description" )
    private String event_description;

    @Column ( name = "event_name" )
    private String event_name;

    @Column ( name = "data_start" )
    private Date data_start;

    @Column ( name = "data_end" )
    private Date data_end;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference
    private List<TICKET_CATEGORY>ticket_categories;

    public EVENT(int eventID, VENUE venue, EVENT_TYPE eventType, String event_description, String event_name, Date data_start, Date data_end) {
        EventID = eventID;
        this.venue = venue;
        this.eventType = eventType;
        this.event_description = event_description;
        this.event_name = event_name;
        this.data_start = data_start;
        this.data_end = data_end;
        this.ticket_categories=new ArrayList<>();
    }

    public EVENT() {

    }

    public int getEventID() {
        return EventID;
    }

    public void setEventID(int eventID) {
        EventID = eventID;
    }

    public VENUE getVenue() {
        return venue;
    }

    public void setVenue(VENUE venue) {
        this.venue = venue;
    }

    public EVENT_TYPE getEventType() {
        return eventType;
    }

    public void setEventType(EVENT_TYPE eventType) {
        this.eventType = eventType;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public Date getData_start() {
        return data_start;
    }

    public void setData_start(Date data_start) {
        this.data_start = data_start;
    }

    public Date getData_end() {
        return data_end;
    }

    public void setData_end(Date data_end) {
        this.data_end = data_end;
    }

    public List<TICKET_CATEGORY> getTicket_categories() {
        return ticket_categories;
    }

    public void setTicket_categories(List<TICKET_CATEGORY> ticket_categories) {
        this.ticket_categories = ticket_categories;
    }
}
