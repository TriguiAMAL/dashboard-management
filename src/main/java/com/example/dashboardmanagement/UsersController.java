package com.example.dashboardmanagement;

import com.example.dashboardmanagement.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    private final UsersRepository userRepository;

    public UsersController(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    //getmapping postmapping patch mapping putmapping sont tous des endspoints
    @GetMapping("/users")
    public List<Users> getUsers() {
        System.out.println("daliiiii");
        System.out.println(userRepository.findAll());
        return (List<Users>) userRepository.findAll();

    }

    @PostMapping("/users")
    void addUser(@RequestBody Users user) {
        userRepository.save(user);
    }
}
