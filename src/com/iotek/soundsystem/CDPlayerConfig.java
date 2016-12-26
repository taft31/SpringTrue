package com.iotek.soundsystem;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by taft on 2016/10/22.
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
    @Bean(name = "cd")
    public CompactDisc cd(){
        return new Capricornus();
    }
}
