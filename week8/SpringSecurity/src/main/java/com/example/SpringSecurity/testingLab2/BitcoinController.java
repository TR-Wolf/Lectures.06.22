package com.example.SpringSecurity.testingLab2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Data

@RestController
@RequestMapping("/bitcoin")
public class BitcoinController {

    @Autowired
    @Qualifier("bitcoin")
    private RestTemplate bitcoinTemplate;

    @GetMapping
    public BitcoinDTO getBitCoin() {
        return bitcoinTemplate.getForObject("/", DataDTO.class).getData();
    }


}
/*

{"data":
    {
    "id":"bitcoin",
    "rank":"1",
    "symbol":"BTC",
    "name":"Bitcoin",
    "supply":"19113193.0000000000000000",
    "maxSupply":"21000000.0000000000000000",
    "marketCapUsd":"442703975040.9806988607542382",
    "volumeUsd24Hr":"12797805899.7795219641591212",
    "priceUsd":"23162.2196794110067774",
    "changePercent24Hr":"2.7439847989775123",
    "vwap24Hr":"23093.0717529416210792",
    "explorer":"https://blockchain.info/"},
    "timestamp":1659734988222
    }
 */