package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.CountryDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.CountryMapper;
import com.lamarrulla.proyectointegrador.repository.CountryRepository;
import com.lamarrulla.proyectointegrador.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public CountryServiceImpl(CountryRepository countryRepository, CountryMapper countryMapper) {
        this.countryRepository = countryRepository;
        this.countryMapper = countryMapper;
    }

    @Override
    public CountryDTO findById(Integer id) {
        return countryMapper.toDTO(countryRepository.findById(id).stream().findFirst().get());
    }

    @Override
    public List<CountryDTO> findAll() {
        return countryMapper.toDTOList(countryRepository.findAll());
    }

    @Override
    public CountryDTO save(CountryDTO countryDTO) {
        return countryMapper.toDTO(countryRepository.save(countryMapper.toEntity(countryDTO)));
    }

    @Override
    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }
}
