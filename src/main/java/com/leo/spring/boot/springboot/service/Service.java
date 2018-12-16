package com.leo.spring.boot.springboot.service;

import com.leo.spring.boot.springboot.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    Dao dao;

    @Autowired
    Service(Dao dao) {
        System.out.println("Service Bean Created");
        this.dao = dao;
    }

    public void save() {
        dao.create();
    }
}
