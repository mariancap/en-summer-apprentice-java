package com.ENDAVA.java2023demo.Repositories;
import com.ENDAVA.java2023demo.DTOS.EventDTO;
import com.ENDAVA.java2023demo.TableEntities.EVENT;
import com.ENDAVA.java2023demo.TableEntities.EVENT_TYPE;
import com.ENDAVA.java2023demo.TableEntities.VENUE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<EVENT, Integer> {


    @Query("select e from EVENT e where e.venue.venueID=:venueId AND e.eventType.event_type_name=:typeName")
    List<EVENT> searchByVenueAndType(@Param("venueId") int venueId,@Param("typeName") String typeName);

}
