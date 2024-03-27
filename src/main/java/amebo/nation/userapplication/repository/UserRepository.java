package amebo.nation.userapplication.repository;

import amebo.nation.userapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
