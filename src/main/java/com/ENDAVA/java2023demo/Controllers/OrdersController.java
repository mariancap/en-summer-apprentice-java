package com.ENDAVA.java2023demo.Controllers;

import com.ENDAVA.java2023demo.DTOS.NewOrderDTO;
import com.ENDAVA.java2023demo.DTOS.OrdersDTO;
import com.ENDAVA.java2023demo.Servicies.OrdersService;
import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.aspectj.weaver.ast.Or;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "/orders")
public class OrdersController {

    private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<OrdersDTO> getOrders()
    {
        return ordersService.getOrders();
    }

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody NewOrderDTO orderDTO)
    {
        int EventID= orderDTO.eventID();
        int ticketCategoryID=orderDTO.ticketCategoryID();
        int numberofTIckets=orderDTO.numberOfTickets();


        Optional<ORDERS> ordersOptional=ordersService.createOrder(EventID,ticketCategoryID,numberofTIckets);
        if(ordersOptional.isEmpty())
        {
            Error error=new Error("ID not found");
            return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
        }
        else {
            ORDERS orders=ordersOptional.get();
            OrdersDTO ordersDTO=new OrdersDTO(
                    orders.getTicket_category().getEvent().getEventID(),
                    orders.getOrdered_at(),
                    orders.getTicket_category().getTicketCategoryID(),
                    orders.getNumber_of_tickets(),
                    orders.getTotal_price()
            );
            return new ResponseEntity<>(ordersDTO,HttpStatus.OK);
        }
    }



    }






