package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor @AllArgsConstructor
@Entity
@Getter
@Setter
public class Generic {
    @Id @GeneratedValue
    private Integer id;
    private LocalDate dataCadastro;
    private String nome;
    private String telefone;
    private String email;
}
