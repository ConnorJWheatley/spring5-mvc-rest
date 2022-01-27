package guru.springfamework.api.v1.model;

import guru.springfamework.domain.Vendor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Connor Wheatley
 * @Date: 27/01/2022 17:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorListDTO {
    List<VendorDTO> vendors;
}
