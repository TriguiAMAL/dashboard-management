package com.example.dashboardmanagement;

import com.example.dashboardmanagement.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class DashboardmanagementApplication  {

    public static void main(String[] args) {
        SpringApplication.run(DashboardmanagementApplication.class, args);
    }
    @Bean
    CommandLineRunner init(UsersRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                Users user = new Users(name, name.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }
}

