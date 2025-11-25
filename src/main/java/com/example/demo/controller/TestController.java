package com.example.demo.controller;

import config.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public Map<String, String> test() {
        return Map.of("status", "ok");
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable int id) {
        if (id == 0) throw new NotFoundException("ID not found");
        return "Valid id: " + id;
    }
}