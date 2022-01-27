package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Connor Wheatley
 * @Date: 26/01/2022 16:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryListDTO {
    List<CategoryDTO> categories;
}
