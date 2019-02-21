package sweater.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import sweater.example.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
