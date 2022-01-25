package hongbro.everytime.service;

import hongbro.everytime.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    void SignUp(User user);
    boolean dupCheck(Map userInfo);
    boolean loginCheck(Map loginInfo);
    List<User> findallUser();
}
