package com.example.controller;

import com.example.model.Mart;
import com.example.service.MartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MartController {
    @Autowired
    private MartService martService;

    @PostMapping("/mart")
    public void createMart(@RequestBody Mart mart) {
        martService.createMart(mart);
    }

    @GetMapping("/marts")
    public List<Mart> getMarts() {
        return martService.getMarts();
    }

    @GetMapping("/mart/{martId}")
    public Mart getMart(@PathVariable long martId) {
        return martService.getMart(martId);
    }

    @PutMapping("/mart")
    public void updateMart(@RequestBody Mart mart) {
         martService.updateMart(mart);
    }

    @DeleteMapping("/mart/{martId}")
    public void deleteMart(@PathVariable long martId) {
        martService.deleteMart(martId);
    }
}
