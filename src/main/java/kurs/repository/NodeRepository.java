package kurs.repository;

import kurs.model.Node;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Set;

public interface NodeRepository extends MongoRepository<Node, String>{
    Node findById(Long id);
    //List<Node> findAllByIdIn(Set<Long> ids);
}
