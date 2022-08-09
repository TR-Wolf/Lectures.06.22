package com.example.Logging.services;

import com.example.Logging.controllers.HelloController;
import com.example.Logging.dto.BitcoinDTO;
import com.example.Logging.dto.DataDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitcoinService {

    @Autowired
    RestTemplate bitcoinAPI;

    // Add a logger here?


    public BitcoinDTO getBitcoinData() {
        try {
            DataDTO dataDTO = bitcoinAPI.getForObject("/", DataDTO.class);
            return dataDTO.getData();
        } catch (Exception e) {

        }
        return null;
    }
}
