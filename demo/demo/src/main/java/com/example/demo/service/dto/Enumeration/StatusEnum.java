package com.example.demo.service.dto.Enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusEnum {
    A("Ativo"),C("Cancelado");
    private String value;
}
