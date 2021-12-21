package toyPackage.services.implementations;

import toyPackage.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toyPackage.repositories.UserRepository;
import toyPackage.services.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByUserNameAndPassWord(String userName, String passWord) {
        return userRepository.findByUserNameAndPassWord(userName,passWord);
    }
}
