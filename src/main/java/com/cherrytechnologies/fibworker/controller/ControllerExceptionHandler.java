package com.cherrytechnologies.fibworker.controller;

import com.cherrytechnologies.fibworker.Exception.NotFoundException;
import com.cherrytechnologies.fibworker.domain.FibSeries;
import com.cherrytechnologies.fibworker.service.FibSeriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
public class ControllerExceptionHandler {

    private final FibSeriesService fibSeriesService;

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<FibSeries> notHoundHandler(NotFoundException exception) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(fibSeriesService.saveNumber(
                        FibSeries.builder()
                                .id(exception.getValue())
                                .build()
                ));
    }
}
