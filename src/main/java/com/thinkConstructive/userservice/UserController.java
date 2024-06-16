package com.thinkConstructive.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "{userId}")
    public User getUserDetails(@PathVariable("userId") String userId)
    {
        User user= new User("1","Gopi","8712827364");

       Posts posts= restTemplate.getForObject("http://post-service/posts/1", Posts.class);

        user.setPosts(posts);

        Notifications notifications=restTemplate.getForObject("http://notifications-service/notifications/1",Notifications.class);
        user.setNotifications(notifications);

        return user;
    }
}
