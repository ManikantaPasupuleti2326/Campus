package com.example.campuscare.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private String studentName;
    private String phoneNumber;
    private String branch;
    private String section;
    private String collegeMail;

    private LocalDate complaintDate;
    private LocalTime complaintTime;
    private String complaintType;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status = Status.UNSOLVED;

    public enum Status {
        SOLVED, UNSOLVED
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }

    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }

    public String getCollegeMail() { return collegeMail; }
    public void setCollegeMail(String collegeMail) { this.collegeMail = collegeMail; }

    public LocalDate getComplaintDate() { return complaintDate; }
    public void setComplaintDate(LocalDate complaintDate) { this.complaintDate = complaintDate; }

    public LocalTime getComplaintTime() { return complaintTime; }
    public void setComplaintTime(LocalTime complaintTime) { this.complaintTime = complaintTime; }

    public String getComplaintType() { return complaintType; }
    public void setComplaintType(String complaintType) { this.complaintType = complaintType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
}