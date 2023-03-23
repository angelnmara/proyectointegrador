package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.KindDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.KindMapper;
import com.lamarrulla.proyectointegrador.entity.Kind;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class KindMapperImpl implements KindMapper {
    @Override
    public KindDTO toDTO(Kind kind) {
        KindDTO kindDTO = new KindDTO();
        kindDTO.setDescKind(kind.getDescKind());
        kindDTO.setIdKind(kind.getIdKind());
        return kindDTO;
    }

    @Override
    public List<KindDTO> toDTOList(List<Kind> kindList) {
        return kindList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    @Override
    public Kind toEntity(KindDTO kindDTO) {
        Kind kind = new Kind();
        kind.setDescKind(kindDTO.getDescKind());
        kind.setIdKind(kind.getIdKind());
        return kind;
    }
}
