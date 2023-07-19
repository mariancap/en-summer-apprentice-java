package com.ENDAVA.java2023demo.TableEntities;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.*;

@Entity
@Table(name="TICKET_CATEGORY")
public class TICKET_CATEGORY {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @NotNull
    @Column ( name = "TicketCategoryID" )
    private long TicketCategoryID;

    @NotNull
    @Column ( name = "event_id" )
    private long event_id;

    @NotNull
    @Column ( name = "ticket_description" )
    private String ticket_description;

    @NotNull
    @Column ( name = "price" )
    private long price;

    public TICKET_CATEGORY(long ticketCategoryID, long event_id, String ticket_description, long price) {
        this.TicketCategoryID=TicketCategoryID;
        this.event_id = event_id;
        this.ticket_description = ticket_description;
        this.price = price;
    }

    public TICKET_CATEGORY() {

    }

    public long getEventID() {
        return TicketCategoryID;
    }

    public long getEvent_id() {
        return event_id;
    }

    public String getTicket_description() {
        return ticket_description;
    }

    public long getPrice() {
        return price;
    }


    public void setEventID(long eventID) {
        TicketCategoryID = eventID;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

    public void setTicket_description(String ticket_description) {
        this.ticket_description = ticket_description;
    }

    public void setPrice(long price) {
        this.price = price;
    }




}
