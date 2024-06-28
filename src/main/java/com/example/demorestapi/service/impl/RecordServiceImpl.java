package com.example.demorestapi.service.impl;

import com.example.demorestapi.controller.RecordNotFoundException;
import com.example.demorestapi.model.Record;
import com.example.demorestapi.repository.RecordRepository;
import com.example.demorestapi.service.RecordService;
import com.example.demorestapi.service.dto.RecordDto;
import com.example.demorestapi.service.mapper.RecordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RecordServiceImpl implements RecordService {

    private final RecordRepository recordRepository;
    private final RecordMapper recordMapper;

    @Override
    public List<RecordDto> getAllRecords() {
        return recordMapper.toListDto(recordRepository.findAll());
    }

    @Override
    public RecordDto findById(UUID id) {
        return Optional.of(getById(id)).map(recordMapper::modelToDto).get();
    }

    @Override
    @Transactional
    public RecordDto save(RecordDto recordDto) {
        return recordMapper.modelToDto(recordRepository.save(recordMapper.dtoToModel(recordDto)));
    }

    @Override
    public void deleteById(UUID id) {

    }

    public Record getById(UUID id) {
        return recordRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }
}
