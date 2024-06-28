package com.example.demorestapi.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecordDto {
    private UUID id;
    private String title;
    private String description;
    private LocalDateTime dateTime;
}
