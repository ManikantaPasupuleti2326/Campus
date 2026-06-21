package com.example.campuscare.Controller;

import com.example.campuscare.Entity.User;
import com.example.campuscare.Services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String registerUser(@ModelAttribute User user, Model model) {
        List<User> existingUsers = userService.findByUsername(user.getUsername());

        if (!existingUsers.isEmpty()) {
            model.addAttribute("error", "Username already exists. Please choose another.");
            return "signup";
        }

        userService.saveUser(user);
        return "redirect:/";
    }

    @PostMapping("/login/admin")
    public String loginAdmin(@RequestParam String username,
                             @RequestParam String password,
                             Model model,
                             HttpSession session) {

        List<User> users = userService.findByUsername(username);

        if (users.isEmpty()) {
            model.addAttribute("adminError", "User not found.");
            model.addAttribute("showSignupAdmin", true);
            return "home";
        }

        User user = users.get(0);

        if (user.getRole() != User.Role.ADMIN || !user.getPassword().equals(password)) {
            model.addAttribute("adminError", "Incorrect username or password");
            return "home";
        }

        session.setAttribute("loggedInUser", user);
        return "redirect:/admin/dashboard";
    }

    @PostMapping("/login/student")
    public String loginStudent(@RequestParam String username,
                               @RequestParam String password,
                               Model model,
                               HttpSession session) {

        List<User> users = userService.findByUsername(username);

        if (users.isEmpty()) {
            model.addAttribute("studentError", "User not found.");
            model.addAttribute("showSignupStudent", true);
            return "home";
        }

        User user = users.get(0);

        if (user.getRole() != User.Role.STUDENT || !user.getPassword().equals(password)) {
            model.addAttribute("studentError", "Incorrect username or password");
            return "home";
        }

        session.setAttribute("loggedInUser", user);
        return "redirect:/student/dashboard?studentId=" + user.getId();
    }

    @PostMapping("/login/technician")
    public String loginTechnician(@RequestParam String username,
                                  @RequestParam String password,
                                  Model model,
                                  HttpSession session) {

        List<User> users = userService.findByUsername(username);

        if (users.isEmpty()) {
            model.addAttribute("technicianError", "User not found.");
            model.addAttribute("showSignupTechnician", true);
            return "home";
        }

        User user = users.get(0);

        if (user.getRole() != User.Role.TECHNICIAN || !user.getPassword().equals(password)) {
            model.addAttribute("technicianError", "Incorrect username or password");
            return "home";
        }

        session.setAttribute("loggedInUser", user);
        return "redirect:/technician/dashboard";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}