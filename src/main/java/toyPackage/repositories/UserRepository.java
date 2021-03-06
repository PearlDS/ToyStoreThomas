package toyPackage.repositories;

import toyPackage.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserNameAndPassWord(String userName, String passWord);

}
