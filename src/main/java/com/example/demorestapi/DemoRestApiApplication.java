package com.example.demorestapi;

import net.datafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The DemoRestApiApplication class serves as the entry point for the Spring Boot application.
 * <p>
 * This class is annotated with {@link SpringBootApplication}, which is a convenience annotation
 * that adds all of the following:
 * <ul>
 * <li>{@link org.springframework.boot.autoconfigure.EnableAutoConfiguration} - Enables Spring Boot’s auto-configuration mechanism.</li>
 * <li>{@link org.springframework.context.annotation.ComponentScan} - Enables {@code @Component} scan on the package where the application is located (see the best practices).</li>
 * <li>{@link org.springframework.context.annotation.Configuration} - Allows to register extra beans in the context or import additional configuration classes.</li>
 * </ul>
 * </p>
 *
 * <p>
 * The {@code main} method uses {@link SpringApplication#run(Class, String...)} to launch the application.
 * </p>
 *
 * <p>
 * Example usage:
 * <pre>
 *     public static void main(String[] args) {
 *         SpringApplication.run(DemoRestApiApplication.class, args);
 *     }
 * </pre>
 * </p>
 *
 * @version 1.0
 * @since 2024-06-13
 */
@SpringBootApplication
public class DemoRestApiApplication {

    /**
     * The main method serves as the entry point for the Spring Boot application.
     * <p>
     * It uses {@link SpringApplication#run(Class, String...)} to launch the application.
     * </p>
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoRestApiApplication.class, args);
    }

}