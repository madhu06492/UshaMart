package com.example.repository;

import com.example.model.Mart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface martRepo extends JpaRepository<Mart,Long> {
}
