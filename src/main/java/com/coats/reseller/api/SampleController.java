package com.coats.reseller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/getOrderData")
    private String getTemperature(){
        System.out.println("Hello");
        return "Test order";
    }

    // You should be able to pass data. Order data
    // You should be able to get some response
    @GetMapping("/user")
    private User getUserDetails(){
        System.out.println("I am inside /user");
        return new User("Vishal", "Vishal123", "my-super-secrete-password************");
    }
}

class User{
    public String name;
    public String username;
    public String password;

    User(String name, String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }

}
