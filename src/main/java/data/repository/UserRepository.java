package data.repository;

import com.scps.data.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUserLogin(String userLogin);
}
