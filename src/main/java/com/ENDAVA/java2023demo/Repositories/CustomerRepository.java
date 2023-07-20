package com.ENDAVA.java2023demo.Repositories;
import com.ENDAVA.java2023demo.TableEntities.CUSTOMER;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CUSTOMER, Integer> {
}
