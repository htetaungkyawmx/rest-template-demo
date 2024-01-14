package com.example.webui.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Customers {
    private List<Customer> customers;

    public Customers(){

    }
}
