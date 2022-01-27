package guru.springfamework.controllers.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Connor Wheatley
 * @Date: 27/01/2022 17:27
 */
@Controller
@RequestMapping(CustomerController.BASE_URL)
public class VendorController {
    public static final String BASE_URL = "/api/v1/customers";
}
