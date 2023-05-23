package com.donn.stefany.controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusHealth {
    @RequestMapping("/status")
    @ResponseStatus(HttpStatus.OK)
    public void getStatus() {
    }
}