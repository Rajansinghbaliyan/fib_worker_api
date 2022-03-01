package com.cherrytechnologies.fibworker.repository;

import com.cherrytechnologies.fibworker.domain.FibSeries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FibSeriesRepository extends CrudRepository<FibSeries,Integer> {
}
