package com.example.hellospring.interfacediv;

import java.math.BigDecimal;

public class SimpleExRateService implements ExRateProvider {
    @Override
    public BigDecimal getExRate(String currency) {
        if (currency.equals("USD")) return BigDecimal.valueOf(1000L);

        throw new IllegalArgumentException("지원되지 않는 통화입니다.");
    }
}
