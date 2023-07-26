package com.ENDAVA.java2023demo.Repositories;

import com.ENDAVA.java2023demo.TableEntities.TICKET_CATEGORY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TICKET_CATEGORY,Integer> {

    TICKET_CATEGORY findTICKET_CATEGORYByTicketCategoryID(int ticketcategoryId);

}
