package hongbro.everytime.mapper;

import hongbro.everytime.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void signupUser(User user);
    List<User> findallUser();

}
