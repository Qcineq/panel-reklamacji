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

    private final UserService userService;
    private final RoleService roleService;

    UserController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @ModelAttribute("roles")
    Collection<RoleEntity> findAllRoles() {
        return roleService.findAll();
    }

    @GetMapping(path = "/user/add")
    String showAddUserForm(Model model) {

        UserEntity user = new UserEntity();
        model.addAttribute("user", user);

        return "user/add";
    }

    @PostMapping(path = "/user/add")
    String processAddUserForm(@Valid UserEntity user, BindingResult result) {

        if (result.hasErrors()) {
            return "user/add";
        }

        userService.save(user);

        return "redirect:/user/list";
    }

    @GetMapping(path = "/user/list")
    String showUserList(Model model) {

        List<UserEntity> users = userService.findAll();
        model.addAttribute("users", users);

        return "user/list";
    }

    @GetMapping(path = "/user/edit")
    String showEditUserForm(@RequestParam("id") long userId, Model model) {

        UserEntity user = userService.findById(userId).orElseThrow(RuntimeException::new);
        model.addAttribute("user", user);

        return "user/edit";
    }

    @PostMapping(path = "/user/edit")
    String processUserEditForm(UserEntity user) {
        userService.update(user);
        return "redirect:/user/list";
    }

    @GetMapping(path = "/user/remove")
    String removeUser(UserEntity user) {
        userService.delete(user);
        return "redirect:/user/list";
    }
}
