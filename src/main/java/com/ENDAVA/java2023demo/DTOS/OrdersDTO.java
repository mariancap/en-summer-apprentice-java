package com.ENDAVA.java2023demo.DTOS;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.Serializable;
import java.util.Date;

public record OrdersDTO(
        int eventID,
        Date timestamp,
        int ticketcategoryId,
        int numberOfTickets,
        int totalPrice) implements Serializable {


}