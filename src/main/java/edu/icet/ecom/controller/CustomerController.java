package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.CustomerDTO;
import edu.icet.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/burger-shop")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public CustomerDTO getCustomer(){
        return new CustomerDTO("Amarapala","Colombo 5","Maradana", "8705113");
    }

    @PostMapping("/add")
    public void save(@RequestBody CustomerDTO customerDTO){
       customerService.save(customerDTO);
    }
    @GetMapping("{id}")
    public CustomerDTO search(@PathVariable String id){
        return customerService.find(id);
    }

    @GetMapping("/all")
    public Object getAll(){
        return customerService.getAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        customerService.deleteById(id);
    }
}
