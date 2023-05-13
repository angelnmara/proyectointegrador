package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.CityDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.CityMapper;
import com.lamarrulla.proyectointegrador.entity.City;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CityMapperImpl implements CityMapper {
    @Override
    public CityDTO toDTO(City city) {
        CityDTO cityDTO = new CityDTO();
        cityDTO.setCity(city.getCity());
        cityDTO.setIdCity(city.getIdCity());
        return cityDTO;
    }

    @Override
    public List<CityDTO> toDTOList(List<City> cityList) {
        return cityList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    @Override
    public City toEntity(CityDTO cityDTO) {
        City city = new City();
        city.setCity(cityDTO.getCity());
        city.setIdCity(cityDTO.getIdCity());
        return city;
    }
}
