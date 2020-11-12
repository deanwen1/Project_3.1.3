package springboot.web.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import springboot.web.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    User getUserById(long id);

    List<User> listUsers();
}
