package main.java.com.diegoarce.hexagonal.rates.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
public class Rate {

    private Long rateId;

    private int brandId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private int priceList;

    private int productId;

    private int priority;

    private BigDecimal priceDetail;

    private String curr;
}
