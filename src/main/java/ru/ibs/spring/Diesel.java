package ru.ibs.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Diesel implements Engine{

    @Autowired
    private Diesel diesel;

    //пока что не нужно.
    @Override
    public String powerUp() {
        return  "Diesel Работает на дизеле.";
    }
}