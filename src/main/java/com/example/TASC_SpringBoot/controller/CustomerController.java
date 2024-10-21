package com.example.TASC_SpringBoot.controller;

import com.example.TASC_SpringBoot.model.Customer;
import com.example.TASC_SpringBoot.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        if (!customer.isPresent()) {
            throw new ResourceNotFoundException("Customer not found with id: " + id);
        }
        return customer.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }


}


//public void add(){
//    // Tạo một khách hàng và thêm đơn hàng
//    Customer customer = new Customer();
//    customer.setName("John Doe");
//
//    Order order1 = new Order();
//    order1.setProduct("Laptop");
//    order1.setCustomer(customer); // Liên kết đơn hàng với khách hàng
//
//    Order order2 = new Order();
//    order2.setProduct("Phone");
//    order2.setCustomer(customer); // Liên kết đơn hàng với khách hàng
//
//// Thêm đơn hàng vào danh sách đơn hàng của khách hàng
//    customer.getOrders().add(order1);
//    customer.getOrders().add(order2);
//
//// Lưu khách hàng (cả khách hàng và đơn hàng sẽ được lưu)
//    customerRepository.save(customer);
//
//}



//public void delete(){
//    Customer customer = customerRepository.findById(1L).orElseThrow();
//    customerRepository.delete(customer); // Cả khách hàng và tất cả đơn hàng liên quan sẽ bị xóa
//
//}