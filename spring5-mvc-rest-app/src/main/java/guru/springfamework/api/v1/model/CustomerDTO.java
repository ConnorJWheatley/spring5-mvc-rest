package guru.springfamework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
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

    @Schema(description = "The customer's first name", required = true)
    private String firstName;

    @Schema(description = "The customer's last name", required = true)
    private String lastName;

    @JsonProperty("customer_url")
    private String customerUrl;
}
