package org.sid.demo.services;

import org.sid.demo.dto.InvoiceRequestDTO;
import org.sid.demo.dto.InvoiceResponseDTO;

import java.util.List;

public interface InvoiceService {

    public InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO);

    public InvoiceResponseDTO getInvoice(String InvoiceId);

    List<InvoiceResponseDTO> invoicesByCustomerId(String customerId);

    List<InvoiceResponseDTO> allInvoices();
}
