package com.example.demorestapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * The Record class represents an entity in the system.
 * <p>
 * This class is annotated with JPA annotations to map it to a database table,
 * and Lombok annotations to automatically generate boilerplate code such as
 * getters, setters, constructors, toString, equals, and hashCode methods.
 * </p>
 * <p>
 * The {@link Entity} annotation specifies that the class is an entity and is
 * mapped to a database table.
 * The {@link Id} and {@link GeneratedValue} annotations are used to define the
 * primary key and its generation strategy.
 * </p>
 * <p>
 * Lombok annotations used in this class:
 * <ul>
 * <li>{@link Getter} - Generates getters for all fields.</li>
 * <li>{@link Setter} - Generates setters for all fields.</li>
 * <li>{@link AllArgsConstructor} - Generates a constructor with a parameter for each field in the class.</li>
 * <li>{@link NoArgsConstructor} - Generates a no-arguments constructor.</li>
 * <li>{@link ToString} - Generates a toString method that includes the field names.</li>
 * <li>{@link EqualsAndHashCode} - Generates equals and hashCode methods.</li>
 * </ul>
 * </p>
 *
 * <p>
 * Example usage:
 * <pre>
 *     Record record = new Record(1L, "John Doe", "This is a comment", LocalDateTime.now());
 *     System.out.println(record);
 * </pre>
 * </p>
 *
 * @version 1.0
 * @since 2024-06-13
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor()
public class Record {

    /**
     * The unique identifier for the Record.
     * <p>
     * This field is annotated with {@link Id} to specify it as the primary key
     * and {@link GeneratedValue} to indicate that the value is automatically
     * generated.
     * </p>
     */
    private @Id
    @GeneratedValue Long id;

    /**
     * The name associated with the Record.
     */
    public String name;

    /**
     * The comment associated with the Record.
     */
    private String comment;

    /**
     * The date and time associated with the Record.
     * <p>
     * This field represents the timestamp when the record was created or last updated.
     * </p>
     */
    private LocalDateTime dateTime;

    public Record(String name, String comment, LocalDateTime dateTime) {
        this.name = name;
        this.comment = comment;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", dateTime=" + dateTime +
                '}';
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