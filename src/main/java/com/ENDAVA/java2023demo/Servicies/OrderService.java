package com.ENDAVA.java2023demo.Servicies;

import com.ENDAVA.java2023demo.Interfaces.IOrderService;
import com.ENDAVA.java2023demo.Repositories.OrderRepository;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }



    @Override
    public List<ORDERS> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void createOrders(ORDERS orders) {
        orderRepository.save(orders);
    }
}
