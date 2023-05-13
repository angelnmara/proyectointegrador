package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.CountryDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.CountryMapper;
import com.lamarrulla.proyectointegrador.entity.Country;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CountryMapperImpl implements CountryMapper {
    @Override
    public CountryDTO toDTO(Country country) {
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setCountry(country.getCountry());
        countryDTO.setIdCountry(country.getIdCountry());
        return countryDTO;
    }

    @Override
    public List<CountryDTO> toDTOList(List<Country> countries) {
        return countries.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    @Override
    public Country toEntity(CountryDTO countryDTO) {
        Country country = new Country();
        country.setCountry(countryDTO.getCountry());
        country.setIdCountry(countryDTO.getIdCountry());
        return country;
    }
}
