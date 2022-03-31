package com.lamarrulla.proyectointegrador.vo;

import lombok.Getter;

@Getter
public class Delete {
    String value;

    public Delete(String value) {
        this.value = value + "se borro exitosamente";
    }
}
