package com.example.demo.service;

import com.example.demo.domain.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.dto.Enumeration.StatusEnum;
import com.example.demo.service.dto.UsuarioDTO;
import com.example.demo.service.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Objects;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor(onConstructor_ = {@Lazy, @Autowired})
public class UsuarioService {
    private final UsuarioMapper usuarioMapper;
    private final UsuarioRepository usuarioRepository;
    public Usuario criar(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioMapper.toEntity(usuarioDTO);
        if (Objects.isNull(usuarioDTO.getId())){
            usuario.setStatus(StatusEnum.A);
        }
        usuario.setDataCadastro(LocalDate.now());
        return usuarioRepository.save(usuario);
    }
}
