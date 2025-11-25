package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CustomerDTO;
import edu.icet.ecom.model.entity.Customer;
import edu.icet.ecom.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void save(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                "C001",
                customerDTO.getCustName(),
                customerDTO.getCustAddress(),
                customerDTO.getCity(),
                customerDTO.getPostalCode()
        );
        customerRepository.save(customer);
    }
    public CustomerDTO find(String id) {
        Customer customer = customerRepository.findById(id).get();
        return new CustomerDTO(
                customer.getCustName(),
                customer.getCustAddress(),
                customer.getCity(),
                customer.getPostalCode()
        );
    }

    public Object getAll() {
        return customerRepository.findAll();
    }

    public void deleteById(String id) {
        customerRepository.deleteById(id);
    }
}
