package com.example.demorestapi.service;

import com.example.demorestapi.model.Record;
import com.example.demorestapi.repository.RecordRepository;
import net.datafaker.Faker;
import net.datafaker.providers.base.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    Book fakerInstance = new Faker().book();

    @Bean
    CommandLineRunner initDatabase(RecordRepository repository) {
        return args -> {
            for (int i = 0; i < 100; i++) {
                repository.save(new Record(fakerInstance.title(), fakerInstance.author()));
            }
        };
    }

}
