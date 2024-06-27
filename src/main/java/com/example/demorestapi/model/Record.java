package com.example.demorestapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "records")
public class Record {

    private @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "datetime")
    private LocalDateTime dateTime;

    public Record(String title, String description) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.dateTime = LocalDateTime.now();
    }
}
