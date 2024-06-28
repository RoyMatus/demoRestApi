package com.example.demorestapi.service.mapper;

import com.example.demorestapi.model.Record;
import com.example.demorestapi.service.dto.RecordDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecordMapper {
    Record dtoToModel(RecordDto recordDto);
    RecordDto modelToDto(Record record);
    List<RecordDto> toListDto(List<Record> all);
}
