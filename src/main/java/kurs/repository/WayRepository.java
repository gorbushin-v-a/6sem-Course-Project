package kurs.repository;

import kurs.model.Way;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface WayRepository extends MongoRepository<Way, String> {
    Way findById(Long id);
    //Page<Way> findAllBy_id(PageRequest pageRequest);
    //Page<Way>
    //List<Way> findAllBy_idIn
}
