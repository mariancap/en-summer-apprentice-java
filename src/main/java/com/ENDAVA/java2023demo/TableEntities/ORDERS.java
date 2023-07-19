package com.ENDAVA.java2023demo.TableEntities;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="ORDERS")
public class ORDERS {

     @Id
     @GeneratedValue(strategy= GenerationType.AUTO)

     @NotNull
     @Column ( name = "orderID" )
     private long orderID;

    @NotNull
    @Column ( name = "customer_id" )
    private long customer_id;

    @NotNull
    @Column ( name = "ticket_category_id" )
    private long ticket_category_id;

    @NotNull
    @Column ( name = "ordered_at" )
    private String ordered_at;

    @NotNull
    @Column ( name = "number_of_tickets" )
    private long number_of_tickets;

    @NotNull
    @Column ( name = "total_price" )
    private long total_price;

    public ORDERS() {

    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public long getTicket_category_id() {
        return ticket_category_id;
    }

    public void setTicket_category_id(long ticket_category_id) {
        this.ticket_category_id = ticket_category_id;
    }

    public String getOrdered_at() {
        return ordered_at;
    }

    public void setOrdered_at(String ordered_at) {
        this.ordered_at = ordered_at;
    }

    public long getNumber_of_tickets() {
        return number_of_tickets;
    }

    public void setNumber_of_tickets(long number_of_tickets) {
        this.number_of_tickets = number_of_tickets;
    }

    public long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(long total_price) {
        this.total_price = total_price;
    }

    public ORDERS(long orderID, long customer_id, long ticket_category_id, String ordered_at, long number_of_tickets, long total_price) {
        this.orderID = orderID;
        this.customer_id = customer_id;
        this.ticket_category_id = ticket_category_id;
        this.ordered_at = ordered_at;
        this.number_of_tickets = number_of_tickets;
        this.total_price = total_price;



    }


}

