package com.example.campuscare.Controller;

import com.example.campuscare.Entity.User;
import com.example.campuscare.Services.ComplaintService;
import com.example.campuscare.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    @Autowired
    private ComplaintService complaintService;

    @Autowired
    private UserService userService;


    @GetMapping("/admin/dashboard")
    public String adminDashboard(Model model) {
        model.addAttribute("complaints", complaintService.getAllComplaints());
        model.addAttribute("technicians", userService.getAllTechnicians());
        return "admin-dashboard";
    }


    @PostMapping("/admin/addTechnician")
    public String addTechnician(@ModelAttribute User technician) {
        technician.setRole(User.Role.TECHNICIAN);
        userService.saveUser(technician);
        return "redirect:/admin/dashboard";
    }


    @PostMapping("/admin/removeTechnician")
    public String removeTechnician(@RequestParam Long technicianId) {
        userService.deleteUserById(technicianId);
        return "redirect:/admin/dashboard";
    }
}