package com.example.campuscare.Controller;

import com.example.campuscare.Entity.Complaint;
import com.example.campuscare.Repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ComplaintController {

    @Autowired
    private ComplaintRepository complaintRepository;

    @PostMapping("/complaint/{id}/solve")
    public String markAsSolved(@PathVariable Long id) {
        Complaint complaint = complaintRepository.findById(id).orElse(null);
        if (complaint != null) {
            complaint.setStatus(Complaint.Status.SOLVED);
            complaintRepository.save(complaint);
        }
        return "redirect:/technician/dashboard";
    }
}