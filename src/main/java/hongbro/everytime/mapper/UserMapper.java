package hongbro.everytime.mapper;

import hongbro.everytime.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void signupUser(User user);

}
