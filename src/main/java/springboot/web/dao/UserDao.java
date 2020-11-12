package springboot.web.dao;

import springboot.web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    User getUserById(long id);

    List<User> listUsers();

    User findUserByUsername(String username);
}
