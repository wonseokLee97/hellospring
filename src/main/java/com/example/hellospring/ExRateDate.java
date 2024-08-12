package com.example.hellospring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ExRateDate(String result, HashMap<String, BigDecimal> rates) {

}
