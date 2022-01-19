package hongbro.everytime.service;

import hongbro.everytime.domain.User;

import java.util.List;

public interface UserService {

    void SignUp(User user);
    List<User> findallUser();
}
