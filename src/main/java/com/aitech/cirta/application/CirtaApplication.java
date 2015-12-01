package com.aitech.cirta.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * Spring boot class launcher
 * 
 * @author Nassim AIT BRAHAM AITECH COMPANY
 *
 */

@SpringBootApplication
@ComponentScan("com.aitech.cirta")
public class CirtaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CirtaApplication.class, args);
    }
}
