package com.example.demorestapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RecordRepository repository) {
        return args -> {
            log.info("Loading records from database " + repository.save(new Record("Name 1",
                    "Comment 1",
                    LocalDateTime.now())));
            log.info("Loading records from database " + repository.save(new Record("Name 2",
                    "Comment 2",
                    LocalDateTime.now())));
        };
    }
}
