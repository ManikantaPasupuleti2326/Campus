package com.example.campuscare.Services;

import com.example.campuscare.Entity.Complaint;
import com.example.campuscare.Repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository complaintRepo;

    public void saveComplaint(Complaint complaint) {
        complaint.setComplaintDate(LocalDate.now());
        complaint.setComplaintTime(LocalTime.now());
        complaintRepo.save(complaint);
    }

    public List<Complaint> getComplaintsByStudent(Long studentId) {
        return complaintRepo.findByStudentId(studentId);
    }

    public List<Complaint> getAllComplaints() {
        return complaintRepo.findAll();
    }

    public void markAsSolved(Long id) {
        Complaint complaint = complaintRepo.findById(id).orElseThrow();
        complaint.setStatus(Complaint.Status.SOLVED);
        complaintRepo.save(complaint);
    }


}
