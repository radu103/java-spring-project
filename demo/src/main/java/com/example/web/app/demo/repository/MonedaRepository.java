package com.example.web.app.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.web.app.demo.dao.Moneda;

import org.springframework.stereotype.Repository;

@Repository
public class MonedaRepository {
    
    public List<Moneda> getAll(){
        Moneda moneda1 = new Moneda();
        moneda1.setNume("Euro");

        Moneda moneda2 = new Moneda();
        moneda2.setNume("Leu");        

        List<Moneda> list = new ArrayList();
        list.add(moneda1);
        list.add(moneda2);

        return list;
    }
}
