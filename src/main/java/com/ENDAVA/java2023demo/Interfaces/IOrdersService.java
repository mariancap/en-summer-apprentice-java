package com.ENDAVA.java2023demo.Interfaces;

import com.ENDAVA.java2023demo.DTOS.NewOrderDTO;
import com.ENDAVA.java2023demo.DTOS.OrdersDTO;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;

import java.util.List;
import java.util.Optional;

public interface IOrdersService {

    List<OrdersDTO> getOrders();
    //void createOrders(Order order);
    Optional<ORDERS> createOrder(/*long customerID, */int eventID, int ticketCategoryID, int numberOfTickets);









}
