package com.cherrytechnologies.fibworker.service;

import com.cherrytechnologies.fibworker.domain.FibSeries;
import com.cherrytechnologies.fibworker.repository.FibSeriesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class FibSeriesServiceImpl implements FibSeriesService{

    private final FibSeriesRepository repository;

    @Override
    public FibSeries getByValue(int number) {
        return repository.findById(number).get();
    }

    @Override
    public FibSeries saveNumber(FibSeries fibSeries) {
        return repository.save(fibSeries);
    }

    @Override
    public FibSeries updateNumber(FibSeries fibSeries) {
        FibSeries retrievedFibSeries = repository.findById(fibSeries.getId()).get();
        retrievedFibSeries.setValue(00);
        return repository.save(retrievedFibSeries);
    }
}
