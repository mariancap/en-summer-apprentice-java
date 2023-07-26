package com.ENDAVA.java2023demo.TableEntities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.*;

@Entity
@Table(name="TICKET_CATEGORY")
public class TICKET_CATEGORY {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    @Column ( name = "TicketCategoryID" )
    private int ticketCategoryID;


    @JoinColumn(name = "event_id", nullable = false)
    @ManyToOne
    @JsonBackReference
    private EVENT event;


    @Column ( name = "ticket_description" )
    private String ticket_description;


    @Column ( name = "price" )
    private int price;

    public TICKET_CATEGORY(int ticketCategoryID, EVENT event, String ticket_description, int price) {
        ticketCategoryID = ticketCategoryID;
        this.event = event;
        this.ticket_description = ticket_description;
        this.price = price;
    }

    public TICKET_CATEGORY() {

    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        ticketCategoryID = ticketCategoryID;
    }

    public EVENT getEvent() {
        return event;
    }

    public void setEvent(EVENT event) {
        this.event = event;
    }

    public String getTicket_description() {
        return ticket_description;
    }

    public void setTicket_description(String ticket_description) {
        this.ticket_description = ticket_description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
