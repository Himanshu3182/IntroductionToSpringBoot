package com.example.Himanshu.Spring1.IntroductionToSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService implements DB{
    @Autowired
    private DB db;

public String getData(){
    return db.getData();
}
}
