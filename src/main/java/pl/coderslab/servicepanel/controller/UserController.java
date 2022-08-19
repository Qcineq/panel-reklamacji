package pl.coderslab.servicepanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.servicepanel.entity.RoleEntity;
import pl.coderslab.servicepanel.entity.UserEntity;
import pl.coderslab.servicepanel.service.RoleService;
import pl.coderslab.servicepanel.service.UserService;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;

@Controller
class UserController {

    private final RoleService roleService;
    private final UserService userService;

    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @ModelAttribute("roles")
    Collection<RoleEntity> findAllRoles() {
        return roleService.findAll();
    }

    @GetMapping(path = "/user/add")
    String showAddUserForm(Model model) {

        UserEntity userEntity = new UserEntity();
        model.addAttribute("user", userEntity);

        return "user/add";
    }

    @PostMapping(path = "/user/add")
    String processAddUserForm(@Valid UserEntity userEntity, BindingResult result) {

        if (result.hasErrors()) {
            return "user/add";
        }

        userService.save(userEntity);

        return "redirect:/user/list";
    }

    @GetMapping(path = "/user/list")
    String showUserList(Model model) {

        List<UserEntity> users = userService.findAll();
        model.addAttribute("users", users);

        return "user/list";
    }

    @GetMapping(path = "/user/edit")
    String showEditUserForm(@RequestParam("id") String email, Model model) {

        UserEntity userEntity = userService.findByEmail(email).orElseThrow(RuntimeException::new);
        model.addAttribute("user", userEntity);

        return "user/edit";
    }

    @PostMapping(path = "/user/edit")
    String processUserEditForm(UserEntity userEntity) {
        userService.update(userEntity);
        return "redirect:/user/list";
    }

    @GetMapping(path = "/user/remove")
    String removeUser(UserEntity userEntity) {
        userService.delete(userEntity);
        return "redirect:/user/list";
    }
}
