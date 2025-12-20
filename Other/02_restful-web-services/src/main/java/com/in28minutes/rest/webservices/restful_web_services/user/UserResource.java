package com.in28minutes.rest.webservices.restful_web_services.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    private UserDaoService userDaoService;

    @Autowired
    public UserResource(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping(path = "/users")
    public List<User> Users() {
        return this.userDaoService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User Users(@PathVariable int id) {
        User user = this.userDaoService.findById(id);

        if (user == null) {
            throw new UserNotFoundException("No user found.");
        }

        return user;
    }

    @DeleteMapping(path = "/users/{id}")
    public void DeleteUsers(@PathVariable int id) {
        this.userDaoService.deleteById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<User> CreateUser(@Valid @RequestBody User user) {
        User newUser = this.userDaoService.SaveUser(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
