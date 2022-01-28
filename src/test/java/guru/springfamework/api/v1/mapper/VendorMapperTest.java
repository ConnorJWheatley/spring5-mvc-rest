package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: Connor Wheatley
 * @Date: 28/01/2022 09:43
 */
public class VendorMapperTest {

    private final String NAME = "someName";

    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void testVendorToVendorDTO() throws Exception {
        // given
        Vendor vendor = new Vendor();
        vendor.setName(NAME);

        // when
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

        // then
        assertEquals(vendor.getName(), vendorDTO.getName());
    }

    @Test
    public void testVendorDTOToVendor() throws Exception {
        // given
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);

        // when
        Vendor vendor = vendorMapper.vendorDTOToVendor(vendorDTO);

        // then
        assertEquals(vendorDTO.getName(), vendor.getName());
    }
}