package com.ENDAVA.java2023demo.Repositories;

import com.ENDAVA.java2023demo.TableEntities.ORDERS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<ORDERS, Integer> {

}
