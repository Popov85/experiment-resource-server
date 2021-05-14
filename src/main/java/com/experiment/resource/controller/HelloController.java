package com.experiment.resource.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HelloController {

    @GetMapping("/")
    public String welcome(Authentication authentication) {
        log.debug("auth = {}", authentication);
        return "welcome.html";
    }

}
