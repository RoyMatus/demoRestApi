package com.example.demorestapi;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name ="records")
public class Record {
    public Record() {
    }

    public Record(Integer id, String name, String comment, LocalDateTime dateTime) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.dateTime = dateTime;
    }

    /**
     * The unique identifier for the Record.
     * <p>
     * This field is annotated with {@link Id} to specify it as the primary key
     * and {@link GeneratedValue} to indicate that the value is automatically
     * generated.
     * </p>
     */
    private @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) long id;

    @Column(name = "name")
    private String name;

    @Column(name = "comment")
    private String comment;

    @Column(name = "datetime")
    private LocalDateTime dateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Record{" + "id=" + id + ", name='" + name + '\'' + ", comment='" + comment + '\'' + ", dateTime=" + dateTime + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(id, record.id) && Objects.equals(name, record.name) && Objects.equals(comment, record.comment) && Objects.equals(dateTime, record.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, comment, dateTime);
    }
}