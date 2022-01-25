package hongbro.everytime.serviceImpl;

import hongbro.everytime.domain.User;
import hongbro.everytime.mapper.UserMapper;
import hongbro.everytime.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void SignUp(User user) {
        userMapper.signupUser(user);
    }

    @Override
    public boolean dupCheck(Map userInfo) {
        String userID = userInfo.get("userID").toString();
        if(userMapper.idCheck(userID) == 0) {
            System.out.println("This Id is not duplicated");
            return false;
        }
        else {
            System.out.println("This Id is duplicated");
            return true;
        }
    }

    @Override
    public boolean loginCheck(Map loginInfo) {

        return false;
    }

    @Override
    public List<User> findallUser() {
        return userMapper.findallUser();
    }
}
