package hongbro.everytime.Login.serviceImpl;

import hongbro.everytime.Login.domain.User;
import hongbro.everytime.Login.mapper.UserMapper;
import hongbro.everytime.Login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void SignUp(User user) {
        userMapper.signupUser(user);
    }
}
