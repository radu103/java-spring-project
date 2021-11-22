package com.example.web.app.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.app.demo.repository.MonedaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.web.app.demo.dao.Moneda;
import java.util.List;

@RestController
@RequestMapping("moneda")
public class MonedaController {
    
    MonedaRepository repo = null;

    public MonedaController(@Autowired MonedaRepository repository){
        this.repo = repository;
    }

    @GetMapping(value="toate")
    public List<Moneda> ToateMonedele() {
        return this.repo.getAll();
    }
}
