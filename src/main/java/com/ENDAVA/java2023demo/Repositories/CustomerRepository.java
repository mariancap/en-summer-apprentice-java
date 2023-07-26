package com.ENDAVA.java2023demo.Repositories;
import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CUSTOMER, Integer> {

   CUSTOMER searchByCustomerID(int customerID);


}
