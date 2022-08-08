package com.example.SpringSecurity.testingLab2;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BitcoinConfig {

    @Bean(name="bitcoin")
    public RestTemplate grabCoin () {
        RestTemplate coin = new RestTemplateBuilder()
                .rootUri
                        ("https://api.coincap.io/v2/assets/bitcoin").build();
        return coin;
    }

}
