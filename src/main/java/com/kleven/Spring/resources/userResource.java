package com.kleven.Spring.resources;

import com.kleven.Spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class userResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria","maria@dores.com","9999999","pass");
        return ResponseEntity.ok().body(u);
    }
}
