package com.shop.shop.Restcontroller;


import com.shop.shop.dto.UserDto;
import com.shop.shop.entity.user;
import com.shop.shop.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class userControllerRest {
    @Autowired
    private userService userService;

    public userControllerRest(userService userService) {
        this.userService = userService;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<user> createUser(@RequestBody UserDto US)
    {
        user User = userService.createUser(US.id_user, US.name, US.surname, US.mail, US.password, US.phone_number, US.role);

        return ResponseEntity.status(HttpStatus.CREATED).body(User);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public  ResponseEntity<user> updateUser(@RequestBody UserDto US)
    {
        user User = userService.createUser(US.id_user, US.name, US.surname, US.mail, US.password, US.phone_number, US.role);
        return ResponseEntity.ok(User);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  ResponseEntity<user> getUserbyId(@PathVariable("id") Long id)
    {
        user User = userService.getOrderById(id);
        return ResponseEntity.ok(User);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteUserbyId(@PathVariable("id") Long id)
    {
        userService.deleteUser(id);
    }

}

