package com.ENDAVA.java2023demo.TableEntities;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="ORDERS")
public class ORDERS {

     @Id
     @GeneratedValue(strategy= GenerationType.IDENTITY)


     @Column ( name = "orderID" )
     private int orderID;


    @JoinColumn(name = "customer_id", nullable = false)
    @ManyToOne
    private CUSTOMER customer;


    @JoinColumn(name = "ticket_category_id", nullable = false)
    @ManyToOne
    private TICKET_CATEGORY ticket_category;


    @Column ( name = "ordered_at" )
    private Date ordered_at;


    @Column ( name = "number_of_tickets" )
    private int number_of_tickets;


    @Column ( name = "total_price" )
    private int total_price;

    public ORDERS() {

    }

    public ORDERS(int orderID, CUSTOMER customer, TICKET_CATEGORY ticket_category, Date ordered_at, int number_of_tickets, int total_price) {
        this.orderID = orderID;
        this.customer = customer;
        this.ticket_category = ticket_category;
        this.ordered_at = ordered_at;
        this.number_of_tickets = number_of_tickets;
        this.total_price = total_price;
    }

    public ORDERS(TICKET_CATEGORY ticket_category, CUSTOMER customer, int numberOfTickets, Date ordered_at, int total_price) {
        this.ticket_category=ticket_category;
        this.customer=customer;
        this.number_of_tickets=numberOfTickets;
        this.ordered_at=ordered_at;
        this.total_price=total_price;

    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public CUSTOMER getCustomer() {
        return customer;
    }

    public void setCustomer(CUSTOMER customer) {
        this.customer = customer;
    }

    public TICKET_CATEGORY getTicket_category() {
        return ticket_category;
    }

    public void setTicket_category(TICKET_CATEGORY ticket_category) {
        this.ticket_category = ticket_category;
    }

    public Date getOrdered_at() {
        return ordered_at;
    }

    public void setOrdered_at(Date ordered_at) {
        this.ordered_at = ordered_at;
    }

    public int getNumber_of_tickets() {
        return number_of_tickets;
    }

    public void setNumber_of_tickets(int number_of_tickets) {
        this.number_of_tickets = number_of_tickets;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
}

