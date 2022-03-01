package com.cherrytechnologies.fibworker.repository;

import com.cherrytechnologies.fibworker.domain.FibSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FibSeriesRepository extends JpaRepository<FibSeries,Integer> {
}
