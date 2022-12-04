package com.quasarsoftwerk.cerberusims;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "/cerberus/users" )
public class UserController {

    @GetMapping( "{companyId}" )
    public User get( @PathVariable String companyId ) {
        User user = new User();
        user.setFullName("John Test");

        return user;
    }

    @GetMapping
    public List<User> all() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setFullName("John Test");

        User user2 = new User();
        user2.setFullName("Mary Waters");

        users.add(user1);
        users.add(user2);

        return users;
    }

    @PostMapping
    @ResponseStatus( HttpStatus.CREATED )
    public void post( @RequestBody User user ) {
    }

    @DeleteMapping( "{companyId}" )
    @ResponseStatus( HttpStatus.NO_CONTENT )
    public void delete( @PathVariable String companyId ) {
    }

    @PutMapping
    public void put( @RequestBody User user ) {
    }
}
