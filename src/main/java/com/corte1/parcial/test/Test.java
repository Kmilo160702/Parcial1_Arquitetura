package com.corte1.parcial.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.corte1.parcial.view.VEmpresa;

@SpringBootApplication
public class Test {

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
        VEmpresa.inicio();
    }

}
