package org.sid.demo.repository;

import org.sid.demo.entites.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,String> {

    List<Invoice> findByCustomerId(String clientId);
}
