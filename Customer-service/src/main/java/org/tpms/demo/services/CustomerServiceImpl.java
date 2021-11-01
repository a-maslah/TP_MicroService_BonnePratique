package org.tpms.demo.services;

import org.springframework.stereotype.Service;
import org.tpms.demo.dto.CustomerRequestDto;
import org.tpms.demo.dto.CustomerResponseDto;
import org.tpms.demo.entites.Customer;
import org.tpms.demo.mappers.CustomerMapper;
import org.tpms.demo.repository.CustomerRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerResponseDto save(CustomerRequestDto customerRequestDto) {

        Customer c = customerMapper.CustomerRequestDtoTocustomer(customerRequestDto);
        Customer customerSave = customerRepository.save(c);

        CustomerResponseDto customerResponseDto = customerMapper.customerToCustomerResponseDto(customerSave);

        return customerResponseDto;
    }

    @Override
    public CustomerResponseDto getCustomer(String id) {

        Customer customer = customerRepository.findById(id).get();

        return customerMapper.customerToCustomerResponseDto(customer);
    }

    @Override
    public CustomerResponseDto update(CustomerRequestDto customerRequestDto) {
        Customer customer = customerMapper.CustomerRequestDtoTocustomer(customerRequestDto);

        Customer customerUpdate = customerRepository.save(customer);

        return customerMapper.customerToCustomerResponseDto(customerUpdate);
    }

    @Override
    public List<CustomerResponseDto> listCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerResponseDto> customerResponseDtos = customers.stream().map(c->
           customerMapper.customerToCustomerResponseDto(c)).collect(Collectors.toList());
        return customerResponseDtos;
    }
}
