package com.cherrytechnologies.fibworker.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "FibSeries")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FibSeries {
    private Integer id;
    private Integer value;
}
