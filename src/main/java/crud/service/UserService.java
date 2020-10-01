package crud.service;

import crud.model.Role;
import crud.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(User user);
    List<User> listUsers();
    void update(User user);
    void delete(User user);
    User getById(Long id);

    void add(Role role);
    List<Role> listRoles();
    Role getRoleById(Long id);
}
