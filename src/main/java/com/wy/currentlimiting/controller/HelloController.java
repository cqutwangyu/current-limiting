package com.wy.currentlimiting.controller;

import com.wy.currentlimiting.annotation.RateLimiter;
import com.wy.currentlimiting.enums.LimitType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @RateLimiter(time = 5, count = 3, limitType = LimitType.IP)
    public String hello() {
        return "hello>>>" + new Date();
    }
}
