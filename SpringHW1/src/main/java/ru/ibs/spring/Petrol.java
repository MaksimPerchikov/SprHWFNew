package ru.ibs.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Petrol implements Engine {

    /*@Autowired
    private Petrol petrol;*/

    @Override
    public String powerUp() {
        return "Petrol Работает на бензине.";
    }

}