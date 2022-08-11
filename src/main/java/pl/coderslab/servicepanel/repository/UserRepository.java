package pl.coderslab.servicepanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.servicepanel.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

}
