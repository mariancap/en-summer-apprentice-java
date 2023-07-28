package com.ENDAVA.java2023demo.Servicies;

import com.ENDAVA.java2023demo.DTOS.OrdersDTO;
import com.ENDAVA.java2023demo.Interfaces.IOrdersService;
import com.ENDAVA.java2023demo.Repositories.CustomerRepository;
import com.ENDAVA.java2023demo.Repositories.OrdersRepository;
import com.ENDAVA.java2023demo.Repositories.TicketCategoryRepository;
import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import com.ENDAVA.java2023demo.TableEntities.TICKET_CATEGORY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class OrdersService implements IOrdersService {

    private final OrdersRepository ordersRepository;

    private final CustomerService customerService;
    private final CustomerRepository customerRepository;

    private final TicketCategoryService ticketCategoryService;

    private final TicketCategoryRepository ticketCategoryRepository;








    public OrdersService(OrdersRepository ordersRepository, CustomerService customerService, CustomerRepository customerRepository, TicketCategoryService ticketCategoryService, TicketCategoryRepository ticketCategoryRepository) {
        this.ordersRepository = ordersRepository;
        this.customerService = customerService;
        this.customerRepository = customerRepository;
        this.ticketCategoryService = ticketCategoryService;
        this.ticketCategoryRepository = ticketCategoryRepository;


    }

    @Override
    public List<OrdersDTO> getOrders() {
        int customerId = 1;
        List<ORDERS> orders = ordersRepository.findORDERSByOrderID(customerId);

        return orders.stream().map(order -> new OrdersDTO(
                order.getTicket_category().getEvent().getEventID(),
                order.getOrdered_at(),
                order.getTicket_category().getTicketCategoryID(),
                order.getNumber_of_tickets(),
                order.getTotal_price()
        )).collect(Collectors.toList());
    }

    @Override
    public Optional<ORDERS> createOrder(int eventID, int ticketCategoryID, int numberOfTickets) {
        CUSTOMER customer=customerRepository.searchByCustomerID(1);
        TICKET_CATEGORY ticket_category=ticketCategoryRepository.findTICKET_CATEGORYByTicketCategoryID(ticketCategoryID);
        LocalDateTime now=LocalDateTime.now();
        Timestamp timestamp=Timestamp.valueOf(now);
        Date date=new Date(timestamp.getTime());
        if(customer==null || ticket_category==null)
        {
            return Optional.empty();
        }

        ORDERS orders =new ORDERS(ticket_category,
                                    customer,
                                    numberOfTickets,
                                    date ,
                            numberOfTickets*ticket_category.getPrice());
        return Optional.of(ordersRepository.save(orders));

    }


}
