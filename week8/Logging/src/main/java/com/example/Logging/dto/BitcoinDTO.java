package com.example.Logging.dto;

import lombok.Data;

@Data
public class BitcoinDTO {
    private String id;
    private int rank;
    private String symbol;
    private String name;
    private Double supply;
    private Double maxSupply;
    private Double marketCapUsd;
    private Double volumeUsd24Hr;
    private Double priceUsd;
    private Double changePercent24Hr;
    private Double vwap24Hr;
    private String explorer;
}
