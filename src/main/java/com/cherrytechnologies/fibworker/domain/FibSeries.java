package com.cherrytechnologies.fibworker.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "fib_series")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FibSeries {
    private Integer number;
    private Integer value;
}
