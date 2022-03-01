package com.cherrytechnologies.fibworker.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash(value = "FibSeries")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FibSeries {
    @Indexed
    private Integer id;
    private Integer value;
}
