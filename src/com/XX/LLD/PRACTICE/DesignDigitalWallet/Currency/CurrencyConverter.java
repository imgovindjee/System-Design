package com.XX.LLD.PRACTICE.DesignDigitalWallet.Currency;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CurrencyConverter {

    private static Map<Currency, BigDecimal> exchangeRates = new ConcurrentHashMap<>();

    static {
        exchangeRates.put(Currency.USD, BigDecimal.ONE);
        exchangeRates.put(Currency.EUR, new BigDecimal("0.85"));
        exchangeRates.put(Currency.GBP, new BigDecimal("0.72"));
        exchangeRates.put(Currency.INR, new BigDecimal("1.00"));
        exchangeRates.put(Currency.NRP, new BigDecimal("0.60"));
        exchangeRates.put(Currency.JPY, new BigDecimal("110.00"));
    }

    public static BigDecimal convert(BigDecimal amount, Currency sourceCurrency, Currency targetCurrency){
        BigDecimal sourceRate = exchangeRates.get(sourceCurrency);
        BigDecimal targetRate = exchangeRates.get(targetCurrency);
        return amount.multiply(sourceRate).divide(targetRate, RoundingMode.HALF_UP);
    }
}
