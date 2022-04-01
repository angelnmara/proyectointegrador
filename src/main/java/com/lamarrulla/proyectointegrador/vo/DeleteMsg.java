package com.lamarrulla.proyectointegrador.vo;

import lombok.Data;

@Data
public class DeleteMsg {
    String value;

    public DeleteMsg(String value) {
        this.value = String.format("%s se borro exitosamente", value);
    }
}
