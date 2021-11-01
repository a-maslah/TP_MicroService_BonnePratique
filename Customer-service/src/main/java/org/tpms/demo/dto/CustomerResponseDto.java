package org.tpms.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class CustomerResponseDto {
    private String  id;
    private String name;
    private String email;
}
