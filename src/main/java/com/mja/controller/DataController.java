package com.mja.controller;

import com.mja.util.DataGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    DataGenerator dataGenerator;
    public DataController(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
    }

    @PostMapping("/generate")
    public HttpStatus generateData() {
        dataGenerator.createData();
        return HttpStatus.CREATED;
    }
}

