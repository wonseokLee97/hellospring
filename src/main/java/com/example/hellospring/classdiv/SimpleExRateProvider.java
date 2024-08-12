package com.example.hellospring.classdiv;

import java.io.IOException;
import java.math.BigDecimal;

public class SimpleExRateProvider {
    BigDecimal getExRate(String currency) throws IOException {
        if (currency.equals("USD")) return BigDecimal.valueOf(1000L);

        throw new IllegalArgumentException("지원되지 않는 통화입니다.");
    }
}
