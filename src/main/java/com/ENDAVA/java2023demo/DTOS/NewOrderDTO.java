package com.ENDAVA.java2023demo.DTOS;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record NewOrderDTO(int customerID,
                          int eventID,
                          int ticketCategoryID,
                          int numberOfTickets) implements Serializable {

}
