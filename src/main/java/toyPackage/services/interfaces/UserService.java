package toyPackage.services.interfaces;

import toyPackage.data.User;

public interface UserService {

    User getUserByUserNameAndPassWord( String userName, String passWord);

}
