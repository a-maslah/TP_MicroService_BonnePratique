package org.sid.demo.mappers;

import org.mapstruct.Mapper;
import org.sid.demo.dto.InvoiceRequestDTO;
import org.sid.demo.dto.InvoiceResponseDTO;
import org.sid.demo.entites.Invoice;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {


    Invoice fromInvoiceRequestDTO(InvoiceRequestDTO invoiceRequestDTO);

    InvoiceResponseDTO fromInvoice(Invoice invoice);

}
