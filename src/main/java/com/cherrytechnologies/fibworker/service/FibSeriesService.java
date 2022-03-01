package com.cherrytechnologies.fibworker.service;

import com.cherrytechnologies.fibworker.domain.FibSeries;

public interface FibSeriesService {
    FibSeries getByValue(int number);
    FibSeries saveNumber(FibSeries fibSeries);
    FibSeries updateNumber(FibSeries fibSeries);
}
