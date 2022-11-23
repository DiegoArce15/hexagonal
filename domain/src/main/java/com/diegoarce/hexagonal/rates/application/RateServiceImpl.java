package main.java.com.diegoarce.hexagonal.rates.application;

import main.java.com.diegoarce.hexagonal.rates.domain.Rate;
import main.java.com.diegoarce.hexagonal.rates.infrastructure.RateRepository;
import main.java.com.diegoarce.hexagonal.rates.infrastructure.RateService;

import java.time.LocalDateTime;
import java.util.Optional;

public class RateServiceImpl implements RateService {

    private final RateRepository rateRepository;

    public RateServiceImpl(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    @Override
    public Optional<Rate> findFirstRateByProductIdAndBrandIdAndBetweenDateInserted(int productId, int brandId, LocalDateTime date) {
        return rateRepository.findFirstRateByProductIdAndBrandIdAndBetweenDateInserted(productId, brandId, date);
    }
}
