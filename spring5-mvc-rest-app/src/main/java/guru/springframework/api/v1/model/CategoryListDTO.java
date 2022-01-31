package guru.springframework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Author: Connor Wheatley
 * @Date: 26/01/2022 16:50
 */
@Data
@AllArgsConstructor
public class CategoryListDTO {
    List<CategoryDTO> categories;
}
