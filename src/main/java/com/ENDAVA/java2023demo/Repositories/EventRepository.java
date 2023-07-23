package com.ENDAVA.java2023demo.Repositories;
import com.ENDAVA.java2023demo.DTOS.EventDTO;
import com.ENDAVA.java2023demo.TableEntities.EVENT;
import com.ENDAVA.java2023demo.TableEntities.VENUE;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<EVENT,Integer> {
   // List<EVENT> findEventsByVenueIdAndEventType(int VenueID, String event_type_name);

}
