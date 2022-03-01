package com.cherrytechnologies.fibworker.controller;

import com.cherrytechnologies.fibworker.Exception.NotFoundException;
import com.cherrytechnologies.fibworker.domain.FibSeries;
import com.cherrytechnologies.fibworker.service.FibSeriesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/redis-worker")
@RequiredArgsConstructor
@Slf4j
public class FibSeriesController {

    private final FibSeriesService seriesService;

    @GetMapping("/")
    public ResponseEntity<List<FibSeries>> getAll() {
        log.info("GET /redis-worker/");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(seriesService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FibSeries> getByValue(@PathVariable int id) {
        log.info("GET /redis-worker/" + id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(seriesService.getByValue(id).orElseThrow(()-> new NotFoundException(id)));
    }
}
