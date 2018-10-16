package org.toughchow.hereyouare.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.toughchow.hereyouare.web.entity.User;

import java.util.HashMap;
import java.util.Map;

@RestController
public class InitController {

    private static final Map<Integer,User> userData = new HashMap<Integer, User>(){
        private static final long serialVersionUID = -3970206781360313502L;
        {
            put(111,new User(1,"tough","tough"));
            put(222,new User(2,"rikey","rikey"));
        }
    };

    @GetMapping(value = "/findUserDetails/{userId}")
    public Object getUserDetails(@PathVariable int userId) {

        System.out.println("Getting Employee details for " + userId);

        User user = userData.get(userId);
        if(user == null) {
            user = new User(0,"N/A","N/A");
        }
        return user;
    }
}
