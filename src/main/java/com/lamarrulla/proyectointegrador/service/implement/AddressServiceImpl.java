package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.AddreesDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.AddreesMapper;
import com.lamarrulla.proyectointegrador.repository.AddressRepository;
import com.lamarrulla.proyectointegrador.service.AddreesService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddreesService {
    private final AddressRepository addressRepository;
    private final AddreesMapper addreesMapper;

    public AddressServiceImpl(AddressRepository addressRepository, AddreesMapper addreesMapper) {
        this.addressRepository = addressRepository;
        this.addreesMapper = addreesMapper;
    }

    @Override
    public AddreesDTO findById(Integer id) {
        return addreesMapper.toDTO(addressRepository.findById(id).get());
    }

    @Override
    public List<AddreesDTO> findAll() {
        return addreesMapper.toDTOList(addressRepository.findAll());
    }

    @Override
    public AddreesDTO save(AddreesDTO addreesDTO) {
        return addreesMapper.toDTO(addressRepository.save(addreesMapper.toEntity(addreesDTO)));
    }

    @Override
    public void deleteById(Integer id) {
        addressRepository.deleteById(id);
    }
}
