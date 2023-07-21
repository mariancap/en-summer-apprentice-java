package com.ENDAVA.java2023demo.Servicies;

import com.ENDAVA.java2023demo.Interfaces.IOrdersService;
import com.ENDAVA.java2023demo.Repositories.OrdersRepository;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrdersService {

    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }



    @Override
    public List<ORDERS> getOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public void createOrders(ORDERS orders) {
        ordersRepository.save(orders);
    }


}
