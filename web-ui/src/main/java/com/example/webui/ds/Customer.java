package com.example.webui.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private Integer id;
    private String code;
    private String firstName;
    private String lastName;

    public Customer(){

    }
}
