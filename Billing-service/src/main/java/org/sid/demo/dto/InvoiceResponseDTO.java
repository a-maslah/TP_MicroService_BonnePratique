package org.sid.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.demo.entites.Customer;

import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class InvoiceResponseDTO {

    private String id;
    private Date date;
    private BigDecimal amount;
    private Customer customer;
}
