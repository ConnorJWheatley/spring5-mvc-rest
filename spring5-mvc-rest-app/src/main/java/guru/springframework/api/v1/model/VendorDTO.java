package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Connor Wheatley
 * @Date: 27/01/2022 17:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {

    @Schema(description = "The vendors name", required = true)
    private String name;

    @JsonProperty("vendor_url")
    private String vendorUrl;
}
