package io.zts.demo.springboot.fastjson.test;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping(value = "/testInput", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String testInput(@RequestBody ExploreDesignBasicInfo req) {
        return req.toString();
    }

    @GetMapping("/")
    public String home() {
        return "hello";
    }
}
