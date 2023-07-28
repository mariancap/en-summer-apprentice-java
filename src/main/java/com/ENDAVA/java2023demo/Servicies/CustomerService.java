package com.ENDAVA.java2023demo.Servicies;

import com.ENDAVA.java2023demo.Interfaces.ICustomerService;
import com.ENDAVA.java2023demo.Repositories.CustomerRepository;
import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CUSTOMER> getCustomers()
    {
        return customerRepository.findAll();
    }

    @Override
    public void createCustomer(CUSTOMER customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Integer id, CUSTOMER customer) {
        CUSTOMER customerToUpdate=customerRepository.findById(id).orElseThrow(
                ()-> new IllegalStateException(String.format("Customer with ID %s doesn't exist",id))) ;
        customerToUpdate.setCustomer_name(customer.getCustomer_name());
        customerToUpdate.setEmail(customer.getEmail());

        customerRepository.save(customerToUpdate);
    }




}
