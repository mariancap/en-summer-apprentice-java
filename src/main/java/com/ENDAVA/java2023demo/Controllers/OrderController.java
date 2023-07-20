package com.ENDAVA.java2023demo.Controllers;


import com.ENDAVA.java2023demo.Servicies.CustomerService;
import com.ENDAVA.java2023demo.Servicies.OrderService;
import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/orders")
public class OrderController {


    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping
    public List<ORDERS> getOrders() {
        return orderService.getOrders();
    }

    @PostMapping
    public void createOrders(@RequestBody ORDERS orders) {
        orderService.createOrders(orders);
    }

}