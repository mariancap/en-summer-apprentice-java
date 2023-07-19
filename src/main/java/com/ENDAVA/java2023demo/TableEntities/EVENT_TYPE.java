package com.ENDAVA.java2023demo.TableEntities;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.*;

@Entity
@Table(name="EVENT_TYPE")
public class EVENT_TYPE {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @NotNull
    @Column ( name = "EventTypeID" )
    private long EventTypeID;

    @NotNull
    @Column (unique = true, name = "event_type_name" )
    private String event_type_name;

    public EVENT_TYPE(long event_TypeID, String event_Type_Name) {
        EventTypeID = event_TypeID;
        event_type_name = event_Type_Name;
    }

    public EVENT_TYPE() {

    }

    public long getEvent_TypeID() {
        return EventTypeID;
    }

    public String getEvent_Type_Name() {
        return event_type_name;
    }

    public void setEvent_TypeID(long event_TypeID) {
        EventTypeID = event_TypeID;
    }

    public void setEvent_Type_Name(String event_Type_Name) {
        event_type_name = event_Type_Name;
    }
}
