package com.ENDAVA.java2023demo.Repositories;
import com.ENDAVA.java2023demo.TableEntities.EVENT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EVENT,Integer> {
}
