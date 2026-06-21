package com.example.campuscare.Controller;

import org.springframework.ui.Model;
import com.example.campuscare.Entity.Complaint;
import com.example.campuscare.Services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @Autowired
    private ComplaintService complaintService;

    @GetMapping("/student/dashboard")
    public String studentDashboard(Model model, @RequestParam Long studentId) {
        model.addAttribute("studentId", studentId);
        model.addAttribute("complaints", complaintService.getComplaintsByStudent(studentId));
        return "student-dashboard";
    }



    @PostMapping("/student/complaint")
    public String submitComplaint(@ModelAttribute Complaint complaint) {
        complaintService.saveComplaint(complaint);
        return "redirect:/student/dashboard?studentId=" + complaint.getStudentId();
    }
}
