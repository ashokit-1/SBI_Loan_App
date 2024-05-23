package com.example.demo.service.impl;

import com.example.demo.entity.Demo;
import com.example.demo.payload.DemoDto;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {


    private DemoRepository demoRepo;


    public DemoServiceImpl(DemoRepository demoRepo) {
        this.demoRepo = demoRepo;
    }

    @Override
    public void createDemo(DemoDto demoDto) {

        Demo demo = new Demo();
        demo.setName(demoDto.getName());
        demo.setMiddleName(demoDto.getMiddleName());
        demo.setLastName(demoDto.getLastName());
        demo.setContact(demo.getContact());

        demoRepo.save(demo);

    }
}
