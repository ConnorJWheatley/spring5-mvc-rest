package guru.springframework.services;

import guru.springframework.model.CustomerDTO;

import java.util.List;

/**
 * @Author: Connor Wheatley
 * @Date: 27/01/2022 09:45
 */
public interface CustomerService {

    // for some reason CustomerListDTO is not used, like how it is for Vendor?
    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);

    CustomerDTO saveCustomerByDTO(Long id, CustomerDTO customerDTO);

    CustomerDTO patchCustomer(Long id, CustomerDTO customerDTO);

    void deleteCustomerById(Long id);
}
