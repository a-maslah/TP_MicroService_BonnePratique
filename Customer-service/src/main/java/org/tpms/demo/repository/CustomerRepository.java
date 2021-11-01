package org.tpms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tpms.demo.entites.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {

}
