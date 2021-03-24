package com.example.demo.service.dto.Enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PerfilEnum {
    A("Ativo"),O("Operador");
    private String value;
}
