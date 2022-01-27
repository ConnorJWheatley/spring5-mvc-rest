package guru.springfamework.repositories;

import guru.springfamework.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Connor Wheatley
 * @Date: 27/01/2022 17:08
 */
public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
