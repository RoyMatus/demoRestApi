package com.example.demorestapi.repository;

import com.example.demorestapi.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecordRepository extends JpaRepository<Record, UUID> {
}
