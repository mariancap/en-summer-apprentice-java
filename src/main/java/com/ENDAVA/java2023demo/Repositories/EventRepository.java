package com.ENDAVA.java2023demo.Repositories;
import com.ENDAVA.java2023demo.DTOS.EventDTO;
import com.ENDAVA.java2023demo.TableEntities.EVENT;
import com.ENDAVA.java2023demo.TableEntities.VENUE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<EVENT, Integer> {

}
