package com.ENDAVA.java2023demo.Repositories;

import com.ENDAVA.java2023demo.TableEntities.TICKET_CATEGORY;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TICKET_CATEGORY,Integer> {
}
