package com.ENDAVA.java2023demo.Controllers;

import com.ENDAVA.java2023demo.Servicies.OrdersService;
import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/orders")
public class OrdersController {

    private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<ORDERS>getOrders_details()
    {
        return ordersService.getOrders();
    }

    @PostMapping
    public void createOrder(@RequestBody ORDERS orders)
    {
        ordersService.createOrders(orders);
    }
}
