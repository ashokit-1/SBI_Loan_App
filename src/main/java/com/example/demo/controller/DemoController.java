package com.example.demo.controller;


import com.example.demo.payload.DemoDto;
import com.example.demo.service.DemoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")

public class DemoController {

    private DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @PostMapping
    public void createDemo(@RequestBody DemoDto demoDto){
        demoService.createDemo(demoDto);

    }


}
