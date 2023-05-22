package com.example.venta.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {
    private Integer id;
    private String numeroDocumento;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
}
