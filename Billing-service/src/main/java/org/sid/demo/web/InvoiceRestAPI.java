package org.sid.demo.web;

import org.sid.demo.dto.InvoiceRequestDTO;
import org.sid.demo.dto.InvoiceResponseDTO;
import org.sid.demo.services.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class InvoiceRestAPI {

  private InvoiceService invoiceService;

    public InvoiceRestAPI(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO getInvoice(@PathVariable(name = "id") String invoiceId){
        return invoiceService.getInvoice(invoiceId);

    }
    @GetMapping(path = "/invoicesByCustomer/{customerId}")
    public List<InvoiceResponseDTO> getInvoicesByCustomer (@PathVariable(name = "customerId") String customerId){
        return invoiceService.invoicesByCustomerId(customerId);

    }

    @PostMapping(path = "/invoices")
    public InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO) {
        return invoiceService.save(invoiceRequestDTO);


    }

    @GetMapping(path = "/invoices")
    public List<InvoiceResponseDTO> getAllInvoices(){
        return invoiceService.allInvoices();
    }




}
