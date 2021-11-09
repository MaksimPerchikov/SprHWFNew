package ru.ibs.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class BeansCla {

    @Autowired
    public HashMap<String, Engine> met() {
        HashMap<String, Engine> engineHashMap = new HashMap<>();
        engineHashMap.put("petrol",new Petrol());
        engineHashMap.put("diesel",new Diesel());
        return engineHashMap;
    }
}