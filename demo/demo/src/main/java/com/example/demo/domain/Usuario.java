package com.example.demo.domain;

import com.example.demo.service.dto.Enumeration.StatusEnum;
import liquibase.datatype.core.VarcharType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "TB_USUARIO")
public class Usuario extends Generic{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    @SequenceGenerator(name = "SQ_USUARIO", sequenceName = "SQ_USUARIO", allocationSize = 1)

    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATA_CADASTRO", nullable = false)
    private LocalDate dataCadastro;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "LOGIN", nullable = false)
    private String logim;

    @Column(name = "SENHA", nullable = false)
    private String senha;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "EMAIL")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "PERFIL", nullable = false)
    private String perfil;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    private StatusEnum status;
}