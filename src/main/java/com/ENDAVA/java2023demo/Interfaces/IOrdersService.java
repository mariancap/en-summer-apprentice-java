package com.ENDAVA.java2023demo.Interfaces;

import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;

import java.util.List;

public interface IOrdersService {
    List<ORDERS> getOrders();
    void createOrders(ORDERS orders);



}
