package com.ENDAVA.java2023demo.Interfaces;

import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;

import java.util.List;

public interface ICustomerService {

    List<CUSTOMER> getCustomers();
    void createCustomer(CUSTOMER customer);
    void updateCustomer(Integer id,CUSTOMER customer);
    //void deleteCustomer(CUSTOMER customer);





}
