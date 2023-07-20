package com.ENDAVA.java2023demo.Repositories;

import com.ENDAVA.java2023demo.TableEntities.EVENT_TYPE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepository extends JpaRepository<EVENT_TYPE,Integer> {
}
