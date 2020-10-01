package crud.repository;

import crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT user from User user where user.username = :name")
    User findByUsername(@Param("name") String username);
}
