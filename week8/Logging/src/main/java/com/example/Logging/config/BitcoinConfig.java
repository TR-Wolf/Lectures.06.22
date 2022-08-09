package com.example.Logging.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BitcoinConfig {

    @Bean
    public RestTemplate getBitCoin() {
        String bitcoinAPI = "https://api.coincap.io/v2/assets/bitcoin";
        return new RestTemplateBuilder()
                .rootUri(bitcoinAPI).build();
    }
}
