package com.example.demorestapi.service;

import com.example.demorestapi.service.dto.RecordDto;

import java.util.List;
import java.util.UUID;

public interface RecordService {
    List<RecordDto> getAllRecords();
    RecordDto findById(UUID id);
    RecordDto save(RecordDto recordDto);
    void deleteById(UUID id);
}
