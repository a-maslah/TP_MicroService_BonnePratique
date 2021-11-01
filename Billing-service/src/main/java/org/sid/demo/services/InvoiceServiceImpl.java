package org.sid.demo.services;

import org.sid.demo.dto.InvoiceRequestDTO;
import org.sid.demo.dto.InvoiceResponseDTO;
import org.sid.demo.entites.Customer;
import org.sid.demo.entites.Invoice;
import org.sid.demo.exceptions.CustomerNotFoundException;
import org.sid.demo.mappers.InvoiceMapper;
import org.sid.demo.openfeign.CustomerRestClient;
import org.sid.demo.repository.InvoiceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService{


    private InvoiceRepository invoiceRepository;
    private InvoiceMapper invoiceMapper;
    private CustomerRestClient customerRestClient;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository, InvoiceMapper invoiceMapper, CustomerRestClient customerRestClient) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceMapper = invoiceMapper;
        this.customerRestClient = customerRestClient;
    }

    @Override
    public InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO) {
        //verification de l'integrite referentielle  Invoice/Customer
        Customer customer;

        try{
             customer = customerRestClient.getCustomer(invoiceRequestDTO.getCustomerId());
        }catch (Exception e){
            throw new CustomerNotFoundException("Customer not found");
        }
        Invoice invoice = invoiceMapper.fromInvoiceRequestDTO(invoiceRequestDTO);
        invoice.setId(UUID.randomUUID().toString());
        invoice.setDate(new Date());
        Invoice saveInvoice = invoiceRepository.save(invoice);
        saveInvoice.setCustomer(customer);
        return invoiceMapper.fromInvoice(saveInvoice);
    }

    @Override
    public InvoiceResponseDTO getInvoice(String InvoiceId) {
        Invoice invoice = invoiceRepository.findById(InvoiceId).get();
        Customer customer = customerRestClient.getCustomer(invoice.getCustomerId());
        invoice.setCustomer(customer);
        return invoiceMapper.fromInvoice(invoice);
    }

    @Override
    public List<InvoiceResponseDTO> invoicesByCustomerId(String customerId) {
        List<Invoice> invoices = invoiceRepository.findByCustomerId(customerId);

        for (Invoice invoice : invoices) {
            Customer customer = customerRestClient.getCustomer(invoice.getCustomerId());
            invoice.setCustomer(customer);
        }
        return invoices.stream().map(invoice->invoiceMapper.fromInvoice(invoice)).collect(Collectors.toList());
    }

    @Override
    public List<InvoiceResponseDTO> allInvoices() {
        List<Invoice> invoices = invoiceRepository.findAll();

        for (Invoice invoice : invoices) {
            Customer customer = customerRestClient.getCustomer(invoice.getCustomerId());
            invoice.setCustomer(customer);
        }
        return invoices.stream().map(invoice -> invoiceMapper.fromInvoice(invoice)).collect(Collectors.toList());
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<String > exceptionHandler(Exception e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
