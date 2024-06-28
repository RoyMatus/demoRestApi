package com.example.demorestapi.controller;

import com.example.demorestapi.model.Record;
import com.example.demorestapi.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class RecordController {

    private final RecordRepository repository;

    @GetMapping("/")
    public String hello() {
        return "Hello World.\n I'm \"demoRestApi\" application.\n";
    }

    @GetMapping("/records")
    List<Record> getAllRecords() { return repository.findAll(); }

    @PostMapping("/records")
    Record createRecord(@RequestBody Record record) {
        record.setDateTime(LocalDateTime.now());
        return repository.save(record);
    }

    @GetMapping("/records/{id}")
    Record getRecordById(@PathVariable UUID id) {
        return repository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    @PutMapping("/records/{id}")
    Record updateRecord(@RequestBody Record record, @PathVariable UUID id) {
        return repository.findById(id).map(recordUpdated -> {
            recordUpdated.setTitle(record.getTitle());
            recordUpdated.setDescription(record.getDescription());
            // TODO: 16.06.2024 delete date and id 
            recordUpdated.setDateTime(LocalDateTime.now());
            recordUpdated.setId(record.getId());
            return repository.save(recordUpdated);
        }).orElseGet(() -> repository.save(record));
    }

    @DeleteMapping("/records/{id}")
    void deleteRecordById(@PathVariable UUID id) {
        repository.deleteById(id);
    }
}
