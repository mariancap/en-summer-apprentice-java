package com.ENDAVA.java2023demo.TableEntities;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="EVENT")
public class EVENT {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull
    @Column ( name = "EventID" )
    private long EventID;

    @NotNull
    @Column ( name = "venue_id" )
    private long venue_id;

    @NotNull
    @Column ( name = "event_type_id" )
    private long event_type_id;

    @NotNull
    @Column ( name = "event_description" )
    private String event_description;

    @NotNull
    @Column ( name = "event_name" )
    private String event_name;

    @NotNull
    @Column ( name = "data_start" )
    private Date data_start;

    @NotNull
    @Column ( name = "data_end" )
    private Date data_end;

    public EVENT(long eventID, long venue_id, long event_type_id, String event_description, String event_name, Date data_start, Date data_end) {
        EventID = eventID;
        this.venue_id = venue_id;
        this.event_type_id = event_type_id;
        this.event_description = event_description;
        this.event_name = event_name;
        this.data_start = data_start;
        this.data_end = data_end;
    }

    public EVENT() {

    }

    public long getEventID() {
        return EventID;
    }

    public long getVenue_id() {
        return venue_id;
    }


    public long getEvent_type_id() {
        return event_type_id;
    }

    public String getEvent_description() {
        return event_description;
    }

    public String getEvent_name() {
        return event_name;
    }

    public Date getData_start() {
        return data_start;
    }

    public Date getData_end() {
        return data_end;
    }

    public void setEventID(long eventID) {
        EventID = eventID;
    }

    public void setVenue_id(long venue_id) {
        this.venue_id = venue_id;
    }

    public void setEvent_type_id(long event_type_id) {
        this.event_type_id = event_type_id;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public void setData_start(Date data_start) {
        this.data_start = data_start;
    }

    public void setData_end(Date data_end) {
        this.data_end = data_end;
    }

    @ManyToOne
    @JoinColumn(name = "event_type_id", nullable = false)
    private EVENT_TYPE eventType;



}
