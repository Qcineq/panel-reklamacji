package pl.coderslab.servicepanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.servicepanel.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    RoleEntity findByName(String name);
}
