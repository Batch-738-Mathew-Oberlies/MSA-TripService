package com.revature.rideshare.services;

import com.revature.rideshare.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "user-service", url = "http://user-service:8080")
public interface UserService {
    @GetMapping("/{id}")
    Optional<User> getUserById(@PathVariable("id") int id);
}
