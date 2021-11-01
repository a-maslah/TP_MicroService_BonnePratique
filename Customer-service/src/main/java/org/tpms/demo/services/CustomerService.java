package org.tpms.demo.services;


import org.tpms.demo.dto.CustomerRequestDto;
import org.tpms.demo.dto.CustomerResponseDto;

import java.util.List;

public interface CustomerService  {

    public CustomerResponseDto save(CustomerRequestDto customerRequestDto);
    public CustomerResponseDto getCustomer(String id);
    public CustomerResponseDto update(CustomerRequestDto customerRequestDto);
    public List<CustomerResponseDto> listCustomers();
}
