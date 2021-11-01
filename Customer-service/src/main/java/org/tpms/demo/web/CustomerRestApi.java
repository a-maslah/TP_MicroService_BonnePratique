package org.tpms.demo.web;

import org.springframework.web.bind.annotation.*;
import org.tpms.demo.dto.CustomerRequestDto;
import org.tpms.demo.dto.CustomerResponseDto;
import org.tpms.demo.services.CustomerService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CustomerRestApi {

    private CustomerService customerService;

    public CustomerRestApi(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path="/customers")
    public List<CustomerResponseDto> allCustomers(){
        return customerService.listCustomers();
    }
    @PostMapping(path="/savecustomers")
    public CustomerResponseDto save(@RequestBody CustomerRequestDto customerRequestDto){
        customerRequestDto.setId(UUID.randomUUID().toString());
        return customerService.save(customerRequestDto);
    }
    @GetMapping(path="/customers/{id}")
    public CustomerResponseDto getCustomer(@PathVariable String id){
        return customerService.getCustomer(id);
    }
}
