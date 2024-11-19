package org.hnu3.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;

@SpringBootApplication
@MapperScan(basePackages ="org.hnu3")
public class Hnu3Application {

    public static void main(String[] args) {
        SpringApplication.run(Hnu3Application.class, args);
    }

}
