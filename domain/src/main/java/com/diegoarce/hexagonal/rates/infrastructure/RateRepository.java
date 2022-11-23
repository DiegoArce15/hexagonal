package main.java.com.diegoarce.hexagonal.rates.infrastructure;

import main.java.com.diegoarce.hexagonal.rates.domain.Rate;

import java.time.LocalDateTime;
import java.util.Optional;

public interface RateRepository {

    Optional<Rate> findFirstRateByProductIdAndBrandIdAndBetweenDateInserted(int productId, int brandId, LocalDateTime date);
}
