package pl.coderslab.servicepanel.service;

import org.springframework.stereotype.Service;
import pl.coderslab.servicepanel.entity.RoleEntity;
import pl.coderslab.servicepanel.repository.RoleRepository;

import java.util.List;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public RoleEntity findRoleByName(String name) {
        return roleRepository.findByName(name);
    }

    public List<RoleEntity> findAll() {
        return roleRepository.findAll();
    }
}
