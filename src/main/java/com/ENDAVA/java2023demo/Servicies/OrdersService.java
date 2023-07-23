package com.ENDAVA.java2023demo.Servicies;

import com.ENDAVA.java2023demo.DTOS.OrdersDTO;
import com.ENDAVA.java2023demo.DTOS.OrdersDTOMapper;
import com.ENDAVA.java2023demo.Interfaces.IOrdersService;
import com.ENDAVA.java2023demo.Repositories.OrdersRepository;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersService implements IOrdersService {

    private final OrdersRepository ordersRepository;
    private final OrdersDTOMapper ordersDTOMapper;
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
        ordersDTOMapper = new OrdersDTOMapper();
    }



    @Override
    public List<OrdersDTO> getOrders() {
        return ordersRepository.findAll()
                .stream().map(ordersDTOMapper).collect(Collectors.toList());
    }

    @Override
    public void createOrders(ORDERS orders) {
        ordersRepository.save(orders);
    }


}
