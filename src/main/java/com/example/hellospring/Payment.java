package com.example.hellospring;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {
    // 주문번호
    private Long orderId;
    // 외국 통화 종류
    private String currency;
    // 외국 통화 기준 결제 금액
    private BigDecimal foreignCurrencyAmount;
    // 적용 환율
    private BigDecimal exRate;
    // 적용 금액
    private BigDecimal convertedAmount;
    // 유효 기간
    private LocalDateTime validUntil;


    public Payment(Long orderId, String currency, BigDecimal foreignCurrencyAmount, BigDecimal exRate, BigDecimal convertedAmount, LocalDateTime validUntil) {
        this.orderId = orderId;
        this.currency = currency;
        this.foreignCurrencyAmount = foreignCurrencyAmount;
        this.exRate = exRate;
        this.convertedAmount = convertedAmount;
        this.validUntil = validUntil;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getForeignCurrencyAmount() {
        return foreignCurrencyAmount;
    }

    public BigDecimal getExRate() {
        return exRate;
    }

    public BigDecimal getConvertedAmount() {
        return convertedAmount;
    }

    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Payment{");
        sb.append("orderId=").append(orderId);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", foreignCurrencyAmount=").append(foreignCurrencyAmount);
        sb.append(", exRate=").append(exRate);
        sb.append(", convertedAmount=").append(convertedAmount);
        sb.append(", validUntil=").append(validUntil);
        sb.append('}');
        return sb.toString();
    }
}
