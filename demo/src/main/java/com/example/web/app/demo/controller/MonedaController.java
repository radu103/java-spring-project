package com.example.web.app.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.app.demo.repository.MonedaRepository;
import com.example.web.app.demo.service.SchimbValutar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.web.app.demo.dao.Moneda;
import com.example.web.app.demo.dto.Curs;
import java.util.List;

@RestController
@RequestMapping("moneda")
public class MonedaController {
    
    MonedaRepository repo = null;
    SchimbValutar schimbValutar = null;

    public MonedaController(@Autowired MonedaRepository repository, @Autowired SchimbValutar schimb){
        this.repo = repository;
        this.schimbValutar = schimb;
    }

    @GetMapping(value="toate")
    public List<Moneda> ToateMonedele() {
        return this.repo.getAll();
    }

    @GetMapping(value ="schimb")
    public Curs Schimb() {
        List<Moneda> list = this.repo.getAll();
        Moneda mon1 = list.size() > 0 ? list.get(0) : null;
        Moneda mon2 = list.size() > 1 ? list.get(1) : null;
        return this.schimbValutar.SchimbValutar(mon1, mon2);
    }
}
