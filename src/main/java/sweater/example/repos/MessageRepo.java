package sweater.example.repos;

import org.springframework.data.repository.CrudRepository;
import sweater.example.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {


    List<Message> findByTag(String tag);
}
