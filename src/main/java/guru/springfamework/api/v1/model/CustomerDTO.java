package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Connor Wheatley
 * @Date: 27/01/2022 09:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private String firstName;
    private String lastName;
    private String customerUrl;
}
