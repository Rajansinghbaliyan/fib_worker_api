package com.cherrytechnologies.fibworker.service;

import com.cherrytechnologies.fibworker.domain.FibSeries;
import com.cherrytechnologies.fibworker.repository.FibSeriesRepository;
import com.cherrytechnologies.fibworker.utils.FibonacciSeries;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class FibSeriesServiceImpl implements FibSeriesService {

    private final FibSeriesRepository repository;

    @Override
    public List<FibSeries> getAll() {
        List<FibSeries> seriesList = new ArrayList<>();
        repository.findAll().forEach(seriesList::add);
        return seriesList;
    }

    @Override
    public Optional<FibSeries> getByValue(int number) {
        return repository.findById(number);
    }

    @Override
    public FibSeries saveNumber(FibSeries fibSeries) {
        log.info("Creating a new entry in redis " + fibSeries.getId());
        fibSeries.setValue(
                FibonacciSeries.getValue(fibSeries.getId()));
        return repository.save(fibSeries);
    }

    @Override
    public FibSeries updateNumber(FibSeries fibSeries) {
        FibSeries retrievedFibSeries = repository.findById(fibSeries.getId()).get();
        retrievedFibSeries.setValue(00);
        return repository.save(retrievedFibSeries);
    }
}
