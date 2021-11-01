package org.tpms.demo.mappers;

import org.mapstruct.Mapper;
import org.tpms.demo.dto.CustomerRequestDto;
import org.tpms.demo.dto.CustomerResponseDto;
import org.tpms.demo.entites.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerResponseDto customerToCustomerResponseDto(Customer customer);
    Customer CustomerRequestDtoTocustomer(CustomerRequestDto customerRequestDto);

}
