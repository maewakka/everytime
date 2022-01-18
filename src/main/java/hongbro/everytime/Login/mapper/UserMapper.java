package hongbro.everytime.Login.mapper;

import hongbro.everytime.Login.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void signupUser(User user);

}
