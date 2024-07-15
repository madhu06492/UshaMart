package com.example.repository;

import com.example.model.Mart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MartRepo extends JpaRepository<Mart,Long> {
}
