package guru.springfamework.repositories;

import guru.springfamework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Connor Wheatley
 * @Date: 27/01/2022 09:43
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
