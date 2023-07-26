package com.ENDAVA.java2023demo.Servicies;

import com.ENDAVA.java2023demo.Interfaces.ITicketCategoryService;
import com.ENDAVA.java2023demo.Repositories.TicketCategoryRepository;
import com.ENDAVA.java2023demo.TableEntities.TICKET_CATEGORY;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TicketCategoryService implements ITicketCategoryService {


//   private final  TicketCategoryRepository ticketCategoryRepository;
//
//
//    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository) {
//        this.ticketCategoryRepository = ticketCategoryRepository;
//    }


//    @Override
//    public TICKET_CATEGORY findTicketCategoryById(int ticketcategoryid) {
//        Optional<TICKET_CATEGORY> ticket_category=ticketCategoryRepository.searchByTicketCategoryID(ticketcategoryid);
//
//        if (ticket_category.isPresent()) {
//            return ticket_category.get();
//        }
//
//        return null;
//    }
}
