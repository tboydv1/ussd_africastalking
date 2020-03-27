package com.insurance.ussdservice.healthservice;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthServiceController {

    private String sessionId;

    @PostMapping("https://ussdhealthapp.herokuapp.com/")
    public String ussdService(@RequestParam String sessionId, @RequestParam String text) {

        if (text == "1") {

            return "END Choose account information you want to view";
        }
        else if(text == ""){

            return "END it works";
        }
        return "CON Choose account information you want to view";
    }
}