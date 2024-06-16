package com.example.demorestapi;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class RecordController {

    private final RecordRepository repository;

    public RecordController(RecordRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/records")
    List<Record> getAllRecords() {
        return repository.findAll();
    }

    @PostMapping("/records")
    Record createRecord(@RequestBody Record record) {
        record.setDateTime(LocalDateTime.now());
        return repository.save(record);
    }

    @GetMapping("/records/{id}")
    Record getRecordById(@PathVariable long id) {
        return repository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    @PutMapping("/records/{id}")
    Record updateRecord(@RequestBody Record record, @PathVariable long id) {
        return repository.findById(id).map(recordUpdated -> {
            recordUpdated.setName(record.getName());
            recordUpdated.setComment(record.getComment());
            recordUpdated.setDateTime(LocalDateTime.now());
            recordUpdated.setId(record.getId());
            return repository.save(recordUpdated);
        }).orElseGet(() -> repository.save(record));
    }

    @DeleteMapping("/records/{id}")
    void deleteRecordById(@PathVariable long id) {
        repository.deleteById(id);
    }
}
