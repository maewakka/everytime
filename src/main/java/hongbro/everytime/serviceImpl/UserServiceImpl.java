package hongbro.everytime.serviceImpl;

import hongbro.everytime.domain.User;
import hongbro.everytime.mapper.UserMapper;
import hongbro.everytime.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void SignUp(User user) {
        userMapper.signupUser(user);
    }

    @Override
    public List<User> findallUser() {
        return userMapper.findallUser();
    }
}
