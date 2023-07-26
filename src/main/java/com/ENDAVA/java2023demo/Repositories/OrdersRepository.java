package com.ENDAVA.java2023demo.Repositories;

import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface OrdersRepository extends JpaRepository<ORDERS, UUID> {

    List<ORDERS> searchByCustomer(CUSTOMER customer);

    List<ORDERS> findORDERSByCustomer_CustomerID(Integer customer_id);

}
