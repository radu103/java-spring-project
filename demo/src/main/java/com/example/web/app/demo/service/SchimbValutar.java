package com.example.web.app.demo.service;

import com.example.web.app.demo.dao.Moneda;
import org.springframework.stereotype.Service;
import com.example.web.app.demo.dto.Curs;

@Service
public class SchimbValutar {

    public Curs SchimbValutar(Moneda mon1, Moneda mon2){
        Curs curs = new Curs();
        if(mon1 == null || mon2 == null){
            curs.setRataSchimb(0);
        }

        curs.setRataSchimb(1);
        return curs;
    }
}
