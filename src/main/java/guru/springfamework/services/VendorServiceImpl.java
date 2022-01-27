package guru.springfamework.services;

import guru.springfamework.api.v1.mapper.VendorMapper;
import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.controllers.v1.CustomerController;
import guru.springfamework.controllers.v1.VendorController;
import guru.springfamework.domain.Vendor;
import guru.springfamework.repositories.VendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Connor Wheatley
 * @Date: 27/01/2022 17:17
 */
@Service
public class VendorServiceImpl implements VendorService {

    private final VendorMapper vendorMapper;
    private final VendorRepository vendorRepository;

    public VendorServiceImpl(VendorMapper vendorMapper, VendorRepository vendorRepository) {
        this.vendorMapper = vendorMapper;
        this.vendorRepository = vendorRepository;
    }

    // as read in Q&A section, potentially not good practice to add dependency on controller layer in service layer
    private String getVendorUrl(Long id) {
        return VendorController.BASE_URL + "/" + id;
    }

    private VendorDTO saveAndReturnDTO(Vendor vendor) {
        Vendor savedVendor = vendorRepository.save(vendor);
        VendorDTO returnDTO = vendorMapper.vendorToVendorDTO(savedVendor);
        returnDTO.setVendorUrl(getVendorUrl(savedVendor.getId()));
        return returnDTO;
    }

    @Override
    public List<VendorDTO> getAllVendors() {
        return null;
    }

    @Override
    public VendorDTO getVendorById(Long id) {
        return null;
    }

    @Override
    public VendorDTO createNewVendor(VendorDTO vendorDTO) {
        return null;
    }

    @Override
    public VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO) {
        return null;
    }

    @Override
    public VendorDTO patchVendor(Long id, VendorDTO vendorDTO) {
        return null;
    }

    @Override
    public void deleteVendorById(Long id) {

    }
}
