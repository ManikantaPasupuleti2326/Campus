package com.example.campuscare.Repository;

import com.example.campuscare.Entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TechnicianRepository extends JpaRepository<Technician, Long> {
    Optional<Technician> findByUsername(String username);
}
