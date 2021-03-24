package com.example.demo.service.mapper;

import com.example.demo.domain.Usuario;
import com.example.demo.service.dto.UsuarioDTO;

public interface UsuarioMapper {
    UsuarioDTO toDto(Usuario usuario);
    Usuario toEntity(UsuarioDTO usuarioDTO);
}
