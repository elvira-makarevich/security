package com.ita.u1.ssecurity;

import com.ita.u1.ssecurity.config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[]{BootsecurityApplication.class, WebSecurityConfig.class}, args);
    }

}
