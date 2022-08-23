package pl.coderslab.servicepanel.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import pl.coderslab.servicepanel.dto.UserRegistrationDto;
import pl.coderslab.servicepanel.entity.UserEntity;

public interface UserService extends UserDetailsService {
    UserEntity save(UserRegistrationDto registrationDto);
}
