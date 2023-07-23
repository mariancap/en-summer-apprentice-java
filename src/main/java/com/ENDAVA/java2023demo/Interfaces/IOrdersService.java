package com.ENDAVA.java2023demo.Interfaces;

import com.ENDAVA.java2023demo.DTOS.OrdersDTO;
import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;

import java.util.List;

public interface IOrdersService {
    List<OrdersDTO> getOrders();
    void createOrders(ORDERS orders);



}
