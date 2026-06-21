package com.example.campuscare.Controller;

import com.example.campuscare.Services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TechnicianController {
    @Autowired
    private ComplaintService complaintService;

    @GetMapping("/technician/dashboard")
    public String technicianDashboard(Model model) {
        model.addAttribute("complaints", complaintService.getAllComplaints());
        return "technician-dashboard";
    }




}
