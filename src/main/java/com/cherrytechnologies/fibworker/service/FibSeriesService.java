package com.cherrytechnologies.fibworker.service;

import com.cherrytechnologies.fibworker.domain.FibSeries;

import java.util.List;
import java.util.Optional;

public interface FibSeriesService {
    List<FibSeries> getAll();
    Optional<FibSeries> getByValue(int number);
    FibSeries saveNumber(FibSeries fibSeries);
    FibSeries updateNumber(FibSeries fibSeries);
}
