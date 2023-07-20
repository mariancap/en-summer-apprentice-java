package com.ENDAVA.java2023demo.Controllers;


import com.ENDAVA.java2023demo.Repositories.CustomerRepository;
import com.ENDAVA.java2023demo.Servicies.CustomerService;
import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/customer")
public class CustomerController {


     private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    public List<CUSTOMER>getCustomer_name()
    {
        return customerService.getCustomers();
    }

    @PostMapping
    public void createCustomer(@RequestBody CUSTOMER customer){
        customerService.createCustomer(customer);
    }

//    @PutMapping(path="{id}")
//    public void updateCustomer(@PathVariable int id,@RequestBody CUSTOMER customer)
//    {
//        customerService.updateCustomer(id,customer);
//    }

}
