package com.example.demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoDto {

    private long id;
    private String name;
    private String middleName;
    private String lastName;
    private  String contact;
}
