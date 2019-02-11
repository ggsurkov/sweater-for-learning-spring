package sweater.example.repos;

import org.springframework.data.repository.CrudRepository;
import sweater.example.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Integer> {

}
